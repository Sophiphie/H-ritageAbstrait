
public class ClasseTestt
{

	
	public static void main(String[] args) 
	{
		
		    Chien c = new Chien("Gris vert", 20);
		    c.boire();
		    c.manger();
		    c.deplacement();
		    c.crier();
		    System.out.println(c.toString());
		    
		    System.out.println("--------------------------------------------");
		    //Les m�thodes de l'interface
		    c.faireCalin();
		    c.faireLeBeau();
		    c.faireLechouille();
				
		    System.out.println("--------------------------------------------");
		    //Utilisons le polymorphisme de notre interface
		    Rintintin r = new Chien();
		    r.faireLeBeau();
		    r.faireCalin();
		    r.faireLechouille();
		   

	}

}
