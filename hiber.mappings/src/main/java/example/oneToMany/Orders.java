package example.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Orders {
		@Id
		int id;
		String item;
		int amount;
		@ManyToOne
		Customer customer;
		public Orders() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Orders(int id, String item, int amount, Customer customer) {
			super();
			this.id = id;
			this.item = item;
			this.amount = amount;
			this.customer = customer;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getItem() {
			return item;
		}
		public void setItem(String item) {
			this.item = item;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		@Override
		public String toString() {
			return "Order [id=" + id + ", item=" + item + ", amount=" + amount + ", customer=" + customer + "]";
		}
		
}
