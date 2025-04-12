/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartAssuredGiftsBinding
implements BC3 {
    public final AppCompatImageView icCartAssuredGift;
    public final RelativeLayout idCartAssuredGiftHeader;
    public final AjioTextView idCartAssuredGiftText;
    public final RecyclerView idCartGiftList;
    public final AjioTextView idCartGiftTitle;
    public final AjioTextView idKnowMore;
    public final AjioTextView idText1;
    public final View idViewBottomLine;
    public final View idViewLine;
    private final ConstraintLayout rootView;

    private CartAssuredGiftsBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, AjioTextView ajioTextView, RecyclerView recyclerView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, View view, View view2) {
        this.rootView = constraintLayout;
        this.icCartAssuredGift = appCompatImageView;
        this.idCartAssuredGiftHeader = relativeLayout;
        this.idCartAssuredGiftText = ajioTextView;
        this.idCartGiftList = recyclerView;
        this.idCartGiftTitle = ajioTextView2;
        this.idKnowMore = ajioTextView3;
        this.idText1 = ajioTextView4;
        this.idViewBottomLine = view;
        this.idViewLine = view2;
    }

    public static CartAssuredGiftsBinding bind(View object) {
        View view;
        int n3 = R$id.ic_cart_assured_gift;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.id_cart_assured_gift_header;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (RelativeLayout)view;
            if (view2 != null) {
                n3 = R$id.id_cart_assured_gift_text;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.id_cart_gift_list;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (RecyclerView)view;
                    if (object4 != null) {
                        n3 = R$id.id_cart_gift_title;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.id_know_more;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                View view3;
                                View view4;
                                n3 = R$id.id_text1;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null && (view4 = dd2_2.a(n3 = R$id.id_view_bottom_line, object)) != null && (view3 = dd2_2.a(n3 = R$id.id_view_line, object)) != null) {
                                    Object object8 = object;
                                    object8 = (ConstraintLayout)((Object)object);
                                    CartAssuredGiftsBinding cartAssuredGiftsBinding = new CartAssuredGiftsBinding((ConstraintLayout)((Object)object8), (AppCompatImageView)((Object)object2), (RelativeLayout)view2, (AjioTextView)object3, (RecyclerView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, view4, view3);
                                    return cartAssuredGiftsBinding;
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

    public static CartAssuredGiftsBinding inflate(LayoutInflater layoutInflater) {
        return CartAssuredGiftsBinding.inflate(layoutInflater, null, false);
    }

    public static CartAssuredGiftsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_assured_gifts;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartAssuredGiftsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

