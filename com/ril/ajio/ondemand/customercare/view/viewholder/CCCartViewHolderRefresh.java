/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class CCCartViewHolderRefresh
extends uv_2
implements View.OnClickListener {
    private final TextView deliveryTv;
    private final TextView extraImages;
    private final ArrayList imageViewList;
    private final TextView orderIdTv;
    private final View row;
    private final TextView statusTv;
    private final TextView totalItems;

    public CCCartViewHolderRefresh(View view, i82_0 textView) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, (i82_0)textView);
        this.imageViewList = textView = new ArrayList();
        int n3 = R$id.cc_image_container_1;
        View view2 = view.findViewById(n3);
        int n4 = R$id.ccImage;
        view2 = view2.findViewById(n4);
        String string2 = "null cannot be cast to non-null type android.widget.ImageView";
        Intrinsics.checkNotNull(view2, string2);
        view2 = (ImageView)view2;
        textView.add(view2);
        n3 = R$id.cc_image_container_2;
        view2 = view.findViewById(n3);
        int n7 = R$id.ccImage;
        view2 = view2.findViewById(n7);
        Intrinsics.checkNotNull(view2, string2);
        view2 = (ImageView)view2;
        textView.add(view2);
        n3 = R$id.cc_image_container_3;
        view2 = view.findViewById(n3);
        n7 = R$id.ccImage;
        view2 = view2.findViewById(n7);
        Intrinsics.checkNotNull(view2, string2);
        view2 = (ImageView)view2;
        textView.add(view2);
        int n8 = R$id.row_cc_product_tv_delivery;
        this.deliveryTv = textView = (TextView)view.findViewById(n8);
        n8 = R$id.row_cc_product_tv_orderId;
        this.orderIdTv = textView = (TextView)view.findViewById(n8);
        n8 = R$id.row_cc_product_tv_status;
        this.statusTv = textView = (TextView)view.findViewById(n8);
        n8 = R$id.row_cc_product;
        textView = view.findViewById(n8);
        this.row = textView;
        n3 = R$id.row_cc_product_tv_total_items;
        view2 = (TextView)view.findViewById(n3);
        this.totalItems = view2;
        n3 = R$id.cc_extra_images;
        view = (TextView)view.findViewById(n3);
        this.extraImages = view;
        textView.setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        i82_0 i82_02 = this.getMOnCCClickListener();
        if (i82_02 == null) {
            return;
        }
        int n4 = object.getId();
        if (n4 == (n3 = R$id.row_cc_product)) {
            i82_02 = this.getMOnCCClickListener();
            Intrinsics.checkNotNull(i82_02);
            object = object.getTag();
            n3 = 5;
            i82_02.onViewItemClick(object, n3);
        }
    }

    public void setData(Object object, int n3) {
        Object object2;
        int n4;
        int n7 = 1;
        Object object3 = this.imageViewList;
        int n8 = object3.size();
        Object object4 = null;
        for (n4 = 0; n4 < n8; n4 += n7) {
            object2 = (ImageView)this.imageViewList.get(n4);
            int n10 = 4;
            object2.setVisibility(n10);
        }
        n8 = object instanceof CartOrder;
        n4 = 0;
        object4 = null;
        object = n8 != 0 ? (CartOrder)object : null;
        if (object != null && (object3 = ((CartOrder)object).getEntries()) != null) {
            Object object5;
            int n14;
            object3 = ((CartOrder)object).getCode();
            n8 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
            if (n8 == 0) {
                object3 = ((CartOrder)object).getCode();
                Intrinsics.checkNotNullExpressionValue(object3, "getCode(...)");
                object2 = "EX";
                n8 = (int)(b.s((String)object3, (String)object2, false) ? 1 : 0);
            }
            object3 = this.row;
            Object object6 = n3;
            object3.setTag(object6);
            object6 = no_2.f((CartOrder)object);
            n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
            if (n3 != 0) {
                object6 = ((CartOrder)object).getOrderCreatedDate();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
                if (n3 == 0) {
                    object6 = ((CartOrder)object).getOrderCreatedDate();
                    object4 = k7.j((String)object6);
                }
                object6 = this.deliveryTv;
                object3 = k7.h(object4);
                object2 = "Date of order : ";
                object4 = new StringBuilder((String)object2);
                ((StringBuilder)object4).append((String)object3);
                object3 = ((StringBuilder)object4).toString();
                object6.setText((CharSequence)object3);
            } else {
                object6 = this.deliveryTv;
                object3 = no_2.f((CartOrder)object);
                object6.setText((CharSequence)object3);
            }
            n3 = this.imageViewList.size();
            object6 = mz3_0.g((CartOrder)object, n3);
            n8 = object6.size();
            n4 = 0;
            object4 = null;
            while (true) {
                n14 = 8;
                if (n4 >= n8) break;
                object5 = object6.get(n4);
                String string2 = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object5, string2);
                object5 = (String)object5;
                boolean bl2 = TextUtils.isEmpty(object5);
                if (!bl2) {
                    ((ImageView)this.imageViewList.get(n4)).setVisibility(0);
                    object2 = this.imageViewList.get(n4);
                    Intrinsics.checkNotNullExpressionValue(object2, string2);
                    int n15 = R$string.product_image;
                    string2 = hv3_0.K(n15);
                    this.loadImage((String)object5, (ImageView)object2, string2);
                } else {
                    object5 = (ImageView)this.imageViewList.get(n4);
                    object5.setVisibility(n14);
                }
                n4 += n7;
            }
            object6 = ((CartOrder)object).getEntries();
            if (object6 != null) {
                n3 = object6.size();
            } else {
                n3 = 0;
                object6 = null;
            }
            n8 = 3;
            object4 = "format(...)";
            if (n3 > n8) {
                object6 = this.extraImages;
                object2 = StringCompanionObject.INSTANCE;
                object2 = ((CartOrder)object).getEntries();
                if (object2 != null) {
                    n14 = ((ArrayList)object2).size();
                } else {
                    n14 = 0;
                    object2 = null;
                }
                object5 = "+";
                object3 = new StringBuilder((String)object5);
                object3.append(n14 -= n8);
                object3 = object3.toString();
                object2 = Arrays.copyOf(new Object[0], 0);
                object3 = String.format((String)object3, (Object[])object2);
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                object6.setText((CharSequence)object3);
                object6 = this.extraImages;
                object6.setVisibility(0);
            } else {
                object6 = this.extraImages;
                object6.setVisibility(n14);
            }
            object6 = this.orderIdTv;
            object3 = StringCompanionObject.INSTANCE;
            object3 = ((CartOrder)object).getCode();
            object5 = "Order ID : ";
            object2 = new StringBuilder((String)object5);
            ((StringBuilder)object2).append((String)object3);
            object3 = ((StringBuilder)object2).toString();
            object2 = Arrays.copyOf(new Object[0], 0);
            object3 = String.format((String)object3, (Object[])object2);
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            object6.setText((CharSequence)object3);
            object6 = ((CartOrder)object).getEntries();
            if (object6 == null) {
                n8 = 0;
                object3 = null;
            } else {
                object6 = ((CartOrder)object).getEntries().iterator();
                Intrinsics.checkNotNullExpressionValue(object6, "iterator(...)");
                n8 = 0;
                object3 = null;
                while ((n14 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                    object2 = (CartEntry)object6.next();
                    object5 = ((CartEntry)object2).getQuantity();
                    object2 = object5 == null ? Integer.valueOf(0) : ((CartEntry)object2).getQuantity();
                    Intrinsics.checkNotNull(object2);
                    n14 = ((Number)object2).intValue();
                    n8 += n14;
                }
            }
            if (n8 > n7) {
                object6 = this.totalItems;
                Object object7 = StringCompanionObject.INSTANCE;
                object7 = new StringBuilder();
                ((StringBuilder)object7).append(n8);
                ((StringBuilder)object7).append(" Items");
                object7 = ((StringBuilder)object7).toString();
                object3 = Arrays.copyOf(new Object[0], 0);
                object7 = String.format((String)object7, object3);
                Intrinsics.checkNotNullExpressionValue(object7, (String)object4);
                object6.setText((CharSequence)object7);
            } else {
                object6 = this.totalItems;
                Object object8 = StringCompanionObject.INSTANCE;
                object8 = new StringBuilder();
                ((StringBuilder)object8).append(n8);
                ((StringBuilder)object8).append(" Item");
                object8 = ((StringBuilder)object8).toString();
                object3 = Arrays.copyOf(new Object[0], 0);
                object8 = String.format((String)object8, object3);
                Intrinsics.checkNotNullExpressionValue(object8, (String)object4);
                object6.setText((CharSequence)object8);
            }
            object = no_2.c((CartOrder)object);
            object6 = this.statusTv;
            this.setOrderStatusRefresh((String)object, (TextView)object6);
        }
    }
}

