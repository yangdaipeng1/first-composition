package cn.itcast.scm.dao;

import cn.itcast.scm.entity.BuyOrderDetail;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyOrderDetailMapper extends BaseMapper<BuyOrderDetail> {
	public int insertList(List<BuyOrderDetail> buyOrderDetails);
}