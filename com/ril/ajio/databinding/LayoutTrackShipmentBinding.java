/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutTrackShipmentBinding
implements BC3 {
    public final Guideline ltsGlConfirmed;
    public final Guideline ltsGlOfd;
    public final Guideline ltsGlOfdText;
    public final Guideline ltsGlPacked;
    public final Guideline ltsGlPackedText;
    public final Guideline ltsGlShipped;
    public final Guideline ltsGlShippedText;
    public final ConstraintLayout ltsLayoutShipmentTrack;
    public final AjioTextView ltsTvArriving;
    public final AjioTextView ltsTvConfirmed;
    public final AjioTextView ltsTvOfd;
    public final AjioTextView ltsTvPackedAbove;
    public final AjioTextView ltsTvPackedBelow;
    public final AjioTextView ltsTvShippedAbove;
    public final AjioTextView ltsTvShippedBelow;
    public final View ltsVDashLine;
    public final View ltsVGreenLine;
    public final View ltsVTrackConfirmed;
    public final View ltsVTrackCurrent;
    public final View ltsVTrackPacked;
    public final View ltsVTrackShipped;
    private final ConstraintLayout rootView;

    private LayoutTrackShipmentBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, Guideline guideline5, Guideline guideline6, Guideline guideline7, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, View view, View view2, View view3, View view4, View view5, View view6) {
        this.rootView = constraintLayout;
        this.ltsGlConfirmed = guideline;
        this.ltsGlOfd = guideline2;
        this.ltsGlOfdText = guideline3;
        this.ltsGlPacked = guideline4;
        this.ltsGlPackedText = guideline5;
        this.ltsGlShipped = guideline6;
        this.ltsGlShippedText = guideline7;
        this.ltsLayoutShipmentTrack = constraintLayout2;
        this.ltsTvArriving = ajioTextView;
        this.ltsTvConfirmed = ajioTextView2;
        this.ltsTvOfd = ajioTextView3;
        this.ltsTvPackedAbove = ajioTextView4;
        this.ltsTvPackedBelow = ajioTextView5;
        this.ltsTvShippedAbove = ajioTextView6;
        this.ltsTvShippedBelow = ajioTextView7;
        this.ltsVDashLine = view;
        this.ltsVGreenLine = view2;
        this.ltsVTrackConfirmed = view3;
        this.ltsVTrackCurrent = view4;
        this.ltsVTrackPacked = view5;
        this.ltsVTrackShipped = view6;
    }

    public static LayoutTrackShipmentBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.lts_gl_confirmed;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Guideline)view2;
        if (view3 != null) {
            n3 = R$id.lts_gl_ofd;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (Guideline)view2;
            if (view4 != null) {
                n3 = R$id.lts_gl_ofd_text;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (Guideline)view2;
                if (view5 != null) {
                    n3 = R$id.lts_gl_packed;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (Guideline)view2;
                    if (view6 != null) {
                        n3 = R$id.lts_gl_packed_text;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (Guideline)view2;
                        if (view7 != null) {
                            n3 = R$id.lts_gl_shipped;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (Guideline)view2;
                            if (view8 != null) {
                                n3 = R$id.lts_gl_shipped_text;
                                View view9 = view2 = dd2_2.a(n3, view);
                                view9 = (Guideline)view2;
                                if (view9 != null) {
                                    Object object2 = view;
                                    object2 = (ConstraintLayout)view;
                                    n3 = R$id.lts_tv_arriving;
                                    Object object3 = view2 = dd2_2.a(n3, view);
                                    object3 = (AjioTextView)view2;
                                    if (object3 != null) {
                                        n3 = R$id.lts_tv_confirmed;
                                        Object object4 = view2 = dd2_2.a(n3, view);
                                        object4 = (AjioTextView)view2;
                                        if (object4 != null) {
                                            n3 = R$id.lts_tv_ofd;
                                            Object object5 = view2 = dd2_2.a(n3, view);
                                            object5 = (AjioTextView)view2;
                                            if (object5 != null) {
                                                n3 = R$id.lts_tv_packed_above;
                                                Object object6 = view2 = dd2_2.a(n3, view);
                                                object6 = (AjioTextView)view2;
                                                if (object6 != null) {
                                                    n3 = R$id.lts_tv_packed_below;
                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                    object7 = (AjioTextView)view2;
                                                    if (object7 != null) {
                                                        n3 = R$id.lts_tv_shipped_above;
                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                        object8 = (AjioTextView)view2;
                                                        if (object8 != null) {
                                                            View view10;
                                                            View view11;
                                                            View view12;
                                                            View view13;
                                                            View view14;
                                                            View view15;
                                                            n3 = R$id.lts_tv_shipped_below;
                                                            Object object9 = view2 = dd2_2.a(n3, view);
                                                            object9 = (AjioTextView)view2;
                                                            if (object9 != null && (view15 = dd2_2.a(n3 = R$id.lts_v_dash_line, view)) != null && (view14 = dd2_2.a(n3 = R$id.lts_v_green_line, view)) != null && (view13 = dd2_2.a(n3 = R$id.lts_v_track_confirmed, view)) != null && (view12 = dd2_2.a(n3 = R$id.lts_v_track_current, view)) != null && (view11 = dd2_2.a(n3 = R$id.lts_v_track_packed, view)) != null && (view10 = dd2_2.a(n3 = R$id.lts_v_track_shipped, view)) != null) {
                                                                object = new LayoutTrackShipmentBinding((ConstraintLayout)((Object)object2), (Guideline)view3, (Guideline)view4, (Guideline)view5, (Guideline)view6, (Guideline)view7, (Guideline)view8, (Guideline)view9, (ConstraintLayout)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, view15, view14, view13, view12, view11, view10);
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
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutTrackShipmentBinding inflate(LayoutInflater layoutInflater) {
        return LayoutTrackShipmentBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutTrackShipmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_track_shipment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutTrackShipmentBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

