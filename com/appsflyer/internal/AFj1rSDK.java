/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.A;
import com.appsflyer.internal.AFa1pSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.AFi1cSDK;
import com.appsflyer.internal.AFj1kSDK;
import com.appsflyer.internal.AFj1sSDK$1;
import com.appsflyer.internal.AFj1sSDK$AFa1zSDK;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Observer;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

public final class AFj1rSDK
extends AFi1cSDK {
    private final ExecutorService getRevenue;

    public AFj1rSDK(ExecutorService executorService, AFd1qSDK aFd1qSDK, Runnable runnable2) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(executorService, string2);
        Intrinsics.checkNotNullParameter(aFd1qSDK, string2);
        Intrinsics.checkNotNullParameter(runnable2, string2);
        super("preload", "samsung", aFd1qSDK, runnable2);
        this.getRevenue = executorService;
    }

    private final boolean AFAdRevenueData(Context context) {
        boolean bl2 = this.getMonetizationNetwork();
        if (!bl2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.copydefault;
            AFh1uSDK.d$default(aFLogger, aFh1vSDK, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        boolean bl3 = AFj1rSDK.getCurrencyIso4217Code(context);
        if (!bl3) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.copydefault;
            AFh1uSDK.d$default(aFLogger, aFh1vSDK, "Referrer collection disallowed by missing content provider.", false, 4, null);
            return false;
        }
        return true;
    }

    private static boolean E_(Cursor cursor) {
        int n3;
        Object object = "RESULT";
        int n4 = cursor.getColumnIndex((String)object);
        if (n4 != (n3 = -1)) {
            return Boolean.parseBoolean(cursor.getString(n4));
        }
        object = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.copydefault;
        AFh1uSDK.d$default((AFh1uSDK)object, aFh1vSDK, "No such column", false, 4, null);
        return false;
    }

    public static /* synthetic */ void a(AFj1rSDK aFj1rSDK, Context context) {
        AFj1rSDK.getMediationNetwork(aFj1rSDK, context);
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        context = context.getPackageManager();
        String string2 = "com.samsung.android.mapsagent.providers.apptracking";
        return (context = context.resolveContentProvider(string2, 0)) != null;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void getMediationNetwork(AFj1rSDK aFj1rSDK, Context object) {
        Object object2;
        int n3;
        block36: {
            void var15_19;
            int n4;
            String[] stringArray;
            Object object3;
            String string2;
            Object object4;
            Object object5;
            block30: {
                block38: {
                    block39: {
                        block37: {
                            int n7;
                            block33: {
                                block34: {
                                    Object object6;
                                    block31: {
                                        block35: {
                                            block32: {
                                                String string3;
                                                String string4;
                                                block29: {
                                                    block28: {
                                                        Object object7;
                                                        long l2;
                                                        string4 = "com.samsung.android.mapsagent";
                                                        string3 = "";
                                                        Intrinsics.checkNotNullParameter(aFj1rSDK, string3);
                                                        Intrinsics.checkNotNullParameter(object, string3);
                                                        aFj1rSDK.component1 = l2 = System.currentTimeMillis();
                                                        aFj1rSDK.component2 = object7 = AFj1sSDK$AFa1zSDK.AFAdRevenueData;
                                                        object7 = new AFj1sSDK$1(aFj1rSDK);
                                                        aFj1rSDK.addObserver((Observer)object7);
                                                        n3 = 24;
                                                        object2 = null;
                                                        object5 = "content://com.samsung.android.mapsagent.providers.apptracking/info";
                                                        object4 = Uri.parse((String)object5);
                                                        object5 = object.getContentResolver();
                                                        object5 = object5.acquireUnstableContentProviderClient((Uri)object4);
                                                        if (object5 == null) break block28;
                                                        try {
                                                            string2 = object.getPackageName();
                                                            object3 = "appsflyer001";
                                                            stringArray = new String[]{object3};
                                                            n4 = 0;
                                                            object6 = null;
                                                            object3 = object5;
                                                            object3 = object5.query((Uri)object4, null, string2, stringArray, null);
                                                            break block29;
                                                        }
                                                        catch (Throwable throwable) {
                                                            object = object5;
                                                            break block30;
                                                        }
                                                    }
                                                    object3 = null;
                                                }
                                                if (object3 == null) break block31;
                                                boolean bl2 = object3.moveToFirst();
                                                if (!bl2) break block31;
                                                bl2 = AFj1rSDK.E_((Cursor)object3);
                                                if (bl2) {
                                                    long l3;
                                                    object4 = "INSTALLED_TIME_TEXT";
                                                    if ((object4 = AFj1kSDK.N_((Cursor)object3, (String)object4)) != null && (object4 = AFa1pSDK.AFAdRevenueData((String)object4, (String)(object6 = "yy:MM:dd:hh:mm"))) != null) {
                                                        l3 = ((Date)object4).getTime();
                                                        object2 = l3;
                                                    }
                                                    if (object2 != null) {
                                                        l3 = ((Number)object2).longValue();
                                                        object2 = aFj1rSDK.getMediationNetwork;
                                                        Intrinsics.checkNotNullExpressionValue(object2, string3);
                                                        string2 = "install_begin_ts";
                                                        object4 = l3;
                                                        object2.put(string2, object4);
                                                    }
                                                    object2 = "MAPS_ID";
                                                    if ((object2 = AFj1kSDK.N_((Cursor)object3, (String)object2)) != null) {
                                                        object4 = aFj1rSDK.getMediationNetwork;
                                                        Intrinsics.checkNotNullExpressionValue(object4, string3);
                                                        object6 = "referrer";
                                                        object4.put(object6, object2);
                                                    }
                                                    object2 = new LinkedHashMap();
                                                    object4 = "DEVICE_NAME";
                                                    if ((object4 = AFj1kSDK.N_((Cursor)object3, (String)object4)) != null) {
                                                        object6 = "device_model";
                                                        object2.put(object6, object4);
                                                    }
                                                    object4 = "COUNTRY";
                                                    if ((object4 = AFj1kSDK.N_((Cursor)object3, (String)object4)) != null) {
                                                        object6 = "country";
                                                        object2.put(object6, object4);
                                                    }
                                                    object4 = "CAMPAIGN_ID";
                                                    if ((object4 = AFj1kSDK.N_((Cursor)object3, (String)object4)) != null) {
                                                        object6 = "campaign_id";
                                                        object2.put(object6, object4);
                                                    }
                                                    if (bl2 = object2.isEmpty() ^ true) {
                                                        object4 = aFj1rSDK.getMediationNetwork;
                                                        Intrinsics.checkNotNullExpressionValue(object4, string3);
                                                        object6 = "samsung_custom";
                                                        object4.put(object6, object2);
                                                    }
                                                    object2 = aFj1rSDK.getMediationNetwork;
                                                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                                                    object4 = "api_ver";
                                                    long l4 = AFb1qSDK.AFAdRevenueData(object, string4);
                                                    object6 = l4;
                                                    object2.put(object4, object6);
                                                    object2 = aFj1rSDK.getMediationNetwork;
                                                    Intrinsics.checkNotNullExpressionValue(object2, string3);
                                                    string3 = "api_ver_name";
                                                    object = AFb1qSDK.getMediationNetwork(object, string4);
                                                    object2.put(string3, object);
                                                    break block32;
                                                }
                                                object4 = AFLogger.INSTANCE;
                                                object6 = AFh1vSDK.copydefault;
                                                string2 = "App was not installed via Samsung MAPS.";
                                                n4 = 4;
                                                boolean bl3 = false;
                                                stringArray = null;
                                                AFh1uSDK.i$default((AFh1uSDK)object4, object6, string2, false, n4, null);
                                            }
                                            object3.close();
                                            int n8 = Build.VERSION.SDK_INT;
                                            if (n8 < n3) break block35;
                                            if (object5 == null) break block36;
                                            break block37;
                                        }
                                        if (object5 == null) break block36;
                                        break block38;
                                    }
                                    try {
                                        object4 = AFLogger.INSTANCE;
                                        object6 = AFh1vSDK.copydefault;
                                        string2 = "Content provider returned no data";
                                        n4 = 4;
                                        boolean bl4 = false;
                                        stringArray = null;
                                        AFh1uSDK.d$default((AFh1uSDK)object4, object6, string2, false, n4, null);
                                        if (object3 == null) break block33;
                                        break block34;
                                    }
                                    catch (Throwable throwable) {
                                        object = object5;
                                        object2 = object3;
                                    }
                                    break block30;
                                }
                                object3.close();
                            }
                            if ((n7 = Build.VERSION.SDK_INT) < n3) break block39;
                            if (object5 == null) break block36;
                        }
                        object5.release();
                        break block36;
                    }
                    if (object5 == null) break block36;
                }
                object5.release();
                break block36;
                catch (Throwable throwable) {
                    boolean bl5 = false;
                    object = null;
                }
            }
            object5 = AFLogger.INSTANCE;
            object3 = AFh1vSDK.copydefault;
            object4 = "Error while collecting referrer data";
            n4 = 1;
            boolean bl6 = true;
            string2 = null;
            stringArray = null;
            ((AFLogger)object5).e((AFh1vSDK)((Object)object3), (String)object4, (Throwable)var15_19, false, false, n4 != 0, bl6);
        }
        aFj1rSDK.getRevenue();
        return;
        finally {
            int n10;
            if (object2 != null) {
                object2.close();
            }
            if ((n10 = Build.VERSION.SDK_INT) >= n3) {
                if (object != null) {
                    object.release();
                }
            } else if (object != null) {
                object.release();
            }
        }
    }

    public final void getMediationNetwork(Context context) {
        Object object = "";
        Intrinsics.checkNotNullParameter(context, (String)object);
        boolean bl2 = this.AFAdRevenueData(context);
        if (!bl2) {
            return;
        }
        object = this.getRevenue;
        A a2 = new A(this, context);
        object.execute(a2);
    }
}

