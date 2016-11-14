/**
 * 
 */
package org.tis.tools.service.api.biztrace;

import java.util.List;

import org.tis.tools.service.exception.biztrace.BiztraceRServiceException;

/**
 * <pre>
 * 业务日志(biztrace*.log)分析代理服务接口
 * </pre>
 * 
 * @author megapro
 *
 */
public interface IBiztraceAgentRService {
	
	/**
	 * 列出当前有那些biztrace的日志文件
	 * @return  日志文件列表（按最近修改时间由新到旧排序）
	 * @throws BiztraceRServiceException 执行失败时抛出异常
	 */
	public List<BiztraceFileInfo> listBiztraces() throws BiztraceRServiceException ;
	
	
	/**
	 * 解析<code>fixedBiztraces</code>指定范围内的业务日志文件
	 * @param fixedBiztraces 指定范围内的业务日志文件
	 * @return 按日分组的解析结果
	 * @throws BiztraceRServiceException 执行失败时抛出异常
	 */
	public ParseResult parseBiztraceFixed(List<BiztraceFileInfo> fixedBiztraces) throws BiztraceRServiceException ; 
	
	/**
	 * 分析<code>fixedDay</code>指定日期范围内的业务日志明细
	 * @param fixedDay 指定日期列表,其中每个日期格式为yyyy-MM-dd
	 * @throws BiztraceRServiceException 执行失败时抛出异常
	 */
	public AnalyseResult analyseBiztrace( List<String/*yyyy-MM-dd*/> fixedDay ) throws BiztraceRServiceException ;
}
