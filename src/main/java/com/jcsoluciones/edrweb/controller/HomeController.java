
package com.jcsoluciones.edrweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	String index() {
		return "pageinit";
	}
	@GetMapping("/inicio")
	String inicio() {
		return "pageinit";
	}
	
	@GetMapping("/final")
	String fin() {
		return "pagefin";
	}
	
	@GetMapping("/page1")
	String oneSection() {
		return "pageone";
	}	
	
	@GetMapping("/page2")
	String section2() {
		return "pageone2";
	}	
	
	@GetMapping("/page3")
	String section3() {
		return "pageone3";
	}
	
	@GetMapping("/page4")
	String section4() {
		return "pageone4";
	}
	
	@GetMapping("/page5")
	String section5() {
		return "pageone5";
	}
	
	@GetMapping("/page6")
	String section6() {
		return "pageone6";
	}
	
	@GetMapping("/page7")
	String section7() {
		return "pageone7";
	}
	
	@GetMapping("/page8")
	String section8() {
		return "pageone8";
	}
	
	@GetMapping("/page9")
	String section9() {
		return "pageone9";
	}
	
	@GetMapping("/page10")
	String section10() {
		return "pageone10";
	}
	
	@GetMapping("/page11")
	String section11() {
		return "pageone11";
	}

	@GetMapping("/page12")
	String section12() {
		return "pageone12";
	}
	
	@GetMapping("/page13")
	String section13() {
		return "pageone13";
	}
	
	@GetMapping("/page14")
	String section14() {
		return "pageone14";
	}
	
	@GetMapping("/page15")
	String section15() {
		return "pageone15";
	}
	
	@GetMapping("/page16")
	String section16() {
		return "pageone16";
	}
	
	@GetMapping("/page17")
	String section17() {
		return "pageone17";
	}
	
	@GetMapping("/page18")
	String section18() {
		return "pageone18";
	}
	
	@GetMapping("/page19")
	String section19() {
		return "pageone19";
	}
	
	@GetMapping("/page20")
	String section20() {
		return "pageone20";
	}
	
	@GetMapping("/page21")
	String section21() {
		return "pageone21";
	}
	
	@GetMapping("/page22")
	String section22() {
		return "pageone22";
	}
	
	@GetMapping("/page23")
	String section23() {
		return "pageone23";
	}
	
	@GetMapping("/page24")
	String section24() {
		return "pageone24";
	}
	
}
