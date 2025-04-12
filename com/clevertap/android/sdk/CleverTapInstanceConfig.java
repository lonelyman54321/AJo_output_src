/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig$a;
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CleverTapInstanceConfig
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public ArrayList g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public String o;
    public boolean p;
    public b q;
    public String r;
    public boolean s;
    public String[] t;
    public boolean u;
    public boolean v;
    public int w;

    static {
        CleverTapInstanceConfig$a cleverTapInstanceConfig$a = new Object();
        CREATOR = cleverTapInstanceConfig$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CleverTapInstanceConfig(String string2) {
        int n3;
        int n4;
        JSONObject jSONObject;
        Object object;
        String string3;
        block26: {
            int n7;
            int n8;
            Object object2;
            Object[] objectArray;
            block27: {
                CleverTapInstanceConfig cleverTapInstanceConfig = this;
                String string4 = "createdPostAppLaunch";
                String string5 = "packageName";
                String string6 = "debugLevel";
                String string7 = "personalization";
                String string8 = "disableAppLaunchedEvent";
                String string9 = "useGoogleAdId";
                String string10 = "isDefaultInstance";
                String string11 = "analyticsOnly";
                string3 = "encryptionLevel";
                object = "accountRegion";
                String string12 = "identityTypes";
                objectArray = "customHandshakeDomain";
                String string13 = "beta";
                String string14 = "spikyProxyDomain";
                String string15 = "fcmSenderId";
                object2 = "proxyDomain";
                String string16 = "getEnableCustomCleverTapId";
                String string17 = "accountToken";
                String string18 = "backgroundSync";
                String string19 = "accountId";
                String string20 = "sslPinning";
                jSONObject = zb2_0.b();
                this.g = jSONObject;
                jSONObject = q50_0.g;
                this.t = jSONObject;
                try {
                    boolean bl2;
                    boolean bl3;
                    String string21 = string4;
                    string4 = string2;
                    jSONObject = new JSONObject(string2);
                    boolean bl4 = jSONObject.has(string19);
                    if (bl4) {
                        this.a = string19 = jSONObject.getString(string19);
                    }
                    if (bl3 = jSONObject.has(string17)) {
                        cleverTapInstanceConfig.c = string17 = jSONObject.getString(string17);
                    }
                    if (bl2 = jSONObject.has((String)object2)) {
                        object2 = jSONObject.getString((String)object2);
                        cleverTapInstanceConfig.d = object2;
                    }
                    if ((n8 = jSONObject.has(string14)) != 0) {
                        cleverTapInstanceConfig.e = string14 = jSONObject.getString(string14);
                    }
                    if ((n7 = jSONObject.has((String)objectArray)) != 0) {
                        n7 = 0;
                        string14 = null;
                        objectArray = jSONObject.optString((String)objectArray, null);
                        cleverTapInstanceConfig.f = objectArray;
                    }
                    if ((n4 = jSONObject.has((String)object)) != 0) {
                        object = jSONObject.getString((String)object);
                        cleverTapInstanceConfig.b = object;
                    }
                    if ((n3 = jSONObject.has(string11)) != 0) {
                        cleverTapInstanceConfig.h = n3 = jSONObject.getBoolean(string11);
                    }
                    if ((n3 = jSONObject.has(string10)) != 0) {
                        cleverTapInstanceConfig.p = n3 = jSONObject.getBoolean(string10);
                    }
                    if ((n3 = jSONObject.has(string9)) != 0) {
                        cleverTapInstanceConfig.v = n3 = jSONObject.getBoolean(string9);
                    }
                    if ((n3 = jSONObject.has(string8)) != 0) {
                        cleverTapInstanceConfig.m = n3 = jSONObject.getBoolean(string8);
                    }
                    if ((n3 = jSONObject.has(string7)) != 0) {
                        cleverTapInstanceConfig.s = n3 = jSONObject.getBoolean(string7);
                    }
                    if ((n3 = jSONObject.has(string6)) != 0) {
                        cleverTapInstanceConfig.l = n3 = jSONObject.getInt(string6);
                    }
                    cleverTapInstanceConfig.q = object = new Object();
                    n3 = (int)(jSONObject.has(string5) ? 1 : 0);
                    if (n3 != 0) {
                        cleverTapInstanceConfig.r = object = jSONObject.getString(string5);
                    }
                    object = string21;
                    n4 = jSONObject.has(string21);
                    if (n4 != 0) {
                        n3 = (int)(jSONObject.getBoolean(string21) ? 1 : 0);
                        cleverTapInstanceConfig.k = n3;
                    }
                    object = string20;
                    n4 = jSONObject.has(string20);
                    if (n4 != 0) {
                        n3 = (int)(jSONObject.getBoolean(string20) ? 1 : 0);
                        cleverTapInstanceConfig.u = n3;
                    }
                    object = string18;
                    n4 = jSONObject.has(string18);
                    if (n4 != 0) {
                        n3 = (int)(jSONObject.getBoolean(string18) ? 1 : 0);
                        cleverTapInstanceConfig.i = n3;
                    }
                    object = string16;
                    n4 = jSONObject.has(string16);
                    if (n4 != 0) {
                        n3 = (int)(jSONObject.getBoolean(string16) ? 1 : 0);
                        cleverTapInstanceConfig.n = n3;
                    }
                    object = string15;
                    n4 = jSONObject.has(string15);
                    if (n4 != 0) {
                        cleverTapInstanceConfig.o = object = jSONObject.getString(string15);
                    }
                    object = string13;
                    n4 = jSONObject.has(string13);
                    if (n4 != 0) {
                        n3 = (int)(jSONObject.getBoolean(string13) ? 1 : 0);
                        cleverTapInstanceConfig.j = n3;
                    }
                    object = string12;
                    n4 = jSONObject.has(string12);
                    if (n4 == 0) break block26;
                    object = jSONObject.getJSONArray(string12);
                    n4 = object.length();
                    objectArray = new Object[n4];
                    string14 = null;
                    break block27;
                }
                catch (Throwable throwable) {}
                throwable.getCause();
                com.clevertap.android.sdk.b.l();
                throw throwable;
            }
            try {
                for (n7 = 0; n7 < (n8 = object.length()); ++n7) {
                    objectArray[n7] = object2 = object.get(n7);
                }
            }
            catch (JSONException jSONException) {}
            objectArray = (String[])objectArray;
            cleverTapInstanceConfig.t = objectArray;
        }
        object = string3;
        n4 = jSONObject.has(string3);
        if (n4 != 0) {
            cleverTapInstanceConfig.w = n3 = jSONObject.getInt(string3);
        }
    }

    public final String a(String string2) {
        String string3 = "[";
        StringBuilder stringBuilder = new StringBuilder(string3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        String string4 = ":";
        string2 = !bl2 ? string4.concat(string2) : "";
        stringBuilder.append(string2);
        stringBuilder.append(string4);
        string2 = this.a;
        return h30_0.a(stringBuilder, string2, "]");
    }

    public final b b() {
        b b2 = this.q;
        if (b2 == null) {
            int n3 = this.l;
            this.q = b2 = new b(n3);
        }
        return this.q;
    }

    public final void c() {
        b b2 = this.q;
        this.a("PushProvider");
        b2.getClass();
        com.clevertap.android.sdk.b.m();
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(String string2, String string3) {
        b b2 = this.q;
        string2 = this.a(string2);
        b2.b(string2, string3);
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String[] stringArray = this.a;
        parcel.writeString((String)stringArray);
        stringArray = this.c;
        parcel.writeString((String)stringArray);
        stringArray = this.b;
        parcel.writeString((String)stringArray);
        stringArray = this.d;
        parcel.writeString((String)stringArray);
        stringArray = this.e;
        parcel.writeString((String)stringArray);
        stringArray = this.f;
        parcel.writeString((String)stringArray);
        n3 = (byte)(this.h ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.p ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.v ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.m ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.s ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = this.l;
        parcel.writeInt(n3);
        n3 = (byte)(this.k ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.u ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.i ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.n ? 1 : 0);
        parcel.writeByte((byte)n3);
        stringArray = this.o;
        parcel.writeString((String)stringArray);
        stringArray = this.r;
        parcel.writeString((String)stringArray);
        n3 = (byte)(this.j ? 1 : 0);
        parcel.writeByte((byte)n3);
        stringArray = this.g;
        parcel.writeList((List)stringArray);
        stringArray = this.t;
        parcel.writeStringArray(stringArray);
        n3 = this.w;
        parcel.writeInt(n3);
    }
}

