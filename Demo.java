class Demo{   // DJ
	public static void main(String[] args){
		System.out.println("Beginnen");
		Fiets f = new Fiets(17);
		Fiets f2 = new Fiets();
		System.out.println(">> "+f2.snelheid);
	}

}
class Voertuig{
	Voertuig(){
		System.out.println("dit zien we niet");	
	}
}
class Fiets extends Voertuig{
	int snelheid = 25;
	Fiets(int s){
		System.out.println("Fietsje erbij: "+ s);
		snelheid++;
		snelheid = s;
	}
	Fiets(){
		this(8);
		snelheid = 9;
	}

}