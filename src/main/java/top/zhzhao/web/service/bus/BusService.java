/**
 * https://www.zhzhao.top
 */
package top.zhzhao.web.service.bus;

import top.zhzhao.web.model.bus.vo.BusTimeVO;
import top.zhzhao.web.model.bus.vo.LineDefaultDirVO;
import top.zhzhao.web.model.bus.vo.LineDirVO;
import top.zhzhao.web.model.bus.vo.LineStationDefaultVO;

import java.util.List;

/**
 *
 *@author zhzhao
 *@version $ Id: BusService.java,V 0.1 2018/1/23 14:08 zhzhao Exp $
 */
public interface BusService {
    List<LineDirVO> getLineDir(String id);
    List<LineDirVO> getDirStation(String lineId,String dirId);
    LineDefaultDirVO getDefaultLineDir(String lineId);
    LineStationDefaultVO getDefaultDirStation(String lineId);
    BusTimeVO getBusTime(String lineId, String dirId, String stopId) throws Exception ;

}
