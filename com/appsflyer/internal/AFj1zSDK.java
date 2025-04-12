/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1cSDK;
import com.appsflyer.internal.AFj1sSDK$1;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import com.appsflyer.internal.AFj1wSDK;
import com.appsflyer.internal.H;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

public final class AFj1zSDK
extends AFi1cSDK {
    private final AFd1kSDK getCurrencyIso4217Code;
    private final AFj1wSDK getRevenue;

    public AFj1zSDK(Runnable runnable2, AFd1kSDK aFd1kSDK, AFj1wSDK aFj1wSDK) {
        AFd1qSDK aFd1qSDK = aFd1kSDK.getMediationNetwork();
        super("store", "huawei", aFd1qSDK, runnable2);
        this.getCurrencyIso4217Code = aFd1kSDK;
        this.getRevenue = aFj1wSDK;
    }

    public static /* synthetic */ void a(AFj1zSDK aFj1zSDK, Context context) {
        aFj1zSDK.getCurrencyIso4217Code(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void getCurrencyIso4217Code(Context object) {
        Throwable throwable4;
        Object object2;
        block11: {
            block10: {
                block12: {
                    Throwable throwable2;
                    Object object3;
                    Object object4;
                    Object object5;
                    String string2;
                    String string3;
                    block9: {
                        block7: {
                            block5: {
                                block6: {
                                    int n3;
                                    block8: {
                                        long l2;
                                        string3 = "FEATURE_NOT_SUPPORTED";
                                        string2 = "response";
                                        this.component1 = l2 = System.currentTimeMillis();
                                        this.component2 = object2 = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
                                        object2 = new AFj1sSDK$1(this);
                                        this.addObserver((Observer)object2);
                                        object2 = object.getPackageManager();
                                        n3 = 128;
                                        object2 = object2.resolveContentProvider((String)"com.huawei.appmarket.commondata", (int)n3).packageName;
                                        object5 = this.getMediationNetwork;
                                        long l3 = AFb1qSDK.AFAdRevenueData((Context)object, (String)object2);
                                        object4 = l3;
                                        object3 = "api_ver";
                                        object5.put(object3, object4);
                                        object5 = this.getMediationNetwork;
                                        object4 = "api_ver_name";
                                        object2 = AFb1qSDK.getMediationNetwork((Context)object, (String)object2);
                                        object5.put(object4, object2);
                                        object2 = null;
                                        try {
                                            object5 = object.getContentResolver();
                                            object4 = "content://com.huawei.appmarket.commondata/item/5";
                                            object4 = Uri.parse((String)object4);
                                            object = object.getPackageName();
                                            String[] stringArray = new String[]{object};
                                            boolean bl2 = false;
                                            object3 = null;
                                            Object var15_18 = null;
                                            object2 = object5.query((Uri)object4, null, null, stringArray, null);
                                            if (object2 == null) break block5;
                                            int n4 = object2.moveToFirst();
                                            if (n4 == 0) break block6;
                                            object = this.getMediationNetwork;
                                            object5 = "OK";
                                            object.put(string2, object5);
                                            object = this.getMediationNetwork;
                                            object5 = "referrer";
                                            n3 = 0;
                                            object4 = null;
                                            object4 = object2.getString(0);
                                            object.put(object5, object4);
                                            object = this.getMediationNetwork;
                                            object5 = "click_ts";
                                            n3 = 1;
                                            l3 = object2.getLong(n3);
                                            object4 = l3;
                                            object.put(object5, object4);
                                            object = this.getMediationNetwork;
                                            object5 = "install_end_ts";
                                            n3 = 2;
                                            l3 = object2.getLong(n3);
                                            object4 = l3;
                                            object.put(object5, object4);
                                            n4 = object2.getColumnCount();
                                            int n7 = 3;
                                            if (n4 <= n7) break block7;
                                            object = this.getMediationNetwork;
                                            object4 = "install_begin_ts";
                                            long l4 = object2.getLong(n7);
                                            object5 = l4;
                                            object.put(object4, object5);
                                            object = new HashMap();
                                            n7 = 4;
                                            object5 = object2.getString(n7);
                                            if (object5 == null) break block8;
                                            object4 = "track_id";
                                            ((AbstractMap)object).put(object4, object5);
                                        }
                                        catch (Throwable throwable3) {
                                            throwable2 = throwable3;
                                            break block9;
                                        }
                                    }
                                    object5 = "referrer_ex";
                                    n3 = 5;
                                    object4 = object2.getString(n3);
                                    ((AbstractMap)object).put(object5, object4);
                                    object5 = this.getMediationNetwork;
                                    object4 = "huawei_custom";
                                    object5.put(object4, object);
                                    break block7;
                                }
                                object = this.getMediationNetwork;
                                object.put(string2, string3);
                                break block7;
                            }
                            object = this.getMediationNetwork;
                            object5 = "SERVICE_UNAVAILABLE";
                            object.put(string2, object5);
                        }
                        if (object2 == null) break block10;
                        break block12;
                    }
                    try {
                        Object object6 = this.getMediationNetwork;
                        object6.put(string2, string3);
                        object5 = AFLogger.INSTANCE;
                        object4 = AFh1vSDK.hashCode;
                        object6 = throwable2.getMessage();
                        object6 = object6 != null ? throwable2.getMessage() : "";
                        object3 = object6;
                        Object var13_15 = null;
                        boolean bl3 = true;
                        ((AFh1uSDK)object5).e((AFh1vSDK)((Object)object4), (String)object6, throwable2, false, bl3);
                        if (object2 == null) break block10;
                    }
                    catch (Throwable throwable4) {
                        break block11;
                    }
                }
                object2.close();
            }
            this.getRevenue();
            return;
        }
        if (object2 != null) {
            object2.close();
        }
        throw throwable4;
    }

    private boolean getRevenue(Context object) {
        boolean bl2 = this.getMonetizationNetwork();
        if (!bl2) {
            object = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.hashCode;
            ((AFh1uSDK)object).d(aFh1vSDK, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        Object object2 = this.getRevenue;
        bl2 = object2.getCurrencyIso4217Code((Context)object);
        if (!bl2) {
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.hashCode;
            ((AFh1uSDK)object).d((AFh1vSDK)((Object)object2), "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        object2 = this.getRevenue;
        boolean bl3 = object2.getRevenue((Context)object);
        if (!bl3) {
            object = AFLogger.INSTANCE;
            object2 = AFh1vSDK.hashCode;
            ((AFh1uSDK)object).d((AFh1vSDK)((Object)object2), "Huawei referrer collection disallowed by invalid content provider.");
            return false;
        }
        return true;
    }

    public final void getMediationNetwork(Context context) {
        boolean bl2 = this.getRevenue(context);
        if (!bl2) {
            return;
        }
        ExecutorService executorService = this.getCurrencyIso4217Code.getMonetizationNetwork();
        H h3 = new H(this, context);
        executorService.execute(h3);
    }
}

