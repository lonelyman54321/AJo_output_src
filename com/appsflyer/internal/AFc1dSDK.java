/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFc1dSDK$5;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AFc1dSDK {
    public final String AFAdRevenueData;
    public final Executor getCurrencyIso4217Code;
    public final FutureTask getMediationNetwork;
    private final String[] getMonetizationNetwork;
    public final Context getRevenue;

    public AFc1dSDK(Context context, Executor executor, String string2, String ... stringArray) {
        FutureTask futureTask;
        AFc1dSDK$5 aFc1dSDK$5 = new AFc1dSDK$5(this);
        this.getMediationNetwork = futureTask = new FutureTask(aFc1dSDK$5);
        this.getRevenue = context;
        this.AFAdRevenueData = string2;
        this.getMonetizationNetwork = stringArray;
        this.getCurrencyIso4217Code = executor;
    }

    /*
     * WARNING - void declaration
     */
    public Object AFAdRevenueData() {
        TimeoutException timeoutException2;
        block7: {
            void var1_5;
            FutureTask futureTask = this.getMediationNetwork;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long l2 = 500L;
            try {
                return futureTask.get(l2, timeUnit);
            }
            catch (ExecutionException executionException) {
            }
            catch (InterruptedException interruptedException) {
            }
            catch (TimeoutException timeoutException2) {
                break block7;
            }
            AFLogger.afErrorLog(var1_5.getMessage(), (Throwable)var1_5, false, true);
            return null;
        }
        AFLogger.afErrorLog(timeoutException2.getMessage(), timeoutException2, false, false);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean getCurrencyIso4217Code() {
        void var2_6;
        boolean bl2;
        block16: {
            block15: {
                bl2 = true;
                Object object = this.getRevenue;
                object = object.getPackageManager();
                Object object2 = this.AFAdRevenueData;
                int n3 = 128;
                object = object.resolveContentProvider((String)object2, n3);
                if (object == null) break block15;
                object2 = this.getMonetizationNetwork;
                object2 = Arrays.asList(object2);
                Context context = this.getRevenue;
                context = context.getPackageManager();
                object = object.packageName;
                object = AFb1qSDK.e_((PackageManager)context, (String)object);
                try {
                    boolean bl3 = object2.contains(object);
                    if (bl3) {
                        return bl2;
                    }
                    break block15;
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                }
                catch (CertificateException certificateException) {
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
                break block16;
            }
            return false;
        }
        AFLogger.afErrorLog(var2_6.getMessage(), (Throwable)var2_6, false, bl2);
        return false;
    }

    public abstract Object getMonetizationNetwork();
}

