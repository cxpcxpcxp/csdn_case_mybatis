import com.more2one.dao.IUserDAO;
import com.more2one.domain.Accounts;
import com.more2one.utils.MySqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class More2OneTest {
    @Test
    public void test(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        List<Accounts> byMore2One = mapper.findByMore2One();
        for (Accounts accounts : byMore2One) {
            System.out.println(accounts);
        }
    }
}
