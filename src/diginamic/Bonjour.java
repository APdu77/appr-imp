package diginamic;

public class Bonjour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bonjour tt le monde");

		String maChaine = "Bonjour a ts";
		char monChar = 'a';
		long a = 85; //ici java converts 85 qui est un int en long
		long b = 85L; //ici java stocke 85 qui est de type long
		long c = 9000000000L; //L obigatoire car 9000000000 n'est pas un int
		float f = 8.5F; // par def un nombre a virgule est un double
		// hierarchie des types : double > float > int > short > byte
		
		double h = 8f; //conversion implicite
		
		int i = 053; //base8 : 5*8^1+3*8^0=43 (int only)
		
		String ch = "coucou \n re-coucou";
		
		System.out.println(ch);
		
		int j = 1; //acte de naissance
		j = j + 1;// java exe de droite a gauche quand il y a un =		
				
		
		
	}

}
