package com.paipianwang.pat.facade.finance.service;

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
	
	public long auditing(final PmsTeamInvoice invoice);




}
