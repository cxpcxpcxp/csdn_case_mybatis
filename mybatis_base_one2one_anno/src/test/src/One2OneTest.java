import com.one2one.dao.IUserDAO;
import com.one2one.domain.Users;
import com.one2one.utils.MySqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class One2OneTest {
    @Test
    public void test(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        List<Users> byOne2One = mapper.findByOne2One();
        for (Users users : byOne2One) {
            System.out.println(users);
        }
    }
}
