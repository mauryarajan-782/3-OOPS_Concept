package Interface_2;

interface Printable{
	void print();
}

class document implements Printable{
	public void print() {
		System.out.println("Document Printing...");
	}
}
	
class image implements Printable{
	public void print() {
		System.out.println("Image Printing...");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		
		document p1 = new document();
		image p2 = new image();
		p1.print();
		p2.print();

	}

}
