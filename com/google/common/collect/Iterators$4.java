/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class Iterators$4
extends UnmodifiableIterator {
    final /* synthetic */ Iterator val$iterator;
    final /* synthetic */ boolean val$pad;
    final /* synthetic */ int val$size;

    public Iterators$4(Iterator iterator, int n3, boolean bl2) {
        this.val$iterator = iterator;
        this.val$size = n3;
        this.val$pad = bl2;
    }

    public boolean hasNext() {
        return this.val$iterator.hasNext();
    }

    public List next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            Iterator iterator;
            int n7;
            int n8;
            n3 = this.val$size;
            Object object = new Object[n3];
            for (n8 = 0; n8 < (n7 = this.val$size) && (n7 = (int)((iterator = this.val$iterator).hasNext() ? 1 : 0)) != 0; ++n8) {
                iterator = this.val$iterator.next();
                object[n8] = iterator;
            }
            for (n7 = n8; n7 < (n4 = this.val$size); ++n7) {
                n4 = 0;
                object[n7] = null;
            }
            object = Collections.unmodifiableList(Arrays.asList(object));
            n7 = (int)(this.val$pad ? 1 : 0);
            if (n7 == 0 && n8 != (n7 = this.val$size)) {
                object = object.subList(0, n8);
            }
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }
}

