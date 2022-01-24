class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> output = new ArrayList();
        Queue<Integer> q = new LinkedList();
        for(int i = 1; i<10;i++) q.add(i);
        while(q.size() > 0) {
            int num = q.remove();
            if (num >= low && num <=high ) output.add(num);
            int lastDigit = num % 10;
            if(lastDigit < 9 && num * 10 + lastDigit + 1 <= high) q.add(num*10+lastDigit+1);
        }
        return output;
    }
}