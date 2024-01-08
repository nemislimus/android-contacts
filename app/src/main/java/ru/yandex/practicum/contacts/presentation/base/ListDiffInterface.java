package ru.yandex.practicum.contacts.presentation.base;

//Создаём интерфейс с методом theSameAs, который является единственным отличием в статических методах Адаптеров
public interface ListDiffInterface<T> {


    boolean theSameAs(T t);

    boolean equals(Object o);
}
