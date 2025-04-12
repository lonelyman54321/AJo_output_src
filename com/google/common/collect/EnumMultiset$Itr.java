/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.EnumMultiset;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class EnumMultiset$Itr
implements Iterator {
    int index = 0;
    final /* synthetic */ EnumMultiset this$0;
    int toRemove = -1;

    public EnumMultiset$Itr(EnumMultiset enumMultiset) {
        this.this$0 = enumMultiset;
    }

    public boolean hasNext() {
        Enum[] enumArray;
        int n3;
        int n4;
        while ((n4 = this.index) < (n3 = (enumArray = EnumMultiset.access$000(this.this$0)).length)) {
            int[] nArray = EnumMultiset.access$100(this.this$0);
            n4 = nArray[n3 = this.index];
            if (n4 > 0) {
                return true;
            }
            this.index = ++n3;
        }
        return false;
    }

    public Object next() {
        int n3 = this.hasNext();
        if (n3 != 0) {
            n3 = this.index;
            Object object = this.output(n3);
            int n4 = this.index;
            this.toRemove = n4++;
            this.index = n4;
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public abstract Object output(int var1);

    public void remove() {
        Object object;
        int n3 = this.toRemove;
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        CollectPreconditions.checkRemove(n3 != 0);
        object = EnumMultiset.access$100(this.this$0);
        int n4 = this.toRemove;
        n3 = object[n4];
        if (n3 > 0) {
            EnumMultiset.access$210(this.this$0);
            object = this.this$0;
            int[] nArray = EnumMultiset.access$100((EnumMultiset)object);
            int n7 = this.toRemove;
            long l2 = nArray[n7];
            EnumMultiset.access$322((EnumMultiset)object, l2);
            object = EnumMultiset.access$100(this.this$0);
            n4 = this.toRemove;
            object[n4] = 0;
        }
        this.toRemove = -1;
    }
}

