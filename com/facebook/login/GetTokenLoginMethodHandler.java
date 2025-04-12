/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.GetTokenLoginMethodHandler$a;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.LoginMethodHandler$a;
import com.facebook.login.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class GetTokenLoginMethodHandler
extends LoginMethodHandler {
    public static final Parcelable.Creator CREATOR;
    public f c;
    public final String d;

    static {
        GetTokenLoginMethodHandler$a getTokenLoginMethodHandler$a = new Object();
        CREATOR = getTokenLoginMethodHandler$a;
    }

    public GetTokenLoginMethodHandler(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        super(parcel);
        this.d = "get_token";
    }

    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        super(loginClient);
        this.d = "get_token";
    }

    public final void b() {
        f f5 = this.c;
        if (f5 != null) {
            f5.d = false;
            f5.c = null;
            this.c = null;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int l(LoginClient$Request object) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(object, "request");
        Object object2 = this.e().f();
        if (object2 == null) {
            object2 = FacebookSdk.a();
        }
        Intrinsics.checkNotNullParameter(object2, "context");
        Intrinsics.checkNotNullParameter(object, "request");
        String string2 = ((LoginClient$Request)object).d;
        String string3 = ((LoginClient$Request)object).o;
        Object object3 = new rt2_2((Context)object2, string2, string3);
        this.c = object3;
        synchronized (object3) {
            Class<os1_1> clazz;
            block16: {
                n4 = ((rt2_2)object3).d;
                string2 = null;
                n3 = 1;
                if (n4 != 0) {
                    return 0;
                }
                n4 = ((rt2_2)object3).i;
                clazz = os1_1.a;
                clazz = os1_1.class;
                boolean bl2 = td0.b(clazz);
                if (!bl2) {
                    try {
                        os1_1 os1_12 = os1_1.a;
                        ArrayList arrayList = os1_1.b;
                        object2 = new int[]{n4};
                        object2 = os1_12.k(arrayList, (int[])object2);
                        n4 = ((OS1$f)object2).b;
                        break block16;
                    }
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                }
                n4 = 0;
                object2 = null;
            }
            int n7 = -1;
            if (n4 == n7) {
                return 0;
            }
            object2 = ((rt2_2)object3).a;
            if ((object2 = os1_1.e((Context)object2)) == null) {
                return 0;
            }
            ((rt2_2)object3).d = n3;
            clazz = ((rt2_2)object3).a;
            clazz.bindService((Intent)object2, (ServiceConnection)object3, n3);
            n4 = 1;
        }
        int n8 = n4 ^ 1;
        if (n8 != 0) {
            return 0;
        }
        object3 = this.e().e;
        if (object3 != null) {
            object3.a();
        }
        object3 = new lz0_0(this, (LoginClient$Request)object);
        object = this.c;
        if (object == null) return n3;
        ((rt2_2)object).c = object3;
        return n3;
    }

    /*
     * Loose catch block
     */
    public final void m(LoginClient$Request object, Bundle object2) {
        Object object3;
        AccessToken accessToken;
        Object object4;
        Object object5;
        block19: {
            Intrinsics.checkNotNullParameter(object, "request");
            object5 = "result";
            Intrinsics.checkNotNullParameter(object2, (String)object5);
            object5 = F1.FACEBOOK_APPLICATION_SERVICE;
            object4 = ((LoginClient$Request)object).d;
            accessToken = LoginMethodHandler$a.a((Bundle)object2, (F1)((Object)object5), (String)object4);
            object5 = ((LoginClient$Request)object).o;
            object4 = "bundle";
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            object4 = "com.facebook.platform.extra.ID_TOKEN";
            object2 = object2.getString((String)object4);
            if (object2 == null) break block19;
            int n3 = ((String)object2).length();
            if (n3 == 0 || object5 == null) break block19;
            n3 = ((String)object5).length();
            if (n3 == 0) break block19;
            try {
                object3 = object4 = new AuthenticationToken((String)object2, (String)object5);
            }
            catch (Exception exception) {
                object = exception.getMessage();
                object2 = new FacebookException((String)object);
                throw object2;
            }
        }
        object2 = null;
        object3 = null;
        Object object6 = LoginClient$Result$a.SUCCESS;
        Object object7 = object2;
        object2 = new LoginClient$Result((LoginClient$Request)object, (LoginClient$Result$a)((Object)object6), accessToken, (AuthenticationToken)object3, null, null);
        {
            catch (FacebookException facebookException) {
                object4 = this.e().g;
                String string2 = facebookException.getMessage();
                object2 = new ArrayList();
                if (string2 != null) {
                    ((ArrayList)object2).add(string2);
                }
                string2 = ": ";
                object6 = TextUtils.join((CharSequence)string2, (Iterable)object2);
                object7 = LoginClient$Result$a.ERROR;
                accessToken = null;
                object5 = object2;
                object2 = new LoginClient$Result((LoginClient$Request)object4, (LoginClient$Result$a)((Object)object7), null, (String)object6, null);
            }
        }
        this.e().e((LoginClient$Result)object2);
    }
}

