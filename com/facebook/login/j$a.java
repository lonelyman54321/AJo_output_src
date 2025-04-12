/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 */
package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

public final class j$a
implements rb3_2 {
    public final Activity a;

    public j$a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }

    public final Activity q() {
        return this.a;
    }

    public final void startActivityForResult(Intent intent, int n3) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.a.startActivityForResult(intent, n3);
    }
}

