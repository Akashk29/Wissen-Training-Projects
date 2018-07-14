package com;

import java.util.*;
import java.util.function.*;

public class ItemsLib {

	<T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<T>();
		for (T item : list) {
			if (predicate.test(item))
				result.add(item);

		}
		return result;
	}

	<T,E>List<E> map(List<T> list, Function<T, E> function) {

		List<E> result = new ArrayList<E>();
		for (T item : list) {

			result.add(function.apply(item));

		}

		return result;
	}

	<T> void forEach(List<T> list, Consumer<T> consumer) {

		//List<E> result = new ArrayList<E>();
		for (T item : list) {
             consumer.accept(item);
		}

		//return result;
	}

}
