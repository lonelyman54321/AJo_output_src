/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  org.json.JSONException
 */
package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$c;
import com.facebook.a;
import com.facebook.b$a;
import com.facebook.b$d;
import com.facebook.d;
import com.facebook.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

public final class b {
    public static final b$a f;
    public static b g;
    public final Xv1 a;
    public final a b;
    public AccessToken c;
    public final AtomicBoolean d;
    public Date e;

    static {
        b$a b$a;
        f = b$a = new Object();
    }

    public b(Xv1 object, a a2) {
        Intrinsics.checkNotNullParameter(object, "localBroadcastManager");
        Intrinsics.checkNotNullParameter(a2, "accessTokenCache");
        this.a = object;
        this.b = a2;
        this.d = object = new AtomicBoolean(false);
        this.e = object = new Date(0L);
    }

    public final void a() {
        Object object;
        Object object2 = this;
        String string2 = null;
        boolean bl2 = true;
        Object[] objectArray = this.c;
        if (objectArray == null) {
            return;
        }
        Object object3 = this.d;
        boolean bl3 = ((AtomicBoolean)object3).compareAndSet(false, bl2);
        if (!bl3) {
            return;
        }
        object3 = new Date();
        this.e = object3;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        object3 = new Object();
        GraphRequest[] graphRequestArray = new b1_0(atomicBoolean, hashSet, hashSet2, hashSet3);
        String string3 = "fields";
        Object object4 = E1.a(string3, "permission,status");
        String string4 = GraphRequest.j;
        graphRequestArray = GraphRequest$c.g((AccessToken)objectArray, "me/permissions", (GraphRequest$b)graphRequestArray);
        string4 = "<set-?>";
        Intrinsics.checkNotNullParameter(object4, string4);
        graphRequestArray.d = object4;
        object4 = Qa1.GET;
        graphRequestArray.k((Qa1)((Object)object4));
        C1 c1 = new C1((b$d)object3);
        String string5 = objectArray.k;
        if (string5 == null) {
            string5 = "facebook";
        }
        object = (bl2 = Intrinsics.areEqual(string5, object = "instagram")) ? new Object() : new Object();
        string5 = new Bundle();
        string2 = object.a();
        string5.putString("grant_type", string2);
        string2 = objectArray.h;
        string5.putString("client_id", string2);
        string5.putString(string3, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        object = object.b();
        object = GraphRequest$c.g((AccessToken)objectArray, (String)object, c1);
        Intrinsics.checkNotNullParameter(string5, string4);
        ((GraphRequest)object).d = string5;
        ((GraphRequest)object).k((Qa1)((Object)object4));
        int n3 = 2;
        object2 = new GraphRequest[n3];
        string2 = null;
        object2[0] = graphRequestArray;
        int n4 = 1;
        object2[n4] = object;
        e e2 = new e((GraphRequest)object2);
        object = object2;
        graphRequestArray = this;
        object2 = new D1((b$d)object3, (AccessToken)objectArray, atomicBoolean, hashSet, hashSet2, hashSet3, (b)this);
        Intrinsics.checkNotNullParameter(object2, "callback");
        object = e2.d;
        bl3 = ((ArrayList)object).contains(object2);
        if (!bl3) {
            ((ArrayList)object).add(object2);
        }
        Intrinsics.checkNotNullParameter(e2, "requests");
        Xz3.e(e2);
        object = new d(e2);
        object3 = FacebookSdk.d();
        objectArray = new Void[]{};
        object.executeOnExecutor((Executor)object3, objectArray);
    }

    public final void b(AccessToken accessToken, AccessToken accessToken2) {
        Context context = FacebookSdk.a();
        Intent intent = new Intent(context, CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", (Parcelable)accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", (Parcelable)accessToken2);
        this.a.c(intent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(AccessToken accessToken, boolean bl2) {
        String string2;
        Object object;
        AccessToken accessToken2 = this.c;
        this.c = accessToken;
        this.d.set(false);
        long l2 = 0L;
        Object object2 = new Date(l2);
        this.e = object2;
        if (bl2) {
            object = "com.facebook.AccessTokenManager.CachedAccessToken";
            object2 = this.b;
            if (accessToken != null) {
                object2.getClass();
                string2 = "accessToken";
                Intrinsics.checkNotNullParameter(accessToken, string2);
                try {
                    string2 = accessToken.a();
                    object2 = ((a)object2).a;
                    object2 = object2.edit();
                    string2 = string2.toString();
                    object = object2.putString((String)object, string2);
                    object.apply();
                }
                catch (JSONException jSONException) {}
            } else {
                object2 = ((a)object2).a.edit();
                object2.remove((String)object).apply();
                object = FacebookSdk.a();
                lz3_0.d((Context)object);
            }
        }
        if (bl2 = lz3_0.a(accessToken2, accessToken)) return;
        this.b(accessToken2, accessToken);
        accessToken = FacebookSdk.a();
        object = AccessToken.l;
        object = AccessToken$b.b();
        accessToken2 = (AlarmManager)accessToken.getSystemService("alarm");
        boolean bl3 = AccessToken$b.c();
        if (!bl3) return;
        if (object != null) {
            object2 = ((AccessToken)object).a;
        } else {
            bl3 = false;
            object2 = null;
        }
        if (object2 == null) return;
        if (accessToken2 == null) {
            return;
        }
        object2 = new Intent((Context)accessToken, CurrentAccessTokenExpirationBroadcastReceiver.class);
        string2 = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
        object2.setAction(string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            n3 = 0x4000000;
            accessToken = PendingIntent.getBroadcast((Context)accessToken, (int)0, (Intent)object2, (int)n3);
        } else {
            accessToken = PendingIntent.getBroadcast((Context)accessToken, (int)0, (Intent)object2, (int)0);
        }
        try {
            object = ((AccessToken)object).a;
            long l3 = ((Date)object).getTime();
            bl2 = true;
            accessToken2.set((int)(bl2 ? 1 : 0), l3, (PendingIntent)accessToken);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

