/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.flexbox;

import com.google.android.flexbox.FlexboxHelper$1;

class FlexboxHelper$Order
implements Comparable {
    int index;
    int order;

    private FlexboxHelper$Order() {
    }

    public /* synthetic */ FlexboxHelper$Order(FlexboxHelper$1 flexboxHelper$1) {
        this();
    }

    public int compareTo(FlexboxHelper$Order flexboxHelper$Order) {
        int n3 = this.order;
        int n4 = flexboxHelper$Order.order;
        if (n3 != n4) {
            return n3 - n4;
        }
        n3 = this.index;
        int n7 = flexboxHelper$Order.index;
        return n3 - n7;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Order{order=");
        int n3 = this.order;
        stringBuilder.append(n3);
        stringBuilder.append(", index=");
        n3 = this.index;
        return tu.a(stringBuilder, n3, '}');
    }
}

