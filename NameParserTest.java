class NameParser {
    public String parse(String[] names) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (String s : names) {
            String str = s.split("\\s")[0];
            if (!s.equals(names[names.length - 1])) {
                result = sb.append(str).append(", ").toString();
            } else result = sb.append(str).toString();
        }
        return result;
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
