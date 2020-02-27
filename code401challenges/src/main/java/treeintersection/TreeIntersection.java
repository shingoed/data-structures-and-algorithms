package treeintersection;

//src: https://www.geeksforgeeks.org/print-common-nodes-in-two-binary-search-trees/

import java.util.Stack;

public class TreeIntersection {

        // A BST node
        static class Node
        {
            int key;
            Node left, right;
        }

        static Node newNode(int ele)
        {
            Node temp = new Node();
            temp.key = ele;
            temp.left = null;
            temp.right = null;
            return temp;
        }


        static void printCommon(Node root1, Node root2)
        {
            Stack<Node> stack1 = new Stack<Node> ();
            Stack<Node> s1 = new Stack<Node> ();
            Stack<Node> s2 = new Stack<Node> ();

            while (true)
            {

                if (root1 != null)
                {
                    s1.push(root1);
                    root1 = root1.left;
                }

                else if (root2 != null)
                {
                    s2.push(root2);
                    root2 = root2.left;
                }


                else if (!s1.isEmpty() && !s2.isEmpty())
                {
                    root1 = s1.peek();
                    root2 = s2.peek();

                    if (root1.key == root2.key)
                    {
                        System.out.print(root1.key + " ");
                        s1.pop();
                        s2.pop();

                        root1 = root1.right;
                        root2 = root2.right;
                    }

                    else if (root1.key < root2.key)
                    {
                        s1.pop();
                        root1 = root1.right;

                        root2 = null;
                    }
                    else if (root1.key > root2.key)
                    {
                        s2.pop();
                        root2 = root2.right;
                        root1 = null;
                    }
                }

                else break;
            }
        }


    }