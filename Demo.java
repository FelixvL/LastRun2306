class Demo{   // EM
	public static void main(String[] args){
		System.out.println("Beginnen");
		Hond h = new Hond();
		h.blaffen();
		iets(h.ap);
		h.blaffen();

	}
	static void iets(int h){
		h = 33;
	}

}
class Hond{
	int ap = 24;
	void blaffen(){
		System.out.println(ap);
	}
}
