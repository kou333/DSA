import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int data) {
        Node current = head;
        Node prev = null;

        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }

        if (prev == null) {
            head = current.next;
        } else {
            prev.next = current.next;
        }

        System.out.println("Node with data " + data + " deleted.");
    }

    public void edit(int oldData, int newData) {
        Node current = head;

        while (current != null && current.data != oldData) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with data " + oldData + " not found.");
            return;
        }

        current.data = newData;
        System.out.println("Node with data " + oldData + " edited to " + newData + ".");
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class linklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the end");
            System.out.println("2. Insert at the beginning");
            System.out.println("3. Delete a node");
            System.out.println("4. Edit a node");
            System.out.println("5. Display the linked list");
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
                    System.out.print("Enter data to edit: ");
                    int oldData = scanner.nextInt();
                    System.out.print("Enter new data: ");
                    int newData = scanner.nextInt();
                    list.edit(oldData, newData);
                    break;
                case 5:
                    System.out.print("Linked List: ");
                    list.display();
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

