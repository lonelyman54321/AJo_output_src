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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundTrackerRowWithoutSubtatusBinding
implements BC3 {
    public final LinearLayout attemptsLayout;
    public final ImageView bottomLine;
    public final AjioTextView description;
    public final View dummyView;
    public final ImageView mainLine;
    public final ImageView mainStatusCircle;
    public final AjioTextView mainStatusDesc;
    public final AjioTextView mainStatusTxt;
    private final ConstraintLayout rootView;
    public final ImageView topLine;

    private ReturnRefundTrackerRowWithoutSubtatusBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView, View view, ImageView imageView2, ImageView imageView3, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ImageView imageView4) {
        this.rootView = constraintLayout;
        this.attemptsLayout = linearLayout;
        this.bottomLine = imageView;
        this.description = ajioTextView;
        this.dummyView = view;
        this.mainLine = imageView2;
        this.mainStatusCircle = imageView3;
        this.mainStatusDesc = ajioTextView2;
        this.mainStatusTxt = ajioTextView3;
        this.topLine = imageView4;
    }

    public static ReturnRefundTrackerRowWithoutSubtatusBinding bind(View object) {
        View view;
        int n3 = R$id.attempts_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.bottom_line;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                View view4;
                n3 = R$id.description;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null && (view4 = dd2_2.a(n3 = R$id.dummy_view, object)) != null) {
                    n3 = R$id.main_line;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        n3 = R$id.main_status_circle;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (ImageView)view;
                        if (view6 != null) {
                            n3 = R$id.main_status_desc;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (AjioTextView)view;
                            if (object3 != null) {
                                n3 = R$id.main_status_txt;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (AjioTextView)view;
                                if (object4 != null) {
                                    n3 = R$id.top_line;
                                    View view7 = view = dd2_2.a(n3, object);
                                    view7 = (ImageView)view;
                                    if (view7 != null) {
                                        Object object5 = object;
                                        object5 = (ConstraintLayout)((Object)object);
                                        ReturnRefundTrackerRowWithoutSubtatusBinding returnRefundTrackerRowWithoutSubtatusBinding = new ReturnRefundTrackerRowWithoutSubtatusBinding((ConstraintLayout)((Object)object5), (LinearLayout)view2, (ImageView)view3, (AjioTextView)object2, view4, (ImageView)view5, (ImageView)view6, (AjioTextView)object3, (AjioTextView)object4, (ImageView)view7);
                                        return returnRefundTrackerRowWithoutSubtatusBinding;
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

    public static ReturnRefundTrackerRowWithoutSubtatusBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundTrackerRowWithoutSubtatusBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundTrackerRowWithoutSubtatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_tracker_row_without_subtatus;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundTrackerRowWithoutSubtatusBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

