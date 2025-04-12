/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import com.facebook.login.InstagramAppLoginMethodHandler$a;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.facebook.login.j;
import com.facebook.login.j$b;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class InstagramAppLoginMethodHandler
extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator CREATOR;
    public final String d;
    public final F1 e;

    static {
        InstagramAppLoginMethodHandler$a instagramAppLoginMethodHandler$a = new Object();
        CREATOR = instagramAppLoginMethodHandler$a;
    }

    public InstagramAppLoginMethodHandler(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "source");
        super((Parcel)object);
        this.d = "instagram_login";
        object = F1.INSTAGRAM_APPLICATION_WEB;
        this.e = object;
    }

    public InstagramAppLoginMethodHandler(LoginClient object) {
        Intrinsics.checkNotNullParameter(object, "loginClient");
        super((LoginClient)object);
        this.d = "instagram_login";
        object = F1.INSTAGRAM_APPLICATION_WEB;
        this.e = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.d;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int l(LoginClient$Request var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        Intrinsics.checkNotNullParameter(var1_1, "request");
        var4_6 /* !! */  = new JSONObject();
        var5_7 = "init";
        var6_8 = System.currentTimeMillis();
        try {
            var4_6 /* !! */ .put((String)var5_7, var6_8);
        }
        catch (JSONException v0) {
            ** continue;
        }
lbl11:
        // 2 sources

        while (true) {
            block25: {
                block24: {
                    var4_6 /* !! */  = var4_6 /* !! */ .toString();
                    Intrinsics.checkNotNullExpressionValue(var4_6 /* !! */ , "e2e.toString()");
                    var5_7 = this.e().f();
                    if (var5_7 == null) {
                        var5_7 = FacebookSdk.a();
                    }
                    var8_9 = var3_3.d;
                    var9_10 /* !! */  = var3_3.b;
                    var10_11 /* !! */  = var9_10 /* !! */ ;
                    var10_11 /* !! */  = (Collection)var9_10 /* !! */ ;
                    var9_10 /* !! */  = var9_10 /* !! */ .iterator();
                    while (var11_12 = var9_10 /* !! */ .hasNext()) {
                        var12_13 = (String)var9_10 /* !! */ .next();
                        var13_14 = j.j;
                        var11_12 = j$b.b(var12_13);
                        if (!var11_12) continue;
                        var14_15 = true;
                        break block24;
                    }
                    var9_10 /* !! */  = null;
                    var14_15 = false;
                }
                var9_10 /* !! */  = var3_3.c;
                if (var9_10 /* !! */  == null) {
                    var9_10 /* !! */  = dk0_0.NONE;
                }
                var15_16 = var9_10 /* !! */ ;
                var9_10 /* !! */  = var3_3.e;
                var16_17 = var2_2.c((String)var9_10 /* !! */ );
                var17_18 = var3_3.h;
                var9_10 /* !! */  = var3_3.j;
                var11_12 = var3_3.k;
                var18_19 = var3_3.m;
                var19_20 = var3_3.n;
                var13_14 = os1_1.a;
                var20_21 /* !! */  = os1_1.class;
                var21_22 = td0.b(var20_21 /* !! */ );
                var22_23 = "e2e";
                var23_24 = null;
                if (var21_22) {
                    var5_7 = var22_23;
                    var19_20 = false;
                    var3_3 = null;
                } else {
                    block26: {
                        var13_14 = "context";
                        Intrinsics.checkNotNullParameter(var5_7, (String)var13_14);
                        var13_14 = "applicationId";
                        Intrinsics.checkNotNullParameter(var8_9, (String)var13_14);
                        var13_14 = "permissions";
                        Intrinsics.checkNotNullParameter(var10_11 /* !! */ , (String)var13_14);
                        Intrinsics.checkNotNullParameter(var4_6 /* !! */ , (String)var22_23);
                        var13_14 = "defaultAudience";
                        Intrinsics.checkNotNullParameter(var15_16, (String)var13_14);
                        var13_14 = "clientState";
                        Intrinsics.checkNotNullParameter(var16_17, (String)var13_14);
                        var13_14 = "authType";
                        Intrinsics.checkNotNullParameter(var17_18, (String)var13_14);
                        var24_25 /* !! */  = new OS1$e();
                        var13_14 = os1_1.a;
                        var25_26 = LA1.INSTAGRAM;
                        var26_27 = "";
                        var27_28 = var22_23;
                        var22_23 = var24_25 /* !! */ ;
                        var28_29 = var20_21 /* !! */ ;
                        var20_21 /* !! */  = var4_6 /* !! */ ;
                        var29_30 = var18_19;
                        var18_19 = false;
                        var24_25 /* !! */  = var9_10 /* !! */ ;
                        var3_3 = var13_14.d((OS1$e)var22_23, var8_9, var10_11 /* !! */ , (String)var4_6 /* !! */ , var14_15, (dk0_0)var15_16, var16_17, var17_18, false, (String)var9_10 /* !! */ , var11_12, var25_26, var29_30, var19_20, var26_27);
                        try {
                            var23_24 = os1_1.s((Context)var5_7, (Intent)var3_3);
                        }
                        catch (Throwable var3_4) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var5_7 = var28_29;
                                break block26;
                                break;
                            }
                        }
lbl90:
                        // 2 sources

                        while (true) {
                            var3_3 = var23_24;
                            var5_7 = var27_28;
                            break block25;
                            break;
                        }
                        catch (Throwable var3_5) {
                            var27_28 = var22_23;
                            var28_29 = var20_21 /* !! */ ;
                            ** continue;
                        }
                    }
                    td0.a(var28_29, (Throwable)var3_3);
                    ** continue;
                }
            }
            var2_2.a((String)var5_7, (String)var4_6 /* !! */ );
            dK$c.Login.toRequestCode();
            return (int)var2_2.q((Intent)var3_3);
        }
    }

    public final F1 n() {
        return this.e;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        super.writeToParcel(parcel, n3);
    }
}

