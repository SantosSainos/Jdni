package com.spd.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActualizacionController {

	@RequestMapping("/actualizacion")
	public String showActualizacion(Model model){
		model.addAttribute("mensaje","Mensaje desde el modelo");
		
		return "actualizacion";
	}
}
