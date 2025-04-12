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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class QuickviewListItemLuxeBinding
implements BC3 {
    public final TextView brandSizeTv;
    public final TextView productBrandTv;
    public final TextView productPrice;
    public final RecyclerView productRv;
    public final TextView productTitleTv;
    public final LinearLayout qtyContainer;
    public final TextView qtyInfo;
    public final TextView qtyText;
    private final ConstraintLayout rootView;
    public final LinearLayout sizeContainer;
    public final TextView sizeInfo;
    public final TextView sizeText;
    public final TextView viewProduct;

    private QuickviewListItemLuxeBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, RecyclerView recyclerView, TextView textView4, LinearLayout linearLayout, TextView textView5, TextView textView6, LinearLayout linearLayout2, TextView textView7, TextView textView8, TextView textView9) {
        this.rootView = constraintLayout;
        this.brandSizeTv = textView;
        this.productBrandTv = textView2;
        this.productPrice = textView3;
        this.productRv = recyclerView;
        this.productTitleTv = textView4;
        this.qtyContainer = linearLayout;
        this.qtyInfo = textView5;
        this.qtyText = textView6;
        this.sizeContainer = linearLayout2;
        this.sizeInfo = textView7;
        this.sizeText = textView8;
        this.viewProduct = textView9;
    }

    public static QuickviewListItemLuxeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.brand_size_tv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.productBrandTv;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (TextView)view2;
            if (view4 != null) {
                n3 = R$id.productPrice;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.productRv;
                    Object object2 = view2 = dd2_2.a(n3, view);
                    object2 = (RecyclerView)view2;
                    if (object2 != null) {
                        n3 = R$id.productTitleTv;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (TextView)view2;
                        if (view6 != null) {
                            n3 = R$id.qtyContainer;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (LinearLayout)view2;
                            if (view7 != null) {
                                n3 = R$id.qtyInfo;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (TextView)view2;
                                if (view8 != null) {
                                    n3 = R$id.qtyText;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (TextView)view2;
                                    if (view9 != null) {
                                        n3 = R$id.sizeContainer;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (LinearLayout)view2;
                                        if (view10 != null) {
                                            n3 = R$id.sizeInfo;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (TextView)view2;
                                            if (view11 != null) {
                                                n3 = R$id.sizeText;
                                                View view12 = view2 = dd2_2.a(n3, view);
                                                view12 = (TextView)view2;
                                                if (view12 != null) {
                                                    n3 = R$id.viewProduct;
                                                    View view13 = view2 = dd2_2.a(n3, view);
                                                    view13 = (TextView)view2;
                                                    if (view13 != null) {
                                                        Object object3 = view;
                                                        object3 = (ConstraintLayout)view;
                                                        QuickviewListItemLuxeBinding quickviewListItemLuxeBinding = new QuickviewListItemLuxeBinding((ConstraintLayout)((Object)object3), (TextView)view3, (TextView)view4, (TextView)view5, (RecyclerView)object2, (TextView)view6, (LinearLayout)view7, (TextView)view8, (TextView)view9, (LinearLayout)view10, (TextView)view11, (TextView)view12, (TextView)view13);
                                                        return quickviewListItemLuxeBinding;
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

    public static QuickviewListItemLuxeBinding inflate(LayoutInflater layoutInflater) {
        return QuickviewListItemLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static QuickviewListItemLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.quickview_list_item_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return QuickviewListItemLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

