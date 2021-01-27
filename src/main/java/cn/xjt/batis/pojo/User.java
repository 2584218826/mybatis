package cn.xjt.batis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 内容：
 *
 * @author
 * @date 2020/10/5-16:40
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Integer id;
	private String username;
	private String password;
}
