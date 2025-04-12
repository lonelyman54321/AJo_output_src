/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Base64
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AuthenticationTokenClaims$a;
import com.facebook.AuthenticationTokenClaims$b;
import com.facebook.FacebookSdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AuthenticationTokenClaims
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Set n;
    public final String o;
    public final Map p;
    public final Map q;
    public final Map r;
    public final String s;
    public final String t;

    static {
        AuthenticationTokenClaims$a authenticationTokenClaims$a = new Object();
        CREATOR = authenticationTokenClaims$a;
    }

    public AuthenticationTokenClaims(Parcel object) {
        long l2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        Map map2 = object.readString();
        Xz3.g((String)((Object)map2), "jti");
        this.a = map2;
        map2 = object.readString();
        Xz3.g((String)((Object)map2), "iss");
        this.b = map2;
        map2 = object.readString();
        Xz3.g((String)((Object)map2), "aud");
        this.c = map2;
        map2 = object.readString();
        Xz3.g((String)((Object)map2), "nonce");
        this.d = map2;
        this.e = l2 = object.readLong();
        this.f = l2 = object.readLong();
        map2 = object.readString();
        Xz3.g((String)((Object)map2), "sub");
        this.g = map2;
        map2 = object.readString();
        this.h = map2;
        map2 = object.readString();
        this.i = map2;
        map2 = object.readString();
        this.j = map2;
        map2 = object.readString();
        this.k = map2;
        map2 = object.readString();
        this.l = map2;
        map2 = object.readString();
        this.m = map2;
        map2 = object.createStringArrayList();
        Map map3 = null;
        if (map2 != null) {
            HashSet hashSet = new HashSet(map2);
            map2 = Collections.unmodifiableSet(hashSet);
        } else {
            map2 = null;
        }
        this.n = map2;
        this.o = map2 = object.readString();
        map2 = IntCompanionObject.INSTANCE.getClass().getClassLoader();
        map2 = object.readHashMap((ClassLoader)((Object)map2));
        boolean bl2 = map2 instanceof HashMap;
        if (!bl2) {
            map2 = null;
        }
        map2 = map2 != null ? Collections.unmodifiableMap(map2) : null;
        this.p = map2;
        map2 = StringCompanionObject.INSTANCE.getClass().getClassLoader();
        map2 = object.readHashMap((ClassLoader)((Object)map2));
        bl2 = map2 instanceof HashMap;
        if (!bl2) {
            map2 = null;
        }
        map2 = map2 != null ? Collections.unmodifiableMap(map2) : null;
        this.q = map2;
        map2 = StringCompanionObject.class.getClassLoader();
        map2 = object.readHashMap((ClassLoader)((Object)map2));
        bl2 = map2 instanceof HashMap;
        if (!bl2) {
            map2 = null;
        }
        if (map2 != null) {
            map3 = Collections.unmodifiableMap(map2);
        }
        this.r = map3;
        this.s = map2 = object.readString();
        object = object.readString();
        this.t = object;
    }

    public AuthenticationTokenClaims(String object, String object2) {
        block24: {
            Object object3 = "iss";
            HashSet<String> hashSet = "encodedClaims";
            Intrinsics.checkNotNullParameter(object, (String)((Object)hashSet));
            Intrinsics.checkNotNullParameter(object2, "expectedNonce");
            Xz3.d((String)object, (String)((Object)hashSet));
            int n3 = 8;
            object = Base64.decode((String)object, (int)n3);
            Intrinsics.checkNotNullExpressionValue(object, "decodedBytes");
            Object object4 = Charsets.UTF_8;
            hashSet = new HashSet<String>((byte[])object, (Charset)object4);
            object = new JSONObject((String)((Object)hashSet));
            hashSet = "jti";
            object4 = object.optString((String)((Object)hashSet));
            Intrinsics.checkNotNullExpressionValue(object4, (String)((Object)hashSet));
            int n4 = ((String)object4).length();
            if (n4 != 0) {
                String string2;
                Object object5;
                int n7;
                block25: {
                    object4 = object.optString((String)object3);
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                    n7 = ((String)object4).length();
                    if (n7 == 0) break block24;
                    object5 = new URL((String)object4);
                    object5 = ((URL)object5).getHost();
                    string2 = "facebook.com";
                    n7 = (int)(Intrinsics.areEqual(object5, string2) ? 1 : 0);
                    if (n7 != 0) break block25;
                    object5 = new URL((String)object4);
                    object4 = ((URL)object5).getHost();
                    object5 = "www.facebook.com";
                    try {
                        n4 = (int)(Intrinsics.areEqual(object4, object5) ? 1 : 0);
                        if (n4 == 0) break block24;
                    }
                    catch (MalformedURLException malformedURLException) {}
                }
                object4 = "aud";
                object5 = object.optString((String)object4);
                Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
                int n8 = ((String)object5).length();
                if (n8 != 0 && (n7 = (int)(Intrinsics.areEqual(object5, string2 = FacebookSdk.b()) ? 1 : 0)) != 0) {
                    string2 = "exp";
                    long l2 = object.optLong(string2);
                    Object object6 = new Date();
                    int n10 = 1000;
                    long l3 = n10;
                    object5 = new Date(l2 *= l3);
                    n7 = (int)(((Date)object6).after((Date)object5) ? 1 : 0);
                    if (n7 == 0) {
                        object5 = "iat";
                        l2 = object.optLong((String)object5);
                        l2 *= l3;
                        object6 = new Date();
                        l3 = 600000L;
                        Date date = new Date(l2 += l3);
                        boolean bl2 = ((Date)object6).after(date);
                        if (!bl2) {
                            object6 = "sub";
                            String string3 = object.optString((String)object6);
                            Intrinsics.checkNotNullExpressionValue(string3, (String)object6);
                            int n14 = string3.length();
                            if (n14 != 0) {
                                boolean bl3;
                                string3 = "nonce";
                                String string4 = object.optString(string3);
                                Intrinsics.checkNotNullExpressionValue(string4, string3);
                                int n15 = string4.length();
                                if (n15 != 0 && (bl3 = Intrinsics.areEqual(string4, object2))) {
                                    long l4;
                                    object2 = object.getString((String)((Object)hashSet));
                                    hashSet = "jsonObj.getString(JSON_KEY_JIT)";
                                    Intrinsics.checkNotNullExpressionValue(object2, (String)((Object)hashSet));
                                    this.a = object2;
                                    object2 = object.getString((String)object3);
                                    Intrinsics.checkNotNullExpressionValue(object2, "jsonObj.getString(JSON_KEY_ISS)");
                                    this.b = object2;
                                    object2 = object.getString((String)object4);
                                    Intrinsics.checkNotNullExpressionValue(object2, "jsonObj.getString(JSON_KEY_AUD)");
                                    this.c = object2;
                                    object2 = object.getString(string3);
                                    Intrinsics.checkNotNullExpressionValue(object2, "jsonObj.getString(JSON_KEY_NONCE)");
                                    this.d = object2;
                                    this.e = l4 = object.getLong(string2);
                                    this.f = l4 = object.getLong((String)object5);
                                    object2 = object.getString((String)object6);
                                    Intrinsics.checkNotNullExpressionValue(object2, "jsonObj.getString(JSON_KEY_SUB)");
                                    this.g = object2;
                                    object2 = AuthenticationTokenClaims$b.a("name", (JSONObject)object);
                                    this.h = object2;
                                    object2 = AuthenticationTokenClaims$b.a("given_name", (JSONObject)object);
                                    this.i = object2;
                                    object2 = AuthenticationTokenClaims$b.a("middle_name", (JSONObject)object);
                                    this.j = object2;
                                    object2 = AuthenticationTokenClaims$b.a("family_name", (JSONObject)object);
                                    this.k = object2;
                                    object2 = AuthenticationTokenClaims$b.a("email", (JSONObject)object);
                                    this.l = object2;
                                    object2 = AuthenticationTokenClaims$b.a("picture", (JSONObject)object);
                                    this.m = object2;
                                    object2 = object.optJSONArray("user_friends");
                                    object3 = null;
                                    if (object2 == null) {
                                        bl3 = false;
                                        object2 = null;
                                    } else {
                                        hashSet = lz3_0.a;
                                        Intrinsics.checkNotNullParameter(object2, "jsonArray");
                                        hashSet = new HashSet<String>();
                                        n4 = object2.length();
                                        object5 = null;
                                        for (n7 = 0; n7 < n4; ++n7) {
                                            string2 = object2.getString(n7);
                                            object6 = "jsonArray.getString(i)";
                                            Intrinsics.checkNotNullExpressionValue(string2, (String)object6);
                                            hashSet.add(string2);
                                        }
                                        object2 = Collections.unmodifiableSet(hashSet);
                                    }
                                    this.n = object2;
                                    object2 = AuthenticationTokenClaims$b.a("user_birthday", (JSONObject)object);
                                    this.o = object2;
                                    object2 = object.optJSONObject("user_age_range");
                                    if (object2 == null) {
                                        bl3 = false;
                                        object2 = null;
                                    } else {
                                        object2 = Collections.unmodifiableMap(lz3_0.i(object2));
                                    }
                                    this.p = object2;
                                    object2 = object.optJSONObject("user_hometown");
                                    if (object2 == null) {
                                        bl3 = false;
                                        object2 = null;
                                    } else {
                                        object2 = Collections.unmodifiableMap(lz3_0.j(object2));
                                    }
                                    this.q = object2;
                                    object2 = object.optJSONObject("user_location");
                                    if (object2 != null) {
                                        object2 = lz3_0.j(object2);
                                        object3 = Collections.unmodifiableMap(object2);
                                    }
                                    this.r = object3;
                                    object2 = AuthenticationTokenClaims$b.a("user_gender", (JSONObject)object);
                                    this.s = object2;
                                    this.t = object = AuthenticationTokenClaims$b.a("user_link", (JSONObject)object);
                                    return;
                                }
                            }
                        }
                    }
                }
                {
                }
            }
        }
        object2 = "Invalid claims".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String string2 = this.a;
        jSONObject.put("jti", (Object)string2);
        string2 = this.b;
        jSONObject.put("iss", (Object)string2);
        string2 = this.c;
        jSONObject.put("aud", (Object)string2);
        string2 = this.d;
        jSONObject.put("nonce", (Object)string2);
        long l2 = this.e;
        jSONObject.put("exp", l2);
        l2 = this.f;
        jSONObject.put("iat", l2);
        Object object = this.g;
        if (object != null) {
            string2 = "sub";
            jSONObject.put(string2, object);
        }
        if ((object = this.h) != null) {
            string2 = "name";
            jSONObject.put(string2, object);
        }
        if ((object = this.i) != null) {
            string2 = "given_name";
            jSONObject.put(string2, object);
        }
        if ((object = this.j) != null) {
            string2 = "middle_name";
            jSONObject.put(string2, object);
        }
        if ((object = this.k) != null) {
            string2 = "family_name";
            jSONObject.put(string2, object);
        }
        if ((object = this.l) != null) {
            string2 = "email";
            jSONObject.put(string2, object);
        }
        if ((object = this.m) != null) {
            string2 = "picture";
            jSONObject.put(string2, object);
        }
        if ((object = this.n) != null) {
            object = (Collection)object;
            string2 = new JSONArray((Collection)object);
            object = "user_friends";
            jSONObject.put((String)object, (Object)string2);
        }
        if ((object = this.o) != null) {
            string2 = "user_birthday";
            jSONObject.put(string2, object);
        }
        if ((object = this.p) != null) {
            string2 = new JSONObject((Map)object);
            object = "user_age_range";
            jSONObject.put((String)object, (Object)string2);
        }
        if ((object = this.q) != null) {
            string2 = new JSONObject((Map)object);
            object = "user_hometown";
            jSONObject.put((String)object, (Object)string2);
        }
        if ((object = this.r) != null) {
            string2 = new JSONObject((Map)object);
            object = "user_location";
            jSONObject.put((String)object, (Object)string2);
        }
        if ((object = this.s) != null) {
            string2 = "user_gender";
            jSONObject.put(string2, object);
        }
        if ((object = this.t) != null) {
            string2 = "user_link";
            jSONObject.put(string2, object);
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        long l2;
        long l3;
        long l4;
        long l7;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof AuthenticationTokenClaims;
        if (!bl4) {
            return false;
        }
        object = (AuthenticationTokenClaims)object;
        Object object2 = this.a;
        Object object3 = ((AuthenticationTokenClaims)object).a;
        bl4 = Intrinsics.areEqual(object2, object3);
        if (!(bl4 && (bl4 = Intrinsics.areEqual(object3 = this.b, object2 = ((AuthenticationTokenClaims)object).b)) && (bl4 = Intrinsics.areEqual(object3 = this.c, object2 = ((AuthenticationTokenClaims)object).c)) && (bl4 = Intrinsics.areEqual(object3 = this.d, object2 = ((AuthenticationTokenClaims)object).d)) && !(bl4 = (l7 = (l4 = this.e) - (l3 = ((AuthenticationTokenClaims)object).e)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) && !(bl4 = (l2 = (l4 = this.f) - (l3 = ((AuthenticationTokenClaims)object).f)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) && (bl4 = Intrinsics.areEqual(object3 = this.g, object2 = ((AuthenticationTokenClaims)object).g)) && (bl4 = Intrinsics.areEqual(object3 = this.h, object2 = ((AuthenticationTokenClaims)object).h)) && (bl4 = Intrinsics.areEqual(object3 = this.i, object2 = ((AuthenticationTokenClaims)object).i)) && (bl4 = Intrinsics.areEqual(object3 = this.j, object2 = ((AuthenticationTokenClaims)object).j)) && (bl4 = Intrinsics.areEqual(object3 = this.k, object2 = ((AuthenticationTokenClaims)object).k)) && (bl4 = Intrinsics.areEqual(object3 = this.l, object2 = ((AuthenticationTokenClaims)object).l)) && (bl4 = Intrinsics.areEqual(object3 = this.m, object2 = ((AuthenticationTokenClaims)object).m)) && (bl4 = Intrinsics.areEqual(object3 = this.n, object2 = ((AuthenticationTokenClaims)object).n)) && (bl4 = Intrinsics.areEqual(object3 = this.o, object2 = ((AuthenticationTokenClaims)object).o)) && (bl4 = Intrinsics.areEqual(object3 = this.p, object2 = ((AuthenticationTokenClaims)object).p)) && (bl4 = Intrinsics.areEqual(object3 = this.q, object2 = ((AuthenticationTokenClaims)object).q)) && (bl4 = Intrinsics.areEqual(object3 = this.r, object2 = ((AuthenticationTokenClaims)object).r)) && (bl4 = Intrinsics.areEqual(object3 = this.s, object2 = ((AuthenticationTokenClaims)object).s)) && (bl2 = Intrinsics.areEqual(object3 = this.t, object = ((AuthenticationTokenClaims)object).t)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = 31;
        int n7 = zy_2.b(527, n4, string2);
        String string3 = this.b;
        n7 = zy_2.b(n7, n4, string3);
        string3 = this.c;
        n7 = zy_2.b(n7, n4, string3);
        string3 = this.d;
        n7 = zy_2.b(n7, n4, string3);
        long l2 = this.e;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n7 = (n7 + n10) * 31;
        l2 = this.f;
        l3 = l2 >>> n8;
        n8 = (int)(l2 ^= l3);
        n7 = (n7 + n8) * 31;
        string3 = this.g;
        n7 = zy_2.b(n7, n4, string3);
        n8 = 0;
        string3 = null;
        Object object = this.h;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.i;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.j;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.k;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.l;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.m;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.n;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.o;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.p;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.q;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.r;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        object = this.s;
        if (object != null) {
            n3 = ((String)object).hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n7 = (n7 + n3) * 31;
        String string4 = this.t;
        if (string4 != null) {
            n8 = string4.hashCode();
        }
        return n7 + n8;
    }

    public final String toString() {
        String string2 = this.a().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "claimsJsonObject.toString()");
        return string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.a;
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeString((String)object);
        object = this.d;
        parcel.writeString((String)object);
        long l2 = this.e;
        parcel.writeLong(l2);
        l2 = this.f;
        parcel.writeLong(l2);
        object = this.g;
        parcel.writeString((String)object);
        object = this.h;
        parcel.writeString((String)object);
        object = this.i;
        parcel.writeString((String)object);
        object = this.j;
        parcel.writeString((String)object);
        object = this.k;
        parcel.writeString((String)object);
        object = this.l;
        parcel.writeString((String)object);
        object = this.m;
        parcel.writeString((String)object);
        object = this.n;
        if (object == null) {
            object = null;
            parcel.writeStringList(null);
        } else {
            object = (Collection)object;
            ArrayList arrayList = new ArrayList(object);
            parcel.writeStringList(arrayList);
        }
        object = this.o;
        parcel.writeString((String)object);
        object = this.p;
        parcel.writeMap((Map)object);
        object = this.q;
        parcel.writeMap((Map)object);
        object = this.r;
        parcel.writeMap((Map)object);
        object = this.s;
        parcel.writeString((String)object);
        object = this.t;
        parcel.writeString((String)object);
    }
}

