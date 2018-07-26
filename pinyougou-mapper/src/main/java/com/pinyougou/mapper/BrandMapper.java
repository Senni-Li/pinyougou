package com.pinyougou.mapper;


import com.pinyougou.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * BrandMapper 数据访问接口
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018-07-25 08:45:04
 * @version 1.0
 */
public interface BrandMapper  extends Mapper<Brand> {

    /** 查询所有的品牌 */
    @Select("select * from tb_brand order by id asc")
    List<Brand> findAll();

}