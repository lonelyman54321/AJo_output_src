/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.parser;

import java.util.AbstractCollection;
import java.util.ArrayList;

public class ParseErrorList
extends ArrayList {
    private static final int INITIAL_CAPACITY = 16;
    private final int initialCapacity;
    private final int maxSize;

    public ParseErrorList(int n3, int n4) {
        super(n3);
        this.initialCapacity = n3;
        this.maxSize = n4;
    }

    public ParseErrorList(ParseErrorList parseErrorList) {
        int n3 = parseErrorList.initialCapacity;
        int n4 = parseErrorList.maxSize;
        this(n3, n4);
    }

    public static ParseErrorList noTracking() {
        ParseErrorList parseErrorList = new ParseErrorList(0, 0);
        return parseErrorList;
    }

    public static ParseErrorList tracking(int n3) {
        ParseErrorList parseErrorList = new ParseErrorList(16, n3);
        return parseErrorList;
    }

    public boolean canAddError() {
        int n3;
        int n4 = ((AbstractCollection)this).size();
        n4 = n4 < (n3 = this.maxSize) ? 1 : 0;
        return n4 != 0;
    }

    public Object clone() {
        return super.clone();
    }

    public int getMaxSize() {
        return this.maxSize;
    }
}

