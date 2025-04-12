/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutConfirmTrackShipmentBinding
implements BC3 {
    public final RelativeLayout ltsLayoutShipmentTrack;
    public final View ltsVDashLine;
    public final View ltsVGreenLine;
    private final RelativeLayout rootView;
    public final View trackArriving;
    public final View trackConfirmed;
    public final View trackShipped;
    public final AjioTextView tvArriving;
    public final AjioTextView tvConfirmed;
    public final AjioTextView tvShipped;

    private LayoutConfirmTrackShipmentBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, View view, View view2, View view3, View view4, View view5, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = relativeLayout;
        this.ltsLayoutShipmentTrack = relativeLayout2;
        this.ltsVDashLine = view;
        this.ltsVGreenLine = view2;
        this.trackArriving = view3;
        this.trackConfirmed = view4;
        this.trackShipped = view5;
        this.tvArriving = ajioTextView;
        this.tvConfirmed = ajioTextView2;
        this.tvShipped = ajioTextView3;
    }

    public static LayoutConfirmTrackShipmentBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5 = object;
        view5 = (RelativeLayout)object;
        int n3 = R$id.lts_v_dash_line;
        View view6 = dd2_2.a(n3, object);
        if (view6 != null && (view4 = dd2_2.a(n3 = R$id.lts_v_green_line, object)) != null && (view3 = dd2_2.a(n3 = R$id.track_arriving, object)) != null && (view2 = dd2_2.a(n3 = R$id.track_confirmed, object)) != null && (view = dd2_2.a(n3 = R$id.track_shipped, object)) != null) {
            View view7;
            n3 = R$id.tv_arriving;
            Object object2 = view7 = dd2_2.a(n3, object);
            object2 = (AjioTextView)view7;
            if (object2 != null) {
                n3 = R$id.tv_confirmed;
                Object object3 = view7 = dd2_2.a(n3, object);
                object3 = (AjioTextView)view7;
                if (object3 != null) {
                    n3 = R$id.tv_shipped;
                    Object object4 = view7 = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view7;
                    if (object4 != null) {
                        Object object5 = object;
                        view7 = view5;
                        object = new LayoutConfirmTrackShipmentBinding((RelativeLayout)view5, (RelativeLayout)view5, view6, view4, view3, view2, view, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutConfirmTrackShipmentBinding inflate(LayoutInflater layoutInflater) {
        return LayoutConfirmTrackShipmentBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutConfirmTrackShipmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_confirm_track_shipment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutConfirmTrackShipmentBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

