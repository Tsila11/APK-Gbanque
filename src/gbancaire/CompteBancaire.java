/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gbancaire;

public class CompteBancaire {
    private String numeroCompte;
    private String titulaireCompte;
    private double solde;
    public CompteBancaire(String nCompte,String tcmpte,double soldeDeVotreCompte)
    {
        this.titulaireCompte=tcmpte;
        this.numeroCompte=nCompte;
        this.solde=soldeDeVotreCompte;
    }
    public String getNumeroCompte()
    {
        return numeroCompte;
    }
     public String gettitulaire()
    {
        return titulaireCompte;
    }
     public double getSolde()
    {
        return solde;
    }
    public void deposer(double montant)
    {
    if(montant>0)
    {
        solde+=montant;
        System.out.println("Depot reussi. /n"+"Nouveau solde "+solde);
    }else
        System.out.println("Le montant doit etre plus de 500Ar . /n");
    }
    public void retirer(double montant)
    {
        if(montant > 0 && montant <=solde)
        {
        solde-=montant;
        System.out.println("Retrait bien succes.\n"+"Nouveau solde : "+solde);
        
        }else if(montant>solde)
        {
            System.out.println("Votre solde est insuffisant");
        }else
            System.out.println("Le montant de retrait > 0");
    }
    @Override
    public String toString()
    {
        return "[Numero de compte] : "+numeroCompte+"\n"+"[Titulaire] : "+titulaireCompte+"[Solde] : "+solde;
    }
    
}
