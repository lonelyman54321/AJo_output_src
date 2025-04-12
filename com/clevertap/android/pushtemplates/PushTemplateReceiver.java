/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.app.RemoteInput
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.Html
 *  android.text.format.DateUtils
 *  android.widget.RemoteViews
 */
package com.clevertap.android.pushtemplates;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.clevertap.android.pushtemplates.PushTemplateReceiver$a;
import com.clevertap.android.pushtemplates.R$drawable;
import com.clevertap.android.pushtemplates.R$id;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import com.clevertap.android.sdk.task.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class PushTemplateReceiver
extends BroadcastReceiver {
    public String A;
    public String B;
    public CleverTapInstanceConfig C;
    public final boolean a;
    public com.clevertap.android.sdk.a b;
    public RemoteViews c;
    public RemoteViews d;
    public RemoteViews e;
    public RemoteViews f;
    public String g;
    public vj3_2 h;
    public String i;
    public String j;
    public String k;
    public String l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public int r;
    public boolean s;
    public NotificationManager t;
    public String u;
    public String v;
    public String w;
    public String x;
    public String y;
    public boolean z;

    public PushTemplateReceiver() {
        ArrayList arrayList;
        this.a = true;
        this.m = arrayList = new ArrayList();
        this.n = arrayList = new ArrayList();
        this.o = arrayList = new ArrayList();
        this.p = arrayList = new ArrayList();
        this.q = arrayList = new ArrayList();
        this.r = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void a(Context var0, Intent var1_1, Bundle var2_2, PushTemplateReceiver var3_3) {
        block196: {
            block206: {
                block211: {
                    block210: {
                        block209: {
                            block208: {
                                block207: {
                                    block204: {
                                        block205: {
                                            block202: {
                                                block203: {
                                                    block200: {
                                                        block201: {
                                                            block198: {
                                                                block199: {
                                                                    block197: {
                                                                        block195: {
                                                                            block194: {
                                                                                block193: {
                                                                                    var4_4 = var0;
                                                                                    var5_5 = var1_1;
                                                                                    var6_6 /* !! */  = var2_2;
                                                                                    var7_7 = var3_3;
                                                                                    var8_8 = true;
                                                                                    var3_3.getClass();
                                                                                    var9_9 = "clickedStar";
                                                                                    var10_10 = "notificationId";
                                                                                    var11_11 = var2_2.getInt(var10_10);
                                                                                    var12_12 = "default_dl";
                                                                                    var13_13 = false;
                                                                                    var14_14 /* !! */  = null;
                                                                                    var15_15 = var2_2.getBoolean((String)var12_12, false);
                                                                                    var16_16 = "wzrk_dl";
                                                                                    if (var15_15 == 0) ** GOTO lbl112
                                                                                    var5_5 = "config";
                                                                                    var5_5 = var2_2.getParcelable((String)var5_5);
                                                                                    var5_5 = (CleverTapInstanceConfig)var5_5;
                                                                                    var3_3.C = var5_5;
                                                                                    var5_5 = var3_3.t;
                                                                                    var5_5.cancel(var11_11);
                                                                                    var5_5 = CTNotificationIntentService.class;
                                                                                    try {
                                                                                        var17_17 = CTNotificationIntentService.MAIN_ACTION;
                                                                                    }
                                                                                    catch (ClassNotFoundException v0) {
                                                                                        ak2_1.a();
                                                                                        var18_20 = false;
                                                                                        var5_5 = null;
                                                                                    }
                                                                                    var18_20 = yz3_0.i(var4_4, (Class)var5_5);
                                                                                    if (!var18_20) break block193;
                                                                                    var17_17 = "com.clevertap.PUSH_EVENT";
                                                                                    var5_5 = new Intent((String)var17_17);
                                                                                    var17_17 = var0.getPackageName();
                                                                                    var5_5.setPackage((String)var17_17);
                                                                                    var17_17 = "ct_type";
                                                                                    var9_9 = "com.clevertap.ACTION_BUTTON_CLICK";
                                                                                    var5_5.putExtra((String)var17_17, (String)var9_9);
                                                                                    var5_5.putExtras(var6_6 /* !! */ );
                                                                                    var6_6 /* !! */  = "dl";
                                                                                    var7_7 = var7_7.l;
                                                                                    var5_5.putExtra((String)var6_6 /* !! */ , (String)var7_7);
                                                                                    var4_4.startService((Intent)var5_5);
                                                                                }
                                                                                var17_17 = "android.intent.action.VIEW";
                                                                                var9_9 = var7_7.l;
                                                                                var9_9 = Uri.parse((String)var9_9);
                                                                                var5_5 = new Intent((String)var17_17, (Uri)var9_9);
                                                                                var17_17 = "wzrk_acts";
                                                                                var5_5.removeExtra((String)var17_17);
                                                                                var17_17 = "wzrk_from";
                                                                                var9_9 = "CTPushNotificationReceiver";
                                                                                var5_5.putExtra((String)var17_17, (String)var9_9);
                                                                                var8_8 = 872415232 != 0;
                                                                                var5_5.setFlags((int)var8_8);
                                                                                var17_17 = var7_7.C;
                                                                                if (var17_17 == null) break block194;
                                                                                var17_17 = com.clevertap.android.sdk.a.k(var4_4, (CleverTapInstanceConfig)var17_17);
                                                                                break block195;
                                                                            }
                                                                            var17_17 = com.clevertap.android.sdk.a.g(var0);
                                                                        }
                                                                        if (var17_17 != null) {
                                                                            var17_17 = var17_17.b;
                                                                            var17_17 = var17_17.f;
                                                                            var17_17.b0(var6_6 /* !! */ );
                                                                        }
                                                                        var5_5.putExtras(var6_6 /* !! */ );
                                                                        var6_6 /* !! */  = var7_7.l;
                                                                        var5_5.putExtra(var16_16, (String)var6_6 /* !! */ );
                                                                        var4_4.startActivity((Intent)var5_5);
                                                                        break block196;
lbl112:
                                                                        // 1 sources

                                                                        var12_12 = var3_3.n;
                                                                        var12_12 = var12_12.get(0);
                                                                        var12_12 = (String)var12_12;
                                                                        var19_22 = var2_2.getInt((String)var9_9, 0);
                                                                        var20_23 = "wzrk_c2a";
                                                                        if (var8_8 != var19_22) break block197;
                                                                        var21_24 = "rating_1";
                                                                        var2_2.putString(var20_23, (String)var21_24);
                                                                        var21_24 = var3_3.n;
                                                                        var19_22 = var21_24.size();
                                                                        if (var19_22 <= false) break block197;
                                                                        var12_12 = var3_3.n;
                                                                        var12_12 = var12_12.get(0);
                                                                        var12_12 = (String)var12_12;
                                                                    }
                                                                    var19_22 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                                                                    var22_25 /* !! */  = 2 != 0;
                                                                    if (var22_25 /* !! */  != var19_22) break block198;
                                                                    var12_12 = "rating_2";
                                                                    var6_6 /* !! */ .putString(var20_23, (String)var12_12);
                                                                    var12_12 = var7_7.n;
                                                                    var15_15 = var12_12.size();
                                                                    if (var15_15 <= var8_8) break block199;
                                                                    var12_12 = var7_7.n;
                                                                    var12_12 = var12_12.get((int)var8_8);
                                                                    var12_12 = (String)var12_12;
                                                                    break block198;
                                                                }
                                                                var12_12 = var7_7.n;
                                                                var12_12 = var12_12.get(0);
                                                                var12_12 = (String)var12_12;
                                                            }
                                                            var19_22 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                                                            var23_26 = 3 != 0;
                                                            if (var23_26 != var19_22) break block200;
                                                            var12_12 = "rating_3";
                                                            var6_6 /* !! */ .putString(var20_23, (String)var12_12);
                                                            var12_12 = var7_7.n;
                                                            var15_15 = var12_12.size();
                                                            if (var15_15 <= var22_25 /* !! */ ) break block201;
                                                            var12_12 = var7_7.n;
                                                            var12_12 = var12_12.get((int)var22_25 /* !! */ );
                                                            var12_12 = (String)var12_12;
                                                            break block200;
                                                        }
                                                        var12_12 = var7_7.n;
                                                        var12_12 = var12_12.get(0);
                                                        var12_12 = (String)var12_12;
                                                    }
                                                    var19_22 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                                                    var24_27 = 4 != 0;
                                                    if (var24_27 != var19_22) break block202;
                                                    var12_12 = "rating_4";
                                                    var6_6 /* !! */ .putString(var20_23, (String)var12_12);
                                                    var12_12 = var7_7.n;
                                                    var15_15 = var12_12.size();
                                                    if (var15_15 <= var23_26) break block203;
                                                    var12_12 = var7_7.n;
                                                    var12_12 = var12_12.get((int)var23_26);
                                                    var12_12 = (String)var12_12;
                                                    break block202;
                                                }
                                                var12_12 = var7_7.n;
                                                var12_12 = var12_12.get(0);
                                                var12_12 = (String)var12_12;
                                            }
                                            var19_22 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                                            var25_28 = 5 != 0;
                                            if (var25_28 != var19_22) break block204;
                                            var12_12 = "rating_5";
                                            var6_6 /* !! */ .putString(var20_23, (String)var12_12);
                                            var12_12 = var7_7.n;
                                            var15_15 = var12_12.size();
                                            if (var15_15 <= var24_27) break block205;
                                            var12_12 = var7_7.n;
                                            var12_12 = var12_12.get((int)var24_27);
                                            var12_12 = (String)var12_12;
                                            break block204;
                                        }
                                        var12_12 = var7_7.n;
                                        var12_12 = var12_12.get(0);
                                        var12_12 = (String)var12_12;
                                    }
                                    var19_22 = Build.VERSION.SDK_INT;
                                    var26_29 = 23 != 0;
                                    if (var19_22 < var26_29) break block206;
                                    var20_23 = xz3_0.m(var11_11, var4_4);
                                    if (var20_23 != null) ** GOTO lbl249
                                    ak2_1.b();
                                    break block196;
lbl249:
                                    // 1 sources

                                    var27_30 = var20_23.bigContentView;
                                    var7_7.e = var27_30;
                                    var27_30 = var20_23.contentView;
                                    var7_7.d = var27_30;
                                    var25_28 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                                    if (var8_8 != var25_28) ** GOTO lbl267
                                    var27_30 = var7_7.e;
                                    var8_8 = R$id.star1;
                                    var24_27 = R$drawable.pt_star_filled;
                                    var27_30.setImageViewResource((int)var8_8, (int)var24_27);
                                    break block207;
lbl267:
                                    // 1 sources

                                    var17_18 /* !! */  = var7_7.e;
                                    var24_27 = R$id.star1;
                                    var25_28 = R$drawable.pt_star_outline;
                                    var17_18 /* !! */ .setImageViewResource((int)var24_27, (int)var25_28);
                                }
                                var8_8 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                                if (var22_25 /* !! */  != var8_8) ** GOTO lbl294
                                var17_18 /* !! */  = var7_7.e;
                                var22_25 /* !! */  = R$id.star1;
                                var24_27 = R$drawable.pt_star_filled;
                                var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var24_27);
                                var17_18 /* !! */  = var7_7.e;
                                var22_25 /* !! */  = R$id.star2;
                                var24_27 = R$drawable.pt_star_filled;
                                var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var24_27);
                                break block208;
lbl294:
                                // 1 sources

                                var17_18 /* !! */  = var7_7.e;
                                var22_25 /* !! */  = R$id.star2;
                                var24_27 = R$drawable.pt_star_outline;
                                var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var24_27);
                            }
                            var8_8 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                            if (var23_26 != var8_8) ** GOTO lbl328
                            var17_18 /* !! */  = var7_7.e;
                            var22_25 /* !! */  = R$id.star1;
                            var23_26 = R$drawable.pt_star_filled;
                            var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                            var17_18 /* !! */  = var7_7.e;
                            var22_25 /* !! */  = R$id.star2;
                            var23_26 = R$drawable.pt_star_filled;
                            var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                            var17_18 /* !! */  = var7_7.e;
                            var22_25 /* !! */  = R$id.star3;
                            var23_26 = R$drawable.pt_star_filled;
                            var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                            break block209;
lbl328:
                            // 1 sources

                            var17_18 /* !! */  = var7_7.e;
                            var22_25 /* !! */  = R$id.star3;
                            var23_26 = R$drawable.pt_star_outline;
                            var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                        }
                        var8_8 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                        var22_25 /* !! */  = 4 != 0;
                        if (var22_25 /* !! */  != var8_8) ** GOTO lbl370
                        var17_18 /* !! */  = var7_7.e;
                        var22_25 /* !! */  = R$id.star1;
                        var23_26 = R$drawable.pt_star_filled;
                        var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                        var17_18 /* !! */  = var7_7.e;
                        var22_25 /* !! */  = R$id.star2;
                        var23_26 = R$drawable.pt_star_filled;
                        var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                        var17_18 /* !! */  = var7_7.e;
                        var22_25 /* !! */  = R$id.star3;
                        var23_26 = R$drawable.pt_star_filled;
                        var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                        var17_18 /* !! */  = var7_7.e;
                        var22_25 /* !! */  = R$id.star4;
                        var23_26 = R$drawable.pt_star_filled;
                        var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                        break block210;
lbl370:
                        // 1 sources

                        var17_18 /* !! */  = var7_7.e;
                        var22_25 /* !! */  = R$id.star4;
                        var23_26 = R$drawable.pt_star_outline;
                        var17_18 /* !! */ .setImageViewResource((int)var22_25 /* !! */ , (int)var23_26);
                    }
                    var8_8 = var6_6 /* !! */ .getInt((String)var9_9, 0);
                    var28_31 = 5 != 0;
                    if (var28_31 != var8_8) break block211;
                    var17_18 /* !! */  = var7_7.e;
                    var28_31 = R$id.star1;
                    var22_25 /* !! */  = R$drawable.pt_star_filled;
                    var17_18 /* !! */ .setImageViewResource((int)var28_31, (int)var22_25 /* !! */ );
                    var17_18 /* !! */  = var7_7.e;
                    var28_31 = R$id.star2;
                    var22_25 /* !! */  = R$drawable.pt_star_filled;
                    var17_18 /* !! */ .setImageViewResource((int)var28_31, (int)var22_25 /* !! */ );
                    var17_18 /* !! */  = var7_7.e;
                    var28_31 = R$id.star3;
                    var22_25 /* !! */  = R$drawable.pt_star_filled;
                    var17_18 /* !! */ .setImageViewResource((int)var28_31, (int)var22_25 /* !! */ );
                    var17_18 /* !! */  = var7_7.e;
                    var28_31 = R$id.star4;
                    var22_25 /* !! */  = R$drawable.pt_star_filled;
                    var17_18 /* !! */ .setImageViewResource((int)var28_31, (int)var22_25 /* !! */ );
                    var17_18 /* !! */  = var7_7.e;
                    var28_31 = R$id.star5;
                    var22_25 /* !! */  = R$drawable.pt_star_filled;
                    var17_18 /* !! */ .setImageViewResource((int)var28_31, (int)var22_25 /* !! */ );
lbl418:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var17_18 /* !! */  = var7_7.e;
                var28_31 = R$id.star5;
                var22_25 /* !! */  = R$drawable.pt_star_outline;
                var17_18 /* !! */ .setImageViewResource((int)var28_31, (int)var22_25 /* !! */ );
                ** continue;
                var8_8 = 23 != 0;
                var8_8 = var19_22 >= var8_8 ? 201326592 != 0 : 134217728 != 0;
                var9_9 = "requestCodes";
                var9_9 = var5_5.getIntArrayExtra((String)var9_9);
                var19_22 = ((Object)var9_9).length;
                while (var13_13 < var19_22) {
                    var22_25 /* !! */  = (boolean)var9_9[var13_13];
                    var29_32 = PendingIntent.getBroadcast((Context)var4_4, (int)var22_25 /* !! */ , (Intent)var5_5, (int)var8_8);
                    var29_32.cancel();
                    var22_25 /* !! */  = true;
                    var13_13 += var22_25 /* !! */ ;
                }
                var6_6 /* !! */ .putString(var16_16, (String)var12_12);
                var5_5 = var7_7.e;
                var8_8 = R$id.tVRatingConfirmation;
                var9_9 = np1_2.a(var4_4, var6_6 /* !! */ );
                var5_5.setOnClickPendingIntent((int)var8_8, (PendingIntent)var9_9);
                var7_7.i(var4_4);
                var5_5 = new J42(var4_4, (Notification)var20_23);
                var17_18 /* !! */  = var5_5.P;
                var14_14 /* !! */  = PushTemplateReceiver.class;
                var9_9 = new Intent(var4_4, var14_14 /* !! */ );
                var9_9 = sq2_1.c(var4_4, (Intent)var9_9, var6_6 /* !! */ );
                var14_14 /* !! */  = var7_7.t;
                if (var14_14 /* !! */  == null) ** GOTO lbl495
                var13_13 = var7_7.r;
                var17_18 /* !! */ .icon = var13_13;
                var14_14 /* !! */  = var7_7.d;
                var5_5.G = var14_14 /* !! */ ;
                var14_14 /* !! */  = var7_7.e;
                var5_5.H = var14_14 /* !! */ ;
                var14_14 /* !! */  = var7_7.i;
                var14_14 /* !! */  = J42.b((CharSequence)var14_14 /* !! */ );
                var5_5.e = var14_14 /* !! */ ;
                var17_18 /* !! */ .deleteIntent = var9_9;
                var8_8 = 16 != 0;
                var28_31 = true;
                var5_5.d((int)var8_8, var28_31);
                var5_5 = var5_5.a();
                var17_18 /* !! */  = var7_7.t;
                var17_18 /* !! */ .notify(var11_11, (Notification)var5_5);
lbl495:
                // 2 sources

                var5_5 = var7_7.C;
                var17_18 /* !! */  = xz3_0.a(var2_2);
                xz3_0.q(var4_4, (CleverTapInstanceConfig)var5_5, (HashMap)var17_18 /* !! */ );
                var18_21 = Build.VERSION.SDK_INT;
                var8_8 = 31 != 0;
                if (var18_21 >= var8_8) break block196;
                var9_9 = var7_7.C;
                var5_5 = var3_3;
                var4_4 = var0;
                var6_6 /* !! */  = var2_2;
                var17_18 /* !! */  = var12_12;
                var3_3.f(var0, var2_2, var11_11, (String)var12_12, (CleverTapInstanceConfig)var9_9);
            }
            var5_5 = "extras_from";
            var17_19 = "PTReceiver";
            var6_6 /* !! */ .putString((String)var5_5, (String)var17_19);
            var17_19 = var5_5 = var2_2.clone();
            var17_19 = (Bundle)var5_5;
            var5_5 = com.clevertap.android.sdk.a.f;
            if (var5_5 == null) break block196;
            var9_9 = "FCM";
            var5_5.b(var4_4, (String)var9_9, var6_6 /* !! */ );
            var17_19.putString(var16_16, (String)var12_12);
            var5_5 = var7_7.C;
            var6_6 /* !! */  = xz3_0.a(var2_2);
            xz3_0.q(var4_4, (CleverTapInstanceConfig)var5_5, (HashMap)var6_6 /* !! */ );
            var9_9 = var7_7.C;
            var5_5 = var3_3;
            var4_4 = var0;
            var6_6 /* !! */  = var17_19;
            var17_19 = var12_12;
            var3_3.f(var0, var6_6 /* !! */ , var11_11, (String)var12_12, (CleverTapInstanceConfig)var9_9);
            {
                catch (Throwable v1) {
                    ak2_1.c();
                }
            }
        }
    }

    public static void b(PushTemplateReceiver object, Context context, Bundle bundle) {
        object.getClass();
        String string2 = "notificationId";
        int n3 = bundle.getInt(string2);
        String string3 = null;
        bundle.putString("wzrk_dl", null);
        String string4 = "close";
        boolean bl2 = bundle.getBoolean(string4);
        boolean bl3 = ((PushTemplateReceiver)((Object)object)).a;
        if (bl3 == bl2) {
            string3 = "5cta_close";
            bundle.putString("wzrk_c2a", string3);
            string4 = ((PushTemplateReceiver)((Object)object)).t;
            string4.cancel(n3);
        }
        if ((object = (object = ((PushTemplateReceiver)((Object)object)).C) != null ? com.clevertap.android.sdk.a.k(context, (CleverTapInstanceConfig)object) : com.clevertap.android.sdk.a.g(context)) != null) {
            object = ((com.clevertap.android.sdk.a)object).b.f;
            ((we)object).b0(bundle);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(PushTemplateReceiver pushTemplateReceiver, Context context, Bundle bundle) {
        ((Object)((Object)pushTemplateReceiver)).getClass();
        String string2 = "pt_current_position";
        Object object = "notificationId";
        try {
            Object object2;
            Object object3;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            void var6_22;
            boolean bl2;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 23;
            if (n3 < n4) {
                String string3 = "extras_from";
                object = "PTReceiver";
                bundle.putString(string3, (String)object);
                n2_0 n2_02 = com.clevertap.android.sdk.a.f;
                if (n2_02 == null) return;
                object = "FCM";
                n2_02.b(context, (String)object, bundle);
                return;
            }
            int n7 = bundle.getInt((String)object);
            Notification notification = xz3_0.m(n7, context);
            if (notification == null) {
                ak2_1.b();
                return;
            }
            Object object4 = notification.bigContentView;
            pushTemplateReceiver.c = object4;
            object4 = notification.contentView;
            pushTemplateReceiver.d = object4;
            object4 = pushTemplateReceiver.u;
            int n8 = 1;
            if (object4 != null && !(bl2 = ((String)object4).isEmpty())) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                object4 = null;
            }
            RemoteViews remoteViews = pushTemplateReceiver.c;
            pushTemplateReceiver.g(remoteViews, context);
            if (var6_22 == false) {
                RemoteViews remoteViews2 = pushTemplateReceiver.d;
                pushTemplateReceiver.g(remoteViews2, context);
            }
            int n10 = bundle.getInt(string2);
            RemoteViews remoteViews3 = pushTemplateReceiver.c;
            int n14 = R$id.carousel_image;
            remoteViews3.setDisplayedChild(n14, n10);
            String string4 = "pt_image_list";
            pushTemplateReceiver.m = arrayList5 = bundle.getStringArrayList(string4);
            String string5 = "pt_deeplink_list";
            pushTemplateReceiver.n = arrayList4 = bundle.getStringArrayList(string5);
            String string6 = "pt_big_text_list";
            pushTemplateReceiver.o = arrayList3 = bundle.getStringArrayList(string6);
            String string7 = "pt_small_text_list";
            pushTemplateReceiver.p = arrayList2 = bundle.getStringArrayList(string7);
            String string8 = "pt_price_list";
            pushTemplateReceiver.q = arrayList = bundle.getStringArrayList(string8);
            ArrayList arrayList6 = pushTemplateReceiver.n;
            Object e2 = arrayList6.get(n10);
            String string9 = (String)e2;
            if (var6_22 == false) {
                object4 = pushTemplateReceiver.c;
                n14 = R$id.title;
                object3 = pushTemplateReceiver.o;
                object3 = ((ArrayList)object3).get(n10);
                object3 = (CharSequence)object3;
                object4.setTextViewText(n14, (CharSequence)object3);
            } else {
                object4 = pushTemplateReceiver.c;
                n14 = R$id.product_name;
                object3 = pushTemplateReceiver.o;
                object3 = ((ArrayList)object3).get(n10);
                object3 = (CharSequence)object3;
                object4.setTextViewText(n14, (CharSequence)object3);
            }
            object4 = pushTemplateReceiver.c;
            n14 = R$id.msg;
            object3 = pushTemplateReceiver.p;
            object3 = ((ArrayList)object3).get(n10);
            object3 = (CharSequence)object3;
            object4.setTextViewText(n14, (CharSequence)object3);
            object4 = pushTemplateReceiver.c;
            n14 = R$id.product_price;
            object3 = pushTemplateReceiver.q;
            Object e5 = ((ArrayList)object3).get(n10);
            CharSequence charSequence = (CharSequence)e5;
            object4.setTextViewText(n14, charSequence);
            bundle.remove(string2);
            Object object5 = bundle.clone();
            Bundle bundle2 = (Bundle)object5;
            object4 = "img1";
            bundle2.putBoolean((String)object4, n8 != 0);
            bundle2.putInt((String)object, n7);
            object = "pt_buy_now_dl";
            bundle2.putString((String)object, string9);
            object = "buynow";
            bundle2.putBoolean((String)object, n8 != 0);
            object = pushTemplateReceiver.c;
            int n15 = R$id.product_action;
            PendingIntent pendingIntent = sq2_1.a(context, bundle2, string9, n7);
            object.setOnClickPendingIntent(n15, pendingIntent);
            J42 j42 = new J42(context, notification);
            Object object6 = object2 = bundle.clone();
            Bundle bundle3 = (Bundle)object2;
            String string10 = "wzrk_dl";
            bundle3.putString(string10, string9);
            boolean bl5 = true;
            n8 = 20;
            n10 = 0;
            Object var11_37 = null;
            Context context2 = context;
            PendingIntent pendingIntent2 = sq2_1.b(context, n7, bundle3, bl5, n8, null);
            NotificationManager notificationManager = pushTemplateReceiver.t;
            if (notificationManager == null) return;
            object = PushTemplateReceiver.class;
            Intent intent = new Intent(context, (Class)object);
            PendingIntent pendingIntent3 = sq2_1.c(context, intent, bundle);
            pushTemplateReceiver.i(context);
            RemoteViews remoteViews4 = pushTemplateReceiver.d;
            object4 = pushTemplateReceiver.c;
            String string11 = pushTemplateReceiver.i;
            PushTemplateReceiver pushTemplateReceiver2 = pushTemplateReceiver;
            object = j42;
            pushTemplateReceiver.h(j42, remoteViews4, (RemoteViews)object4, string11, pendingIntent2, pendingIntent3);
            Notification notification2 = j42.a();
            object = pushTemplateReceiver.t;
            object.notify(n7, notification2);
            return;
        }
        catch (Throwable throwable) {
            ak2_1.c();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void d(Context var0, Intent var1_1, Bundle var2_2, PushTemplateReceiver var3_3) {
        block26: {
            block27: {
                block29: {
                    block28: {
                        block25: {
                            var3_3 /* !! */ .getClass();
                            var4_4 = RemoteInput.getResultsFromIntent((Intent)var1_1 /* !! */ );
                            var5_5 = new Intent(var0, PushTemplateReceiver.class);
                            var5_5 = sq2_1.c(var0, (Intent)var5_5, var2_2);
                            var6_6 = (CleverTapInstanceConfig)var2_2.getParcelable("config");
                            var3_3 /* !! */ .C = var6_6;
                            if (var4_4 == null) break block26;
                            var6_6 = "pt_input_reply";
                            var4_4 = var4_4.getCharSequence((String)var6_6);
                            var7_7 = "notificationId";
                            var8_8 = var2_2.getInt(var7_7);
                            if (var4_4 == null) break block27;
                            ak2_1.b();
                            var9_9 = var4_4.toString();
                            var2_2.putString((String)var6_6, (String)var9_9);
                            var9_9 = var3_3 /* !! */ .C;
                            var9_9 = var9_9 != null ? com.clevertap.android.sdk.a.k(var0, (CleverTapInstanceConfig)var9_9) : com.clevertap.android.sdk.a.g(var0);
                            var10_10 = var2_2.getString((String)var6_6);
                            var11_11 = new HashMap();
                            var12_12 = var2_2.keySet().iterator();
                            while (true) {
                                var13_13 = var12_12.hasNext();
                                var14_14 = true;
                                if (!var13_13) break;
                                var15_15 = (String)var12_12.next();
                                var17_17 = var15_15.contains((CharSequence)(var16_16 /* !! */  = "pt_event_property"));
                                if (!var17_17) continue;
                                var16_16 /* !! */  = var2_2.getString(var15_15);
                                if (var16_16 /* !! */  != null && !(var17_17 = (var16_16 /* !! */  = var2_2.getString(var15_15)).isEmpty())) {
                                    var16_16 /* !! */  = "pt_event_property_";
                                    var18_18 = var15_15.contains((CharSequence)var16_16 /* !! */ );
                                    if (var18_18) {
                                        var16_16 /* !! */  = var15_15.split((String)var16_16 /* !! */ );
                                        var19_19 = var2_2.getString(var15_15);
                                        var18_18 = var19_19.equalsIgnoreCase((String)var6_6);
                                        if (var18_18) {
                                            var15_15 = var16_16 /* !! */ [var14_14];
                                            var11_11.put(var15_15, var10_10);
                                            continue;
                                        }
                                        var20_20 = var16_16 /* !! */ [var14_14];
                                        var15_15 = var2_2.getString(var15_15);
                                        var11_11.put(var20_20, var15_15);
                                        continue;
                                    }
                                    ak2_1.b();
                                    continue;
                                }
                                var20_20 = "Property Key is Empty. Skipping Property: ";
                                var20_20.concat(var15_15);
                                ak2_1.b();
                            }
                            var6_6 = xz3_0.j(var2_2);
                            if (var6_6 != null && (var21_21 = var6_6.isEmpty()) == 0) {
                                if (var9_9 != null) {
                                    var9_9.p((String)var6_6, (Map)var11_11);
                                } else {
                                    ak2_1.a();
                                }
                            }
                            if (var22_22 = var3_3 /* !! */ .s) {
                                var9_9 = "pt_silent_sound_channel";
                                var6_6 = new J42(var0, (String)var9_9);
                            } else {
                                var23_23 = 0;
                                var9_9 = null;
                                var6_6 = new J42(var0, null);
                            }
                            var3_3 /* !! */ .i(var0);
                            var23_23 = Build.VERSION.SDK_INT;
                            var21_21 = 31;
                            if (var23_23 >= var21_21) {
                                var6_6.q = var9_9 = J42.b(var3_3 /* !! */ .B);
                            }
                            var23_23 = var3_3 /* !! */ .r;
                            var11_11 = var6_6.P;
                            var11_11.icon = var23_23;
                            var6_6.e = var9_9 = J42.b(var3_3 /* !! */ .i);
                            var9_9 = "pt_input_feedback";
                            var6_6.f = var12_12 = J42.b(var2_2.getString((String)var9_9));
                            var6_6.M = var24_24 = 1300L;
                            var11_11.deleteIntent = var5_5;
                            var11_11.when = var26_25 = System.currentTimeMillis();
                            var28_26 = 16;
                            var6_6.d(var28_26, var14_14);
                            var5_5 = var3_3 /* !! */ .v;
                            if (var5_5 != null && (var29_27 = var5_5.startsWith((String)(var11_11 = "http")))) {
                                block24: {
                                    var5_5 = xz3_0.l(var0, (String)var5_5);
                                    if (var5_5 == null) break block24;
                                    var11_11 = new U42();
                                    var20_20 = var2_2.getString((String)var9_9);
                                    var11_11.n(var20_20);
                                    var11_11.m((Bitmap)var5_5);
                                    break block25;
                                }
                                var11_11 = "Failed to fetch big picture!";
                                var5_5 = new Exception((String)var11_11);
                                throw var5_5;
lbl102:
                                // 1 sources

                                while (true) {
                                    var11_11 = new U42();
                                    var11_11.e = var5_5 = J42.b(var2_2.getString((String)var9_9));
                                    ak2_1.c();
                                    break block25;
                                    break;
                                }
                            }
                            var11_11 = new U42();
                            var11_11.e = var5_5 = J42.b(var2_2.getString((String)var9_9));
                        }
                        var6_6.g((U42)var11_11);
                        var5_5 = var6_6.a();
                        var3_3 /* !! */  = var3_3 /* !! */ .t;
                        var3_3 /* !! */ .notify(var8_8, (Notification)var5_5);
                        var30_28 = Build.VERSION.SDK_INT;
                        if (var30_28 >= var21_21 || (var5_5 = var2_2.getString((String)(var3_3 /* !! */  = "pt_input_auto_open"))) == null && (var30_28 = (int)var2_2.getBoolean((String)var3_3 /* !! */ )) == 0) break block26;
                        try {
                            Thread.sleep(var24_24);
                        }
                        catch (InterruptedException v0) {}
                        var3_3 /* !! */  = "wzrk_dl";
                        var28_26 = (int)var2_2.containsKey((String)var3_3 /* !! */ );
                        if (var28_26 == 0 || (var5_5 = var2_2.getString((String)var3_3 /* !! */ )) == null) break block28;
                        var1_1 /* !! */  = Uri.parse((String)var1_1 /* !! */ .getStringExtra((String)var3_3 /* !! */ ));
                        var3_3 /* !! */  = "android.intent.action.VIEW";
                        var5_5 = new Intent((String)var3_3 /* !! */ , (Uri)var1_1 /* !! */ );
                        xz3_0.s(var0, (Intent)var5_5);
                        break block29;
                    }
                    var1_1 /* !! */  = var0.getPackageManager();
                    var5_5 = var1_1 /* !! */ .getLaunchIntentForPackage((String)(var3_3 /* !! */  = var0.getPackageName()));
                    if (var5_5 == null) break block26;
                }
                var5_5.putExtras(var2_2);
                var5_5.putExtra("pt_reply", (CharSequence)var4_4);
                var1_1 /* !! */  = "wzrk_acts";
                var5_5.removeExtra((String)var1_1 /* !! */ );
                var31_29 = 0x34000000;
                var5_5.setFlags(var31_29);
                var0.startActivity((Intent)var5_5);
                break block26;
            }
            ak2_1.b();
        }
        return;
        catch (Throwable v1) {
            ** continue;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(PushTemplateReceiver pushTemplateReceiver, Context context, Bundle bundle) {
        PushTemplateReceiver pushTemplateReceiver2 = pushTemplateReceiver;
        Bundle bundle2 = bundle;
        ((Object)((Object)pushTemplateReceiver)).getClass();
        String string2 = "pt_manual_carousel_current";
        Object object = "right_swipe";
        try {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 23;
            if (n3 >= n4) {
                void var7_25;
                Object object2;
                ArrayList arrayList;
                int n7;
                int n8;
                ArrayList arrayList2;
                ArrayList arrayList3;
                RemoteViews remoteViews;
                Object object3 = "notificationId";
                int n10 = bundle.getInt((String)object3);
                Notification notification = xz3_0.m(n10, context);
                if (notification == null) {
                    ak2_1.b();
                    return;
                }
                object3 = notification.bigContentView;
                pushTemplateReceiver.f = object3;
                pushTemplateReceiver.d = remoteViews = notification.contentView;
                pushTemplateReceiver.g((RemoteViews)object3, context);
                boolean bl2 = bundle.getBoolean((String)object);
                String string3 = "pt_image_list";
                pushTemplateReceiver.m = arrayList3 = bundle.getStringArrayList(string3);
                String string4 = "pt_deeplink_list";
                pushTemplateReceiver.n = arrayList2 = bundle.getStringArrayList(string4);
                int n14 = bundle.getInt(string2);
                int n15 = 1;
                if (bl2) {
                    object3 = pushTemplateReceiver.f;
                    int n16 = R$id.carousel_image;
                    object3.showNext(n16);
                    object3 = pushTemplateReceiver.f;
                    n16 = R$id.carousel_image_right;
                    object3.showNext(n16);
                    object3 = pushTemplateReceiver.f;
                    n16 = R$id.carousel_image_left;
                    object3.showNext(n16);
                    object3 = pushTemplateReceiver.m;
                    int n17 = ((ArrayList)object3).size() - n15;
                    if (n14 == n17) {
                        boolean bl3 = false;
                        object3 = null;
                    } else {
                        int n18 = n14 + 1;
                    }
                } else {
                    object3 = pushTemplateReceiver.f;
                    int n19 = R$id.carousel_image;
                    object3.showPrevious(n19);
                    object3 = pushTemplateReceiver.f;
                    n19 = R$id.carousel_image_right;
                    object3.showPrevious(n19);
                    object3 = pushTemplateReceiver.f;
                    n19 = R$id.carousel_image_left;
                    object3.showPrevious(n19);
                    if (n14 == 0) {
                        object3 = pushTemplateReceiver.m;
                        int n20 = ((ArrayList)object3).size() - n15;
                    } else {
                        int n21 = n14 + -1;
                    }
                }
                Object object4 = "";
                Object object5 = pushTemplateReceiver2.n;
                if (object5 != null && (n8 = ((ArrayList)object5).size()) == (n7 = (arrayList = pushTemplateReceiver2.m).size())) {
                    object2 = pushTemplateReceiver2.n;
                    object4 = object2 = ((ArrayList)object2).get((int)var7_25);
                    object4 = (String)object2;
                } else {
                    object5 = pushTemplateReceiver2.n;
                    if (object5 != null && (n8 = ((ArrayList)object5).size()) == n15) {
                        object2 = pushTemplateReceiver2.n;
                        object4 = object2 = ((ArrayList)object2).get(0);
                        object4 = (String)object2;
                    } else {
                        object2 = pushTemplateReceiver2.n;
                        if (object2 != null && (n15 = ((ArrayList)object2).size()) > var7_25) {
                            object2 = pushTemplateReceiver2.n;
                            object4 = object2 = ((ArrayList)object2).get((int)var7_25);
                            object4 = (String)object2;
                        } else {
                            object2 = pushTemplateReceiver2.n;
                            if (object2 != null && (n15 = ((ArrayList)object2).size()) < var7_25) {
                                object2 = pushTemplateReceiver2.n;
                                object4 = object2 = ((ArrayList)object2).get(0);
                                object4 = (String)object2;
                            }
                        }
                    }
                }
                bundle2.putInt(string2, (int)var7_25);
                bundle2.remove((String)object);
                String string5 = "wzrk_dl";
                bundle2.putString(string5, (String)object4);
                String string6 = "manual_carousel_from";
                bundle2.putInt(string6, n14);
                object4 = pushTemplateReceiver2.f;
                n8 = R$id.rightArrowPos0;
                boolean bl4 = false;
                Object var12_40 = null;
                n15 = 4;
                Context context2 = context;
                object3 = bundle;
                PendingIntent pendingIntent = sq2_1.b(context, n10, bundle, false, n15, null);
                object4.setOnClickPendingIntent(n8, pendingIntent);
                object4 = pushTemplateReceiver2.f;
                n8 = R$id.leftArrowPos0;
                boolean bl5 = false;
                Object var12_41 = null;
                n15 = 5;
                Context context3 = context;
                PendingIntent pendingIntent2 = sq2_1.b(context, n10, bundle, false, n15, null);
                object4.setOnClickPendingIntent(n8, pendingIntent2);
                boolean bl6 = true;
                n15 = 3;
                Context context4 = context;
                object4 = sq2_1.b(context, n10, bundle, bl6, n15, null);
                object5 = new J42(context, notification);
                boolean bl7 = false;
                Object var12_42 = null;
                n15 = 6;
                bundle2 = sq2_1.b(context, n10, bundle, false, n15, null);
                pushTemplateReceiver.i(context);
                object3 = pushTemplateReceiver2.d;
                RemoteViews remoteViews2 = pushTemplateReceiver2.f;
                object2 = pushTemplateReceiver2.i;
                PushTemplateReceiver pushTemplateReceiver3 = pushTemplateReceiver;
                object = object5;
                pushTemplateReceiver.h((J42)object5, (RemoteViews)object3, remoteViews2, (String)object2, (PendingIntent)object4, (PendingIntent)bundle2);
                Notification notification2 = ((J42)object5).a();
                object = pushTemplateReceiver2.t;
                object.notify(n10, notification2);
                return;
            }
            String string7 = "extras_from";
            object = "PTReceiver";
            bundle.putString(string7, (String)object);
            n2_0 n2_02 = com.clevertap.android.sdk.a.f;
            if (n2_02 == null) return;
            object = "FCM";
            n2_02.b(context, (String)object, bundle);
            return;
        }
        catch (Throwable throwable) {
            ak2_1.c();
        }
    }

    public final void f(Context context, Bundle bundle, int n3, String string2, CleverTapInstanceConfig object) {
        Object object2;
        boolean bl2;
        long l2 = 1000L;
        Thread.sleep(l2);
        Object object3 = this.t;
        object3.cancel(n3);
        String string3 = this.A;
        if (string3 != null && !(bl2 = string3.isEmpty()) && object != null) {
            object = jh_1.a((CleverTapInstanceConfig)object);
            object2 = ((kh_1)object).b;
            dg1_1 dg1_12 = ((kh_1)object).c;
            object = ((kh_1)object).d((Executor)object2, dg1_12, "Main");
            object3 = new vz3(string3, context);
            string3 = "PushTemplatesUtils#showToast";
            ((a)object).c(string3, (Callable)object3);
        }
        object = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
        string3 = new Intent((String)object);
        context.sendBroadcast((Intent)string3);
        string3 = "wzrk_dl";
        boolean bl3 = bundle.containsKey(string3);
        if (bl3) {
            object3 = Uri.parse((String)bundle.getString(string3));
            object2 = "android.intent.action.VIEW";
            object = new Intent((String)object2, (Uri)object3);
            yz3_0.k(context, (Intent)object);
        } else {
            object = context.getPackageManager();
            object3 = context.getPackageName();
            if ((object = object.getLaunchIntentForPackage((String)object3)) == null) {
                return;
            }
        }
        object.putExtras(bundle);
        object.putExtra(string3, string2);
        object.removeExtra("wzrk_acts");
        object.putExtra("wzrk_from", "CTPushNotificationReceiver");
        object.setFlags(0x34000000);
        context.startActivity((Intent)object);
    }

    public final void g(RemoteViews remoteViews, Context object) {
        Object object2;
        int n3;
        int n4 = R$id.app_name;
        String string2 = xz3_0.e((Context)object);
        remoteViews.setTextViewText(n4, (CharSequence)string2);
        n4 = R$id.timestamp;
        long l2 = System.currentTimeMillis();
        int n7 = 1;
        object = DateUtils.formatDateTime((Context)object, (long)l2, (int)n7);
        remoteViews.setTextViewText(n4, (CharSequence)object);
        object = this.B;
        if (object != null && (n3 = (int)(((String)object).isEmpty() ? 1 : 0)) == 0) {
            n3 = Build.VERSION.SDK_INT;
            n4 = 24;
            if (n3 >= n4) {
                n3 = R$id.subtitle;
                object2 = jC2.a(this.B);
                remoteViews.setTextViewText(n3, (CharSequence)object2);
            } else {
                n3 = R$id.subtitle;
                object2 = Html.fromHtml((String)this.B);
                remoteViews.setTextViewText(n3, (CharSequence)object2);
            }
        } else {
            n3 = R$id.subtitle;
            n4 = 8;
            remoteViews.setViewVisibility(n3, n4);
            n3 = R$id.sep_subtitle;
            remoteViews.setViewVisibility(n3, n4);
        }
        object = this.y;
        if (object != null && (n3 = (int)(((String)object).isEmpty() ? 1 : 0)) == 0) {
            n3 = R$id.app_name;
            object2 = this.y;
            string2 = "#A6A6A6";
            n4 = xz3_0.h((String)object2, string2);
            remoteViews.setTextColor(n3, n4);
            n3 = R$id.timestamp;
            n4 = xz3_0.h(this.y, string2);
            remoteViews.setTextColor(n3, n4);
            n3 = R$id.subtitle;
            object2 = this.y;
            n4 = xz3_0.h((String)object2, string2);
            remoteViews.setTextColor(n3, n4);
        }
    }

    public final void h(J42 j42, RemoteViews object, RemoteViews remoteViews, String string2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        long l2;
        int n3;
        j42.P.icon = n3 = this.r;
        j42.G = object;
        j42.H = remoteViews;
        object = J42.b((CharSequence)Html.fromHtml((String)string2));
        j42.e = object;
        object = j42.P;
        object.deleteIntent = pendingIntent2;
        j42.g = pendingIntent;
        j42.c(5);
        object.when = l2 = System.currentTimeMillis();
        j42.d(16, true);
    }

    /*
     * Unable to fully structure code
     */
    public final void i(Context var1_1) {
        block17: {
            block16: {
                var2_2 = var1_1.getPackageManager();
                var3_3 = var1_1.getPackageName();
                var4_4 = 128;
                var2_2 = var2_2.getApplicationInfo(var3_3, var4_4);
                var2_2 = var2_2.metaData;
                var3_3 = "CLEVERTAP_NOTIFICATION_ICON";
                var4_4 = 0;
                var5_5 = null;
                try {
                    var2_2 = var2_2.get(var3_3);
                    if (var2_2 == null) break block16;
                }
                catch (Throwable v0) {}
                var5_5 = var2_2.toString();
            }
            if (var5_5 == null) break block17;
            var2_2 = var1_1.getResources();
            var3_3 = "drawable";
            var6_6 = var1_1.getPackageName();
            var7_7 = var2_2.getIdentifier(var5_5, var3_3, var6_6);
            this.r = var7_7;
            if (var7_7 != 0) ** GOTO lbl44
            var2_2 = new IllegalArgumentException();
            throw var2_2;
        }
        try {
            var2_2 = new IllegalArgumentException();
            throw var2_2;
        }
        catch (Throwable v1) {
            ** continue;
        }
lbl41:
        // 1 sources

        while (true) {
            var1_1 = var1_1.getApplicationInfo();
            this.r = var8_8 = var1_1.icon;
lbl44:
            // 2 sources

            return;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Object object;
        int n3;
        int n4;
        NotificationManager notificationManager;
        Object object2;
        block27: {
            Object object3;
            block28: {
                object2 = "notification";
                notificationManager = (NotificationManager)context.getSystemService((String)object2);
                n4 = 26;
                if (notificationManager == null || (n3 = Build.VERSION.SDK_INT) < n4) break block27;
                object3 = nz3.a(notificationManager);
                if (object3 == null) break block28;
                object3 = nz3.a(notificationManager);
                if (object3 == null) break block27;
                object3 = nz3.a(notificationManager);
                if (n3 >= n4 && object3 != null && (n3 = w42_0.a(object3)) != 0) break block27;
            }
            object = new StringBuilder("android.resource://");
            object3 = context.getPackageName();
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append("/raw/pt_silent_sound");
            object = Uri.parse((String)((StringBuilder)object).toString());
            object3 = sz3_0.a();
            if (object != null) {
                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                int n7 = 5;
                builder = builder.setUsage(n7).build();
                oz3_0.a(object3, (Uri)object, (AudioAttributes)builder);
            }
            pz3.a(object3);
            qz3.a(object3);
            x31.a(notificationManager, object3);
        }
        if ((notificationManager = intent.getExtras()) != null) {
            notificationManager = intent.getExtras();
            object = notificationManager.getString("wzrk_acct_id");
            this.b = object = com.clevertap.android.sdk.a.h(context, (String)object);
            this.g = object = intent.getStringExtra("pt_id");
            this.j = object = notificationManager.getString("pt_msg");
            this.k = object = notificationManager.getString("pt_msg_summary");
            this.i = object = notificationManager.getString("pt_title");
            this.l = object = notificationManager.getString("pt_default_dl");
            this.m = object = xz3_0.k((Bundle)notificationManager);
            this.n = object = xz3_0.i((Bundle)notificationManager);
            this.o = object = xz3_0.f((Bundle)notificationManager);
            this.p = object = xz3_0.o((Bundle)notificationManager);
            this.q = object = xz3_0.n((Bundle)notificationManager);
            this.u = object = notificationManager.getString("pt_product_display_linear");
            object2 = (NotificationManager)context.getSystemService((String)object2);
            this.t = object2;
            object2 = notificationManager.getString("pt_big_img_alt");
            this.v = object2;
            object2 = notificationManager.getString("pt_small_icon_clr");
            this.w = object2;
            int n8 = Build.VERSION.SDK_INT;
            n3 = 0;
            object = null;
            if (n8 >= n4) {
                n8 = 1;
            } else {
                n8 = 0;
                object2 = null;
            }
            this.s = n8;
            n8 = (int)(notificationManager.getBoolean("pt_dismiss_intent", false) ? 1 : 0);
            this.z = n8;
            object2 = notificationManager.getString("pt_rating_toast");
            this.A = object2;
            object2 = notificationManager.getString("pt_subtitle");
            this.B = object2;
            object2 = this.i;
            if (object2 == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString("nt");
                this.i = object2;
            }
            if ((object2 = this.j) == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString("nm");
                this.j = object2;
            }
            if ((object2 = this.k) == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString("wzrk_nms");
                this.k = object2;
            }
            if ((object2 = this.x) == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString("wzrk_bp");
                this.x = object2;
            }
            if ((object2 = this.l) == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString("wzrk_dl");
                this.l = object2;
            }
            object2 = this.y;
            String string2 = "wzrk_clr";
            if (object2 == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString(string2);
                this.y = object2;
            }
            if ((object2 = this.w) == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString(string2);
                this.w = object2;
            }
            if ((object2 = this.B) == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString("wzrk_st");
                this.B = object2;
            }
            if ((object2 = this.w) == null || (n8 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
                object2 = notificationManager.getString(string2);
                this.w = object2;
            }
            if ((object2 = this.g) != null) {
                object2 = vj3_2.fromString((String)object2);
                this.h = object2;
            }
            if ((object2 = this.b) != null) {
                object2 = ((com.clevertap.android.sdk.a)object2).b;
                object2 = ((H80)object2).a;
                this.C = object2;
                object2 = jh_1.a((CleverTapInstanceConfig)object2);
                object2 = ((kh_1)object2).b();
                string2 = "PushTemplateReceiver#renderNotification";
                object = new PushTemplateReceiver$a(context, intent, (Bundle)notificationManager, this);
                try {
                    ((a)object2).c(string2, (Callable)object);
                }
                catch (Exception exception) {
                    exception.getLocalizedMessage();
                    ak2_1.b();
                }
            } else {
                ak2_1.b();
            }
        }
    }
}

