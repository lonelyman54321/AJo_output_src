/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RvpSeekBarLayoutBinding
implements BC3 {
    public final AjioTextView ajioAvgText;
    public final AjioTextView hundredPercentView;
    public final ConstraintLayout layoutSeekBar;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rvpAjioAvgL;
    public final AjioImageView rvpSeekUp;
    public final ConstraintLayout rvpYourAvgL;
    public final LinearLayout seekBarLayout;
    public final AjioImageView seekBarll;
    public final AjioTextView yourAvgText;
    public final AjioTextView zeroPercentView;

    private RvpSeekBarLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, AjioImageView ajioImageView, ConstraintLayout constraintLayout4, LinearLayout linearLayout, AjioImageView ajioImageView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = constraintLayout;
        this.ajioAvgText = ajioTextView;
        this.hundredPercentView = ajioTextView2;
        this.layoutSeekBar = constraintLayout2;
        this.rvpAjioAvgL = constraintLayout3;
        this.rvpSeekUp = ajioImageView;
        this.rvpYourAvgL = constraintLayout4;
        this.seekBarLayout = linearLayout;
        this.seekBarll = ajioImageView2;
        this.yourAvgText = ajioTextView3;
        this.zeroPercentView = ajioTextView4;
    }

    public static RvpSeekBarLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_avg_text;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.hundred_percent_view;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.layout_seek_bar;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (ConstraintLayout)view;
                if (object4 != null) {
                    n3 = R$id.rvp_ajio_avg_l;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (ConstraintLayout)view;
                    if (object5 != null) {
                        n3 = R$id.rvp_seek_up;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioImageView)view;
                        if (object6 != null) {
                            n3 = R$id.rvp_your_avg_l;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (ConstraintLayout)view;
                            if (object7 != null) {
                                n3 = R$id.seek_bar_layout;
                                View view2 = view = dd2_2.a(n3, object);
                                view2 = (LinearLayout)view;
                                if (view2 != null) {
                                    n3 = R$id.seek_barll;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (AjioImageView)view;
                                    if (object8 != null) {
                                        n3 = R$id.your_avg_text;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (AjioTextView)view;
                                        if (object9 != null) {
                                            n3 = R$id.zero_percent_view;
                                            Object object10 = view = dd2_2.a(n3, object);
                                            object10 = (AjioTextView)view;
                                            if (object10 != null) {
                                                Object object11 = object;
                                                object11 = (ConstraintLayout)((Object)object);
                                                RvpSeekBarLayoutBinding rvpSeekBarLayoutBinding = new RvpSeekBarLayoutBinding((ConstraintLayout)((Object)object11), (AjioTextView)object2, (AjioTextView)object3, (ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object5), (AjioImageView)((Object)object6), (ConstraintLayout)((Object)object7), (LinearLayout)view2, (AjioImageView)((Object)object8), (AjioTextView)object9, (AjioTextView)object10);
                                                return rvpSeekBarLayoutBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RvpSeekBarLayoutBinding inflate(LayoutInflater layoutInflater) {
        return RvpSeekBarLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static RvpSeekBarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.rvp_seek_bar_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RvpSeekBarLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

