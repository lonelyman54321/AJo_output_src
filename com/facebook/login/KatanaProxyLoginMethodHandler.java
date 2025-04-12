/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import com.facebook.login.KatanaProxyLoginMethodHandler$a;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.facebook.login.j$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class KatanaProxyLoginMethodHandler
extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator CREATOR;
    public final String d;

    static {
        KatanaProxyLoginMethodHandler$a katanaProxyLoginMethodHandler$a = new Object();
        CREATOR = katanaProxyLoginMethodHandler$a;
    }

    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        super(parcel);
        this.d = "katana_proxy_auth";
    }

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        Intrinsics.checkNotNullParameter(loginClient, "loginClient");
        super(loginClient);
        this.d = "katana_proxy_auth";
    }

    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.d;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int l(LoginClient$Request loginClient$Request) {
        boolean bl2;
        Object object;
        ArrayList<Intent> arrayList;
        Intent intent;
        boolean bl3;
        String string2;
        uy1 uy12;
        ArrayList<Intent> arrayList2;
        block15: {
            block16: {
                boolean bl4;
                Iterator iterator;
                boolean bl5;
                boolean bl6;
                String string3;
                String string4;
                boolean bl7;
                Object object2;
                boolean bl8;
                Object object3;
                String string5;
                block14: {
                    void var8_27;
                    LoginClient$Request loginClient$Request2;
                    block13: {
                        arrayList2 = this;
                        loginClient$Request2 = loginClient$Request;
                        Intrinsics.checkNotNullParameter(loginClient$Request, "request");
                        uy12 = loginClient$Request.a;
                        boolean bl9 = FacebookSdk.p;
                        if (bl9 && (string2 = tf0_1.a()) != null && (bl3 = uy12.allowsCustomTabAuth())) {
                            bl3 = true;
                        } else {
                            bl3 = false;
                            uy12 = null;
                        }
                        string2 = new JSONObject();
                        String string6 = "init";
                        try {
                            long l2 = System.currentTimeMillis();
                            string2.put(string6, l2);
                        }
                        catch (JSONException jSONException) {}
                        string2 = string2.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "e2e.toString()");
                        this.e().f();
                        string5 = loginClient$Request2.d;
                        Set set = loginClient$Request2.b;
                        object3 = set;
                        object3 = set;
                        Iterator iterator2 = set.iterator();
                        while (bl8 = iterator2.hasNext()) {
                            object2 = (String)iterator2.next();
                            bl8 = j$b.b((String)object2);
                            if (!bl8) continue;
                            bl7 = true;
                            break block13;
                        }
                        bl7 = false;
                    }
                    dk0_0 dk0_02 = loginClient$Request2.c;
                    if (dk0_02 == null) {
                        dk0_0 dk0_03 = dk0_0.NONE;
                    }
                    void var16_40 = var8_27;
                    String string7 = loginClient$Request2.e;
                    String string8 = ((LoginMethodHandler)((Object)arrayList2)).c(string7);
                    string4 = loginClient$Request2.h;
                    string3 = loginClient$Request2.j;
                    bl6 = loginClient$Request2.k;
                    bl5 = loginClient$Request2.m;
                    bl8 = loginClient$Request2.n;
                    String string9 = loginClient$Request2.o;
                    jw_1 jw_12 = loginClient$Request2.r;
                    if (jw_12 != null) {
                        jw_12.name();
                    }
                    os1_1 os1_12 = os1_1.a;
                    intent = os1_1.class;
                    boolean bl10 = td0.b(intent);
                    arrayList = null;
                    object = "e2e";
                    if (bl10) break block15;
                    String string10 = "applicationId";
                    try {
                        Intrinsics.checkNotNullParameter(string5, string10);
                        String string11 = "permissions";
                        Intrinsics.checkNotNullParameter(object3, string11);
                        Intrinsics.checkNotNullParameter(string2, (String)object);
                        String string12 = "defaultAudience";
                        Intrinsics.checkNotNullParameter(var16_40, string12);
                        String string13 = "clientState";
                        Intrinsics.checkNotNullParameter(string8, string13);
                        String string14 = "authType";
                        Intrinsics.checkNotNullParameter(string4, string14);
                        ArrayList arrayList3 = os1_1.b;
                        arrayList2 = new ArrayList<Intent>();
                        iterator = arrayList3.iterator();
                        break block14;
                    }
                    catch (Throwable throwable) {}
                    td0.a(intent, throwable);
                    break block16;
                }
                while (bl4 = iterator.hasNext()) {
                    void var16_41;
                    void var17_45;
                    void var8_30;
                    Object t3 = iterator.next();
                    OS1$e oS1$e = (OS1$e)t3;
                    os1_1 os1_13 = os1_1.a;
                    LA1 lA1 = LA1.FACEBOOK;
                    void var30_62 = var8_30;
                    os1_1 os1_14 = os1_13;
                    boolean bl11 = bl8;
                    object2 = oS1$e;
                    boolean bl12 = bl5;
                    boolean bl13 = bl6;
                    Collection collection = object3;
                    String string15 = string3;
                    string3 = string2;
                    String string16 = string4;
                    void var37_69 = var17_45;
                    void var17_46 = var16_41;
                    void var38_70 = var16_41;
                    void var16_42 = var37_69;
                    Collection collection2 = object3;
                    object3 = string4;
                    String string17 = string5;
                    String string18 = string15;
                    Intent intent2 = os1_13.d((OS1$e)object2, string5, collection, string2, bl7, (dk0_0)var17_46, (String)var37_69, string4, bl3, string15, bl6, lA1, bl5, bl8, (String)var30_62);
                    if (intent2 != null) {
                        arrayList2.add(intent2);
                    }
                    void var8_33 = var30_62;
                    bl8 = bl11;
                    bl5 = bl12;
                    bl6 = bl13;
                    string3 = string15;
                    string4 = string16;
                    void var17_47 = var37_69;
                    void var16_43 = var38_70;
                    object3 = collection2;
                    string5 = string17;
                }
                arrayList = arrayList2;
            }
            arrayList2 = this;
        }
        ((LoginMethodHandler)((Object)arrayList2)).a((String)object, string2);
        Iterator iterator = arrayList.iterator();
        bl3 = false;
        uy12 = null;
        do {
            int n3;
            if ((n3 = iterator.hasNext()) == 0) {
                return 0;
            }
            n3 = 1;
            bl3 += n3;
            intent = (Intent)iterator.next();
            object = dK$c.Login;
            ((dK$c)((Object)object)).toRequestCode();
        } while (!(bl2 = ((NativeAppLoginMethodHandler)((Object)arrayList2)).q(intent)));
        return (int)(bl3 ? 1 : 0);
    }
}

