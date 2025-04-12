/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCcFaqAnswerRefreshBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout rowCcFaqAnswerLayout;
    public final AjioTextView rowCcFaqAnswerTv;
    public final TextView rowCcFaqTv;

    private RowCcFaqAnswerRefreshBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, TextView textView) {
        this.rootView = linearLayout;
        this.rowCcFaqAnswerLayout = linearLayout2;
        this.rowCcFaqAnswerTv = ajioTextView;
        this.rowCcFaqTv = textView;
    }

    public static RowCcFaqAnswerRefreshBinding bind(View object) {
        TextView textView;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.row_cc_faq_answer_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (textView = (TextView)dd2_2.a(n3 = R$id.row_cc_faq_tv, object)) != null) {
            object = new RowCcFaqAnswerRefreshBinding((LinearLayout)object2, (LinearLayout)object2, ajioTextView, textView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowCcFaqAnswerRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcFaqAnswerRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcFaqAnswerRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_faq_answer_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcFaqAnswerRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

