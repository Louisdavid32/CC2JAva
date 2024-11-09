//Classe Client

//La classe Client contiendra :

//Attributs pour le nom et la ville.
//Un ou plusieurs attributs pour stocker les comptes.

public class Client {
    private String nom;
    private String ville;
    private Compte comptePrive;
    private Compte compteEpargne;

    public Client(String nom, String ville, Compte comptePrive, Compte compteEpargne) {
        this.nom = nom;
        this.ville = ville;
        this.comptePrive = comptePrive;
        this.compteEpargne = compteEpargne;
    }

    // Méthode pour afficher les informations du client
    public void afficherInfos() {
        System.out.println("Client " + nom + " de " + ville);
        System.out.println("Compte privé: " + comptePrive.getSolde() + " francs");
        System.out.println("Compte d'épargne: " + compteEpargne.getSolde() + " francs");
    }
}


