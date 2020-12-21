package Solution67;

public class AddBinary {
//Solution 67
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0; // carry:進位變數

        // 從末位數依序相加，轉成2進制後存入sb，有進位存入carry
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        // String是由前往後存入，最後須reverse顛倒才是正確排列
        return sb.reverse().toString();
    }

}