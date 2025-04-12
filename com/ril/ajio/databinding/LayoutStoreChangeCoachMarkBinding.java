/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutStoreChangeCoachMarkBinding
implements BC3 {
    public final TextView exploreStores;
    public final ImageView ivAjioLogo;
    public final ImageView lcssmIvLogo;
    public final ConstraintLayout lcssmLayoutLogo;
    public final TextView lcssmTvInfo;
    public final TextView lcssmTvMsg;
    public final ImageView lsccmIvArrow;
    public final ConstraintLayout lsccmLayoutArc;
    public final View lsccmLayoutClear;
    public final ConstraintLayout lsccmVAjio;
    private final ConstraintLayout rootView;

    private LayoutStoreChangeCoachMarkBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, ImageView imageView3, ConstraintLayout constraintLayout3, View view, ConstraintLayout constraintLayout4) {
        this.rootView = constraintLayout;
        this.exploreStores = textView;
        this.ivAjioLogo = imageView;
        this.lcssmIvLogo = imageView2;
        this.lcssmLayoutLogo = constraintLayout2;
        this.lcssmTvInfo = textView2;
        this.lcssmTvMsg = textView3;
        this.lsccmIvArrow = imageView3;
        this.lsccmLayoutArc = constraintLayout3;
        this.lsccmLayoutClear = view;
        this.lsccmVAjio = constraintLayout4;
    }

    public static LayoutStoreChangeCoachMarkBinding bind(View object) {
        View view;
        int n3 = R$id.explore_stores;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.ivAjioLogo;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.lcssmIvLogo;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.lcssmLayoutLogo;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (ConstraintLayout)view;
                    if (object2 != null) {
                        n3 = R$id.lcssmTvInfo;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            n3 = R$id.lcssmTvMsg;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (TextView)view;
                            if (view6 != null) {
                                n3 = R$id.lsccmIvArrow;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (ImageView)view;
                                if (view7 != null) {
                                    View view8;
                                    n3 = R$id.lsccmLayoutArc;
                                    Object object3 = view = dd2_2.a(n3, object);
                                    object3 = (ConstraintLayout)view;
                                    if (object3 != null && (view8 = dd2_2.a(n3 = R$id.lsccmLayoutClear, object)) != null) {
                                        n3 = R$id.lsccmVAjio;
                                        Object object4 = view = dd2_2.a(n3, object);
                                        object4 = (ConstraintLayout)view;
                                        if (object4 != null) {
                                            Object object5 = object;
                                            object5 = (ConstraintLayout)((Object)object);
                                            LayoutStoreChangeCoachMarkBinding layoutStoreChangeCoachMarkBinding = new LayoutStoreChangeCoachMarkBinding((ConstraintLayout)((Object)object5), (TextView)view2, (ImageView)view3, (ImageView)view4, (ConstraintLayout)((Object)object2), (TextView)view5, (TextView)view6, (ImageView)view7, (ConstraintLayout)((Object)object3), view8, (ConstraintLayout)((Object)object4));
                                            return layoutStoreChangeCoachMarkBinding;
                                        }
                                    }
                                }
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

    public static LayoutStoreChangeCoachMarkBinding inflate(LayoutInflater layoutInflater) {
        return LayoutStoreChangeCoachMarkBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutStoreChangeCoachMarkBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_store_change_coach_mark;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutStoreChangeCoachMarkBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

