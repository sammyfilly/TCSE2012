class liuxianglong {
    public double pow(double x, int n) {
        double res = 1;
        boolean minus = n<0;
        if(minus) n=-n;
        while(n>0){
            if(n%2!=0) res*=x;
            n/=2;
            x*=x;
        }
        return minus?1/res:res;
    }
}