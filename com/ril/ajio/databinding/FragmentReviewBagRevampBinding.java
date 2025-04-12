/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentReviewBagRevampBinding
implements BC3 {
    public final RecyclerView frbRvItems;
    public final AjioTextView frbTvInfo;
    public final AjioTextView frbTvMessage;
    public final AjioTextView frbTvReviewBag;
    public final AjioTextView frbTvTitle;
    public final ImageView imvClose;
    private final LinearLayout rootView;

    private FragmentReviewBagRevampBinding(LinearLayout linearLayout, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, ImageView imageView) {
        this.rootView = linearLayout;
        this.frbRvItems = recyclerView;
        this.frbTvInfo = ajioTextView;
        this.frbTvMessage = ajioTextView2;
        this.frbTvReviewBag = ajioTextView3;
        this.frbTvTitle = ajioTextView4;
        this.imvClose = imageView;
    }

    public static FragmentReviewBagRevampBinding bind(View object) {
        View view;
        int n3 = R$id.frbRvItems;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            n3 = R$id.frbTvInfo;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.frbTvMessage;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.frbTvReviewBag;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.frbTvTitle;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.imvClose;
                            View view2 = view = dd2_2.a(n3, object);
                            view2 = (ImageView)view;
                            if (view2 != null) {
                                Object object7 = object;
                                object7 = (LinearLayout)object;
                                FragmentReviewBagRevampBinding fragmentReviewBagRevampBinding = new FragmentReviewBagRevampBinding((LinearLayout)object7, (RecyclerView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (ImageView)view2);
                                return fragmentReviewBagRevampBinding;
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

    public static FragmentReviewBagRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentReviewBagRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentReviewBagRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_review_bag_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentReviewBagRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

