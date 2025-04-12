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

public final class RowCcAttachmentHistoryBinding
implements BC3 {
    public final LinearLayout attachParent;
    private final LinearLayout rootView;
    public final RecyclerView rvAttachments;
    public final TextView tvAttachmentLabel;
    public final TextView tvComments;
    public final TextView tvCommentsLabel;

    private RowCcAttachmentHistoryBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.attachParent = linearLayout2;
        this.rvAttachments = recyclerView;
        this.tvAttachmentLabel = textView;
        this.tvComments = textView2;
        this.tvCommentsLabel = textView3;
    }

    public static RowCcAttachmentHistoryBinding bind(View object) {
        View view;
        int n3 = R$id.attachParent;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.rv_attachments;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (RecyclerView)view;
            if (object2 != null) {
                n3 = R$id.tv_attachment_label;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.tv_comments;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.tv_comments_label;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            Object object3 = object;
                            object3 = (LinearLayout)object;
                            RowCcAttachmentHistoryBinding rowCcAttachmentHistoryBinding = new RowCcAttachmentHistoryBinding((LinearLayout)object3, (LinearLayout)view2, (RecyclerView)object2, (TextView)view3, (TextView)view4, (TextView)view5);
                            return rowCcAttachmentHistoryBinding;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcAttachmentHistoryBinding inflate(LayoutInflater layoutInflater) {
        return RowCcAttachmentHistoryBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcAttachmentHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_attachment_history;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcAttachmentHistoryBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

