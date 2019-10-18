package cn.itcast.scm.dao;

import cn.itcast.scm.entity.Supplier;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SupplierMapper extends BaseMapper<Supplier>{
	
    //public int insertSupplier(Supplier supplier);
	
	List<Map<String,Object>> selectSupplier(Map<String,String> paramMap);
	
}