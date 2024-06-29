/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gbancaire;


import java.util.Scanner;
public class GestionBancaire {
  
    public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
    Banque banque=new Banque();
    boolean quitter=false;
    while(!quitter)
    {
        System.out.println("------------------GESTION BANCAIRE----------------------");
        System.out.println("1:Creer un compte");
        System.out.println("2:Deposer de l'argent");
        System.out.println("3: Retirer de l'espece");
        System.out.println("4:Consulter le solde");
        System.out.println("5:Lister tous les comptes ");
        System.out.println("6:Quitter \n");
        System.out.println("Choisissez une option :");
        int choix=scanner.nextInt();
        scanner.nextLine();
        switch(choix)
        {
            case 1:
                System.out.println(" Numero de compte : ");
                String numeroCompte=scanner.nextLine();
                   System.out.println(" Titulaire : ");
                   String titulaire=scanner.nextLine();
                        System.out.println(" Solde : ");
                        double solde=scanner.nextDouble();
                CompteBancaire compte=new CompteBancaire(numeroCompte,titulaire,solde);
                    banque.ajouterCompte(compte);
                        System.out.println("COMPTE CREE AVEC SUCCES");
                        break;
            case 2 :
                System.out.println(" Numero de compte : ");
                String soldeDeposer=scanner.nextLine();
                CompteBancaire compteDeposer = banque.rechercherCompteParNumero(soldeDeposer);
                if(compteDeposer!=null)
                {
                    System.out.println("Montant a deposer : ");
                    double montantDeposer=scanner.nextDouble();
                  compteDeposer.retirer(montantDeposer);
                }else
                {
                        System.out.println("Compte non retrouve");
                }
                
                    break;
            case 3:
                System.out.println("Numero de compte : ");
                String numeroRetire=scanner.nextLine();
                CompteBancaire retireEspece=banque.rechercherCompteParNumero(numeroRetire);
                    if(retireEspece !=null)
                    {
                    System.out.println("Retrait reussi");
                    double montantRetire=scanner.nextDouble();
                    retireEspece.retirer(montantRetire);
                    }else
                    {
                        System.out.println("Compte non retrouve");
                    }
                    break;
            case 4:
                  System.out.println("Numero de compte : ");
                  String ConsulteCompte=scanner.nextLine();
                  CompteBancaire consulte=banque.rechercherCompteParNumero(ConsulteCompte);
                  if(consulte!=null)
                  {
                      System.out.println("Solde de votre compte est "+consulte.getSolde());
                  }else
                  {
                      System.out.println("Compte non retrouve ");
                  }
                  break;
            case 5:
                System.out.println("Liste des comptes");
                banque.listerComptes();
                break;
            case 6:
                quitter=true;
                System.out.println("Au revoir!!!");
                break;
            default :
                
                System.out.println("Option invalide.Veuillez ressayer");
   
                }
        
        }
         scanner.close();
    }
}
    

