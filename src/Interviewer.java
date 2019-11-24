public class Interviewer {
    String askColorQuestion(){
        return "Enter your favorite color:";
    }

    String respondToColor(String color){
        //Can switch on Strings since Java 7
        switch (color){
            case "red":
                return "Roses are red";
            case "blue":
                return "Violets are blue";
            case "yellow":
                return "Java is awesome";
            default:
                return "And so are you";
        }
    }
}
