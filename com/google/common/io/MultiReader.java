/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.io.CharSource;
import java.io.Reader;
import java.util.Iterator;

class MultiReader
extends Reader {
    private Reader current;
    private final Iterator it;

    public MultiReader(Iterator iterator) {
        this.it = iterator;
        this.advance();
    }

    private void advance() {
        this.close();
        Object object = this.it;
        boolean bl2 = object.hasNext();
        if (bl2) {
            this.current = object = ((CharSource)this.it.next()).openStream();
        }
    }

    public void close() {
        Reader reader = this.current;
        if (reader != null) {
            try {
                reader.close();
            }
            finally {
                this.current = null;
            }
        }
    }

    public int read(char[] cArray, int n3, int n4) {
        Preconditions.checkNotNull(cArray);
        Reader reader = this.current;
        int n7 = -1;
        if (reader == null) {
            return n7;
        }
        int n8 = reader.read(cArray, n3, n4);
        if (n8 == n7) {
            this.advance();
            return this.read(cArray, n3, n4);
        }
        return n8;
    }

    public boolean ready() {
        boolean bl2;
        Reader reader = this.current;
        if (reader != null && (bl2 = reader.ready())) {
            bl2 = true;
        } else {
            bl2 = false;
            reader = null;
        }
        return bl2;
    }

    public long skip(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object >= 0;
        String string2 = "n is negative";
        Preconditions.checkArgument(bl2, string2);
        if (object > 0) {
            Reader reader;
            while ((reader = this.current) != null) {
                long l7 = reader.skip(l2);
                long l8 = l7 - l3;
                Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 > 0) {
                    return l7;
                }
                this.advance();
            }
        }
        return l3;
    }
}

