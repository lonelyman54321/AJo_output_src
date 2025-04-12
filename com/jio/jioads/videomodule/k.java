/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.jio.jioads.videomodule;

import android.view.View;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public final class k
implements View.OnClickListener {
    public final /* synthetic */ s a;

    public /* synthetic */ k(s s7) {
        this.a = s7;
    }

    public final void onClick(View object) {
        object = "this$0";
        s s7 = this.a;
        Intrinsics.checkNotNullParameter(s7, (String)object);
        int n3 = s7.S;
        int n4 = -1;
        if (n3 != n4 || (n3 = (int)(s7.W ? 1 : 0)) != 0) {
            n3 = 0;
            object = null;
            s7.M(false);
        }
    }
}

