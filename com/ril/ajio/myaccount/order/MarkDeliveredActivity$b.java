/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.myaccount.order;

import android.text.TextUtils;
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity;
import com.ril.ajio.services.query.QueryInvoiceCheck;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class MarkDeliveredActivity$b
implements View.OnClickListener {
    public final /* synthetic */ MarkDeliveredActivity a;

    public MarkDeliveredActivity$b(MarkDeliveredActivity markDeliveredActivity) {
        this.a = markDeliveredActivity;
    }

    public final void onClick(View object) {
        object = this.a;
        object.getClass();
        Object object2 = AnalyticsManager.getInstance().getGtmEvents();
        CharSequence charSequence = "Mark_Deli_OK_Click";
        ((GTMEvents)object2).pushButtonTapEvent((String)charSequence, charSequence, "Mark_Deli");
        object2 = new QueryInvoiceCheck();
        charSequence = ((MarkDeliveredActivity)object).A0;
        ((QueryInvoiceCheck)object2).setOrderCode((String)charSequence);
        charSequence = ((MarkDeliveredActivity)object).B0;
        ((QueryInvoiceCheck)object2).setConsignmentCode((String)charSequence);
        charSequence = new StringBuilder();
        Object object3 = ((MarkDeliveredActivity)object).s0;
        ((StringBuilder)charSequence).append((String)object3);
        object3 = ((MarkDeliveredActivity)object).t0;
        ((StringBuilder)charSequence).append((String)object3);
        object3 = ((MarkDeliveredActivity)object).u0;
        ((StringBuilder)charSequence).append((String)object3);
        object3 = ((MarkDeliveredActivity)object).v0;
        ((StringBuilder)charSequence).append((String)object3);
        charSequence = ((StringBuilder)charSequence).toString();
        ((QueryInvoiceCheck)object2).setInvoiceNumber((String)charSequence);
        object2 = new StringBuilder();
        charSequence = ((MarkDeliveredActivity)object).s0;
        ((StringBuilder)object2).append((String)charSequence);
        charSequence = ((MarkDeliveredActivity)object).t0;
        ((StringBuilder)object2).append((String)charSequence);
        charSequence = ((MarkDeliveredActivity)object).u0;
        ((StringBuilder)object2).append((String)charSequence);
        charSequence = ((MarkDeliveredActivity)object).v0;
        ((StringBuilder)object2).append((String)charSequence);
        String string2 = ((StringBuilder)object2).toString();
        object2 = ((MarkDeliveredActivity)object).A0;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
        if (!(bl2 || (bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((MarkDeliveredActivity)object).B0))) || (bl2 = TextUtils.isEmpty((CharSequence)string2)))) {
            ((MarkDeliveredActivity)object).x0.show();
            db2_1 db2_12 = ((MarkDeliveredActivity)object).E0;
            String string3 = ((MarkDeliveredActivity)object).A0;
            String string4 = ((MarkDeliveredActivity)object).B0;
            db2_12.getClass();
            Intrinsics.checkNotNullParameter(string3, "orderId");
            Intrinsics.checkNotNullParameter(string4, "consignmentCode");
            Intrinsics.checkNotNullParameter(string2, "invoiceNumber");
            object = md3_0.c(db2_12);
            object3 = object2;
            object2 = new gb2_2(db2_12, string3, string4, string2, null);
            int n3 = 3;
            object3 = null;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
        }
    }
}

