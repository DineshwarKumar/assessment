package com.lens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lens.model.Address;
import com.lens.model.Category;
import com.lens.model.Customer;
import com.lens.model.Frame;
import com.lens.service.IFrameService;

@SpringBootApplication
public class SpringLensAssessmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringLensAssessmentApplication.class, args);
	}
	
	
	IFrameService frameService;

	@Autowired
	public void setFrameService(IFrameService frameService) {
		this.frameService = frameService;
	}



	@Override
	public void run(String... args) throws Exception {
		
		Address address1=new Address("Lingarajpuram", "Bangalore", "Karnataka", 560084);
		Category category=new Category("Sunglass", "brown");
		Customer customer1=new Customer("John", address1,10);
		Customer customer2=new Customer("Arun", address1, 11);
		Frame frame=new Frame("OvalFrame", category, customer1,"Blue", 1520);
		
		frameService.addFrame(frame);
		
		frameService.getAll().forEach(System.out::println);
		
	}

}
