/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.order.imps;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.myaccount.order.imps.c$a;
import kotlin.jvm.internal.Intrinsics;

public final class c
extends C51 {
    public static final c$a Companion;
    public String f;

    static {
        c$a c$a;
        Companion = c$a = new Object();
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            object = this.requireArguments();
            String string2 = "ifscCode";
            object = object.getString(string2);
            this.f = object;
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        rc1_2 rc1_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)rc1_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.ifsc_confirm_layout_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.close_button;
        object2 = (AjioAspectRatioImageView)object.findViewById(n3);
        int n4 = R$id.tv_ifsc_code;
        Object object3 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object3, "findViewById(...)");
        object3 = (TextView)object3;
        int n7 = R$id.tv_submit;
        TextView textView = (TextView)object.findViewById(n7);
        int n8 = R$id.tv_cancel;
        object = (TextView)object.findViewById(n8);
        String string2 = this.f;
        object3.setText((CharSequence)string2);
        if (object2 != null) {
            n8 = 1;
            object3 = new vk_2(this, n8);
            object2.setOnClickListener((View.OnClickListener)object3);
        }
        if (object != null) {
            object2 = new sc1_2(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if (textView != null) {
            object = new tc1_2(this);
            textView.setOnClickListener((View.OnClickListener)object);
        }
    }
}

