package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageDao;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
@Repository
public class InMemoryProgrammingLanguagesDao implements ProgrammingLanguageDao {

	List<ProgrammingLanguages> languages;
	Scanner scanner=new Scanner(System.in);
	
	public InMemoryProgrammingLanguagesDao() {
		languages= new ArrayList<ProgrammingLanguages>();
	languages.add(new ProgrammingLanguages(1,"C"));
	languages.add(new ProgrammingLanguages(2,"Phyton"));
	languages.add(new ProgrammingLanguages(3,"Java"));
	languages.add(new ProgrammingLanguages(4,"C++"));
	languages.add(new ProgrammingLanguages(5,"Ruby"));
	
	}


	@Override
	public List<ProgrammingLanguages> getAll() {
	
		return languages ;
	}


	@Override
	public void add(ProgrammingLanguages language) {
		
		languages.add(language);
		
		
	}


	@Override
	public void getById(int id) {
		
		for(ProgrammingLanguages i:languages) {
			
			if(id==i.getId()) {
				System.out.println(i.getName());
			
			}
			else {
				System.out.println("Bu id ile ilgili yazılım dili yoktur");
			}
		}
		
		
	}


	


	@Override
	public void delete(ProgrammingLanguages language) {
languages.remove(language);

		
	}


	@Override
	public void update(ProgrammingLanguages language) {
		for(ProgrammingLanguages a:languages) {
			if(a.getId()==language.getId()) {
				a.setName(language.getName());
				
				break;
			}
		
	}

	System.out.println("Updated language:"+language.getId()+language.getName());
}
	}

