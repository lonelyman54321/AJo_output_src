/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.payment.fragment.e$a;
import com.ril.ajio.payment.view.NpsView;
import com.ril.ajio.payment.view.NpsView$a;
import kotlin.jvm.internal.Intrinsics;

public final class e
extends BottomSheetDialogFragment {
    public static final e$a Companion;
    public NpsView a;
    public ImageView b;
    public View c;
    public TextView d;
    public int e = -1;
    public View f;
    public final qo0_1 g;
    public final xe0_0 h;

    static {
        e$a e$a;
        Companion = e$a = new Object();
    }

    public e() {
        Object object = new qo0_1(this, 2);
        this.g = object;
        this.h = object = new xe0_0(this);
    }

    public final void onAttach(Context context) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        super.onAttach(context);
        context = this.getArguments();
        if (context != null) {
            int n3;
            string2 = "rating";
            int n4 = -1;
            this.e = n3 = context.getInt(string2, n4);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_nps_bottom_sheet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.fragment_nps_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.frNps;
        object = (NpsView)view.findViewById(n3);
        this.a = object;
        Object object2 = "frNps";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object = null;
        }
        Object object4 = this.h;
        object.setOnRatingClickListener((NpsView$a)object4);
        n3 = R$id.frIvClose;
        object = (ImageView)view.findViewById(n3);
        this.b = object;
        n3 = R$id.frvClose;
        object = view.findViewById(n3);
        this.c = object;
        n3 = R$id.frTvSubmit;
        object = (TextView)view.findViewById(n3);
        this.d = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("frVClose");
            n3 = 0;
            object = null;
        }
        object4 = this.g;
        object.setOnClickListener((View.OnClickListener)object4);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("frIvClose");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)object4);
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("frTvSubmit");
            n3 = 0;
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)object4);
        n3 = this.e;
        if (n3 >= 0) {
            object = this.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            ((NpsView)object3).H = n3 = this.e;
            ((NpsView)object3).u();
            ((NpsView)object3).J.setVisibility(8);
            object = ((NpsView)object3).L;
            object2 = null;
            object.setVisibility(0);
            object = ((NpsView)object3).K;
            object.setVisibility(0);
        }
        n3 = R$id.frLayoutContent;
        object = (LinearLayout)view.findViewById(n3);
        object3 = Looper.getMainLooper();
        object2 = new Handler((Looper)object3);
        object3 = new zs1_2((LinearLayout)object);
        long l2 = 300L;
        object2.postDelayed((Runnable)object3, l2);
        n3 = R$id.frvLayoutPostRating;
        object = view.findViewById(n3);
        this.f = object;
        object = this.getDialog();
        if (object != null) {
            object2 = new Object();
            object.setOnShowListener((DialogInterface.OnShowListener)object2);
        }
        n3 = R$id.frLayoutContent;
        view.findViewById(n3).bringToFront();
    }
}

