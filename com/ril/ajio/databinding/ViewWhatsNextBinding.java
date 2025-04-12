/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewWhatsNextBinding
implements BC3 {
    public final AjioTextView exchangeConfirmTvTitle;
    public final AjioImageView imv1;
    public final AjioImageView imv2;
    public final AjioImageView imv3;
    public final AjioImageView imv4;
    public final AjioTextView line1;
    public final AjioTextView line2;
    public final AjioTextView line3;
    public final AjioTextView line4;
    public final LinearLayout llLine1;
    public final LinearLayout llLine2;
    public final LinearLayout llLine3;
    public final LinearLayout llLine4;
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;

    private ViewWhatsNextBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioImageView ajioImageView3, AjioImageView ajioImageView4, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.exchangeConfirmTvTitle = ajioTextView;
        this.imv1 = ajioImageView;
        this.imv2 = ajioImageView2;
        this.imv3 = ajioImageView3;
        this.imv4 = ajioImageView4;
        this.line1 = ajioTextView2;
        this.line2 = ajioTextView3;
        this.line3 = ajioTextView4;
        this.line4 = ajioTextView5;
        this.llLine1 = linearLayout2;
        this.llLine2 = linearLayout3;
        this.llLine3 = linearLayout4;
        this.llLine4 = linearLayout5;
        this.recyclerView = recyclerView;
    }

    public static ViewWhatsNextBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.exchange_confirm_tv_title;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.imv1;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioImageView)view2;
            if (object3 != null) {
                n3 = R$id.imv2;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioImageView)view2;
                if (object4 != null) {
                    n3 = R$id.imv3;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioImageView)view2;
                    if (object5 != null) {
                        n3 = R$id.imv4;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioImageView)view2;
                        if (object6 != null) {
                            n3 = R$id.line1;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.line2;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.line3;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.line4;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.ll_line1;
                                            View view3 = view2 = dd2_2.a(n3, view);
                                            view3 = (LinearLayout)view2;
                                            if (view3 != null) {
                                                n3 = R$id.ll_line2;
                                                View view4 = view2 = dd2_2.a(n3, view);
                                                view4 = (LinearLayout)view2;
                                                if (view4 != null) {
                                                    n3 = R$id.ll_line3;
                                                    View view5 = view2 = dd2_2.a(n3, view);
                                                    view5 = (LinearLayout)view2;
                                                    if (view5 != null) {
                                                        n3 = R$id.ll_line4;
                                                        View view6 = view2 = dd2_2.a(n3, view);
                                                        view6 = (LinearLayout)view2;
                                                        if (view6 != null) {
                                                            n3 = R$id.recycler_view;
                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                            object11 = (RecyclerView)view2;
                                                            if (object11 != null) {
                                                                View view7 = view;
                                                                view7 = (LinearLayout)view;
                                                                ViewWhatsNextBinding viewWhatsNextBinding = new ViewWhatsNextBinding((LinearLayout)view7, (AjioTextView)object2, (AjioImageView)((Object)object3), (AjioImageView)((Object)object4), (AjioImageView)((Object)object5), (AjioImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5, (LinearLayout)view6, (RecyclerView)object11);
                                                                return viewWhatsNextBinding;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ViewWhatsNextBinding inflate(LayoutInflater layoutInflater) {
        return ViewWhatsNextBinding.inflate(layoutInflater, null, false);
    }

    public static ViewWhatsNextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_whats_next;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewWhatsNextBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

