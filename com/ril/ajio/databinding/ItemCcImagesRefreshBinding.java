/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ItemCcImageRefreshBinding;

public final class ItemCcImagesRefreshBinding
implements BC3 {
    public final TextView ccExtraImages;
    public final ItemCcImageRefreshBinding ccImageContainer1;
    public final ItemCcImageRefreshBinding ccImageContainer2;
    public final ItemCcImageRefreshBinding ccImageContainer3;
    private final ConstraintLayout rootView;

    private ItemCcImagesRefreshBinding(ConstraintLayout constraintLayout, TextView textView, ItemCcImageRefreshBinding itemCcImageRefreshBinding, ItemCcImageRefreshBinding itemCcImageRefreshBinding2, ItemCcImageRefreshBinding itemCcImageRefreshBinding3) {
        this.rootView = constraintLayout;
        this.ccExtraImages = textView;
        this.ccImageContainer1 = itemCcImageRefreshBinding;
        this.ccImageContainer2 = itemCcImageRefreshBinding2;
        this.ccImageContainer3 = itemCcImageRefreshBinding3;
    }

    public static ItemCcImagesRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cc_extra_images;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null && (view = dd2_2.a(n3 = R$id.cc_image_container_1, object)) != null) {
            ItemCcImageRefreshBinding itemCcImageRefreshBinding = ItemCcImageRefreshBinding.bind(view);
            n3 = R$id.cc_image_container_2;
            view = dd2_2.a(n3, object);
            if (view != null) {
                ItemCcImageRefreshBinding itemCcImageRefreshBinding2 = ItemCcImageRefreshBinding.bind(view);
                n3 = R$id.cc_image_container_3;
                view = dd2_2.a(n3, object);
                if (view != null) {
                    ItemCcImageRefreshBinding itemCcImageRefreshBinding3 = ItemCcImageRefreshBinding.bind(view);
                    Object object2 = object;
                    object2 = (ConstraintLayout)((Object)object);
                    ItemCcImagesRefreshBinding itemCcImagesRefreshBinding = new ItemCcImagesRefreshBinding((ConstraintLayout)((Object)object2), (TextView)view2, itemCcImageRefreshBinding, itemCcImageRefreshBinding2, itemCcImageRefreshBinding3);
                    return itemCcImagesRefreshBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCcImagesRefreshBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcImagesRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcImagesRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_images_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcImagesRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

