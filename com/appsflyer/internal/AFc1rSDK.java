/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFb1iSDK;
import com.appsflyer.internal.AFb1qSDK;
import com.appsflyer.internal.AFd1nSDK;
import com.appsflyer.internal.AFd1rSDK;
import java.security.KeyStore;
import java.security.KeyStoreException;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1rSDK {
    public static final AFc1rSDK INSTANCE;

    static {
        AFc1rSDK aFc1rSDK;
        INSTANCE = aFc1rSDK = new AFc1rSDK();
    }

    private AFc1rSDK() {
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String getMonetizationNetwork() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final void getMonetizationNetwork(AFd1nSDK object, AFd1rSDK object2) {
        int n3;
        block11: {
            Object object3;
            AppsFlyerProperties appsFlyerProperties;
            block13: {
                block14: {
                    Object object4;
                    int n4;
                    block12: {
                        Intrinsics.checkNotNullParameter(object, "");
                        Intrinsics.checkNotNullParameter(object2, "");
                        appsFlyerProperties = AppsFlyerProperties.getInstance();
                        int n7 = AFb1qSDK.getMediationNetwork();
                        if (n7 != 0) {
                            object3 = "OPPO device found";
                            AFLogger.afRDLog((String)object3);
                            n7 = 23;
                        } else {
                            n7 = 18;
                        }
                        n3 = Build.VERSION.SDK_INT;
                        if (n3 < n7 || (n7 = (int)(appsFlyerProperties.getBoolean((String)(object3 = "keyPropDisableAFKeystore"), (n4 = 1) != 0) ? 1 : 0)) != 0) break block11;
                        String string2 = "OS SDK is=";
                        object3 = new StringBuilder(string2);
                        ((StringBuilder)object3).append(n3);
                        ((StringBuilder)object3).append("; use KeyStore");
                        AFLogger.afRDLog(((StringBuilder)object3).toString());
                        object4 = ((AFd1nSDK)object).AFAdRevenueData;
                        object3 = new AFKeystoreWrapper((Context)object4);
                        n3 = (int)(((AFKeystoreWrapper)object3).getRevenue() ? 1 : 0);
                        if (n3 != 0) break block12;
                        ((AFKeystoreWrapper)object3).getRevenue = object = AFb1iSDK.getCurrencyIso4217Code((AFd1nSDK)object, (AFd1rSDK)object2);
                        ((AFKeystoreWrapper)object3).getCurrencyIso4217Code = 0;
                        object = ((AFKeystoreWrapper)object3).AFAdRevenueData();
                        ((AFKeystoreWrapper)object3).getCurrencyIso4217Code((String)object);
                        break block13;
                    }
                    object = ((AFKeystoreWrapper)object3).AFAdRevenueData();
                    object2 = ((AFKeystoreWrapper)object3).AFAdRevenueData;
                    // MONITORENTER : object2
                    ((AFKeystoreWrapper)object3).getCurrencyIso4217Code = n3 = ((AFKeystoreWrapper)object3).getCurrencyIso4217Code + n4;
                    object4 = "Deleting key with alias: ";
                    Object object5 = String.valueOf(object);
                    object4 = ((String)object4).concat((String)object5);
                    AFLogger.afInfoLog((String)object4);
                    object4 = ((AFKeystoreWrapper)object3).AFAdRevenueData;
                    // MONITORENTER : object4
                    object5 = ((AFKeystoreWrapper)object3).getMonetizationNetwork;
                    ((KeyStore)object5).deleteEntry((String)object);
                    // MONITOREXIT : object4
                    break block14;
                    catch (KeyStoreException keyStoreException) {
                        object5 = "Exception ";
                        object4 = new StringBuilder((String)object5);
                        object5 = keyStoreException.getMessage();
                        ((StringBuilder)object4).append((String)object5);
                        object5 = " occurred";
                        ((StringBuilder)object4).append((String)object5);
                        object4 = object4.toString();
                        AFLogger.afErrorLog((String)object4, keyStoreException);
                    }
                    // MONITOREXIT : object2
                }
                object = ((AFKeystoreWrapper)object3).AFAdRevenueData();
                ((AFKeystoreWrapper)object3).getCurrencyIso4217Code((String)object);
            }
            object2 = ((AFKeystoreWrapper)object3).getMonetizationNetwork();
            appsFlyerProperties.set("KSAppsFlyerId", (String)object2);
            object2 = String.valueOf(((AFKeystoreWrapper)object3).getMediationNetwork());
            appsFlyerProperties.set("KSAppsFlyerRICounter", (String)object2);
            return;
        }
        object = new StringBuilder("OS SDK is=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("; no KeyStore usage");
        AFLogger.afRDLog(((StringBuilder)object).toString());
    }
}

