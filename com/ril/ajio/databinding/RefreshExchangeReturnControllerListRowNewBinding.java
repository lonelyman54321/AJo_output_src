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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RefreshExchangeReturnControllerListRowNewBinding
implements BC3 {
    public final LinearLayout costLayout;
    public final RelativeLayout dataLayout;
    public final AjioTextView deleteRow;
    public final LinearLayout erclrnLayoutDasItem;
    public final AjioTextView erclrnTvDasKnowMore;
    public final RelativeLayout exchangeItemsDetailsLayout;
    public final AjioButton exchangeItemsListExchange;
    public final AjioButton exchangeItemsListReturn;
    public final LinearLayout footerBtnLl;
    public final AjioImageView imgProduct;
    public final AjioTextView itemActualCost;
    public final AjioTextView itemBrandName;
    public final RelativeLayout itemDetailsContainer;
    public final AjioTextView itemIncludeConvFee;
    public final AjioTextView itemName;
    public final AjioTextView itemOriginalPrice;
    public final AjioTextView qtyLabel;
    public final AjioTextView quantity;
    public final AjioTextView returnExchangeAvailabilityMsg;
    private final RelativeLayout rootView;
    public final RelativeLayout rowParentLl;
    public final AjioCircularImageView selectedIconExchange;
    public final AjioTextView size;
    public final TableLayout tableLayout;
    public final TableRow tableRow1;
    public final AjioTextView viewBreakup;

    private RefreshExchangeReturnControllerListRowNewBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2, AjioTextView ajioTextView, LinearLayout linearLayout2, AjioTextView ajioTextView2, RelativeLayout relativeLayout3, AjioButton ajioButton, AjioButton ajioButton2, LinearLayout linearLayout3, AjioImageView ajioImageView, AjioTextView ajioTextView3, AjioTextView ajioTextView4, RelativeLayout relativeLayout4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, RelativeLayout relativeLayout5, AjioCircularImageView ajioCircularImageView, AjioTextView ajioTextView11, TableLayout tableLayout, TableRow tableRow, AjioTextView ajioTextView12) {
        this.rootView = relativeLayout;
        this.costLayout = linearLayout;
        this.dataLayout = relativeLayout2;
        this.deleteRow = ajioTextView;
        this.erclrnLayoutDasItem = linearLayout2;
        this.erclrnTvDasKnowMore = ajioTextView2;
        this.exchangeItemsDetailsLayout = relativeLayout3;
        this.exchangeItemsListExchange = ajioButton;
        this.exchangeItemsListReturn = ajioButton2;
        this.footerBtnLl = linearLayout3;
        this.imgProduct = ajioImageView;
        this.itemActualCost = ajioTextView3;
        this.itemBrandName = ajioTextView4;
        this.itemDetailsContainer = relativeLayout4;
        this.itemIncludeConvFee = ajioTextView5;
        this.itemName = ajioTextView6;
        this.itemOriginalPrice = ajioTextView7;
        this.qtyLabel = ajioTextView8;
        this.quantity = ajioTextView9;
        this.returnExchangeAvailabilityMsg = ajioTextView10;
        this.rowParentLl = relativeLayout5;
        this.selectedIconExchange = ajioCircularImageView;
        this.size = ajioTextView11;
        this.tableLayout = tableLayout;
        this.tableRow1 = tableRow;
        this.viewBreakup = ajioTextView12;
    }

    public static RefreshExchangeReturnControllerListRowNewBinding bind(View view) {
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
                n3 = R$id.delete_row;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (AjioTextView)view2;
                if (object2 != null) {
                    n3 = R$id.erclrn_layout_das_item;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (LinearLayout)view2;
                    if (view5 != null) {
                        n3 = R$id.erclrn_tv_das_know_more;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null) {
                            n3 = R$id.exchange_items_details_layout;
                            View view6 = view2 = dd2_2.a(n3, view);
                            view6 = (RelativeLayout)view2;
                            if (view6 != null) {
                                n3 = R$id.exchange_items_list_exchange;
                                Object object4 = view2 = dd2_2.a(n3, view);
                                object4 = (AjioButton)view2;
                                if (object4 != null) {
                                    n3 = R$id.exchange_items_list_return;
                                    Object object5 = view2 = dd2_2.a(n3, view);
                                    object5 = (AjioButton)view2;
                                    if (object5 != null) {
                                        n3 = R$id.footer_btn_ll;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (LinearLayout)view2;
                                        if (view7 != null) {
                                            n3 = R$id.img_product;
                                            Object object6 = view2 = dd2_2.a(n3, view);
                                            object6 = (AjioImageView)view2;
                                            if (object6 != null) {
                                                n3 = R$id.item_actual_cost;
                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                object7 = (AjioTextView)view2;
                                                if (object7 != null) {
                                                    n3 = R$id.item_brand_name;
                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                    object8 = (AjioTextView)view2;
                                                    if (object8 != null) {
                                                        n3 = R$id.item_details_container;
                                                        View view8 = view2 = dd2_2.a(n3, view);
                                                        view8 = (RelativeLayout)view2;
                                                        if (view8 != null) {
                                                            n3 = R$id.item_include_conv_fee;
                                                            Object object9 = view2 = dd2_2.a(n3, view);
                                                            object9 = (AjioTextView)view2;
                                                            if (object9 != null) {
                                                                n3 = R$id.item_name;
                                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                                object10 = (AjioTextView)view2;
                                                                if (object10 != null) {
                                                                    n3 = R$id.item_original_price;
                                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                                    object11 = (AjioTextView)view2;
                                                                    if (object11 != null) {
                                                                        n3 = R$id.qty_label;
                                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                                        object12 = (AjioTextView)view2;
                                                                        if (object12 != null) {
                                                                            n3 = R$id.quantity;
                                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                                            object13 = (AjioTextView)view2;
                                                                            if (object13 != null) {
                                                                                n3 = R$id.return_exchange_availability_msg;
                                                                                Object object14 = view2 = dd2_2.a(n3, view);
                                                                                object14 = (AjioTextView)view2;
                                                                                if (object14 != null) {
                                                                                    View view9 = view;
                                                                                    view9 = (RelativeLayout)view;
                                                                                    n3 = R$id.selected_icon_exchange;
                                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                                    object15 = (AjioCircularImageView)view2;
                                                                                    if (object15 != null) {
                                                                                        n3 = R$id.size;
                                                                                        Object object16 = view2 = dd2_2.a(n3, view);
                                                                                        object16 = (AjioTextView)view2;
                                                                                        if (object16 != null) {
                                                                                            n3 = R$id.table_layout;
                                                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                                                            view10 = (TableLayout)view2;
                                                                                            if (view10 != null) {
                                                                                                n3 = R$id.tableRow1;
                                                                                                View view11 = view2 = dd2_2.a(n3, view);
                                                                                                view11 = (TableRow)view2;
                                                                                                if (view11 != null) {
                                                                                                    n3 = R$id.view_breakup;
                                                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                                                    object17 = (AjioTextView)view2;
                                                                                                    if (object17 != null) {
                                                                                                        object = new RefreshExchangeReturnControllerListRowNewBinding((RelativeLayout)view9, (LinearLayout)view3, (RelativeLayout)view4, (AjioTextView)object2, (LinearLayout)view5, (AjioTextView)object3, (RelativeLayout)view6, (AjioButton)object4, (AjioButton)object5, (LinearLayout)view7, (AjioImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (RelativeLayout)view8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (RelativeLayout)view9, (AjioCircularImageView)((Object)object15), (AjioTextView)object16, (TableLayout)view10, (TableRow)view11, (AjioTextView)object17);
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RefreshExchangeReturnControllerListRowNewBinding inflate(LayoutInflater layoutInflater) {
        return RefreshExchangeReturnControllerListRowNewBinding.inflate(layoutInflater, null, false);
    }

    public static RefreshExchangeReturnControllerListRowNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.refresh_exchange_return_controller_list_row_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RefreshExchangeReturnControllerListRowNewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

