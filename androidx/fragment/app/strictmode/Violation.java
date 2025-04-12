/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

public abstract class Violation
extends RuntimeException {
    public final Fragment a;

    public Violation(Fragment fragment, String string2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super(string2);
        this.a = fragment;
    }
}

