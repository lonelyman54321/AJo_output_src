/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CompactHashMap;
import com.google.common.collect.CompactHashMap$Itr;
import com.google.common.collect.CompactHashMap$MapEntry;
import java.util.Map;

class CompactHashMap$2
extends CompactHashMap$Itr {
    final /* synthetic */ CompactHashMap this$0;

    public CompactHashMap$2(CompactHashMap compactHashMap) {
        this.this$0 = compactHashMap;
        super(compactHashMap, null);
    }

    public Map.Entry getOutput(int n3) {
        CompactHashMap compactHashMap = this.this$0;
        CompactHashMap$MapEntry compactHashMap$MapEntry = new CompactHashMap$MapEntry(compactHashMap, n3);
        return compactHashMap$MapEntry;
    }
}

