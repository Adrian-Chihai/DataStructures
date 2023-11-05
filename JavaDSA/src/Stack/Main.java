package Stack;


import java.util.Stack;
//stack = LIFO data structures (Last in first out)

//Stack methods that can be applied
//push method -> add an item on to the top of our Stack
//pop method ->  pop an item from the top of our Stack
//peek method -> look at the item from the top of our Stack
//empty method -> check if it's empty
//search method -> search an item

public class Main {
    public static void main(String[] args) {
        stack();
    }

    public static void stack() {
        Stack<String> games = new Stack<>();

        System.out.println("Is this stack empty -> " + games.empty());
        //add 2 items in this stack
        games.push("FIFA");
        games.push("CS2");

        //watch at first item
        //peek just looks at the first item
        System.out.println("What item is at the top of this stack -> " + games.peek());
        //remove first item
        //pop removes the first item
        System.out.println("We removed -> " + games.pop());

        System.out.println("What item is at the top of this stack -> " + games.peek());
        System.out.println("We removed -> " + games.pop());

        games.push("Minecraft"); // 1 -> 2 -> 3 -> 4
        System.out.println("First is -> " + games.peek());
        System.out.println("Minecraft pos -> " + games.search("Minecraft"));

        games.push("Sea if thieves"); // 1 -> 2 -> 3
        System.out.println("First is -> " + games.peek());
        System.out.println("Minecraft pos -> " + games.search("Minecraft"));

        games.push("Mafia II"); // 1 -> 2
        System.out.println("First is -> " + games.peek());
        System.out.println("Minecraft pos -> " + games.search("Minecraft"));

        games.push("Borderlands"); // 1
        System.out.println("First is -> " + games.peek());
    }
}
