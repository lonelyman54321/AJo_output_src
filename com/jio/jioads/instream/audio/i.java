/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.jio.jioads.instream.audio;

import android.view.View;
import com.jio.jioads.common.b;
import com.jio.jioads.common.c;
import com.jio.jioads.common.f;
import com.jio.jioads.instream.audio.d;
import com.jio.jioads.instream.audio.j;
import com.jio.jioads.utils.e;
import kotlin.jvm.internal.Intrinsics;

public final class i
implements View.OnClickListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ String b;

    public /* synthetic */ i(j j3, String string2) {
        this.a = j3;
        this.b = string2;
    }

    public final void onClick(View object) {
        int n3;
        j j3 = this.a;
        Intrinsics.checkNotNullParameter(j3, "this$0");
        b b2 = j3.b;
        Object object2 = j3.o();
        if (object2 == null) {
            object2 = "";
        }
        String string2 = object2;
        String string3 = j3.p();
        object2 = j3.i;
        Object object3 = null;
        if (object2 != null) {
            n3 = object2.getWidth();
            object2 = n3;
        } else {
            n3 = 0;
            object2 = null;
        }
        String string4 = String.valueOf(object2);
        object2 = j3.i;
        if (object2 != null) {
            n3 = object2.getHeight();
            object3 = n3;
        }
        String string5 = String.valueOf(object3);
        d d2 = new d(j3);
        int n4 = e.i(j3.e);
        object3 = j3.c;
        String string6 = this.b;
        object2 = object;
        object = new f(b2, (c)object3, null, string6, null, null, string2, string3, string4, string5, d2, n4);
        ((f)object).a();
    }
}

