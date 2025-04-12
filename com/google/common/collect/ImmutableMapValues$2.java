/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMapValues;
import java.util.Map;

class ImmutableMapValues$2
extends ImmutableList {
    final /* synthetic */ ImmutableList val$entryList;

    public ImmutableMapValues$2(ImmutableMapValues immutableMapValues, ImmutableList immutableList) {
        this.val$entryList = immutableList;
    }

    public Object get(int n3) {
        return ((Map.Entry)this.val$entryList.get(n3)).getValue();
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.val$entryList.size();
    }
}

