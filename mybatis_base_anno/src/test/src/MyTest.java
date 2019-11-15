import com.anno.dao.IUserDAO;
import com.anno.domain.User;
import com.anno.utils.MySqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void findAllTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    public void saveTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        User user = new User();
        user.setName("加盐盐888");
        mapper.save(user);
        sqlSession.commit();
    }

    @Test
    public void deleteTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        int uid=10;
        mapper.delete(uid);
        sqlSession.commit();
    }

    @Test
    public void updateTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        User user = new User();
        user.setName("小猪佩奇其");
        user.setId(11);
        mapper.update(user);
        sqlSession.commit();
    }

    @Test
    public void findByNameTest(){
        SqlSession sqlSession = MySqlSessionUtil.getSqlSession();
        IUserDAO mapper = sqlSession.getMapper(IUserDAO.class);
        String name = "%加盐盐%";
        List<User> byName = mapper.findByName(name);
        for (User user : byName) {
            System.out.println(user);
        }
    }
}
