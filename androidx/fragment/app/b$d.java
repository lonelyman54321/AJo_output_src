/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorSet
 */
package androidx.fragment.app;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;

public final class b$d {
    public static final b$d a;

    static {
        b$d b$d;
        a = b$d = new Object();
    }

    public final long a(AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        return animatorSet.getTotalDuration();
    }
}

