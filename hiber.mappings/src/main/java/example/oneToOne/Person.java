package example.oneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
		@Id
		int id;
		String name;
		@OneToOne
		Passport passport;
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Person(int id, String name, Passport passport) {
			super();
			this.id = id;
			this.name = name;
			this.passport = passport;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Passport getPassport() {
			return passport;
		}
		public void setPassport(Passport passport) {
			this.passport = passport;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", passport=" + passport + "]";
		}
		
}
