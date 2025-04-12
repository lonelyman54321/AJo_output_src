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
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class EmptyCartLayoutRefreshBinding
implements BC3 {
    public final TextView addFromWishlist;
    public final TextView bagEmptyHeaderTv;
    public final TextView cartEmptyContinueShopping;
    public final TextView cartEmptyContinueShopping2;
    public final Guideline cartEmptyGuideline;
    public final TextView cartEmptyInfoTv;
    public final RecyclerView cartEmptyWishListRv;
    public final LinearLayout emptyCartProductContainer;
    public final TextView loginBtn;
    private final ConstraintLayout rootView;
    public final ImageView userDummy;

    private EmptyCartLayoutRefreshBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, Guideline guideline, TextView textView5, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView6, ImageView imageView) {
        this.rootView = constraintLayout;
        this.addFromWishlist = textView;
        this.bagEmptyHeaderTv = textView2;
        this.cartEmptyContinueShopping = textView3;
        this.cartEmptyContinueShopping2 = textView4;
        this.cartEmptyGuideline = guideline;
        this.cartEmptyInfoTv = textView5;
        this.cartEmptyWishListRv = recyclerView;
        this.emptyCartProductContainer = linearLayout;
        this.loginBtn = textView6;
        this.userDummy = imageView;
    }

    public static EmptyCartLayoutRefreshBinding bind(View object) {
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
                    n3 = R$id.cartEmptyContinueShopping2;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.cartEmptyGuideline;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (Guideline)view;
                        if (view6 != null) {
                            n3 = R$id.cartEmptyInfoTv;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                n3 = R$id.cartEmptyWishListRv;
                                Object object2 = view = dd2_2.a(n3, object);
                                object2 = (RecyclerView)view;
                                if (object2 != null) {
                                    n3 = R$id.emptyCartProductContainer;
                                    View view8 = view = dd2_2.a(n3, object);
                                    view8 = (LinearLayout)view;
                                    if (view8 != null) {
                                        n3 = R$id.loginBtn;
                                        View view9 = view = dd2_2.a(n3, object);
                                        view9 = (TextView)view;
                                        if (view9 != null) {
                                            n3 = R$id.userDummy;
                                            View view10 = view = dd2_2.a(n3, object);
                                            view10 = (ImageView)view;
                                            if (view10 != null) {
                                                Object object3 = object;
                                                object3 = (ConstraintLayout)((Object)object);
                                                EmptyCartLayoutRefreshBinding emptyCartLayoutRefreshBinding = new EmptyCartLayoutRefreshBinding((ConstraintLayout)((Object)object3), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5, (Guideline)view6, (TextView)view7, (RecyclerView)object2, (LinearLayout)view8, (TextView)view9, (ImageView)view10);
                                                return emptyCartLayoutRefreshBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static EmptyCartLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return EmptyCartLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static EmptyCartLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.empty_cart_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmptyCartLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

