/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.services;

import in.juspay.hyper.core.JuspayLogger;
import in.juspay.hypersdk.core.SdkTracker;
import in.juspay.services.HyperServices;
import java.lang.ref.WeakReference;

class HyperServices$HyperExceptionHandler
implements Thread.UncaughtExceptionHandler {
    private static final String LOG_TAG = "UncaughtExceptionHandler";
    private WeakReference hyperServices;
    private Thread.UncaughtExceptionHandler merchantHandler;

    public HyperServices$HyperExceptionHandler(HyperServices hyperServices) {
        WeakReference<HyperServices> weakReference;
        this.hyperServices = weakReference = new WeakReference<HyperServices>(hyperServices);
        SdkTracker.trackBootLifecycle("hypersdk", "info", "hyper_exception_handler", "ExceptionHandler", "created HyperExceptionHandler");
    }

    public void clearHyperExceptionHandler() {
        boolean bl2;
        Object object = this.merchantHandler;
        if (object == null || !(bl2 = object instanceof HyperServices$HyperExceptionHandler)) {
            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object);
        }
        this.hyperServices = object = new Object(null);
        this.merchantHandler = null;
        SdkTracker.trackBootLifecycle("hypersdk", "info", "hyper_exception_handler", "ExceptionHandler", "destroyed HyperExceptionHandler and registered merchant's exception handler as default");
    }

    public void setAsDefaultExceptionHandler() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        this.merchantHandler = uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        SdkTracker.trackBootLifecycle("hypersdk", "info", "hyper_exception_handler", "ExceptionHandler", "registered HyperExceptionHandler as default uncaught exception handler");
    }

    public void uncaughtException(Thread object, Throwable throwable) {
        Object object2 = (HyperServices)this.hyperServices.get();
        String string2 = LOG_TAG;
        if (object2 != null) {
            String string3 = "sending crash to tracker";
            JuspayLogger.w(string2, string3);
            HyperServices.access$100((HyperServices)object2, throwable);
        }
        if ((object2 = this.merchantHandler) != null) {
            JuspayLogger.w(string2, "forwarding crash to merchant");
            object2 = this.merchantHandler;
            object2.uncaughtException((Thread)object, throwable);
        } else {
            object = "merchant exception handler not found, exiting";
            JuspayLogger.e(string2, (String)object);
            int n3 = 1;
            System.exit(n3);
        }
    }
}

