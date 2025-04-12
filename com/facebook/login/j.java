/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.AuthenticationToken;
import com.facebook.AuthenticationToken$b;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.h;
import com.facebook.g;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.i;
import com.facebook.login.i$a;
import com.facebook.login.j$a;
import com.facebook.login.j$b;
import com.facebook.login.j$d;
import com.facebook.login.j$e;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public class j {
    public static final j$b j;
    public static final Set k;
    public static volatile j l;
    public uy1 a;
    public dk0_0 b;
    public final SharedPreferences c;
    public String d;
    public String e;
    public boolean f;
    public LA1 g;
    public boolean h;
    public boolean i;

    static {
        j$b j$b;
        j = j$b = new Object();
        k = p03_0.f("ads_management", "create_event", "rsvp_event");
        Intrinsics.checkNotNullExpressionValue(j.class.toString(), "LoginManager::class.java.toString()");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public j() {
        Object object = uy1.NATIVE_WITH_FALLBACK;
        this.a = object;
        object = dk0_0.FRIENDS;
        this.b = object;
        this.d = "rerequest";
        object = LA1.FACEBOOK;
        this.g = object;
        Xz3.h();
        object = FacebookSdk.a();
        Object object2 = null;
        object = object.getSharedPreferences("com.facebook.loginManager", 0);
        String string2 = "getApplicationContext().\u2026ER, Context.MODE_PRIVATE)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.c = object;
        boolean bl2 = FacebookSdk.o;
        if (!bl2) return;
        object = tf0_1.a();
        if (object == null) return;
        object = new ag0();
        string2 = FacebookSdk.a();
        object2 = "com.android.chrome";
        Wf0.a((Context)string2, (String)object2, (ag0)object);
        object = FacebookSdk.a();
        string2 = FacebookSdk.a().getPackageName();
        if (string2 == null) {
            return;
        }
        object = object.getApplicationContext();
        object2 = new Vf0((Context)object);
        try {
            Wf0.a((Context)object, string2, (ag0)object2);
            return;
        }
        catch (SecurityException securityException) {
            return;
        }
    }

    public static Intent b(LoginClient$Request loginClient$Request) {
        String string2 = "request";
        Intrinsics.checkNotNullParameter(loginClient$Request, string2);
        Intent intent = new Intent();
        Object object = FacebookSdk.a();
        intent.setClass(object, FacebookActivity.class);
        object = ((Object)((Object)loginClient$Request.a)).toString();
        intent.setAction((String)object);
        object = new Bundle();
        object.putParcelable(string2, (Parcelable)loginClient$Request);
        intent.putExtra("com.facebook.LoginFragment:Request", (Bundle)object);
        return intent;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(Context object, LoginClient$Result$a object2, Map object3, FacebookException object4, boolean bl2, LoginClient$Request object5) {
        Throwable throwable322222;
        String string2;
        block24: {
            boolean bl3;
            String string3;
            Object object6 = j$e.a;
            if ((object = ((j$e)object6).a((Context)object)) == null) {
                return;
            }
            object6 = "fb_mobile_login_complete";
            if (object5 == null) {
                object2 = com.facebook.login.i.d;
                object2 = i.class;
                boolean bl4 = td0.b(object2);
                if (bl4) {
                    return;
                }
                object3 = "";
                try {
                    ((i)object).a((String)object6, (String)object3);
                    return;
                }
                catch (Throwable throwable2) {
                    td0.a(object2, throwable2);
                    return;
                }
            }
            Object object7 = new HashMap();
            string2 = bl2 ? "1" : "0";
            String string4 = "try_login_activity";
            ((HashMap)object7).put(string4, string2);
            string2 = ((LoginClient$Request)object5).e;
            boolean bl5 = ((LoginClient$Request)object5).m;
            if (bl5) {
                object6 = "foa_mobile_login_complete";
            }
            if (bl5 = td0.b(object)) {
                return;
            }
            object5 = "loggingExtras";
            Intrinsics.checkNotNullParameter(object7, (String)object5);
            object5 = com.facebook.login.i.d;
            object5 = i$a.a(string2);
            if (object2 != null) {
                string4 = "2_result";
                string3 = ((LoginClient$Result$a)((Object)object2)).getLoggingValue();
                object5.putString(string4, string3);
            }
            string4 = null;
            string3 = object4 != null ? ((Throwable)object4).getMessage() : null;
            if (string3 != null) {
                string3 = "5_error_message";
                object4 = ((Throwable)object4).getMessage();
                object5.putString(string3, (String)object4);
            }
            if (bl3 = ((HashMap)object7).isEmpty() ^ true) {
                string4 = new JSONObject(object7);
            }
            if (object3 != null) {
                if (string4 == null) {
                    string4 = new JSONObject();
                }
                try {
                    object3 = object3.entrySet();
                    object3 = object3.iterator();
                    while (bl3 = object3.hasNext()) {
                        object4 = object3.next();
                        object4 = (Map.Entry)object4;
                        object7 = object4.getKey();
                        object7 = (String)object7;
                        object4 = object4.getValue();
                        object4 = (String)object4;
                        if (object7 == null) continue;
                        string4.put((String)object7, object4);
                    }
                }
                catch (JSONException jSONException) {}
            }
            if (string4 != null) {
                object3 = "6_extras";
                object4 = string4.toString();
                object5.putString((String)object3, (String)object4);
            }
            object3 = ((i)object).b;
            ((h)object3).a((Bundle)object5, (String)object6);
            object3 = LoginClient$Result$a.SUCCESS;
            if (object2 != object3) return;
            {
                catch (Throwable throwable322222) {}
            }
            boolean bl6 = td0.b(object);
            if (!bl6) break block24;
            return;
        }
        try {
            object2 = i$a.a(string2);
            object3 = new mz1((i)object, (Bundle)object2);
            object2 = com.facebook.login.i.d;
            object4 = TimeUnit.SECONDS;
            long l2 = 5;
            object2.schedule((Runnable)object3, l2, (TimeUnit)((Object)object4));
            return;
        }
        catch (Throwable throwable4) {
            td0.a(object, throwable4);
            return;
        }
        td0.a(object, throwable322222);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static void g(Context var0, LoginClient$Request var1_1) {
        block7: {
            block6: {
                block8: {
                    var2_3 = j$e.a;
                    if ((var0 /* !! */  = var2_3.a(var0 /* !! */ )) == null) break block7;
                    var3_4 = var1_1.m;
                    var2_3 = var3_4 != false ? "foa_mobile_login_start" : "fb_mobile_login_start";
                    var4_5 = td0.b(var0 /* !! */ );
                    if (var4_5) break block7;
                    var5_6 = "pendingLoginRequest";
                    Intrinsics.checkNotNullParameter(var1_1, (String)var5_6);
                    var5_6 = com.facebook.login.i.d;
                    var5_6 = var1_1.e;
                    var5_6 = i$a.a((String)var5_6);
                    var6_7 /* !! */  = new JSONObject();
                    var7_8 = "login_behavior";
                    var8_9 = var1_1.a;
                    var8_9 = var8_9.toString();
                    var6_7 /* !! */ .put(var7_8, var8_9);
                    var7_8 = "request_code";
                    var8_9 = dK$c.Login;
                    var9_10 = var8_9.toRequestCode();
                    var6_7 /* !! */ .put(var7_8, (int)var9_10);
                    var7_8 = "permissions";
                    var8_9 = ",";
                    var10_11 /* !! */  = var1_1.b;
                    var10_11 /* !! */  = var10_11 /* !! */ ;
                    var8_9 = TextUtils.join((CharSequence)var8_9, (Iterable)var10_11 /* !! */ );
                    var6_7 /* !! */ .put(var7_8, var8_9);
                    var7_8 = "default_audience";
                    var8_9 = var1_1.c;
                    var8_9 = var8_9.toString();
                    var6_7 /* !! */ .put(var7_8, var8_9);
                    var7_8 = "isReauthorize";
                    var9_10 = var1_1.f;
                    var6_7 /* !! */ .put(var7_8, var9_10);
                    var7_8 = var0 /* !! */ .c;
                    if (var7_8 == null) break block8;
                    var8_9 = "facebookVersion";
                    var6_7 /* !! */ .put((String)var8_9, (Object)var7_8);
                    break block8;
                    catch (Throwable var1_2) {
                        break block6;
                    }
                }
                if ((var1_1 = var1_1.l) != null) {
                    var7_8 = "target_app";
                    var1_1 = var1_1.toString();
                    var6_7 /* !! */ .put(var7_8, var1_1);
                }
                var1_1 = "6_extras";
                var6_7 /* !! */  = var6_7 /* !! */ .toString();
                var5_6.putString((String)var1_1, (String)var6_7 /* !! */ );
lbl58:
                // 2 sources

                while (true) {
                    var1_1 = var0 /* !! */ .b;
                    var1_1.a((Bundle)var5_6, (String)var2_3);
                    break block7;
                    break;
                }
            }
            td0.a(var0 /* !! */ , var1_2);
        }
        return;
        {
            catch (JSONException v0) {
                ** continue;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final LoginClient$Request a(yy1 object) {
        boolean bl2;
        Object object2 = ((yy1)object).c;
        Intrinsics.checkNotNullParameter(object, "loginConfig");
        jw_1 jw_12 = jw_1.S256;
        try {
            object2 = lj2_1.a((String)object2, jw_12);
        }
        catch (FacebookException facebookException) {
            jw_12 = jw_1.PLAIN;
        }
        String string2 = object2;
        jw_1 jw_13 = jw_12;
        uy1 uy12 = this.a;
        Set set = CollectionsKt.o0(((yy1)object).a);
        dk0_0 dk0_02 = this.b;
        String string3 = this.d;
        String string4 = FacebookSdk.b();
        String string5 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string5, "randomUUID().toString()");
        LA1 lA1 = this.g;
        String string6 = ((yy1)object).b;
        String string7 = ((yy1)object).c;
        object2 = new LoginClient$Request(uy12, set, dk0_02, string3, string4, string5, lA1, string6, string7, string2, jw_13);
        object = AccessToken.l;
        ((LoginClient$Request)object2).f = bl2 = AccessToken$b.c();
        ((LoginClient$Request)object2).j = object = this.e;
        ((LoginClient$Request)object2).k = bl2 = this.f;
        ((LoginClient$Request)object2).m = bl2 = this.h;
        ((LoginClient$Request)object2).n = bl2 = this.i;
        return object2;
    }

    public final void d(mw0_0 mw0_02, Collection object, String object2) {
        Intrinsics.checkNotNullParameter(mw0_02, "fragment");
        Object object3 = new yy1((Collection)object);
        object = this.a((yy1)object3);
        if (object2 != null) {
            object3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            ((LoginClient$Request)object).e = object2;
        }
        object2 = new j$d(mw0_02);
        this.j((rb3_2)object2, (LoginClient$Request)object);
    }

    public final void e(Activity object, Collection object2) {
        Object object3;
        Object object4 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        if (object2 != null) {
            boolean bl2;
            object3 = object2.iterator();
            while (bl2 = object3.hasNext()) {
                String string2 = (String)object3.next();
                boolean bl3 = j$b.b(string2);
                if (!bl3) continue;
                object2 = cP.a("Cannot pass a publish or manage permission (", string2, ") to a request for read authorization");
                object = new FacebookException((String)object2);
                throw object;
            }
        }
        object3 = new yy1((Collection)object2);
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object3, "loginConfig");
        boolean cfr_ignored_0 = object instanceof O3;
        object2 = this.a((yy1)object3);
        object4 = new j$a((Activity)object);
        this.j((rb3_2)object4, (LoginClient$Request)object2);
    }

    public final void f() {
        Date date = AccessToken.l;
        AccessToken$b.d(null);
        AuthenticationToken$b.a(null);
        com.facebook.g.d.a().a(null, true);
        date = this.c.edit();
        date.putBoolean("express_login_allowed", false);
        date.apply();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void h(int var1_1, Intent var2_2, pi0_1 var3_3) {
        block24: {
            block23: {
                var4_4 /* !! */  = LoginClient$Result$a.ERROR;
                var5_5 = true;
                var6_6 = null;
                var7_7 = null;
                if (var2_2 == null) break block23;
                var8_8 /* !! */  = LoginClient$Result.class.getClassLoader();
                var2_2.setExtrasClassLoader(var8_8 /* !! */ );
                var8_8 /* !! */  = "com.facebook.LoginFragment:Result";
                var2_2 = (LoginClient$Result)var2_2.getParcelableExtra((String)var8_8 /* !! */ );
                if (var2_2 == null) ** GOTO lbl-1000
                var9_9 = -1;
                var8_8 /* !! */  = var2_2.a;
                if (var1_1 != var9_9) {
                    if (var1_1 != 0) {
                        var1_1 = 0;
                        var10_12 /* !! */  = null;
                        var9_9 = 0;
                        var4_4 /* !! */  = null;
lbl19:
                        // 2 sources

                        while (true) {
                            var7_7 = null;
                            var11_13 = false;
                            var12_16 /* !! */  = null;
                            break;
                        }
                    } else {
                        var1_1 = 0;
                        var10_12 /* !! */  = null;
                        var9_9 = 0;
                        var4_4 /* !! */  = null;
                        var7_7 = null;
                        var11_13 = true;
                    }
                } else {
                    var10_12 /* !! */  = LoginClient$Result$a.SUCCESS;
                    if (var8_8 /* !! */  == var10_12 /* !! */ ) {
                        var10_12 /* !! */  = var2_2.b;
                        var7_7 = var2_2.c;
                        var11_13 = false;
                        var12_16 /* !! */  = null;
                        var4_4 /* !! */  = var10_12 /* !! */ ;
                        var1_1 = 0;
                        var10_12 /* !! */  = null;
                    } else {
                        var4_4 /* !! */  = var2_2.d;
                        var10_12 /* !! */  = new FacebookException((String)var4_4 /* !! */ );
                        var9_9 = 0;
                        var4_4 /* !! */  = null;
                        ** continue;
                    }
                }
                var13_17 /* !! */  = var2_2.g;
                var2_2 = var2_2.f;
                var14_18 = var7_7;
                var15_19 = var11_13;
                var12_16 /* !! */  = var13_17 /* !! */ ;
                break block24;
            }
            if (var1_1 == 0) {
                var8_8 /* !! */  = LoginClient$Result$a.CANCEL;
                var1_1 = 0;
                var10_12 /* !! */  = null;
                var16_20 = false;
                var2_2 = null;
                var9_10 = false;
                var4_4 /* !! */  = null;
                var11_14 = false;
                var12_16 /* !! */  = null;
                var14_18 = null;
                var15_19 = true;
            } else lbl-1000:
            // 2 sources

            {
                var8_8 /* !! */  = var4_4 /* !! */ ;
                var1_1 = 0;
                var10_12 /* !! */  = null;
                var16_20 = false;
                var2_2 = null;
                var9_11 = false;
                var4_4 /* !! */  = null;
                var11_15 = false;
                var12_16 /* !! */  = null;
                var14_18 = null;
                var15_19 = false;
            }
        }
        if (var10_12 /* !! */  == null && var4_4 /* !! */  == null && !var15_19) {
            var7_7 = "Unexpected call to LoginManager.onActivityResult";
            var10_12 /* !! */  = new FacebookException((String)var7_7);
        }
        var17_21 = true;
        var7_7 = null;
        var13_17 /* !! */  = var10_12 /* !! */ ;
        com.facebook.login.j.c(null, (LoginClient$Result$a)var8_8 /* !! */ , var12_16 /* !! */ , (FacebookException)var10_12 /* !! */ , var17_21, (LoginClient$Request)var2_2);
        if (var4_4 /* !! */  != null) {
            var7_7 = AccessToken.l;
            AccessToken$b.d((AccessToken)var4_4 /* !! */ );
            var7_7 = AccessToken$b.b();
            if (var7_7 != null) {
                var18_22 = AccessToken$b.c();
                if (!var18_22) {
                    var7_7 = com.facebook.g.d.a();
                    var7_7.a(null, var5_5);
                } else {
                    var8_8 /* !! */  = new Object();
                    var7_7 = var7_7.e;
                    lz3_0.q((lz3$a)var8_8 /* !! */ , (String)var7_7);
                }
            }
        }
        if (var14_18 != null) {
            AuthenticationToken$b.a(var14_18);
        }
        if (var3_3 != null) {
            if (var4_4 /* !! */  != null && var2_2 != null) {
                Intrinsics.checkNotNullParameter(var2_2, "request");
                Intrinsics.checkNotNullParameter((Object)var4_4 /* !! */ , "newToken");
                var6_6 = var2_2.b;
                var7_7 = CollectionsKt.n0(CollectionsKt.J(var4_4 /* !! */ .b));
                var16_20 = var2_2.f;
                if (var16_20) {
                    var2_2 = var6_6;
                    var2_2 = (Collection)var6_6;
                    var7_7.retainAll((Collection<?>)var2_2);
                }
                var2_2 = CollectionsKt.n0(CollectionsKt.J((Iterable)var6_6));
                var2_2.removeAll((Collection<?>)var7_7);
                var6_6 = new tA1((AccessToken)var4_4 /* !! */ , (AuthenticationToken)var14_18, (LinkedHashSet)var7_7, (LinkedHashSet)var2_2);
            }
            if (!(var15_19 || var6_6 != null && (var16_20 = (var2_2 = var6_6.c).isEmpty()))) {
                if (var10_12 /* !! */  != null) {
                    var3_3.a((FacebookException)var10_12 /* !! */ );
                } else if (var4_4 /* !! */  != null && var6_6 != null) {
                    var10_12 /* !! */  = this.c.edit();
                    var2_2 = "express_login_allowed";
                    var10_12 /* !! */ .putBoolean((String)var2_2, var5_5);
                    var10_12 /* !! */ .apply();
                    var3_3.onSuccess(var6_6);
                }
            } else {
                var3_3.onCancel();
            }
        }
    }

    public final void i(bk_1 object, pi0_1 object2) {
        int n3 = object instanceof dk_1;
        if (n3 != 0) {
            object = (dk_1)object;
            n3 = dK$c.Login.toRequestCode();
            nz1 nz12 = new nz1(this, (pi0_1)object2);
            object.getClass();
            Intrinsics.checkNotNullParameter(nz12, "callback");
            object2 = n3;
            ((dk_1)object).a.put(object2, nz12);
            return;
        }
        object = new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
        throw object;
    }

    public final void j(rb3_2 rb3_22, LoginClient$Request loginClient$Request) {
        com.facebook.login.j.g((Context)rb3_22.q(), loginClient$Request);
        Object object = dk_1.b;
        dK$c dK$c = dK$c.Login;
        int n3 = dK$c.toRequestCode();
        Object object2 = new oz1(this);
        ((dK$b)object).a(n3, (dk$a_0)object2);
        object = com.facebook.login.j.b(loginClient$Request);
        PackageManager packageManager = FacebookSdk.a().getPackageManager();
        object2 = null;
        packageManager = packageManager.resolveActivity((Intent)object, 0);
        if (packageManager != null) {
            int n4;
            try {
                n4 = dK$c.toRequestCode();
            }
            catch (ActivityNotFoundException activityNotFoundException) {}
            rb3_22.startActivityForResult((Intent)object, n4);
            return;
        }
        object = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        packageManager = rb3_22.q();
        object2 = LoginClient$Result$a.ERROR;
        com.facebook.login.j.c((Context)packageManager, (LoginClient$Result$a)((Object)object2), null, (FacebookException)object, false, loginClient$Request);
        throw object;
    }
}

