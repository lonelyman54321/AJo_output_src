/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package androidx.compose.ui.tooling;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.o;
import kotlin.jvm.internal.Intrinsics;

public final class ComposeViewAdapter$c
implements zs2_1 {
    public final o a;
    public final ys2_0 b;

    public ComposeViewAdapter$c() {
        o o3;
        Object object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        this.a = o3 = new o(this, false);
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = new ys2_0(this);
        Bundle bundle = new Bundle();
        ((ys2_0)object).b(bundle);
        this.b = object;
        object = i$b.RESUMED;
        o3.h((i$b)((Object)object));
    }

    public final i getLifecycle() {
        return this.a;
    }

    public final xs2_1 getSavedStateRegistry() {
        return this.b.b;
    }
}

