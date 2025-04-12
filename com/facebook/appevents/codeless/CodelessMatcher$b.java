/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.facebook.appevents.codeless;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

public final class CodelessMatcher$b {
    public final WeakReference a;
    public final String b;

    public CodelessMatcher$b(View view, String string2) {
        WeakReference<View> weakReference;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(string2, "viewMapKey");
        this.a = weakReference = new WeakReference<View>(view);
        this.b = string2;
    }

    public final View a() {
        WeakReference weakReference = this.a;
        weakReference = weakReference != null ? (View)weakReference.get() : null;
        return weakReference;
    }
}

