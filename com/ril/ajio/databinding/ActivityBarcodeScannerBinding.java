/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityBarcodeScannerBinding
implements BC3 {
    public final ImageView imvUp;
    public final AjioTextView lblScanCode;
    private final RelativeLayout rootView;
    public final SurfaceView surfaceView;
    public final AjioTextView tvFindProductCode;

    private ActivityBarcodeScannerBinding(RelativeLayout relativeLayout, ImageView imageView, AjioTextView ajioTextView, SurfaceView surfaceView, AjioTextView ajioTextView2) {
        this.rootView = relativeLayout;
        this.imvUp = imageView;
        this.lblScanCode = ajioTextView;
        this.surfaceView = surfaceView;
        this.tvFindProductCode = ajioTextView2;
    }

    public static ActivityBarcodeScannerBinding bind(View object) {
        View view;
        int n3 = R$id.imv_up;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.lbl_scan_code;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.surfaceView;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (SurfaceView)view;
                if (view3 != null) {
                    n3 = R$id.tv_find_product_code;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (RelativeLayout)object;
                        ActivityBarcodeScannerBinding activityBarcodeScannerBinding = new ActivityBarcodeScannerBinding((RelativeLayout)object4, (ImageView)view2, (AjioTextView)object2, (SurfaceView)view3, (AjioTextView)object3);
                        return activityBarcodeScannerBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityBarcodeScannerBinding inflate(LayoutInflater layoutInflater) {
        return ActivityBarcodeScannerBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityBarcodeScannerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_barcode_scanner;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityBarcodeScannerBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

