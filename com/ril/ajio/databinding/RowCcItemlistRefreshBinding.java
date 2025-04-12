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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcItemlistRefreshBinding
implements BC3 {
    public final TextView color;
    public final TextView colorTxt;
    public final ImageView imgProduct;
    public final CardView imgProductContainer;
    public final TextView itemBrand;
    public final TextView itemName;
    public final TextView qtyTxt;
    public final TextView quantity;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowCcItemlist;
    public final TextView size;
    public final TextView sizeTxt;

    private RowCcItemlistRefreshBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, CardView cardView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ConstraintLayout constraintLayout2, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.color = textView;
        this.colorTxt = textView2;
        this.imgProduct = imageView;
        this.imgProductContainer = cardView;
        this.itemBrand = textView3;
        this.itemName = textView4;
        this.qtyTxt = textView5;
        this.quantity = textView6;
        this.rowCcItemlist = constraintLayout2;
        this.size = textView7;
        this.sizeTxt = textView8;
    }

    public static RowCcItemlistRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.color;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.color_txt;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.img_product;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.img_product_container;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (CardView)view;
                    if (object2 != null) {
                        n3 = R$id.item_brand;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            n3 = R$id.item_name;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (TextView)view;
                            if (view6 != null) {
                                n3 = R$id.qty_txt;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (TextView)view;
                                if (view7 != null) {
                                    n3 = R$id.quantity;
                                    View view8 = view = dd2_2.a(n3, object);
                                    view8 = (TextView)view;
                                    if (view8 != null) {
                                        Object object3 = object;
                                        object3 = (ConstraintLayout)((Object)object);
                                        n3 = R$id.size;
                                        View view9 = view = dd2_2.a(n3, object);
                                        view9 = (TextView)view;
                                        if (view9 != null) {
                                            n3 = R$id.size_txt;
                                            View view10 = view = dd2_2.a(n3, object);
                                            view10 = (TextView)view;
                                            if (view10 != null) {
                                                object = new RowCcItemlistRefreshBinding((ConstraintLayout)((Object)object3), (TextView)view2, (TextView)view3, (ImageView)view4, (CardView)((Object)object2), (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8, (ConstraintLayout)((Object)object3), (TextView)view9, (TextView)view10);
                                                return object;
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

    public static RowCcItemlistRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcItemlistRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcItemlistRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_itemlist_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcItemlistRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

