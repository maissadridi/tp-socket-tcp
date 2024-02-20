
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SocketServeur {
    public static void main(String argv[]) {
        int port = 0;
        Scanner keyb = new Scanner(System.in);
        // Récupérer le numéro de port à partir de l'utilisateur
        System.out.print("Port d'écoute : ");
        try {
            port = keyb.nextInt();
        } catch (NumberFormatException e) {
            System.err.println("Le paramètre n'est pas un entier.");
            System.err.println("Usage : java ServeurUDP port-serveur");
            System.exit(-1);
        }
        try {
            // Créer un serveur socket
            ServerSocket serverSocket = new ServerSocket(port);
            // Attendre une connexion entrante
            Socket socket = serverSocket.accept();
            // Créer les flux de communication
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
            // Lire la chaîne envoyée par le client
            String chaine = (String) input.readObject();
            System.out.println(" recu : " + chaine);
            // Afficher l'adresse et le port du client
            System.out.println(" ca vient de : " + socket.getInetAddress() + ":" + socket.getPort());
            // Répondre au client
            output.writeObject(new String("bien recu"));
        } catch (Exception e) {
            System.err.println("Erreur : " + e);
        }
    }
}
