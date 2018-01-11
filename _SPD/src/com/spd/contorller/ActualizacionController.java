package com.spd.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spd.pojo.Actualizacion;

@Controller
public class ActualizacionController {

	@RequestMapping("/actualizacion")
	public String showActualizacion(Model model){
		Actualizacion actualizacion = new Actualizacion();
		model.addAttribute("act",actualizacion);
		
		return "actualizacion";
	}
	
	@RequestMapping(value="/actualizacion/save", method = RequestMethod.POST)
	public String handleActualizacion(@ModelAttribute("actualizacion")Actualizacion actuForm,
			Model model){
		model.addAttribute("actuForm",actuForm);
		return "index";
	}
}
