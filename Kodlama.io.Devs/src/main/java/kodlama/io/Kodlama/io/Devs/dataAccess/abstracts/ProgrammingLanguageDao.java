package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguageDao {
List<ProgrammingLanguages> getAll();
public void add(ProgrammingLanguages languages);
public void getById(int id);
void update(ProgrammingLanguages language);
void delete(ProgrammingLanguages languages);
}
