package cn.itcast.scm.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.scm.dao.SupplierMapper;
import cn.itcast.scm.entity.Dept;
import cn.itcast.scm.entity.Supplier;

public class TestDeptDao {

	//@Resource //这里没法使用，后继版本有其它方式可以注入
		static private SupplierMapper supplierMapper;
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
			supplierMapper=(SupplierMapper) context.getBean("SupplierMapper");
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		/*@Test
		public void testSelectDept() {
			System.out.println(supplierMapper.intsertSupplier(supplier));
		}*/

		@Test
		public void testInsertDept() {
			Supplier supplier = new Supplier();
			//dept.setDeptId(117);
			supplier.setSupName("小米");
			System.out.println("受影响行数："+supplierMapper.insertSupplier(supplier));
		}


}
