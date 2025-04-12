/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AuthenticationTokenHeader$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

public final class AuthenticationTokenHeader
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;

    static {
        AuthenticationTokenHeader$a authenticationTokenHeader$a = new Object();
        CREATOR = authenticationTokenHeader$a;
    }

    public AuthenticationTokenHeader(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        Xz3.g(string2, "alg");
        this.a = string2;
        string2 = object.readString();
        Xz3.g(string2, "typ");
        this.b = string2;
        object = object.readString();
        Xz3.g((String)object, "kid");
        this.c = object;
    }

    /*
     * Unable to fully structure code
     */
    public AuthenticationTokenHeader(String var1_1) {
        block15: {
            block14: {
                block13: {
                    var2_2 = "typ";
                    var3_3 = "kid";
                    var4_4 = "alg";
                    var5_5 = "encodedHeaderString";
                    Intrinsics.checkNotNullParameter(var1_1, var5_5);
                    super();
                    Xz3.d((String)var1_1, var5_5);
                    var5_5 = null;
                    var6_6 = Base64.decode((String)var1_1, (int)0);
                    var8_8 = "decodedBytes";
                    Intrinsics.checkNotNullExpressionValue(var6_6, var8_8);
                    var9_9 = Charsets.UTF_8;
                    var7_7 = new String((byte[])var6_6, var9_9);
                    try {
                        var6_6 = new JSONObject;
                    }
                    catch (JSONException v0) {}
                    super(var7_7);
                    var7_7 = var6_6.optString(var4_4);
                    Intrinsics.checkNotNullExpressionValue(var7_7, var4_4);
                    var10_10 = var7_7.length();
                    var11_11 = true;
                    if (var10_10 <= 0) break block13;
                    var12_12 = "RS256";
                    var13_13 = Intrinsics.areEqual(var7_7, var12_12);
                    if (!var13_13) break block13;
                    var13_13 = true;
                    break block14;
                }
                var13_13 = false;
                var7_7 = null;
            }
            var12_12 = var6_6.optString(var3_3);
            var14_14 = "jsonObj.optString(\"kid\")";
            Intrinsics.checkNotNullExpressionValue(var12_12, var14_14);
            var10_10 = var12_12.length();
            if (var10_10 > 0) {
                var10_10 = 1;
                break block15;
            }
            var10_10 = 0;
            var12_12 = null;
        }
        var6_6 = var6_6.optString(var2_2);
        var14_14 = "jsonObj.optString(\"typ\")";
        Intrinsics.checkNotNullExpressionValue(var6_6, var14_14);
        var15_15 = var6_6.length();
        if (var15_15 <= 0) {
            var11_11 = false;
        }
        ** if (!var13_13 || var10_10 == 0 || !var11_11) goto lbl72
lbl-1000:
        // 1 sources

        {
            var1_1 = Base64.decode((String)var1_1, (int)0);
            Intrinsics.checkNotNullExpressionValue(var1_1, var8_8);
            var5_5 = new String((byte[])var1_1, var9_9);
            var1_1 = new JSONObject(var5_5);
            var4_4 = var1_1.getString(var4_4);
            Intrinsics.checkNotNullExpressionValue(var4_4, "jsonObj.getString(\"alg\")");
            this.a = var4_4;
            var2_2 = var1_1.getString(var2_2);
            Intrinsics.checkNotNullExpressionValue(var2_2, "jsonObj.getString(\"typ\")");
            this.b = var2_2;
            var1_1 = var1_1.getString(var3_3);
            Intrinsics.checkNotNullExpressionValue(var1_1, "jsonObj.getString(\"kid\")");
            this.c = var1_1;
            return;
        }
        {
        }
lbl72:
        // 2 sources

        var2_2 = "Invalid Header".toString();
        var1_1 = new IllegalArgumentException(var2_2);
        throw var1_1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof AuthenticationTokenHeader;
        if (!bl4) {
            return false;
        }
        object = (AuthenticationTokenHeader)object;
        String string2 = this.a;
        String string3 = ((AuthenticationTokenHeader)object).a;
        bl4 = Intrinsics.areEqual(string2, string3);
        if (!(bl4 && (bl4 = Intrinsics.areEqual(string3 = this.b, string2 = ((AuthenticationTokenHeader)object).b)) && (bl2 = Intrinsics.areEqual(string3 = this.c, object = ((AuthenticationTokenHeader)object).c)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = 31;
        int n4 = zy_2.b(527, n3, string2);
        String string3 = this.b;
        n4 = zy_2.b(n4, n3, string3);
        return this.c.hashCode() + n4;
    }

    public final String toString() {
        Object object = new JSONObject();
        String string2 = this.a;
        object.put("alg", (Object)string2);
        string2 = this.b;
        object.put("typ", (Object)string2);
        string2 = this.c;
        object.put("kid", (Object)string2);
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "headerJsonObject.toString()");
        return object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        string2 = this.c;
        parcel.writeString(string2);
    }
}

