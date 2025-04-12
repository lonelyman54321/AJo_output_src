/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.os.Process
 *  android.view.View
 *  android.view.ViewConfiguration
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFa1tSDK;
import com.appsflyer.internal.AFb1aSDK;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1gSDK;
import com.appsflyer.internal.AFb1lSDK;
import com.appsflyer.internal.AFb1rSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFb1ySDK;
import com.appsflyer.internal.AFc1eSDK;
import com.appsflyer.internal.AFc1fSDK;
import com.appsflyer.internal.AFc1hSDK;
import com.appsflyer.internal.AFc1iSDK;
import com.appsflyer.internal.AFc1kSDK;
import com.appsflyer.internal.AFd1eSDK;
import com.appsflyer.internal.AFd1iSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1oSDK$5;
import com.appsflyer.internal.AFd1oSDK$AFa1tSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFd1sSDK;
import com.appsflyer.internal.AFd1tSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFd1wSDK;
import com.appsflyer.internal.AFd1xSDK;
import com.appsflyer.internal.AFd1ySDK;
import com.appsflyer.internal.AFe1aSDK;
import com.appsflyer.internal.AFe1iSDK;
import com.appsflyer.internal.AFe1lSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.AFf1aSDK;
import com.appsflyer.internal.AFg1eSDK;
import com.appsflyer.internal.AFg1fSDK;
import com.appsflyer.internal.AFg1gSDK;
import com.appsflyer.internal.AFg1iSDK;
import com.appsflyer.internal.AFg1kSDK;
import com.appsflyer.internal.AFg1nSDK;
import com.appsflyer.internal.AFg1pSDK;
import com.appsflyer.internal.AFg1rSDK;
import com.appsflyer.internal.AFg1sSDK;
import com.appsflyer.internal.AFg1tSDK;
import com.appsflyer.internal.AFg1uSDK;
import com.appsflyer.internal.AFg1vSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFg1ySDK;
import com.appsflyer.internal.AFh1oSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFh1wSDK;
import com.appsflyer.internal.AFh1xSDK;
import com.appsflyer.internal.AFi1fSDK;
import com.appsflyer.internal.AFi1hSDK;
import com.appsflyer.internal.AFi1jSDK;
import com.appsflyer.internal.AFi1kSDK;
import com.appsflyer.internal.AFi1mSDK;
import com.appsflyer.internal.AFi1oSDK;
import com.appsflyer.internal.AFi1qSDK;
import com.appsflyer.internal.AFj1mSDK;
import com.appsflyer.internal.AFj1oSDK;
import com.appsflyer.internal.AFj1uSDK;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class AFd1oSDK
implements AFd1kSDK {
    private static final int getMonetizationNetwork = (int)TimeUnit.SECONDS.toMillis(30);
    private ExecutorService AFAdRevenueData;
    private AFb1uSDK AFInAppEventParameterName;
    private AFd1iSDK AFInAppEventType;
    private AFe1iSDK AFKeystoreWrapper;
    private AFc1kSDK AFLogger;
    private AFg1tSDK afDebugLog;
    private AFg1gSDK afErrorLog;
    private AFc1fSDK afInfoLog;
    private String afRDLog = null;
    private AFi1jSDK afVerboseLog;
    private AFg1rSDK afWarnLog;
    private AFd1qSDK areAllFieldsValid;
    private AFf1aSDK component1;
    private AFd1sSDK component2;
    private PurchaseHandler component3;
    private AFe1wSDK component4;
    private AFj1oSDK copy;
    private AFg1kSDK copydefault;
    private AFd1vSDK d;
    private AFd1wSDK e;
    private AFe1aSDK equals;
    private AFc1hSDK force;
    public final AFd1nSDK getCurrencyIso4217Code;
    private AFd1tSDK getLevel;
    private ExecutorService getMediationNetwork;
    private ScheduledExecutorService getRevenue;
    private AFb1cSDK hashCode;
    private AFi1mSDK i;
    private AFi1qSDK registerClient;
    private AFh1oSDK toString;
    private AFi1oSDK unregisterClient;
    private AFa1aSDK v;
    private AFj1uSDK valueOf;
    private AFg1wSDK values;
    private AFh1xSDK w;

    public AFd1oSDK() {
        AFd1nSDK aFd1nSDK;
        this.getCurrencyIso4217Code = aFd1nSDK = new AFd1nSDK();
    }

    public static /* synthetic */ SharedPreferences a(AFd1oSDK aFd1oSDK) {
        return aFd1oSDK.u_();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AFd1iSDK afErrorLogForExcManagerOnly() {
        synchronized (this) {
            try {
                AFd1iSDK aFd1iSDK = this.AFInAppEventType;
                if (aFd1iSDK != null) return this.AFInAppEventType;
                this.AFInAppEventType = aFd1iSDK = new AFd1iSDK(this);
                return this.AFInAppEventType;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private String afRDLog() {
        Object object = this.afRDLog;
        if (object == null) {
            object = new AFb1aSDK();
            this.afRDLog = object = ((AFb1aSDK)object).getMediationNetwork();
        }
        return this.afRDLog;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AFe1wSDK afVerboseLog() {
        synchronized (this) {
            try {
                AFe1wSDK aFe1wSDK = this.component4;
                if (aFe1wSDK != null) return this.component4;
                int n3 = getMonetizationNetwork;
                AFe1lSDK aFe1lSDK = new AFe1lSDK(n3);
                ExecutorService executorService = this.getMonetizationNetwork();
                this.component4 = aFe1wSDK = new AFe1wSDK(aFe1lSDK, executorService);
                return this.component4;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ExecutorService afWarnLog() {
        synchronized (this) {
            try {
                ExecutorService executorService = this.getMediationNetwork;
                if (executorService != null) return this.getMediationNetwork;
                executorService = Executors.newSingleThreadExecutor();
                String string2 = "";
                Intrinsics.checkNotNullExpressionValue(executorService, string2);
                this.getMediationNetwork = executorService;
                return this.getMediationNetwork;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* synthetic */ void b(Runnable runnable2, ThreadPoolExecutor threadPoolExecutor) {
        AFd1oSDK.getRevenue(runnable2, threadPoolExecutor);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private AFg1rSDK getLevel() {
        synchronized (this) {
            try {
                AFg1rSDK aFg1rSDK = this.afWarnLog;
                if (aFg1rSDK != null) return this.afWarnLog;
                AFd1nSDK aFd1nSDK = this.values();
                AFd1qSDK aFd1qSDK = this.getMediationNetwork();
                this.afWarnLog = aFg1rSDK = new AFg1rSDK(aFd1nSDK, aFd1qSDK);
                return this.afWarnLog;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private static /* synthetic */ void getRevenue(Runnable runnable2, ThreadPoolExecutor object) {
        try {
            object = ((ThreadPoolExecutor)object).getQueue();
        }
        catch (InterruptedException interruptedException) {
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", interruptedException);
            Thread.currentThread().interrupt();
            return;
        }
        object.put(runnable2);
    }

    private /* synthetic */ SharedPreferences u_() {
        Object object = this.getCurrencyIso4217Code.AFAdRevenueData;
        if (object != null) {
            return AFb1rSDK.h_(object);
        }
        object = new IllegalStateException("Context must be set via setContext method before calling this dependency.");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ScheduledExecutorService AFAdRevenueData() {
        synchronized (this) {
            try {
                ScheduledExecutorService scheduledExecutorService = this.getRevenue;
                if (scheduledExecutorService != null) return this.getRevenue;
                int n3 = 2;
                scheduledExecutorService = Executors.newScheduledThreadPool(n3);
                String string2 = "";
                Intrinsics.checkNotNullExpressionValue(scheduledExecutorService, string2);
                this.getRevenue = scheduledExecutorService;
                return this.getRevenue;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final AFi1oSDK AFInAppEventParameterName() {
        AFi1oSDK aFi1oSDK = this.unregisterClient;
        if (aFi1oSDK == null) {
            this.unregisterClient = aFi1oSDK = new AFi1fSDK();
        }
        return this.unregisterClient;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1iSDK AFInAppEventType() {
        synchronized (this) {
            try {
                AFe1iSDK aFe1iSDK = this.AFKeystoreWrapper;
                if (aFe1iSDK != null) return this.AFKeystoreWrapper;
                AFd1qSDK aFd1qSDK = this.getMediationNetwork();
                AFd1rSDK aFd1rSDK = this.getRevenue();
                this.AFKeystoreWrapper = aFe1iSDK = new AFe1iSDK(aFd1qSDK, aFd1rSDK);
                return this.AFKeystoreWrapper;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFg1wSDK AFKeystoreWrapper() {
        synchronized (this) {
            try {
                AFg1wSDK aFg1wSDK = this.values;
                if (aFg1wSDK != null) return this.values;
                AFd1nSDK aFd1nSDK = this.values();
                AFg1uSDK aFg1uSDK = new AFg1uSDK();
                this.values = aFg1wSDK = new AFg1wSDK(aFd1nSDK, aFg1uSDK);
                return this.values;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final AFi1mSDK AFLogger() {
        AFi1mSDK aFi1mSDK = this.i;
        if (aFi1mSDK == null) {
            this.i = aFi1mSDK = new AFi1kSDK();
        }
        return this.i;
    }

    public final AFg1gSDK afDebugLog() {
        AFg1gSDK aFg1gSDK = this.afErrorLog;
        if (aFg1gSDK == null) {
            AFd1rSDK aFd1rSDK = this.getRevenue();
            AFg1eSDK aFg1eSDK = new AFg1eSDK(aFd1rSDK);
            this.afErrorLog = aFg1gSDK = new AFg1fSDK(aFg1eSDK);
        }
        return this.afErrorLog;
    }

    public final /* synthetic */ AFd1eSDK afErrorLog() {
        return this.afErrorLogForExcManagerOnly();
    }

    public final AFc1hSDK afInfoLog() {
        AFc1hSDK aFc1hSDK = this.force;
        if (aFc1hSDK == null) {
            AFd1rSDK aFd1rSDK = this.getRevenue();
            this.force = aFc1hSDK = new AFc1iSDK(aFd1rSDK);
        }
        return this.force;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final PurchaseHandler areAllFieldsValid() {
        synchronized (this) {
            try {
                PurchaseHandler purchaseHandler = this.component3;
                if (purchaseHandler != null) return this.component3;
                this.component3 = purchaseHandler = new PurchaseHandler(this);
                return this.component3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final AFg1kSDK component1() {
        AFd1oSDK aFd1oSDK = this;
        Object object = this.copydefault;
        if (object == null) {
            String string2 = this.afRDLog();
            Context context = this.getCurrencyIso4217Code.AFAdRevenueData;
            Object object2 = "Context must be set via setContext method before calling this dependency.";
            if (context != null) {
                Object object3;
                Object object4;
                Object object5;
                AFi1oSDK aFi1oSDK = this.unregisterClient;
                if (aFi1oSDK == null) {
                    this.unregisterClient = aFi1oSDK = new AFi1fSDK();
                }
                aFi1oSDK = aFd1oSDK.unregisterClient;
                AFd1vSDK aFd1vSDK = aFd1oSDK.d;
                if (aFd1vSDK == null) {
                    aFd1oSDK.d = aFd1vSDK = new AFa1tSDK();
                }
                aFd1vSDK = aFd1oSDK.d;
                AFj1oSDK aFj1oSDK = aFd1oSDK.copy;
                if (aFj1oSDK == null) {
                    object5 = aFd1oSDK.getCurrencyIso4217Code.AFAdRevenueData;
                    if (object5 != null) {
                        object4 = this.afWarnLog();
                        aFd1oSDK.copy = aFj1oSDK = new AFj1mSDK((Context)object5, (ExecutorService)object4);
                    } else {
                        object = new IllegalStateException((String)object2);
                        throw object;
                    }
                }
                aFj1oSDK = aFd1oSDK.copy;
                object5 = aFd1oSDK.v;
                if (object5 == null) {
                    object5 = new AFb1ySDK();
                    aFd1oSDK.v = object5;
                }
                object5 = aFd1oSDK.v;
                object4 = this.component3();
                AFd1rSDK aFd1rSDK = this.getRevenue();
                AFd1qSDK aFd1qSDK = this.getMediationNetwork();
                AFi1qSDK aFi1qSDK = aFd1oSDK.registerClient;
                if (aFi1qSDK == null) {
                    object3 = aFd1oSDK.getCurrencyIso4217Code.AFAdRevenueData;
                    if (object3 != null) {
                        aFd1oSDK.registerClient = aFi1qSDK = new AFi1qSDK((Context)object3);
                    } else {
                        object = new IllegalStateException((String)object2);
                        throw object;
                    }
                }
                aFi1qSDK = aFd1oSDK.registerClient;
                object3 = this.AFKeystoreWrapper();
                AFd1nSDK aFd1nSDK = this.values();
                AFg1rSDK aFg1rSDK = this.getLevel();
                object2 = aFd1oSDK.getLevel;
                if (object2 == null) {
                    aFd1oSDK.getLevel = object2 = new AFd1tSDK();
                }
                AFd1tSDK aFd1tSDK = aFd1oSDK.getLevel;
                object2 = object;
                aFd1oSDK.copydefault = object = new AFg1iSDK(string2, context, aFi1oSDK, aFd1vSDK, aFj1oSDK, (AFa1aSDK)object5, (AFh1oSDK)object4, aFd1rSDK, aFd1qSDK, aFi1qSDK, (AFg1wSDK)object3, aFd1nSDK, aFg1rSDK, aFd1tSDK);
            } else {
                object = new IllegalStateException((String)object2);
                throw object;
            }
        }
        return aFd1oSDK.copydefault;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFf1aSDK component2() {
        synchronized (this) {
            try {
                Object object = this.component1;
                if (object != null) return this.component1;
                object = this.getRevenue();
                AFg1vSDK aFg1vSDK = new AFg1vSDK((AFd1rSDK)object);
                object = this.getMediationNetwork();
                AFg1sSDK aFg1sSDK = new AFg1sSDK((AFd1qSDK)object, aFg1vSDK);
                AFg1ySDK aFg1ySDK = new AFg1ySDK();
                AFd1qSDK aFd1qSDK = this.getMediationNetwork();
                AFg1wSDK aFg1wSDK = this.AFKeystoreWrapper();
                Object object2 = this.afVerboseLog();
                Object object3 = this.getMediationNetwork();
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                AFe1iSDK aFe1iSDK = this.AFInAppEventType();
                AFe1qSDK aFe1qSDK = new AFe1qSDK((AFe1wSDK)object2, (AFd1qSDK)object3, appsFlyerProperties, aFe1iSDK);
                object3 = this.copy();
                object2 = object;
                this.component1 = object = new AFf1aSDK(aFg1ySDK, aFd1qSDK, aFg1wSDK, aFg1vSDK, aFe1qSDK, aFg1sSDK, (AFe1aSDK)object3);
                return this.component1;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFh1oSDK component3() {
        synchronized (this) {
            try {
                AFh1oSDK aFh1oSDK = this.toString;
                if (aFh1oSDK != null) return this.toString;
                AFd1rSDK aFd1rSDK = this.getRevenue();
                this.toString = aFh1oSDK = new AFh1oSDK(aFd1rSDK);
                return this.toString;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final AFj1oSDK component4() {
        Object object = this.copy;
        if (object == null) {
            Context context = this.getCurrencyIso4217Code.AFAdRevenueData;
            if (context != null) {
                ExecutorService executorService = this.afWarnLog();
                this.copy = object = new AFj1mSDK(context, executorService);
            } else {
                object = new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                throw object;
            }
        }
        return this.copy;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFe1aSDK copy() {
        synchronized (this) {
            try {
                Object object = this.equals;
                if (object != null) return this.equals;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                AFd1oSDK$5 aFd1oSDK$5 = new AFd1oSDK$5();
                AFd1oSDK$AFa1tSDK aFd1oSDK$AFa1tSDK = new AFd1oSDK$AFa1tSDK();
                int n3 = 2;
                int n4 = 6;
                long l2 = 300L;
                Object object2 = object;
                object = new ThreadPoolExecutor(n3, n4, l2, timeUnit, (BlockingQueue<Runnable>)aFd1oSDK$5, aFd1oSDK$AFa1tSDK);
                object2 = new Object();
                ((ThreadPoolExecutor)object).setRejectedExecutionHandler((RejectedExecutionHandler)object2);
                this.equals = object2 = new AFe1aSDK((ExecutorService)object);
                return this.equals;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFb1cSDK copydefault() {
        synchronized (this) {
            try {
                AFb1cSDK aFb1cSDK = this.hashCode;
                if (aFb1cSDK != null) return this.hashCode;
                this.hashCode = aFb1cSDK = new AFb1gSDK(this);
                return this.hashCode;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFc1kSDK d() {
        synchronized (this) {
            try {
                AFc1kSDK aFc1kSDK = this.AFLogger;
                if (aFc1kSDK != null) return this.AFLogger;
                this.AFLogger = aFc1kSDK = new AFc1kSDK(this);
                return this.AFLogger;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final AFd1tSDK e() {
        AFd1tSDK aFd1tSDK = this.getLevel;
        if (aFd1tSDK == null) {
            this.getLevel = aFd1tSDK = new AFd1tSDK();
        }
        return this.getLevel;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFj1uSDK equals() {
        synchronized (this) {
            try {
                AFj1uSDK aFj1uSDK = this.valueOf;
                if (aFj1uSDK != null) return this.valueOf;
                this.valueOf = aFj1uSDK = new AFj1uSDK(this);
                return this.valueOf;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFi1jSDK force() {
        var1_1 = null;
        var2_5 = 1;
        var3_6 = 2;
        var4_7 = 3;
        var5_8 = this.afVerboseLog;
        if (var5_8 != null) return this.afVerboseLog;
        var5_8 = this.getMediationNetwork();
        var6_9 = this.values();
        var7_10 = this.AFKeystoreWrapper();
        {
            catch (Throwable var1_2) {
                var5_8 = var1_2;
                break block6;
            }
        }
        ** try [egrp 1[TRYBLOCK] [4 : 38->121)] { 
lbl-1000:
        // 1 sources

        {
            catch (Throwable var1_3) {
                var16_19 = var1_3.getCause();
                if (var16_19 == null) throw var1_3;
                throw var16_19;
            }
        }
lbl-1000:
        // 1 sources

        {
            block6: {
                var8_11 = new Object[var4_7];
                var8_11[var3_6] = var7_10;
                var8_11[var2_5] = var6_9;
                var8_11[0] = var5_8;
                var5_8 = AFi1hSDK.registerClient;
                var9_12 = -1187076423;
                var7_10 = var9_12;
                var7_10 = var5_8.get(var7_10);
                if (var7_10 != null) ** GOTO lbl45
                var10_13 = View.combineMeasuredStates((int)0, (int)0) + 37;
                var11_14 = ViewConfiguration.getDoubleTapTimeout() >> 16;
                var12_15 = Process.getThreadPriority((int)0) + 20 >> 6;
                var13_16 = 64180;
                var12_15 = (char)(var12_15 + var13_16);
                {
                    var7_10 = AFi1hSDK.getMonetizationNetwork(var10_13, var11_14, var12_15);
                    var7_10 = (Class)var7_10;
                    var14_17 = new Class[var4_7];
                    var14_17[0] = var15_18 = AFd1qSDK.class;
                    var14_17[var2_5] = var1_1 = AFd1nSDK.class;
                    var1_1 = AFg1wSDK.class;
                    var14_17[var3_6] = var1_1;
                    var7_10 = var7_10.getDeclaredConstructor(var14_17);
                    var1_1 = var9_12;
                    var5_8.put(var1_1, var7_10);
lbl45:
                    // 2 sources

                    var7_10 = var7_10;
                    var1_1 = var7_10.newInstance(var8_11);
                    var1_1 = (AFi1jSDK)var1_1;
                }
                this.afVerboseLog = var1_1;
                return this.afVerboseLog;
            }
            var16_20 = com.appsflyer.AFLogger.INSTANCE;
            var17_21 = AFh1vSDK.getRevenue;
            var1_4 /* !! */  = var5_8.getMessage();
            var1_4 /* !! */  = var1_4 /* !! */  != null ? var5_8.getMessage() : "";
        }
        var14_17 = var1_4 /* !! */ ;
        var9_12 = 0;
        var6_9 = null;
        var10_13 = 0;
        var7_10 = null;
        var16_20.e(var17_21, (String)var1_4 /* !! */ , (Throwable)var5_8, false, false);
        return this.afVerboseLog;
    }

    public final AFe1qSDK getCurrencyIso4217Code() {
        AFe1wSDK aFe1wSDK = this.afVerboseLog();
        AFd1qSDK aFd1qSDK = this.getMediationNetwork();
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        AFe1iSDK aFe1iSDK = this.AFInAppEventType();
        AFe1qSDK aFe1qSDK = new AFe1qSDK(aFe1wSDK, aFd1qSDK, appsFlyerProperties, aFe1iSDK);
        return aFe1qSDK;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFd1qSDK getMediationNetwork() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                AFd1tSDK aFd1tSDK;
                AFd1rSDK aFd1rSDK;
                AFd1nSDK aFd1nSDK;
                AFd1qSDK aFd1qSDK;
                block4: {
                    try {
                        aFd1qSDK = this.areAllFieldsValid;
                        if (aFd1qSDK != null) return this.areAllFieldsValid;
                        aFd1nSDK = this.values();
                        aFd1rSDK = this.getRevenue();
                        aFd1tSDK = this.getLevel;
                        if (aFd1tSDK != null) break block4;
                        this.getLevel = aFd1tSDK = new AFd1tSDK();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                aFd1tSDK = this.getLevel;
                ExecutorService executorService = this.getMonetizationNetwork();
                this.areAllFieldsValid = aFd1qSDK = new AFd1qSDK(aFd1nSDK, aFd1rSDK, aFd1tSDK, executorService);
                return this.areAllFieldsValid;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ExecutorService getMonetizationNetwork() {
        synchronized (this) {
            try {
                ExecutorService executorService = this.AFAdRevenueData;
                if (executorService != null) return this.AFAdRevenueData;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                int n3 = 32;
                int n4 = 5;
                long l2 = 60;
                this.AFAdRevenueData = executorService = new AFd1ySDK(0, n4, l2, timeUnit, synchronousQueue, null, n3, null);
                return this.AFAdRevenueData;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final AFd1rSDK getRevenue() {
        Object object = this.component2;
        if (object == null) {
            int n3 = 1;
            Object object2 = new lg0_2(this, n3);
            object = new AFd1mSDK((Function0)object2);
            this.component2 = object2 = new AFd1sSDK((AFd1mSDK)object);
        }
        return this.component2;
    }

    public final AFh1xSDK i() {
        AFh1xSDK aFh1xSDK = this.w;
        if (aFh1xSDK == null) {
            this.w = aFh1xSDK = new AFh1wSDK(this);
        }
        return this.w;
    }

    public final AFi1qSDK registerClient() {
        Object object = this.registerClient;
        if (object == null) {
            Context context = this.getCurrencyIso4217Code.AFAdRevenueData;
            if (context != null) {
                this.registerClient = object = new AFi1qSDK(context);
            } else {
                object = new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                throw object;
            }
        }
        return this.registerClient;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFc1fSDK unregisterClient() {
        synchronized (this) {
            try {
                AFc1fSDK aFc1fSDK = this.afInfoLog;
                if (aFc1fSDK != null) return this.afInfoLog;
                AFd1nSDK aFd1nSDK = this.values();
                this.afInfoLog = aFc1fSDK = new AFc1eSDK(aFd1nSDK);
                return this.afInfoLog;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final AFg1tSDK v() {
        Object object = this.afDebugLog;
        if (object == null) {
            Object object2 = this.getCurrencyIso4217Code.AFAdRevenueData;
            if (object2 != null) {
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                AFg1nSDK aFg1nSDK = new AFg1nSDK((Context)object2, appsFlyerProperties);
                object2 = this.getLevel;
                if (object2 == null) {
                    object2 = new AFd1tSDK();
                    this.getLevel = object2;
                }
                object2 = this.getLevel;
                appsFlyerProperties = AppsFlyerProperties.getInstance();
                this.afDebugLog = object = new AFg1pSDK(aFg1nSDK, (AFd1tSDK)object2, appsFlyerProperties);
            } else {
                object = new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                throw object;
            }
        }
        return this.afDebugLog;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFb1uSDK valueOf() {
        synchronized (this) {
            try {
                AFb1uSDK aFb1uSDK = this.AFInAppEventParameterName;
                if (aFb1uSDK != null) return this.AFInAppEventParameterName;
                AFd1nSDK aFd1nSDK = this.values();
                this.AFInAppEventParameterName = aFb1uSDK = new AFb1lSDK(aFd1nSDK);
                return this.AFInAppEventParameterName;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final AFd1nSDK values() {
        synchronized (this) {
            return this.getCurrencyIso4217Code;
        }
    }

    public final AFd1wSDK w() {
        AFd1wSDK aFd1wSDK = this.e;
        if (aFd1wSDK == null) {
            ExecutorService executorService = this.afWarnLog();
            ScheduledExecutorService scheduledExecutorService = this.AFAdRevenueData();
            AFc1kSDK aFc1kSDK = this.d();
            AFi1mSDK aFi1mSDK = this.i;
            if (aFi1mSDK == null) {
                this.i = aFi1mSDK = new AFi1kSDK();
            }
            aFi1mSDK = this.i;
            this.e = aFd1wSDK = new AFd1xSDK(executorService, scheduledExecutorService, aFc1kSDK, aFi1mSDK);
        }
        return this.e;
    }
}

