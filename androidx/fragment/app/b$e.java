/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorSet
 */
package androidx.fragment.app;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;

public final class b$e {
    public static final b$e a;

    static {
        b$e b$e;
        a = b$e = new Object();
    }

    public final void a(AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long l2) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(l2);
    }
}

