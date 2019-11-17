// CHECKSTYLE:OFF
import dao.UserDto;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 测试spring上下文
 * @author: wenyidao
 * @create: 2019-11-14 22:29
 **/
public class TestContext {
	public static void main(String[] args) {
		/**
		 * 1. 创建 spring 上下文
		 * 2. 注册bean
		 * 3. 刷新上下文
		 * 4. 获取bean
		 */
		/*
			AnnotationConfigApplicationContext annotationConfigApplicationContext_1 =
					new AnnotationConfigApplicationContext();
			annotationConfigApplicationContext_1.register(UserDto.class);
			annotationConfigApplicationContext_1.refresh();
			UserDto userDto = (UserDto) annotationConfigApplicationContext_1.getBean("UserDto");
			userDto.query();
		*/

		/**
		 * 构造方法2
		 */
		AnnotationConfigApplicationContext annotationConfigApplicationContext_2 =
				new AnnotationConfigApplicationContext(UserDto.class);
		UserDto userDto = (UserDto) annotationConfigApplicationContext_2.getBean("UserDto");
		userDto.query();
	}
}

