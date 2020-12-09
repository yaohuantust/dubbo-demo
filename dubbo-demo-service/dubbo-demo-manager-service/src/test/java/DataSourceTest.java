import com.tust.yh.entity.Menu;
import com.tust.yh.mapper.MenuMapper;
import com.tust.yh.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DataSourceTest {

    @Test
    public void test1(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        Menu menu = menuMapper.selectByPrimaryKey(Long.parseLong("20"));
        System.out.println(menu);
        sqlSession.close();
    }
}
