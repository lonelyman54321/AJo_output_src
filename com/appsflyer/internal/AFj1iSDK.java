/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcelable
 */
package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1iSDK$1;
import com.appsflyer.internal.AFj1iSDK$2;
import com.appsflyer.internal.AFj1iSDK$4;
import com.appsflyer.internal.AFj1iSDK$5;
import java.util.ConcurrentModificationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class AFj1iSDK {
    final Intent getMediationNetwork;

    public AFj1iSDK(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getMediationNetwork = intent;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Object getCurrencyIso4217Code(Function0 object, String object2, Object object3, boolean bl2) {
        int n3 = 1;
        Intent intent = this.getMediationNetwork;
        synchronized (intent) {
            Object[] objectArray;
            Object object4;
            block17: {
                block14: {
                    Throwable throwable3;
                    block15: {
                        Object object5;
                        block13: {
                            try {
                                object4 = tl2_2.b;
                                object4 = object.invoke();
                            }
                            catch (Throwable throwable2) {
                                object5 = tl2_2.b;
                                object4 = vl2_2.a(throwable2);
                            }
                            object5 = ConcurrentModificationException.class;
                            object5 = Reflection.getOrCreateKotlinClass((Class)object5);
                            Object object6 = ArrayIndexOutOfBoundsException.class;
                            object6 = Reflection.getOrCreateKotlinClass(object6);
                            int n4 = 2;
                            Object[] objectArray2 = new yn1_2[n4];
                            objectArray2[0] = object5;
                            objectArray2[n3] = object6;
                            object5 = tl2_2.a(object4);
                            if (object5 == null) break block17;
                            try {
                                object4 = object5.getClass();
                                object4 = Reflection.getOrCreateKotlinClass(object4);
                                boolean bl3 = tp_2.w(objectArray2, object4);
                                if (!bl3) {
                                    throw object5;
                                }
                                if (!bl2) break block13;
                                object = this.getCurrencyIso4217Code((Function0)object, (String)object2, object3, false);
                                break block14;
                            }
                            catch (Throwable throwable3) {
                                break block15;
                            }
                        }
                        AFLogger.afErrorLog((String)object2, (Throwable)object5, false, false);
                        object = object3;
                        break block14;
                    }
                    objectArray = tl2_2.b;
                    object = vl2_2.a(throwable3);
                }
                object4 = object;
            }
            object = RuntimeException.class;
            object = Reflection.getOrCreateKotlinClass((Class)object);
            objectArray = new yn1_2[n3];
            objectArray[0] = object;
            object = tl2_2.a(object4);
            if (object != null) {
                block16: {
                    try {
                        Object object7 = object.getClass();
                        object7 = Reflection.getOrCreateKotlinClass(object7);
                        bl2 = tp_2.w(objectArray, object7);
                        if (!bl2) {
                            throw object;
                        }
                        AFLogger.afErrorLog((String)object2, (Throwable)object, false, false);
                        break block16;
                    }
                    catch (Throwable throwable) {}
                    object2 = tl2_2.b;
                    object3 = vl2_2.a(throwable);
                }
                object4 = object3;
            }
            vl2_2.b(object4);
            return object4;
        }
    }

    public final String AFAdRevenueData(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFj1iSDK$1 aFj1iSDK$1 = new AFj1iSDK$1(this, string2);
        string2 = cP.a("Error while trying to read ", string2, " extra from intent");
        return (String)this.getCurrencyIso4217Code(aFj1iSDK$1, string2, null, true);
    }

    public final Parcelable J_(String string2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFj1iSDK$4 aFj1iSDK$4 = new AFj1iSDK$4(this, string2);
        string2 = cP.a("Error while trying to read ", string2, " extra from intent");
        return (Parcelable)this.getCurrencyIso4217Code(aFj1iSDK$4, string2, null, true);
    }

    public final Intent K_(String string2, long l2) {
        Intrinsics.checkNotNullParameter(string2, "");
        AFj1iSDK$2 aFj1iSDK$2 = new AFj1iSDK$2(this, string2, l2);
        string2 = cP.a("Error while trying to write ", string2, " extra to intent");
        return (Intent)this.getCurrencyIso4217Code(aFj1iSDK$2, string2, null, true);
    }

    public final boolean getMediationNetwork(String object) {
        Intrinsics.checkNotNullParameter(object, "");
        AFj1iSDK$5 aFj1iSDK$5 = new AFj1iSDK$5(this, (String)object);
        String string2 = " extra from intent";
        object = cP.a("Error while trying to check presence of ", (String)object, string2);
        Boolean bl2 = Boolean.TRUE;
        boolean bl3 = true;
        object = (Boolean)this.getCurrencyIso4217Code(aFj1iSDK$5, (String)object, bl2, bl3);
        if (object != null) {
            return (Boolean)object;
        }
        return bl3;
    }
}

