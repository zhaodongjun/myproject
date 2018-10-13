package com.bbd.yanoos.web.algorithm;

import java.util.LinkedList;

/**
 * Created by zhaodongjun on 2018/10/13 0013.
 */
public class LinkedListSolution {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

//        listNode.val=1;
//        listNode.next.val=2;
//        listNode.next.val=3;
//        listNode.next.val=4;
//        listNode.next.val=5;


//        System.out.println("list="+listNode.val);
        deleteNode(listNode);
        System.out.println(listNode);
//        ListNode listNode = list.;
////        deleteNode(listNode);
//        System.out.println(removeNthFromEnd(listNode, 2));
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        return null;
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
