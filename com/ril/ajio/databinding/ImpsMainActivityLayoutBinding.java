/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ImpsMainActivityLayoutBinding
implements BC3 {
    public final Toolbar alfToolbar;
    public final AppBarLayout appBarLayout;
    public final CardView cardViewBtn;
    public final CollapsingToolbarLayout collapseToolBar;
    public final FrameLayout fragmentContainer;
    public final LinearLayout llBottomButton;
    public final NestedScrollView nestedScrollView;
    public final AjioTextView otpText;
    public final AjioProgressView progressview;
    private final CoordinatorLayout rootView;
    public final AjioTextView submitButton;

    private ImpsMainActivityLayoutBinding(CoordinatorLayout coordinatorLayout, Toolbar toolbar, AppBarLayout appBarLayout, CardView cardView, CollapsingToolbarLayout collapsingToolbarLayout, FrameLayout frameLayout, LinearLayout linearLayout, NestedScrollView nestedScrollView, AjioTextView ajioTextView, AjioProgressView ajioProgressView, AjioTextView ajioTextView2) {
        this.rootView = coordinatorLayout;
        this.alfToolbar = toolbar;
        this.appBarLayout = appBarLayout;
        this.cardViewBtn = cardView;
        this.collapseToolBar = collapsingToolbarLayout;
        this.fragmentContainer = frameLayout;
        this.llBottomButton = linearLayout;
        this.nestedScrollView = nestedScrollView;
        this.otpText = ajioTextView;
        this.progressview = ajioProgressView;
        this.submitButton = ajioTextView2;
    }

    public static ImpsMainActivityLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.alfToolbar;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (Toolbar)view;
        if (object2 != null) {
            n3 = R$id.appBarLayout;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppBarLayout)view;
            if (object3 != null) {
                n3 = R$id.card_view_btn;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (CardView)view;
                if (object4 != null) {
                    n3 = R$id.collapseToolBar;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (CollapsingToolbarLayout)view;
                    if (object5 != null) {
                        n3 = R$id.fragment_container;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (FrameLayout)view;
                        if (view2 != null) {
                            n3 = R$id.llBottomButton;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (LinearLayout)view;
                            if (view3 != null) {
                                n3 = R$id.nestedScrollView;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (NestedScrollView)view;
                                if (object6 != null) {
                                    n3 = R$id.otp_text;
                                    Object object7 = view = dd2_2.a(n3, object);
                                    object7 = (AjioTextView)view;
                                    if (object7 != null) {
                                        n3 = R$id.progressview;
                                        Object object8 = view = dd2_2.a(n3, object);
                                        object8 = (AjioProgressView)view;
                                        if (object8 != null) {
                                            n3 = R$id.submit_button;
                                            Object object9 = view = dd2_2.a(n3, object);
                                            object9 = (AjioTextView)view;
                                            if (object9 != null) {
                                                Object object10 = object;
                                                object10 = (CoordinatorLayout)object;
                                                ImpsMainActivityLayoutBinding impsMainActivityLayoutBinding = new ImpsMainActivityLayoutBinding((CoordinatorLayout)object10, (Toolbar)object2, (AppBarLayout)object3, (CardView)((Object)object4), (CollapsingToolbarLayout)((Object)object5), (FrameLayout)view2, (LinearLayout)view3, (NestedScrollView)object6, (AjioTextView)object7, (AjioProgressView)((Object)object8), (AjioTextView)object9);
                                                return impsMainActivityLayoutBinding;
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

    public static ImpsMainActivityLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ImpsMainActivityLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ImpsMainActivityLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.imps_main_activity_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ImpsMainActivityLayoutBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

