/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorHandle;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AnalyticsDeferredProxy {
    private final Deferred analyticsConnectorDeferred;
    private volatile AnalyticsEventLogger analyticsEventLogger;
    private final List breadcrumbHandlerList;
    private volatile BreadcrumbSource breadcrumbSource;

    public AnalyticsDeferredProxy(Deferred deferred) {
        DisabledBreadcrumbSource disabledBreadcrumbSource = new DisabledBreadcrumbSource();
        UnavailableAnalyticsEventLogger unavailableAnalyticsEventLogger = new UnavailableAnalyticsEventLogger();
        this(deferred, disabledBreadcrumbSource, unavailableAnalyticsEventLogger);
    }

    public AnalyticsDeferredProxy(Deferred arrayList, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger) {
        this.analyticsConnectorDeferred = arrayList;
        this.breadcrumbSource = breadcrumbSource;
        this.breadcrumbHandlerList = arrayList = new ArrayList();
        this.analyticsEventLogger = analyticsEventLogger;
        this.init();
    }

    public static /* synthetic */ void a(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
        analyticsDeferredProxy.lambda$init$2(provider);
    }

    public static /* synthetic */ void b(AnalyticsDeferredProxy analyticsDeferredProxy, String string2, Bundle bundle) {
        analyticsDeferredProxy.lambda$getAnalyticsEventLogger$1(string2, bundle);
    }

    public static /* synthetic */ void c(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
        analyticsDeferredProxy.lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
    }

    private void init() {
        Deferred deferred = this.analyticsConnectorDeferred;
        me_1 me_12 = new me_1(this);
        deferred.whenAvailable(me_12);
    }

    private /* synthetic */ void lambda$getAnalyticsEventLogger$1(String string2, Bundle bundle) {
        this.analyticsEventLogger.logEvent(string2, bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$getDeferredBreadcrumbSource$0(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                try {
                    object = this.breadcrumbSource;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                boolean bl2 = object instanceof DisabledBreadcrumbSource;
                if (bl2) {
                    object = this.breadcrumbHandlerList;
                    object.add(breadcrumbHandler);
                }
                object = this.breadcrumbSource;
                object.registerBreadcrumbHandler(breadcrumbHandler);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$init$2(Provider object) {
        Logger.getLogger().d("AnalyticsConnector now available.");
        object = (AnalyticsConnector)object.get();
        Iterator iterator = new Iterator((AnalyticsConnector)object);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        object = AnalyticsDeferredProxy.subscribeToAnalyticsEvents((AnalyticsConnector)object, crashlyticsAnalyticsListener);
        if (object == null) {
            object = Logger.getLogger();
            iterator = "Could not register Firebase Analytics listener; a listener is already registered.";
            ((Logger)object).w((String)((Object)iterator));
            return;
        }
        Logger.getLogger().d("Registered Firebase Analytics listener.");
        object = new BreadcrumbAnalyticsEventReceiver();
        int n3 = 500;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger((CrashlyticsOriginAnalyticsEventLogger)((Object)iterator), n3, timeUnit);
        synchronized (this) {
            try {
                iterator = this.breadcrumbHandlerList;
                iterator = iterator.iterator();
                while (true) {
                    if ((n3 = (int)(iterator.hasNext() ? 1 : 0)) == 0) {
                        crashlyticsAnalyticsListener.setBreadcrumbEventReceiver((AnalyticsEventReceiver)object);
                        crashlyticsAnalyticsListener.setCrashlyticsOriginEventReceiver(blockingAnalyticsEventLogger);
                        this.breadcrumbSource = object;
                        this.analyticsEventLogger = blockingAnalyticsEventLogger;
                        return;
                    }
                    Object object2 = iterator.next();
                    object2 = (BreadcrumbHandler)object2;
                    ((BreadcrumbAnalyticsEventReceiver)object).registerBreadcrumbHandler((BreadcrumbHandler)object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static AnalyticsConnector$AnalyticsConnectorHandle subscribeToAnalyticsEvents(AnalyticsConnector object, CrashlyticsAnalyticsListener object2) {
        Object object3 = object.registerAnalyticsConnectorListener("clx", (AnalyticsConnector$AnalyticsConnectorListener)object2);
        if (object3 == null) {
            object3 = Logger.getLogger();
            String string2 = "Could not register AnalyticsConnectorListener with Crashlytics origin.";
            ((Logger)object3).d(string2);
            object3 = object.registerAnalyticsConnectorListener("crash", (AnalyticsConnector$AnalyticsConnectorListener)object2);
            if (object3 != null) {
                object = Logger.getLogger();
                object2 = "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.";
                ((Logger)object).w((String)object2);
            }
        }
        return object3;
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        le_1 le_12 = new le_1(this);
        return le_12;
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        ke_1 ke_12 = new ke_1(this);
        return ke_12;
    }
}

