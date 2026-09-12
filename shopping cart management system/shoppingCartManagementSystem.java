class shoppingCartManagementSystem{

	// Product Class 

	class product{
		int productid;
		String name;
		Double price;
		int quantity;

		product(int productid,String name,Double price,int quantity){
			this.productid = productid;
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}

		void display(){
			System.out.print("----------------------------------------");
			System.out.print("Product ID : " +productid+"\n"+"Name : "+name+"\n"+"Price : "+price+"\n"+"Quantity : "+quantity);
			System.out.print("----------------------------------------");
		}
	}

	// Node Clas

	class Node{
		product data;
		Node next;

		Node(product data){
			this.data = data;
			this.next = null;
		}
	}

	// Linked List Class

	class linkedList{
		Node head;
		Node tail;

		linkedList(){
			this.head = head;
			this.tail = tail;
		}

		void addProductFront(product data){

			Node newnode = new Node(data);
			if (head == null) {
				head = tail = newnode;
				return;
			}
			newnode.next = head;
			head = newnode;
		}

		void addProductBack(product data){

			Node newnode = new Node(data);
			if (head == null) {
				head = tail = newnode;
				return;
			}
			tail.next = newnode;
			tail = newnode;
		}

	// Remove Product by ID
		void removeProduct(product data){
			if (head == null) {
				System.out.print("List is emoty.");
				return;
			}
			if (head.data.productId == productId) {
				head = head.next;
			}
			if (head == null) {
				tail = null;
				return;
			}
			
		}
	}
}