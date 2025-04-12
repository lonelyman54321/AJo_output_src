/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityOptions
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.media.RingtoneManager
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  org.json.JSONArray
 */
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

public final class F80
implements ec1_1,
ar_1 {
    public String a;
    public String b;
    public int c;

    public final String a(Context context, Bundle object) {
        String string2 = "nt";
        String string3 = "";
        boolean bl2 = ((String)(object = object.getString(string2, string3))).isEmpty();
        if (bl2) {
            context = context.getApplicationInfo();
            object = context.name;
        }
        this.b = object;
        return object;
    }

    public final void b(int n3, Context context) {
        this.c = n3;
    }

    public final Object c(Bundle bundle) {
        return bundle.get("wzrk_ck");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final J42 d(Bundle var1_1, Context var2_2, J42 var3_3, CleverTapInstanceConfig var4_4, int var5_5) {
        block54: {
            block55: {
                block53: {
                    block52: {
                        block61: {
                            var6_6 = this;
                            var7_7 = var1_1;
                            var8_8 = var2_2;
                            var9_9 = var3_3;
                            var10_10 = "wzrk_nms";
                            var11_19 /* !! */  = "wzrk_bp";
                            var12_20 = var1_1.getString((String)var11_19 /* !! */ );
                            var13_21 = "wzrk_bpds";
                            if (var12_20 != null && (var14_22 = var12_20.startsWith((String)(var11_19 /* !! */  = "http"))) != 0) {
                                var15_23 /* !! */  = rs0$a_0.INIT_ERROR;
                                var11_19 /* !! */  = "status";
                                Intrinsics.checkNotNullParameter((Object)var15_23 /* !! */ , (String)var11_19 /* !! */ );
                                var17_25 = 0;
                                var18_26 = null;
                                var19_27 = null;
                                var20_28 = -1;
                                var22_29 = var16_24;
                                var16_24 = new rs0_1(null, var15_23 /* !! */ , var20_28, null);
                                var11_19 /* !! */  = yz3_0.a;
                                var17_25 = 32;
                                var24_31 = null;
                                var25_32 = 0;
                                var22_29 = null;
                                var20_28 = 5000L;
                                var11_19 /* !! */  = var23_30;
                                var19_27 = var2_2;
                                var15_23 /* !! */  = var4_4;
                                var26_33 = var23_30;
                                var27_34 = 0;
                                var23_30 = null;
                                var11_19 /* !! */ ((String)var12_20, false, var2_2, var4_4, var20_28, var17_25, 0);
                                var11_19 /* !! */  = U91$a.DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT;
                                var11_19 /* !! */  = u91_0.a((U91$a)var11_19 /* !! */ , (ox_0)var26_33);
                                var12_20 = var11_19 /* !! */ .a;
                                if (var12_20 == null) {
                                    var12_20 = "Failed to fetch big picture!";
                                    var10_10 = new Exception((String)var12_20);
                                    throw var10_10;
                                }
                                var22_29 = var4_4.b();
                                var22_29.a();
                                var22_29 = var11_19 /* !! */ .b;
                                var22_29 = var22_29.getStatusValue();
                                var1_1.putString(var13_21, (String)var22_29);
                                var25_32 = var1_1.containsKey((String)var10_10);
                                if (var25_32 != 0) {
                                    var10_10 = var1_1.getString((String)var10_10);
                                    var22_29 = new U42();
                                    var22_29.n((CharSequence)var10_10);
                                    var22_29.m((Bitmap)var12_20);
                                    break block52;
                                } else {
                                    var22_29 = new U42();
                                    var10_10 = this.a;
                                    var22_29.n((CharSequence)var10_10);
                                    var22_29.m((Bitmap)var12_20);
                                }
                                break block52;
                            }
                            var22_29 = new U42();
                            var10_10 = J42.b(var6_6.a);
                            var22_29.e = var10_10;
                            var10_10 = rs0$a_0.NO_IMAGE.getStatusValue();
                            var7_7.putString(var13_21, (String)var10_10);
                            break block52;
                            catch (Throwable v0) {}
                            var11_19 /* !! */  = var16_24;
                            break block61;
                            catch (Throwable v1) {}
                        }
                        var22_29 = new U42();
                        var10_10 = J42.b(var6_6.a);
                        var22_29.e = var10_10;
                        var10_10 = var11_19 /* !! */ .b.getStatusValue();
                        var7_7.putString(var13_21, (String)var10_10);
                        var10_10 = var4_4.b();
                        var10_10.getClass();
                        com.clevertap.android.sdk.b.m();
                    }
                    var28_35 = Build.VERSION.SDK_INT;
                    var14_22 = 26;
                    if (var28_35 >= var14_22 && (var14_22 = (int)var7_7.containsKey((String)(var10_10 = "wzrk_st"))) != 0) {
                        var10_10 = var7_7.getString((String)var10_10);
                        var3_3.getClass();
                        var10_10 = J42.b((CharSequence)var10_10);
                        var9_9.q = var10_10;
                    }
                    if ((var14_22 = (int)var7_7.containsKey((String)(var10_10 = "wzrk_clr"))) != 0) {
                        var10_10 = var7_7.getString((String)var10_10);
                        var9_9.D = var28_35 = Color.parseColor((String)var10_10);
                        var14_22 = 1;
                        var9_9.z = var14_22;
                        var9_9.A = var14_22;
                    }
                    var10_10 = var6_6.b;
                    var3_3.getClass();
                    var10_10 = J42.b((CharSequence)var10_10);
                    var9_9.e = var10_10;
                    var10_10 = J42.b(var6_6.a);
                    var9_9.f = var10_10;
                    var10_10 = np1_2.b(var8_8, var7_7);
                    var9_9.g = var10_10;
                    var9_9.d(16, true);
                    var9_9.g((U42)var22_29);
                    var28_35 = var6_6.c;
                    var11_19 /* !! */  = var9_9.P;
                    var11_19 /* !! */ .icon = var28_35;
                    var26_33 = "ico";
                    var12_20 = var7_7.getString((String)var26_33);
                    var10_10 = var7_7.getString("wzrk_hide_large_icon");
                    var13_21 = "true";
                    var28_35 = (int)var13_21.equalsIgnoreCase((String)var10_10);
                    var14_22 = 1;
                    if ((var28_35 ^= var14_22) != 0) {
                        var10_10 = yz3_0.a;
                        var17_25 = 32;
                        var27_34 = 0;
                        var23_30 = null;
                        var25_32 = 1;
                        var20_28 = 2000L;
                        var11_19 /* !! */  = var10_10;
                        var19_27 = var2_2;
                        var15_23 /* !! */  = var4_4;
                        var10_10 = new ox_0((String)var12_20, (boolean)var25_32, var2_2, var4_4, var20_28, var17_25, 0);
                        var11_19 /* !! */  = U91$a.DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT;
                        var10_10 = u91_0.a((U91$a)var11_19 /* !! */ , (ox_0)var10_10).a;
                        var9_9.e((Bitmap)var10_10);
                    }
                    if ((var10_10 = var7_7.getString((String)(var11_19 /* !! */  = "wzrk_acts"))) != null) {
                        try {
                            var22_29 = new JSONArray((String)var10_10);
                            break block53;
                        }
                        catch (Throwable var10_11) {
                            var22_29 = var4_4.b();
                            var15_23 /* !! */  = "error parsing notification actions: ";
                            var19_27 = new StringBuilder((String)var15_23 /* !! */ );
                            var10_10 = var10_11.getLocalizedMessage();
                            var19_27.append((String)var10_10);
                            var10_10 = var19_27.toString();
                            var22_29.getClass();
                            com.clevertap.android.sdk.b.f((String)var10_10);
                        }
                    }
                    var25_32 = 0;
                    var22_29 = null;
                }
                var19_27 = "dl";
                var10_10 = hg1_1.b((Context)var2_2).k;
                var15_23 /* !! */  = CTNotificationIntentService.class;
                if (var10_10 != null) {
                    try {
                        var15_23 /* !! */  = Class.forName((String)var10_10);
                        break block54;
                    }
                    catch (ClassNotFoundException v2) {
                        try {
                            var10_10 = CTNotificationIntentService.MAIN_ACTION;
                            break block54;
                        }
                        catch (ClassNotFoundException v3) {
                            com.clevertap.android.sdk.b.c();
                            break block55;
                        }
                    }
                }
                try {
                    var10_10 = CTNotificationIntentService.MAIN_ACTION;
                    break block54;
                }
                catch (ClassNotFoundException v4) {
                    com.clevertap.android.sdk.b.c();
                }
            }
            var29_36 = 0;
            var15_23 /* !! */  = null;
        }
        var29_36 = yz3_0.i(var8_8, (Class)var15_23 /* !! */ );
        if (var22_29 == null) return var9_9;
        var28_35 = var22_29.length();
        if (var28_35 <= 0) return var9_9;
        var30_37 = 0;
        while (var30_37 < (var28_35 = var22_29.length())) {
            block60: {
                block59: {
                    block62: {
                        var10_10 = var22_29.getJSONObject(var30_37);
                        var18_26 = "l";
                        var18_26 = var10_10.optString(var18_26);
                        var23_30 = var10_10.optString((String)var19_27);
                        var12_20 = var10_10.optString((String)var26_33);
                        var31_38 = "id";
                        var31_38 = var10_10.optString(var31_38);
                        var6_6 = "ac";
                        var24_31 = var22_29;
                        var25_32 = 1;
                        var32_39 = (int)var10_10.optBoolean((String)var6_6, (boolean)var25_32);
                        var28_35 = (int)var18_26.isEmpty();
                        if (var28_35 == 0 && (var28_35 = (int)var31_38.isEmpty()) == 0) break block62;
                        var33_40 = var29_36;
                        var34_41 = var26_33;
                        var29_36 = var5_5;
                        ** GOTO lbl318
                    }
                    var28_35 = (int)var12_20.isEmpty();
                    if (var28_35 != 0) ** GOTO lbl217
                    {
                        catch (Throwable var10_17) {}
                    }
                    var10_10 = var2_2.getResources();
                    var22_29 = "drawable";
                    var34_41 = var26_33;
                    try {
                        var26_33 = var2_2.getPackageName();
                        var28_35 = var10_10.getIdentifier((String)var12_20, (String)var22_29, (String)var26_33);
                        return var28_35;
                    }
                    finally {
                        ** GOTO lbl220
                    }
                    catch (Throwable var10_13) {
                        var34_41 = var26_33;
                    }
                    try {
                        var10_10.getLocalizedMessage();
                        com.clevertap.android.sdk.b.c();
                        ** GOTO lbl218
                    }
                    catch (Throwable var10_14) {
                        block57: {
                            block58: {
                                block56: {
                                    var33_40 = var29_36;
                                    break block57;
lbl217:
                                    // 1 sources

                                    var34_41 = var26_33;
lbl218:
                                    // 2 sources

                                    var28_35 = 0;
                                    var10_10 = null;
lbl220:
                                    // 2 sources

                                    var35_42 = Build.VERSION.SDK_INT;
                                    var25_32 = 31;
                                    if (var35_42 < var25_32 && var32_39 != 0 && var29_36 != 0) {
                                        var25_32 = 1;
                                    } else {
                                        var25_32 = 0;
                                        var22_29 = null;
                                    }
                                    var26_33 = "pt_dismiss_on_click";
                                    var26_33 = var7_7.getString((String)var26_33);
                                    if (var25_32 == 0 && (var36_43 = (int)yb2_0.c(var1_1)) != 0) {
                                        var36_43 = var25_32;
                                        var22_29 = "remind";
                                        var25_32 = (int)var31_38.contains((CharSequence)var22_29);
                                        if (var25_32 != 0 && var26_33 != null && (var25_32 = (int)var26_33.equalsIgnoreCase(var13_21)) != 0 && var32_39 != 0 && var29_36 != 0) {
                                            var36_43 = 1;
                                        }
                                    } else {
                                        var36_43 = var25_32;
                                    }
                                    if (var36_43 == 0 && (var25_32 = (int)yb2_0.c(var1_1)) != 0 && var26_33 != null && (var25_32 = (int)var26_33.equalsIgnoreCase(var13_21)) != 0 && var32_39 != 0 && var29_36 != 0) {
                                        var36_43 = 1;
                                    }
                                    if (var36_43 != 0) {
                                        var26_33 = "com.clevertap.PUSH_EVENT";
                                        var22_29 = new Intent((String)var26_33);
                                        var26_33 = var2_2.getPackageName();
                                        var22_29.setPackage((String)var26_33);
                                        var26_33 = "ct_type";
                                        var33_40 = var29_36;
                                        var15_23 /* !! */  = "com.clevertap.ACTION_BUTTON_CLICK";
                                        try {
                                            var22_29.putExtra((String)var26_33, (String)var15_23 /* !! */ );
                                            var29_36 = (int)var23_30.isEmpty();
                                            if (var29_36 == 0) {
                                                var22_29.putExtra((String)var19_27, (String)var23_30);
                                            }
                                            break block56;
                                        }
                                        catch (Throwable var10_15) {
                                            break block57;
                                        }
                                    }
                                    var33_40 = var29_36;
                                    var25_32 = (int)var23_30.isEmpty();
                                    if (var25_32 == 0) {
                                        var15_23 /* !! */  = "android.intent.action.VIEW";
                                        var23_30 = Uri.parse((String)var23_30);
                                        var22_29 = new Intent((String)var15_23 /* !! */ , (Uri)var23_30);
                                        yz3_0.k(var8_8, (Intent)var22_29);
                                    } else {
                                        var22_29 = var2_2.getPackageManager();
                                        var15_23 /* !! */  = var2_2.getPackageName();
                                        var22_29 = var22_29.getLaunchIntentForPackage((String)var15_23 /* !! */ );
                                    }
                                }
                                if (var22_29 != null) {
                                    var22_29.putExtras(var7_7);
                                    var22_29.removeExtra((String)var11_19 /* !! */ );
                                    var15_23 /* !! */  = "actionId";
                                    var22_29.putExtra((String)var15_23 /* !! */ , var31_38);
                                    var15_23 /* !! */  = "autoCancel";
                                    var22_29.putExtra((String)var15_23 /* !! */ , (boolean)var32_39);
                                    var6_6 = "wzrk_c2a";
                                    var22_29.putExtra((String)var6_6, var31_38);
                                    var6_6 = "notificationId";
                                    var29_36 = var5_5;
                                    try {
                                        var22_29.putExtra((String)var6_6, var5_5);
                                        var32_39 = 0x24000000;
                                        var22_29.setFlags(var32_39);
                                        break block58;
                                    }
                                    catch (Throwable var10_16) {
                                        break block59;
                                    }
                                }
                                var29_36 = var5_5;
                            }
                            var6_6 = new Random();
                            var32_39 = var6_6.nextInt();
                            var37_44 = 23;
                            var37_44 = var35_42 >= var37_44 ? 0xC000000 : 0x8000000;
                            if (var36_43 != 0) {
                                var6_6 = PendingIntent.getService((Context)var8_8, (int)var32_39, (Intent)var22_29, (int)var37_44);
                            } else {
                                var27_34 = 34;
                                if (var35_42 >= var27_34) {
                                    var12_20 = o2.a();
                                    var12_20 = dc1_1.a((ActivityOptions)var12_20);
                                    var12_20 = var12_20.toBundle();
                                } else {
                                    var35_42 = 0;
                                    var12_20 = null;
                                }
                                var6_6 = PendingIntent.getActivity((Context)var8_8, (int)var32_39, (Intent)var22_29, (int)var37_44, (Bundle)var12_20);
                            }
                            var12_20 = var9_9.b;
                            var22_29 = new A42(var28_35, var18_26, (PendingIntent)var6_6);
                            var12_20.add(var22_29);
                            break block60;
                            ** GOTO lbl-1000
lbl318:
                            // 1 sources

                            com.clevertap.android.sdk.b.c();
                            break block60;
                            catch (Throwable var10_18) {
                                var24_31 = var22_29;
                            }
lbl-1000:
                            // 2 sources

                            {
                                var33_40 = var29_36;
                                var34_41 = var26_33;
                            }
                        }
                        var29_36 = var5_5;
                    }
                }
                var10_10.getLocalizedMessage();
                com.clevertap.android.sdk.b.c();
            }
            var32_39 = 1;
            var30_37 += var32_39;
            var6_6 = this;
            var22_29 = var24_31;
            var26_33 = var34_41;
            var29_36 = var33_40;
        }
        return var9_9;
    }

    public final J42 e(Context object, Bundle object2, J42 j42, CleverTapInstanceConfig cleverTapInstanceConfig) {
        block24: {
            block26: {
                block28: {
                    boolean bl2;
                    int n4;
                    String string2;
                    Object object3;
                    block25: {
                        object3 = "wzrk_sound";
                        string2 = "android.resource://";
                        n4 = object2.containsKey((String)object3);
                        if (n4 == 0) break block24;
                        object2 = object2.get((String)object3);
                        boolean n3 = object2 instanceof Boolean;
                        n4 = 2;
                        if (n3) {
                            object3 = object2;
                            object3 = (Boolean)object2;
                            boolean bl3 = (Boolean)object3;
                            if (!bl3) break block25;
                            object = RingtoneManager.getDefaultUri((int)n4);
                            break block26;
                        }
                    }
                    if (bl2 = object2 instanceof String) {
                        block30: {
                            block29: {
                                block27: {
                                    object2 = (String)object2;
                                    object3 = "true";
                                    boolean bl4 = ((String)object2).equals(object3);
                                    if (!bl4) break block27;
                                    object = RingtoneManager.getDefaultUri((int)n4);
                                    break block26;
                                }
                                boolean bl5 = ((String)object2).isEmpty();
                                if (bl5) break block28;
                                object3 = ".mp3";
                                boolean bl6 = ((String)object2).contains((CharSequence)object3);
                                if (bl6) break block29;
                                object3 = ".ogg";
                                boolean bl7 = ((String)object2).contains((CharSequence)object3);
                                if (bl7) break block29;
                                object3 = ".wav";
                                boolean bl8 = ((String)object2).contains((CharSequence)object3);
                                if (!bl8) break block30;
                            }
                            int n3 = ((String)object2).length() + -4;
                            n4 = 0;
                            object2 = ((String)object2).substring(0, n3);
                        }
                        object3 = new StringBuilder(string2);
                        object = object.getPackageName();
                        ((StringBuilder)object3).append((String)object);
                        object = "/raw/";
                        ((StringBuilder)object3).append((String)object);
                        ((StringBuilder)object3).append((String)object2);
                        object = ((StringBuilder)object3).toString();
                        object = Uri.parse((String)object);
                        break block26;
                    }
                }
                object = null;
            }
            if (object == null) break block24;
            try {
                j42.f((Uri)object);
            }
            catch (Throwable throwable) {
                object = cleverTapInstanceConfig.b();
                object.getClass();
                com.clevertap.android.sdk.b.g();
            }
        }
        return j42;
    }

    public final String f(Bundle object) {
        object = object.getString("nm");
        this.a = object;
        return object;
    }
}

