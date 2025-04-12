/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken$c;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AccessToken
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Date l;
    public static final Date m;
    public static final F1 n;
    public final Date a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final String e;
    public final F1 f;
    public final Date g;
    public final String h;
    public final String i;
    public final Date j;
    public final String k;

    static {
        Object object = new Date(Long.MAX_VALUE);
        l = object;
        object = new Date();
        m = object;
        n = F1.FACEBOOK_APPLICATION_WEB;
        object = new Object();
        CREATOR = object;
    }

    public AccessToken(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        long l2 = object.readLong();
        Object object2 = new Date(l2);
        this.a = object2;
        object.readStringList((List)object2);
        Object object3 = new HashSet(object2);
        object3 = Collections.unmodifiableSet(object3);
        String string2 = "unmodifiableSet(HashSet(permissionsList))";
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        this.b = object3;
        ((ArrayList)object2).clear();
        object.readStringList((List)object2);
        object3 = new HashSet(object2);
        object3 = Collections.unmodifiableSet(object3);
        Intrinsics.checkNotNullExpressionValue(object3, string2);
        this.c = object3;
        ((ArrayList)object2).clear();
        object.readStringList((List)object2);
        object3 = new HashSet(object2);
        object2 = Collections.unmodifiableSet(object3);
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        this.d = object2;
        object2 = object.readString();
        object3 = "token";
        Xz3.g((String)object2, (String)object3);
        this.e = object2;
        object2 = object.readString();
        object2 = object2 != null ? F1.valueOf((String)object2) : n;
        this.f = object2;
        l2 = object.readLong();
        object2 = new Date(l2);
        this.g = object2;
        object2 = object.readString();
        Xz3.g((String)object2, "applicationId");
        this.h = object2;
        object2 = object.readString();
        Xz3.g((String)object2, "userId");
        this.i = object2;
        l2 = object.readLong();
        object2 = new Date(l2);
        this.j = object2;
        object = object.readString();
        this.k = object;
    }

    public /* synthetic */ AccessToken(String string2, String string3, String string4, Collection collection, Collection collection2, Collection collection3, F1 f1, Date date, Date date2, Date date3) {
        this(string2, string3, string4, collection, collection2, collection3, f1, date, date2, date3, "facebook");
    }

    public AccessToken(String object, String string2, String string3, Collection set, Collection object2, Collection collection, F1 f1, Date object3, Date date, Date object4, String string4) {
        long l2;
        long l3;
        long l4;
        long l7;
        Object object5;
        Object object6 = "accessToken";
        Intrinsics.checkNotNullParameter(object, (String)object6);
        String string5 = "applicationId";
        Intrinsics.checkNotNullParameter(string2, string5);
        String string6 = "userId";
        Intrinsics.checkNotNullParameter(string3, string6);
        Xz3.d((String)object, (String)object6);
        Xz3.d(string2, string5);
        Xz3.d(string3, string6);
        object6 = l;
        if (object3 == null) {
            object3 = object6;
        }
        this.a = object3;
        if (set != null) {
            super(set);
        } else {
            object3 = new HashSet();
        }
        set = Collections.unmodifiableSet(object3);
        object3 = "unmodifiableSet(if (perm\u2026missions) else HashSet())";
        Intrinsics.checkNotNullExpressionValue(set, (String)object3);
        this.b = set;
        if (object2 != null) {
            super(object2);
        } else {
            set = new Set();
        }
        set = Collections.unmodifiableSet(set);
        object2 = "unmodifiableSet(\n       \u2026missions) else HashSet())";
        Intrinsics.checkNotNullExpressionValue(set, (String)object2);
        this.c = set;
        if (collection != null) {
            super(collection);
        } else {
            set = new Set();
        }
        set = Collections.unmodifiableSet(set);
        Intrinsics.checkNotNullExpressionValue(set, (String)object2);
        this.d = set;
        this.e = object;
        if (f1 == null) {
            f1 = n;
        }
        if (string4 != null && (object5 = string4.equals(object = "instagram")) != 0) {
            object = AccessToken$c.$EnumSwitchMapping$0;
            int n3 = f1.ordinal();
            object5 = object[n3];
            if (object5 != (n3 = 1)) {
                n3 = 2;
                if (object5 != n3) {
                    n3 = 3;
                    if (object5 == n3) {
                        f1 = F1.INSTAGRAM_WEB_VIEW;
                    }
                } else {
                    f1 = F1.INSTAGRAM_CUSTOM_CHROME_TAB;
                }
            } else {
                f1 = F1.INSTAGRAM_APPLICATION_WEB;
            }
        }
        this.f = f1;
        if (date == null) {
            date = m;
        }
        this.g = date;
        this.h = string2;
        this.i = string3;
        if (object4 == null || (l7 = (l4 = (l3 = ((Date)object4).getTime()) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            object4 = object6;
        }
        this.j = object4;
        if (string4 == null) {
            string4 = "facebook";
        }
        this.k = string4;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        int n3 = 1;
        jSONObject.put("version", n3);
        Object object = this.e;
        jSONObject.put("token", object);
        long l2 = this.a.getTime();
        jSONObject.put("expires_at", l2);
        object = this.b;
        Object object2 = new JSONArray((Collection)object);
        jSONObject.put("permissions", object2);
        object = this.c;
        object2 = new JSONArray((Collection)object);
        jSONObject.put("declined_permissions", object2);
        object = this.d;
        object2 = new JSONArray((Collection)object);
        jSONObject.put("expired_permissions", object2);
        l2 = this.g.getTime();
        jSONObject.put("last_refresh", l2);
        object2 = this.f.name();
        jSONObject.put("source", object2);
        object = this.h;
        jSONObject.put("application_id", object);
        object = this.i;
        jSONObject.put("user_id", object);
        l2 = this.j.getTime();
        String string2 = "data_access_expiration_time";
        jSONObject.put(string2, l2);
        object2 = this.k;
        if (object2 != null) {
            object = "graph_domain";
            jSONObject.put((String)object, object2);
        }
        return jSONObject;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block10: {
            block9: {
                boolean bl3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl4 = object instanceof AccessToken;
                if (!bl4) {
                    return false;
                }
                object = (AccessToken)object;
                Object object2 = this.a;
                Object object3 = ((AccessToken)object).a;
                bl4 = Intrinsics.areEqual(object2, object3);
                if (!bl4 || !(bl4 = Intrinsics.areEqual(object3 = this.b, object2 = ((AccessToken)object).b)) || !(bl4 = Intrinsics.areEqual(object3 = this.c, object2 = ((AccessToken)object).c)) || !(bl4 = Intrinsics.areEqual(object3 = this.d, object2 = ((AccessToken)object).d)) || !(bl4 = Intrinsics.areEqual(object3 = this.e, object2 = ((AccessToken)object).e)) || (object3 = this.f) != (object2 = ((AccessToken)object).f) || !(bl4 = Intrinsics.areEqual(object3 = this.g, object2 = ((AccessToken)object).g)) || !(bl4 = Intrinsics.areEqual(object3 = this.h, object2 = ((AccessToken)object).h)) || !(bl4 = Intrinsics.areEqual(object3 = this.i, object2 = ((AccessToken)object).i)) || !(bl4 = Intrinsics.areEqual(object3 = this.j, object2 = ((AccessToken)object).j))) break block9;
                object3 = this.k;
                object = ((AccessToken)object).k;
                if (object3 == null) {
                    if (object == null) {
                        bl3 = true;
                    } else {
                        bl3 = false;
                        object = null;
                    }
                } else {
                    bl3 = Intrinsics.areEqual(object3, object);
                }
                if (bl3) break block10;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() + 527;
        int n4 = 31;
        int n7 = (((Object)this.b).hashCode() + (n3 *= 31)) * 31;
        n3 = (((Object)this.c).hashCode() + n7) * 31;
        n7 = (((Object)this.d).hashCode() + n3) * 31;
        String string2 = this.e;
        n3 = zy_2.b(n7, n4, string2);
        n7 = (((Object)((Object)this.f)).hashCode() + n3) * 31;
        n3 = (this.g.hashCode() + n7) * 31;
        Object object = this.h;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.i;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.j;
        n7 = (((Date)object).hashCode() + n3) * 31;
        string2 = this.k;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        return n7 + n3;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        FacebookSdk.i(Ax1.INCLUDE_ACCESS_TOKENS);
        Object object = this.b;
        object = TextUtils.join((CharSequence)", ", (Iterable)object);
        charSequence.append((String)object);
        charSequence.append("]}");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "builder.toString()");
        return charSequence;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        long l2 = this.a.getTime();
        parcel.writeLong(l2);
        Collection collection = this.b;
        Object object = new ArrayList(collection);
        parcel.writeStringList(object);
        collection = this.c;
        object = new ArrayList(collection);
        parcel.writeStringList(object);
        collection = this.d;
        object = new ArrayList(collection);
        parcel.writeStringList(object);
        object = this.e;
        parcel.writeString((String)object);
        object = this.f.name();
        parcel.writeString((String)object);
        l2 = this.g.getTime();
        parcel.writeLong(l2);
        object = this.h;
        parcel.writeString((String)object);
        object = this.i;
        parcel.writeString((String)object);
        l2 = this.j.getTime();
        parcel.writeLong(l2);
        object = this.k;
        parcel.writeString((String)object);
    }
}

