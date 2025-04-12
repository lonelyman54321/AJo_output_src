/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.RowAwCashInfoBinding;

public final class RowAwAjioCashBinding
implements BC3 {
    public final RowAwCashInfoBinding awInfoCash;
    public final RowAwCashInfoBinding awInfoPoint;
    private final ConstraintLayout rootView;

    private RowAwAjioCashBinding(ConstraintLayout constraintLayout, RowAwCashInfoBinding rowAwCashInfoBinding, RowAwCashInfoBinding rowAwCashInfoBinding2) {
        this.rootView = constraintLayout;
        this.awInfoCash = rowAwCashInfoBinding;
        this.awInfoPoint = rowAwCashInfoBinding2;
    }

    public static RowAwAjioCashBinding bind(View object) {
        Object object2;
        int n3 = R$id.aw_info_cash;
        Object object3 = dd2_2.a(n3, object);
        if (object3 != null) {
            object2 = RowAwCashInfoBinding.bind(object3);
            int n4 = R$id.aw_info_point;
            Object object4 = dd2_2.a(n4, object);
            if (object4 != null) {
                object3 = RowAwCashInfoBinding.bind(object4);
                object = (ConstraintLayout)((Object)object);
                object4 = new RowAwAjioCashBinding((ConstraintLayout)((Object)object), (RowAwCashInfoBinding)object2, (RowAwCashInfoBinding)object3);
                return object4;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowAwAjioCashBinding inflate(LayoutInflater layoutInflater) {
        return RowAwAjioCashBinding.inflate(layoutInflater, null, false);
    }

    public static RowAwAjioCashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_aw_ajio_cash;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAwAjioCashBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

