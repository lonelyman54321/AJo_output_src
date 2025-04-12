/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R$id;
import androidx.compose.ui.platform.ViewLayer;
import kotlin.jvm.internal.Intrinsics;

public class DrawChildContainer
extends ViewGroup {
    public boolean a;

    public DrawChildContainer(Context context) {
        super(context);
        this.setClipChildren(false);
        int n3 = R$id.hide_in_inspector_tag;
        Boolean bl2 = Boolean.TRUE;
        this.setTag(n3, bl2);
    }

    public final void a(iL iL2, View view, long l2) {
        iL2 = Nf.a(iL2);
        super.drawChild((Canvas)iL2, view, l2);
    }

    public void dispatchDraw(Canvas canvas) {
        int n3 = super.getChildCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            View view = this.getChildAt(i3);
            String string2 = "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer";
            Intrinsics.checkNotNull(view, string2);
            view = (ViewLayer)view;
            boolean bl2 = view.h;
            if (!bl2) continue;
            n3 = 1;
            this.a = n3;
            try {
                super.dispatchDraw(canvas);
                break;
            }
            finally {
                this.a = false;
            }
        }
    }

    public int getChildCount() {
        int n3 = this.a;
        n3 = n3 != 0 ? super.getChildCount() : 0;
        return n3;
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }

    public final void onMeasure(int n3, int n4) {
        this.setMeasuredDimension(0, 0);
    }

    public final void requestLayout() {
    }
}

