/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEProgressView;

public final class PesdkLuxActivityUpiStatusBinding
implements BC3 {
    public final PEProgressView peUpiProgressBar;
    public final LinearLayout pesdkLayoutCoordinator;
    public final ProgressBar progressbar;
    private final RelativeLayout rootView;
    public final AjioTextView upiPaymentStatusTimer;

    private PesdkLuxActivityUpiStatusBinding(RelativeLayout relativeLayout, PEProgressView pEProgressView, LinearLayout linearLayout, ProgressBar progressBar, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.peUpiProgressBar = pEProgressView;
        this.pesdkLayoutCoordinator = linearLayout;
        this.progressbar = progressBar;
        this.upiPaymentStatusTimer = ajioTextView;
    }

    public static PesdkLuxActivityUpiStatusBinding bind(View object) {
        View view;
        int n3 = R$id.pe_upi_progress_bar;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (PEProgressView)view;
        if (object2 != null) {
            n3 = R$id.pesdk_layout_coordinator;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.progressbar;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ProgressBar)view;
                if (view3 != null) {
                    n3 = R$id.upi_payment_status_timer;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (RelativeLayout)object;
                        PesdkLuxActivityUpiStatusBinding pesdkLuxActivityUpiStatusBinding = new PesdkLuxActivityUpiStatusBinding((RelativeLayout)object4, (PEProgressView)((Object)object2), (LinearLayout)view2, (ProgressBar)view3, (AjioTextView)object3);
                        return pesdkLuxActivityUpiStatusBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxActivityUpiStatusBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxActivityUpiStatusBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxActivityUpiStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_activity_upi_status;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxActivityUpiStatusBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

