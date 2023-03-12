 public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> s1 = new Stack<>();
        for(int i=0;i<S.length();i++){
            if(Character.isDigit(S.charAt(i))){
                s1.push(S.charAt(i)-'0');
            }
            else{
                int a = s1.pop();
                int b = s1.pop();
                switch(S.charAt(i)){
                    case '+':
                        s1.push(a+b);break;
                    case '-':
                        s1.push(b-a);break;
                    case '*':
                        s1.push(b*a);break;
                    case '/':
                        s1.push(b/a);break;
                            
                }
                
            }
        }
        return s1.peek();
    }