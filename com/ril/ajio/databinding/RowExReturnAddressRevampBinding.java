/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowExReturnAddressRevampBinding
implements BC3 {
    public final ConstraintLayout clCard;
    public final ConstraintLayout clSelfShip;
    public final CardView cvAddress;
    public final CardView cvViewMore;
    public final AjioTextView exchangeReturnLabel;
    public final ImageView icUpDown;
    public final Guideline labBarrier;
    public final LinearLayout labLayout;
    public final RadioButton labRbSelection;
    public final TextView labTvAddress;
    public final TextView labTvDefault;
    public final TextView labTvDefaultNew;
    public final TextView labTvDelivered;
    public final TextView labTvExchange;
    public final TextView labTvName;
    public final TextView labTvPhone;
    public final TextView labTvPhoneHeader;
    public final TextView labTvReturnPickUp;
    public final View labVSep;
    public final AjioTextView lblHowSelfShipWorks;
    private final LinearLayout rootView;
    public final TextView tvOtherAddress;
    public final TextView tvViewMore;

    private RowExReturnAddressRevampBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CardView cardView, CardView cardView2, AjioTextView ajioTextView, ImageView imageView, Guideline guideline, LinearLayout linearLayout2, RadioButton radioButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, View view, AjioTextView ajioTextView2, TextView textView10, TextView textView11) {
        this.rootView = linearLayout;
        this.clCard = constraintLayout;
        this.clSelfShip = constraintLayout2;
        this.cvAddress = cardView;
        this.cvViewMore = cardView2;
        this.exchangeReturnLabel = ajioTextView;
        this.icUpDown = imageView;
        this.labBarrier = guideline;
        this.labLayout = linearLayout2;
        this.labRbSelection = radioButton;
        this.labTvAddress = textView;
        this.labTvDefault = textView2;
        this.labTvDefaultNew = textView3;
        this.labTvDelivered = textView4;
        this.labTvExchange = textView5;
        this.labTvName = textView6;
        this.labTvPhone = textView7;
        this.labTvPhoneHeader = textView8;
        this.labTvReturnPickUp = textView9;
        this.labVSep = view;
        this.lblHowSelfShipWorks = ajioTextView2;
        this.tvOtherAddress = textView10;
        this.tvViewMore = textView11;
    }

    public static RowExReturnAddressRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.clCard;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (ConstraintLayout)view2;
        if (object2 != null) {
            n3 = R$id.cl_self_ship;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (ConstraintLayout)view2;
            if (object3 != null) {
                n3 = R$id.cvAddress;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (CardView)view2;
                if (object4 != null) {
                    n3 = R$id.cvViewMore;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (CardView)view2;
                    if (object5 != null) {
                        n3 = R$id.exchangeReturnLabel;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.ic_up_down;
                            View view3 = view2 = dd2_2.a(n3, view);
                            view3 = (ImageView)view2;
                            if (view3 != null) {
                                n3 = R$id.labBarrier;
                                View view4 = view2 = dd2_2.a(n3, view);
                                view4 = (Guideline)view2;
                                if (view4 != null) {
                                    View view5 = view;
                                    view5 = (LinearLayout)view;
                                    n3 = R$id.labRbSelection;
                                    View view6 = view2 = dd2_2.a(n3, view);
                                    view6 = (RadioButton)view2;
                                    if (view6 != null) {
                                        n3 = R$id.labTvAddress;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (TextView)view2;
                                        if (view7 != null) {
                                            n3 = R$id.labTvDefault;
                                            View view8 = view2 = dd2_2.a(n3, view);
                                            view8 = (TextView)view2;
                                            if (view8 != null) {
                                                n3 = R$id.labTvDefaultNew;
                                                View view9 = view2 = dd2_2.a(n3, view);
                                                view9 = (TextView)view2;
                                                if (view9 != null) {
                                                    n3 = R$id.labTvDelivered;
                                                    View view10 = view2 = dd2_2.a(n3, view);
                                                    view10 = (TextView)view2;
                                                    if (view10 != null) {
                                                        n3 = R$id.labTvExchange;
                                                        View view11 = view2 = dd2_2.a(n3, view);
                                                        view11 = (TextView)view2;
                                                        if (view11 != null) {
                                                            n3 = R$id.labTvName;
                                                            View view12 = view2 = dd2_2.a(n3, view);
                                                            view12 = (TextView)view2;
                                                            if (view12 != null) {
                                                                n3 = R$id.labTvPhone;
                                                                View view13 = view2 = dd2_2.a(n3, view);
                                                                view13 = (TextView)view2;
                                                                if (view13 != null) {
                                                                    n3 = R$id.labTvPhoneHeader;
                                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                                    view14 = (TextView)view2;
                                                                    if (view14 != null) {
                                                                        View view15;
                                                                        n3 = R$id.labTvReturnPickUp;
                                                                        View view16 = view2 = dd2_2.a(n3, view);
                                                                        view16 = (TextView)view2;
                                                                        if (view16 != null && (view15 = dd2_2.a(n3 = R$id.labVSep, view)) != null) {
                                                                            n3 = R$id.lbl_how_self_ship_works;
                                                                            Object object7 = view2 = dd2_2.a(n3, view);
                                                                            object7 = (AjioTextView)view2;
                                                                            if (object7 != null) {
                                                                                n3 = R$id.tv_other_address;
                                                                                View view17 = view2 = dd2_2.a(n3, view);
                                                                                view17 = (TextView)view2;
                                                                                if (view17 != null) {
                                                                                    n3 = R$id.tv_view_more;
                                                                                    View view18 = view2 = dd2_2.a(n3, view);
                                                                                    view18 = (TextView)view2;
                                                                                    if (view18 != null) {
                                                                                        object = new RowExReturnAddressRevampBinding((LinearLayout)view5, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (CardView)((Object)object4), (CardView)((Object)object5), (AjioTextView)object6, (ImageView)view3, (Guideline)view4, (LinearLayout)view5, (RadioButton)view6, (TextView)view7, (TextView)view8, (TextView)view9, (TextView)view10, (TextView)view11, (TextView)view12, (TextView)view13, (TextView)view14, (TextView)view16, view15, (AjioTextView)object7, (TextView)view17, (TextView)view18);
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

    public static RowExReturnAddressRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowExReturnAddressRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowExReturnAddressRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_ex_return_address_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowExReturnAddressRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

