/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.internal.AFc1dSDK;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public final class AFb1mSDK
extends AFc1dSDK {
    public AFb1mSDK(Context context, Executor executor) {
        String[] stringArray = new String[]{"E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1"};
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", stringArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String getRevenue() {
        Object object;
        Object object2;
        block7: {
            block6: {
                int n3 = 0;
                object2 = null;
                String string2 = "aid";
                try {
                    object = this.getRevenue;
                    ContentResolver contentResolver = object.getContentResolver();
                    String string3 = "content://";
                    object = new StringBuilder(string3);
                    string3 = this.AFAdRevenueData;
                    ((StringBuilder)object).append(string3);
                    object = object.toString();
                    string3 = Uri.parse((String)object);
                    String[] stringArray = new String[]{string2};
                    object = contentResolver.query((Uri)string3, stringArray, null, null, null);
                    if (object == null) break block6;
                }
                catch (Throwable throwable) {
                    object = null;
                    object2 = throwable;
                    break block7;
                }
                try {
                    boolean bl2 = object.moveToFirst();
                    if (!bl2) break block6;
                    n3 = object.getColumnIndexOrThrow(string2);
                    object2 = object.getString(n3);
                }
                catch (Throwable throwable) {
                    break block7;
                }
                object.close();
                return object2;
            }
            if (object != null) {
                object.close();
            }
            return null;
        }
        if (object != null) {
            object.close();
        }
        throw object2;
    }

    public final /* synthetic */ Object AFAdRevenueData() {
        Executor executor = this.getCurrencyIso4217Code;
        FutureTask futureTask = this.getMediationNetwork;
        executor.execute(futureTask);
        return (String)super.AFAdRevenueData();
    }

    public final String getMediationNetwork() {
        Executor executor = this.getCurrencyIso4217Code;
        FutureTask futureTask = this.getMediationNetwork;
        executor.execute(futureTask);
        return (String)super.AFAdRevenueData();
    }

    public final /* synthetic */ Object getMonetizationNetwork() {
        return this.getRevenue();
    }
}

