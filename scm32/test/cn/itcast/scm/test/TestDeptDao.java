package cn.itcast.scm.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.scm.entity.Dept;

public class TestDeptDao {

	/*//@Resource //这里没法使用，后继版本有其它方式可以注入
		static private DeptDaoImpl deptDao;
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
			deptDao=(DeptDaoImpl) context.getBean("deptDao");
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
		}

		@Test
		public void testSelectDept() {
			System.out.println(deptDao.selectDept(1));
		}

		@Test
		public void testInsertDept() {
			Dept dept=new Dept();
			//dept.setDeptId(117);
			dept.setDeptName("name117");
			dept.setDeptAddress("address117");
			System.out.println("受影响行数："+deptDao.insertDept(dept));
		}
*/

}
