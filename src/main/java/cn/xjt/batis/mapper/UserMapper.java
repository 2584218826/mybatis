package cn.xjt.batis.mapper;

import cn.xjt.batis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/5-16:41
 */
//这个注解表示这是一个mybatis得mapper类
@Mapper
@Repository
public interface UserMapper {

	List<User> queryUserList();

	User queryById(int id);

	int addUser(User user);

	int updateUser(User user);

	int deleteUser(int id);
}
