/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.core.SdkTracker;
import java.util.Locale;

class JuspayServices$2
implements DuiLogger {
    final /* synthetic */ JuspayServices this$0;

    public JuspayServices$2(JuspayServices juspayServices) {
        this.this$0 = juspayServices;
    }

    public void d(String string2, String string3) {
    }

    public void e(String string2, String string3) {
        JuspayLogger.e(string2, string3);
        SdkTracker sdkTracker = JuspayServices.access$000(this.this$0);
        Locale locale = Locale.getDefault();
        String string4 = string2.toLowerCase(locale);
        sdkTracker.trackAction("dynamic_ui", "error", "mystique", string4, string3);
    }

    public void i(String string2, String string3) {
    }

    public void logLifeCycleException(String string2, String string3, Exception exception) {
        SdkTracker sdkTracker = JuspayServices.access$000(this.this$0);
        String string4 = JuspayServices.access$400(this.this$0);
        sdkTracker.trackAndLogException(string4, "lifecycle", "android", string2, string3, exception);
    }

    public void logLifeCycleInfo(String string2, String string3) {
        JuspayServices.access$000(this.this$0).trackLifecycle("hypersdk", "info", "juspay_services", string2, string3);
    }
}

