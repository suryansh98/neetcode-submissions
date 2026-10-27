class Solution {
    public int evalRPN(String[] tokens) {
        

        Stack<Integer> st = new Stack<>();


        for(int i = 0; i < tokens.length; i++){

            if(tokens[i].equals("+")){

                int num2 = st.pop();
                int num1 = st.pop();

                int ans = num1 + num2;

                st.push(ans);
            }
            else if(tokens[i].equals("-")){

                int num2 = st.pop();
                int num1 = st.pop();

                int ans = num1 - num2;

                st.push(ans);
            }
            else if(tokens[i].equals("*")){

                int num2 = st.pop();
                int num1 = st.pop();

                int ans = num1 * num2;

                st.push(ans);
            }
            else if(tokens[i].equals("/")){

                int num2 = st.pop();
                int num1 = st.pop();

                int ans = num1 / num2;

                st.push(ans);
            }
            else{
                int num = Integer.parseInt(tokens[i]);

                st.push(num);
            }
        }

        return st.pop();
    }
}
