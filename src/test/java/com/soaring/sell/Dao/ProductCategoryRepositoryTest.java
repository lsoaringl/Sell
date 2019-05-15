package com.soaring.sell.Dao;

import com.soaring.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.transaction.Transactional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
   @Autowired
    private ProductCategoryRepository repository;

   @Test
   @Transactional
    public void findOneTest() {
       ProductCategory productCategory = repository.getOne(1);
       System.out.println(productCategory.toString());
   }

   @Test
    public void saveTest() {
       ProductCategory productCategory = new ProductCategory("男生最爱",3);
       ProductCategory result = repository.save(productCategory);
       Assert.assertNotNull(result);
   }

   @Test
   public void findByCategoryTypeInTest() {
      List<Integer> list = Arrays.asList(2,3,4);

      List<ProductCategory> result = repository.findByCategoryTypeIn(list);
      Assert.assertNotEquals(0,result.size());
   }
}