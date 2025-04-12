/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcItemDetailHeaderRefreshBinding
implements BC3 {
    public final TextView color;
    public final TextView colorTxt;
    public final Guideline guideline1;
    public final Guideline guideline2;
    public final ImageView imgProduct;
    public final CardView imgProductContainer;
    public final TextView itemBrand;
    public final TextView itemName;
    public final TextView itemPrice;
    public final ConstraintLayout layoutProductInfo;
    public final TextView qtyTxt;
    public final TextView quantity;
    private final ConstraintLayout rootView;
    public final TextView rowCcItemdetailLblDate;
    public final TextView rowCcItemdetailTvCancel;
    public final TextView rowCcItemdetailTvChange;
    public final TextView rowCcItemdetailTvDate;
    public final TextView rowCcItemdetailTvOrderid;
    public final TextView rowCcItemdetailTvOrderidTxt;
    public final TextView rowCcItemdetailTvReturn;
    public final TextView rowCcItemdetailTvStatus;
    public final TextView rowCcItemdetailTvTrack;
    public final TextView size;
    public final TextView sizeTxt;
    public final TextView tvExclusive;

    private RowCcItemDetailHeaderRefreshBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Guideline guideline, Guideline guideline2, ImageView imageView, CardView cardView, TextView textView3, TextView textView4, TextView textView5, ConstraintLayout constraintLayout2, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19) {
        this.rootView = constraintLayout;
        this.color = textView;
        this.colorTxt = textView2;
        this.guideline1 = guideline;
        this.guideline2 = guideline2;
        this.imgProduct = imageView;
        this.imgProductContainer = cardView;
        this.itemBrand = textView3;
        this.itemName = textView4;
        this.itemPrice = textView5;
        this.layoutProductInfo = constraintLayout2;
        this.qtyTxt = textView6;
        this.quantity = textView7;
        this.rowCcItemdetailLblDate = textView8;
        this.rowCcItemdetailTvCancel = textView9;
        this.rowCcItemdetailTvChange = textView10;
        this.rowCcItemdetailTvDate = textView11;
        this.rowCcItemdetailTvOrderid = textView12;
        this.rowCcItemdetailTvOrderidTxt = textView13;
        this.rowCcItemdetailTvReturn = textView14;
        this.rowCcItemdetailTvStatus = textView15;
        this.rowCcItemdetailTvTrack = textView16;
        this.size = textView17;
        this.sizeTxt = textView18;
        this.tvExclusive = textView19;
    }

    public static RowCcItemDetailHeaderRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.color;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.color_txt;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (TextView)view2;
            if (view4 != null) {
                n3 = R$id.guideline_1;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (Guideline)view2;
                if (view5 != null) {
                    n3 = R$id.guideline_2;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (Guideline)view2;
                    if (view6 != null) {
                        n3 = R$id.img_product;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (ImageView)view2;
                        if (view7 != null) {
                            n3 = R$id.img_product_container;
                            Object object2 = view2 = dd2_2.a(n3, view);
                            object2 = (CardView)view2;
                            if (object2 != null) {
                                n3 = R$id.item_brand;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (TextView)view2;
                                if (view8 != null) {
                                    n3 = R$id.item_name;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (TextView)view2;
                                    if (view9 != null) {
                                        n3 = R$id.item_price;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (TextView)view2;
                                        if (view10 != null) {
                                            n3 = R$id.layout_product_info;
                                            Object object3 = view2 = dd2_2.a(n3, view);
                                            object3 = (ConstraintLayout)view2;
                                            if (object3 != null) {
                                                n3 = R$id.qty_txt;
                                                View view11 = view2 = dd2_2.a(n3, view);
                                                view11 = (TextView)view2;
                                                if (view11 != null) {
                                                    n3 = R$id.quantity;
                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                    view12 = (TextView)view2;
                                                    if (view12 != null) {
                                                        n3 = R$id.row_cc_itemdetail_lbl_date;
                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                        view13 = (TextView)view2;
                                                        if (view13 != null) {
                                                            n3 = R$id.row_cc_itemdetail_tv_cancel;
                                                            View view14 = view2 = dd2_2.a(n3, view);
                                                            view14 = (TextView)view2;
                                                            if (view14 != null) {
                                                                n3 = R$id.row_cc_itemdetail_tv_change;
                                                                View view15 = view2 = dd2_2.a(n3, view);
                                                                view15 = (TextView)view2;
                                                                if (view15 != null) {
                                                                    n3 = R$id.row_cc_itemdetail_tv_date;
                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                    view16 = (TextView)view2;
                                                                    if (view16 != null) {
                                                                        n3 = R$id.row_cc_itemdetail_tv_orderid;
                                                                        View view17 = view2 = dd2_2.a(n3, view);
                                                                        view17 = (TextView)view2;
                                                                        if (view17 != null) {
                                                                            n3 = R$id.row_cc_itemdetail_tv_orderid_txt;
                                                                            View view18 = view2 = dd2_2.a(n3, view);
                                                                            view18 = (TextView)view2;
                                                                            if (view18 != null) {
                                                                                n3 = R$id.row_cc_itemdetail_tv_return;
                                                                                View view19 = view2 = dd2_2.a(n3, view);
                                                                                view19 = (TextView)view2;
                                                                                if (view19 != null) {
                                                                                    n3 = R$id.row_cc_itemdetail_tv_status;
                                                                                    View view20 = view2 = dd2_2.a(n3, view);
                                                                                    view20 = (TextView)view2;
                                                                                    if (view20 != null) {
                                                                                        n3 = R$id.row_cc_itemdetail_tv_track;
                                                                                        View view21 = view2 = dd2_2.a(n3, view);
                                                                                        view21 = (TextView)view2;
                                                                                        if (view21 != null) {
                                                                                            n3 = R$id.size;
                                                                                            View view22 = view2 = dd2_2.a(n3, view);
                                                                                            view22 = (TextView)view2;
                                                                                            if (view22 != null) {
                                                                                                n3 = R$id.size_txt;
                                                                                                View view23 = view2 = dd2_2.a(n3, view);
                                                                                                view23 = (TextView)view2;
                                                                                                if (view23 != null) {
                                                                                                    n3 = R$id.tv_exclusive;
                                                                                                    View view24 = view2 = dd2_2.a(n3, view);
                                                                                                    view24 = (TextView)view2;
                                                                                                    if (view24 != null) {
                                                                                                        Object object4 = view;
                                                                                                        object4 = (ConstraintLayout)view;
                                                                                                        RowCcItemDetailHeaderRefreshBinding rowCcItemDetailHeaderRefreshBinding = new RowCcItemDetailHeaderRefreshBinding((ConstraintLayout)((Object)object4), (TextView)view3, (TextView)view4, (Guideline)view5, (Guideline)view6, (ImageView)view7, (CardView)((Object)object2), (TextView)view8, (TextView)view9, (TextView)view10, (ConstraintLayout)((Object)object3), (TextView)view11, (TextView)view12, (TextView)view13, (TextView)view14, (TextView)view15, (TextView)view16, (TextView)view17, (TextView)view18, (TextView)view19, (TextView)view20, (TextView)view21, (TextView)view22, (TextView)view23, (TextView)view24);
                                                                                                        return rowCcItemDetailHeaderRefreshBinding;
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

    public static RowCcItemDetailHeaderRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcItemDetailHeaderRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcItemDetailHeaderRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_item_detail_header_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcItemDetailHeaderRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

