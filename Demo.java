class Demo{   // DE
	public static void main(String[] args){
		System.out.println("Beginnen");
		Fiets f = new Fiets();
		Fiets f2 = new Fiets();
		f.snelheid = 14;
		System.out.println(">> "+f2.snelheid);
	}

}

class Fiets{
	int snelheid = 25;
	Fiets(){
		System.out.println("Fietsje erbij");
	}

}