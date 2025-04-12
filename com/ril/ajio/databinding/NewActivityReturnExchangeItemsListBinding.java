/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.SubtitleCollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.databinding.ReturnFeeStripBinding;

public final class NewActivityReturnExchangeItemsListBinding
implements BC3 {
    public final ConstraintLayout activityReturnExchangeItemsList;
    public final Toolbar alfToolbar;
    public final TextView alfTvReturnInfo;
    public final AppBarLayout appLayout;
    public final AjioButton exchangeItemsListCancel;
    public final AjioButton exchangeItemsListProceed;
    public final RecyclerView exchangeReturnItemsListview;
    public final LinearLayout filterFooterLayout;
    public final LinearLayout footerLayoutParent;
    public final ReturnFeeStripBinding returnFeeStrip;
    private final ConstraintLayout rootView;
    public final SubtitleCollapsingToolbarLayout selectionToolbar;

    private NewActivityReturnExchangeItemsListBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Toolbar toolbar, TextView textView, AppBarLayout appBarLayout, AjioButton ajioButton, AjioButton ajioButton2, RecyclerView recyclerView, LinearLayout linearLayout, LinearLayout linearLayout2, ReturnFeeStripBinding returnFeeStripBinding, SubtitleCollapsingToolbarLayout subtitleCollapsingToolbarLayout) {
        this.rootView = constraintLayout;
        this.activityReturnExchangeItemsList = constraintLayout2;
        this.alfToolbar = toolbar;
        this.alfTvReturnInfo = textView;
        this.appLayout = appBarLayout;
        this.exchangeItemsListCancel = ajioButton;
        this.exchangeItemsListProceed = ajioButton2;
        this.exchangeReturnItemsListview = recyclerView;
        this.filterFooterLayout = linearLayout;
        this.footerLayoutParent = linearLayout2;
        this.returnFeeStrip = returnFeeStripBinding;
        this.selectionToolbar = subtitleCollapsingToolbarLayout;
    }

    public static NewActivityReturnExchangeItemsListBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.alfToolbar;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (Toolbar)view;
        if (object3 != null) {
            n3 = R$id.alfTvReturnInfo;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.app_layout;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AppBarLayout)view;
                if (object4 != null) {
                    n3 = R$id.exchange_items_list_cancel;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioButton)view;
                    if (object5 != null) {
                        n3 = R$id.exchange_items_list_proceed;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioButton)view;
                        if (object6 != null) {
                            n3 = R$id.exchange_return_items_listview;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (RecyclerView)view;
                            if (object7 != null) {
                                n3 = R$id.filter_footer_layout;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (LinearLayout)view;
                                if (view3 != null) {
                                    n3 = R$id.footer_layout_parent;
                                    View view4 = view = dd2_2.a(n3, object);
                                    view4 = (LinearLayout)view;
                                    if (view4 != null && (view = dd2_2.a(n3 = R$id.return_fee_strip, object)) != null) {
                                        ReturnFeeStripBinding returnFeeStripBinding = ReturnFeeStripBinding.bind(view);
                                        n3 = R$id.selection_toolbar;
                                        Object object8 = view = dd2_2.a(n3, object);
                                        object8 = (SubtitleCollapsingToolbarLayout)view;
                                        if (object8 != null) {
                                            Object object9 = object;
                                            view = object2;
                                            object = new NewActivityReturnExchangeItemsListBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (Toolbar)object3, (TextView)view2, (AppBarLayout)object4, (AjioButton)object5, (AjioButton)object6, (RecyclerView)object7, (LinearLayout)view3, (LinearLayout)view4, returnFeeStripBinding, (SubtitleCollapsingToolbarLayout)((Object)object8));
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewActivityReturnExchangeItemsListBinding inflate(LayoutInflater layoutInflater) {
        return NewActivityReturnExchangeItemsListBinding.inflate(layoutInflater, null, false);
    }

    public static NewActivityReturnExchangeItemsListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_activity_return_exchange_items_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewActivityReturnExchangeItemsListBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

