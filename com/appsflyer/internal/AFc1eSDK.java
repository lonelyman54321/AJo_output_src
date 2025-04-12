/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 */
package com.appsflyer.internal;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1rSDK$5;
import com.appsflyer.internal.AFc1eSDK$AFa1tSDK;
import com.appsflyer.internal.AFc1fSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.facebook.FacebookSdk;
import com.facebook.applinks.a;
import com.facebook.applinks.a$a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1eSDK
implements AFc1fSDK {
    Map AFAdRevenueData;
    private boolean getCurrencyIso4217Code;
    private final AFd1nSDK getMediationNetwork;

    public AFc1eSDK(AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.getMediationNetwork = aFd1nSDK;
    }

    private boolean getRevenue() {
        return this.getCurrencyIso4217Code;
    }

    public final void AFAdRevenueData(boolean bl2) {
        this.getCurrencyIso4217Code = bl2;
    }

    public final Map getCurrencyIso4217Code() {
        return this.AFAdRevenueData;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getMediationNetwork() {
        NoSuchMethodException noSuchMethodException2;
        AFc1eSDK$AFa1tSDK aFc1eSDK$AFa1tSDK;
        block11: {
            InvocationTargetException invocationTargetException2;
            block10: {
                ClassNotFoundException classNotFoundException2;
                block9: {
                    IllegalAccessException illegalAccessException2;
                    block8: {
                        Object object;
                        int n3 = 2;
                        int n4 = 3;
                        int n7 = 1;
                        Object object2 = Context.class;
                        boolean bl2 = this.getRevenue();
                        if (!bl2) {
                            return;
                        }
                        Context context = this.getMediationNetwork.AFAdRevenueData;
                        if (context == null) {
                            return;
                        }
                        Object object3 = new LinkedHashMap();
                        this.AFAdRevenueData = object3;
                        long l2 = System.currentTimeMillis();
                        aFc1eSDK$AFa1tSDK = new AFc1eSDK$AFa1tSDK(this, l2);
                        object3 = FacebookSdk.class;
                        try {
                            object = FacebookSdk.a;
                            object = "sdkInitialize";
                            Class[] classArray = new Class[n7];
                            classArray[0] = object2;
                            object3 = ((Class)object3).getMethod((String)object, classArray);
                            object = new Object[n7];
                            object[0] = context;
                            classArray = null;
                            ((Method)object3).invoke(null, (Object[])object);
                            object3 = a.class;
                            object = a.a.class;
                            Object object4 = "fetchDeferredAppLinkData";
                            Object object5 = new Class[n4];
                            object5[0] = object2;
                            object2 = String.class;
                            object5[n7] = object2;
                            object5[n3] = object;
                            object2 = ((Class)object3).getMethod((String)object4, (Class<?>)object5);
                            object4 = new AFa1rSDK$5((Class)object3, aFc1eSDK$AFa1tSDK);
                            object3 = ((Class)object).getClassLoader();
                            object5 = new Class[n7];
                            object5[0] = object;
                            object3 = Proxy.newProxyInstance((ClassLoader)object3, object5, (InvocationHandler)object4);
                            object = context.getResources();
                            object4 = "facebook_app_id";
                            object5 = "string";
                            String string2 = context.getPackageName();
                            int n8 = object.getIdentifier((String)object4, (String)object5, string2);
                            object = context.getString(n8);
                            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
                            if (bl3) {
                                String string3 = "Facebook app id not defined in resources";
                                aFc1eSDK$AFa1tSDK.getRevenue(string3);
                                return;
                            }
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block8;
                        }
                        catch (ClassNotFoundException classNotFoundException2) {
                            break block9;
                        }
                        catch (InvocationTargetException invocationTargetException2) {
                            break block10;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block11;
                        }
                        Object[] objectArray = new Object[n4];
                        objectArray[0] = context;
                        objectArray[n7] = object;
                        objectArray[n3] = object3;
                        ((Method)object2).invoke(null, objectArray);
                        return;
                    }
                    AFLogger.afErrorLogForExcManagerOnly("FB illegal access", illegalAccessException2);
                    String string4 = ((Object)illegalAccessException2).toString();
                    aFc1eSDK$AFa1tSDK.getRevenue(string4);
                    return;
                }
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", classNotFoundException2);
                String string5 = ((Object)classNotFoundException2).toString();
                aFc1eSDK$AFa1tSDK.getRevenue(string5);
                return;
            }
            AFLogger.afErrorLogForExcManagerOnly("FB invocation error", invocationTargetException2);
            String string6 = ((Object)invocationTargetException2).toString();
            aFc1eSDK$AFa1tSDK.getRevenue(string6);
            return;
        }
        AFLogger.afErrorLogForExcManagerOnly("FB method missing error", noSuchMethodException2);
        String string7 = ((Object)noSuchMethodException2).toString();
        aFc1eSDK$AFa1tSDK.getRevenue(string7);
    }

    public final boolean getMonetizationNetwork() {
        Map map2;
        boolean bl2 = this.getRevenue();
        return bl2 && ((map2 = this.AFAdRevenueData) == null || (bl2 = map2.isEmpty()));
    }
}

