package cn.itcast.scm.service;

import cn.itcast.scm.entity.Page;

public interface BaseService<T> {

		//添加单个对象
		public int insert(T entity)throws Exception;
		
		//修改单个对象
		public int update(T entity)throws Exception;
		
		//删除单个对象
		public int delete(T entity)throws Exception;
		
		//查询单个对象
		public T select(T entity)throws Exception;
		
		//通过关键字分页查询
		public Page<T> selectPage(Page<T> page);
		
		//通过多条件分页查询
		public Page<T> selectPageUseDyc(Page<T> page);
}
