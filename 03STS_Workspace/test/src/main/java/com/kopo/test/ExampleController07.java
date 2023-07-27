package com.kopo.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class ExampleController07 {
	/*
	��� ���� - @PathVariable
	�� ��û URL�� ���Ե� �Ķ���� ���� ���޹��� �� ����
	 {} �߰�ȣ�� Ȱ�� URL�� ���Ե� ��û ���� ���� ���޹���
	 
	 �����. 1
	 @RequestMapping("��� ����")
	 public string MethodName(@PathVariable ��κ���, ..){}
	 
	 �����. 2
	 @RequestMapping("��� ����")
	 public string MethodName(@PathVariable (��κ���) �Ű�����, ..){}
	 */
	
	@GetMapping("/exam07/{bookId}")
	public String requestMethod(@PathVariable String bookId, Model model) {
		System.out.println("���� ID : " + bookId);
		model.addAttribute("data", "���� ID : " + bookId);
		return "webpage06";
	}
}




