package cn.itcast.scm.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.scm.dao.AccountMapper;
import cn.itcast.scm.dao.SupplierMapper;
import cn.itcast.scm.entity.Account;
import cn.itcast.scm.entity.Page;
import cn.itcast.scm.entity.Supplier;
import cn.itcast.scm.service.AccountService;
import cn.itcast.scm.service.BaseService;
import cn.itcast.scm.service.SupplierService;

@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService{
	
	/*	@Autowired
		private AccountMapper accountMapper;
	*/

	public Account login(Account account) {
		// TODO Auto-generated method stub
		return accountMapper.login(account);
	}

	/*public int insert(Account entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



	public int update(Account entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



	public int delete(Account entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



	public Account select(Account entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	public Page<Account> selectPage(Page<Account> page) {
		// TODO Auto-generated method stub
		return null;
	}



	public Page<Account> selectPageUseDyc(Page<Account> page) {
		// TODO Auto-generated method stub
		return null;
	}



	public int deleteList(String[] pks) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	*/

}
