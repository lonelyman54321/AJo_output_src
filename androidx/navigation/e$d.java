/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.e;
import androidx.navigation.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e$d
extends Lambda
implements Function0 {
    public final /* synthetic */ e c;

    public e$d(e e2) {
        this.c = e2;
        super(0);
    }

    public final Object invoke() {
        e e2 = this.c;
        e2.getClass();
        Intrinsics.checkNotNullParameter(e2.a, "context");
        Intrinsics.checkNotNullParameter(e2.v, "navigatorProvider");
        m m2 = new Object();
        return m2;
    }
}

