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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.RvpBottomSheetItemBinding;

public final class FragmentIncentivizeKnowMoreBinding
implements BC3 {
    public final ConstraintLayout clBottom;
    public final ConstraintLayout clToolbar;
    public final RvpBottomSheetItemBinding includeItemDetails;
    public final AppCompatImageView ivBack;
    public final ConstraintLayout parentRvpLayout;
    private final ConstraintLayout rootView;
    public final AjioTextView rvpOkayBtn;
    public final AjioTextView tvReturnTitle;

    private FragmentIncentivizeKnowMoreBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RvpBottomSheetItemBinding rvpBottomSheetItemBinding, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout4, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.clBottom = constraintLayout2;
        this.clToolbar = constraintLayout3;
        this.includeItemDetails = rvpBottomSheetItemBinding;
        this.ivBack = appCompatImageView;
        this.parentRvpLayout = constraintLayout4;
        this.rvpOkayBtn = ajioTextView;
        this.tvReturnTitle = ajioTextView2;
    }

    public static FragmentIncentivizeKnowMoreBinding bind(View object) {
        View view;
        int n3 = R$id.cl_bottom;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.cl_toolbar;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ConstraintLayout)view;
            if (object3 != null && (view = dd2_2.a(n3 = R$id.include_item_details, object)) != null) {
                RvpBottomSheetItemBinding rvpBottomSheetItemBinding = RvpBottomSheetItemBinding.bind(view);
                n3 = R$id.iv_back;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AppCompatImageView)view;
                if (object4 != null) {
                    n3 = R$id.parent_rvp_layout;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (ConstraintLayout)view;
                    if (object5 != null) {
                        n3 = R$id.rvp_okay_btn;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.tv_returnTitle;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                Object object8 = object;
                                object8 = (ConstraintLayout)((Object)object);
                                FragmentIncentivizeKnowMoreBinding fragmentIncentivizeKnowMoreBinding = new FragmentIncentivizeKnowMoreBinding((ConstraintLayout)((Object)object8), (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), rvpBottomSheetItemBinding, (AppCompatImageView)((Object)object4), (ConstraintLayout)((Object)object5), (AjioTextView)object6, (AjioTextView)object7);
                                return fragmentIncentivizeKnowMoreBinding;
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

    public static FragmentIncentivizeKnowMoreBinding inflate(LayoutInflater layoutInflater) {
        return FragmentIncentivizeKnowMoreBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentIncentivizeKnowMoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_incentivize_know_more;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentIncentivizeKnowMoreBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

