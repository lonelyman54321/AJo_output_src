/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeNewRowPdpShopthelookOverlayBinding
implements BC3 {
    public final RecyclerView completeTheLookRv;
    private final LinearLayout rootView;
    public final AjioTextView shopTheLookOverlayTvTitle;
    public final ImageButton stlCloseButton;
    public final AjioTextView tvCombooffermessage;

    private LuxeNewRowPdpShopthelookOverlayBinding(LinearLayout linearLayout, RecyclerView recyclerView, AjioTextView ajioTextView, ImageButton imageButton, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.completeTheLookRv = recyclerView;
        this.shopTheLookOverlayTvTitle = ajioTextView;
        this.stlCloseButton = imageButton;
        this.tvCombooffermessage = ajioTextView2;
    }

    public static LuxeNewRowPdpShopthelookOverlayBinding bind(View object) {
        View view;
        int n3 = R$id.complete_the_look_rv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            n3 = R$id.shop_the_look_overlay_tv_title;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.stl_close_button;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (ImageButton)view;
                if (view2 != null) {
                    n3 = R$id.tv_combooffermessage;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (LinearLayout)object;
                        LuxeNewRowPdpShopthelookOverlayBinding luxeNewRowPdpShopthelookOverlayBinding = new LuxeNewRowPdpShopthelookOverlayBinding((LinearLayout)object5, (RecyclerView)object2, (AjioTextView)object3, (ImageButton)view2, (AjioTextView)object4);
                        return luxeNewRowPdpShopthelookOverlayBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeNewRowPdpShopthelookOverlayBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewRowPdpShopthelookOverlayBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewRowPdpShopthelookOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_row_pdp_shopthelook_overlay;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewRowPdpShopthelookOverlayBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

