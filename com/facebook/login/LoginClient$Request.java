/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient$Request$a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class LoginClient$Request
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final uy1 a;
    public Set b;
    public final dk0_0 c;
    public final String d;
    public String e;
    public boolean f;
    public final String g;
    public final String h;
    public final String i;
    public String j;
    public boolean k;
    public final LA1 l;
    public boolean m;
    public boolean n;
    public final String o;
    public final String p;
    public final String q;
    public final jw_1 r;

    static {
        LoginClient$Request$a loginClient$Request$a = new Object();
        CREATOR = loginClient$Request$a;
    }

    public LoginClient$Request(Parcel object) {
        Object object2 = object.readString();
        Xz3.g(object2, "loginBehavior");
        object2 = uy1.valueOf(object2);
        this.a = object2;
        object.readStringList((List)object2);
        Object object3 = new HashSet(object2);
        this.b = object3;
        object2 = object.readString();
        object2 = object2 != null ? dk0_0.valueOf(object2) : dk0_0.NONE;
        this.c = object2;
        object2 = object.readString();
        Xz3.g(object2, "applicationId");
        this.d = object2;
        object2 = object.readString();
        Xz3.g(object2, "authId");
        this.e = object2;
        byte by2 = object.readByte();
        boolean bl2 = false;
        object3 = null;
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            object2 = null;
        }
        this.f = by2;
        this.g = object2 = object.readString();
        object2 = object.readString();
        String string2 = "authType";
        Xz3.g(object2, string2);
        this.h = object2;
        this.i = object2 = object.readString();
        this.j = object2 = object.readString();
        by2 = object.readByte();
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            object2 = null;
        }
        this.k = by2;
        object2 = object.readString();
        object2 = object2 != null ? LA1.valueOf(object2) : LA1.FACEBOOK;
        this.l = object2;
        by2 = object.readByte();
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            object2 = null;
        }
        this.m = by2;
        by2 = object.readByte();
        if (by2 != 0) {
            bl2 = true;
        }
        this.n = bl2;
        object2 = object.readString();
        object3 = "nonce";
        Xz3.g(object2, (String)object3);
        this.o = object2;
        this.p = object2 = object.readString();
        this.q = object2 = object.readString();
        object = object.readString();
        object = object != null ? jw_1.valueOf((String)object) : null;
        this.r = object;
    }

    public LoginClient$Request(uy1 object, Set object2, dk0_0 dk0_02, String string2, String string3, String string4, LA1 lA1, String string5, String string6, String string7, jw_1 jw_12) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "loginBehavior");
        Intrinsics.checkNotNullParameter((Object)dk0_02, "defaultAudience");
        Intrinsics.checkNotNullParameter(string2, "authType");
        Intrinsics.checkNotNullParameter(string3, "applicationId");
        String string8 = "authId";
        Intrinsics.checkNotNullParameter(string4, string8);
        this.a = object;
        if (object2 == null) {
        }
        this.b = object2;
        this.c = dk0_02;
        this.h = string2;
        this.d = string3;
        this.e = string4;
        if (lA1 == null) {
            lA1 = LA1.FACEBOOK;
        }
        this.l = lA1;
        if (string5 != null && (n3 = string5.length()) != 0) {
            this.o = string5;
        } else {
            object = UUID.randomUUID().toString();
            object2 = "randomUUID().toString()";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            this.o = object;
        }
        this.p = string6;
        this.q = string7;
        this.r = jw_12;
    }

    public final boolean a() {
        boolean bl2;
        LA1 lA1 = this.l;
        LA1 lA12 = LA1.INSTAGRAM;
        if (lA1 == lA12) {
            bl2 = true;
        } else {
            bl2 = false;
            lA1 = null;
        }
        return bl2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.a.name();
        parcel.writeString((String)object);
        Collection collection = this.b;
        object = new ArrayList(collection);
        parcel.writeStringList(object);
        object = this.c.name();
        parcel.writeString((String)object);
        object = this.d;
        parcel.writeString((String)object);
        object = this.e;
        parcel.writeString((String)object);
        n3 = (byte)(this.f ? 1 : 0);
        parcel.writeByte((byte)n3);
        object = this.g;
        parcel.writeString((String)object);
        object = this.h;
        parcel.writeString((String)object);
        object = this.i;
        parcel.writeString((String)object);
        object = this.j;
        parcel.writeString((String)object);
        n3 = (byte)(this.k ? 1 : 0);
        parcel.writeByte((byte)n3);
        object = this.l.name();
        parcel.writeString((String)object);
        n3 = (byte)(this.m ? 1 : 0);
        parcel.writeByte((byte)n3);
        n3 = (byte)(this.n ? 1 : 0);
        parcel.writeByte((byte)n3);
        object = this.o;
        parcel.writeString((String)object);
        object = this.p;
        parcel.writeString((String)object);
        object = this.q;
        parcel.writeString((String)object);
        object = this.r;
        if (object != null) {
            object = ((Enum)object).name();
        } else {
            n3 = 0;
            object = null;
        }
        parcel.writeString((String)object);
    }
}

