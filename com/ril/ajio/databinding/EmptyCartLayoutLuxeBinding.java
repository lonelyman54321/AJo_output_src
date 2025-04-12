/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class EmptyCartLayoutLuxeBinding
implements BC3 {
    public final TextView addFromWishlist;
    public final TextView bagEmptyHeaderTv;
    public final TextView cartEmptyContinueShopping;
    public final TextView cartEmptyInfoTv;
    public final RecyclerView cartEmptyWishListRv;
    public final LinearLayout emptyCartProductContainer;
    public final TextView loginBtn;
    private final ConstraintLayout rootView;
    public final ImageView userDummy;

    private EmptyCartLayoutLuxeBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView5, ImageView imageView) {
        this.rootView = constraintLayout;
        this.addFromWishlist = textView;
        this.bagEmptyHeaderTv = textView2;
        this.cartEmptyContinueShopping = textView3;
        this.cartEmptyInfoTv = textView4;
        this.cartEmptyWishListRv = recyclerView;
        this.emptyCartProductContainer = linearLayout;
        this.loginBtn = textView5;
        this.userDummy = imageView;
    }

    public static EmptyCartLayoutLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.addFromWishlist;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.bagEmptyHeaderTv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.cartEmptyContinueShopping;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.cartEmptyInfoTv;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.cartEmptyWishListRv;
                        Object object2 = view = dd2_2.a(n3, object);
                        object2 = (RecyclerView)view;
                        if (object2 != null) {
                            n3 = R$id.emptyCartProductContainer;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (LinearLayout)view;
                            if (view6 != null) {
                                n3 = R$id.loginBtn;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (TextView)view;
                                if (view7 != null) {
                                    n3 = R$id.userDummy;
                                    View view8 = view = dd2_2.a(n3, object);
                                    view8 = (ImageView)view;
                                    if (view8 != null) {
                                        Object object3 = object;
                                        object3 = (ConstraintLayout)((Object)object);
                                        EmptyCartLayoutLuxeBinding emptyCartLayoutLuxeBinding = new EmptyCartLayoutLuxeBinding((ConstraintLayout)((Object)object3), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5, (RecyclerView)object2, (LinearLayout)view6, (TextView)view7, (ImageView)view8);
                                        return emptyCartLayoutLuxeBinding;
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

    public static EmptyCartLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return EmptyCartLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static EmptyCartLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.empty_cart_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmptyCartLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

