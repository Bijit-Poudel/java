public class ExpressionsValidation{
    public static void main(String[] args){
        int i= 8, j = 5, k;
        float x = 0.005f, y = -0.01f, z;
        char a, b, c = 'c' , d = 'd' ;
        
        System.out.println((3 *i-2 * j ) % ( 2 * d - c ));
        System.out.println(2 * ( ( i / 5) + ( 4 * ( j - 3 ) ) % ( i + j - 2 ) ));
        System.out.println((i - 3 * j ) % ( c + 2 * d ) / ( x - y ));
        System.out.println(-(i + j ));
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(--j);
        System.out.println(++x);
        System.out.println(y--);
        System.out.println(i <= j);
        System.out.println(c > d);
        System.out.println(x >= 0);
        System.out.println(x < y);
        System.out.println(j != 6);
        System.out.println(c == 99);
        System.out.println(5 * (i + j ) > 'c');
        System.out.println((2 * x + y ) == 0);
        // System.out.println(2 * x + ( y == 0));
        System.out.println(2 * x + y == 0);
        System.out.println(!(i <= j ));
        System.out.println(!(c == 99));
        System.out.println(!(x > 0));
        System.out.println((i > 0) & (j < 5));
        System.out.println((i > 0) | (j < 5));
        System.out.println((x > y) & (i > 0) | ( j < 5));
        System.out.println((x > y) & (i > 0) & ( j < 5 ));
        System.out.println((i + j ));
        y =- x;
        System.out.println(y);
        // k = x + y;
        // System.out.println(k);
        x *= 2;
        System.out.println(x);
        i = j;
        System.out.println((i));
        // k = x + y;
        // System.out.println((k));
        i %= j;
        System.out.println(i);
        i += (j - 2);
        System.out.println(i);
        z = i/j;
        System.out.println((z));
        k = (j == 5 ) ? i : j;
        System.out.println(k);
        k = (j > 5) ? i : j;
        System.out.println(k);
        z = (x >= 0) ? x : 0;
        System.out.println(z);
        // System.out.println((k = x));
        z = (y >= 0) ? y : 0;
        System.out.println(z);
        z = x;
        System.out.println(z);
        a = (c < d) ? c : d;
        System.out.println(a);
        i += 2;
        System.out.println(i);
        i -= (j > 0) ? j : 0;
        System.out.println(i);

    }
}
