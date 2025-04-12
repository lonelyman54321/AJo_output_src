/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.internal.AFd1qSDK;
import com.appsflyer.internal.AFd1rSDK;
import com.appsflyer.internal.AFe1fSDK;
import com.appsflyer.internal.AFe1hSDK;
import com.appsflyer.internal.AFe1iSDK$4;
import com.appsflyer.internal.AFe1iSDK$5;
import com.appsflyer.internal.AFe1iSDK$AFa1uSDK;
import com.appsflyer.internal.AFe1iSDK$AFa1zSDK;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

public final class AFe1iSDK {
    public static String AFAdRevenueData;
    public static final AFe1iSDK$AFa1zSDK AFa1zSDK;
    private static AFe1hSDK areAllFieldsValid;
    private static final List component1;
    public static String getMediationNetwork;
    private final rq1_2 component3;
    private final AFd1rSDK getCurrencyIso4217Code;
    public final rq1_2 getMonetizationNetwork;
    private final AFd1qSDK getRevenue;

    static {
        AFe1iSDK$AFa1zSDK aFe1iSDK$AFa1zSDK;
        AFa1zSDK = aFe1iSDK$AFa1zSDK = new AFe1iSDK$AFa1zSDK(null);
        getMediationNetwork = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
        AFAdRevenueData = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
        component1 = xx_2.i("googleplay", "playstore", "googleplaystore");
    }

    public AFe1iSDK(AFd1qSDK object, AFd1rSDK aFd1rSDK) {
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(aFd1rSDK, string2);
        this.getRevenue = object;
        this.getCurrencyIso4217Code = aFd1rSDK;
        object = new AFe1iSDK$4(this);
        this.component3 = object = yr1_2.b((Function0)object);
        object = new AFe1iSDK$5(this);
        this.getMonetizationNetwork = object = yr1_2.b((Function0)object);
    }

    public static final /* synthetic */ void getCurrencyIso4217Code(AFe1hSDK aFe1hSDK) {
        areAllFieldsValid = aFe1hSDK;
    }

    public static boolean getCurrencyIso4217Code() {
        AFe1hSDK aFe1hSDK = areAllFieldsValid;
        return aFe1hSDK == null;
    }

    public static final /* synthetic */ AFd1rSDK getMediationNetwork(AFe1iSDK aFe1iSDK) {
        return aFe1iSDK.getCurrencyIso4217Code;
    }

    public static final /* synthetic */ String getMediationNetwork(String object, String charSequence) {
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append((String)charSequence);
        object = ((StringBuilder)object2).toString();
        charSequence = "";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        object2 = MessageDigest.getInstance("SHA-256");
        Charset charset = Charsets.UTF_8;
        object = ((String)object).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
        object = ((MessageDigest)object2).digest((byte[])object);
        Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
        object = Base64.encodeToString((byte[])object, (int)2);
        Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
        object2 = Locale.ROOT;
        object = ((String)object).toLowerCase((Locale)object2);
        Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
        object2 = new Regex("[^\\w]+");
        object = ((Regex)object2).replace((CharSequence)object, (String)charSequence).substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(object, (String)charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("-");
        return ((StringBuilder)charSequence).toString();
    }

    public static final /* synthetic */ String getMonetizationNetwork(AFe1iSDK aFe1iSDK) {
        return (String)aFe1iSDK.component3.getValue();
    }

    public static final /* synthetic */ List getMonetizationNetwork() {
        return component1;
    }

    public static final void getMonetizationNetwork(AFe1hSDK aFe1hSDK) {
        AFe1iSDK$AFa1zSDK.getMonetizationNetwork(aFe1hSDK);
    }

    public static final /* synthetic */ AFd1qSDK getRevenue(AFe1iSDK aFe1iSDK) {
        return aFe1iSDK.getRevenue;
    }

    public final String AFAdRevenueData() {
        int n3 = AFe1iSDK.getCurrencyIso4217Code();
        Object object = n3 != 0 ? AFe1fSDK.getCurrencyIso4217Code : AFe1fSDK.getRevenue;
        int[] nArray = AFe1iSDK$AFa1uSDK.getRevenue;
        n3 = object.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            String string2 = "";
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    return string2;
                }
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            object = areAllFieldsValid;
            if (object != null) {
                object = ((AFe1hSDK)object).getMediationNetwork;
            } else {
                n3 = 0;
                object = null;
            }
            if (object == null) {
                return string2;
            }
            return object;
        }
        return "appsflyersdk.com";
    }

    public final String getMediationNetwork() {
        int n3 = AFe1iSDK.getCurrencyIso4217Code();
        Object object = n3 != 0 ? AFe1fSDK.getCurrencyIso4217Code : AFe1fSDK.getRevenue;
        int[] nArray = AFe1iSDK$AFa1uSDK.getRevenue;
        n3 = object.ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            String string2 = "";
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    return string2;
                }
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            object = areAllFieldsValid;
            if (object != null) {
                object = ((AFe1hSDK)object).AFAdRevenueData;
            } else {
                n3 = 0;
                object = null;
            }
            if (object == null) {
                return string2;
            }
            return object;
        }
        return (String)this.getMonetizationNetwork.getValue();
    }
}

