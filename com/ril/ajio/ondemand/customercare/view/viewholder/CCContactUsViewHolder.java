/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class CCContactUsViewHolder
extends uv_2
implements View.OnClickListener {
    private final TextView mContactNumberOneTv;
    private final TextView mContactNumberTwoTv;

    public CCContactUsViewHolder(View view, i82_0 object) {
        TextView textView;
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, (i82_0)object);
        int n3 = R$id.row_cc_contactus_lbl_email;
        view.findViewById(n3).setOnClickListener((View.OnClickListener)this);
        object = z40_0.Companion;
        AJIOApplication.Companion.getClass();
        Object object2 = AJIOApplication$a.a();
        object.getClass();
        object = z40$a.a((Context)object2).a.b("customer_number_1");
        object2 = z40$a.a((Context)AJIOApplication$a.a()).a.b("customer_number_2");
        int n4 = R$id.row_cc_contactus_tv_number_one;
        this.mContactNumberOneTv = textView = (TextView)view.findViewById(n4);
        int n7 = R$id.row_cc_contactus_tv_number_two;
        view = (TextView)view.findViewById(n7);
        this.mContactNumberTwoTv = view;
        n7 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        int n8 = 8;
        if (n7 != 0) {
            textView.setVisibility(n8);
        } else {
            textView.setVisibility(0);
            textView.setText((CharSequence)object);
            textView.setOnClickListener((View.OnClickListener)this);
        }
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 != 0) {
            view.setVisibility(n8);
        } else {
            view.setVisibility(0);
            view.setText((CharSequence)object2);
            view.setOnClickListener((View.OnClickListener)this);
        }
    }

    public void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        Object object2 = this.getMOnCCClickListener();
        if (object2 == null) {
            return;
        }
        int n4 = object.getId();
        if (n4 == (n3 = R$id.row_cc_contactus_lbl_email)) {
            object = this.getMOnCCClickListener();
            Intrinsics.checkNotNull(object);
            object2 = "customercare@ajio.com";
            int n7 = 10;
            object.onViewItemClick(object2, n7);
        } else {
            n3 = R$id.row_cc_contactus_tv_number_one;
            int n8 = 11;
            if (n4 == n3) {
                object = this.getMOnCCClickListener();
                Intrinsics.checkNotNull(object);
                object2 = ((Object)this.mContactNumberOneTv.getText()).toString();
                object.onViewItemClick(object2, n8);
            } else {
                n3 = R$id.row_cc_contactus_tv_number_two;
                if (n4 == n3) {
                    object = this.getMOnCCClickListener();
                    Intrinsics.checkNotNull(object);
                    object2 = ((Object)this.mContactNumberTwoTv.getText()).toString();
                    object.onViewItemClick(object2, n8);
                }
            }
        }
    }

    public void setData(Object object, int n3) {
    }
}

