/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.FragmentManager$l;
import kotlin.jvm.internal.Intrinsics;

public final class f$a {
    public final FragmentManager$l a;
    public final boolean b;

    public f$a(FragmentManager$l fragmentManager$l, boolean bl2) {
        Intrinsics.checkNotNullParameter(fragmentManager$l, "callback");
        this.a = fragmentManager$l;
        this.b = bl2;
    }
}

