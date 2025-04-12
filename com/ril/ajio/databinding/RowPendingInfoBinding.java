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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowPendingInfoBinding
implements BC3 {
    public final TextView additionalInfo;
    public final View apDivider;
    public final AppCompatImageView awForward;
    public final TextView awViewHistoryTv;
    public final TextView ntListHeader;
    public final AppCompatImageView pendingForwardIv;
    public final View pointBG;
    private final ConstraintLayout rootView;
    public final LinearLayout tncContainer;

    private RowPendingInfoBinding(ConstraintLayout constraintLayout, TextView textView, View view, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView2, View view2, LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.additionalInfo = textView;
        this.apDivider = view;
        this.awForward = appCompatImageView;
        this.awViewHistoryTv = textView2;
        this.ntListHeader = textView3;
        this.pendingForwardIv = appCompatImageView2;
        this.pointBG = view2;
        this.tncContainer = linearLayout;
    }

    public static RowPendingInfoBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.additional_info;
        View view3 = view2 = dd2_2.a(n3, object);
        view3 = (TextView)view2;
        if (view3 != null && (view = dd2_2.a(n3 = R$id.ap_divider, object)) != null) {
            n3 = R$id.aw_forward;
            Object object2 = view2 = dd2_2.a(n3, object);
            object2 = (AppCompatImageView)view2;
            if (object2 != null) {
                n3 = R$id.aw_view_history_tv;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (TextView)view2;
                if (view4 != null) {
                    n3 = R$id.nt_list_header;
                    View view5 = view2 = dd2_2.a(n3, object);
                    view5 = (TextView)view2;
                    if (view5 != null) {
                        View view6;
                        n3 = R$id.pending_forward_iv;
                        Object object3 = view2 = dd2_2.a(n3, object);
                        object3 = (AppCompatImageView)view2;
                        if (object3 != null && (view6 = dd2_2.a(n3 = R$id.pointBG, object)) != null) {
                            n3 = R$id.tnc_container;
                            View view7 = view2 = dd2_2.a(n3, object);
                            view7 = (LinearLayout)view2;
                            if (view7 != null) {
                                Object object4 = object;
                                object4 = (ConstraintLayout)((Object)object);
                                RowPendingInfoBinding rowPendingInfoBinding = new RowPendingInfoBinding((ConstraintLayout)((Object)object4), (TextView)view3, view, (AppCompatImageView)((Object)object2), (TextView)view4, (TextView)view5, (AppCompatImageView)((Object)object3), view6, (LinearLayout)view7);
                                return rowPendingInfoBinding;
                            }
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

    public static RowPendingInfoBinding inflate(LayoutInflater layoutInflater) {
        return RowPendingInfoBinding.inflate(layoutInflater, null, false);
    }

    public static RowPendingInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pending_info;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPendingInfoBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

