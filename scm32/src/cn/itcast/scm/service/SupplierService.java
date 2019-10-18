package cn.itcast.scm.service;

import java.util.List;
import java.util.Map;

import cn.itcast.scm.entity.Supplier;

public interface SupplierService extends BaseService<Supplier>{
	
	List<Map<String,Object>> selectSupplier(Map<String,String> paramMap);
	
}
