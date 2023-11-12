import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
    }

    public void delete(int data) {
        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        System.out.println("Node with data " + data + " deleted.");
    }

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class DoubleLinkList{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the end");
            System.out.println("2. Insert at the beginning");
            System.out.println("3. Delete a node");
            System.out.println("4. Display the linked list forward");
            System.out.println("5. Display the linked list backward");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the end: ");
                    int dataEnd = scanner.nextInt();
                    list.append(dataEnd);
                    break;
                case 2:
                    System.out.print("Enter data to insert at the beginning: ");
                    int dataBegin = scanner.nextInt();
                    list.prepend(dataBegin);
                    break;
                case 3:
                    System.out.print("Enter data to delete: ");
                    int dataDelete = scanner.nextInt();
                    list.delete(dataDelete);
                    break;
                case 4:
                    System.out.print("Linked List Forward: ");
                    list.displayForward();
                    break;
                case 5:
                    System.out.print("Linked List Backward: ");
                    list.displayBackward();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}

