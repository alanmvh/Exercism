class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        char[] x = identifier.toCharArray();
        for(int i=0; i<x.length; i++){
            if(x[i] == ' '){
                result.append("_");
            }
            else if(Character.isISOControl(x[i])){
                result.append("CTRL");
            }
            else if(x[i]=='-'){
                i++;
                result.append(Character.toUpperCase(x[i]));
            }
            else if(x[i] >= 'α' && x[i] <= 'ω'){
                continue;
            }
            else if (Character.isAlphabetic(x[i])) {
                result.append(x[i]);
            }

            
        }
        return result.toString();
    }

}
