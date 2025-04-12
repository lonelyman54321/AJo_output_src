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
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.LoginClient$Result$b;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class LoginClient$Result
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final LoginClient$Result$a a;
    public final AccessToken b;
    public final AuthenticationToken c;
    public final String d;
    public final String e;
    public final LoginClient$Request f;
    public Map g;
    public HashMap h;

    static {
        LoginClient$Result$b loginClient$Result$b = new Object();
        CREATOR = loginClient$Result$b;
    }

    public LoginClient$Result(Parcel object) {
        Object object2 = object.readString();
        if (object2 == null) {
            object2 = "error";
        }
        object2 = LoginClient$Result$a.valueOf(object2);
        this.a = object2;
        object2 = AccessToken.class.getClassLoader();
        object2 = (AccessToken)object.readParcelable((ClassLoader)object2);
        this.b = object2;
        object2 = AuthenticationToken.class.getClassLoader();
        object2 = (AuthenticationToken)object.readParcelable((ClassLoader)object2);
        this.c = object2;
        this.d = object2 = object.readString();
        this.e = object2 = object.readString();
        object2 = LoginClient$Request.class.getClassLoader();
        object2 = (LoginClient$Request)object.readParcelable((ClassLoader)object2);
        this.f = object2;
        object2 = lz3_0.J(object);
        this.g = object2;
        object = lz3_0.J(object);
        this.h = object;
    }

    public LoginClient$Result(LoginClient$Request loginClient$Request, LoginClient$Result$a loginClient$Result$a, AccessToken accessToken, AuthenticationToken authenticationToken, String string2, String string3) {
        Intrinsics.checkNotNullParameter((Object)loginClient$Result$a, "code");
        this.f = loginClient$Request;
        this.b = accessToken;
        this.c = authenticationToken;
        this.d = string2;
        this.a = loginClient$Result$a;
        this.e = string3;
    }

    public LoginClient$Result(LoginClient$Request loginClient$Request, LoginClient$Result$a loginClient$Result$a, AccessToken accessToken, String string2, String string3) {
        Intrinsics.checkNotNullParameter((Object)loginClient$Result$a, "code");
        this(loginClient$Request, loginClient$Result$a, accessToken, null, string2, string3);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.a.name();
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.c;
        parcel.writeParcelable((Parcelable)object, n3);
        object = this.d;
        parcel.writeString((String)object);
        object = this.e;
        parcel.writeString((String)object);
        object = this.f;
        parcel.writeParcelable((Parcelable)object, n3);
        Map map2 = this.g;
        lz3_0.P(parcel, map2);
        map2 = this.h;
        lz3_0.P(parcel, map2);
    }
}

