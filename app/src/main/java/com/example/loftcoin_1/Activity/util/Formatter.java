package com.example.loftcoin_1.Activity.util;
import androidx.annotation.NonNull;

public interface Formatter<T> {
    @NonNull
    String format(@NonNull T value);
}