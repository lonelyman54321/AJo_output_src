/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.composethemeadapter;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

final class MdcTheme$MdcTheme$1
extends Lambda
implements Function2 {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2 $content;

    public MdcTheme$MdcTheme$1(Function2 function2, int n3) {
        this.$content = function2;
        this.$$dirty = n3;
        super(2);
    }

    public final void invoke(b30_0 b30_02, int n3) {
        int n4 = 2;
        if ((n3 &= 0xB) == n4 && (n3 = (int)(b30_02.h() ? 1 : 0)) != 0) {
            b30_02.D();
        } else {
            Object object = w60_0.a;
            MB2[] mB2Array = mz_0.a;
            long l2 = ((lZ)b30_02.j((H30)mB2Array)).d();
            OX oX = new OX(l2);
            object = ((nw0_1)object).c(oX);
            n4 = 1;
            mB2Array = new MB2[n4];
            mB2Array[0] = object;
            object = this.$content;
            int n7 = this.$$dirty >> 15 & 0x70 | 8;
            L30.b(mB2Array, (Function2)object, b30_02, n7);
        }
    }
}

