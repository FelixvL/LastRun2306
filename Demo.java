class Demo{   // EP
	static int iets = rennen();
	public static void main(String[] args){
		System.out.println("Beginnen");
		iets(23);
		System.out.println("Einde");
	}
	static void iets(int h){
		h = 33;
	}
	static int rennen(){
		System.out.println("we gaan rennen");
		return 17;
	}

}
class Hond{
	int ap = 24;
	void blaffen(){
		System.out.println(ap);
	}
}
