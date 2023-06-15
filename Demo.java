class Demo{   // DC
	public static void main(String[] args){
		System.out.println("Beginnen");
		Fiets f = new Fiets();
		f.doen(6);
		String iets = new String("voordoen");
		iets.concat("nadoen");
		System.out.println(iets);
	}

}

class Fiets{
	int waarde = 25;
	int doen(int waardevol){
		System.out.println(waarde);
		return 37;
	}
}