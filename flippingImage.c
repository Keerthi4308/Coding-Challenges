class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        for(int r=0;r<A.length;r++)
        {
            for(int c=0,partner=(A[r].length-1);c<partner+1; c++,partner--)
            {
                //flip
                int temp=A[r][c];
                A[r][c]=A[r][partner];
                A[r][partner]=temp;
                //inverse
                if(A[r][c]==0){ A[r][c]=1;}
                else{A[r][c]=0;}
                
                if(partner!=c)
                {
                    if(A[r][partner]==0){A[r][partner]=1;}
                    else{A[r][partner]=0;}
                }
              
            }
        }
        return A;
    }
}