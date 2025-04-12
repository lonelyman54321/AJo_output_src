/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.EnumMultiset;
import com.google.common.collect.EnumMultiset$2;
import com.google.common.collect.Multisets$AbstractEntry;

class EnumMultiset$2$1
extends Multisets$AbstractEntry {
    final /* synthetic */ EnumMultiset$2 this$1;
    final /* synthetic */ int val$index;

    public EnumMultiset$2$1(EnumMultiset$2 enumMultiset$2, int n3) {
        this.this$1 = enumMultiset$2;
        this.val$index = n3;
    }

    public int getCount() {
        int[] nArray = EnumMultiset.access$100(this.this$1.this$0);
        int n3 = this.val$index;
        return nArray[n3];
    }

    public Enum getElement() {
        Enum[] enumArray = EnumMultiset.access$000(this.this$1.this$0);
        int n3 = this.val$index;
        return enumArray[n3];
    }
}

