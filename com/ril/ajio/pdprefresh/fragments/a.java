/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class a
implements hx0_2 {
    public final /* synthetic */ d a;
    public final /* synthetic */ lt1 b;

    public a(lt1 lt12, d d2) {
        this.a = d2;
        this.b = lt12;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3;
        object = (Pq1)object;
        object2 = (Number)object2;
        int n4 = ((Number)object2).intValue();
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        int n7 = ((Number)object4).intValue();
        Object object5 = "$this$items";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        int n8 = n7 & 0x70;
        if (n8 == 0) {
            n8 = (int)(object3.c(n4) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x2D1) == (n3 = 144) && (n8 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            n8 = 0x208 | (n7 &= 0x70);
            object4 = this.a;
            object5 = this.b;
            ((d)object4).Qa((lt1)object5, n4, (b30_0)object3, n8);
        }
        return Unit.a;
    }
}

