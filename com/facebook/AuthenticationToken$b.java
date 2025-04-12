/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 *  org.json.JSONException
 */
package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationTokenManager;
import com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

public final class AuthenticationToken$b {
    public static void a(AuthenticationToken object) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        block19: {
            object6 = AuthenticationTokenManager.d;
            object5 = AuthenticationTokenManager.e;
            if (object5 != null) break block19;
            synchronized (object6) {
                Throwable throwable2;
                block20: {
                    block18: {
                        try {
                            object5 = AuthenticationTokenManager.e;
                            if (object5 != null) break block18;
                        }
                        catch (Throwable throwable2) {}
                        object5 = FacebookSdk.a();
                        object5 = Xv1.a((Context)object5);
                        object4 = "getInstance(applicationContext)";
                        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
                        object4 = new sr_1();
                        AuthenticationTokenManager.e = object3 = new AuthenticationTokenManager((Xv1)object5, (sr_1)object4);
                        object5 = object3;
                        break block20;
                    }
                    break block19;
                }
                throw throwable2;
            }
        }
        object6 = ((AuthenticationTokenManager)object5).c;
        ((AuthenticationTokenManager)object5).c = object;
        object4 = "com.facebook.AuthenticationManager.CachedAuthenticationToken";
        object3 = ((AuthenticationTokenManager)object5).b;
        if (object != null) {
            object3.getClass();
            object2 = "authenticationToken";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            try {
                object2 = ((AuthenticationToken)object).a();
            }
            catch (JSONException jSONException) {}
            object3 = ((sr_1)object3).a;
            object3 = object3.edit();
            object2 = object2.toString();
            object4 = object3.putString((String)object4, (String)object2);
            object4.apply();
        } else {
            object3 = ((sr_1)object3).a.edit();
            object3.remove((String)object4).apply();
            object4 = FacebookSdk.a();
            lz3_0.d((Context)object4);
        }
        boolean bl2 = lz3_0.a(object6, object);
        if (!bl2) {
            object3 = FacebookSdk.a();
            object2 = AuthenticationTokenManager.CurrentAuthenticationTokenChangedBroadcastReceiver.class;
            object4 = new Intent((Context)object3, (Class)object2);
            object4.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
            object3 = "com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN";
            object4.putExtra((String)object3, (Parcelable)object6);
            object6 = "com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN";
            object4.putExtra((String)object6, (Parcelable)object);
            object = ((AuthenticationTokenManager)object5).a;
            ((Xv1)object).c((Intent)object4);
        }
    }
}

