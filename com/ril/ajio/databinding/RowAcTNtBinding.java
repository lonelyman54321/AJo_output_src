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

public final class RowAcTNtBinding
implements BC3 {
    public final TextView acDetailInfo;
    public final AppCompatImageView ntInfoIv;
    public final LinearLayout ntListHeader;
    private final ConstraintLayout rootView;
    public final TextView transferToBank;

    private RowAcTNtBinding(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, TextView textView2) {
        this.rootView = constraintLayout;
        this.acDetailInfo = textView;
        this.ntInfoIv = appCompatImageView;
        this.ntListHeader = linearLayout;
        this.transferToBank = textView2;
    }

    public static RowAcTNtBinding bind(View object) {
        View view;
        int n3 = R$id.ac_detail_info;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.nt_info_iv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AppCompatImageView)view;
            if (object2 != null) {
                n3 = R$id.nt_list_header;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.transfer_to_bank;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        RowAcTNtBinding rowAcTNtBinding = new RowAcTNtBinding((ConstraintLayout)((Object)object3), (TextView)view2, (AppCompatImageView)((Object)object2), (LinearLayout)view3, (TextView)view4);
                        return rowAcTNtBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowAcTNtBinding inflate(LayoutInflater layoutInflater) {
        return RowAcTNtBinding.inflate(layoutInflater, null, false);
    }

    public static RowAcTNtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_ac_t_nt;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAcTNtBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

