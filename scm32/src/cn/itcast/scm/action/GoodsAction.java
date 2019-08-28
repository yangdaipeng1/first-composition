package cn.itcast.scm.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.scm.entity.Goods;
import cn.itcast.scm.entity.Page;
import cn.itcast.scm.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsAction extends BaseAction{

	@Resource
	private GoodsService goodsService;
	
	
		//通过关键字分页查询
		@RequestMapping("/selectPageUseDyc")
		@ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境
		public Object selectPageUseDyc(Page<Goods> page,Goods goods){
			page.setParamEntity(goods);
			System.out.println("----page:"+page);
			Page p = goodsService.selectPageUseDyc(page);
			
			return p.getPageMap();
		}
		

}
