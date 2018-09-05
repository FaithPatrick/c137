package com.morty.c137.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

public class Util {
    public Util() {
    }
    public static final boolean isEmpty(Object obj) {
        return obj == null ? true : (obj instanceof String ? "".equals(String.valueOf(obj).trim()) : (obj.getClass().isArray() ? Array.getLength(obj) == 0 : (obj instanceof Collection ? ((Collection)obj).isEmpty() : (obj instanceof Map ? ((Map)obj).isEmpty() : false))));
    }
}
