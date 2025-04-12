/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundTrackerRowWithSubstatusBinding
implements BC3 {
    public final View dummyView;
    public final ImageView mainLine;
    public final ImageView mainStatusCircle;
    public final AjioTextView mainStatusDesc;
    public final AjioTextView mainStatusTxt;
    private final ConstraintLayout rootView;
    public final ImageView subLine;
    public final ImageView subStatusCircle;
    public final AjioTextView subStatusTxt;
    public final ImageView topLine;

    private ReturnRefundTrackerRowWithSubstatusBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, ImageView imageView2, AjioTextView ajioTextView, AjioTextView ajioTextView2, ImageView imageView3, ImageView imageView4, AjioTextView ajioTextView3, ImageView imageView5) {
        this.rootView = constraintLayout;
        this.dummyView = view;
        this.mainLine = imageView;
        this.mainStatusCircle = imageView2;
        this.mainStatusDesc = ajioTextView;
        this.mainStatusTxt = ajioTextView2;
        this.subLine = imageView3;
        this.subStatusCircle = imageView4;
        this.subStatusTxt = ajioTextView3;
        this.topLine = imageView5;
    }

    public static ReturnRefundTrackerRowWithSubstatusBinding bind(View object) {
        int n3 = R$id.dummy_view;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.main_line;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (ImageView)object2;
            if (view2 != null) {
                n3 = R$id.main_status_circle;
                View view3 = object2 = dd2_2.a(n3, object);
                view3 = (ImageView)object2;
                if (view3 != null) {
                    n3 = R$id.main_status_desc;
                    Object object3 = object2 = dd2_2.a(n3, object);
                    object3 = (AjioTextView)object2;
                    if (object3 != null) {
                        n3 = R$id.main_status_txt;
                        Object object4 = object2 = dd2_2.a(n3, object);
                        object4 = (AjioTextView)object2;
                        if (object4 != null) {
                            n3 = R$id.sub_line;
                            View view4 = object2 = dd2_2.a(n3, object);
                            view4 = (ImageView)object2;
                            if (view4 != null) {
                                n3 = R$id.sub_status_circle;
                                View view5 = object2 = dd2_2.a(n3, object);
                                view5 = (ImageView)object2;
                                if (view5 != null) {
                                    n3 = R$id.sub_status_txt;
                                    Object object5 = object2 = dd2_2.a(n3, object);
                                    object5 = (AjioTextView)object2;
                                    if (object5 != null) {
                                        n3 = R$id.top_line;
                                        View view6 = object2 = dd2_2.a(n3, object);
                                        view6 = (ImageView)object2;
                                        if (view6 != null) {
                                            ReturnRefundTrackerRowWithSubstatusBinding returnRefundTrackerRowWithSubstatusBinding;
                                            Object object6 = object;
                                            object6 = (ConstraintLayout)((Object)object);
                                            object2 = returnRefundTrackerRowWithSubstatusBinding;
                                            returnRefundTrackerRowWithSubstatusBinding = new ReturnRefundTrackerRowWithSubstatusBinding((ConstraintLayout)((Object)object6), view, (ImageView)view2, (ImageView)view3, (AjioTextView)object3, (AjioTextView)object4, (ImageView)view4, (ImageView)view5, (AjioTextView)object5, (ImageView)view6);
                                            return returnRefundTrackerRowWithSubstatusBinding;
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

    public static ReturnRefundTrackerRowWithSubstatusBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundTrackerRowWithSubstatusBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundTrackerRowWithSubstatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_tracker_row_with_substatus;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundTrackerRowWithSubstatusBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

