class Demo{   // DB
	public static void main(String[] args){
		System.out.println("Beginnen");
		Fiets f = new Fiets();
		f.doen(6);
	}

}

class Fiets{
	int waarde = 25;
	void doen(int waarde){
		System.out.println(waarde);
	}
}