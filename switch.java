class switchex {
    public static void main(String[] args) {
        String x = "Sunday";
        String y = switch (x) {
            case "Saturday", "Sunday" -> "6am";
            case "Monday" -> "7am";
            default -> "10am";
        };
        System.out.println(y);
    }
}
