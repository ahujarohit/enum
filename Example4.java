enum Colors {RED, GREEN, BLUE};

class Example4 {
    
    public static void main(String args[]) {
        Colors color = Colors.RED;
        
        if(color == Colors.RED)
            System.out.println("This is Red Color.");
        else if(color == Colors.GREEN)
            System.out.println("This is Green Color.");
        else if(color == Colors.BLUE)
            System.out.println("This is Blue Color.");

        if(color.equals(Colors.RED))
            System.out.println("This is Red Color.");
        else if(color.equals(Colors.GREEN))
            System.out.println("This is Green Color.");
        else if(color.equals(Colors.BLUE))
            System.out.println("This is Blue Color.");
    
        switch(color) {
            case RED : System.out.println("This Red Color.");
                    break;
            case GREEN : System.out.println("This Green Color.");
                    break;
            case BLUE : System.out.println("This Blue Color.");
                    break;
        }
    }
}