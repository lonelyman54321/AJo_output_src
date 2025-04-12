/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentEarnedPointsBottomSheetBinding
implements BC3 {
    public final View fepbsClose;
    public final ImageView fepbsIvClose;
    public final ConstraintLayout fepbsLayoutAW;
    public final LinearLayout fepbsLayoutContent;
    public final ConstraintLayout fepbsLayoutLR;
    public final ConstraintLayout fepbsLayoutR1;
    public final TextView fepbsTvEarnedPoints;
    public final TextView fepbsTvLR;
    public final TextView fepbsTvLRHeader;
    public final TextView fepbsTvR1;
    public final TextView fepbsTvR1Header;
    public final TextView fepbsTvWallet;
    public final TextView fepbsTvWalletHeader;
    public final TextView fepbsTvWalletIn;
    public final ImageView oselrIvLogo;
    public final View pointsVSep1;
    public final View pointsVSep2;
    private final ConstraintLayout rootView;

    private FragmentEarnedPointsBottomSheetBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ImageView imageView2, View view2, View view3) {
        this.rootView = constraintLayout;
        this.fepbsClose = view;
        this.fepbsIvClose = imageView;
        this.fepbsLayoutAW = constraintLayout2;
        this.fepbsLayoutContent = linearLayout;
        this.fepbsLayoutLR = constraintLayout3;
        this.fepbsLayoutR1 = constraintLayout4;
        this.fepbsTvEarnedPoints = textView;
        this.fepbsTvLR = textView2;
        this.fepbsTvLRHeader = textView3;
        this.fepbsTvR1 = textView4;
        this.fepbsTvR1Header = textView5;
        this.fepbsTvWallet = textView6;
        this.fepbsTvWalletHeader = textView7;
        this.fepbsTvWalletIn = textView8;
        this.oselrIvLogo = imageView2;
        this.pointsVSep1 = view2;
        this.pointsVSep2 = view3;
    }

    public static FragmentEarnedPointsBottomSheetBinding bind(View view) {
        Object object = view;
        int n3 = R$id.fepbsClose;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            Object object2;
            n3 = R$id.fepbsIvClose;
            View view3 = object2 = dd2_2.a(n3, view);
            view3 = (ImageView)object2;
            if (view3 != null) {
                n3 = R$id.fepbsLayoutAW;
                Object object3 = object2 = dd2_2.a(n3, view);
                object3 = (ConstraintLayout)((Object)object2);
                if (object3 != null) {
                    n3 = R$id.fepbsLayoutContent;
                    View view4 = object2 = dd2_2.a(n3, view);
                    view4 = (LinearLayout)object2;
                    if (view4 != null) {
                        n3 = R$id.fepbsLayoutLR;
                        Object object4 = object2 = dd2_2.a(n3, view);
                        object4 = (ConstraintLayout)((Object)object2);
                        if (object4 != null) {
                            n3 = R$id.fepbsLayoutR1;
                            Object object5 = object2 = dd2_2.a(n3, view);
                            object5 = (ConstraintLayout)((Object)object2);
                            if (object5 != null) {
                                n3 = R$id.fepbsTvEarnedPoints;
                                View view5 = object2 = dd2_2.a(n3, view);
                                view5 = (TextView)object2;
                                if (view5 != null) {
                                    n3 = R$id.fepbsTvLR;
                                    View view6 = object2 = dd2_2.a(n3, view);
                                    view6 = (TextView)object2;
                                    if (view6 != null) {
                                        n3 = R$id.fepbsTvLRHeader;
                                        View view7 = object2 = dd2_2.a(n3, view);
                                        view7 = (TextView)object2;
                                        if (view7 != null) {
                                            n3 = R$id.fepbsTvR1;
                                            View view8 = object2 = dd2_2.a(n3, view);
                                            view8 = (TextView)object2;
                                            if (view8 != null) {
                                                n3 = R$id.fepbsTvR1Header;
                                                View view9 = object2 = dd2_2.a(n3, view);
                                                view9 = (TextView)object2;
                                                if (view9 != null) {
                                                    n3 = R$id.fepbsTvWallet;
                                                    View view10 = object2 = dd2_2.a(n3, view);
                                                    view10 = (TextView)object2;
                                                    if (view10 != null) {
                                                        n3 = R$id.fepbsTvWalletHeader;
                                                        View view11 = object2 = dd2_2.a(n3, view);
                                                        view11 = (TextView)object2;
                                                        if (view11 != null) {
                                                            n3 = R$id.fepbsTvWalletIn;
                                                            View view12 = object2 = dd2_2.a(n3, view);
                                                            view12 = (TextView)object2;
                                                            if (view12 != null) {
                                                                View view13;
                                                                View view14;
                                                                n3 = R$id.oselrIvLogo;
                                                                View view15 = object2 = dd2_2.a(n3, view);
                                                                view15 = (ImageView)object2;
                                                                if (view15 != null && (view14 = dd2_2.a(n3 = R$id.pointsVSep1, view)) != null && (view13 = dd2_2.a(n3 = R$id.pointsVSep2, view)) != null) {
                                                                    FragmentEarnedPointsBottomSheetBinding fragmentEarnedPointsBottomSheetBinding;
                                                                    object2 = fragmentEarnedPointsBottomSheetBinding;
                                                                    Object object6 = view;
                                                                    object6 = (ConstraintLayout)view;
                                                                    fragmentEarnedPointsBottomSheetBinding = new FragmentEarnedPointsBottomSheetBinding((ConstraintLayout)((Object)object6), view2, (ImageView)view3, (ConstraintLayout)((Object)object3), (LinearLayout)view4, (ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object5), (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8, (TextView)view9, (TextView)view10, (TextView)view11, (TextView)view12, (ImageView)view15, view14, view13);
                                                                    return fragmentEarnedPointsBottomSheetBinding;
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

    public static FragmentEarnedPointsBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return FragmentEarnedPointsBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentEarnedPointsBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_earned_points_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentEarnedPointsBottomSheetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

