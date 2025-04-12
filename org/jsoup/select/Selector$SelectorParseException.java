/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.select;

public class Selector$SelectorParseException
extends IllegalStateException {
    public Selector$SelectorParseException(String string2) {
        super(string2);
    }

    public Selector$SelectorParseException(String string2, Object ... objectArray) {
        string2 = String.format(string2, objectArray);
        super(string2);
    }

    public Selector$SelectorParseException(Throwable throwable, String string2, Object ... objectArray) {
        string2 = String.format(string2, objectArray);
        super(string2, throwable);
    }
}

