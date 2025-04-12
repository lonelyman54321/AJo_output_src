/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.imps;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.myaccount.order.imps.b$a;
import kotlin.jvm.internal.Intrinsics;

public final class b
extends a51_0 {
    public static final b$a Companion;

    static {
        b$a b$a;
        Companion = b$a = new Object();
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        lc1_2 lc1_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)lc1_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.ifsc_info_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = z40_0.Companion;
        object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.b("ifsc_validation_url");
        Object object3 = z40$a.a((Context)AJIOApplication$a.a()).a.b("ifsc_validation_site");
        int n3 = R$id.close_button;
        Object object4 = (AjioAspectRatioImageView)object.findViewById(n3);
        int n4 = R$id.tv_find_ifsc;
        View view = object.findViewById(n4);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        boolean n7 = TextUtils.isEmpty((CharSequence)object3);
        if (!n7) {
            string2 = "FIND IFSC CODE ON ";
            object3 = string2.concat((String)object3);
            view.setText((CharSequence)object3);
        }
        if (object4 != null) {
            int n8 = 1;
            object3 = new rd_0(this, n8);
            object4.setOnClickListener((View.OnClickListener)object3);
        }
        int n10 = R$id.parent_layout;
        object = (ConstraintLayout)object.findViewById(n10);
        object4 = Looper.getMainLooper();
        object3 = new Handler((Looper)object4);
        object4 = new mc1_2(object, 0);
        object3.postDelayed((Runnable)object4, (long)100);
        object = new td_0(1, this, object2);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

