package com.paipianwang.pat.facade.finance.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.finance.entity.PmsTeamInvoice;

/**
 * 用户发票管理
 */
public interface PmsTeamInvoiceFacade {

	/**
	 * 分页查询书
	 */
	public DataGrid<PmsTeamInvoice> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);
	
	/**
	 * 更新
	 * @param invoice 发票实体
	 * @return
	 */
	public long update(final PmsTeamInvoice invoice);
	
	/**
	 * 保存
	 * @param invoice 发票实体
	 * @return
	 */
	public long save(final PmsTeamInvoice invoice);
	
	/**
	 * 批量删除发票
	 * @param ids id 数组
	 * @return
	 */
	public long deleteByIds(final long[] ids);
	
	/**
	 * 审核
	 * @param invoice
	 * @return
	 */
	public long auditing(final PmsTeamInvoice invoice);

	/**
	 * 计算总量
	 * @param paramMap
	 * @return
	 */
	public long count(final Map<String, Object> paramMap);
	
	/**
	 * 查找供应商发票信息
	 * @param paramMap
	 * @return
	 */
	public List<PmsTeamInvoice> findTeamInvoiceWithCondition(final Map<String, Object> paramMap);

}
