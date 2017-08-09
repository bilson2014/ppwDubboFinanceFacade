package com.paipianwang.pat.facade.finance.service;

import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.facade.finance.entity.PmsDealLog;

public interface PmsFinanceFacade {

	public DataGrid<PmsDealLog> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);

	public long save(final PmsDealLog dealLog);

	public long update(final PmsDealLog dealLog);

	public long deleteByArray(final long[] ids);

	/**
	 * 根据projectId判断是否存在
	 * @param projectId
	 * @return
	 */
	public boolean isExistByProjectId(final String projectId);
	
}
