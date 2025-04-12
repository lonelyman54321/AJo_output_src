/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class QuickviewListItemBinding
implements BC3 {
    public final FrameLayout imageParentLayout;
    public final LinearLayout llTransparentView;
    public final AjioTextView prodDesc;
    public final LinearLayout prodDescLl;
    public final AjioTextView prodPrice;
    public final AjioTextView prodQuant;
    public final AjioTextView prodQuantText;
    public final AjioTextView prodSize;
    public final AjioTextView prodSizeText;
    public final RecyclerView quickviewCartItemList;
    private final RelativeLayout rootView;
    public final LinearLayout sizeParentLl;

    private QuickviewListItemBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, RecyclerView recyclerView, LinearLayout linearLayout3) {
        this.rootView = relativeLayout;
        this.imageParentLayout = frameLayout;
        this.llTransparentView = linearLayout;
        this.prodDesc = ajioTextView;
        this.prodDescLl = linearLayout2;
        this.prodPrice = ajioTextView2;
        this.prodQuant = ajioTextView3;
        this.prodQuantText = ajioTextView4;
        this.prodSize = ajioTextView5;
        this.prodSizeText = ajioTextView6;
        this.quickviewCartItemList = recyclerView;
        this.sizeParentLl = linearLayout3;
    }

    public static QuickviewListItemBinding bind(View object) {
        View view;
        int n3 = R$id.image_parent_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (FrameLayout)view;
        if (view2 != null) {
            n3 = R$id.ll_transparent_view;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.prod_desc;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.prod_desc_ll;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (LinearLayout)view;
                    if (view4 != null) {
                        n3 = R$id.prod_price;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.prod_quant;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                n3 = R$id.prod_quant_text;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.prod_size;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (AjioTextView)view;
                                    if (object6 != null) {
                                        n3 = R$id.prod_size_text;
                                        Object object7 = view = dd2_2.a(n3, object);
                                        object7 = (AjioTextView)view;
                                        if (object7 != null) {
                                            n3 = R$id.quickview_cart_item_list;
                                            Object object8 = view = dd2_2.a(n3, object);
                                            object8 = (RecyclerView)view;
                                            if (object8 != null) {
                                                n3 = R$id.size_parent_ll;
                                                View view5 = view = dd2_2.a(n3, object);
                                                view5 = (LinearLayout)view;
                                                if (view5 != null) {
                                                    Object object9 = object;
                                                    object9 = (RelativeLayout)object;
                                                    QuickviewListItemBinding quickviewListItemBinding = new QuickviewListItemBinding((RelativeLayout)object9, (FrameLayout)view2, (LinearLayout)view3, (AjioTextView)object2, (LinearLayout)view4, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (RecyclerView)object8, (LinearLayout)view5);
                                                    return quickviewListItemBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static QuickviewListItemBinding inflate(LayoutInflater layoutInflater) {
        return QuickviewListItemBinding.inflate(layoutInflater, null, false);
    }

    public static QuickviewListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.quickview_list_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return QuickviewListItemBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

