class Solution {
    public boolean judgeCircle(String moves) {

        int r = 0, c = 0;
        // read moves
        for (int i = 0; i < moves.length(); i++) {
            // change r,c accord to move
            switch (moves.charAt(i)) {
            case 'U':
                r--;
                break;
            case 'D':
                r++;
                break;
            case 'L':
                c--;
                break;
            case 'R':
                c++;
                break;
            default:
                break;
            }

        }
        if (r == 0 && c == 0) {
            return true;
        }
        return false;
    }
}