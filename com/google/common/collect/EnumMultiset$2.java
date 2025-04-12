/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.EnumMultiset;
import com.google.common.collect.EnumMultiset$2$1;
import com.google.common.collect.EnumMultiset$Itr;
import com.google.common.collect.Multiset$Entry;

class EnumMultiset$2
extends EnumMultiset$Itr {
    final /* synthetic */ EnumMultiset this$0;

    public EnumMultiset$2(EnumMultiset enumMultiset) {
        this.this$0 = enumMultiset;
        super(enumMultiset);
    }

    public Multiset$Entry output(int n3) {
        EnumMultiset$2$1 enumMultiset$2$1 = new EnumMultiset$2$1(this, n3);
        return enumMultiset$2$1;
    }
}

