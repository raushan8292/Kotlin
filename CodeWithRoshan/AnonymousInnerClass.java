package CodeWithRoshan;

interface Human1{

    void  think();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // make anonymous
        Human1 promgrammer = new Human1()
                            {
                                @Override
                                public void think() {
                                    System.out.println("virtual world !!! ");
                                }
                            };

        promgrammer.think();
    }

}
