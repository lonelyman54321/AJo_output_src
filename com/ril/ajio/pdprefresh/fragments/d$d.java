/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import com.ril.ajio.pdprefresh.fragments.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class d$d
implements Function2 {
    public final /* synthetic */ d a;

    public d$d(d d2) {
        this.a = d2;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.a;
            n3 = 8;
            ((d)object2).Pa((b30_0)object, n3);
        }
        return Unit.a;
    }
}

