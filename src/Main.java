public class Main {
    public static void main(String[] args) {
        String phon = "+7918-0 7 0-7 2-5 9";
        phon = phon.replace("-","");
        phon = phon.replace(" ","");
        phon = phon.replace("+","");
        if (phon.length()==10) {
          phon = "7" + phon;
        } else if (phon.length() > 11) {
            throw new RuntimeException("Ahtung телефон слишком длинный");
        } else if (phon.length() < 10) {
            throw new RuntimeException("Ahtung телефон слишком короткий");
        } else if (phon.length() == 11 && phon.charAt(0) !='7') {
            throw new RuntimeException("Среди нас посторонний");

        }
        System.out.println("phon = " + phon);
        String expectedPhon = "79180707259";
        if (phon.equals(expectedPhon)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }
}