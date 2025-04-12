/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.PopupWindow
 *  android.widget.TextView
 */
package com.skydoves.balloon;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.Balloon$a;
import com.skydoves.balloon.radius.RadiusLayout;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class Balloon$showAlignTop$$inlined$show$1
implements Runnable {
    public final /* synthetic */ Balloon a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View[] c;
    public final /* synthetic */ Balloon d;
    public final /* synthetic */ View e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    public Balloon$showAlignTop$$inlined$show$1(Balloon balloon2, View view, View[] viewArray, Balloon balloon3, View view2, int n3, int n4) {
        this.a = balloon2;
        this.b = view;
        this.c = viewArray;
        this.d = balloon3;
        this.e = view2;
        this.f = n3;
        this.g = n4;
    }

    public final void run() {
        int n3;
        Balloon balloon2 = this.a;
        PopupWindow popupWindow = this.b;
        int n4 = balloon2.g((View)popupWindow);
        Object object = n4 != 0;
        if (n4 == 0) {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            Balloon$a balloon$a = balloon2.b;
            balloon$a.getClass();
            balloon2.f = n3 = 1;
            long l2 = balloon$a.K;
            long l3 = -1;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 != false) {
                balloon2.i(l2);
            }
            n3 = balloon2.o();
            yu_1 yu_12 = balloon2.c;
            String string2 = "binding.balloonCard";
            if (n3 != 0) {
                object = yu_12.d;
                Intrinsics.checkNotNullExpressionValue(object, string2);
                balloon2.t((ViewGroup)object);
            } else {
                object = yu_12.f;
                Intrinsics.checkNotNullExpressionValue(object, "binding.balloonText");
                RadiusLayout radiusLayout = yu_12.d;
                Intrinsics.checkNotNullExpressionValue((Object)radiusLayout, string2);
                balloon2.r((TextView)object, (View)radiusLayout);
            }
            object = yu_12.a;
            string2 = null;
            object.measure(0, 0);
            balloon$a.getClass();
            object = balloon2.d;
            int n7 = balloon2.n();
            object.setWidth(n7);
            n7 = balloon2.m();
            object.setHeight(n7);
            object = yu_12.f;
            n7 = -1;
            yu_12 = new FrameLayout.LayoutParams(n7, n7);
            object.setLayoutParams((ViewGroup.LayoutParams)yu_12);
            Balloon.d(balloon2, (View)popupWindow);
            balloon2.q();
            Balloon.c(balloon2);
            popupWindow = this.c;
            n3 = ((View[])popupWindow).length;
            popupWindow = Arrays.copyOf(popupWindow, n3);
            balloon$a.getClass();
            balloon$a.getClass();
            Balloon.b(balloon2);
            Balloon.e(balloon2);
            balloon2 = this.d;
            popupWindow = balloon2.d;
            balloon$a = balloon2.b;
            n4 = balloon$a.U;
            object = this.e;
            int n8 = object.getMeasuredWidth() / 2;
            n7 = balloon2.n() / 2;
            n8 -= n7;
            n7 = this.f;
            n8 = (n8 + n7) * n4;
            int n10 = -balloon2.m();
            n4 = object.getMeasuredHeight();
            n10 -= n4;
            n4 = this.g;
            popupWindow.showAsDropDown((View)object, n8, n10 += n4);
        }
    }
}

