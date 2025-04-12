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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowBulletedListBinding
implements BC3 {
    public final ConstraintLayout clMainLayout;
    private final ConstraintLayout rootView;
    public final AjioTextView tvDesc;
    public final AjioTextView tvNumber;

    private RowBulletedListBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.clMainLayout = constraintLayout2;
        this.tvDesc = ajioTextView;
        this.tvNumber = ajioTextView2;
    }

    public static RowBulletedListBinding bind(View object) {
        AjioTextView ajioTextView;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.tv_desc;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_number, object)) != null) {
            object = new RowBulletedListBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), ajioTextView2, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowBulletedListBinding inflate(LayoutInflater layoutInflater) {
        return RowBulletedListBinding.inflate(layoutInflater, null, false);
    }

    public static RowBulletedListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_bulleted_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowBulletedListBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

