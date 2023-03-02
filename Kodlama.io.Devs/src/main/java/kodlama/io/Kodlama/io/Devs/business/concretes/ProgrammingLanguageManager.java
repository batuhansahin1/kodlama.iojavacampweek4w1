package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageDao;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

private ProgrammingLanguageDao languagesDao;
List<ProgrammingLanguages> languages;

	public ProgrammingLanguageManager(ProgrammingLanguageDao languagesDao) {
	super();
	this.languagesDao = languagesDao;

	
	}

	@Override
	public List<ProgrammingLanguages> getAll() {
		//iş kuralları
		
		
		
		return languagesDao.getAll();
	}

	@Override
	public void add(ProgrammingLanguages language) throws Exception {
		if(language.getName().isEmpty()) {
			throw new Exception("İsim boş geçilemez");
		}
		
		
		for(ProgrammingLanguages i:languagesDao.getAll()) {
			if(i.getName()==language.getName()) {
				throw new Exception("Bu isim sistemde mevcuttur");
			}
		}
		if(language.getName()=="") {
			throw new Exception("Programlama dili boş geçilemez");
		}
		
		
		
		 languagesDao.add(language);
	}

	@Override
	public void getById(int id) {
		
	languagesDao.getById(id);	
	}

	@Override
	public void update(ProgrammingLanguages language) throws Exception {
		if(language.getName().isEmpty()) {
			throw new Exception("İsim boş geçilemez");
		}
		
		
	for(ProgrammingLanguages a:getAll()) {
		if(a.getName().equals(language.getName())) {
			throw new Exception("İsimler tekrar edemez");
		}
		
	}
		
		languagesDao.update(language);
	
	
	}

	@Override
	public void delete(ProgrammingLanguages language) {
	
		languagesDao.delete(language);
	}

	
	

	
	
}
