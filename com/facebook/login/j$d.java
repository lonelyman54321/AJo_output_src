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
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

public final class j$d
implements rb3_2 {
    public final mw0_0 a;
    public final Activity b;

    public j$d(mw0_0 mw0_02) {
        Intrinsics.checkNotNullParameter(mw0_02, "fragment");
        this.a = mw0_02;
        mw0_02 = mw0_02.a();
        this.b = mw0_02;
    }

    public final Activity q() {
        return this.b;
    }

    public final void startActivityForResult(Intent intent, int n3) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        mw0_0 mw0_02 = this.a;
        Fragment fragment = mw0_02.a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, n3);
        } else {
            mw0_02 = mw0_02.b;
            if (mw0_02 != null) {
                mw0_02.startActivityForResult(intent, n3);
            }
        }
    }
}

