package springbootleanrning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.trey.AutherServer;

/**
 * @FileName: DemoController.java
 * @Description: DemoController.java类说明
 * @Author: tao.shi
 * @Date: 2018/12/2 10:37
 */
@ResponseBody
@Controller
public class DemoController {

	@Autowired
	private AutherServer autherServer;

	@GetMapping("auther")
	public String getAuther() {
		StringBuilder sb = new StringBuilder();
		sb.append("作者：").append(autherServer.getName())
				.append("；email：").append(autherServer.getEmail());
		return sb.toString();
	}

	@GetMapping("")
	public String index() {
		return "Welcome to Trey Home.";
	}

}
