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

public final class NewLuxePdpColorBinding
implements BC3 {
    public final ImageButton closeButton;
    public final LinearLayout parentLayout;
    public final RecyclerView pdpRvColor;
    public final AjioTextView pdpTvSelectedColor;
    public final AjioTextView pdpTvTitle;
    private final LinearLayout rootView;

    private NewLuxePdpColorBinding(LinearLayout linearLayout, ImageButton imageButton, LinearLayout linearLayout2, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.closeButton = imageButton;
        this.parentLayout = linearLayout2;
        this.pdpRvColor = recyclerView;
        this.pdpTvSelectedColor = ajioTextView;
        this.pdpTvTitle = ajioTextView2;
    }

    public static NewLuxePdpColorBinding bind(View object) {
        View view;
        int n3 = R$id.close_button;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n3 = R$id.parent_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.pdp_rv_color;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (RecyclerView)view;
                if (object2 != null) {
                    n3 = R$id.pdp_tv_selected_color;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.pdp_tv_title;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (LinearLayout)object;
                            NewLuxePdpColorBinding newLuxePdpColorBinding = new NewLuxePdpColorBinding((LinearLayout)object5, (ImageButton)view2, (LinearLayout)view3, (RecyclerView)object2, (AjioTextView)object3, (AjioTextView)object4);
                            return newLuxePdpColorBinding;
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

    public static NewLuxePdpColorBinding inflate(LayoutInflater layoutInflater) {
        return NewLuxePdpColorBinding.inflate(layoutInflater, null, false);
    }

    public static NewLuxePdpColorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_luxe_pdp_color;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewLuxePdpColorBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

