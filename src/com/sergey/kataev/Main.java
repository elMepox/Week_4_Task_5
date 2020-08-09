package com.sergey.kataev;

import java.util.HashSet;
import java.util.Set;

public class Main {

    private static <E> Set<E> union(Set<E> firstSet, Set<E> secondSet){
        HashSet<E> unionSet = new HashSet<>(firstSet);
        unionSet.addAll(secondSet);
        return unionSet;
    }
    private static <E> Set<E> intersect(Set<E> firstSet, Set<E> secondSet){
        HashSet<E> intersectSet = new HashSet<>();
        for (E i : firstSet){
            if (secondSet.contains(i)){
                intersectSet.add(i);
            }
        }
        return intersectSet;
    }
    public static void main(String[] args) {
	    HashSet<Integer> firstSet = new HashSet<>();
	    firstSet.add(1);
	    firstSet.add(2);
	    firstSet.add(3);
	    firstSet.add(4);
	    HashSet<Integer> secondSet = new HashSet<>();
	    secondSet.add(3);
	    secondSet.add(4);
	    secondSet.add(5);
	    secondSet.add(6);
	    System.out.println("Множество А:");
	    for (Integer i : firstSet){
	        System.out.print(i + " ");
        }
	    System.out.println();
	    System.out.println("Множество B:");
	    for (Integer i : secondSet){
	        System.out.print(i + " ");
        }
	    System.out.println();

	    System.out.println("Множество AvB:");
	    for (Integer i : union(firstSet,secondSet)){
	        System.out.print(i + " ");
        }
	    System.out.println();

	    System.out.println("Множество A^B:");
	    for (Integer i : intersect(firstSet,secondSet)){
	        System.out.print(i + " ");
        }
	    System.out.println();






    }
}
