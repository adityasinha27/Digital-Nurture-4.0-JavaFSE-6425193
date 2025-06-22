package CODE;
public class Logger{

    private static Logger instance ;

    private Logger(){
        System.out.println("Logger initialized");
    }

    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("LOG " + message);
    }

    public static void main(String[] args){

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is first message");
        logger2.log("This is the second message");

        if(logger1 == logger2){
            System.out.println("Singleton works !");
        }
        else{
            System.out.println("Singleton failed");
        }
    }
}
