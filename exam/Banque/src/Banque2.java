public class Banque2 {
    public static void main(String[] args) {
        Compte comptePrive1 = new Compte(1000.0, 0.01);
        Compte compteEpargne1 = new Compte(2000.0, 0.02);
        Client client1 = new Client("Pedro", "Geneve", comptePrive1, compteEpargne1);

        Compte comptePrive2 = new Compte(3000.0, 0.01);
        Compte compteEpargne2 = new Compte(4000.0, 0.02);
        Client client2 = new Client("Alexandra", "Lausanne", comptePrive2, compteEpargne2);

        // Affichage des informations avant le bouclage des comptes
        System.out.println("Données avant le bouclage des comptes:");
        client1.afficherInfos();
        client2.afficherInfos();

        // Boucler les comptes
        comptePrive1.appliquerInteret();
        compteEpargne1.appliquerInteret();
        comptePrive2.appliquerInteret();
        compteEpargne2.appliquerInteret();

        // Affichage des informations après le bouclage des comptes
        System.out.println("Données après le bouclage des comptes:");
        client1.afficherInfos();
        client2.afficherInfos();
    }
}