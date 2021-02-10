public class Main {


    public static void main(String[] args) {

        connectToServer(code -> {
            System.out.println("Reponse du serveur " + code);
        });

    }


    public static void connectToServer(ServerConnect serverConnect){
        // TODO : si tout se passe bien, on appelle serverConnect avec 200
        // TODO : sinon 404, 500

        serverConnect.connect(200);
    }

}
