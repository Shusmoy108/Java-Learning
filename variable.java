class variable {
    public static void main(String[] args) {
        byte a = 127;
        int b = 1244;
        byte k =(byte)b;
        float f= 5.6f;
        int t=(int)f;
        int num=7;
        int result = ++num;
        System.out.println((result));
        num=7;
        result= num++;
        System.err.println(result);
        System.out.println(t);
    }

}
