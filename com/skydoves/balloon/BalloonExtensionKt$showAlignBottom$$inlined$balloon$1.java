/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.skydoves.balloon;

import android.view.View;
import com.skydoves.balloon.Balloon;

public final class BalloonExtensionKt$showAlignBottom$$inlined$balloon$1
implements Runnable {
    public final /* synthetic */ Balloon a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public BalloonExtensionKt$showAlignBottom$$inlined$balloon$1(Balloon balloon2, View view, int n3, int n4) {
        this.a = balloon2;
        this.b = view;
        this.c = n3;
        this.d = n4;
    }

    public final void run() {
        int n3 = this.c;
        int n4 = this.d;
        Balloon balloon2 = this.a;
        View view = this.b;
        balloon2.s(view, n3, n4);
    }
}

