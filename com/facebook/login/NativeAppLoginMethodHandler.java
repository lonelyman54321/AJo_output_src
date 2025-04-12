/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.text.TextUtils
 */
package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.CustomTabLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.login.LoginClient$Result$a;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.LoginMethodHandler$a;
import com.facebook.login.h;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class NativeAppLoginMethodHandler
extends LoginMethodHandler {
    public final F1 c;

    public NativeAppLoginMethodHandler(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "source");
        super((Parcel)object);
        object = F1.FACEBOOK_APPLICATION_WEB;
        this.c = object;
    }

    public NativeAppLoginMethodHandler(LoginClient object) {
        Intrinsics.checkNotNullParameter(object, "loginClient");
        super((LoginClient)object);
        object = F1.FACEBOOK_APPLICATION_WEB;
        this.c = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean i(int var1_1, int var2_2, Intent var3_3) {
        var4_4 = this.e();
        var5_5 = var4_4.g;
        var1_1 = 1;
        if (var3_3 == null) {
            var7_10 = LoginClient$Result$a.CANCEL;
            var8_12 = null;
            var9_14 = "Operation canceled";
            var10_16 = false;
            var11_20 = null;
            var12_22 = var6_6;
            var6_6 = new LoginClient$Result(var5_5, var7_10, null, var9_14, null);
            this.m(var6_6);
        } else {
            var12_23 = "error_description";
            var7_11 /* !! */  = "error_message";
            var11_21 = "error_type";
            var9_15 = "error";
            var8_13 = null;
            var13_24 = "error_code";
            var14_25 = ": ";
            if (var2_2 == 0) {
                Intrinsics.checkNotNullParameter(var3_3, "data");
                var6_7 = var3_3.getExtras();
                if (var6_7 != null && (var3_3 = var6_7.getString(var9_15)) != null) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var9_15 = var3_3;
                        break;
                    }
                } else {
                    if (var6_7 != null) {
                        var3_3 = var6_7.getString((String)var11_21);
                        ** continue;
                    }
                    var9_15 = null;
                }
                if (var6_7 != null && (var3_3 = var6_7.get(var13_24)) != null) {
                    var3_3 = var3_3.toString();
                } else {
                    var15_26 = false;
                    var3_3 = null;
                }
                var10_17 = q03.a;
                var11_21 = "CONNECTION_FAILURE";
                var10_17 = (int)Intrinsics.areEqual(var11_21, var3_3);
                if (var10_17 != 0) {
                    if (var6_7 != null && (var7_11 /* !! */  = var6_7.getString(var7_11 /* !! */ )) != null) {
                        var8_13 = var7_11 /* !! */ ;
                    } else if (var6_7 != null) {
                        var8_13 = var6_7.getString((String)var12_23);
                    }
                    var6_7 = new ArrayList();
                    if (var9_15 != null) {
                        var6_7.add(var9_15);
                    }
                    if (var8_13 != null) {
                        var6_7.add(var8_13);
                    }
                    var9_15 = TextUtils.join((CharSequence)var14_25, (Iterable)var6_7);
                    var7_11 /* !! */  = LoginClient$Result$a.ERROR;
                    var10_17 = 0;
                    var11_21 = null;
                    var12_23 = var6_7;
                    var8_13 = var3_3;
                    var6_7 = new LoginClient$Result(var5_5, (LoginClient$Result$a)var7_11 /* !! */ , null, var9_15, (String)var3_3);
                    this.m((LoginClient$Result)var6_7);
                } else {
                    var7_11 /* !! */  = LoginClient$Result$a.CANCEL;
                    var10_17 = 0;
                    var11_21 = null;
                    var8_13 = null;
                    var12_23 = var6_7;
                    var6_7 = new LoginClient$Result(var5_5, (LoginClient$Result$a)var7_11 /* !! */ , null, var9_15, null);
                    this.m((LoginClient$Result)var6_7);
                }
            } else {
                var16_28 = -1;
                if (var2_2 != var16_28) {
                    var6_8 = new ArrayList();
                    var3_3 = "Unexpected resultCode from authorization.";
                    var6_8.add(var3_3);
                    var9_15 = TextUtils.join((CharSequence)var14_25, var6_8);
                    var7_11 /* !! */  = LoginClient$Result$a.ERROR;
                    var10_18 = false;
                    var11_21 = null;
                    var8_13 = null;
                    var12_23 = var6_8;
                    var6_8 = new LoginClient$Result(var5_5, (LoginClient$Result$a)var7_11 /* !! */ , null, var9_15, null);
                    this.m((LoginClient$Result)var6_8);
                } else {
                    var6_9 = var3_3.getExtras();
                    if (var6_9 == null) {
                        var6_9 = new ArrayList();
                        var6_9.add("Unexpected null from returned authorization data.");
                        var9_15 = TextUtils.join((CharSequence)var14_25, (Iterable)var6_9);
                        var7_11 /* !! */  = LoginClient$Result$a.ERROR;
                        var12_23 = var6_9;
                        var6_9 = new LoginClient$Result(var5_5, (LoginClient$Result$a)var7_11 /* !! */ , null, var9_15, null);
                        this.m((LoginClient$Result)var6_9);
                        return (boolean)var1_1;
                    }
                    var3_3 = var6_9.getString(var9_15);
                    if (var3_3 == null) {
                        var3_3 = var6_9.getString((String)var11_21);
                    }
                    if ((var11_21 = var6_9.get(var13_24)) != null) {
                        var8_13 = var11_21.toString();
                    }
                    if ((var7_11 /* !! */  = var6_9.getString(var7_11 /* !! */ )) == null) {
                        var7_11 /* !! */  = var6_9.getString((String)var12_23);
                    }
                    if (!(var10_19 = lz3_0.A((String)(var12_23 = var6_9.getString("e2e"))))) {
                        this.h((String)var12_23);
                    }
                    if (var3_3 == null && var8_13 == null && var7_11 /* !! */  == null && var5_5 != null) {
                        var3_3 = "code";
                        var17_29 = var6_9.containsKey((String)var3_3);
                        if (var17_29 && !(var15_27 = lz3_0.A((String)(var3_3 = var6_9.getString((String)var3_3))))) {
                            var3_3 = FacebookSdk.d();
                            var12_23 = new ms1_1(this, var5_5, (Bundle)var6_9);
                            var3_3.execute((Runnable)var12_23);
                        } else {
                            this.p(var5_5, (Bundle)var6_9);
                        }
                    } else {
                        this.o(var5_5, (String)var3_3, var7_11 /* !! */ , (String)var8_13);
                    }
                }
            }
        }
        return (boolean)var1_1;
    }

    public final void m(LoginClient$Result object) {
        if (object != null) {
            LoginClient loginClient = this.e();
            loginClient.e((LoginClient$Result)object);
        } else {
            object = this.e();
            ((LoginClient)object).k();
        }
    }

    public F1 n() {
        return this.c;
    }

    public final void o(LoginClient$Request loginClient$Request, String object, String string2, String string3) {
        Object object2;
        int n3;
        boolean bl2 = false;
        ArrayList<Object> arrayList = null;
        if (object != null && (n3 = (int)(Intrinsics.areEqual(object, object2 = "logged_out") ? 1 : 0)) != 0) {
            boolean bl3;
            CustomTabLoginMethodHandler.i = bl3 = true;
            this.m(null);
        } else {
            n3 = q03.a;
            Object object3 = "AndroidAuthKillSwitchException";
            object2 = xx_2.i("service_disabled", object3);
            n3 = (int)(CollectionsKt.F((Iterable)object2, object) ? 1 : 0);
            if (n3 != 0) {
                this.m(null);
            } else {
                object2 = "OAuthAccessDeniedException";
                arrayList = (ArrayList<Object>)xx_2.i("access_denied", object2);
                bl2 = CollectionsKt.F(arrayList, object);
                if (bl2) {
                    LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.CANCEL;
                    Object var12_13 = null;
                    object2 = object;
                    object3 = loginClient$Request;
                    object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, null, null);
                    this.m((LoginClient$Result)object);
                } else {
                    arrayList = new ArrayList<Object>();
                    if (object != null) {
                        arrayList.add(object);
                    }
                    if (string2 != null) {
                        arrayList.add(string2);
                    }
                    String string4 = TextUtils.join((CharSequence)": ", arrayList);
                    LoginClient$Result$a loginClient$Result$a = LoginClient$Result$a.ERROR;
                    object2 = object;
                    object3 = loginClient$Request;
                    object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, string4, string3);
                    this.m((LoginClient$Result)object);
                }
            }
        }
    }

    public final void p(LoginClient$Request loginClient$Request, Bundle object) {
        Intrinsics.checkNotNullParameter(loginClient$Request, "request");
        Object object2 = "extras";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = loginClient$Request.b;
        object2 = (Collection)object2;
        F1 f1 = this.n();
        Object object3 = loginClient$Request.d;
        AccessToken accessToken = LoginMethodHandler$a.b(object2, object, f1, (String)object3);
        object2 = loginClient$Request.o;
        AuthenticationToken authenticationToken = LoginMethodHandler$a.c(object, (String)object2);
        Object object4 = LoginClient$Result$a.SUCCESS;
        LoginClient$Result$a loginClient$Result$a = object;
        object = new LoginClient$Result(loginClient$Request, (LoginClient$Result$a)((Object)object4), accessToken, authenticationToken, null, null);
        try {
            this.m((LoginClient$Result)object);
        }
        catch (FacebookException facebookException) {
            object = facebookException.getMessage();
            object2 = new ArrayList();
            if (object != null) {
                ((ArrayList)object2).add(object);
            }
            object4 = TextUtils.join((CharSequence)": ", object2);
            loginClient$Result$a = LoginClient$Result$a.ERROR;
            accessToken = null;
            f1 = object;
            object3 = loginClient$Request;
            object = new LoginClient$Result(loginClient$Request, loginClient$Result$a, null, (String)object4, null);
            this.m((LoginClient$Result)object);
        }
    }

    public final boolean q(Intent intent) {
        if (intent != null) {
            Object object = FacebookSdk.a().getPackageManager().queryIntentActivities(intent, 65536);
            String string2 = "getApplicationContext()\n\u2026nager.MATCH_DEFAULT_ONLY)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (Collection)object;
            boolean bl2 = object.isEmpty();
            boolean bl3 = true;
            if (bl2 ^= bl3) {
                object = this.e().c;
                boolean bl4 = object instanceof h;
                Unit unit = null;
                if (bl4) {
                    object = (h)object;
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    object = ((h)object).d;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("launcher");
                        bl2 = false;
                        object = null;
                    }
                    if (object != null) {
                        ((I3)object).a(intent);
                        unit = Unit.a;
                    }
                }
                if (unit == null) {
                    return false;
                }
                return bl3;
            }
        }
        return false;
    }
}

