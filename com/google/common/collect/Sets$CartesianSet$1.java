/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;

class Sets$CartesianSet$1
extends ImmutableList {
    final /* synthetic */ ImmutableList val$axes;

    public Sets$CartesianSet$1(ImmutableList immutableList) {
        this.val$axes = immutableList;
    }

    public List get(int n3) {
        return ((ImmutableSet)this.val$axes.get(n3)).asList();
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.val$axes.size();
    }
}

