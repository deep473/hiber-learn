package example.manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Fresher {
		@Id
		int id;
		String name;
		String qualification;
		@ManyToMany
		List<Job> jobs;
		public Fresher() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Fresher(int id, String name, String qualification, List<Job> jobs) {
			super();
			this.id = id;
			this.name = name;
			this.qualification = qualification;
			this.jobs = jobs;
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
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public List<Job> getJobs() {
			return jobs;
		}
		public void setJobs(List<Job> jobs) {
			this.jobs = jobs;
		}
		@Override
		public String toString() {
			return "Fresher [id=" + id + ", name=" + name + ", qualification=" + qualification + ", jobs=" + jobs + "]";
		}
		
		
}
