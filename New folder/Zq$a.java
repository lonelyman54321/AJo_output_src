/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.net.Uri
 *  android.os.IBinder
 *  android.os.Looper
 */
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class Zq$a {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zq_0 a(Context var0) {
        block39: {
            block34: {
                block33: {
                    block32: {
                        var1_1 /* !! */  = var0;
                        var2_2 = 1;
                        var3_3 = 0;
                        var4_4 /* !! */  = null;
                        var5_5 = "limit_tracking";
                        var6_6 = "androidid";
                        var7_7 = "aid";
                        Intrinsics.checkNotNullParameter(var0, "context");
                        var8_8 = null;
                        try {
                            var9_9 = Zq$a.b(var0);
                            if (!var9_9) break block32;
                            var11_11 = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
                            var12_12 = "getAdvertisingIdInfo";
                            var13_13 /* !! */  = new Class[var2_2];
                            var10_10 = Context.class;
                            var13_13 /* !! */ [0] = var10_10;
                            if ((var11_11 = lz3_0.s((String)var11_11, (String)var12_12, var13_13 /* !! */ )) == null) break block32;
                            var12_12 = new Object[var2_2];
                            var12_12[0] = var0;
                            if ((var11_11 = lz3_0.v(null, (Method)var11_11, var12_12)) == null) break block32;
                            var12_12 = var11_11.getClass();
                            var13_13 /* !! */  = "getId";
                            var10_10 = new Class[]{};
                            var12_12 = lz3_0.r((Class)var12_12, (String)var13_13 /* !! */ , (Class[])var10_10);
                            var13_13 /* !! */  = var11_11.getClass();
                            var10_10 = "isLimitAdTrackingEnabled";
                            var14_14 = new Class[]{};
                            var13_13 /* !! */  = lz3_0.r((Class)var13_13 /* !! */ , (String)var10_10, (Class[])var14_14);
                            if (var12_12 == null || var13_13 /* !! */  == null) break block32;
                            var10_10 = new zq_0();
                            var14_14 = new Object[]{};
                            var12_12 = lz3_0.v(var11_11, (Method)var12_12, var14_14);
                            var12_12 = (String)var12_12;
                            var10_10.a = var12_12;
                            var12_12 = new Object[]{};
                            var11_11 = lz3_0.v(var11_11, (Method)var13_13 /* !! */ , var12_12);
                            if ((var11_11 = (Boolean)var11_11) != null) {
                                var9_9 = var11_11.booleanValue();
                            } else {
                                var9_9 = false;
                                var11_11 = null;
                            }
                            var10_10.e = var9_9;
                            break block33;
                        }
                        catch (Exception v0) {
                            var11_11 = FacebookSdk.a;
                        }
                    }
                    var10_10 = null;
                }
                if (var10_10 != null) ** GOTO lbl77
                var9_9 = Zq$a.b(var0);
                if (!var9_9) break block34;
                var11_11 = new Zq$c();
                var12_12 = new Intent("com.google.android.gms.ads.identifier.service.START");
                var13_13 /* !! */  = "com.google.android.gms";
                var12_12.setPackage((String)var13_13 /* !! */ );
                try {
                    if ((var2_2 = (int)var1_1 /* !! */ .bindService((Intent)var12_12, (ServiceConnection)var11_11, var2_2)) == 0) break block34;
                }
                catch (SecurityException v1) {}
                var12_12 = var11_11.a();
                var15_15 = new Zq$b((IBinder)var12_12);
                var12_12 = new zq_0();
                var12_12.a = var13_13 /* !! */  = var15_15.c();
                var2_2 = (int)var15_15.d();
                var12_12.e = var2_2;
                var1_1 /* !! */ .unbindService((ServiceConnection)var11_11);
                var10_10 = var12_12;
                ** GOTO lbl74
            }
lbl72:
            // 2 sources

            while (true) {
                block35: {
                    block38: {
                        block36: {
                            block37: {
                                block40: {
                                    var10_10 = null;
lbl74:
                                    // 2 sources

                                    if (var10_10 == null) {
                                        var10_10 = new zq_0();
                                    }
lbl77:
                                    // 5 sources

                                    var15_15 = Looper.myLooper();
                                    var11_11 = Looper.getMainLooper();
                                    var2_2 = (int)Intrinsics.areEqual(var15_15, var11_11);
                                    if (var2_2 != 0) break block35;
                                    var15_15 = zq_0.f;
                                    if (var15_15 != null) {
                                        var16_22 = System.currentTimeMillis();
                                        var18_23 = var15_15.b;
                                        cfr_temp_0 = (var16_22 -= var18_23) - (var18_23 = 3600000L);
                                        var20_24 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                        if (var20_24 /* !! */  < 0) {
                                            return var15_15;
                                        }
                                    }
                                    var21_25 = new String[]{var7_7, var6_6, var5_5};
                                    var15_15 = var0.getPackageManager();
                                    var11_11 = "com.facebook.katana.provider.AttributionIdProvider";
                                    var15_15 = var15_15.resolveContentProvider((String)var11_11, 0);
                                    var11_11 = var0.getPackageManager();
                                    var12_12 = "com.facebook.wakizashi.provider.AttributionIdProvider";
                                    var4_4 /* !! */  = var11_11.resolveContentProvider((String)var12_12, 0);
                                    if (var15_15 == null) break block40;
                                    var15_15 = var15_15.packageName;
                                    var11_11 = "contentProviderInfo.packageName";
                                    Intrinsics.checkNotNullExpressionValue(var15_15, (String)var11_11);
                                    var2_2 = (int)bi0_1.a(var1_1 /* !! */ , (String)var15_15);
                                    if (var2_2 == 0) break block40;
                                    var15_15 = "content://com.facebook.katana.provider.AttributionIdProvider";
                                    var15_15 = Uri.parse((String)var15_15);
                                    ** GOTO lbl114
                                }
                                if (var4_4 /* !! */  == null) ** GOTO lbl-1000
                                var15_15 = var4_4 /* !! */ .packageName;
                                var4_4 /* !! */  = "wakizashiProviderInfo.packageName";
                                Intrinsics.checkNotNullExpressionValue(var15_15, (String)var4_4 /* !! */ );
                                var2_2 = (int)bi0_1.a(var1_1 /* !! */ , (String)var15_15);
                                if (var2_2 != 0) {
                                    var15_15 = "content://com.facebook.wakizashi.provider.AttributionIdProvider";
                                    var15_15 = Uri.parse((String)var15_15);
lbl114:
                                    // 2 sources

                                    var22_26 = var15_15;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var22_26 = null;
                                }
                                var15_15 = var0.getPackageManager();
                                if (var15_15 != null) {
                                    var4_4 /* !! */  = var0.getPackageName();
                                    var15_15 = var15_15.getInstallerPackageName((String)var4_4 /* !! */ );
                                } else {
                                    var2_2 = 0;
                                    var15_15 = null;
                                }
                                if (var15_15 != null) {
                                    var10_10.d = var15_15;
                                }
                                if (var22_26 == null) {
                                    var10_10.b = var23_27 = System.currentTimeMillis();
                                    zq_0.f = var10_10;
                                    return var10_10;
                                }
                                var14_14 = var0.getContentResolver();
                                var1_1 /* !! */  = var14_14.query((Uri)var22_26, var21_25, null, null, null);
                                if (var1_1 /* !! */  == null) break block36;
                                var2_2 = (int)var1_1 /* !! */ .moveToFirst();
                                if (var2_2 == 0) break block36;
                                var2_2 = var1_1 /* !! */ .getColumnIndex(var7_7);
                                var3_3 = var1_1 /* !! */ .getColumnIndex(var6_6);
                                var25_29 = var1_1 /* !! */ .getColumnIndex(var5_5);
                                var10_10.c = var15_15 = var1_1 /* !! */ .getString(var2_2);
                                if (var3_3 <= 0 || var25_29 <= 0 || (var15_15 = var10_10.a()) != null) break block37;
                                var10_10.a = var15_15 = var1_1 /* !! */ .getString(var3_3);
                                var15_15 = var1_1 /* !! */ .getString(var25_29);
                                var2_2 = (int)Boolean.parseBoolean((String)var15_15);
                                var10_10.e = var2_2;
                            }
                            var1_1 /* !! */ .close();
                            var10_10.b = var23_28 = System.currentTimeMillis();
                            zq_0.f = var10_10;
                            return var10_10;
                        }
                        var10_10.b = var26_30 = System.currentTimeMillis();
                        zq_0.f = var10_10;
                        if (var1_1 /* !! */  == null) break block38;
                        var1_1 /* !! */ .close();
                    }
                    return var10_10;
                }
                try {
                    var1_1 /* !! */  = "getAttributionIdentifiers cannot be called on the main thread.";
                    var15_15 = new FacebookException((String)var1_1 /* !! */ );
                    throw var15_15;
                }
                catch (Throwable var15_18) {
                    ** GOTO lbl178
                }
                catch (Exception var15_17) {}
                var1_1 /* !! */  = null;
                ** GOTO lbl-1000
                break;
            }
            {
                catch (Throwable var15_16) {
                }
                catch (Exception v2) {}
                {
                    var15_15 = FacebookSdk.a;
                }
                var1_1 /* !! */ .unbindService((ServiceConnection)var11_11);
                ** continue;
            }
            var1_1 /* !! */ .unbindService((ServiceConnection)var11_11);
            throw var15_16;
lbl176:
            // 1 sources

            while (true) {
                var8_8 = var1_1 /* !! */ ;
lbl178:
                // 2 sources

                if (var8_8 != null) {
                    var8_8.close();
                }
                throw var15_21;
            }
            catch (Throwable var15_19) {
                ** continue;
            }
            catch (Exception var15_20) {}
lbl-1000:
            // 2 sources

            {
                var15_15.toString();
                var15_15 = FacebookSdk.a;
                if (var1_1 /* !! */  == null) break block39;
            }
            var1_1 /* !! */ .close();
        }
        return null;
    }

    public static boolean b(Context object) {
        boolean bl2;
        boolean bl3 = true;
        Object object2 = new Class[bl3];
        object2[0] = Context.class;
        String string2 = "com.google.android.gms.common.GooglePlayServicesUtil";
        Object[] objectArray = "isGooglePlayServicesAvailable";
        if ((object2 = lz3_0.s(string2, (String)objectArray, object2)) == null) {
            return false;
        }
        string2 = null;
        objectArray = new Object[bl3];
        objectArray[0] = object;
        object = lz3_0.v(null, (Method)object2, objectArray);
        boolean bl4 = object instanceof Integer;
        if (!bl4 || !(bl2 = Intrinsics.areEqual(object, object2 = Integer.valueOf(0)))) {
            bl3 = false;
        }
        return bl3;
    }
}

