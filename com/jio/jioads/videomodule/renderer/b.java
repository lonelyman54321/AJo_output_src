/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
package com.jio.jioads.videomodule.renderer;

import android.widget.TextView;
import com.jio.jioads.videomodule.renderer.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b
extends Lambda
implements Function0 {
    public final /* synthetic */ e c;

    public b(e e2) {
        this.c = e2;
        super(0);
    }

    public final Object invoke() {
        TextView textView = this.c.d.C;
        if (textView != null) {
            textView.requestFocus();
        }
        return Unit.a;
    }
}

