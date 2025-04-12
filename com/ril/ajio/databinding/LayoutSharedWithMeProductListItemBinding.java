/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutSharedWithMeProductListItemBinding
implements BC3 {
    public final AjioCircularImageView addToBag;
    public final ImageView deleteItem;
    public final ImageView imgProduct;
    public final AjioTextView itemBrand;
    public final AjioTextView itemName;
    public final AjioTextView itemOldPrice;
    public final ConstraintLayout itemParentLayout;
    public final AjioTextView itemPrice;
    public final ImageView pllBgGrey;
    public final ImageView pllIvSelected;
    public final ImageView pllVUnselected;
    private final ConstraintLayout rootView;

    private LayoutSharedWithMeProductListItemBinding(ConstraintLayout constraintLayout, AjioCircularImageView ajioCircularImageView, ImageView imageView, ImageView imageView2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ConstraintLayout constraintLayout2, AjioTextView ajioTextView4, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        this.rootView = constraintLayout;
        this.addToBag = ajioCircularImageView;
        this.deleteItem = imageView;
        this.imgProduct = imageView2;
        this.itemBrand = ajioTextView;
        this.itemName = ajioTextView2;
        this.itemOldPrice = ajioTextView3;
        this.itemParentLayout = constraintLayout2;
        this.itemPrice = ajioTextView4;
        this.pllBgGrey = imageView3;
        this.pllIvSelected = imageView4;
        this.pllVUnselected = imageView5;
    }

    public static LayoutSharedWithMeProductListItemBinding bind(View object) {
        View view;
        int n3 = R$id.add_to_bag;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioCircularImageView)view;
        if (object2 != null) {
            n3 = R$id.delete_item;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.img_product;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.item_brand;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.item_name;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.item_old_price;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                Object object6 = object;
                                object6 = (ConstraintLayout)((Object)object);
                                n3 = R$id.item_price;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.pllBgGrey;
                                    View view4 = view = dd2_2.a(n3, object);
                                    view4 = (ImageView)view;
                                    if (view4 != null) {
                                        n3 = R$id.pllIvSelected;
                                        View view5 = view = dd2_2.a(n3, object);
                                        view5 = (ImageView)view;
                                        if (view5 != null) {
                                            n3 = R$id.pllVUnselected;
                                            View view6 = view = dd2_2.a(n3, object);
                                            view6 = (ImageView)view;
                                            if (view6 != null) {
                                                object = new LayoutSharedWithMeProductListItemBinding((ConstraintLayout)((Object)object6), (AjioCircularImageView)((Object)object2), (ImageView)view2, (ImageView)view3, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (ConstraintLayout)((Object)object6), (AjioTextView)object7, (ImageView)view4, (ImageView)view5, (ImageView)view6);
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

    public static LayoutSharedWithMeProductListItemBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSharedWithMeProductListItemBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSharedWithMeProductListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_shared_with_me_product_list_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSharedWithMeProductListItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

