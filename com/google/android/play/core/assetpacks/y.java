/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.ar;
import com.google.android.play.core.assetpacks.internal.as;
import com.google.android.play.core.assetpacks.internal.aw;
import com.google.android.play.core.assetpacks.u;
import kotlin.jvm.internal.Intrinsics;

public final class y
implements as {
    private final aw a;

    public y(aw aw2) {
        this.a = aw2;
    }

    public final Object a() {
        Object object = ((u)this.a).b();
        Intrinsics.checkNotNullParameter(object, "context");
        object = ni3_1.i(object);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(context)");
        ar.a(object);
        return object;
    }
}

