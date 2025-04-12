/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Collections2$PermutationIterator
extends AbstractIterator {
    final int[] c;
    int j;
    final List list;
    final int[] o;

    public Collections2$PermutationIterator(List object) {
        Object object2 = new ArrayList(object);
        this.list = object2;
        int n3 = object.size();
        object2 = new int[n3];
        this.c = (int[])object2;
        object = new int[n3];
        this.o = (int[])object;
        Arrays.fill((int[])object2, 0);
        Arrays.fill((int[])object, 1);
        this.j = -1 >>> 1;
    }

    public void calculateNextPermutation() {
        block4: {
            int n3;
            int n4;
            int n7;
            Object object = this.list;
            this.j = n7 = object.size() + -1;
            int n8 = -1;
            if (n7 == n8) {
                return;
            }
            n7 = 0;
            object = null;
            while (true) {
                int[] nArray;
                int[] nArray2;
                if ((n4 = (nArray2 = this.o)[n3 = this.j] + (n8 = (nArray = this.c)[n3])) < 0) {
                    this.switchDirection();
                    continue;
                }
                int n10 = n3 + 1;
                if (n4 != n10) break;
                if (n3 != 0) {
                    ++n7;
                    this.switchDirection();
                    continue;
                }
                break block4;
                break;
            }
            List list = this.list;
            n8 = n3 - n8 + n7;
            n3 = n3 - n4 + n7;
            Collections.swap(list, n8, n3);
            object = this.c;
            n8 = this.j;
            object[n8] = n4;
        }
    }

    public List computeNext() {
        int n3 = this.j;
        if (n3 <= 0) {
            return (List)this.endOfData();
        }
        ImmutableList immutableList = ImmutableList.copyOf((Collection)this.list);
        this.calculateNextPermutation();
        return immutableList;
    }

    public void switchDirection() {
        int n3;
        int[] nArray = this.o;
        int n4 = this.j;
        nArray[n4] = n3 = -nArray[n4];
        this.j = n4 += -1;
    }
}

