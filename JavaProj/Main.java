import java.util.Scanner; // Java 套件，用來獲取鍵盤輸入值

public class Main {
    /* 程式碼原則上不須更動，但不限制同學進行更動 */
    public static void main(String[] args) {
        //讀取鍵盤輸入
        System.out.println("請輸入中置式 : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //執行中序轉後序演算法
        String ans =  inToPostFix.infixToPostFix(input);
        //執行後序求值演算法
        Float value = postFixEvaluate.postFixEvaluation(ans);
        //印出結果
        System.out.println("Infix Expression: " + input);
        System.out.println("Postfix Expression: " + ans);
        System.out.println("Postfix Evaluation: " + value);
    }
}