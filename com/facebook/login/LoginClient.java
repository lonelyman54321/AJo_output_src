/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.AuthenticationToken;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.common.R$string;
import com.facebook.login.KatanaProxyLoginMethodHandler;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.LoginClient$a;
import com.facebook.login.LoginClient$b;
import com.facebook.login.LoginClient$c;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.WebViewLoginMethodHandler;
import com.facebook.login.h;
import com.facebook.login.i;
import com.facebook.login.i$a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class LoginClient
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public LoginMethodHandler[] a;
    public int b;
    public Fragment c;
    public LoginClient$c d;
    public LoginClient$a e;
    public boolean f;
    public LoginClient$Request g;
    public Map h;
    public LinkedHashMap i;
    public i j;
    public int k;
    public int l;

    static {
        LoginClient$b loginClient$b = new Object();
        CREATOR = loginClient$b;
    }

    public final void a(String string2, String string3, boolean bl2) {
        char c2;
        Object object;
        HashMap<String, String> hashMap = this.h;
        if (hashMap == null) {
            hashMap = new HashMap<String, String>();
        }
        if ((object = this.h) == null) {
            this.h = hashMap;
        }
        if ((c2 = hashMap.containsKey(string2)) != '\u0000' && bl2) {
            StringBuilder stringBuilder = new StringBuilder();
            object = (String)hashMap.get(string2);
            stringBuilder.append((String)object);
            c2 = ',';
            stringBuilder.append(c2);
            stringBuilder.append(string3);
            string3 = stringBuilder.toString();
        }
        hashMap.put(string2, string3);
    }

    public final boolean b() {
        int n3 = this.f;
        int n4 = 1;
        if (n3 != 0) {
            return n4 != 0;
        }
        String string2 = "android.permission.INTERNET";
        Intrinsics.checkNotNullParameter(string2, "permission");
        Object object = this.f();
        n3 = object != null ? object.checkCallingOrSelfPermission(string2) : -1;
        if (n3 != 0) {
            object = this.f();
            n4 = 0;
            String string3 = null;
            if (object != null) {
                int n7 = R$string.com_facebook_internet_permission_error_title;
                string2 = object.getString(n7);
            } else {
                boolean bl2 = false;
                string2 = null;
            }
            if (object != null) {
                n4 = R$string.com_facebook_internet_permission_error_message;
                string3 = object.getString(n4);
            }
            LoginClient$Request loginClient$Request = this.g;
            object = new ArrayList();
            if (string2 != null) {
                ((ArrayList)object).add(string2);
            }
            if (string3 != null) {
                ((ArrayList)object).add(string3);
            }
            String string4 = TextUtils.join((CharSequence)": ", object);
            LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.ERROR;
            object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string4, null);
            this.c((LoginClient$Result)object);
            return false;
        }
        this.f = n4;
        return n4 != 0;
    }

    public final void c(LoginClient$Result loginClient$Result) {
        int n3;
        String string2;
        Object object;
        String string3;
        Object object2 = "outcome";
        Intrinsics.checkNotNullParameter(loginClient$Result, object2);
        Object object3 = this.g();
        if (object3 != null) {
            string3 = ((LoginMethodHandler)object3).f();
            HashMap hashMap = ((LoginMethodHandler)object3).a;
            object3 = loginClient$Result.a;
            object = ((LoginClient$Result$a)((Object)object3)).getLoggingValue();
            string2 = loginClient$Result.d;
            String string4 = loginClient$Result.e;
            this.i(string3, (String)object, string2, string4, hashMap);
        }
        if ((object3 = this.h) != null) {
            loginClient$Result.g = object3;
        }
        if ((object3 = this.i) != null) {
            loginClient$Result.h = object3;
        }
        boolean bl2 = false;
        object3 = null;
        this.a = null;
        this.b = n3 = -1;
        this.g = null;
        this.h = null;
        string3 = null;
        this.k = 0;
        this.l = 0;
        object = this.d;
        if (object != null) {
            object = (h)((Be1)object).a;
            string2 = "this$0";
            Intrinsics.checkNotNullParameter(object, string2);
            Intrinsics.checkNotNullParameter(loginClient$Result, object2);
            ((h)object).b = null;
            object2 = loginClient$Result.a;
            object3 = LoginClient$Result$a.CANCEL;
            if (object2 == object3) {
                n3 = 0;
            }
            object2 = new Bundle();
            object3 = "com.facebook.LoginFragment:Result";
            object2.putParcelable((String)object3, (Parcelable)loginClient$Result);
            loginClient$Result = new Intent();
            loginClient$Result.putExtras((Bundle)object2);
            object2 = ((Fragment)object).getActivity();
            bl2 = ((Fragment)object).isAdded();
            if (bl2 && object2 != null) {
                object2.setResult(n3, (Intent)loginClient$Result);
                object2.finish();
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(LoginClient$Result object) {
        Intrinsics.checkNotNullParameter(object, "outcome");
        ArrayList<Object> arrayList = ((LoginClient$Result)object).b;
        if (arrayList != null) {
            arrayList = AccessToken.l;
            boolean bl2 = AccessToken$b.c();
            if (bl2) {
                Exception exception2;
                String string2;
                Object object2;
                block9: {
                    block8: {
                        block7: {
                            Intrinsics.checkNotNullParameter(object, "pendingResult");
                            arrayList = ((LoginClient$Result)object).b;
                            if (arrayList == null) {
                                object = new FacebookException("Can't validate without a token");
                                throw object;
                            }
                            object2 = AccessToken$b.b();
                            string2 = ": ";
                            if (object2 != null) {
                                try {
                                    object2 = ((AccessToken)object2).i;
                                    arrayList = ((AccessToken)((Object)arrayList)).i;
                                    bl2 = Intrinsics.areEqual(object2, arrayList);
                                    if (!bl2) break block7;
                                    LoginClient$Request loginClient$Request = this.g;
                                    AccessToken accessToken = ((LoginClient$Result)object).b;
                                    AuthenticationToken authenticationToken = ((LoginClient$Result)object).c;
                                    LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.SUCCESS;
                                    object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, accessToken, authenticationToken, null, null);
                                    break block8;
                                }
                                catch (Exception exception2) {
                                    break block9;
                                }
                            }
                        }
                        LoginClient$Request loginClient$Request = this.g;
                        object = "User logged in as different Facebook user.";
                        arrayList = new ArrayList<Object>();
                        arrayList.add(object);
                        String string3 = TextUtils.join((CharSequence)string2, arrayList);
                        LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.ERROR;
                        Object var7_12 = null;
                        object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string3, null);
                    }
                    this.c((LoginClient$Result)object);
                    return;
                }
                LoginClient$Request loginClient$Request = this.g;
                Object object3 = exception2.getMessage();
                arrayList = new ArrayList<Object>();
                object2 = "Caught exception";
                arrayList.add(object2);
                if (object3 != null) {
                    arrayList.add(object3);
                }
                String string4 = TextUtils.join((CharSequence)string2, arrayList);
                LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.ERROR;
                Object var7_13 = null;
                object3 = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string4, null);
                this.c((LoginClient$Result)object3);
                return;
            }
        }
        this.c((LoginClient$Result)object);
    }

    public final FragmentActivity f() {
        sD3 sD32 = this.c;
        sD32 = sD32 != null ? sD32.getActivity() : null;
        return sD32;
    }

    public final LoginMethodHandler g() {
        LoginMethodHandler[] loginMethodHandlerArray;
        int n3 = this.b;
        LoginMethodHandler loginMethodHandler = null;
        if (n3 >= 0 && (loginMethodHandlerArray = this.a) != null) {
            loginMethodHandler = loginMethodHandlerArray[n3];
        }
        return loginMethodHandler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final i h() {
        i i3;
        block12: {
            Object object;
            Object object2;
            block11: {
                boolean bl2;
                block10: {
                    i3 = this.j;
                    if (i3 == null) break block11;
                    bl2 = td0.b(i3);
                    object2 = null;
                    if (!bl2) {
                        try {
                            object = i3.a;
                            break block10;
                        }
                        catch (Throwable throwable) {
                            td0.a(i3, throwable);
                        }
                    }
                    bl2 = false;
                    object = null;
                }
                LoginClient$Request loginClient$Request = this.g;
                if (loginClient$Request != null) {
                    object2 = loginClient$Request.d;
                }
                if (bl2 = Intrinsics.areEqual(object, object2)) break block12;
            }
            if ((object = this.f()) == null) {
                object = FacebookSdk.a();
            }
            object2 = this.g;
            if (object2 == null || (object2 = ((LoginClient$Request)object2).d) == null) {
                object2 = FacebookSdk.b();
            }
            this.j = i3 = new i((Context)object, (String)object2);
        }
        return i3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(String object, String object2, String object3, String object4, HashMap object5) {
        Throwable throwable2;
        i i3;
        block11: {
            boolean bl2;
            String string2;
            Object object6;
            block10: {
                object6 = this.g;
                string2 = "fb_mobile_login_method_complete";
                if (object6 == null) {
                    object2 = this.h();
                    ((i)object2).a(string2, (String)object);
                    return;
                }
                i3 = this.h();
                String string3 = ((LoginClient$Request)object6).e;
                boolean bl3 = ((LoginClient$Request)object6).m;
                if (bl3) {
                    string2 = "foa_mobile_login_method_complete";
                }
                if (bl3 = td0.b(i3)) {
                    return;
                }
                try {
                    object6 = com.facebook.login.i.d;
                    object6 = i$a.a(string3);
                    if (object2 == null) break block10;
                    string3 = "2_result";
                    object6.putString(string3, (String)object2);
                }
                catch (Throwable throwable2) {
                    break block11;
                }
            }
            if (object3 != null) {
                object2 = "5_error_message";
                object6.putString((String)object2, (String)object3);
            }
            if (object4 != null) {
                object2 = "4_error_code";
                object6.putString((String)object2, (String)object4);
            }
            if (object5 != null && (bl2 = object5.isEmpty() ^ true)) {
                boolean bl4;
                object2 = new LinkedHashMap();
                object3 = object5.entrySet();
                object3 = object3.iterator();
                while (bl4 = object3.hasNext()) {
                    object4 = object3.next();
                    object4 = (Map.Entry)object4;
                    object5 = object4.getKey();
                    if ((object5 = (String)object5) == null) continue;
                    object5 = object4.getKey();
                    object4 = object4.getValue();
                    ((AbstractMap)object2).put(object5, object4);
                }
                object3 = new JSONObject(object2);
                object2 = "6_extras";
                object3 = object3.toString();
                object6.putString((String)object2, (String)object3);
            }
            object2 = "3_method";
            object6.putString((String)object2, (String)object);
            object = i3.b;
            ((com.facebook.appevents.h)object).a((Bundle)object6, string2);
            return;
        }
        td0.a(i3, throwable2);
    }

    public final void j(int n3, int n4, Intent intent) {
        int n7;
        this.k = n7 = this.k + 1;
        Object object = this.g;
        if (object != null) {
            int n8;
            int n10;
            if (intent != null) {
                n7 = CustomTabMainActivity.c;
                object = "CustomTabMainActivity.no_activity_exception";
                n10 = 0;
                n7 = (int)(intent.getBooleanExtra((String)object, false) ? 1 : 0);
                if (n7 != 0) {
                    this.k();
                    return;
                }
            }
            if ((object = this.g()) != null && ((n10 = object instanceof KatanaProxyLoginMethodHandler) == 0 || intent != null || (n10 = this.k) >= (n8 = this.l))) {
                ((LoginMethodHandler)object).i(n3, n4, intent);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void k() {
        var1_1 = 1;
        var2_2 /* !! */  = this.g();
        if (var2_2 /* !! */  != null) {
            var3_3 = var2_2 /* !! */ .f();
            var4_5 = var2_2 /* !! */ .a;
            var5_6 = 0;
            var6_7 = null;
            var7_8 = "skipped";
            var8_9 = this;
            this.i((String)var3_3, (String)var7_8, null, null, (HashMap)var4_5);
        }
        var2_2 /* !! */  = this.a;
        while (var2_2 /* !! */  != null && (var9_11 = this.b) < (var10_12 = var2_2 /* !! */ .length - var1_1)) {
            this.b = var9_11 += var1_1;
            var8_9 = this.g();
            if (var8_9 == null) continue;
            var10_12 = var8_9 instanceof WebViewLoginMethodHandler;
            var7_8 = null;
            if (var10_12 != 0 && (var10_12 = (int)this.b()) == 0) {
                var8_9 = "no_internet_permission";
                var3_3 = "1";
                this.a((String)var8_9, (String)var3_3, false);
                continue;
            }
            var3_3 = this.g;
            if (var3_3 == null) continue;
            var5_6 = var8_9.l((LoginClient$Request)var3_3);
            this.k = 0;
            var7_8 = "3_method";
            if (var5_6 > 0) {
                var6_7 = this.h();
                var4_5 = var3_3.e;
                var8_9 = var8_9.f();
                var10_12 = (int)var3_3.m;
                var3_3 = var10_12 != 0 ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start";
                var11_13 = td0.b(var6_7);
                if (!var11_13) {
                    var12_14 /* !! */  = com.facebook.login.i.d;
                    var4_5 = i$a.a((String)var4_5);
                    var4_5.putString((String)var7_8, (String)var8_9);
                    var8_9 = var6_7.b;
                    try {
                        var8_9.a((Bundle)var4_5, (String)var3_3);
                    }
                    catch (Throwable var8_10) {
                        td0.a(var6_7, var8_10);
                    }
                }
                this.l = var5_6;
            } else {
                var6_7 = this.h();
                var4_5 = var3_3.e;
                var12_14 /* !! */  = var8_9.f();
                var10_12 = (int)var3_3.m;
                var3_3 = var10_12 != 0 ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried";
                var13_15 = td0.b(var6_7);
                if (!var13_15) {
                    ** try [egrp 4[TRYBLOCK] [5 : 351->354)] { 
lbl58:
                    // 1 sources

                    var4_5 = i$a.a((String)var4_5);
                    var4_5.putString((String)var7_8, (String)var12_14 /* !! */ );
                    var7_8 = var6_7.b;
                    try {
                        var7_8.a((Bundle)var4_5, (String)var3_3);
                    }
lbl67:
                    // 4 sources

                    catch (Throwable var3_4) {
                        td0.a(var6_7, var3_4);
                    }
                }
                var3_3 = "not_tried";
                var8_9 = var8_9.f();
                this.a((String)var3_3, (String)var8_9, (boolean)var1_1);
            }
            if (var5_6 <= 0) continue;
            return;
        }
        var4_5 = this.g;
        if (var4_5 != null) {
            var14_16 = new ArrayList();
            var14_16.add("Login attempt failed.");
            var2_2 /* !! */  = ": ";
            var15_17 = TextUtils.join((CharSequence)var2_2 /* !! */ , var14_16);
            var12_14 /* !! */  = LoginClient$Result$a.ERROR;
            var13_15 = false;
            var6_7 = var14_16;
            var14_16 = new LoginClient$Result((LoginClient$Request)var4_5, var12_14 /* !! */ , null, var15_17, null);
            this.c((LoginClient$Result)var14_16);
        }
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.a;
        parcel.writeParcelableArray(object, n3);
        int n4 = this.b;
        parcel.writeInt(n4);
        object = this.g;
        parcel.writeParcelable((Parcelable)object, n3);
        Map map2 = this.h;
        lz3_0.P(parcel, map2);
        map2 = this.i;
        lz3_0.P(parcel, map2);
    }
}

