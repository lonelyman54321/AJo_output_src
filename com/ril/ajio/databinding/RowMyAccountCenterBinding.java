/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowMyAccountCenterBinding
implements BC3 {
    public final AjioTextView featureInfo;
    public final AjioTextView featureName;
    public final ImageView ivAjioChevronRightAccount;
    private final ConstraintLayout rootView;
    public final AjioTextView tvNewTag;

    private RowMyAccountCenterBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, ImageView imageView, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.featureInfo = ajioTextView;
        this.featureName = ajioTextView2;
        this.ivAjioChevronRightAccount = imageView;
        this.tvNewTag = ajioTextView3;
    }

    public static RowMyAccountCenterBinding bind(View object) {
        View view;
        int n3 = R$id.feature_info;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.feature_name;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.iv_ajio_chevron_right_account;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (ImageView)view;
                if (view2 != null) {
                    n3 = R$id.tv_new_tag;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        RowMyAccountCenterBinding rowMyAccountCenterBinding = new RowMyAccountCenterBinding((ConstraintLayout)((Object)object5), (AjioTextView)object2, (AjioTextView)object3, (ImageView)view2, (AjioTextView)object4);
                        return rowMyAccountCenterBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowMyAccountCenterBinding inflate(LayoutInflater layoutInflater) {
        return RowMyAccountCenterBinding.inflate(layoutInflater, null, false);
    }

    public static RowMyAccountCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_my_account_center;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowMyAccountCenterBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

