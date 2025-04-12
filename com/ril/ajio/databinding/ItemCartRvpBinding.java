/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.RvpSeekBarLayoutBinding;

public final class ItemCartRvpBinding
implements BC3 {
    public final ConstraintLayout layoutTitle;
    private final LinearLayout rootView;
    public final AjioTextView rvpCartTitle;
    public final AjioTextView rvpMessage;
    public final RvpSeekBarLayoutBinding rvpSeekBarLayout;

    private ItemCartRvpBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RvpSeekBarLayoutBinding rvpSeekBarLayoutBinding) {
        this.rootView = linearLayout;
        this.layoutTitle = constraintLayout;
        this.rvpCartTitle = ajioTextView;
        this.rvpMessage = ajioTextView2;
        this.rvpSeekBarLayout = rvpSeekBarLayoutBinding;
    }

    public static ItemCartRvpBinding bind(View object) {
        View view;
        int n3 = R$id.layout_title;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.rvp_cart_title;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.rvp_message;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null && (view = dd2_2.a(n3 = R$id.rvp_seek_bar_layout, object)) != null) {
                    RvpSeekBarLayoutBinding rvpSeekBarLayoutBinding = RvpSeekBarLayoutBinding.bind(view);
                    Object object5 = object;
                    object5 = (LinearLayout)object;
                    ItemCartRvpBinding itemCartRvpBinding = new ItemCartRvpBinding((LinearLayout)object5, (ConstraintLayout)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, rvpSeekBarLayoutBinding);
                    return itemCartRvpBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCartRvpBinding inflate(LayoutInflater layoutInflater) {
        return ItemCartRvpBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCartRvpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cart_rvp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCartRvpBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

