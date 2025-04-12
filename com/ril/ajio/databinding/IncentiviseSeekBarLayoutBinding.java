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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class IncentiviseSeekBarLayoutBinding
implements BC3 {
    public final AjioTextView ajioAvgText;
    public final ConstraintLayout clSeekBar;
    public final AjioTextView hundredPercentView;
    public final ConstraintLayout layoutSeekBar;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rvpAjioAvgL;
    public final AjioImageView rvpSeekUp;
    public final ConstraintLayout rvpYourAvgL;
    public final ConstraintLayout seekBarLayout;
    public final AjioImageView seekBarll;
    public final AjioTextView tvKnowMore;
    public final AjioTextView tvTitle;
    public final AjioTextView yourAvgText;
    public final AjioTextView zeroPercentView;

    private IncentiviseSeekBarLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, AjioImageView ajioImageView, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, AjioImageView ajioImageView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = constraintLayout;
        this.ajioAvgText = ajioTextView;
        this.clSeekBar = constraintLayout2;
        this.hundredPercentView = ajioTextView2;
        this.layoutSeekBar = constraintLayout3;
        this.rvpAjioAvgL = constraintLayout4;
        this.rvpSeekUp = ajioImageView;
        this.rvpYourAvgL = constraintLayout5;
        this.seekBarLayout = constraintLayout6;
        this.seekBarll = ajioImageView2;
        this.tvKnowMore = ajioTextView3;
        this.tvTitle = ajioTextView4;
        this.yourAvgText = ajioTextView5;
        this.zeroPercentView = ajioTextView6;
    }

    public static IncentiviseSeekBarLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.ajio_avg_text;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            Object object3 = view;
            object3 = (ConstraintLayout)view;
            n3 = R$id.hundred_percent_view;
            Object object4 = view2 = dd2_2.a(n3, view);
            object4 = (AjioTextView)view2;
            if (object4 != null) {
                n3 = R$id.layout_seek_bar;
                Object object5 = view2 = dd2_2.a(n3, view);
                object5 = (ConstraintLayout)view2;
                if (object5 != null) {
                    n3 = R$id.rvp_ajio_avg_l;
                    Object object6 = view2 = dd2_2.a(n3, view);
                    object6 = (ConstraintLayout)view2;
                    if (object6 != null) {
                        n3 = R$id.rvp_seek_up;
                        Object object7 = view2 = dd2_2.a(n3, view);
                        object7 = (AjioImageView)view2;
                        if (object7 != null) {
                            n3 = R$id.rvp_your_avg_l;
                            Object object8 = view2 = dd2_2.a(n3, view);
                            object8 = (ConstraintLayout)view2;
                            if (object8 != null) {
                                n3 = R$id.seek_bar_layout;
                                Object object9 = view2 = dd2_2.a(n3, view);
                                object9 = (ConstraintLayout)view2;
                                if (object9 != null) {
                                    n3 = R$id.seek_barll;
                                    Object object10 = view2 = dd2_2.a(n3, view);
                                    object10 = (AjioImageView)view2;
                                    if (object10 != null) {
                                        n3 = R$id.tv_know_more;
                                        Object object11 = view2 = dd2_2.a(n3, view);
                                        object11 = (AjioTextView)view2;
                                        if (object11 != null) {
                                            n3 = R$id.tv_title;
                                            Object object12 = view2 = dd2_2.a(n3, view);
                                            object12 = (AjioTextView)view2;
                                            if (object12 != null) {
                                                n3 = R$id.your_avg_text;
                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                object13 = (AjioTextView)view2;
                                                if (object13 != null) {
                                                    n3 = R$id.zero_percent_view;
                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                    object14 = (AjioTextView)view2;
                                                    if (object14 != null) {
                                                        object = new IncentiviseSeekBarLayoutBinding((ConstraintLayout)((Object)object3), (AjioTextView)object2, (ConstraintLayout)((Object)object3), (AjioTextView)object4, (ConstraintLayout)((Object)object5), (ConstraintLayout)((Object)object6), (AjioImageView)((Object)object7), (ConstraintLayout)((Object)object8), (ConstraintLayout)((Object)object9), (AjioImageView)((Object)object10), (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14);
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
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static IncentiviseSeekBarLayoutBinding inflate(LayoutInflater layoutInflater) {
        return IncentiviseSeekBarLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static IncentiviseSeekBarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.incentivise_seek_bar_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IncentiviseSeekBarLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

