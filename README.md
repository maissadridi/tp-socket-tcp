# tp-socket-tcp

Pour tester ces programmes dans les deux cas :

### a. Les deux programmes se trouvant dans la même machine :

- Compiler les deux classes : SocketServeur et SocketClient.
- Exécuter d'abord SocketServeur puis SocketClient dans deux terminaux distincts.
- Suivre les instructions affichées dans les terminaux pour saisir le port et le nom du serveur (localhost) lors de l'exécution de SocketClient.
- Observer l'échange de messages entre le client et le serveur dans les terminaux.
### b. Les deux programmes dans deux machines distantes :

- Assurez-vous que les deux machines sont connectées au même réseau.
- Modifier le code côté client (SocketClient) en remplaçant "localhost" par l'adresse IP ou le nom de domaine du serveur distant.
- Compiler et exécuter SocketServeur sur la machine serveur.
- Compiler et exécuter SocketClient sur la machine cliente en spécifiant l'adresse IP ou le nom de domaine du serveur distant.
- Suivre les instructions affichées dans les terminaux pour saisir le port et le nom du serveur lors de l'exécution de SocketClient.
- Observer l'échange de messages entre le client et le serveur dans les terminaux respectifs.