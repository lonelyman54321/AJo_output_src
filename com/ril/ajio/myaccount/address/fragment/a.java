/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.myaccount.address.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.myaccount.address.fragment.a$a;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends BottomSheetDialogFragment {
    public static final a$a Companion;
    public pk2_1 a;
    public final boolean b;
    public final mk2_2 c;

    static {
        a$a a$a;
        Companion = a$a = new Object();
    }

    public a() {
        mk2_2 mk2_22;
        boolean bl2;
        this.b = bl2 = og1_1.c();
        this.c = mk2_22 = new mk2_2(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = this.b;
        if (n3 != 0) {
            n3 = R$layout.fragment_reset_address_confirmation_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.fragment_reset_address_confirmation_revamp;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.fracrIvClose;
        object = (ImageView)view.findViewById(n3);
        Object object2 = this.c;
        object.setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.fracrVClose;
        view.findViewById(n3).setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.fracrTvCancel;
        ((TextView)view.findViewById(n3)).setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.fracrTvReset;
        ((TextView)view.findViewById(n3)).setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.parent_layout;
        object = (ConstraintLayout)view.findViewById(n3);
        Object object3 = Looper.getMainLooper();
        object2 = new Handler(object3);
        object3 = new nk2_2((ConstraintLayout)((Object)object));
        long l2 = 100;
        object2.postDelayed((Runnable)object3, l2);
        object = this.getDialog();
        if (object != null) {
            object2 = new Object();
            object.setOnShowListener((DialogInterface.OnShowListener)object2);
        }
        n3 = R$id.fracrLayoutContent;
        view.findViewById(n3).bringToFront();
    }
}

