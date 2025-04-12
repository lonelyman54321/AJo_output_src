/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import com.ril.ajio.kmm.shared.util.CommonFlow$watch$1;
import com.ril.ajio.kmm.shared.util.CommonFlow$watch$2;
import java.io.Closeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class CommonFlow
implements es0_2 {
    private final es0_2 origin;

    public CommonFlow(es0_2 es0_22) {
        Intrinsics.checkNotNullParameter(es0_22, "origin");
        this.origin = es0_22;
    }

    public Object collect(fs0_2 fs0_22, f80_0 f80_02) {
        return this.origin.collect(fs0_22, f80_02);
    }

    public final Closeable watch(Function1 object) {
        Intrinsics.checkNotNullParameter(object, "block");
        xl1_2 xl1_22 = mm0.a();
        Object object2 = new CommonFlow$watch$1((Function1)object, null);
        object = new vt0_2(this, (Function2)object2);
        object2 = ir0_2.a;
        object2 = d.a(bg1_1.a.plus(xl1_22));
        rs0_2 rs0_22 = new rs0_2((vt0_2)object, null);
        Ae3.d((i90_0)object2, null, null, rs0_22, 3);
        object = new CommonFlow$watch$2(xl1_22);
        return object;
    }
}

