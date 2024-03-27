package example.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
		@Id
		int cNum;
		String name;
		@OneToMany
		List<Orders> orders;
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Customer(int cNum, String name, List<Orders> orders) {
			super();
			this.cNum = cNum;
			this.name = name;
			this.orders = orders;
		}
		public int getcNum() {
			return cNum;
		}
		public void setcNum(int cNum) {
			this.cNum = cNum;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Orders> getOrders() {
			return orders;
		}
		public void setOrders(List<Orders> orders) {
			this.orders = orders;
		}
		@Override
		public String toString() {
			return "Customer [cNum=" + cNum + ", name=" + name + ", orders=" + orders + "]";
		}
		
}
