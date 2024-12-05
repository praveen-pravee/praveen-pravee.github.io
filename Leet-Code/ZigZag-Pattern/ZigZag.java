class ZigZag {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] g = new StringBuilder[numRows];
        Arrays.setAll(g, k -> new StringBuilder());
        int i = 0, k = -1;
        for (char c: s.toCharArray()) {
            g[i].append(c);
            if (i == 0 || i == numRows - 1) {
                k = -k;
            }
            i+=k;
        }
        return String.join("", g);
    }
    public static void main(String[] args) {
       ZigZag obj = new ZigZag();
       System.out.println(obj.convert("REKSHITHA", 3));
        // Output:  PAHNAPLSIIGYIR
    }
}
