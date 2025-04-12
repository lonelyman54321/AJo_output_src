/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewRowPdpShopthelookOverlayBinding
implements BC3 {
    public final RecyclerView completeTheLookRv;
    private final LinearLayout rootView;
    public final ImageView shopTheLookOverlayClose;
    public final RelativeLayout shopTheLookOverlayLabelContainer;
    public final AjioTextView shopTheLookOverlayTvTitle;
    public final AjioTextView tvCombooffermessage;

    private NewRowPdpShopthelookOverlayBinding(LinearLayout linearLayout, RecyclerView recyclerView, ImageView imageView, RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.completeTheLookRv = recyclerView;
        this.shopTheLookOverlayClose = imageView;
        this.shopTheLookOverlayLabelContainer = relativeLayout;
        this.shopTheLookOverlayTvTitle = ajioTextView;
        this.tvCombooffermessage = ajioTextView2;
    }

    public static NewRowPdpShopthelookOverlayBinding bind(View object) {
        View view;
        int n3 = R$id.complete_the_look_rv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            n3 = R$id.shop_the_look_overlay_close;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.shop_the_look_overlay_label_container;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (RelativeLayout)view;
                if (view3 != null) {
                    n3 = R$id.shop_the_look_overlay_tv_title;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.tv_combooffermessage;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (LinearLayout)object;
                            NewRowPdpShopthelookOverlayBinding newRowPdpShopthelookOverlayBinding = new NewRowPdpShopthelookOverlayBinding((LinearLayout)object5, (RecyclerView)object2, (ImageView)view2, (RelativeLayout)view3, (AjioTextView)object3, (AjioTextView)object4);
                            return newRowPdpShopthelookOverlayBinding;
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

    public static NewRowPdpShopthelookOverlayBinding inflate(LayoutInflater layoutInflater) {
        return NewRowPdpShopthelookOverlayBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowPdpShopthelookOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_pdp_shopthelook_overlay;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowPdpShopthelookOverlayBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

