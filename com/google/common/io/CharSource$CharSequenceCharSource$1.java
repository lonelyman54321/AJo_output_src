/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.io.CharSource$CharSequenceCharSource;
import java.util.Iterator;

class CharSource$CharSequenceCharSource$1
extends AbstractIterator {
    Iterator lines;
    final /* synthetic */ CharSource$CharSequenceCharSource this$0;

    public CharSource$CharSequenceCharSource$1(CharSource$CharSequenceCharSource iterator) {
        this.this$0 = iterator;
        Splitter splitter = CharSource$CharSequenceCharSource.access$100();
        iterator = ((CharSource$CharSequenceCharSource)((Object)iterator)).seq;
        this.lines = iterator = splitter.split((CharSequence)((Object)iterator)).iterator();
    }

    public String computeNext() {
        Object object = this.lines;
        boolean bl2 = object.hasNext();
        if (bl2) {
            object = (String)this.lines.next();
            Iterator iterator = this.lines;
            boolean bl3 = iterator.hasNext();
            if (bl3 || !(bl3 = ((String)object).isEmpty())) {
                return object;
            }
        }
        return (String)this.endOfData();
    }
}

