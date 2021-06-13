package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			System.out.println("array overflow");
			Object[] newObjArray = new Object[size*2];
			for (int i = 0; i < size; i++) {
				newObjArray[i] = items[i];				
			} //end for loop
			items = newObjArray;
		}
		items[size] = item;
		size++;	//increment size index to the next available array entry
		return true;
	} //end of add method

	@Override
	public int getSize() {
		return size;
	} //end of getSize method

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException("Custom Array Index out of bounds condition encountered.");
		}
		return (T) items[index];
	} //end of get method
	
	public void displayItemsArray() {
		int i = 0;
		for (Object item : items) {
			System.out.println("item[" + i +  "]=" + item);
			i++;
		}
	} //end of displayItemsArray method
	
} //end of CustomArrayList class
