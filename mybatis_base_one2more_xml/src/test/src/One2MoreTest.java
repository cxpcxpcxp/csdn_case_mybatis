import com.one2more.dao.IUserDAO;
import com.one2more.domain.Userss;
import com.one2more.utils.MySqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class One2MoreTest {
    @Test
    public void test(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        List<Userss> byMore2One = mapper.findByOne2More();
        for (Userss userss : byMore2One) {
            System.out.println(userss);
        }
    }
}
