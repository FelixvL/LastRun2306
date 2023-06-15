class Demo{   // DG
	public static void main(String[] args){
		System.out.println("Beginnen");
		Fiets f = new Fiets();
		Fiets f2 = new Fiets();
		System.out.println(">> "+f2.snelheid);
	}

}

class Fiets{
	static int snelheid = 25;
	Fiets(int s){
		System.out.println("Fietsje erbij");
		snelheid = s;
	}

}