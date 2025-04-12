/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.widget.RemoteViews
 */
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class Gh1
extends ze3_0 {
    public uj3_1 b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final J42 a(Context var1_1, Bundle var2_2, int var3_3, J42 var4_4) {
        block57: {
            block50: {
                var5_5 = this;
                var6_6 = var1_1;
                var7_7 = var2_2;
                var8_8 = "context";
                Intrinsics.checkNotNullParameter(var1_1, var8_8);
                var9_17 = "extras";
                Intrinsics.checkNotNullParameter(var2_2, var9_17);
                var10_18 = "nb";
                var11_19 = var4_4;
                Intrinsics.checkNotNullParameter(var4_4, var10_18);
                var12_20 = super.a(var1_1, var2_2, var3_3, var4_4);
                var13_21 = this.b;
                var11_19 = var13_21.g;
                var14_22 = null;
                if (var11_19 == null || (var16_24 = kotlin.text.b.s((String)var11_19, (String)(var15_23 = "http"), false)) == 0) break block57;
                try {
                    var11_19 = xz3_0.l(var1_1, (String)var11_19);
                    if (var11_19 == null) {
                        var15_23 = "Failed to fetch big picture!";
                        var11_19 = new Exception((String)var15_23);
                        throw var11_19;
                    }
                    var15_23 = "pt_msg_summary";
                    var16_24 = var2_2.containsKey((String)var15_23);
                    if (var16_24 != 0) {
                        var15_23 = var13_21.e;
                        var17_25 = new U42();
                        var17_25.n((CharSequence)var15_23);
                        var17_25.m((Bitmap)var11_19);
                        break block50;
                    }
                    var17_25 = new U42();
                    var15_23 = var13_21.d;
                    var17_25.n((CharSequence)var15_23);
                    var17_25.m((Bitmap)var11_19);
                }
                catch (Throwable v3) {}
            }
lbl35:
            // 3 sources

            while (true) {
                block51: {
                    block52: {
                        var12_20.g((U42)var17_25);
                        var11_19 = var13_21.w;
                        if (var11_19 != null) {
                            Intrinsics.checkNotNull(var11_19);
                            var18_26 = var11_19.length();
                            if (var18_26 > 0) {
                                var19_27 = new HashSet<E>();
                                var20_28 = new Bundle();
                                var11_19 = var13_21.w;
                                var22_30 = 1;
                                var23_31 = 1.4E-45f;
                                var24_32 = 0;
                                var25_33 = "pt_input_reply";
                                var26_34 = null;
                                var27_35 = var11_19;
                                var21_29 = new GI2(var25_33, (CharSequence)var11_19, null, (boolean)var22_30, 0, var20_28, var19_27);
                                var28_36 = "build(...)";
                                Intrinsics.checkNotNullExpressionValue(var21_29, (String)var28_36);
                                var29_37 = var5_5.b;
                                var30_38 = 32;
                                var11_19 = var1_1;
                                var16_24 = var3_3;
                                var17_25 = var2_2;
                                var27_35 = var29_37;
                                var29_37 = null;
                                var14_22 = var28_36;
                                var31_39 = var30_38;
                                var32_40 = var21_29;
                                var21_29 = var27_35;
                                var11_19 = sq2_1.b(var1_1, var3_3, var2_2, false, var30_38, (uj3_1)var27_35);
                                Intrinsics.checkNotNull(var11_19);
                                var17_25 = var13_21.w;
                                var33_41 = 17301646;
                                var15_23 = new A42$a(var33_41, (CharSequence)var17_25, (PendingIntent)var11_19);
                                var11_19 = new ArrayList();
                                var15_23.f = var11_19;
                                var15_23.f.add(var32_40);
                                var18_26 = 1;
                                var34_42 = 1.4E-45f;
                                var15_23.d = var18_26;
                                var11_19 = var15_23.a();
                                Intrinsics.checkNotNullExpressionValue(var11_19, (String)var28_36);
                                var15_23 = var12_20.b;
                                var15_23.add(var11_19);
                            }
                        }
                        var11_19 = var13_21.z;
                        var15_23 = "pt_dismiss_on_click";
                        if (var11_19 != null) {
                            Intrinsics.checkNotNull(var11_19);
                            var18_26 = var11_19.length();
                            if (var18_26 > 0) {
                                var11_19 = var13_21.z;
                                var7_7.putString((String)var15_23, (String)var11_19);
                            }
                        }
                        var11_19 = var13_21.L;
                        var17_25 = "dl";
                        Intrinsics.checkNotNullParameter(var6_6, var8_8);
                        Intrinsics.checkNotNullParameter(var7_7, var9_17);
                        Intrinsics.checkNotNullParameter(var12_20, var10_18);
                        var8_8 = hg1_1.b((Context)var1_1).k;
                        var28_36 = CTNotificationIntentService.class;
                        if (var8_8 != null) {
                            try {
                                var28_36 = Class.forName(var8_8);
                                break block51;
                            }
                            catch (ClassNotFoundException v0) {
                                try {
                                    var8_8 = CTNotificationIntentService.MAIN_ACTION;
                                    break block51;
                                }
                                catch (ClassNotFoundException v1) {
                                    com.clevertap.android.sdk.b.c();
                                    break block52;
                                }
                            }
                        }
                        try {
                            var8_8 = CTNotificationIntentService.MAIN_ACTION;
                            break block51;
                        }
                        catch (ClassNotFoundException v2) {
                            com.clevertap.android.sdk.b.c();
                        }
                    }
                    var31_39 = 0;
                    var28_36 = null;
                }
                var31_39 = yz3_0.i(var6_6, var28_36);
                if (var11_19 == null) return var12_20;
                var35_43 = var11_19.length();
                if (var35_43 <= 0) return var12_20;
                var36_44 = var11_19.length();
                var37_45 = 0;
                var32_40 = null;
                while (var37_45 < var36_44) {
                    block54: {
                        block55: {
                            block61: {
                                block56: {
                                    block58: {
                                        block53: {
                                            try {
                                                var8_8 = var11_19.getJSONObject(var37_45);
                                                var9_17 = "l";
                                                var9_17 = var8_8.optString(var9_17);
                                                var10_18 = var8_8.optString((String)var17_25);
                                                var13_21 = "pt_ico";
                                                var13_21 = var8_8.optString((String)var13_21);
                                                var14_22 = "id";
                                                var14_22 = var8_8.optString((String)var14_22);
                                                var29_37 = "ac";
                                                var38_46 = 1;
                                                var33_41 = (int)var8_8.optBoolean((String)var29_37, (boolean)var38_46);
                                                Intrinsics.checkNotNull(var9_17);
                                                var35_43 = var9_17.length();
                                                if (var35_43 != 0) {
                                                    Intrinsics.checkNotNull(var14_22);
                                                    var35_43 = var14_22.length();
                                                    if (var35_43 != 0) break block53;
                                                }
                                                com.clevertap.android.sdk.b.c();
                                                var27_35 = var11_19;
                                                var26_34 = var15_23;
                                                var24_32 = var36_44;
                                                var38_46 = 1;
                                                var18_26 = 0;
                                                var34_42 = 0.0f;
                                                var11_19 = null;
                                                var36_44 = var3_3;
                                                break block54;
                                            }
                                            catch (Throwable var8_9) {
                                                var27_35 = var11_19;
lbl155:
                                                // 2 sources

                                                while (true) {
                                                    var26_34 = var15_23;
                                                    var24_32 = var36_44;
                                                    var18_26 = 0;
                                                    var34_42 = 0.0f;
                                                    var11_19 = null;
                                                    var36_44 = var3_3;
                                                    break block55;
                                                    break;
                                                }
                                            }
                                        }
                                        Intrinsics.checkNotNull(var13_21);
                                        var35_43 = var13_21.length();
                                        if (var35_43 != 0) break block58;
                                        var27_35 = var11_19;
                                        ** GOTO lbl189
                                    }
                                    try {
                                        var8_8 = var1_1.getResources();
                                        var5_5 = "drawable";
                                        var27_35 = var11_19;
                                    }
                                    catch (Throwable var8_11) {
                                        var27_35 = var11_19;
                                        break block56;
                                    }
                                    try {
                                        var11_19 = var1_1.getPackageName();
                                        var35_43 = var8_8.getIdentifier((String)var13_21, (String)var5_5, (String)var11_19);
                                        return var35_43;
                                    }
                                    finally {
                                        ** GOTO lbl191
                                    }
                                }
                                try {
                                    var8_8.getLocalizedMessage();
                                    com.clevertap.android.sdk.b.c();
lbl189:
                                    // 2 sources

                                    var35_43 = 0;
                                    var8_8 = null;
lbl191:
                                    // 2 sources

                                    var38_46 = Build.VERSION.SDK_INT;
                                    var18_26 = 31;
                                    var34_42 = 4.3E-44f;
                                    if (var38_46 < var18_26 && var33_41 != 0 && var31_39 != 0) {
                                        var18_26 = 1;
                                        var34_42 = 1.4E-45f;
                                    } else {
                                        var18_26 = 0;
                                        var34_42 = 0.0f;
                                        var11_19 = null;
                                    }
                                    var13_21 = var7_7.getString((String)var15_23);
                                    var26_34 = var15_23;
                                    var15_23 = "true";
                                    if (var18_26 == 0) {
                                    }
                                    ** GOTO lbl237
                                }
                                catch (Throwable var8_16) {
                                    ** continue;
                                }
                                var22_30 = (int)yb2_0.c(var2_2);
                                if (var22_30 == 0) ** GOTO lbl237
                                var22_30 = var18_26;
                                var23_31 = var34_42;
                                var11_19 = "remind";
                                var24_32 = var36_44;
                                var36_44 = 0;
                                var21_29 = null;
lbl-1000:
                                // 2 sources

                                {
                                    block60: {
                                        block59: {
                                            while (true) {
                                                var36_44 = var3_3;
lbl221:
                                                // 2 sources

                                                while (true) {
                                                    var18_26 = 0;
                                                    var34_42 = 0.0f;
                                                    var11_19 = null;
                                                    break block55;
                                                    break;
                                                }
                                                break;
                                            }
                                            catch (Throwable var8_12) {
                                                var24_32 = var36_44;
                                                var36_44 = 0;
                                                var21_29 = null;
                                                ** GOTO lbl-1000
                                            }
                                            ** try [egrp 9[TRYBLOCK] [39 : 1108->1504)] { 
lbl232:
                                            // 1 sources

                                            var18_26 = (int)StringsKt.F((CharSequence)var14_22, (CharSequence)var11_19, false);
                                            if (var18_26 == 0 || var13_21 == null || (var18_26 = (int)var13_21.equalsIgnoreCase((String)var15_23)) == 0 || var33_41 == 0 || var31_39 == 0) break block59;
                                            var18_26 = 1;
                                            var34_42 = 1.4E-45f;
                                            break block60;
lbl237:
                                            // 2 sources

                                            var22_30 = var18_26;
                                            var23_31 = var34_42;
                                            var24_32 = var36_44;
                                            var36_44 = 0;
                                            var21_29 = null;
                                        }
                                        var18_26 = var22_30;
                                        var34_42 = var23_31;
                                    }
                                    if (var18_26 == 0 && (var22_30 = (int)yb2_0.c(var2_2)) != 0 && var13_21 != null && (var16_24 = (int)var13_21.equalsIgnoreCase((String)var15_23)) != 0 && var33_41 != 0 && var31_39 != 0) {
                                        var18_26 = 1;
                                        var34_42 = 1.4E-45f;
                                    }
                                }
lbl250:
                                // 1 sources

                                catch (Throwable var8_13) {
                                    ** continue;
                                }
                                if (var18_26 != 0) {
                                    var13_21 = "com.clevertap.PUSH_EVENT";
                                    var15_23 = new Intent((String)var13_21);
                                    var13_21 = var1_1.getPackageName();
                                    var15_23.setPackage((String)var13_21);
                                    var13_21 = "ct_type";
                                    var21_29 = "com.clevertap.ACTION_BUTTON_CLICK";
                                    var15_23.putExtra((String)var13_21, (String)var21_29);
                                    Intrinsics.checkNotNull(var10_18);
                                    var36_44 = var10_18.length();
                                    if (var36_44 > 0) {
                                        var15_23.putExtra((String)var17_25, var10_18);
                                    }
                                } else {
                                    Intrinsics.checkNotNull(var10_18);
                                    var16_24 = var10_18.length();
                                    if (var16_24 > 0) {
                                        var21_29 = "android.intent.action.VIEW";
                                        var10_18 = Uri.parse((String)var10_18);
                                        var15_23 = new Intent((String)var21_29, (Uri)var10_18);
                                        xz3_0.s(var6_6, (Intent)var15_23);
                                    } else {
                                        var15_23 = var1_1.getPackageManager();
                                        var21_29 = var1_1.getPackageName();
                                        var15_23 = var15_23.getLaunchIntentForPackage((String)var21_29);
                                    }
                                }
                                if (var15_23 != null) {
                                    var15_23.putExtras(var7_7);
                                    var21_29 = "wzrk_acts";
                                    var15_23.removeExtra((String)var21_29);
                                    var21_29 = "actionId";
                                    var15_23.putExtra((String)var21_29, (String)var14_22);
                                    var21_29 = "autoCancel";
                                    var15_23.putExtra((String)var21_29, (boolean)var33_41);
                                    var29_37 = "wzrk_c2a";
                                    var15_23.putExtra((String)var29_37, (String)var14_22);
                                    var29_37 = "notificationId";
                                    var36_44 = var3_3;
                                    try {
                                        var15_23.putExtra((String)var29_37, var3_3);
                                        var33_41 = 0x24000000;
                                        var15_23.setFlags(var33_41);
                                    }
                                    catch (Throwable var8_14) {
                                        ** continue;
                                    }
                                } else {
                                    var36_44 = var3_3;
                                }
                                var29_37 = new Random();
                                var33_41 = var29_37.nextInt();
                                var39_47 = 23;
                                var38_46 = var38_46 >= var39_47 ? 0xC000000 : 0x8000000;
                                if (var18_26 == 0) break block61;
                                Intrinsics.checkNotNull(var15_23);
                                var5_5 = PendingIntent.getService((Context)var6_6, (int)var33_41, (Intent)var15_23, (int)var38_46);
                                var18_26 = 0;
                                var34_42 = 0.0f;
                                var11_19 = null;
                                ** GOTO lbl323
                            }
                            Intrinsics.checkNotNull(var15_23);
                            var18_26 = 0;
                            var34_42 = 0.0f;
                            var11_19 = null;
                            try {
                                var5_5 = PendingIntent.getActivity((Context)var6_6, (int)var33_41, (Intent)var15_23, (int)var38_46, null);
lbl323:
                                // 2 sources

                                var15_23 = var12_20.b;
                                var29_37 = new A42(var35_43, var9_17, (PendingIntent)var5_5);
                                var15_23.add(var29_37);
                            }
                            catch (Throwable var8_15) {}
lbl327:
                            // 2 sources

                            while (true) {
                                var38_46 = 1;
                                break block54;
                                break;
                            }
                        }
                        var8_8.getLocalizedMessage();
                        com.clevertap.android.sdk.b.c();
                        ** continue;
                    }
                    var37_45 += var38_46;
                    var5_5 = this;
                    var11_19 = var27_35;
                    var15_23 = var26_34;
                    var36_44 = var24_32;
                }
                return var12_20;
            }
            var17_25 = new U42();
            var17_25.e = var11_19 = J42.b(var13_21.d);
            ak2_1.c();
            ** GOTO lbl35
        }
        var17_25 = new U42();
        var17_25.e = var11_19 = J42.b(var13_21.d);
        ** while (true)
    }

    public final RemoteViews b(Context context, uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        return null;
    }

    public final PendingIntent c(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        return null;
    }

    public final PendingIntent d(Context context, Bundle bundle, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        uj3_1 uj3_12 = this.b;
        return sq2_1.b(context, n3, bundle, true, 31, uj3_12);
    }

    public final RemoteViews e(Context context, uj3_1 uj3_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        return null;
    }

    public final J42 f(J42 j42, RemoteViews object, RemoteViews remoteViews, String string2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Intrinsics.checkNotNullParameter(j42, "notificationBuilder");
        super.f(j42, (RemoteViews)object, remoteViews, string2, pendingIntent, pendingIntent2);
        object = J42.b(this.b.d);
        j42.f = object;
        Intrinsics.checkNotNullExpressionValue(j42, "setContentText(...)");
        return j42;
    }
}

