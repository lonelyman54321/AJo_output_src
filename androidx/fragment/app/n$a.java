/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.fragment.app.b$c;
import kotlin.jvm.internal.Intrinsics;

public class n$a {
    public boolean a;
    public boolean b;

    public boolean a() {
        return this instanceof b$c;
    }

    public void b(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
    }

    public void c(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
    }

    public void d(uu_0 uu_02, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(uu_02, "backEvent");
        Intrinsics.checkNotNullParameter(viewGroup, "container");
    }

    public void e(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
    }
}

