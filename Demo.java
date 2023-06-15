class Demo{   // EL
	public static void main(String[] args){
		System.out.println("Beginnen");
		Hond h = new Hond();
		h.blaffen();
		iets(h);
		h.blaffen();

	}
	static void iets(Hond h){
		h.ap = 33;
	}

}
class Hond{
	int ap = 24;
	void blaffen(){
		System.out.println(ap);
	}
}
