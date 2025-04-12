/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.CustomerCare.itemstatus.CCCartEntryStatus;
import com.ril.ajio.services.data.CustomerCare.itemstatus.QuickActionsMap;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CCItemDetailHeaderViewHolderRefresh
extends uv_2
implements View.OnClickListener {
    private final TextView cancelView;
    private final TextView changeTv;
    private final TextView colorLbl;
    private final TextView colorTv;
    private final TextView dateTv;
    private final TextView itemBrand;
    private final CCCartEntryStatus mCartEntryStatus;
    private Product mProduct;
    private final TextView nameTv;
    private final TextView orderIdTv;
    private final TextView priceTv;
    private final ImageView productImv;
    private final TextView quantityTv;
    private final TextView returnView;
    private final TextView sizeLbl;
    private final TextView sizeTv;
    private final TextView statusTv;
    private final TextView trackView;

    public CCItemDetailHeaderViewHolderRefresh(View view, i82_0 i82_02, CCCartEntryStatus object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        this.mCartEntryStatus = object;
        int n3 = R$id.img_product;
        i82_02 = view.findViewById(n3);
        object = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(i82_02, (String)object);
        i82_02 = (ImageView)i82_02;
        this.productImv = i82_02;
        n3 = R$id.row_cc_itemdetail_tv_orderid;
        i82_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(i82_02, (String)object);
        i82_02 = (TextView)i82_02;
        this.orderIdTv = i82_02;
        int n4 = R$id.row_cc_itemdetail_tv_date;
        View view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.dateTv = view2;
        n4 = R$id.item_name;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.nameTv = view2;
        n4 = R$id.item_price;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.priceTv = view2;
        n4 = R$id.color;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.colorTv = view2;
        n4 = R$id.color_txt;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.colorLbl = view2;
        n4 = R$id.row_cc_itemdetail_tv_change;
        view2 = view.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object);
        view2 = (TextView)view2;
        this.changeTv = view2;
        int n7 = R$id.size_txt;
        View view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.sizeLbl = view3;
        n7 = R$id.size;
        view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.sizeTv = view3;
        n7 = R$id.quantity;
        view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.quantityTv = view3;
        n7 = R$id.row_cc_itemdetail_tv_status;
        view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.statusTv = view3;
        n7 = R$id.row_cc_itemdetail_tv_track;
        view3 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view3, (String)object);
        view3 = (TextView)view3;
        this.trackView = view3;
        int n8 = R$id.row_cc_itemdetail_tv_cancel;
        View view4 = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view4, (String)object);
        view4 = (TextView)view4;
        this.cancelView = view4;
        int n10 = R$id.row_cc_itemdetail_tv_return;
        View view5 = view.findViewById(n10);
        Intrinsics.checkNotNullExpressionValue(view5, (String)object);
        view5 = (TextView)view5;
        this.returnView = view5;
        int n14 = R$id.item_brand;
        view = view.findViewById(n14);
        Intrinsics.checkNotNullExpressionValue(view, (String)object);
        view = (TextView)view;
        this.itemBrand = view;
        view2.setOnClickListener((View.OnClickListener)this);
        view5.setOnClickListener((View.OnClickListener)this);
        view4.setOnClickListener((View.OnClickListener)this);
        view3.setOnClickListener((View.OnClickListener)this);
        i82_02.setOnClickListener(this);
        this.setButtonStatus();
    }

    private final void changeViewState(TextView textView, boolean bl2) {
        textView.setEnabled(bl2);
        if (bl2) {
            int n3 = hv3_0.m(R$color.accent_color_11);
            textView.setTextColor(n3);
            int n4 = R$drawable.revamp_secondary_button_bg_4dp;
            Drawable drawable2 = hv3_0.r(n4);
            textView.setBackground(drawable2);
        } else {
            int n7 = hv3_0.m(R$color.accent_color_10);
            textView.setTextColor(n7);
            int n8 = R$drawable.revamp_tertiary_btn_bg_4dp;
            Drawable drawable3 = hv3_0.r(n8);
            textView.setBackground(drawable3);
        }
    }

    private final void setButtonStatus() {
        int n3;
        Object object = this.returnView;
        this.changeViewState((TextView)object, false);
        object = this.cancelView;
        this.changeViewState((TextView)object, false);
        object = this.trackView;
        this.changeViewState((TextView)object, false);
        object = this.mCartEntryStatus;
        if (object != null && (object = ((CCCartEntryStatus)object).getQuickActionsMap()) != null && (n3 = ((ArrayList)(object = this.mCartEntryStatus.getQuickActionsMap())).size()) != 0) {
            object = this.mCartEntryStatus.getQuickActionsMap();
            int n4 = object.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                String string2;
                boolean bl2;
                String string3 = ((QuickActionsMap)((ArrayList)object).get(i3)).getKey();
                if (string3 == null) continue;
                int n7 = string3.hashCode();
                int n8 = -2124391171;
                boolean bl3 = true;
                if (n7 != n8) {
                    n8 = -903496980;
                    if (n7 != n8) {
                        n8 = 1743087906;
                        if (n7 != n8 || !(bl2 = string3.equals(string2 = "returnstatus"))) continue;
                        string3 = this.returnView;
                        this.changeViewState((TextView)string3, bl3);
                        continue;
                    }
                    string2 = "cancelstatus";
                    bl2 = string3.equals(string2);
                    if (!bl2) continue;
                    string3 = this.cancelView;
                    this.changeViewState((TextView)string3, bl3);
                    continue;
                }
                string2 = "trackstatus";
                bl2 = string3.equals(string2);
                if (!bl2) continue;
                string3 = this.trackView;
                this.changeViewState((TextView)string3, bl3);
            }
        }
    }

    private final void setPriceInfo(CartEntry object) {
        int n3;
        float f5;
        float f6;
        Object object2;
        float f7;
        String string2;
        boolean bl2;
        Object object3 = ((CartEntry)object).getQuantity();
        if (object3 != null && (object3 = ((CartEntry)object).getProduct()) != null && (object3 = ((CartEntry)object).getProduct().getWasPriceData()) != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object3 = ((CartEntry)object).getBasePrice().getValue())))) {
            object3 = ((CartEntry)object).getProduct().getWasPriceData();
            Intrinsics.checkNotNull(object3);
            mz3_0.J(((Price)object3).getValue());
            object3 = ((CartEntry)object).getQuantity();
            string2 = "getQuantity(...)";
            Intrinsics.checkNotNullExpressionValue(object3, string2);
            ((Number)object3).floatValue();
            object3 = ((CartEntry)object).getBasePrice().getValue();
            f7 = mz3_0.J((String)object3);
            object2 = ((CartEntry)object).getQuantity();
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            f6 = ((Number)object2).floatValue();
            f7 *= f6;
        } else {
            bl2 = false;
            f7 = 0.0f;
            object3 = null;
        }
        string2 = ((CartEntry)object).getVoucherPromoAmt();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl3) {
            string2 = ((CartEntry)object).getVoucherPromoAmt();
            f6 = mz3_0.J(string2);
        } else {
            bl3 = false;
            f6 = 0.0f;
            string2 = null;
        }
        object2 = ((CartEntry)object).getMultiItemPromoAmt();
        boolean bl4 = TextUtils.isEmpty((CharSequence)object2);
        if (!bl4) {
            object = ((CartEntry)object).getMultiItemPromoAmt();
            f5 = mz3_0.J((String)object);
        } else {
            n3 = 0;
            f5 = 0.0f;
            object = null;
        }
        f7 = f7 - f6 - f5;
        float f8 = f7 - 0.0f;
        n3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (n3 <= 0) {
            object = this.priceTv;
            object3 = "Free";
            object.setText((CharSequence)object3);
        } else {
            object = this.priceTv;
            object3 = qz2_0.u(f7);
            object.setText((CharSequence)object3);
        }
    }

    private final void setStatusValue() {
        Object object = this.mCartEntryStatus;
        if (object != null) {
            boolean bl2;
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            String string3 = ((CCCartEntryStatus)object).getNewStatus();
            Object object2 = "";
            if (string3 == null && (string3 = ((CCCartEntryStatus)object).getStatus()) == null) {
                string3 = object2;
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
                object = this.mCartEntryStatus;
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = ((CCCartEntryStatus)object).getNewStatus();
                if (string2 == null) {
                    if ((object = ((CCCartEntryStatus)object).getStatus()) != null) {
                        object2 = object;
                    }
                } else {
                    object2 = string2;
                }
                object = this.statusTv;
                this.setOrderStatusRefresh((String)object2, (TextView)object);
            }
        }
    }

    public void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        Object object2 = this.getMOnCCClickListener();
        if (object2 == null) {
            return;
        }
        int n4 = object.getId();
        if (n4 != (n3 = R$id.row_cc_itemdetail_tv_orderid) && n4 != (n3 = R$id.row_cc_itemdetail_tv_track)) {
            n3 = R$id.row_cc_itemdetail_tv_return;
            if (n4 == n3) {
                object = this.getMOnCCClickListener();
                if (object != null) {
                    n4 = 6;
                    object.onViewItemClick(null, n4);
                }
            } else {
                n3 = R$id.row_cc_itemdetail_tv_cancel;
                if (n4 == n3) {
                    object2 = this.getMOnCCClickListener();
                    if (object2 != null) {
                        object = object.getTag();
                        n3 = 7;
                        object2.onViewItemClick(object, n3);
                    }
                } else {
                    int n7 = R$id.row_cc_itemdetail_tv_change;
                    if (n4 == n7 && (object = this.getMOnCCClickListener()) != null) {
                        n4 = 13;
                        object.onViewItemClick(null, n4);
                    }
                }
            }
        } else {
            object = this.getMOnCCClickListener();
            if (object != null) {
                object2 = this.mProduct;
                n3 = 27;
                object.onViewItemClick(object2, n3);
            }
        }
    }

    public void setData(Object object, int n3) {
        String string2;
        int n4;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.CartEntry");
        object = (CartEntry)object;
        Object object2 = ((CartEntry)object).getProduct();
        this.mProduct = object2;
        object2 = this.changeTv;
        int n7 = 8;
        object2.setVisibility(n7);
        object2 = ((CartEntry)object).getProduct();
        if (object2 == null) {
            return;
        }
        n3 = ((CartEntry)object).getTotalEntryCount();
        if (n3 == (n4 = 1)) {
            object2 = this.changeTv;
            object2.setVisibility(n7);
        } else {
            object2 = this.changeTv;
            object2.setVisibility(0);
        }
        object2 = ((CartEntry)object).getProduct();
        Object object3 = this.orderIdTv;
        Object object4 = ((CartEntry)object).getOrderId();
        object3.setText((CharSequence)object4);
        object3 = this.cancelView;
        object4 = ((CartEntry)object).getEntryNumber();
        object3.setTag(object4);
        String string3 = mz3_0.p((Product)object2);
        Object object5 = this.productImv;
        int n8 = 4;
        CCItemDetailHeaderViewHolderRefresh cCItemDetailHeaderViewHolderRefresh = this;
        uv_2.loadImage$default(this, string3, (ImageView)object5, null, n8, null);
        object3 = mz3_0.o((Product)object2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (bl2) {
            this.colorTv.setVisibility(n7);
            object4 = this.colorLbl;
            object4.setVisibility(n7);
        } else {
            this.colorTv.setVisibility(0);
            this.colorLbl.setVisibility(0);
            object4 = this.colorTv;
            object4.setText((CharSequence)object3);
        }
        object4 = this.colorTv;
        boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
        string3 = "";
        if (bl3) {
            object3 = string3;
        }
        object4.setText((CharSequence)object3);
        object3 = this.nameTv;
        object4 = ((Product)object2).getName();
        object4 = object4 == null ? string3 : ((Product)object2).getName();
        object3.setText((CharSequence)object4);
        object3 = this.itemBrand;
        object4 = ((Product)object2).getBrandName();
        object3.setText((CharSequence)object4);
        object3 = ((Product)object2).getName();
        n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
        object2 = n4 != 0 ? string3 : ((Product)object2).getName();
        object3 = Y63.a((CartEntry)object);
        object4 = Y63.d((CartEntry)object);
        bl3 = TextUtils.isEmpty((CharSequence)object3);
        object5 = "null";
        if (bl3 && (bl3 = ((String)object5).equalsIgnoreCase((String)object4))) {
            this.sizeTv.setVisibility(0);
            this.sizeLbl.setVisibility(0);
            string2 = hv3_0.i((CartEntry)object);
            object3 = this.sizeTv;
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                string3 = string2;
            }
            object3.setText((CharSequence)string3);
            string2 = this.nameTv;
            string2.setText((CharSequence)object2);
        } else {
            this.sizeTv.setText((CharSequence)object3);
            this.sizeTv.setVisibility(n7);
            cCItemDetailHeaderViewHolderRefresh = this.sizeLbl;
            cCItemDetailHeaderViewHolderRefresh.setVisibility(n7);
            n7 = (int)(((String)object5).equalsIgnoreCase((String)object4) ? 1 : 0);
            if (n7 != 0) {
                string2 = this.nameTv;
                string2.setText((CharSequence)object2);
            } else {
                string2 = this.nameTv;
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(" | ");
                ((StringBuilder)object4).append((String)object3);
                object2 = ((StringBuilder)object4).toString();
                string2.setText((CharSequence)object2);
            }
        }
        object2 = ((CartEntry)object).getOrderCreatedDate();
        n3 = (int)(TextUtils.isEmpty((CharSequence)object2) ? 1 : 0);
        if (n3 != 0) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = ((CartEntry)object).getOrderCreatedDate();
        }
        object3 = "yyyy-MM-dd'T'hh:mm:ss+0530";
        object2 = k7.c((String)object2, "E, dd MMM", (String)object3);
        string2 = this.dateTv;
        string2.setText((CharSequence)object2);
        this.setStatusValue();
        object2 = ((CartEntry)object).getQuantity();
        object2 = object2 == null ? Integer.valueOf(0) : ((CartEntry)object).getQuantity();
        string2 = this.quantityTv;
        object2 = ((Integer)object2).toString();
        string2.setText((CharSequence)object2);
        this.setPriceInfo((CartEntry)object);
    }
}

