package com.adelaide.disneymall.product;

import com.adelaide.disneymall.product.entity.BrandEntity;
import com.adelaide.disneymall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DisneymallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(13L);
        brandEntity.setName("Huawei");
        brandEntity.setDescript("This brand is called Huawei");
//        brandEntity.setName("华为");
//
//        brandService.save(brandEntity);
//
//        System.out.println("保存成功");

//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "13"));

        list.forEach(System.out::println);
    }

}
