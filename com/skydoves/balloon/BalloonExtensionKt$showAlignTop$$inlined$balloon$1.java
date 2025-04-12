/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.skydoves.balloon;

import android.view.View;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon$showAlignTop$$inlined$show$1;
import kotlin.jvm.internal.Intrinsics;

public final class BalloonExtensionKt$showAlignTop$$inlined$balloon$1
implements Runnable {
    public final /* synthetic */ Balloon a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public BalloonExtensionKt$showAlignTop$$inlined$balloon$1(Balloon balloon2, View view, int n3, int n4) {
        this.a = balloon2;
        this.b = view;
        this.c = n3;
        this.d = n4;
    }

    public final void run() {
        Balloon balloon2 = this.a;
        balloon2.getClass();
        Object object = "anchor";
        View view = this.b;
        Intrinsics.checkNotNullParameter(view, (String)object);
        View[] viewArray = new View[]{view};
        Object object2 = viewArray[0];
        boolean bl2 = balloon2.g((View)object2);
        if (bl2) {
            Balloon$showAlignTop$$inlined$show$1 balloon$showAlignTop$$inlined$show$1;
            int n3 = this.c;
            int n4 = this.d;
            object = balloon$showAlignTop$$inlined$show$1;
            balloon$showAlignTop$$inlined$show$1 = new Balloon$showAlignTop$$inlined$show$1(balloon2, (View)object2, viewArray, balloon2, view, n3, n4);
            object2.post((Runnable)balloon$showAlignTop$$inlined$show$1);
        } else {
            object2 = balloon2.b;
            object2.getClass();
        }
    }
}

