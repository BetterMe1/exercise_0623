package exercise.exercise_0622;

/*
猜数游戏
牛牛和羊羊在玩一个有趣的猜数游戏。在这个游戏中,牛牛玩家选择一个正整数,羊羊根据已给的提示猜这个数字。第i个提示是"Y"或者"N",表示牛牛选择的数是否是i的倍数。
例如,如果提示是"YYNYY",它表示这个数使1,2,4,5的倍数,但不是3的倍数。
注意到一些提示会出现错误。例如: 提示"NYYY"是错误的,因为所有的整数都是1的倍数,所以起始元素肯定不会是"N"。此外,例如"YNNY"的提示也是错误的,因为结果不可能是4的倍数但不是2的倍数。
现在给出一个整数n,表示已给的提示的长度。请计算出长度为n的合法的提示的个数。
例如 n = 5:
合法的提示有:
YNNNN YNNNY YNYNN YNYNY YYNNN YYNNY
YYNYN YYNYY YYYNN YYYNY YYYYN YYYYY
所以输出12
 */
//注意计算幂次时k的类型为long,k*=i的结果可能会使k超出整数的范围
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag[] = new boolean[n+1];
        long result = 1;
        for(int i=2; i<=n; i++){
            if(flag[i]){
                continue;
            }
            for(int j=2*i; j<=n; j+=i){
                flag[j] = true;
            }
            long count = 0;
            //i的幂次
            for(long k=i; k<=(long)n; k*=i){
                count++;
            }
            result = result * (count+1) % 1000000007;
        }
        System.out.println(result);
    }
}