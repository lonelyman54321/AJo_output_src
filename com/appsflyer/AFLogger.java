/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import com.appsflyer.AFLogger$1;
import com.appsflyer.AFLogger$2;
import com.appsflyer.AFLogger$3;
import com.appsflyer.AFLogger$4;
import com.appsflyer.AFLogger$5;
import com.appsflyer.AFLogger$6;
import com.appsflyer.AFLogger$7;
import com.appsflyer.AFLogger$9;
import com.appsflyer.internal.AFh1uSDK;
import com.appsflyer.internal.AFh1vSDK;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class AFLogger
extends AFh1uSDK {
    public static final AFLogger INSTANCE;
    private static final rq1_2 getCurrencyIso4217Code;
    private static final rq1_2 getRevenue;

    static {
        AFLogger aFLogger;
        INSTANCE = aFLogger = new AFLogger();
        getRevenue = yr1_2.b(AFLogger$7.getMonetizationNetwork);
        getCurrencyIso4217Code = yr1_2.b(AFLogger$2.getRevenue);
    }

    private AFLogger() {
    }

    public static /* synthetic */ void a(Function1 function1) {
        AFLogger.getMonetizationNetwork(function1);
    }

    public static final void afDebugLog(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        aFLogger.d(aFh1vSDK, string2, true);
    }

    public static final void afDebugLog(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        aFLogger.d(aFh1vSDK, string2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void afErrorLog(String string2, Throwable throwable) {
        boolean bl2;
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        if (string2 == null || (bl2 = b.k(string2))) {
            string2 = "null";
        }
        String string3 = string2;
        if (throwable == null) {
            string2 = "Invoked with null Throwable";
            throwable = new NullPointerException(string2);
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, throwable, false, false, false, false, 120, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void afErrorLog(String string2, Throwable throwable, boolean bl2) {
        boolean bl3;
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        if (string2 == null || (bl3 = b.k(string2))) {
            string2 = "null";
        }
        String string3 = string2;
        if (throwable == null) {
            string2 = "Invoked with null Throwable";
            throwable = new NullPointerException(string2);
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, throwable, false, bl2, false, false, 104, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void afErrorLog(String string2, Throwable throwable, boolean bl2, boolean bl3) {
        boolean bl4;
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        if (string2 == null || (bl4 = b.k(string2))) {
            string2 = "null";
        }
        String string3 = string2;
        if (throwable == null) {
            string2 = "Invoked with null Throwable";
            throwable = new NullPointerException(string2);
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, throwable, false, bl2, bl3, false, 72, null);
    }

    public static final void afErrorLog(String string2, Throwable throwable, boolean bl2, boolean bl3, boolean bl4) {
        String string3 = "";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(throwable, string3);
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, string2, throwable, bl2, bl3, bl4, false, 64, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void afErrorLogForExcManagerOnly(String string2, Throwable throwable) {
        boolean bl2;
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        if (string2 == null || (bl2 = b.k(string2))) {
            string2 = "null";
        }
        String string3 = string2;
        if (throwable == null) {
            string2 = "Invoked with null Throwable";
            throwable = new NullPointerException(string2);
        }
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, throwable, false, false, true, false, 64, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void afErrorLogForExcManagerOnly(String string2, Throwable throwable, boolean bl2) {
        boolean bl3;
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        if (string2 == null || (bl3 = b.k(string2))) {
            string2 = "null";
        }
        String string3 = string2;
        if (throwable == null) {
            string2 = "Invoked with null Throwable";
            throwable = new NullPointerException(string2);
        }
        boolean bl4 = bl2 ^ true;
        AFh1uSDK.e$default(aFLogger, aFh1vSDK, string3, throwable, false, false, bl4, false, 64, null);
    }

    public static final void afInfoLog(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        aFLogger.i(aFh1vSDK, string2, true);
    }

    public static final void afInfoLog(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        aFLogger.i(aFh1vSDK, string2, bl2);
    }

    public static final void afLogForce(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        aFLogger.force(aFh1vSDK, string2);
    }

    public static final void afRDLog(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        aFLogger.v(aFh1vSDK, string2, true);
    }

    public static final void afVerboseLog(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        aFLogger.v(aFh1vSDK, string2, false);
    }

    public static final void afWarnLog(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        AFh1uSDK.w$default(aFLogger, aFh1vSDK, string2, false, 4, null);
    }

    public static final void afWarnLog(String string2, boolean bl2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFLogger aFLogger = INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.getMonetizationNetwork;
        aFLogger.w(aFh1vSDK, string2, bl2);
    }

    public static /* synthetic */ void b(AFh1uSDK[] aFh1uSDKArray) {
        AFLogger.getCurrencyIso4217Code(aFh1uSDKArray);
    }

    public static /* synthetic */ void c(AFh1uSDK[] aFh1uSDKArray) {
        AFLogger.getMonetizationNetwork(aFh1uSDKArray);
    }

    private static final void getCurrencyIso4217Code(AFh1uSDK[] object) {
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = getRevenue;
        Object object3 = object2.getValue();
        String string2 = "";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (Set)object3;
        synchronized (object3) {
            object2 = object2.getValue();
            string2 = "";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = (Set)object2;
            object = tp_2.O(object);
            object = (Collection)object;
            object2.removeAll((Collection<?>)object);
            object = Unit.a;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void getMonetizationNetwork(Function1 object) {
        Intrinsics.checkNotNullParameter(object, "");
        Iterator iterator = getRevenue;
        Object object2 = iterator.getValue();
        Object object3 = "";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (Set)object2;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2;
                    iterator = iterator.getValue();
                    object3 = "";
                    Intrinsics.checkNotNullExpressionValue(iterator, (String)object3);
                    iterator = (Set)((Object)iterator);
                    iterator = (Iterable)((Object)iterator);
                    iterator = iterator.iterator();
                    while (bl2 = iterator.hasNext()) {
                        object3 = iterator.next();
                        object3 = (AFh1uSDK)object3;
                        object.invoke(object3);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    private static final void getMonetizationNetwork(AFh1uSDK[] object) {
        Intrinsics.checkNotNullParameter(object, "");
        Object object2 = getRevenue;
        Object object3 = object2.getValue();
        String string2 = "";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = (Set)object3;
        synchronized (object3) {
            object2 = object2.getValue();
            string2 = "";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            object2 = (Set)object2;
            object2 = (Collection)object2;
            cx_2.t((Collection)object2, object);
            object = Unit.a;
            return;
        }
    }

    public final void d(AFh1vSDK object, String string2, boolean bl2) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object2 = new AFLogger$5((AFh1vSDK)((Object)object), string2, bl2);
        object = new gx1_1(object2, 2);
        ((ExecutorService)getCurrencyIso4217Code.getValue()).execute((Runnable)object);
    }

    public final void e(AFh1vSDK aFh1vSDK, String string2, Throwable throwable, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        Object object = "";
        Intrinsics.checkNotNullParameter((Object)aFh1vSDK, (String)object);
        Intrinsics.checkNotNullParameter(string2, (String)object);
        Intrinsics.checkNotNullParameter(throwable, (String)object);
        Object object2 = object;
        object = new AFLogger$3(aFh1vSDK, string2, throwable, bl2, bl3, bl4, bl5);
        object2 = new gx1_1(object, 2);
        ((ExecutorService)getCurrencyIso4217Code.getValue()).execute((Runnable)object2);
    }

    public final void force(AFh1vSDK object, String string2) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object2 = new AFLogger$1((AFh1vSDK)((Object)object), string2);
        object = new gx1_1(object2, 2);
        ((ExecutorService)getCurrencyIso4217Code.getValue()).execute((Runnable)object);
    }

    public final void i(AFh1vSDK object, String string2, boolean bl2) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object2 = new AFLogger$4((AFh1vSDK)((Object)object), string2, bl2);
        object = new gx1_1(object2, 2);
        ((ExecutorService)getCurrencyIso4217Code.getValue()).execute((Runnable)object);
    }

    public final void registerClient(AFh1uSDK ... aFh1uSDKArray) {
        Intrinsics.checkNotNullParameter(aFh1uSDKArray, "");
        ix1_1 ix1_12 = new ix1_1(aFh1uSDKArray, 1);
        ((ExecutorService)getCurrencyIso4217Code.getValue()).execute(ix1_12);
    }

    public final void unregisterClient(AFh1uSDK ... aFh1uSDKArray) {
        Intrinsics.checkNotNullParameter(aFh1uSDKArray, "");
        hx1_1 hx1_12 = new hx1_1(aFh1uSDKArray, 2);
        ((ExecutorService)getCurrencyIso4217Code.getValue()).execute(hx1_12);
    }

    public final void v(AFh1vSDK object, String string2, boolean bl2) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object2 = new AFLogger$6((AFh1vSDK)((Object)object), string2, bl2);
        object = new gx1_1(object2, 2);
        ((ExecutorService)getCurrencyIso4217Code.getValue()).execute((Runnable)object);
    }

    public final void w(AFh1vSDK object, String string2, boolean bl2) {
        Object object2 = "";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        object2 = new AFLogger$9((AFh1vSDK)((Object)object), string2, bl2);
        object = new gx1_1(object2, 2);
        ((ExecutorService)getCurrencyIso4217Code.getValue()).execute((Runnable)object);
    }
}

