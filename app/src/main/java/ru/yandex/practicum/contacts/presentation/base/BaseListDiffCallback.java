package ru.yandex.practicum.contacts.presentation.base;

import androidx.recyclerview.widget.DiffUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

// Создаём класс с обобщённой логикой для замены статического класса ListDiffCallback в адаптерах
public class BaseListDiffCallback<S extends ListDiffInterface<S>> extends DiffUtil.ItemCallback<S>{


    @Override
    public boolean areItemsTheSame(@NonNull S oldItem, @NonNull S newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull S oldItem, @NonNull S newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull S oldItem, @NonNull S newItem) {
        return newItem;
    }
}
