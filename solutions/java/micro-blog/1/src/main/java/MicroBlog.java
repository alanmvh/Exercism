class MicroBlog {
    public String truncate(String s) {
        int codePointCounter = 5;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length() && codePointCounter > 0;) {
            int cp = s.codePointAt(i);
            sb.append(Character.toChars(cp));
            codePointCounter -= 1;
            i += Character.charCount(cp); // move by 1 or 2 code units
        }
        return sb.toString();
    }
}
