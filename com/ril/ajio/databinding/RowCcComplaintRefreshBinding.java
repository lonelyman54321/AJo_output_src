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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcComplaintRefreshBinding
implements BC3 {
    public final RecyclerView complaintListView;
    public final TextView recentIssues;
    private final LinearLayout rootView;
    public final TextView viewMore;

    private RowCcComplaintRefreshBinding(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.complaintListView = recyclerView;
        this.recentIssues = textView;
        this.viewMore = textView2;
    }

    public static RowCcComplaintRefreshBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.complaint_list_view;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.recentIssues, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.view_more, object)) != null) {
            object = (LinearLayout)object;
            RowCcComplaintRefreshBinding rowCcComplaintRefreshBinding = new RowCcComplaintRefreshBinding((LinearLayout)object, recyclerView, textView2, textView);
            return rowCcComplaintRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcComplaintRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcComplaintRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcComplaintRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_complaint_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcComplaintRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

