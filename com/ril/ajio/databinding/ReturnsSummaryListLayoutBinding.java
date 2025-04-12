/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TableLayout
 *  android.widget.TableRow
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnsSummaryListLayoutBinding
implements BC3 {
    public final AjioTextView color;
    public final AjioTextView currentStatus;
    public final RelativeLayout dataLayout;
    public final View divider;
    public final AjioAspectRatioImageView imgProduct;
    public final RelativeLayout itemDetailsContainer;
    public final AjioTextView itemName;
    public final AjioTextView quantity;
    private final RelativeLayout rootView;
    public final AjioTextView size;
    public final TableLayout tableLayout;
    public final TableRow tableRow1;
    public final TableRow tableRow2;

    private ReturnsSummaryListLayoutBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout2, View view, AjioAspectRatioImageView ajioAspectRatioImageView, RelativeLayout relativeLayout3, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, TableLayout tableLayout, TableRow tableRow, TableRow tableRow2) {
        this.rootView = relativeLayout;
        this.color = ajioTextView;
        this.currentStatus = ajioTextView2;
        this.dataLayout = relativeLayout2;
        this.divider = view;
        this.imgProduct = ajioAspectRatioImageView;
        this.itemDetailsContainer = relativeLayout3;
        this.itemName = ajioTextView3;
        this.quantity = ajioTextView4;
        this.size = ajioTextView5;
        this.tableLayout = tableLayout;
        this.tableRow1 = tableRow;
        this.tableRow2 = tableRow2;
    }

    public static ReturnsSummaryListLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.color;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.current_status;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                View view3;
                n3 = R$id.data_layout;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (RelativeLayout)view2;
                if (view4 != null && (view3 = dd2_2.a(n3 = R$id.divider, view)) != null) {
                    n3 = R$id.img_product;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioAspectRatioImageView)view2;
                    if (object4 != null) {
                        n3 = R$id.item_details_container;
                        View view5 = view2 = dd2_2.a(n3, view);
                        view5 = (RelativeLayout)view2;
                        if (view5 != null) {
                            n3 = R$id.item_name;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioTextView)view2;
                            if (object5 != null) {
                                n3 = R$id.quantity;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AjioTextView)view2;
                                if (object6 != null) {
                                    n3 = R$id.size;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioTextView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.table_layout;
                                        View view6 = view2 = dd2_2.a(n3, view);
                                        view6 = (TableLayout)view2;
                                        if (view6 != null) {
                                            n3 = R$id.tableRow1;
                                            View view7 = view2 = dd2_2.a(n3, view);
                                            view7 = (TableRow)view2;
                                            if (view7 != null) {
                                                n3 = R$id.tableRow2;
                                                View view8 = view2 = dd2_2.a(n3, view);
                                                view8 = (TableRow)view2;
                                                if (view8 != null) {
                                                    View view9 = view;
                                                    view9 = (RelativeLayout)view;
                                                    ReturnsSummaryListLayoutBinding returnsSummaryListLayoutBinding = new ReturnsSummaryListLayoutBinding((RelativeLayout)view9, (AjioTextView)object2, (AjioTextView)object3, (RelativeLayout)view4, view3, (AjioAspectRatioImageView)((Object)object4), (RelativeLayout)view5, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (TableLayout)view6, (TableRow)view7, (TableRow)view8);
                                                    return returnsSummaryListLayoutBinding;
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

    public static ReturnsSummaryListLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ReturnsSummaryListLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnsSummaryListLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.returns_summary_list_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnsSummaryListLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

