class Solution {
    public List<String> removeComments(String[] source) {

        List<String> ans = new ArrayList<>();
        boolean block = false;
        StringBuilder line = new StringBuilder();

        for (String s : source) {

            int i = 0;

            if (!block) {
                line = new StringBuilder();
            }

            while (i < s.length()) {

                if (!block && i + 1 < s.length()
                        && s.charAt(i) == '/' && s.charAt(i + 1) == '/') {
                    break;
                }

                if (!block && i + 1 < s.length()
                        && s.charAt(i) == '/' && s.charAt(i + 1) == '*') {
                    block = true;
                    i += 2;
                    continue;
                }

                if (block && i + 1 < s.length()
                        && s.charAt(i) == '*' && s.charAt(i + 1) == '/') {
                    block = false;
                    i += 2;
                    continue;
                }

                if (!block) {
                    line.append(s.charAt(i));
                }

                i++;
            }

            if (!block && line.length() > 0) {
                ans.add(line.toString());
            }
        }

        return ans;
    }
}