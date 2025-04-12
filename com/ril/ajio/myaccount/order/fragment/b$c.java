/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.myaccount.order.fragment;

import com.ril.ajio.myaccount.order.fragment.OrderListFragment$showOrderList$2$onRatingsClicked$1;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.data.ratings.RatingsModel;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;

public final class b$c
implements R71 {
    public final /* synthetic */ b a;

    public b$c(b b2) {
        this.a = b2;
    }

    public final void a(float f5, int n3, Object object) {
        Object object2 = object;
        object2 = (OrderItemLine)object;
        Intrinsics.checkNotNullParameter(object2, "orderItemLine");
        Object object3 = n3;
        b b2 = this.a;
        b2.R = object3;
        String string2 = ((OrderItemLine)object2).getBrandName();
        String string3 = ((OrderItemLine)object2).getBaseProductId();
        String string4 = ((OrderItemLine)object2).getImageUrl();
        String string5 = ((OrderItemLine)object2).getTitle();
        String string6 = ((OrderItemLine)object2).getItemId();
        String string7 = ((OrderItemLine)object2).getOrderId();
        Object object4 = object2;
        Float f6 = Float.valueOf(f5);
        int n4 = 15680;
        String string8 = "ORDER_LISTING";
        object2 = new RatingsModel(string2, string5, string4, f6, string6, string8, null, string7, null, string3, null, null, null, null, n4, null);
        object2 = wD2$a.b(wd2_0.Companion, (RatingsModel)object2);
        object3 = b2.Q;
        if (object3 != null) {
            ((Timer)object3).cancel();
        }
        b2.Q = object3 = new Timer();
        object4 = new OrderListFragment$showOrderList$2$onRatingsClicked$1(b2, (wd2_0)object2);
        ((Timer)object3).schedule((TimerTask)object4, 500L);
    }
}

