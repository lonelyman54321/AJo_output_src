/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.payment.view.NpsView;

public final class FragmentOrderConfirmationPreviewBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final AjioButton btnSubmitrating;
    public final LinearLayout layoutBottom;
    public final FrameLayout npsviewBg;
    public final NpsView npsviewBottomsheet;
    public final RecyclerView orderConfRv;
    public final AjioProgressView orderConfirmationProgressBar;
    public final RelativeLayout parentLayout;
    private final RelativeLayout rootView;
    public final TextView tvSubmit;
    public final TextView tvSubmitLuxe;

    private FragmentOrderConfirmationPreviewBinding(RelativeLayout relativeLayout, AjioLoaderView ajioLoaderView, AjioButton ajioButton, LinearLayout linearLayout, FrameLayout frameLayout, NpsView npsView, RecyclerView recyclerView, AjioProgressView ajioProgressView, RelativeLayout relativeLayout2, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.btnSubmitrating = ajioButton;
        this.layoutBottom = linearLayout;
        this.npsviewBg = frameLayout;
        this.npsviewBottomsheet = npsView;
        this.orderConfRv = recyclerView;
        this.orderConfirmationProgressBar = ajioProgressView;
        this.parentLayout = relativeLayout2;
        this.tvSubmit = textView;
        this.tvSubmitLuxe = textView2;
    }

    public static FragmentOrderConfirmationPreviewBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioLoaderView)view;
        if (object2 != null) {
            n3 = R$id.btn_submitrating;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioButton)view;
            if (object3 != null) {
                n3 = R$id.layout_bottom;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.npsview_bg;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (FrameLayout)view;
                    if (view3 != null) {
                        n3 = R$id.npsview_bottomsheet;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (NpsView)view;
                        if (object4 != null) {
                            n3 = R$id.order_conf_rv;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (RecyclerView)view;
                            if (object5 != null) {
                                n3 = R$id.order_confirmation_progress_bar;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (AjioProgressView)view;
                                if (object6 != null) {
                                    Object object7 = object;
                                    object7 = (RelativeLayout)object;
                                    n3 = R$id.tvSubmit;
                                    View view4 = view = dd2_2.a(n3, object);
                                    view4 = (TextView)view;
                                    if (view4 != null) {
                                        n3 = R$id.tvSubmitLuxe;
                                        View view5 = view = dd2_2.a(n3, object);
                                        view5 = (TextView)view;
                                        if (view5 != null) {
                                            object = new FragmentOrderConfirmationPreviewBinding((RelativeLayout)object7, (AjioLoaderView)((Object)object2), (AjioButton)object3, (LinearLayout)view2, (FrameLayout)view3, (NpsView)object4, (RecyclerView)object5, (AjioProgressView)((Object)object6), (RelativeLayout)object7, (TextView)view4, (TextView)view5);
                                            return object;
                                        }
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

    public static FragmentOrderConfirmationPreviewBinding inflate(LayoutInflater layoutInflater) {
        return FragmentOrderConfirmationPreviewBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentOrderConfirmationPreviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_order_confirmation_preview;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentOrderConfirmationPreviewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

