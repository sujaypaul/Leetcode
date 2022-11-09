class StockSpanner {   
        class Node{
            int price;
            int count;
            Node(Integer price,Integer count)
            {
                this.price=price;
                this.count=count;
            }
        }
        Stack<Node> stack=new Stack<>(); 

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int count=1;
        while (!stack.isEmpty() && stack.peek().price <= price)
        {
            count+=stack.pop().count;
        }
        stack.push(new Node(price,count));
        return count;       
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */