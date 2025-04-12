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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCcComplaintImageBinding
implements BC3 {
    public final ImageView image1;
    public final CardView image1Container;
    public final ImageView image2;
    public final CardView image2Container;
    public final ImageView image3;
    public final CardView image3Container;
    public final Space marginSpacer2;
    public final Space marginSpacer3;
    private final ConstraintLayout rootView;

    private ItemCcComplaintImageBinding(ConstraintLayout constraintLayout, ImageView imageView, CardView cardView, ImageView imageView2, CardView cardView2, ImageView imageView3, CardView cardView3, Space space, Space space2) {
        this.rootView = constraintLayout;
        this.image1 = imageView;
        this.image1Container = cardView;
        this.image2 = imageView2;
        this.image2Container = cardView2;
        this.image3 = imageView3;
        this.image3Container = cardView3;
        this.marginSpacer2 = space;
        this.marginSpacer3 = space2;
    }

    public static ItemCcComplaintImageBinding bind(View object) {
        View view;
        int n3 = R$id.image_1;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.image_1_container;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (CardView)view;
            if (object2 != null) {
                n3 = R$id.image_2;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.image_2_container;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (CardView)view;
                    if (object3 != null) {
                        n3 = R$id.image_3;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (ImageView)view;
                        if (view4 != null) {
                            n3 = R$id.image_3_container;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (CardView)view;
                            if (object4 != null) {
                                n3 = R$id.marginSpacer_2;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (Space)view;
                                if (view5 != null) {
                                    n3 = R$id.marginSpacer_3;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (Space)view;
                                    if (view6 != null) {
                                        Object object5 = object;
                                        object5 = (ConstraintLayout)((Object)object);
                                        ItemCcComplaintImageBinding itemCcComplaintImageBinding = new ItemCcComplaintImageBinding((ConstraintLayout)((Object)object5), (ImageView)view2, (CardView)((Object)object2), (ImageView)view3, (CardView)((Object)object3), (ImageView)view4, (CardView)((Object)object4), (Space)view5, (Space)view6);
                                        return itemCcComplaintImageBinding;
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

    public static ItemCcComplaintImageBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcComplaintImageBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcComplaintImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_complaint_image;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcComplaintImageBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

