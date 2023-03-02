package kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService languageService;

	
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<ProgrammingLanguages> getAll(){
		
			
		return languageService.getAll() ;
	}
	@PostMapping("/add")
	public void add(ProgrammingLanguages languages) throws Exception{
		
		languageService.add(languages);
	}
	@GetMapping("/delete")
	public void delete(ProgrammingLanguages languages){
		 languageService.delete(languages);
	}
	@PostMapping("/update")
	void update(ProgrammingLanguages language) throws Exception {
		
		languageService.update(language);
	}
	
	@GetMapping("/getbyid")
	public void getById(int id) {
		languageService.getById(id);
	}
	
}
