/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentCccontactUsRefreshBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final TextView ccContactusDividerCallme;
    public final TextView ccContactusDividerChat;
    public final TextView ccContactusDividerHelpOne;
    public final TextView ccContactusDividerHelpTwo;
    public final AppCompatImageView ccContactusImvCallme;
    public final AppCompatImageView ccContactusImvChat;
    public final AppCompatImageView ccContactusImvEmail;
    public final AppCompatImageView ccContactusImvHelp;
    public final AppCompatImageView ccContactusImvHelpTwo;
    public final ConstraintLayout ccContactusLayoutCallme;
    public final ConstraintLayout ccContactusLayoutChat;
    public final ConstraintLayout ccContactusLayoutEmail;
    public final ConstraintLayout ccContactusLayoutHelpOne;
    public final ConstraintLayout ccContactusLayoutHelpTwo;
    public final TextView ccContactusLblCallme;
    public final TextView ccContactusLblCallmeInfo;
    public final TextView ccContactusLblChat;
    public final TextView ccContactusLblChatInfo;
    public final TextView ccContactusLblEmail;
    public final TextView ccContactusLblHelplineOne;
    public final TextView ccContactusLblHelplineTwo;
    public final TextView ccContactusLblInfo;
    public final TextView ccContactusLblInfoOne;
    public final TextView ccContactusLblInfoTwo;
    public final AjioTextView ccContactusLblNumberOne;
    public final TextView ccContactusLblNumberTwo;
    public final AjioProgressView ccContactusProgressBar;
    public final TextView ccContactusTvCallme;
    public final TextView ccContactusTvChat;
    public final TextView ccContactusTvEmailid;
    public final ConstraintLayout parentLayout;
    private final LinearLayout rootView;
    public final TextView rowCcContactusTvTitle;

    private FragmentCccontactUsRefreshBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, AjioTextView ajioTextView, TextView textView15, AjioProgressView ajioProgressView, TextView textView16, TextView textView17, TextView textView18, ConstraintLayout constraintLayout6, TextView textView19) {
        this.rootView = linearLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.ccContactusDividerCallme = textView;
        this.ccContactusDividerChat = textView2;
        this.ccContactusDividerHelpOne = textView3;
        this.ccContactusDividerHelpTwo = textView4;
        this.ccContactusImvCallme = appCompatImageView;
        this.ccContactusImvChat = appCompatImageView2;
        this.ccContactusImvEmail = appCompatImageView3;
        this.ccContactusImvHelp = appCompatImageView4;
        this.ccContactusImvHelpTwo = appCompatImageView5;
        this.ccContactusLayoutCallme = constraintLayout;
        this.ccContactusLayoutChat = constraintLayout2;
        this.ccContactusLayoutEmail = constraintLayout3;
        this.ccContactusLayoutHelpOne = constraintLayout4;
        this.ccContactusLayoutHelpTwo = constraintLayout5;
        this.ccContactusLblCallme = textView5;
        this.ccContactusLblCallmeInfo = textView6;
        this.ccContactusLblChat = textView7;
        this.ccContactusLblChatInfo = textView8;
        this.ccContactusLblEmail = textView9;
        this.ccContactusLblHelplineOne = textView10;
        this.ccContactusLblHelplineTwo = textView11;
        this.ccContactusLblInfo = textView12;
        this.ccContactusLblInfoOne = textView13;
        this.ccContactusLblInfoTwo = textView14;
        this.ccContactusLblNumberOne = ajioTextView;
        this.ccContactusLblNumberTwo = textView15;
        this.ccContactusProgressBar = ajioProgressView;
        this.ccContactusTvCallme = textView16;
        this.ccContactusTvChat = textView17;
        this.ccContactusTvEmailid = textView18;
        this.parentLayout = constraintLayout6;
        this.rowCcContactusTvTitle = textView19;
    }

    public static FragmentCccontactUsRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cancelBtn;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.cancelContainer;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (FrameLayout)view2;
            if (view4 != null) {
                n3 = R$id.cc_contactus_divider_callme;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.cc_contactus_divider_chat;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.cc_contactus_divider_help_one;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (TextView)view2;
                        if (view7 != null) {
                            n3 = R$id.cc_contactus_divider_help_two;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (TextView)view2;
                            if (view8 != null) {
                                n3 = R$id.cc_contactus_imv_callme;
                                Object object2 = view2 = dd2_2.a(n3, view);
                                object2 = (AppCompatImageView)view2;
                                if (object2 != null) {
                                    n3 = R$id.cc_contactus_imv_chat;
                                    Object object3 = view2 = dd2_2.a(n3, view);
                                    object3 = (AppCompatImageView)view2;
                                    if (object3 != null) {
                                        n3 = R$id.cc_contactus_imv_email;
                                        Object object4 = view2 = dd2_2.a(n3, view);
                                        object4 = (AppCompatImageView)view2;
                                        if (object4 != null) {
                                            n3 = R$id.cc_contactus_imv_help;
                                            Object object5 = view2 = dd2_2.a(n3, view);
                                            object5 = (AppCompatImageView)view2;
                                            if (object5 != null) {
                                                n3 = R$id.cc_contactus_imv_help_two;
                                                Object object6 = view2 = dd2_2.a(n3, view);
                                                object6 = (AppCompatImageView)view2;
                                                if (object6 != null) {
                                                    n3 = R$id.cc_contactus_layout_callme;
                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                    object7 = (ConstraintLayout)view2;
                                                    if (object7 != null) {
                                                        n3 = R$id.cc_contactus_layout_chat;
                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                        object8 = (ConstraintLayout)view2;
                                                        if (object8 != null) {
                                                            n3 = R$id.cc_contactus_layout_email;
                                                            Object object9 = view2 = dd2_2.a(n3, view);
                                                            object9 = (ConstraintLayout)view2;
                                                            if (object9 != null) {
                                                                n3 = R$id.cc_contactus_layout_help_one;
                                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                                object10 = (ConstraintLayout)view2;
                                                                if (object10 != null) {
                                                                    n3 = R$id.cc_contactus_layout_help_two;
                                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                                    object11 = (ConstraintLayout)view2;
                                                                    if (object11 != null) {
                                                                        n3 = R$id.cc_contactus_lbl_callme;
                                                                        View view9 = view2 = dd2_2.a(n3, view);
                                                                        view9 = (TextView)view2;
                                                                        if (view9 != null) {
                                                                            n3 = R$id.cc_contactus_lbl_callme_info;
                                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                                            view10 = (TextView)view2;
                                                                            if (view10 != null) {
                                                                                n3 = R$id.cc_contactus_lbl_chat;
                                                                                View view11 = view2 = dd2_2.a(n3, view);
                                                                                view11 = (TextView)view2;
                                                                                if (view11 != null) {
                                                                                    n3 = R$id.cc_contactus_lbl_chat_info;
                                                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                                                    view12 = (TextView)view2;
                                                                                    if (view12 != null) {
                                                                                        n3 = R$id.cc_contactus_lbl_email;
                                                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                                                        view13 = (TextView)view2;
                                                                                        if (view13 != null) {
                                                                                            n3 = R$id.cc_contactus_lbl_helpline_one;
                                                                                            View view14 = view2 = dd2_2.a(n3, view);
                                                                                            view14 = (TextView)view2;
                                                                                            if (view14 != null) {
                                                                                                n3 = R$id.cc_contactus_lbl_helpline_two;
                                                                                                View view15 = view2 = dd2_2.a(n3, view);
                                                                                                view15 = (TextView)view2;
                                                                                                if (view15 != null) {
                                                                                                    n3 = R$id.cc_contactus_lbl_info;
                                                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                                                    view16 = (TextView)view2;
                                                                                                    if (view16 != null) {
                                                                                                        n3 = R$id.cc_contactus_lbl_info_one;
                                                                                                        View view17 = view2 = dd2_2.a(n3, view);
                                                                                                        view17 = (TextView)view2;
                                                                                                        if (view17 != null) {
                                                                                                            n3 = R$id.cc_contactus_lbl_info_two;
                                                                                                            View view18 = view2 = dd2_2.a(n3, view);
                                                                                                            view18 = (TextView)view2;
                                                                                                            if (view18 != null) {
                                                                                                                n3 = R$id.cc_contactus_lbl_number_one;
                                                                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                                                                object12 = (AjioTextView)view2;
                                                                                                                if (object12 != null) {
                                                                                                                    n3 = R$id.cc_contactus_lbl_number_two;
                                                                                                                    View view19 = view2 = dd2_2.a(n3, view);
                                                                                                                    view19 = (TextView)view2;
                                                                                                                    if (view19 != null) {
                                                                                                                        n3 = R$id.cc_contactus_progress_bar;
                                                                                                                        Object object13 = view2 = dd2_2.a(n3, view);
                                                                                                                        object13 = (AjioProgressView)view2;
                                                                                                                        if (object13 != null) {
                                                                                                                            n3 = R$id.cc_contactus_tv_callme;
                                                                                                                            View view20 = view2 = dd2_2.a(n3, view);
                                                                                                                            view20 = (TextView)view2;
                                                                                                                            if (view20 != null) {
                                                                                                                                n3 = R$id.cc_contactus_tv_chat;
                                                                                                                                View view21 = view2 = dd2_2.a(n3, view);
                                                                                                                                view21 = (TextView)view2;
                                                                                                                                if (view21 != null) {
                                                                                                                                    n3 = R$id.cc_contactus_tv_emailid;
                                                                                                                                    View view22 = view2 = dd2_2.a(n3, view);
                                                                                                                                    view22 = (TextView)view2;
                                                                                                                                    if (view22 != null) {
                                                                                                                                        n3 = R$id.parent_layout;
                                                                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                                                                        object14 = (ConstraintLayout)view2;
                                                                                                                                        if (object14 != null) {
                                                                                                                                            n3 = R$id.row_cc_contactus_tv_title;
                                                                                                                                            View view23 = view2 = dd2_2.a(n3, view);
                                                                                                                                            view23 = (TextView)view2;
                                                                                                                                            if (view23 != null) {
                                                                                                                                                View view24 = view;
                                                                                                                                                view24 = (LinearLayout)view;
                                                                                                                                                FragmentCccontactUsRefreshBinding fragmentCccontactUsRefreshBinding = new FragmentCccontactUsRefreshBinding((LinearLayout)view24, (ImageView)view3, (FrameLayout)view4, (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8, (AppCompatImageView)((Object)object2), (AppCompatImageView)((Object)object3), (AppCompatImageView)((Object)object4), (AppCompatImageView)((Object)object5), (AppCompatImageView)((Object)object6), (ConstraintLayout)((Object)object7), (ConstraintLayout)((Object)object8), (ConstraintLayout)((Object)object9), (ConstraintLayout)((Object)object10), (ConstraintLayout)((Object)object11), (TextView)view9, (TextView)view10, (TextView)view11, (TextView)view12, (TextView)view13, (TextView)view14, (TextView)view15, (TextView)view16, (TextView)view17, (TextView)view18, (AjioTextView)object12, (TextView)view19, (AjioProgressView)((Object)object13), (TextView)view20, (TextView)view21, (TextView)view22, (ConstraintLayout)((Object)object14), (TextView)view23);
                                                                                                                                                return fragmentCccontactUsRefreshBinding;
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
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentCccontactUsRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCccontactUsRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCccontactUsRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cccontact_us_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCccontactUsRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

