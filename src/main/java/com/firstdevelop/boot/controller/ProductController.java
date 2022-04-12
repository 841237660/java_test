package com.firstdevelop.boot.controller;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.firstdevelop.boot.entity.Product;
import com.firstdevelop.boot.form.ProductForm;
import com.firstdevelop.boot.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/searchAll")
	public String searchAll(Model model) {

		List<Product> productList = productService.searchAll();
		model.addAttribute("productList", productList);
		model.addAttribute("title", "ユーザー一覧");
		
		return "/product/productDetail";
	}
	
	@RequestMapping("/registInit")
	public String registInit() {
		
		return "/product/regist";
	}
	
	@RequestMapping("/regist")
	public String regist(ProductForm form) {
		
		productService.regist(form);
		return "redirect:searchAll";
	}
	@RequestMapping("/delete/{productId}")
	public String delete(@PathVariable("productId") Integer productId ,Model model) {
		
		productService.delete(productId);
		
		List<Product> productList = productService.searchAll();
		model.addAttribute("productList", productList);
		model.addAttribute("title", "ユーザー一覧");
		return "/product/productDetail";
		//return "redirect:searchAll";
	}
	// エクセル内容をアップロードして、DBに保存する処理
	@PostMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file) throws Exception{
	if (file.isEmpty()){
	return "redirect:searchAll";
	}else {
	String fileName = file.getOriginalFilename();
	InputStream is = file.getInputStream();
	if (productService.importProductInfo(fileName,is)){
	return "redirect:searchAll";
	}else {
	return "redirect:searchAll";
	}
	}
	}
	
	// メール送信
	@RequestMapping("/sendM")
	public String sendMail(){

	SimpleMailMessage mailMessage = new SimpleMailMessage();
	mailMessage.setTo("liux00913@gmail.com");
	mailMessage.setSubject("Java Test Mail Send");
	mailMessage.setText("SpringBoot Send Mail Test111111");
	mailMessage.setSentDate(new Date());

	mailSender.send(mailMessage);

	return "redirect:searchAll";
	}
}
