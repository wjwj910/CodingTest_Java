class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int x_temp = x;
        
        for(int i = 0; x_temp > 0; i++){
            int temp = x_temp % 10;
            x_temp /= 10;
            sum += temp;
        }
        boolean answer = true;
        if(x%sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}