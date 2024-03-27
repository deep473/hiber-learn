package example.manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Job {
		@Id
		int jobId;
		String jobRole;
		int salary;
		@ManyToMany
		List<Fresher> freshers;
		public Job() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Job(int jobId, String jobRole, int salary, List<Fresher> freshers) {
			super();
			this.jobId = jobId;
			this.jobRole = jobRole;
			this.salary = salary;
			this.freshers = freshers;
		}
		public int getJobId() {
			return jobId;
		}
		public void setJobId(int jobId) {
			this.jobId = jobId;
		}
		public String getJobRole() {
			return jobRole;
		}
		public void setJobRole(String jobRole) {
			this.jobRole = jobRole;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public List<Fresher> getFreshers() {
			return freshers;
		}
		public void setFreshers(List<Fresher> freshers) {
			this.freshers = freshers;
		}
		@Override
		public String toString() {
			return "Job [jobId=" + jobId + ", jobRole=" + jobRole + ", salary=" + salary + ", freshers=" + freshers
					+ "]";
		}
		
		
}
