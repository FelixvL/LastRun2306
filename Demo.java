class Demo{   // DN
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
	Fiets(){
		this(8);
		snelheid = 9;
	}
	Fiets(long w){
		System.out.println("de andere");
	}
	Fiets(Integer i){
		System.out.println("nog een??");
	}

}