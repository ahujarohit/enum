enum Colors {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    Colors(String hexCode) {
        this.hexCode = hexCode;
    }

    public String getHexCode() {
        return hexCode;
    }

    String hexCode;
};

class Example2 {

    public static void main(String args[]) {
        Colors color = Colors.RED;  
        System.out.println(color);  //RED
        System.out.println(color.getHexCode()); //#FF0000
    }
}




