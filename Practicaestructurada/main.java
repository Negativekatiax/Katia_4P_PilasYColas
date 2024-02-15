public class main {
    public static void Main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Elementos de la pila:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("\nElementos de la cola:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}