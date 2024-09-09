class LinkedList {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Função para adicionar um elemento no início da lista
    public static Node addFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode; // Novo nó se torna o primeiro nó (head)
    }
    
    // Função para adicionar um elemento no final da lista
    public static Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode; // Se a lista estiver vazia, o novo nó é o primeiro nó
        }
        Node current = head;
        while (current.next != null) {
            current = current.next; // Vai até o final da lista
        }
        current.next = newNode;
        return head; // Retorna o head, pois a cabeça da lista não mudou
    }

    // Função para exibir os elementos da lista
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Função para remover o primeiro elemento da lista
    public static Node removeFirst(Node head) {
        if (head == null) return null; // Lista vazia
        return head.next; // O segundo nó se torna o novo head
    }
    
    // Função para remover o último elemento da lista
    public static Node removeLast(Node head) {
        if (head == null || head.next == null) return null; // Lista vazia ou com um único nó
        Node current = head;
        while (current.next.next != null) {
            current = current.next; // Vai até o penúltimo nó
        }
        current.next = null; // Remove a referência para o último nó
        return head;
    }

    // Função para encontrar um elemento na lista
    public static boolean find(Node head, int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Node head = null; // Inicializando a lista vazia
        
        // Adicionando elementos
        head = addFirst(head, 1);
        head = addLast(head, 2);
        head = addLast(head, 3);
        head = addLast(head, 4);
        
        // Exibindo a lista
        printList(head);
        
        // Removendo elementos
        head = removeFirst(head); // Remove o primeiro nó
        printList(head);
        
        head = removeLast(head); // Remove o último nó
        printList(head);
        
        // Encontrando um elemento
        System.out.println("Elemento 3 encontrado: " + find(head, 3));
        System.out.println("Elemento 5 encontrado: " + find(head, 5));
    }
}