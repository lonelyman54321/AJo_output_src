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
import com.ril.ajio.services.data.Order.CartOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class CCSelectOrderViewHolderRefresh
extends uv_2
implements View.OnClickListener {
    private final TextView deliveryTv;
    private final ArrayList imageViewList;
    private final TextView orderIdTv;
    private final View row;
    private final TextView statusTv;

    public CCSelectOrderViewHolderRefresh(View view, i82_0 arrayList) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, (i82_0)((Object)arrayList));
        this.imageViewList = arrayList = new ArrayList<String>();
        int n3 = R$id.row_cc_selectorder_tv_status;
        View view2 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.statusTv = view2;
        n3 = R$id.row_cc_selectorder_tv_orderId;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        view2 = (TextView)view2;
        this.orderIdTv = view2;
        n3 = R$id.row_cc_selectorder;
        view2 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view2, string2);
        this.row = view2;
        int n4 = R$id.cc_image_container_1;
        string2 = view.findViewById(n4);
        int n7 = R$id.ccImage;
        string2 = string2.findViewById(n7);
        String string3 = "null cannot be cast to non-null type android.widget.ImageView";
        Intrinsics.checkNotNull(string2, string3);
        string2 = (ImageView)string2;
        arrayList.add(string2);
        n4 = R$id.cc_image_container_2;
        string2 = view.findViewById(n4);
        int n8 = R$id.ccImage;
        string2 = string2.findViewById(n8);
        Intrinsics.checkNotNull(string2, string3);
        string2 = (ImageView)string2;
        arrayList.add(string2);
        n4 = R$id.cc_image_container_3;
        string2 = view.findViewById(n4);
        n8 = R$id.ccImage;
        string2 = string2.findViewById(n8);
        Intrinsics.checkNotNull(string2, string3);
        string2 = (ImageView)string2;
        arrayList.add(string2);
        int n10 = R$id.row_cc_selectorder_tv_delivery;
        view = (TextView)view.findViewById(n10);
        this.deliveryTv = view;
        view2.setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        Object object2 = this.getMOnCCClickListener();
        if (object2 == null) {
            return;
        }
        int n4 = object.getId();
        if (n4 == (n3 = R$id.row_cc_selectorder) && (n4 = (object2 = object.getTag()) instanceof Integer) != 0) {
            object = object.getTag();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.Int");
            object = (Integer)object;
            ((Integer)object).intValue();
            object2 = this.getMOnCCClickListener();
            if (object2 != null) {
                n3 = 5;
                object2.onViewItemClick(object, n3);
            }
        }
    }

    public void setData(Object object, int n3) {
        int n4;
        Object object2;
        int n7;
        int n8 = 1;
        Object object3 = this.imageViewList;
        int n10 = object3.size();
        String string2 = null;
        Object object4 = null;
        for (n7 = 0; n7 < n10; n7 += n8) {
            object2 = (ImageView)this.imageViewList.get(n7);
            n4 = 4;
            object2.setVisibility(n4);
        }
        n10 = object instanceof CartOrder;
        if (n10 != 0) {
            object = (CartOrder)object;
            object3 = this.row;
            Object object5 = n3;
            object3.setTag(object5);
            object5 = no_2.f((CartOrder)object);
            n3 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
            object3 = "format(...)";
            if (n3 != 0) {
                object5 = ((CartOrder)object).getOrderCreatedDate();
                n3 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
                if (n3 != 0) {
                    n3 = 0;
                    object5 = null;
                } else {
                    object5 = k7.j(((CartOrder)object).getOrderCreatedDate());
                }
                object4 = this.deliveryTv;
                object2 = StringCompanionObject.INSTANCE;
                object5 = k7.h((Date)object5);
                object2 = new Object[n8];
                object2[0] = object5;
                object5 = Arrays.copyOf(object2, n8);
                object2 = "Date of order : %1$s";
                object5 = String.format((String)object2, (Object[])object5);
                Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
                object4.setText((CharSequence)object5);
            } else {
                object5 = this.deliveryTv;
                object4 = no_2.f((CartOrder)object);
                object5.setText((CharSequence)object4);
            }
            n3 = this.imageViewList.size();
            object5 = mz3_0.g((CartOrder)object, n3);
            n7 = object5.size();
            object2 = null;
            for (int i3 = 0; i3 < n7; i3 += n8) {
                Object object6 = object5.get(i3);
                String string3 = "get(...)";
                Intrinsics.checkNotNullExpressionValue(object6, string3);
                Object object7 = object6;
                object7 = (String)object6;
                n4 = (int)(TextUtils.isEmpty(object7) ? 1 : 0);
                if (n4 == 0) {
                    ((ImageView)this.imageViewList.get(i3)).setVisibility(0);
                    object6 = this.imageViewList.get(i3);
                    Intrinsics.checkNotNullExpressionValue(object6, string3);
                    Object object8 = object6;
                    object8 = (ImageView)object6;
                    int n14 = 4;
                    uv_2.loadImage$default(this, object7, object8, null, n14, null);
                    continue;
                }
                object6 = (ImageView)this.imageViewList.get(i3);
                int n15 = 8;
                object6.setVisibility(n15);
            }
            object5 = this.orderIdTv;
            object4 = StringCompanionObject.INSTANCE;
            object4 = ((CartOrder)object).getCode();
            object2 = new Object[n8];
            object2[0] = object4;
            Object object9 = Arrays.copyOf(object2, n8);
            string2 = "Order ID : %1$s";
            object9 = String.format(string2, object9);
            Intrinsics.checkNotNullExpressionValue(object9, (String)object3);
            object5.setText((CharSequence)object9);
            object = no_2.c((CartOrder)object);
            object5 = this.statusTv;
            this.setOrderStatusRefresh((String)object, (TextView)object5);
        }
    }
}

