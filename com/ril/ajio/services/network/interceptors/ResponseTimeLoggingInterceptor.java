/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.ril.ajio.services.network.interceptors;

import android.content.Context;
import android.os.Bundle;
import com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager;
import com.ril.ajio.services.NetworkAnalyticsManager.AnalyticsManager$Companion;
import com.ril.ajio.services.NetworkAnalyticsManager.GoogleAnalyticsEvents;
import com.ril.ajio.services.network.interceptors.ResponseTimeLoggingInterceptor$Companion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class ResponseTimeLoggingInterceptor
implements nj1_2 {
    public static final ResponseTimeLoggingInterceptor$Companion Companion;
    private static final String HEADER_REQUEST_ID = "RequestId";
    private final xe analyticsReporter;
    private final Context context;

    static {
        ResponseTimeLoggingInterceptor$Companion responseTimeLoggingInterceptor$Companion;
        Companion = responseTimeLoggingInterceptor$Companion = new ResponseTimeLoggingInterceptor$Companion(null);
    }

    public ResponseTimeLoggingInterceptor(Context context, xe xe2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xe2, "analyticsReporter");
        this.context = context;
        this.analyticsReporter = xe2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public cl2_2 intercept(nj1$a object) {
        Intrinsics.checkNotNullParameter(object, "chain");
        Object object2 = object.request();
        m41_0 m41_02 = ((kj2_2)object2).c;
        int n3 = m41_02.size();
        if (n3 <= 0) return object.a((kj2_2)object2);
        CharSequence charSequence = HEADER_REQUEST_ID;
        Object object3 = m41_02.a((String)charSequence);
        if (object3 == null) return object.a((kj2_2)object2);
        object3 = m41_02.a((String)charSequence);
        String string2 = "PAYMENT_GetPaymentInstruments";
        String string3 = null;
        boolean bl2 = b.i((String)object3, string2, false);
        if (!bl2 && !(bl2 = b.i((String)(object3 = m41_02.a((String)charSequence)), string2 = "PAYMENT_DeletePaymentInstrument", false))) {
            object3 = m41_02.a((String)charSequence);
            bl2 = b.i((String)object3, string2 = "PAYMENT_StoredPaymentInstrument", false);
            if (!bl2) return object.a((kj2_2)object2);
        }
        object = object.a((kj2_2)object2);
        Bundle bundle = new Bundle();
        object2 = m41_02.a((String)charSequence);
        Intrinsics.checkNotNull(object2);
        bundle.putString("api_name", (String)object2);
        long l2 = ((cl2_2)object).l;
        long l3 = ((cl2_2)object).k;
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(l2 -= l3);
        ((StringBuilder)charSequence).append("ms");
        charSequence = ((StringBuilder)charSequence).toString();
        bundle.putString("response_time", (String)charSequence);
        charSequence = "response_time_value";
        int n4 = (int)l2;
        bundle.putInt((String)charSequence, n4);
        object2 = AnalyticsManager.Companion;
        m41_02 = this.context;
        object2 = ((AnalyticsManager$Companion)object2).getInstance((Context)m41_02);
        object3 = ((AnalyticsManager)object2).getGa();
        xe xe2 = this.analyticsReporter;
        string3 = "";
        String string4 = "";
        string2 = "request_timer";
        String string5 = "";
        ((GoogleAnalyticsEvents)object3).pushEvent(string2, string3, string4, string5, bundle, xe2);
        return object;
    }
}

