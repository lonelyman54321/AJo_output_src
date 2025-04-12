/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1sSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1oSDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFk1wSDK;

public final class AFf1uSDK
extends AFf1oSDK {
    private final String component3;
    private final AFd1qSDK copy;
    private final AFk1wSDK copydefault;

    public AFf1uSDK(AFd1kSDK object, String string2, AFk1wSDK aFk1wSDK) {
        AFf1zSDK aFf1zSDK = AFf1zSDK.AFKeystoreWrapper;
        AFf1zSDK aFf1zSDK2 = AFf1zSDK.getRevenue;
        aFf1zSDK2 = AFf1zSDK.AFAdRevenueData;
        AFf1zSDK[] aFf1zSDKArray = new AFf1zSDK[]{aFf1zSDK2, aFf1zSDK2};
        super(aFf1zSDK, aFf1zSDKArray, (AFd1kSDK)object, string2);
        this.component3 = string2;
        this.copydefault = aFk1wSDK;
        this.copy = object = object.getMediationNetwork();
    }

    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public final boolean copydefault() {
        return false;
    }

    public final AFe1tSDK getMediationNetwork(String object) {
        object = this.component2;
        String string2 = this.copy.getMonetizationNetwork();
        boolean bl2 = AFc1sSDK.getRevenue(string2);
        if (bl2) {
            string2 = this.component3;
        } else {
            Uri.Builder builder = Uri.parse((String)this.component3).buildUpon();
            String string3 = "advertising_id";
            string2 = builder.appendQueryParameter(string3, string2).build().toString();
        }
        return ((AFe1qSDK)object).getMonetizationNetwork(string2);
    }

    public final boolean getMediationNetwork() {
        return false;
    }

    public final void getRevenue() {
        super.getRevenue();
        Object object = this.component4;
        if (object != null) {
            int n3 = ((AFe1kSDK)object).getStatusCode();
            int n4 = 200;
            String string2 = null;
            if (n3 != n4) {
                n4 = 301;
                if (n3 != n4 && n3 != (n4 = 302)) {
                    object = new StringBuilder("call to ");
                    String string3 = this.component3;
                    ((StringBuilder)object).append(string3);
                    string3 = " failed: ";
                    ((StringBuilder)object).append(string3);
                    ((StringBuilder)object).append(n3);
                    object = object.toString();
                    AFLogger.afInfoLog((String)object);
                } else {
                    Object object2 = new StringBuilder("Cross promotion redirection success: ");
                    String string4 = this.component3;
                    ((StringBuilder)object2).append(string4);
                    AFLogger.afInfoLog(object2.toString(), false);
                    object = ((AFe1kSDK)object).getRevenue("Location");
                    object2 = this.copydefault;
                    if (object2 != null && object != null) {
                        block15: {
                            ((AFk1wSDK)object2).getMediationNetwork = object;
                            object = (Context)((AFk1wSDK)object2).getRevenue.get();
                            if (object != null) {
                                string4 = ((AFk1wSDK)object2).getMediationNetwork;
                                if (string4 == null) break block15;
                                string2 = "android.intent.action.VIEW";
                                object2 = ((AFk1wSDK)object2).getMediationNetwork;
                                object2 = Uri.parse((String)object2);
                                string4 = new Intent(string2, (Uri)object2);
                                n3 = 0x10000000;
                                object2 = string4.setFlags(n3);
                                try {
                                    object.startActivity((Intent)object2);
                                }
                                catch (Exception exception) {
                                    object2 = String.valueOf(exception);
                                    string4 = "Failed to open cross promotion url, does OS have browser installed?";
                                    object2 = string4.concat((String)object2);
                                    AFLogger.afErrorLog((String)object2, exception);
                                }
                            }
                        }
                        return;
                    }
                }
            } else {
                object = new StringBuilder("Cross promotion impressions success: ");
                String string5 = this.component3;
                ((StringBuilder)object).append(string5);
                object = object.toString();
                AFLogger.afInfoLog((String)object, false);
            }
        }
    }
}

