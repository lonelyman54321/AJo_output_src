/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class c
implements hx0_2 {
    public final /* synthetic */ d a;

    public c(d d2) {
        this.a = d2;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (Pq1)object;
        object2 = (Number)object2;
        ((Number)object2).intValue();
        object3 = (b30_0)object3;
        int n3 = ((Number)object4).intValue();
        object4 = "$this$items";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x281;
        n3 = 128;
        if (n4 == n3 && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = this.a;
            n3 = 8;
            ((d)object).Ra((b30_0)object3, n3);
        }
        return Unit.a;
    }
}

