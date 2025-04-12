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

public final class RowAcRecentActivityBinding
implements BC3 {
    public final View apDivider;
    public final TextView ntListHeader;
    private final LinearLayout rootView;

    private RowAcRecentActivityBinding(LinearLayout linearLayout, View view, TextView textView) {
        this.rootView = linearLayout;
        this.apDivider = view;
        this.ntListHeader = textView;
    }

    public static RowAcRecentActivityBinding bind(View object) {
        TextView textView;
        int n3 = R$id.ap_divider;
        View view = dd2_2.a(n3, object);
        if (view != null && (textView = (TextView)dd2_2.a(n3 = R$id.nt_list_header, object)) != null) {
            object = (LinearLayout)object;
            RowAcRecentActivityBinding rowAcRecentActivityBinding = new RowAcRecentActivityBinding((LinearLayout)object, view, textView);
            return rowAcRecentActivityBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowAcRecentActivityBinding inflate(LayoutInflater layoutInflater) {
        return RowAcRecentActivityBinding.inflate(layoutInflater, null, false);
    }

    public static RowAcRecentActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_ac_recent_activity;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAcRecentActivityBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

