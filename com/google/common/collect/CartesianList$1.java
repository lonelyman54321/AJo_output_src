/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.CartesianList;
import com.google.common.collect.ImmutableList;
import java.util.List;

class CartesianList$1
extends ImmutableList {
    final /* synthetic */ CartesianList this$0;
    final /* synthetic */ int val$index;

    public CartesianList$1(CartesianList cartesianList, int n3) {
        this.this$0 = cartesianList;
        this.val$index = n3;
    }

    public Object get(int n3) {
        int n4 = this.size();
        Preconditions.checkElementIndex(n3, n4);
        CartesianList cartesianList = this.this$0;
        int n7 = this.val$index;
        n4 = CartesianList.access$100(cartesianList, n7, n3);
        return ((List)CartesianList.access$000(this.this$0).get(n3)).get(n4);
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return CartesianList.access$000(this.this$0).size();
    }
}

