package kesun.bll.web.impl;

import kesun.bll.SuperService;
import kesun.bll.web.INotice;
import kesun.dao.IDoData;
import kesun.dao.web.impl.DTest;
import kesun.entity.web.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by 李凡 on 2018/4/25.
 */
@Service("bTest")
public class TestServiceImpl extends SuperService implements INotice{
  @Resource(name="dTest")
  private DTest dao;
  public TestServiceImpl(){
      setModel(new User());
  }
    public List<Map<String, Object>> getLoadoutExcelColumns() {
        return null;
    }

    public String getLoadoutExcelFileName() {
        return "测试信息";
    }

    public IDoData getDAO() {
        return dao;
    }

    public List getSaveAll(String filePath) {
        return null;
    }
    @Override
    public Boolean isInUse() {
        return false;
    }
}
