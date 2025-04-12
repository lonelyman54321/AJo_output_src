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
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RvpBottomSheetItemBinding
implements BC3 {
    public final AjioTextView ajioAvgText;
    public final AjioTextView avoidPenalityHeadingText;
    public final AjioCircularImageView avoidPenalityImage1;
    public final AjioCircularImageView avoidPenalityImage2;
    public final AjioCircularImageView avoidPenalityImage3;
    public final AjioTextView avoidPenalitySubText1;
    public final AjioTextView avoidPenalitySubText2;
    public final AjioTextView avoidPenalitySubText3;
    public final AjioTextView headerSubTitle;
    public final AjioTextView headerTitle;
    public final AjioTextView howItWorksHeadingText;
    public final AjioTextView howItWorksSubText;
    public final LinearLayout layoutPenalty1;
    public final LinearLayout layoutPenalty2;
    public final LinearLayout layoutPenalty3;
    public final LinearLayout layoutPenaltyParent;
    public final LinearLayout layoutPossibleActionItems;
    public final ConstraintLayout layoutSeekBar;
    public final AjioCircularImageView possibleActionImage1;
    public final AjioCircularImageView possibleActionImage2;
    public final AjioCircularImageView possibleActionImage3;
    public final AjioTextView possibleActionSubText1;
    public final AjioTextView possibleActionSubText2;
    public final AjioTextView possibleActionSubText3;
    public final AjioTextView possibleActionsHeadingText;
    private final LinearLayout rootView;
    public final ConstraintLayout rvpAjioAvgL;
    public final AjioTextView rvpCautionText;
    public final AjioImageView rvpSeekUp;
    public final ConstraintLayout rvpYourAvgL;
    public final LinearLayout seekBarLayout;
    public final AjioImageView seekBarll;
    public final AjioTextView yourAvgText;

    private RvpBottomSheetItemBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioCircularImageView ajioCircularImageView, AjioCircularImageView ajioCircularImageView2, AjioCircularImageView ajioCircularImageView3, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, ConstraintLayout constraintLayout, AjioCircularImageView ajioCircularImageView4, AjioCircularImageView ajioCircularImageView5, AjioCircularImageView ajioCircularImageView6, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13, ConstraintLayout constraintLayout2, AjioTextView ajioTextView14, AjioImageView ajioImageView, ConstraintLayout constraintLayout3, LinearLayout linearLayout7, AjioImageView ajioImageView2, AjioTextView ajioTextView15) {
        this.rootView = linearLayout;
        this.ajioAvgText = ajioTextView;
        this.avoidPenalityHeadingText = ajioTextView2;
        this.avoidPenalityImage1 = ajioCircularImageView;
        this.avoidPenalityImage2 = ajioCircularImageView2;
        this.avoidPenalityImage3 = ajioCircularImageView3;
        this.avoidPenalitySubText1 = ajioTextView3;
        this.avoidPenalitySubText2 = ajioTextView4;
        this.avoidPenalitySubText3 = ajioTextView5;
        this.headerSubTitle = ajioTextView6;
        this.headerTitle = ajioTextView7;
        this.howItWorksHeadingText = ajioTextView8;
        this.howItWorksSubText = ajioTextView9;
        this.layoutPenalty1 = linearLayout2;
        this.layoutPenalty2 = linearLayout3;
        this.layoutPenalty3 = linearLayout4;
        this.layoutPenaltyParent = linearLayout5;
        this.layoutPossibleActionItems = linearLayout6;
        this.layoutSeekBar = constraintLayout;
        this.possibleActionImage1 = ajioCircularImageView4;
        this.possibleActionImage2 = ajioCircularImageView5;
        this.possibleActionImage3 = ajioCircularImageView6;
        this.possibleActionSubText1 = ajioTextView10;
        this.possibleActionSubText2 = ajioTextView11;
        this.possibleActionSubText3 = ajioTextView12;
        this.possibleActionsHeadingText = ajioTextView13;
        this.rvpAjioAvgL = constraintLayout2;
        this.rvpCautionText = ajioTextView14;
        this.rvpSeekUp = ajioImageView;
        this.rvpYourAvgL = constraintLayout3;
        this.seekBarLayout = linearLayout7;
        this.seekBarll = ajioImageView2;
        this.yourAvgText = ajioTextView15;
    }

    public static RvpBottomSheetItemBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.ajio_avg_text;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.avoid_penality_heading_text;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.avoid_penality_image1;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioCircularImageView)view2;
                if (object4 != null) {
                    n3 = R$id.avoid_penality_image2;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioCircularImageView)view2;
                    if (object5 != null) {
                        n3 = R$id.avoid_penality_image3;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioCircularImageView)view2;
                        if (object6 != null) {
                            n3 = R$id.avoid_penality_sub_text1;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.avoid_penality_sub_text2;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.avoid_penality_sub_text3;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.header_sub_title;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.header_title;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (AjioTextView)view2;
                                            if (object11 != null) {
                                                n3 = R$id.how_it_works_heading_text;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (AjioTextView)view2;
                                                if (object12 != null) {
                                                    n3 = R$id.how_it_works_sub_text;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view2;
                                                    if (object13 != null) {
                                                        n3 = R$id.layout_penalty1;
                                                        View view3 = view2 = dd2_2.a(n3, view);
                                                        view3 = (LinearLayout)view2;
                                                        if (view3 != null) {
                                                            n3 = R$id.layout_penalty2;
                                                            View view4 = view2 = dd2_2.a(n3, view);
                                                            view4 = (LinearLayout)view2;
                                                            if (view4 != null) {
                                                                n3 = R$id.layout_penalty3;
                                                                View view5 = view2 = dd2_2.a(n3, view);
                                                                view5 = (LinearLayout)view2;
                                                                if (view5 != null) {
                                                                    n3 = R$id.layout_penalty_parent;
                                                                    View view6 = view2 = dd2_2.a(n3, view);
                                                                    view6 = (LinearLayout)view2;
                                                                    if (view6 != null) {
                                                                        n3 = R$id.layout_possible_action_items;
                                                                        View view7 = view2 = dd2_2.a(n3, view);
                                                                        view7 = (LinearLayout)view2;
                                                                        if (view7 != null) {
                                                                            n3 = R$id.layout_seek_bar;
                                                                            Object object14 = view2 = dd2_2.a(n3, view);
                                                                            object14 = (ConstraintLayout)view2;
                                                                            if (object14 != null) {
                                                                                n3 = R$id.possible_action_image1;
                                                                                Object object15 = view2 = dd2_2.a(n3, view);
                                                                                object15 = (AjioCircularImageView)view2;
                                                                                if (object15 != null) {
                                                                                    n3 = R$id.possible_action_image2;
                                                                                    Object object16 = view2 = dd2_2.a(n3, view);
                                                                                    object16 = (AjioCircularImageView)view2;
                                                                                    if (object16 != null) {
                                                                                        n3 = R$id.possible_action_image3;
                                                                                        Object object17 = view2 = dd2_2.a(n3, view);
                                                                                        object17 = (AjioCircularImageView)view2;
                                                                                        if (object17 != null) {
                                                                                            n3 = R$id.possible_action_sub_text1;
                                                                                            Object object18 = view2 = dd2_2.a(n3, view);
                                                                                            object18 = (AjioTextView)view2;
                                                                                            if (object18 != null) {
                                                                                                n3 = R$id.possible_action_sub_text2;
                                                                                                Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                object19 = (AjioTextView)view2;
                                                                                                if (object19 != null) {
                                                                                                    n3 = R$id.possible_action_sub_text3;
                                                                                                    Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                    object20 = (AjioTextView)view2;
                                                                                                    if (object20 != null) {
                                                                                                        n3 = R$id.possible_actions_heading_text;
                                                                                                        Object object21 = view2 = dd2_2.a(n3, view);
                                                                                                        object21 = (AjioTextView)view2;
                                                                                                        if (object21 != null) {
                                                                                                            n3 = R$id.rvp_ajio_avg_l;
                                                                                                            Object object22 = view2 = dd2_2.a(n3, view);
                                                                                                            object22 = (ConstraintLayout)view2;
                                                                                                            if (object22 != null) {
                                                                                                                n3 = R$id.rvp_caution_text;
                                                                                                                Object object23 = view2 = dd2_2.a(n3, view);
                                                                                                                object23 = (AjioTextView)view2;
                                                                                                                if (object23 != null) {
                                                                                                                    n3 = R$id.rvp_seek_up;
                                                                                                                    Object object24 = view2 = dd2_2.a(n3, view);
                                                                                                                    object24 = (AjioImageView)view2;
                                                                                                                    if (object24 != null) {
                                                                                                                        n3 = R$id.rvp_your_avg_l;
                                                                                                                        Object object25 = view2 = dd2_2.a(n3, view);
                                                                                                                        object25 = (ConstraintLayout)view2;
                                                                                                                        if (object25 != null) {
                                                                                                                            n3 = R$id.seek_bar_layout;
                                                                                                                            View view8 = view2 = dd2_2.a(n3, view);
                                                                                                                            view8 = (LinearLayout)view2;
                                                                                                                            if (view8 != null) {
                                                                                                                                n3 = R$id.seek_barll;
                                                                                                                                Object object26 = view2 = dd2_2.a(n3, view);
                                                                                                                                object26 = (AjioImageView)view2;
                                                                                                                                if (object26 != null) {
                                                                                                                                    n3 = R$id.your_avg_text;
                                                                                                                                    Object object27 = view2 = dd2_2.a(n3, view);
                                                                                                                                    object27 = (AjioTextView)view2;
                                                                                                                                    if (object27 != null) {
                                                                                                                                        View view9 = view;
                                                                                                                                        view9 = (LinearLayout)view;
                                                                                                                                        RvpBottomSheetItemBinding rvpBottomSheetItemBinding = new RvpBottomSheetItemBinding((LinearLayout)view9, (AjioTextView)object2, (AjioTextView)object3, (AjioCircularImageView)((Object)object4), (AjioCircularImageView)((Object)object5), (AjioCircularImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (LinearLayout)view3, (LinearLayout)view4, (LinearLayout)view5, (LinearLayout)view6, (LinearLayout)view7, (ConstraintLayout)((Object)object14), (AjioCircularImageView)((Object)object15), (AjioCircularImageView)((Object)object16), (AjioCircularImageView)((Object)object17), (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20, (AjioTextView)object21, (ConstraintLayout)((Object)object22), (AjioTextView)object23, (AjioImageView)((Object)object24), (ConstraintLayout)((Object)object25), (LinearLayout)view8, (AjioImageView)((Object)object26), (AjioTextView)object27);
                                                                                                                                        return rvpBottomSheetItemBinding;
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RvpBottomSheetItemBinding inflate(LayoutInflater layoutInflater) {
        return RvpBottomSheetItemBinding.inflate(layoutInflater, null, false);
    }

    public static RvpBottomSheetItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.rvp_bottom_sheet_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RvpBottomSheetItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

