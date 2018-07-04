package com.develogical;

import org.junit.Test;

import java.io.InvalidObjectException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ExampleTest {
//	@Test
//	public void canAnswerTheUniversalQuestion() {
//		assertThat(new Example().answer(), is(42));
//	}
	NewList newList=new NewList();
	@Test
	public void isListEmptyWhenInitialised() {
		assertThat(new NewList().isEmpty(),is(true));
	}

	@Test
	public void shouldBeAbleToAddThingsToList() throws InvalidObjectException {
		String element="a";
		NewList newList=new NewList();
		newList.addElement(element);
		assertThat(newList.isEmpty(),is(false));
	}

	@Test
	public void retrieveItemsFromList() throws InvalidObjectException {
		NewList newList=new NewList();
		newList.addElement("element");
		String retrievedElement = newList.getItem();
		assertThat(retrievedElement,is("element"));
	}

	@Test(expected = InvalidObjectException.class)
	public void nullIsAddedToTheList() throws InvalidObjectException {
		newList.addElement(null);
	}

	@Test(expected = InvalidObjectException.class)
	public void invalidTypeArgumentToTheList() throws InvalidObjectException {
		newList.addElement("");
	}

	@Test
	public void moveDuplicateUp() throws InvalidObjectException {
		newList.addElement("element");
		newList.addElement("element2");
		newList.addElement("element");
		assertThat(newList.getItem(),is("element"));
	}

	@Test
	public void uniqueListItems() throws InvalidObjectException {
		newList.addElement("element");
		newList.addElement("element");
		assertThat(newList.elementList.size(),is(1));
	}

}
