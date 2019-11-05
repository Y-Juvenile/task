package app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**spring boot应用类，启动项目的入口*/

@SpringBootApplication
public class DeptApplication {
	public static void main(String[] args) {
		//SpringApplication.run(DeptApplication.class);
		SpringApplication app=new SpringApplication(DeptApplication.class);
		//app.setBannerMode(SpringBootBanner.Mode.OFF);
		app.run(args);
	}
}
