/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.a$a;
import com.clevertap.android.sdk.b;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Callable;

/*
 * Renamed from Hp0
 */
public final class hp0_0
implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ mp0_0 b;

    public hp0_0(mp0_0 mp0_02) {
        this.b = mp0_02;
        this.a = null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        var1_1 = 1;
        var2_2 = false;
        var3_3 = null;
        var4_5 = this.b;
        var5_6 = this.a;
        var6_7 = var4_5.d.b();
        var7_8 = new StringBuilder();
        var8_9 = var4_5.d.a;
        var7_8.append((String)var8_9);
        var7_8.append(":async_deviceID");
        var7_8 = var7_8.toString();
        var8_9 = "Called initDeviceID()";
        var6_7.b((String)var7_8, (String)var8_9);
        var6_7 = var4_5.d;
        var9_10 = var6_7.n;
        if (var9_10 != 0) {
            if (var5_6 == null) {
                var9_10 = 18;
                var7_8 = new String[]{};
                var4_5.k(var9_10, (String[])var7_8);
                var4_5.d.b().getClass();
                var6_7 = a$a.INFO;
                var6_7.intValue();
            }
        } else if (var5_6 != null) {
            var9_10 = 19;
            var7_8 = new String[]{};
            var4_5.k(var9_10, (String[])var7_8);
            var4_5.d.b().getClass();
            var6_7 = a$a.INFO;
            var6_7.intValue();
        }
        var6_7 = var4_5.d.b();
        var7_8 = new StringBuilder();
        var8_9 = var4_5.d.a;
        var7_8.append((String)var8_9);
        var7_8.append(":async_deviceID");
        var7_8 = var7_8.toString();
        var6_7.b((String)var7_8, "Calling _getDeviceID");
        var6_7 = var4_5.g();
        var7_8 = var4_5.e;
        var8_9 = null;
        var6_7 = gc3_0.g((Context)var7_8, (String)var6_7, null);
        var10_11 = var4_5.d;
        var11_12 = var10_11.p;
        if (var11_12 != 0 && var6_7 == null) {
            var6_7 = gc3_0.g((Context)var7_8, "deviceId", null);
        }
        var7_8 = var4_5.d.b();
        var10_11 = new StringBuilder();
        var12_13 /* !! */  = var4_5.d.a;
        var10_11.append((String)var12_13 /* !! */ );
        var10_11.append(":async_deviceID");
        var10_11 = var10_11.toString();
        var12_13 /* !! */  = "Called _getDeviceID";
        var7_8.b((String)var10_11, (String)var12_13 /* !! */ );
        var13_14 = 2;
        if (var6_7 != null && (var11_12 = (var10_11 = var6_7.trim()).length()) > var13_14) {
            var14_15 = var4_5.d.b();
            var3_3 = var4_5.d.a;
            var7_8 = "CleverTap ID already present for profile";
            var14_15.b((String)var3_3, (String)var7_8);
            if (var5_6 == null) return var6_7;
            var1_1 = 20;
            var3_3 = new String[]{var6_7, var5_6};
            var4_5.k(var1_1, (String[])var3_3);
            var14_15 = var4_5.d.b();
            var3_3 = var4_5.d.a;
            var14_15.getClass();
            com.clevertap.android.sdk.b.i();
            return var6_7;
        }
        var5_6 = var4_5.d;
        var9_10 = (int)var5_6.n;
        if (var9_10 != 0) {
            return var4_5.a();
        }
        var9_10 = (int)var5_6.v;
        if (var9_10 == 0) {
            var14_16 = var5_6.b();
            var3_3 = new StringBuilder();
            var5_6 = var4_5.d.a;
            var3_3.append((String)var5_6);
            var3_3.append(":async_deviceID");
            var3_3 = var3_3.toString();
            var5_6 = "Calling generateDeviceID()";
            var14_16.b((String)var3_3, (String)var5_6);
            var6_7 = var4_5.c();
            var14_16 = var4_5.d.b();
            var3_3 = new StringBuilder();
            var4_5 = var4_5.d.a;
            var3_3.append((String)var4_5);
            var3_3.append(":async_deviceID");
            var3_3 = var3_3.toString();
            var4_5 = "Called generateDeviceID()";
            var14_16.b((String)var3_3, (String)var4_5);
            return var6_7;
        }
        var5_6 = "limitAdTracking = ";
        synchronized (var4_5) {
            block33: {
                var6_7 = var4_5.d;
                var6_7 = var6_7.b();
                var10_11 = new StringBuilder();
                var12_13 /* !! */  = var4_5.d;
                var12_13 /* !! */  = var12_13 /* !! */ .a;
                var10_11.append((String)var12_13 /* !! */ );
                var12_13 /* !! */  = ":async_deviceID";
                var10_11.append((String)var12_13 /* !! */ );
                var10_11 = var10_11.toString();
                var12_13 /* !! */  = "fetchGoogleAdID() called!";
                var6_7.b((String)var10_11, (String)var12_13 /* !! */ );
                var6_7 = var4_5.i();
                if (var6_7 != null || (var9_10 = (int)var4_5.b) != 0) ** GOTO lbl264
                try {
                    var4_5.b = var1_1;
                    var6_7 = AdvertisingIdClient.class;
                    var10_11 = "getAdvertisingIdInfo";
                    var12_13 /* !! */  = new Class[var1_1];
                    var12_13 /* !! */ [0] = var15_21 = Context.class;
                    var6_7 = var6_7.getMethod((String)var10_11, (Class<?>[])var12_13 /* !! */ );
                    var10_11 = var4_5.e;
                    var12_13 /* !! */  = new Object[var1_1];
                    var12_13 /* !! */ [0] = var10_11;
                    var6_7 = var6_7.invoke(null, var12_13 /* !! */ );
                    var10_11 = var6_7.getClass();
                    var12_13 /* !! */  = "isLimitAdTrackingEnabled";
                    var10_11 = var10_11.getMethod((String)var12_13 /* !! */ , null);
                    var10_11 = var10_11.invoke(var6_7, null);
                    var10_11 = (Boolean)var10_11;
                    var12_13 /* !! */  = var4_5.a;
                    synchronized (var12_13 /* !! */ ) {
                        if (var10_11 == null) ** GOTO lbl153
                    }
                }
                catch (Throwable var14_19) {}
                {
                    block32: {
                        var11_12 = (int)var10_11.booleanValue();
                        if (var11_12 != 0) break block32;
lbl153:
                        // 2 sources

                        var1_1 = 0;
                        var14_18 = null;
                    }
                    var4_5.i = var1_1;
                    var14_18 = var4_5.d;
                    var14_18 = var14_18.b();
                    var3_3 = new StringBuilder();
                    var10_11 = var4_5.d;
                    var10_11 = var10_11.a;
                    var3_3.append((String)var10_11);
                    var10_11 = ":async_deviceID";
                    var3_3.append((String)var10_11);
                    var3_3 = var3_3.toString();
                    var10_11 = new StringBuilder((String)var5_6);
                    var16_22 = var4_5.i;
                    var10_11.append(var16_22);
                    var5_6 = var10_11.toString();
                    var14_18.b((String)var3_3, (String)var5_6);
                    var1_1 = (int)var4_5.i;
                    if (var1_1 == 0) break block33;
                    var14_18 = var4_5.d;
                    var14_18 = var14_18.b();
                    var3_3 = var4_5.d;
                    var3_3 = var3_3.a;
                    var3_3 = "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation";
                    var14_18.getClass();
                    com.clevertap.android.sdk.b.f((String)var3_3);
                    ** GOTO lbl265
                }
            }
            var14_18 = var6_7.getClass();
            var3_3 = "getId";
            var14_18 = var14_18.getMethod((String)var3_3, null);
            var14_18 = var14_18.invoke(var6_7, null);
            var8_9 = var14_18 = (String)var14_18;
            ** GOTO lbl230
            {
                catch (Throwable var14_17) {}
            }
            throw var14_17;
            var3_3 = var14_19.getCause();
            if (var3_3 != null) {
                var3_3 = var4_5.d;
                var3_3 = var3_3.b();
                var5_6 = var4_5.d;
                var5_6 = var5_6.a;
                var6_7 = new StringBuilder();
                var10_11 = "Failed to get Advertising ID: ";
                var6_7.append((String)var10_11);
                var10_11 = var14_19.toString();
                var6_7.append((String)var10_11);
                var14_18 = var14_19.getCause();
                var14_18 = var14_18.toString();
                var6_7.append((String)var14_18);
                var14_18 = var6_7.toString();
                var3_3.b((String)var5_6, (String)var14_18);
            } else {
                var3_3 = var4_5.d;
                var3_3 = var3_3.b();
                var5_6 = var4_5.d;
                var5_6 = var5_6.a;
                var6_7 = new StringBuilder();
                var10_11 = "Failed to get Advertising ID: ";
                var6_7.append((String)var10_11);
                var14_18 = var14_19.toString();
                var6_7.append((String)var14_18);
                var14_18 = var6_7.toString();
                var3_3.b((String)var5_6, (String)var14_18);
            }
lbl230:
            // 3 sources

            if (var8_9 == null || (var1_1 = (var14_18 = var8_9.trim()).length()) <= var13_14) ** GOTO lbl-1000
            var14_18 = var4_5.a;
            synchronized (var14_18) {
                var3_3 = "00000000";
            }
            {
                catch (Throwable var14_20) {}
            }
            {
                block34: {
                    var2_2 = var8_9.contains((CharSequence)var3_3);
                    if (!var2_2) break block34;
                    var3_3 = var4_5.d;
                    var3_3 = var3_3.b();
                    var5_6 = var4_5.d;
                    var5_6 = var5_6.a;
                    var5_6 = "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation";
                    var3_3.getClass();
                    com.clevertap.android.sdk.b.f((String)var5_6);
                    ** GOTO lbl265
                }
                var3_3 = "-";
                var5_6 = "";
                var4_5.h = var3_3 = var8_9.replace((CharSequence)var3_3, (CharSequence)var5_6);
            }
lbl-1000:
            // 2 sources

            {
                var14_18 = var4_5.d;
                var14_18 = var14_18.b();
                var3_3 = new StringBuilder();
                var5_6 = var4_5.d;
                var5_6 = var5_6.a;
                var3_3.append((String)var5_6);
                var5_6 = ":async_deviceID";
                var3_3.append((String)var5_6);
                var3_3 = var3_3.toString();
                var5_6 = "fetchGoogleAdID() done executing!";
                var14_18.b((String)var3_3, (String)var5_6);
lbl264:
                // 2 sources

                // MONITOREXIT @DISABLED, blocks:[8, 10] lbl268 : MonitorExitStatement: MONITOREXIT : var4_5
lbl265:
                // 3 sources

                var6_7 = var4_5.c();
                var14_18 = var4_5.d.b();
                var3_3 = new StringBuilder();
                var4_5 = var4_5.d.a;
                var3_3.append((String)var4_5);
                var3_3.append(":async_deviceID");
                var3_3 = var3_3.toString();
                var4_5 = "initDeviceID() done executing!";
                var14_18.b((String)var3_3, (String)var4_5);
                return var6_7;
                throw var14_20;
                {
                    catch (Throwable var3_4) {}
                    throw var3_4;
                }
            }
        }
    }
}

