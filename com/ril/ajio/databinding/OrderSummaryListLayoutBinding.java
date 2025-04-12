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
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioPromotionView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class OrderSummaryListLayoutBinding
implements BC3 {
    public final AjioTextView cancelOrderButton;
    public final AjioTextView color;
    public final AjioTextView colorLabel;
    public final LinearLayout costLayout;
    public final LinearLayout costLayoutParent;
    public final AjioTextView currentStatus;
    public final RelativeLayout dataLayout;
    public final AjioAspectRatioImageView imgProduct;
    public final AjioTextView itemActualCost;
    public final AjioTextView itemDiscountPrice;
    public final AjioTextView itemName;
    public final AjioTextView itemSubtotalCost;
    public final AjioTextView itemSubtotalTitle;
    public final AjioPromotionView orderPromotionView;
    public final RelativeLayout orderStatus;
    public final LinearLayout orderSummaryField2;
    public final RelativeLayout productComboofferExchangeLayout;
    public final RelativeLayout productDetailsLayout;
    public final AjioTextView quantity;
    public final AjioTextView returnText;
    private final RelativeLayout rootView;
    public final AjioTextView size;
    public final AjioTextView sizeLbl;
    public final LinearLayout subtotalLayout;
    public final TableLayout tableLayout;
    public final TableRow tableRow1;
    public final TableRow tableRow2;
    public final AjioTextView tvComboofferlabel;
    public final AjioTextView tvExchangedorderlabel;

    private OrderSummaryListLayoutBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView4, RelativeLayout relativeLayout2, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioPromotionView ajioPromotionView, RelativeLayout relativeLayout3, LinearLayout linearLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13, LinearLayout linearLayout4, TableLayout tableLayout, TableRow tableRow, TableRow tableRow2, AjioTextView ajioTextView14, AjioTextView ajioTextView15) {
        this.rootView = relativeLayout;
        this.cancelOrderButton = ajioTextView;
        this.color = ajioTextView2;
        this.colorLabel = ajioTextView3;
        this.costLayout = linearLayout;
        this.costLayoutParent = linearLayout2;
        this.currentStatus = ajioTextView4;
        this.dataLayout = relativeLayout2;
        this.imgProduct = ajioAspectRatioImageView;
        this.itemActualCost = ajioTextView5;
        this.itemDiscountPrice = ajioTextView6;
        this.itemName = ajioTextView7;
        this.itemSubtotalCost = ajioTextView8;
        this.itemSubtotalTitle = ajioTextView9;
        this.orderPromotionView = ajioPromotionView;
        this.orderStatus = relativeLayout3;
        this.orderSummaryField2 = linearLayout3;
        this.productComboofferExchangeLayout = relativeLayout4;
        this.productDetailsLayout = relativeLayout5;
        this.quantity = ajioTextView10;
        this.returnText = ajioTextView11;
        this.size = ajioTextView12;
        this.sizeLbl = ajioTextView13;
        this.subtotalLayout = linearLayout4;
        this.tableLayout = tableLayout;
        this.tableRow1 = tableRow;
        this.tableRow2 = tableRow2;
        this.tvComboofferlabel = ajioTextView14;
        this.tvExchangedorderlabel = ajioTextView15;
    }

    public static OrderSummaryListLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cancel_order_button;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.color;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.color_label;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.cost_layout;
                    View view3 = view2 = dd2_2.a(n3, view);
                    view3 = (LinearLayout)view2;
                    if (view3 != null) {
                        n3 = R$id.cost_layout_parent;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (LinearLayout)view2;
                        if (view4 != null) {
                            n3 = R$id.current_status;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioTextView)view2;
                            if (object5 != null) {
                                n3 = R$id.data_layout;
                                View view5 = view2 = dd2_2.a(n3, view);
                                view5 = (RelativeLayout)view2;
                                if (view5 != null) {
                                    n3 = R$id.img_product;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (AjioAspectRatioImageView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.item_actual_cost;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (AjioTextView)view2;
                                        if (object7 != null) {
                                            n3 = R$id.item_discount_price;
                                            Object object8 = view2 = dd2_2.a(n3, view);
                                            object8 = (AjioTextView)view2;
                                            if (object8 != null) {
                                                n3 = R$id.item_name;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (AjioTextView)view2;
                                                if (object9 != null) {
                                                    n3 = R$id.item_subtotal_cost;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.item_subtotal_title;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (AjioTextView)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.order_promotion_view;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioPromotionView)view2;
                                                            if (object12 != null) {
                                                                n3 = R$id.order_status;
                                                                View view6 = view2 = dd2_2.a(n3, view);
                                                                view6 = (RelativeLayout)view2;
                                                                if (view6 != null) {
                                                                    n3 = R$id.order_summary_field_2;
                                                                    View view7 = view2 = dd2_2.a(n3, view);
                                                                    view7 = (LinearLayout)view2;
                                                                    if (view7 != null) {
                                                                        n3 = R$id.product_combooffer_exchange_layout;
                                                                        View view8 = view2 = dd2_2.a(n3, view);
                                                                        view8 = (RelativeLayout)view2;
                                                                        if (view8 != null) {
                                                                            n3 = R$id.product_details_layout;
                                                                            View view9 = view2 = dd2_2.a(n3, view);
                                                                            view9 = (RelativeLayout)view2;
                                                                            if (view9 != null) {
                                                                                n3 = R$id.quantity;
                                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                                object13 = (AjioTextView)view2;
                                                                                if (object13 != null) {
                                                                                    n3 = R$id.return_text;
                                                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                                                    object14 = (AjioTextView)view2;
                                                                                    if (object14 != null) {
                                                                                        n3 = R$id.size;
                                                                                        Object object15 = view2 = dd2_2.a(n3, view);
                                                                                        object15 = (AjioTextView)view2;
                                                                                        if (object15 != null) {
                                                                                            n3 = R$id.size_lbl;
                                                                                            Object object16 = view2 = dd2_2.a(n3, view);
                                                                                            object16 = (AjioTextView)view2;
                                                                                            if (object16 != null) {
                                                                                                n3 = R$id.subtotal_layout;
                                                                                                View view10 = view2 = dd2_2.a(n3, view);
                                                                                                view10 = (LinearLayout)view2;
                                                                                                if (view10 != null) {
                                                                                                    n3 = R$id.table_layout;
                                                                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                                                                    view11 = (TableLayout)view2;
                                                                                                    if (view11 != null) {
                                                                                                        n3 = R$id.tableRow1;
                                                                                                        View view12 = view2 = dd2_2.a(n3, view);
                                                                                                        view12 = (TableRow)view2;
                                                                                                        if (view12 != null) {
                                                                                                            n3 = R$id.tableRow2;
                                                                                                            View view13 = view2 = dd2_2.a(n3, view);
                                                                                                            view13 = (TableRow)view2;
                                                                                                            if (view13 != null) {
                                                                                                                n3 = R$id.tv_comboofferlabel;
                                                                                                                Object object17 = view2 = dd2_2.a(n3, view);
                                                                                                                object17 = (AjioTextView)view2;
                                                                                                                if (object17 != null) {
                                                                                                                    n3 = R$id.tv_exchangedorderlabel;
                                                                                                                    Object object18 = view2 = dd2_2.a(n3, view);
                                                                                                                    object18 = (AjioTextView)view2;
                                                                                                                    if (object18 != null) {
                                                                                                                        View view14 = view;
                                                                                                                        view14 = (RelativeLayout)view;
                                                                                                                        OrderSummaryListLayoutBinding orderSummaryListLayoutBinding = new OrderSummaryListLayoutBinding((RelativeLayout)view14, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (LinearLayout)view3, (LinearLayout)view4, (AjioTextView)object5, (RelativeLayout)view5, (AjioAspectRatioImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioPromotionView)((Object)object12), (RelativeLayout)view6, (LinearLayout)view7, (RelativeLayout)view8, (RelativeLayout)view9, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (LinearLayout)view10, (TableLayout)view11, (TableRow)view12, (TableRow)view13, (AjioTextView)object17, (AjioTextView)object18);
                                                                                                                        return orderSummaryListLayoutBinding;
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

    public static OrderSummaryListLayoutBinding inflate(LayoutInflater layoutInflater) {
        return OrderSummaryListLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static OrderSummaryListLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_summary_list_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderSummaryListLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

