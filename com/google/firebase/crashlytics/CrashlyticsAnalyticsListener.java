/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.io.Serializable;
import java.util.Locale;

class CrashlyticsAnalyticsListener
implements AnalyticsConnector$AnalyticsConnectorListener {
    static final String CRASHLYTICS_ORIGIN = "clx";
    static final String EVENT_NAME_KEY = "name";
    static final String EVENT_ORIGIN_KEY = "_o";
    static final String EVENT_PARAMS_KEY = "params";
    private AnalyticsEventReceiver breadcrumbEventReceiver;
    private AnalyticsEventReceiver crashlyticsOriginEventReceiver;

    private static void notifyEventReceiver(AnalyticsEventReceiver analyticsEventReceiver, String string2, Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(string2, bundle);
    }

    private void notifyEventReceivers(String string2, Bundle bundle) {
        String string3 = CRASHLYTICS_ORIGIN;
        Object object = bundle.getString(EVENT_ORIGIN_KEY);
        boolean bl2 = string3.equals(object);
        object = bl2 ? this.crashlyticsOriginEventReceiver : this.breadcrumbEventReceiver;
        CrashlyticsAnalyticsListener.notifyEventReceiver((AnalyticsEventReceiver)object, string2, bundle);
    }

    public void onMessageTriggered(int n3, Bundle bundle) {
        Object object = Logger.getLogger();
        Serializable serializable = Locale.US;
        String string2 = "Analytics listener received message. ID: ";
        serializable = new StringBuilder(string2);
        ((StringBuilder)serializable).append(n3);
        ((StringBuilder)serializable).append(", Extras: ");
        ((StringBuilder)serializable).append(bundle);
        String string3 = ((StringBuilder)serializable).toString();
        ((Logger)object).v(string3);
        if (bundle == null) {
            return;
        }
        string3 = bundle.getString(EVENT_NAME_KEY);
        if (string3 != null) {
            object = EVENT_PARAMS_KEY;
            if ((bundle = bundle.getBundle((String)object)) == null) {
                bundle = new Bundle();
            }
            this.notifyEventReceivers(string3, bundle);
        }
    }

    public void setBreadcrumbEventReceiver(AnalyticsEventReceiver analyticsEventReceiver) {
        this.breadcrumbEventReceiver = analyticsEventReceiver;
    }

    public void setCrashlyticsOriginEventReceiver(AnalyticsEventReceiver analyticsEventReceiver) {
        this.crashlyticsOriginEventReceiver = analyticsEventReceiver;
    }
}

