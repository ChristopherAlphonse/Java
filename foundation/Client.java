package foundation;

class Client {
    private int id;

    public Client(int id) {
        this.id = id;
    }

    static Client hello = new Client(1);
    static Client hello2 = new Client(1);

    public static void main(String[] args) {
        System.out.println(hello == hello2);
    }

}
