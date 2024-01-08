package org.muktai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController 
{
	@GetMapping("/")
	public String getMessage()
	{
		return "<h3 style='color:red'>Welcome to jenkins pipeline</h3>";
	}
}
