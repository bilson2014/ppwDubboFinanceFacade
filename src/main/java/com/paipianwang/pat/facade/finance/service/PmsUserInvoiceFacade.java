package com.paipianwang.pat.facade.finance.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.finance.entity.PmsUserInvoice;

/**
 * 用户发票管理
 */
public interface PmsUserInvoiceFacade {

	/**
	 * 分页查询书
	 */
	public DataGrid<PmsUserInvoice> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);

	/**
	 * 更新
	 * 
	 * @param invoice 发票实体
	 * @return
	 */
	public long update(final PmsUserInvoice invoice);

	/**
	 * 保存
	 * 
	 * @param invoice 发票实体
	 * @return
	 */
	public long save(final PmsUserInvoice invoice);

	/**
	 * 批量删除发票
	 * 
	 * @param ids id 数组
	 * @return
	 */
	public long deleteByIds(final long[] ids);

	/**
	 * 审核
	 * @param invoice
	 * @return
	 */
	public long auditing(final PmsUserInvoice invoice);

	/**
	 * 查找客户发票信息
	 * @param paramMap
	 * @return
	 */
	public List<PmsUserInvoice> findUserInvoiceWithCondition(final Map<String, Object> paramMap);
}
