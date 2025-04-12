/*
 * Decompiled with CFR 0.152.
 */
package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

public final class ComponentActivity$a
implements n {
    public final /* synthetic */ ComponentActivity a;

    public ComponentActivity$a(ComponentActivity componentActivity) {
        this.a = componentActivity;
    }

    public final void k(mu1_1 mu1_12, i$a i$a) {
        Intrinsics.checkNotNullParameter(mu1_12, "source");
        Intrinsics.checkNotNullParameter((Object)i$a, "event");
        mu1_12 = this.a;
        ComponentActivity.access$ensureViewModelStore((ComponentActivity)mu1_12);
        ((ComponentActivity)mu1_12).getLifecycle().c(this);
    }
}

