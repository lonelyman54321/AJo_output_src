/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.payment.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.payment.fragment.b$a;
import kotlin.jvm.internal.Intrinsics;

public final class b
extends BottomSheetDialogFragment {
    public static final b$a Companion;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public ma2_1 f;
    public DialogInterface.OnDismissListener g;

    static {
        b$a b$a;
        Companion = b$a = new Object();
    }

    public final void onAttach(Context context) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        super.onAttach(context);
        context = this.getArguments();
        if (context != null) {
            float f5;
            float f6;
            this.a = f6 = context.getFloat("TOTAL_EARNED", 0.0f);
            this.b = f6 = context.getFloat("AJIO_WALLET", 0.0f);
            this.c = f6 = context.getFloat("LR", 0.0f);
            this.d = f6 = context.getFloat("R1POINTS", 0.0f);
            string2 = "TAARA_WALLET";
            this.e = f5 = context.getFloat(string2, 0.0f);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_earned_points_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        float f5;
        int n3 = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n4 = R$id.fepbsTvEarnedPoints;
        bundle = view.findViewById(n4);
        Object object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
        bundle = (TextView)bundle;
        Object object2 = qz2_0.u(this.a);
        String string2 = "You Earned ";
        Object object3 = new StringBuilder(string2);
        ((StringBuilder)object3).append((String)object2);
        object2 = ((StringBuilder)object3).toString();
        bundle.setText((CharSequence)object2);
        n4 = R$id.fepbsLayoutContent;
        bundle = (LinearLayout)view.findViewById(n4);
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new yw0_1((LinearLayout)bundle, this);
        long l2 = 300L;
        object2.postDelayed((Runnable)object3, l2);
        float f6 = this.b;
        Object object4 = 0;
        float f7 = 0.0f;
        object2 = null;
        float f8 = f6 - 0.0f;
        n4 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
        if (n4 > 0) {
            n4 = R$id.fepbsTvWallet;
            bundle = (TextView)view.findViewById(n4);
            f5 = this.b;
            object3 = qz2_0.u(f5);
            bundle.setText((CharSequence)object3);
            n4 = R$id.fepbsTvWalletHeader;
            bundle = (TextView)view.findViewById(n4);
            object3 = new j4_0(this, n3);
            bundle.setOnClickListener((View.OnClickListener)object3);
            n4 = R$id.fepbsLayoutAW;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.B((View)bundle);
            n4 = R$id.pointsVSep1;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.B((View)bundle);
        } else {
            n4 = R$id.fepbsLayoutAW;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.i((View)bundle);
            n4 = R$id.pointsVSep1;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.i((View)bundle);
        }
        f6 = this.c;
        float f11 = f6 - 0.0f;
        n4 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
        if (n4 > 0) {
            n4 = R$id.fepbsTvLR;
            bundle = (TextView)view.findViewById(n4);
            f5 = this.c;
            object3 = qz2_0.u(f5);
            bundle.setText((CharSequence)object3);
            n4 = R$id.fepbsLayoutLR;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.B((View)bundle);
            n4 = R$id.pointsVSep2;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.B((View)bundle);
        } else {
            n4 = R$id.fepbsLayoutLR;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.i((View)bundle);
            n4 = R$id.pointsVSep2;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.i((View)bundle);
        }
        n4 = R$id.fepbsTvR1Header;
        bundle = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
        bundle = (TextView)bundle;
        f5 = this.e;
        float f12 = f5 - 0.0f;
        float f14 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (f14 > 0) {
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            object3 = "taaraWalletName";
            object2 = ((ao0_0)object2).b((String)object3);
            bundle.setText((CharSequence)object2);
            n4 = R$id.fepbsTvR1;
            bundle = (TextView)view.findViewById(n4);
            f7 = this.e;
            object2 = qz2_0.u(f7);
            bundle.setText((CharSequence)object2);
            n4 = R$id.fepbsLayoutR1;
            bundle = view.findViewById(n4);
            Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
            ai0_2.B((View)bundle);
        } else {
            f5 = this.d;
            float f15 = f5 - 0.0f;
            object4 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (object4 > 0) {
                object4 = R$string.in_r1_points;
                object2 = hv3_0.K(object4);
                bundle.setText((CharSequence)object2);
                n4 = R$id.fepbsTvR1;
                bundle = (TextView)view.findViewById(n4);
                f7 = this.d;
                object2 = qz2_0.u(f7);
                bundle.setText((CharSequence)object2);
                n4 = R$id.fepbsLayoutR1;
                bundle = view.findViewById(n4);
                Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
                ai0_2.B((View)bundle);
            } else {
                n4 = R$id.fepbsLayoutR1;
                bundle = view.findViewById(n4);
                Intrinsics.checkNotNullExpressionValue(bundle, (String)object);
                ai0_2.i((View)bundle);
            }
        }
        n4 = R$id.fepbsIvClose;
        bundle = (ImageView)view.findViewById(n4);
        object = new K4(this, n3);
        bundle.setOnClickListener((View.OnClickListener)object);
        bundle = this.getDialog();
        if (bundle != null) {
            zw0_1 zw0_12 = new zw0_1(this);
            bundle.setOnShowListener((DialogInterface.OnShowListener)zw0_12);
        }
        n4 = R$id.fepbsLayoutContent;
        view.findViewById(n4).bringToFront();
    }
}

