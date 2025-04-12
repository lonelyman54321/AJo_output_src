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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ItemCouponClickExpandedBinding;
import com.ril.ajio.databinding.ItemCouponShopBankBinding;
import com.ril.ajio.databinding.ItemCouponShopBinding;

public final class ItemCouponBinding
implements BC3 {
    public final TextView couponExpiryDays;
    public final TextView couponExpiryText;
    public final ConstraintLayout couponFooter;
    public final TextView couponInfo;
    public final ConstraintLayout couponOfferLayout;
    public final ItemCouponClickExpandedBinding couponOfferLayoutClickExpanded;
    public final ItemCouponShopBinding couponOfferLayoutShop;
    public final ItemCouponShopBankBinding couponOfferLayoutShopBank;
    public final LinearLayout couponParentContainer;
    public final ImageView couponShare;
    public final TextView couponTitle;
    public final ConstraintLayout couponTitleContainer;
    public final TextView couponTnc;
    private final LinearLayout rootView;

    private ItemCouponBinding(LinearLayout linearLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, ConstraintLayout constraintLayout2, ItemCouponClickExpandedBinding itemCouponClickExpandedBinding, ItemCouponShopBinding itemCouponShopBinding, ItemCouponShopBankBinding itemCouponShopBankBinding, LinearLayout linearLayout2, ImageView imageView, TextView textView4, ConstraintLayout constraintLayout3, TextView textView5) {
        this.rootView = linearLayout;
        this.couponExpiryDays = textView;
        this.couponExpiryText = textView2;
        this.couponFooter = constraintLayout;
        this.couponInfo = textView3;
        this.couponOfferLayout = constraintLayout2;
        this.couponOfferLayoutClickExpanded = itemCouponClickExpandedBinding;
        this.couponOfferLayoutShop = itemCouponShopBinding;
        this.couponOfferLayoutShopBank = itemCouponShopBankBinding;
        this.couponParentContainer = linearLayout2;
        this.couponShare = imageView;
        this.couponTitle = textView4;
        this.couponTitleContainer = constraintLayout3;
        this.couponTnc = textView5;
    }

    public static ItemCouponBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.coupon_expiry_days;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.coupon_expiry_text;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (TextView)view2;
            if (view4 != null) {
                n3 = R$id.coupon_footer;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (ConstraintLayout)view2;
                if (object2 != null) {
                    n3 = R$id.coupon_info;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (TextView)view2;
                    if (view5 != null) {
                        n3 = R$id.coupon_offer_layout;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (ConstraintLayout)view2;
                        if (object3 != null && (view2 = dd2_2.a(n3 = R$id.coupon_offer_layout_click_expanded, view)) != null) {
                            ItemCouponClickExpandedBinding itemCouponClickExpandedBinding = ItemCouponClickExpandedBinding.bind(view2);
                            n3 = R$id.coupon_offer_layout_shop;
                            view2 = dd2_2.a(n3, view);
                            if (view2 != null) {
                                ItemCouponShopBinding itemCouponShopBinding = ItemCouponShopBinding.bind(view2);
                                n3 = R$id.coupon_offer_layout_shop_bank;
                                view2 = dd2_2.a(n3, view);
                                if (view2 != null) {
                                    ItemCouponShopBankBinding itemCouponShopBankBinding = ItemCouponShopBankBinding.bind(view2);
                                    n3 = R$id.coupon_parent_container;
                                    View view6 = view2 = dd2_2.a(n3, view);
                                    view6 = (LinearLayout)view2;
                                    if (view6 != null) {
                                        n3 = R$id.coupon_share;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (ImageView)view2;
                                        if (view7 != null) {
                                            n3 = R$id.coupon_title;
                                            View view8 = view2 = dd2_2.a(n3, view);
                                            view8 = (TextView)view2;
                                            if (view8 != null) {
                                                n3 = R$id.coupon_title_container;
                                                Object object4 = view2 = dd2_2.a(n3, view);
                                                object4 = (ConstraintLayout)view2;
                                                if (object4 != null) {
                                                    n3 = R$id.coupon_tnc;
                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                    view9 = (TextView)view2;
                                                    if (view9 != null) {
                                                        View view10 = view;
                                                        view10 = (LinearLayout)view;
                                                        ItemCouponBinding itemCouponBinding = new ItemCouponBinding((LinearLayout)view10, (TextView)view3, (TextView)view4, (ConstraintLayout)((Object)object2), (TextView)view5, (ConstraintLayout)((Object)object3), itemCouponClickExpandedBinding, itemCouponShopBinding, itemCouponShopBankBinding, (LinearLayout)view6, (ImageView)view7, (TextView)view8, (ConstraintLayout)((Object)object4), (TextView)view9);
                                                        return itemCouponBinding;
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

    public static ItemCouponBinding inflate(LayoutInflater layoutInflater) {
        return ItemCouponBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCouponBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_coupon;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCouponBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

