class Hillstations{
    void location(){
        System.out.println("Location is:");
    }
    void famousfor(){
        System.out.println("Famous for:");
    }
}

class Manali extends Hillstations{
    void location(){
        System.out.println("Manali is located in Himachal Pradesh.");
    }
    void famousfor(){
        System.out.println("Manali is famous for its scenic beauty and adventure sports.");
    }
}

class Mussoorie extends Hillstations{
    void location(){
        System.out.println("Mussoorie is located in Uttarakhand.");
    }
    void famousfor(){
        System.out.println("Mussoorie is famous for its colonial architecture and beautiful landscapes.");
    }
}

class Gulmarg extends Hillstations{
    void location(){
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }
    void famousfor(){
        System.out.println("Gulmarg is famous for its ski resorts and natural beauty.");
    }
}

class Main {
    public static void main(String args[]){
        Hillstations A = new Hillstations();
        Hillstations M = new Manali();
        Hillstations Mu = new Mussoorie();
        Hillstations G = new Gulmarg();

        A.location();
        A.famousfor();

        M.location();
        M.famousfor();

        Mu.location();
        Mu.famousfor();

        G.location();
        G.famousfor();
    }
}
