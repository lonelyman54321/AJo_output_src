/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.base.Preconditions;
import com.google.common.escape.CharEscaperBuilder$CharArrayDecorator;
import com.google.common.escape.Escaper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class CharEscaperBuilder {
    private final Map map;
    private int max = -1;

    public CharEscaperBuilder() {
        HashMap hashMap;
        this.map = hashMap = new HashMap();
    }

    public CharEscaperBuilder addEscape(char c2, String string2) {
        Map map2 = this.map;
        Character c3 = Character.valueOf(c2);
        string2 = (String)Preconditions.checkNotNull(string2);
        map2.put(c3, string2);
        int n3 = this.max;
        if (c2 > n3) {
            this.max = c2;
        }
        return this;
    }

    public CharEscaperBuilder addEscapes(char[] cArray, String string2) {
        Preconditions.checkNotNull(string2);
        for (char c2 : cArray) {
            this.addEscape(c2, string2);
        }
        return this;
    }

    public char[][] toArray() {
        boolean bl2;
        int n3 = this.max + 1;
        char[][] cArrayArray = new char[n3][];
        Iterator iterator = this.map.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            Character c2 = (Character)object.getKey();
            char c3 = c2.charValue();
            object = ((String)object.getValue()).toCharArray();
            cArrayArray[c3] = (char[])object;
        }
        return cArrayArray;
    }

    public Escaper toEscaper() {
        char[][] cArray = this.toArray();
        CharEscaperBuilder$CharArrayDecorator charEscaperBuilder$CharArrayDecorator = new CharEscaperBuilder$CharArrayDecorator(cArray);
        return charEscaperBuilder$CharArrayDecorator;
    }
}

