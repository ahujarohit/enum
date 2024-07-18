enum Colors {RED, GREEN, BLUE};

class Example3 {

    public static void main(String args[]) {
        Colors colors[] = Colors.values();
        for(Colors color : colors) {
            System.out.println(color + " : " + color.ordinal());
        }

        Colors red = Colors.RED;
        Colors green = Colors.GREEN;
        Colors blue = Colors.BLUE;
        System.out.println(red.compareTo(green));       //-1
        System.out.println(blue.compareTo(green));      //1
        System.out.println(red.compareTo(red));         //0

        System.out.println(Colors.valueOf("RED"));      //RED
        System.out.println(Colors.valueOf("YELLOW"));//Exception
    }
}




