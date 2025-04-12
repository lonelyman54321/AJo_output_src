/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.clevertap.android.pushtemplates.PTPushNotificationReceiver;
import com.clevertap.android.pushtemplates.PushTemplateReceiver;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sq2
 */
public final class sq2_1 {
    public static Intent a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final PendingIntent a(Context context, Bundle bundle, String object, int n3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "extras");
        String string2 = "dl";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = CTNotificationIntentService.class;
        try {
            // empty try
        }
        catch (ClassNotFoundException classNotFoundException) {
            ak2_1.a();
            bl2 = false;
            object2 = null;
        }
        bl2 = yz3_0.i(context, object2);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 31;
        if (n4 < n7 && bl2) {
            Intent intent;
            n7 = 1;
            bundle.putBoolean("autoCancel", n7 != 0);
            bundle.putInt("notificationId", n3);
            object2 = "com.clevertap.PUSH_EVENT";
            a = intent = new Intent((String)object2);
            Intrinsics.checkNotNull(intent);
            intent.putExtras(bundle);
            bundle = a;
            Intrinsics.checkNotNull(bundle);
            bundle.putExtra(string2, (String)object);
            bundle = a;
            Intrinsics.checkNotNull(bundle);
            object = context.getPackageName();
            bundle.setPackage((String)object);
            bundle = a;
            Intrinsics.checkNotNull(bundle);
            object = "ct_type";
            String string3 = "com.clevertap.ACTION_BUTTON_CLICK";
            bundle.putExtra((String)object, string3);
            int n8 = 23;
            n8 = n4 >= n8 ? 0xC000000 : 0x8000000;
            object = new Random();
            int n10 = ((Random)object).nextInt();
            Intent intent2 = a;
            Intrinsics.checkNotNull(intent2);
            context = PendingIntent.getService((Context)context, (int)n10, (Intent)intent2, (int)n8);
            Intrinsics.checkNotNull(context);
            return context;
        }
        String string4 = "wzrk_dl";
        bundle.putString(string4, (String)object);
        context = np1_2.a(context, bundle);
        Intrinsics.checkNotNull(context);
        return context;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final PendingIntent b(Context var0, int var1_1, Bundle var2_2, boolean var3_3, int var4_4, uj3_1 var5_5) {
        block58: {
            block57: {
                var6_6 /* !! */  = var0;
                var7_7 /* !! */  = var1_1;
                var8_8 /* !! */  = var2_2;
                var9_9 = var5_5;
                Intrinsics.checkNotNullParameter(var0, "context");
                Intrinsics.checkNotNullParameter(var2_2, "extras");
                var10_10 = null;
                sq2_1.a = null;
                var11_11 = 31;
                var12_12 = PushTemplateReceiver.class;
                if (var3_3 && (var13_13 = Build.VERSION.SDK_INT) < var11_11) {
                    var15_15 = PTPushNotificationReceiver.class;
                    sq2_1.a = var14_14 /* !! */  = new Intent(var0, var15_15);
                } else if (!var3_3) {
                    sq2_1.a = var14_14 /* !! */  = new Intent(var6_6 /* !! */ , var12_12);
                }
                var13_13 = Build.VERSION.SDK_INT;
                var16_16 = 23;
                if (var13_13 >= var16_16) {
                    var16_16 = 0x4000000;
                } else {
                    var16_16 = 0;
                    var15_15 = null;
                }
                var17_17 = new Random();
                var18_18 = var17_17.nextInt();
                var19_19 = "right_swipe";
                var20_20 = "config";
                var21_21 = 2;
                var22_22 = "notificationId";
                var23_23 = 1;
                var24_24 = "wzrk_dl";
                switch (var4_4) {
                    default: {
                        var14_14 /* !! */  = "pt_current_position";
                        var19_19 = "pt_buy_now_dl";
                        switch (var4_4) {
                            default: {
                                var6_6 /* !! */  = new IllegalArgumentException("invalid pendingIntentType");
                                throw var6_6 /* !! */ ;
                            }
                            case 32: {
                                if (var9_9 != null) {
                                    var12_12 = var9_9.l;
                                } else {
                                    var25_25 = 0;
                                    var12_12 = null;
                                }
                                Intrinsics.checkNotNull(var12_12);
                                var25_25 = var12_12.size();
                                if (var25_25 > 0) {
                                    if (var9_9 != null) {
                                        var12_12 = var9_9.l;
                                    } else {
                                        var25_25 = 0;
                                        var12_12 = null;
                                    }
                                    Intrinsics.checkNotNull(var12_12);
                                    var12_12 = (String)var12_12.get(0);
                                    var8_8 /* !! */ .putString((String)var24_24, (String)var12_12);
                                }
                                var12_12 = sq2_1.a;
                                Intrinsics.checkNotNull(var12_12);
                                if (var9_9 != null) {
                                    var14_14 /* !! */  = var9_9.x;
                                } else {
                                    var13_13 = 0;
                                    var14_14 /* !! */  = null;
                                }
                                var15_15 = "pt_input_feedback";
                                var12_12.putExtra((String)var15_15, (String)var14_14 /* !! */ );
                                var12_12 = sq2_1.a;
                                Intrinsics.checkNotNull(var12_12);
                                if (var9_9 != null) {
                                    var14_14 /* !! */  = var9_9.y;
                                } else {
                                    var13_13 = 0;
                                    var14_14 /* !! */  = null;
                                }
                                var15_15 = "pt_input_auto_open";
                                var12_12.putExtra((String)var15_15, (String)var14_14 /* !! */ );
                                var12_12 = sq2_1.a;
                                Intrinsics.checkNotNull(var12_12);
                                var12_12.putExtra(var20_20, null);
                                var9_9 = var9_9.l;
                                if (var9_9 == null) {
                                    var8_8 /* !! */ .putString((String)var24_24, null);
                                }
                                var9_9 = sq2_1.a;
                                return sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
                            }
                            case 28: {
                                var26_27 = new Intent(var6_6 /* !! */ , (Class)var12_12);
                                return sq2_1.c(var6_6 /* !! */ , var26_27, var8_8 /* !! */ );
                            }
                            case 27: {
                                var24_24 = sq2_1.a;
                                Intrinsics.checkNotNull(var24_24);
                                var12_12 = "img1";
                                var24_24.putExtra((String)var12_12, (boolean)var23_23);
                                var24_24 = sq2_1.a;
                                Intrinsics.checkNotNull(var24_24);
                                var24_24.putExtra(var22_22, var7_7 /* !! */ );
                                var26_28 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_28);
                                if (var9_9 != null) {
                                    var9_9 = var9_9.l;
                                } else {
                                    var27_34 = false;
                                    var9_9 = null;
                                }
                                Intrinsics.checkNotNull(var9_9);
                                var9_9 = (String)var9_9.get(0);
                                var26_28.putExtra(var19_19, (String)var9_9);
                                var26_28 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_28);
                                var26_28.putExtra("buynow", (boolean)var23_23);
                                var26_28 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_28);
                                var26_28.putExtra(var20_20, null);
                                var26_28 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_28);
                                var26_28.putExtras(var8_8 /* !! */ );
                                var26_28 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_28);
                                return PendingIntent.getBroadcast((Context)var6_6 /* !! */ , (int)var18_18, (Intent)var26_28, (int)var16_16);
                            }
                            case 26: {
                                if (var9_9 != null) {
                                    var10_10 = var9_9.l;
                                }
                                Intrinsics.checkNotNull(var10_10);
                                var9_9 = (String)var10_10.get(var21_21);
                                var8_8 /* !! */ .putString((String)var24_24, (String)var9_9);
                                var9_9 = sq2_1.a;
                                return sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
                            }
                            case 25: {
                                if (var9_9 != null) {
                                    var10_10 = var9_9.l;
                                }
                                Intrinsics.checkNotNull(var10_10);
                                var9_9 = (String)var10_10.get(var23_23);
                                var8_8 /* !! */ .putString((String)var24_24, (String)var9_9);
                                var9_9 = sq2_1.a;
                                return sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
                            }
                            case 24: {
                                if (var9_9 != null) {
                                    var10_10 = var9_9.l;
                                }
                                Intrinsics.checkNotNull(var10_10);
                                var9_9 = (String)var10_10.get(0);
                                var8_8 /* !! */ .putString((String)var24_24, (String)var9_9);
                                var9_9 = sq2_1.a;
                                return sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
                            }
                            case 23: {
                                var24_24 = sq2_1.a;
                                Intrinsics.checkNotNull(var24_24);
                                var24_24.putExtras(var8_8 /* !! */ );
                                var8_8 /* !! */  = sq2_1.a;
                                Intrinsics.checkNotNull(var8_8 /* !! */ );
                                var8_8 /* !! */ .putExtra((String)var14_14 /* !! */ , var21_21);
                                var8_8 /* !! */  = sq2_1.a;
                                Intrinsics.checkNotNull(var8_8 /* !! */ );
                                var8_8 /* !! */ .putExtra(var22_22, var7_7 /* !! */ );
                                var26_29 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_29);
                                if (var9_9 != null) {
                                    var10_10 = var9_9.l;
                                }
                                Intrinsics.checkNotNull(var10_10);
                                var8_8 /* !! */  = (String)var10_10.get(var21_21);
                                var26_29.putExtra(var19_19, (String)var8_8 /* !! */ );
                                var26_29 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_29);
                                return PendingIntent.getBroadcast((Context)var6_6 /* !! */ , (int)var18_18, (Intent)var26_29, (int)var16_16);
                            }
                            case 22: {
                                var24_24 = sq2_1.a;
                                Intrinsics.checkNotNull(var24_24);
                                var24_24.putExtras(var8_8 /* !! */ );
                                var8_8 /* !! */  = sq2_1.a;
                                Intrinsics.checkNotNull(var8_8 /* !! */ );
                                var8_8 /* !! */ .putExtra((String)var14_14 /* !! */ , var23_23);
                                var8_8 /* !! */  = sq2_1.a;
                                Intrinsics.checkNotNull(var8_8 /* !! */ );
                                var8_8 /* !! */ .putExtra(var22_22, var7_7 /* !! */ );
                                var26_30 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_30);
                                if (var9_9 != null) {
                                    var10_10 = var9_9.l;
                                }
                                Intrinsics.checkNotNull(var10_10);
                                var8_8 /* !! */  = (String)var10_10.get(var23_23);
                                var26_30.putExtra(var19_19, (String)var8_8 /* !! */ );
                                var26_30 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_30);
                                return PendingIntent.getBroadcast((Context)var6_6 /* !! */ , (int)var18_18, (Intent)var26_30, (int)var16_16);
                            }
                            case 21: {
                                var24_24 = sq2_1.a;
                                Intrinsics.checkNotNull(var24_24);
                                var24_24.putExtras(var8_8 /* !! */ );
                                var8_8 /* !! */  = sq2_1.a;
                                Intrinsics.checkNotNull(var8_8 /* !! */ );
                                var8_8 /* !! */ .putExtra((String)var14_14 /* !! */ , 0);
                                var8_8 /* !! */  = sq2_1.a;
                                Intrinsics.checkNotNull(var8_8 /* !! */ );
                                var8_8 /* !! */ .putExtra(var22_22, var7_7 /* !! */ );
                                var26_31 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_31);
                                if (var9_9 != null) {
                                    var10_10 = var9_9.l;
                                }
                                Intrinsics.checkNotNull(var10_10);
                                var8_8 /* !! */  = (String)var10_10.get(0);
                                var26_31.putExtra(var19_19, (String)var8_8 /* !! */ );
                                var26_31 = sq2_1.a;
                                Intrinsics.checkNotNull(var26_31);
                                return PendingIntent.getBroadcast((Context)var6_6 /* !! */ , (int)var18_18, (Intent)var26_31, (int)var16_16);
                            }
                            case 20: 
                            case 29: 
                            case 30: 
                            case 31: {
                                if (var9_9 == null) break block57;
                            }
                        }
                    }
                    case 13: {
                        var8_8 /* !! */ .putString((String)var24_24, null);
                        var9_9 = sq2_1.a;
                        return sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
                    }
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: {
                        switch (var4_4) {
                            default: {
                                var21_21 = 5;
                                break;
                            }
                            case 11: {
                                var21_21 = 4;
                                break;
                            }
                            case 10: {
                                var21_21 = 3;
                                break;
                            }
                            case 8: {
                                var21_21 = 1;
                            }
                            case 9: 
                        }
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9.putExtras(var8_8 /* !! */ );
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var12_12 = "click";
                        var24_24 = new StringBuilder((String)var12_12);
                        var24_24.append(var21_21);
                        var24_24 = var24_24.toString();
                        var9_9.putExtra((String)var24_24, (boolean)var23_23);
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var24_24 = "clickedStar";
                        var9_9.putExtra((String)var24_24, var21_21);
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9.putExtra(var22_22, var7_7 /* !! */ );
                        var26_32 /* !! */  = sq2_1.a;
                        Intrinsics.checkNotNull(var26_32 /* !! */ );
                        var26_32 /* !! */ .putExtra(var20_20, null);
                        var26_32 /* !! */  = (Intent)var8_8 /* !! */ .getIntArray("requestCodes");
                        if (var26_32 /* !! */  != null) {
                            var7_7 /* !! */  = (int)var26_32 /* !! */ [var21_21 -= var23_23];
                            var10_10 = var7_7 /* !! */ ;
                        }
                        Intrinsics.checkNotNull(var10_10);
                        var7_7 /* !! */  = var10_10.intValue();
                        var8_8 /* !! */  = sq2_1.a;
                        Intrinsics.checkNotNull(var8_8 /* !! */ );
                        return PendingIntent.getBroadcast((Context)var6_6 /* !! */ , (int)var7_7 /* !! */ , (Intent)var8_8 /* !! */ , (int)var16_16);
                    }
                    case 7: {
                        if (var9_9 != null) {
                            var10_10 = var9_9.s;
                        }
                        var8_8 /* !! */ .putString((String)var24_24, (String)var10_10);
                        var27_35 = 31;
                        if (var13_13 < var27_35) {
                            var9_9 = sq2_1.a;
                            var6_6 /* !! */  = sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
                        } else {
                            var6_6 /* !! */  = np1_2.a(var6_6 /* !! */ , var8_8 /* !! */ );
                        }
                        return var6_6 /* !! */ ;
                    }
                    case 6: {
                        var26_33 = new Intent(var6_6 /* !! */ , var12_12);
                        return sq2_1.c(var6_6 /* !! */ , var26_33, var8_8 /* !! */ );
                    }
                    case 5: {
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9.putExtra(var19_19, false);
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9.putExtra(var22_22, var7_7 /* !! */ );
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9.putExtras(var8_8 /* !! */ );
                        var9_9 = sq2_1.a;
                        return sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
                    }
                    case 4: {
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9.putExtra(var19_19, (boolean)var23_23);
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9.putExtra(var22_22, var7_7 /* !! */ );
                        var9_9 = sq2_1.a;
                        Intrinsics.checkNotNull(var9_9);
                        var9_9.putExtras(var8_8 /* !! */ );
                        var9_9 = sq2_1.a;
                        return sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
                    }
                    case 1: 
                    case 2: 
                    case 3: {
                        if (var9_9 == null) break block57;
                    }
                }
                var12_12 = var9_9.l;
                break block58;
            }
            var25_26 = 0;
            var12_12 = null;
        }
        if (var12_12 == null) ** GOTO lbl-1000
        var12_12 = var9_9.l;
        Intrinsics.checkNotNull(var12_12);
        var25_26 = var12_12.size();
        if (var25_26 > 0) {
            var9_9 = var9_9.l;
            Intrinsics.checkNotNull(var9_9);
            var9_9 = (String)var9_9.get(0);
            var8_8 /* !! */ .putString((String)var24_24, (String)var9_9);
            var9_9 = sq2_1.a;
            var6_6 /* !! */  = sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
        } else lbl-1000:
        // 2 sources

        {
            if ((var9_9 = var8_8 /* !! */ .get((String)var24_24)) == null) {
                var8_8 /* !! */ .putString((String)var24_24, null);
            }
            var9_9 = sq2_1.a;
            var6_6 /* !! */  = sq2_1.d(var6_6 /* !! */ , var7_7 /* !! */ , var8_8 /* !! */ , (Intent)var9_9, var18_18);
        }
        return var6_6 /* !! */ ;
    }

    public static final PendingIntent c(Context context, Intent intent, Bundle object) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "extras");
        Object object2 = "intent";
        Intrinsics.checkNotNullParameter(intent, (String)object2);
        intent.putExtras(object);
        object = "pt_dismiss_intent";
        intent.putExtra((String)object, true);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        n3 = n3 >= n4 ? 0x14000000 : 0x10000000;
        object2 = new Random();
        n4 = ((Random)object2).nextInt();
        context = PendingIntent.getBroadcast((Context)context, (int)n4, (Intent)intent, (int)n3);
        Intrinsics.checkNotNullExpressionValue(context, "getBroadcast(...)");
        return context;
    }

    public static final PendingIntent d(Context context, int n3, Bundle object, Intent intent, int n4) {
        int n7;
        String string2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "extras");
        Object object2 = object.get("wzrk_dl");
        String string3 = "notificationId";
        object.putInt(string3, n3);
        if (object2 != null) {
            string2 = "default_dl";
            n7 = 1;
            object.putBoolean(string2, n7 != 0);
        }
        if (intent == null) {
            context = np1_2.a(context, object);
            Intrinsics.checkNotNullExpressionValue(context, "getActivityIntent(...)");
            return context;
        }
        intent.putExtras(object);
        intent.removeExtra("wzrk_acts");
        string2 = "wzrk_from";
        object = "CTPushNotificationReceiver";
        intent.putExtra(string2, (String)object);
        intent.setFlags(0x34000000);
        n3 = Build.VERSION.SDK_INT;
        int n8 = 23;
        n7 = 0x8000000;
        if (n3 >= n8) {
            string2 = "pt_input_feedback";
            n3 = (int)(intent.hasExtra(string2) ? 1 : 0);
            n3 = n3 != 0 ? 0x2000000 : 0x4000000;
            n7 |= n3;
        }
        context = PendingIntent.getBroadcast((Context)context, (int)n4, (Intent)intent, (int)n7);
        Intrinsics.checkNotNullExpressionValue(context, "getBroadcast(...)");
        return context;
    }
}

