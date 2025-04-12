/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.internal.AFd1fSDK$AFa1zSDK;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

public final class AFd1fSDK {
    public static final AFd1fSDK$AFa1zSDK AFa1zSDK;
    public String AFAdRevenueData;
    int getCurrencyIso4217Code;
    final String getMediationNetwork;
    public String getRevenue;

    static {
        AFd1fSDK$AFa1zSDK aFd1fSDK$AFa1zSDK;
        AFa1zSDK = aFd1fSDK$AFa1zSDK = new AFd1fSDK$AFa1zSDK(null);
    }

    public AFd1fSDK(String string2, String string3, String string4, int n3) {
        String string5 = "";
        Intrinsics.checkNotNullParameter(string2, string5);
        Intrinsics.checkNotNullParameter(string3, string5);
        Intrinsics.checkNotNullParameter(string4, string5);
        this.AFAdRevenueData = string2;
        this.getMediationNetwork = string3;
        this.getRevenue = string4;
        this.getCurrencyIso4217Code = n3;
    }

    public /* synthetic */ AFd1fSDK(String string2, String string3, String string4, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 &= 8) != 0) {
            n3 = 1;
        }
        this(string2, string3, string4, n3);
    }

    public final JSONObject AFAdRevenueData() {
        JSONObject jSONObject = new JSONObject();
        String string2 = this.AFAdRevenueData;
        jSONObject.put("label", (Object)string2);
        string2 = this.getMediationNetwork;
        jSONObject.put("hash_name", (Object)string2);
        string2 = this.getRevenue;
        jSONObject.put("st", (Object)string2);
        String string3 = String.valueOf(this.getCurrencyIso4217Code);
        jSONObject.put("c", (Object)string3);
        return jSONObject;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof AFd1fSDK;
        if (n3 == 0) {
            return false;
        }
        object = (AFd1fSDK)object;
        String string2 = this.AFAdRevenueData;
        String string3 = ((AFd1fSDK)object).AFAdRevenueData;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.getMediationNetwork;
        string3 = ((AFd1fSDK)object).getMediationNetwork;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        string2 = this.getRevenue;
        string3 = ((AFd1fSDK)object).getRevenue;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.getCurrencyIso4217Code;
        int n4 = ((AFd1fSDK)object).getCurrencyIso4217Code;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final String getMonetizationNetwork() {
        Object object = this.AFAdRevenueData;
        String string2 = "";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = Charsets.UTF_8;
        object = ((String)object).getBytes((Charset)object2);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        int n3 = 2;
        object = Base64.encodeToString((byte[])object, (int)n3);
        Object object3 = this.getMediationNetwork;
        Intrinsics.checkNotNullParameter(object3, string2);
        object3 = ((String)object3).getBytes((Charset)object2);
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        object3 = Base64.encodeToString((byte[])object3, (int)n3);
        String string3 = this.getRevenue;
        Intrinsics.checkNotNullParameter(string3, string2);
        object2 = string3.getBytes((Charset)object2);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        string2 = Base64.encodeToString((byte[])object2, (int)n3);
        int n4 = this.getCurrencyIso4217Code;
        object = og_1.a("label=", (String)object, "\nhashName=", (String)object3, "\nstackTrace=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("\nc=");
        ((StringBuilder)object).append(n4);
        return ((StringBuilder)object).toString();
    }

    public final int hashCode() {
        int n3 = this.AFAdRevenueData.hashCode() * 31;
        int n4 = (this.getMediationNetwork.hashCode() + n3) * 31;
        n3 = (this.getRevenue.hashCode() + n4) * 31;
        n4 = this.getCurrencyIso4217Code;
        return n3 + n4;
    }

    public final String toString() {
        CharSequence charSequence = this.AFAdRevenueData;
        String string2 = this.getMediationNetwork;
        String string3 = this.getRevenue;
        int n3 = this.getCurrencyIso4217Code;
        charSequence = og_1.a("ExceptionInfo(label=", (String)charSequence, ", hashName=", string2, ", stackTrace=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", counter=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

