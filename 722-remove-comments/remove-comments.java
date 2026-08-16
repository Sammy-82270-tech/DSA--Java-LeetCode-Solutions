class Solution {
    public List<String> removeComments(String[] source) {
        boolean inBlockComment = false;
        List<String> res = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        for (String s: source) {
            for (int i = 0; i < s.length(); i++) {
                if (!inBlockComment && s.charAt(i) == '/' && i + 1 < s.length() && s.charAt(i + 1) == '/') {
                    break;
                } else if (!inBlockComment && s.charAt(i) == '/' && i + 1 < s.length() && s.charAt(i + 1) == '*') {
                    i++;
                    inBlockComment = true;
                    continue;
                } else if (inBlockComment && s.charAt(i) == '*' && i + 1 < s.length() && s.charAt(i + 1) == '/') {
                    i++;
                    inBlockComment = false;
                    continue;
                }
                if (!inBlockComment) {
                    sb.append(s.charAt(i));
                }
            }
            
            if (!inBlockComment && sb.length() > 0) {
                res.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        
        return res;
    }
}