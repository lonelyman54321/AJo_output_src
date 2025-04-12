/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.FieldSet$FieldDescriptorLite;
import com.google.protobuf.SmallSortedMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class SmallSortedMap$1
extends SmallSortedMap {
    public SmallSortedMap$1(int n3) {
        super(n3, null);
    }

    public void makeImmutable() {
        int n3 = this.isImmutable();
        if (n3 == 0) {
            boolean bl2;
            Object object;
            Map.Entry entry;
            int n4;
            Iterator iterator = null;
            for (n3 = 0; n3 < (n4 = this.getNumArrayEntries()); ++n3) {
                entry = this.getArrayEntryAt(n3);
                object = (FieldSet$FieldDescriptorLite)entry.getKey();
                bl2 = object.isRepeated();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
            iterator = this.getOverflowEntries().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                entry = (Map.Entry)iterator.next();
                object = (FieldSet$FieldDescriptorLite)entry.getKey();
                bl2 = object.isRepeated();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
        }
        super.makeImmutable();
    }
}

