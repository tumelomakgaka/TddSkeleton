package com.develogical;

import org.junit.Test;

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
	public void shouldBeAbleToAddThingsToList() {
		String element="";
		NewList newList=new NewList();
		newList.addElement(element);
		assertThat(newList.isEmpty(),is(false));
	}

	@Test
	public void retrieveItemsFromList() {
		NewList newList=new NewList();
		newList.addElement("element");
		String retrievedElement = newList.getItem();
		assertThat(retrievedElement,is("element"));
	}

	@Test
	public void mostRecentItemShouldBeFirst() {
		newList.addElement("element");
		newList.addElement("element2");
		String retrievedElement = newList.getItem();
		assertThat(retrievedElement,is("element2"));
	}


}
