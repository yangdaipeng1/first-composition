package cn.itcast.scm.dao;

import cn.itcast.scm.entity.Account;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper extends BaseMapper<Account>{
	
   public Account login(Account account);
   
}