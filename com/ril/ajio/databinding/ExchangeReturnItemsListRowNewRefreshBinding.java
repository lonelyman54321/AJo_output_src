/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TableLayout
 *  android.widget.TableRow
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ExchangeReturnItemsListRowNewRefreshBinding
implements BC3 {
    public final LinearLayout costLayout;
    public final RelativeLayout dataLayout;
    public final RelativeLayout exchangeItemsDetailsLayout;
    public final AjioTextView idConvenienceFee;
    public final AjioRoundedCornerImageView imgProduct;
    public final AjioTextView itemActualCost;
    public final RelativeLayout itemDetailsContainer;
    public final AjioTextView itemName;
    public final AjioTextView itemOriginalPrice;
    public final LinearLayout liConvenienceFee;
    public final AjioTextView quantity;
    public final AjioTextView quantityLabel;
    public final AjioTextView returnExchangeMessageTv;
    private final LinearLayout rootView;
    public final AjioCircularImageView selectedIconExchange;
    public final AjioTextView size;
    public final TableLayout tableLayout;
    public final TableRow tableRow1;
    public final AjioTextView tvBrandName;
    public final AjioTextView tvViewBreakup;

    private ExchangeReturnItemsListRowNewRefreshBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AjioTextView ajioTextView, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView2, RelativeLayout relativeLayout3, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayout linearLayout3, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioCircularImageView ajioCircularImageView, AjioTextView ajioTextView8, TableLayout tableLayout, TableRow tableRow, AjioTextView ajioTextView9, AjioTextView ajioTextView10) {
        this.rootView = linearLayout;
        this.costLayout = linearLayout2;
        this.dataLayout = relativeLayout;
        this.exchangeItemsDetailsLayout = relativeLayout2;
        this.idConvenienceFee = ajioTextView;
        this.imgProduct = ajioRoundedCornerImageView;
        this.itemActualCost = ajioTextView2;
        this.itemDetailsContainer = relativeLayout3;
        this.itemName = ajioTextView3;
        this.itemOriginalPrice = ajioTextView4;
        this.liConvenienceFee = linearLayout3;
        this.quantity = ajioTextView5;
        this.quantityLabel = ajioTextView6;
        this.returnExchangeMessageTv = ajioTextView7;
        this.selectedIconExchange = ajioCircularImageView;
        this.size = ajioTextView8;
        this.tableLayout = tableLayout;
        this.tableRow1 = tableRow;
        this.tvBrandName = ajioTextView9;
        this.tvViewBreakup = ajioTextView10;
    }

    public static ExchangeReturnItemsListRowNewRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cost_layout;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n3 = R$id.data_layout;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (RelativeLayout)view2;
            if (view4 != null) {
                n3 = R$id.exchange_items_details_layout;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (RelativeLayout)view2;
                if (view5 != null) {
                    n3 = R$id.id_convenience_fee;
                    Object object2 = view2 = dd2_2.a(n3, view);
                    object2 = (AjioTextView)view2;
                    if (object2 != null) {
                        n3 = R$id.img_product;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioRoundedCornerImageView)view2;
                        if (object3 != null) {
                            n3 = R$id.item_actual_cost;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (AjioTextView)view2;
                            if (object4 != null) {
                                n3 = R$id.item_details_container;
                                View view6 = view2 = dd2_2.a(n3, view);
                                view6 = (RelativeLayout)view2;
                                if (view6 != null) {
                                    n3 = R$id.item_name;
                                    Object object5 = view2 = dd2_2.a(n3, view);
                                    object5 = (AjioTextView)view2;
                                    if (object5 != null) {
                                        n3 = R$id.item_original_price;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (AjioTextView)view2;
                                        if (object6 != null) {
                                            n3 = R$id.li_convenience_fee;
                                            View view7 = view2 = dd2_2.a(n3, view);
                                            view7 = (LinearLayout)view2;
                                            if (view7 != null) {
                                                n3 = R$id.quantity;
                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                object7 = (AjioTextView)view2;
                                                if (object7 != null) {
                                                    n3 = R$id.quantity_label;
                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                    object8 = (AjioTextView)view2;
                                                    if (object8 != null) {
                                                        n3 = R$id.return_exchange_message_tv;
                                                        Object object9 = view2 = dd2_2.a(n3, view);
                                                        object9 = (AjioTextView)view2;
                                                        if (object9 != null) {
                                                            n3 = R$id.selected_icon_exchange;
                                                            Object object10 = view2 = dd2_2.a(n3, view);
                                                            object10 = (AjioCircularImageView)view2;
                                                            if (object10 != null) {
                                                                n3 = R$id.size;
                                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                                object11 = (AjioTextView)view2;
                                                                if (object11 != null) {
                                                                    n3 = R$id.table_layout;
                                                                    View view8 = view2 = dd2_2.a(n3, view);
                                                                    view8 = (TableLayout)view2;
                                                                    if (view8 != null) {
                                                                        n3 = R$id.tableRow1;
                                                                        View view9 = view2 = dd2_2.a(n3, view);
                                                                        view9 = (TableRow)view2;
                                                                        if (view9 != null) {
                                                                            n3 = R$id.tv_brand_name;
                                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                                            object12 = (AjioTextView)view2;
                                                                            if (object12 != null) {
                                                                                n3 = R$id.tv_view_breakup;
                                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                                object13 = (AjioTextView)view2;
                                                                                if (object13 != null) {
                                                                                    View view10 = view;
                                                                                    view10 = (LinearLayout)view;
                                                                                    ExchangeReturnItemsListRowNewRefreshBinding exchangeReturnItemsListRowNewRefreshBinding = new ExchangeReturnItemsListRowNewRefreshBinding((LinearLayout)view10, (LinearLayout)view3, (RelativeLayout)view4, (RelativeLayout)view5, (AjioTextView)object2, (AjioRoundedCornerImageView)((Object)object3), (AjioTextView)object4, (RelativeLayout)view6, (AjioTextView)object5, (AjioTextView)object6, (LinearLayout)view7, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioCircularImageView)((Object)object10), (AjioTextView)object11, (TableLayout)view8, (TableRow)view9, (AjioTextView)object12, (AjioTextView)object13);
                                                                                    return exchangeReturnItemsListRowNewRefreshBinding;
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

    public static ExchangeReturnItemsListRowNewRefreshBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeReturnItemsListRowNewRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeReturnItemsListRowNewRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_return_items_list_row_new_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeReturnItemsListRowNewRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

