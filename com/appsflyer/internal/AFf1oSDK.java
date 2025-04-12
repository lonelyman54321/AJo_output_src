/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFb1cSDK;
import com.appsflyer.internal.AFb1kSDK;
import com.appsflyer.internal.AFb1uSDK;
import com.appsflyer.internal.AFd1kSDK;
import com.appsflyer.internal.AFe1cSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFe1kSDK;
import com.appsflyer.internal.AFe1mSDK;
import com.appsflyer.internal.AFe1qSDK;
import com.appsflyer.internal.AFe1tSDK;
import com.appsflyer.internal.AFf1wSDK;
import com.appsflyer.internal.AFf1ySDK;
import com.appsflyer.internal.AFf1zSDK;
import com.appsflyer.internal.AFg1wSDK;
import com.appsflyer.internal.AFh1vSDK;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

public abstract class AFf1oSDK
extends AFe1eSDK {
    protected final AFb1cSDK areAllFieldsValid;
    public final AFg1wSDK component1;
    protected final AFe1qSDK component2;
    private AFb1uSDK component3;
    public AFe1kSDK component4;
    private String equals;

    public AFf1oSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArray, AFd1kSDK aFd1kSDK, String string2) {
        AFe1qSDK aFe1qSDK = aFd1kSDK.getCurrencyIso4217Code();
        AFg1wSDK aFg1wSDK = aFd1kSDK.AFKeystoreWrapper();
        AFb1cSDK aFb1cSDK = aFd1kSDK.copydefault();
        AFb1uSDK aFb1uSDK = aFd1kSDK.valueOf();
        this(aFf1zSDK, aFf1zSDKArray, aFe1qSDK, aFg1wSDK, aFb1cSDK, aFb1uSDK, string2);
    }

    public AFf1oSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArray, AFd1kSDK aFd1kSDK, String string2, String string3) {
        AFe1qSDK aFe1qSDK = aFd1kSDK.getCurrencyIso4217Code();
        AFg1wSDK aFg1wSDK = aFd1kSDK.AFKeystoreWrapper();
        AFb1cSDK aFb1cSDK = aFd1kSDK.copydefault();
        AFb1uSDK aFb1uSDK = aFd1kSDK.valueOf();
        this(aFf1zSDK, aFf1zSDKArray, aFe1qSDK, aFg1wSDK, aFb1cSDK, aFb1uSDK, string2);
        this.equals = string3;
    }

    private AFf1oSDK(AFf1zSDK aFf1zSDK, AFf1zSDK[] aFf1zSDKArray, AFe1qSDK aFe1qSDK, AFg1wSDK aFg1wSDK, AFb1cSDK aFb1cSDK, AFb1uSDK aFb1uSDK, String string2) {
        super(aFf1zSDK, aFf1zSDKArray, string2);
        this.component2 = aFe1qSDK;
        this.component1 = aFg1wSDK;
        this.areAllFieldsValid = aFb1cSDK;
        this.component3 = aFb1uSDK;
    }

    private void AFAdRevenueData(AFe1mSDK object) {
        String string2 = this.equals;
        String string3 = ((AFe1mSDK)object).getMediationNetwork;
        object = ((AFe1mSDK)object).getCurrencyIso4217Code();
        String string4 = "6.15.2";
        AFf1zSDK aFf1zSDK = this.getMonetizationNetwork;
        AFb1kSDK aFb1kSDK = new AFb1kSDK(string3, (byte[])object, string4, aFf1zSDK);
        this.equals = object = this.component3.AFAdRevenueData(aFb1kSDK);
        if (string2 != null) {
            object = this.component3;
            object.AFAdRevenueData(string2);
        }
    }

    public AFe1cSDK AFAdRevenueData() {
        Object object;
        int n3 = this.a_();
        if (n3 != 0 && (n3 = ((AFg1wSDK)(object = this.component1)).getCurrencyIso4217Code()) != 0) {
            object = this.areAllFieldsValid();
            if (object != null) {
                int n4 = 11;
                String string2 = "Skipping event because 'isStopped' is true";
                object.onError(n4, string2);
            }
            object = new AFf1ySDK();
            throw object;
        }
        object = this.component1;
        int n7 = 1;
        Object object2 = new Object[n7];
        CharSequence charSequence = null;
        object2[0] = object;
        int n8 = -1684451992;
        int n10 = 1684451992;
        n3 = System.identityHashCode(object);
        if ((object = (String)AFg1wSDK.getCurrencyIso4217Code((Object[])object2, n8, n10, n3)) != null && (n7 = (int)(((String)(object2 = ((String)object).trim())).isEmpty() ? 1 : 0)) == 0) {
            if ((object = this.getMediationNetwork((String)object)) == null) {
                object = new CreateHttpCallException("createHttpCall returned null");
                AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", (Throwable)object);
                return AFe1cSDK.getMonetizationNetwork;
            }
            n7 = (int)(this.copydefault() ? 1 : 0);
            if (n7 != 0) {
                object2 = ((AFe1tSDK)object).getRevenue;
                this.AFAdRevenueData((AFe1mSDK)object2);
            }
            this.component4 = object2 = ((AFe1tSDK)object).getMonetizationNetwork();
            charSequence = ((AFe1kSDK)object2).getBody().toString();
            Object object3 = this.areAllFieldsValid;
            object = ((AFe1tSDK)object).getRevenue.getMediationNetwork;
            int n14 = ((AFe1kSDK)object2).getStatusCode();
            object3.getMediationNetwork((String)object, n14, (String)charSequence);
            object = this.areAllFieldsValid();
            if (object != null) {
                n8 = (int)(((AFe1kSDK)object2).isSuccessful() ? 1 : 0);
                if (n8 != 0) {
                    object.onSuccess();
                } else {
                    object3 = "Status code failure ";
                    charSequence = new StringBuilder((String)object3);
                    n10 = ((AFe1kSDK)object2).getStatusCode();
                    ((StringBuilder)charSequence).append(n10);
                    charSequence = charSequence.toString();
                    n10 = 50;
                    object.onError(n10, (String)charSequence);
                }
            }
            if ((n3 = (int)(((AFe1kSDK)object2).isSuccessful() ? 1 : 0)) != 0) {
                return AFe1cSDK.getRevenue;
            }
            return AFe1cSDK.getMonetizationNetwork;
        }
        object = this.areAllFieldsValid();
        if (object != null) {
            n7 = 41;
            charSequence = "No dev key";
            object.onError(n7, (String)charSequence);
        }
        object = new AFf1wSDK();
        throw object;
    }

    public boolean a_() {
        return true;
    }

    public abstract AppsFlyerRequestListener areAllFieldsValid();

    public abstract boolean copydefault();

    public final void getCurrencyIso4217Code() {
        super.getCurrencyIso4217Code();
        int n3 = this.copydefault();
        if (n3 != 0) {
            Object object = this.component1;
            int n4 = 1;
            Object object2 = new Object[n4];
            object2[0] = object;
            int n7 = -1684451992;
            int n8 = 1684451992;
            n3 = System.identityHashCode(object);
            if ((object = (String)AFg1wSDK.getCurrencyIso4217Code((Object[])object2, n7, n8, n3)) != null && (n4 = (int)(((String)(object2 = ((String)object).trim())).isEmpty() ? 1 : 0)) == 0) {
                if ((object = this.getMediationNetwork((String)object)) != null) {
                    object = ((AFe1tSDK)object).getRevenue;
                    this.AFAdRevenueData((AFe1mSDK)object);
                    return;
                }
                object = new CreateHttpCallException("createHttpCall returned null");
                object2 = "Failed to create a cached HTTP call";
                AFLogger.afErrorLogForExcManagerOnly((String)object2, (Throwable)object);
            }
        }
    }

    public final void getCurrencyIso4217Code(Throwable object) {
        Object object2;
        boolean bl2 = object instanceof HttpException ^ true;
        boolean bl3 = object instanceof AFf1ySDK;
        if (bl3) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.component2;
            boolean bl4 = true;
            boolean bl5 = false;
            String string2 = "AppsFlyer SDK is stopped: the request was not sent to the server";
            aFLogger.e(aFh1vSDK, string2, (Throwable)object, bl4, false);
        } else {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.component2;
            object2 = String.valueOf(object);
            String string3 = "Error while sending request to server: ".concat((String)object2);
            boolean bl6 = true;
            boolean bl7 = true;
            aFLogger.e(aFh1vSDK, string3, (Throwable)object, bl6, bl7, bl2);
        }
        object2 = this.areAllFieldsValid();
        if (object2 != null) {
            if ((object = ((Throwable)object).getMessage()) == null) {
                object = "";
            }
            int n3 = 40;
            object2.onError(n3, (String)object);
        }
    }

    public abstract AFe1tSDK getMediationNetwork(String var1);

    public boolean getMediationNetwork() {
        Object object = this.component1();
        boolean bl2 = object instanceof AFf1ySDK;
        if (bl2) {
            return false;
        }
        object = this.getMediationNetwork;
        AFe1cSDK aFe1cSDK = AFe1cSDK.getMediationNetwork;
        boolean bl3 = true;
        if (object == aFe1cSDK) {
            return bl3;
        }
        object = this.component1();
        boolean bl4 = object instanceof IOException;
        if (bl4 && !(bl2 = object instanceof ParsingException)) {
            return bl3;
        }
        return false;
    }

    public long getMonetizationNetwork() {
        return 60000L;
    }

    public void getRevenue() {
        Object object = this.getMediationNetwork;
        Object object2 = AFe1cSDK.getRevenue;
        if (object == object2) {
            object = this.equals;
            if (object != null) {
                object2 = this.component3;
                object2.AFAdRevenueData((String)object);
            }
            return;
        }
        boolean bl2 = this.getMediationNetwork();
        if (!bl2 && (object = this.equals) != null) {
            object2 = this.component3;
            object2.AFAdRevenueData((String)object);
        }
    }
}

