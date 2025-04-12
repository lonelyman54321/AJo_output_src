/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import com.ril.ajio.pdprefresh.fragments.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class e$b
implements Function2 {
    public final /* synthetic */ e a;

    public e$b(e e2) {
        this.a = e2;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            e e2 = this.a;
            object = null;
            ah0_1 ah0_12 = new ah0_1(e2, 0);
            yh0_0 yh0_02 = e2.Pa();
            yi2_1 yi2_12 = e2.h;
            n4 = 1;
            kv_2 kv_22 = new kv_2(e2, n4);
            int n7 = 4160;
            Rg0.c(ah0_12, yh0_02, yi2_12, e2, kv_22, (b30_0)object3, n7);
        }
        return Unit.a;
    }
}

