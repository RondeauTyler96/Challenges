package tdd.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tdd.model.BetterLinkedList.Node;

public class BetterLinkedListTest {

	@Test
	public void testAdd() {
		BetterLinkedList list = new BetterLinkedList(2);
		list.add(5);
		assertEquals(list.getTail().data, 5);
	}
	
	@Test
	public void testRemove() {
		BetterLinkedList list = new BetterLinkedList(2);
		list.add(5);
		list.add(10);
		list.add(12);
		list.remove(2);
		assertEquals(list.get(2).data, 12);
	}
	
	@Test
	public void testGet() {
		BetterLinkedList list = new BetterLinkedList(2);
		list.add(5);
		list.add(10);
		list.add(12);
		assertEquals(list.get(2).data, 10);
	}
	
	@Test
	public void testSet() {
		BetterLinkedList list = new BetterLinkedList(2);
		list.add(5);
		list.add(10);
		list.add(12);
		list.set(1, 12);
		assertEquals(list.get(1).data, 12);
	}
	
	@Test
	public void testPop() {
		BetterLinkedList list = new BetterLinkedList(2);
		Node expected = list.get(0);
		list.add(5);
		Node popped = list.pop();
		assertEquals(popped, expected);
	}
	
	@Test
	public void testPush() {
		BetterLinkedList list = new BetterLinkedList(2);
		list.add(5);
		list.add(10);
		list.add(12);
		list.push(25);
		assertEquals(list.getTail().data, 25);
	}

}
