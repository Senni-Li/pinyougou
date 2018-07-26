/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: BrandConrtoller
 * Author:   Senni
 * Date:     2018/7/25 9:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.Brand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Senni
 * @create 2018/7/25
 * @since 1.0.0
 */
//responseBody + Controller
@RestController
public class BrandConrtoller {
    /**
     * 引用服务接口代理对象
     * timeout: 调用服务接口方法超时时间毫秒数
     */
    @Reference(timeout = 10000)
    private BrandService brandService;

    @GetMapping("/brand/findAll")
    public List<Brand> findAll() {
        System.out.println("brandService: ======= " + brandService);
        return brandService.findAll();
    }
}
