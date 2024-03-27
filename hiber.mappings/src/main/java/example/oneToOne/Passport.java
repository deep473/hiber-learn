package example.oneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
		@Id
		int ppId;
		String country;
		@OneToOne
		Person person;
		public Passport() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Passport(int ppId, String country, Person person) {
			super();
			this.ppId = ppId;
			this.country = country;
			this.person = person;
		}
		public int getPpId() {
			return ppId;
		}
		public void setPpId(int ppId) {
			this.ppId = ppId;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Person getPerson() {
			return person;
		}
		public void setPerson(Person person) {
			this.person = person;
		}
		@Override
		public String toString() {
			return "Passport [ppId=" + ppId + ", country=" + country + ", person=" + person + "]";
		}
		
}
