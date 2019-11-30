import io.javalin.Javalin;

public class HelloJavalin {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7777);
        app.get("/", ctx -> ctx.result("Hello world!"));
        System.out.println("Hello Boris!");
    }
}
