/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeBrandDescBottomSheetBinding
implements BC3 {
    public final AjioTextView brandDescBottomSheetDescTv;
    public final AjioTextView brandDescBottomSheetTitleTv;
    public final ImageView brandDescCancelIv;
    public final FrameLayout brandDescCancelLayout;
    private final LinearLayout rootView;

    private LuxeBrandDescBottomSheetBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, ImageView imageView, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.brandDescBottomSheetDescTv = ajioTextView;
        this.brandDescBottomSheetTitleTv = ajioTextView2;
        this.brandDescCancelIv = imageView;
        this.brandDescCancelLayout = frameLayout;
    }

    public static LuxeBrandDescBottomSheetBinding bind(View object) {
        View view;
        int n3 = R$id.brand_desc_bottom_sheet_desc_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.brand_desc_bottom_sheet_title_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.brand_desc_cancel_iv;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (ImageView)view;
                if (view2 != null) {
                    n3 = R$id.brand_desc_cancel_layout;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (FrameLayout)view;
                    if (view3 != null) {
                        Object object4 = object;
                        object4 = (LinearLayout)object;
                        LuxeBrandDescBottomSheetBinding luxeBrandDescBottomSheetBinding = new LuxeBrandDescBottomSheetBinding((LinearLayout)object4, (AjioTextView)object2, (AjioTextView)object3, (ImageView)view2, (FrameLayout)view3);
                        return luxeBrandDescBottomSheetBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeBrandDescBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return LuxeBrandDescBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeBrandDescBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_brand_desc_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeBrandDescBottomSheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

