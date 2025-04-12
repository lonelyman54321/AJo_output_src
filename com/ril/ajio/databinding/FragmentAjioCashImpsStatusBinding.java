/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ErrorLoadingBottomsheetBinding;

public final class FragmentAjioCashImpsStatusBinding
implements BC3 {
    public final ErrorLoadingBottomsheetBinding errorLayout;
    public final AjioTextView impsTransferStatusMessage;
    public final ImageView odCancelImvClose;
    private final LinearLayout rootView;
    public final ShimmerFrameLayout spShimmerView;

    private FragmentAjioCashImpsStatusBinding(LinearLayout linearLayout, ErrorLoadingBottomsheetBinding errorLoadingBottomsheetBinding, AjioTextView ajioTextView, ImageView imageView, ShimmerFrameLayout shimmerFrameLayout) {
        this.rootView = linearLayout;
        this.errorLayout = errorLoadingBottomsheetBinding;
        this.impsTransferStatusMessage = ajioTextView;
        this.odCancelImvClose = imageView;
        this.spShimmerView = shimmerFrameLayout;
    }

    public static FragmentAjioCashImpsStatusBinding bind(View object) {
        int n3 = R$id.error_layout;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            ErrorLoadingBottomsheetBinding errorLoadingBottomsheetBinding = ErrorLoadingBottomsheetBinding.bind(view);
            n3 = R$id.imps_transfer_status_message;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.od_cancel_imv_close;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (ImageView)view;
                if (view2 != null) {
                    n3 = R$id.spShimmerView;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (ShimmerFrameLayout)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (LinearLayout)object;
                        FragmentAjioCashImpsStatusBinding fragmentAjioCashImpsStatusBinding = new FragmentAjioCashImpsStatusBinding((LinearLayout)object4, errorLoadingBottomsheetBinding, (AjioTextView)object2, (ImageView)view2, (ShimmerFrameLayout)((Object)object3));
                        return fragmentAjioCashImpsStatusBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentAjioCashImpsStatusBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAjioCashImpsStatusBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAjioCashImpsStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ajio_cash_imps_status;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAjioCashImpsStatusBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

