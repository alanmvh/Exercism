class ReverseString {

   String reverse(String inputString) {
        StringBuilder reverseString = new StringBuilder();
        if(!inputString.isEmpty()){
            for(int i = inputString.length(); i>0; i--){
                reverseString.append(inputString.charAt(i-1));
            }
            return reverseString.toString();
        }else
            return inputString;

    }

  
}
