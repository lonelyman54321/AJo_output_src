/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.usage.UsageStatsManager
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.graphics.Insets
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  android.util.DisplayMetrics
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  android.view.WindowMetrics
 */
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.clevertap.android.sdk.b;
import java.util.Locale;

/*
 * Renamed from Mp0$a
 */
public final class mp0$a_0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final double f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;
    public final double n;
    public final String o;
    public int p;
    public final String q;
    public final /* synthetic */ mp0_0 r;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public mp0$a_0(mp0_0 object) {
        String string2;
        block35: {
            block32: {
                block33: {
                    block34: {
                        int n3;
                        int n4;
                        double d2;
                        long l2;
                        int n7;
                        Object object2;
                        float f5;
                        int n8;
                        Object object3;
                        block31: {
                            String string3;
                            String string4;
                            String string5;
                            String string6;
                            void var6_11;
                            Object object4;
                            object3 = "phone";
                            this.r = object;
                            n8 = 0;
                            f5 = 0.0f;
                            object2 = null;
                            try {
                                Context context = ((mp0_0)object).e;
                                PackageManager packageManager = context.getPackageManager();
                                object4 = ((mp0_0)object).e;
                                object4 = object4.getPackageName();
                                PackageInfo packageInfo = packageManager.getPackageInfo((String)object4, 0);
                                String string7 = packageInfo.versionName;
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                com.clevertap.android.sdk.b.c();
                                n7 = 0;
                                Object var6_10 = null;
                            }
                            this.m = var6_11;
                            this.j = "Android";
                            this.k = string6 = Build.VERSION.RELEASE;
                            this.g = string5 = Build.MANUFACTURER;
                            object4 = Build.MODEL;
                            string2 = "";
                            this.h = string4 = ((String)object4).replace(string5, string2);
                            try {
                                mp0_0 mp0_02 = this.r;
                                Context context = mp0_02.e;
                                Object object5 = context.getSystemService((String)object3);
                                TelephonyManager telephonyManager = (TelephonyManager)object5;
                                if (telephonyManager != null) {
                                    object2 = telephonyManager.getNetworkOperatorName();
                                }
                            }
                            catch (Exception exception) {}
                            this.c = object2;
                            object2 = this.r;
                            try {
                                Context context = ((mp0_0)object2).e;
                                PackageManager packageManager = context.getPackageManager();
                                object2 = ((mp0_0)object2).e;
                                object2 = object2.getPackageName();
                                object2 = packageManager.getPackageInfo((String)object2, 0);
                                n8 = ((PackageInfo)object2).versionCode;
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                com.clevertap.android.sdk.b.c();
                                n8 = 0;
                                f5 = 0.0f;
                                object2 = null;
                            }
                            this.b = n8;
                            this.i = object2 = yz3_0.e(this.r.e);
                            object2 = this.r;
                            PackageManager packageManager = ((mp0_0)object2).e.getPackageManager();
                            object4 = "android.hardware.bluetooth_le";
                            n7 = packageManager.hasSystemFeature((String)object4);
                            object2 = n7 != 0 ? "ble" : ((n8 = (int)((object2 = ((mp0_0)object2).e.getPackageManager()).hasSystemFeature(string3 = "android.hardware.bluetooth") ? 1 : 0)) != 0 ? "classic" : "none");
                            this.a = object2;
                            try {
                                object2 = this.r;
                                object2 = ((mp0_0)object2).e;
                                object3 = object2.getSystemService((String)object3);
                                object3 = (TelephonyManager)object3;
                                if (object3 == null) break block31;
                                object3 = object3.getSimCountryIso();
                            }
                            catch (Throwable throwable) {}
                        }
                        object3 = string2;
                        this.d = object3;
                        int n10 = 70103;
                        float f6 = 9.8235E-41f;
                        this.l = n10;
                        object3 = this.r;
                        object2 = ((mp0_0)object3).e;
                        String string8 = "window";
                        object2 = (WindowManager)object2.getSystemService(string8);
                        double d5 = 100.0;
                        long l3 = 0L;
                        double d7 = 0.0;
                        int n14 = 30;
                        if (object2 == null) {
                            l2 = l3;
                            d2 = d7;
                        } else {
                            n4 = Build.VERSION.SDK_INT;
                            if (n4 >= n14) {
                                object2 = e3.a((WindowManager)object2);
                                object3 = ((mp0_0)object3).e.getResources().getConfiguration();
                                WindowInsets windowInsets = kp0_0.b((WindowMetrics)object2);
                                int n15 = QG3.a();
                                windowInsets = lp0_0.a(windowInsets, n15);
                                object2 = f3.a((WindowMetrics)object2);
                                n8 = object2.height();
                                n15 = ou0_1.a((Insets)windowInsets);
                                n8 -= n15;
                                n4 = su0_0.a((Insets)windowInsets);
                                n8 -= n4;
                                n10 = ((Configuration)object3).densityDpi;
                                f6 = n10;
                            } else {
                                object3 = new DisplayMetrics();
                                object2 = object2.getDefaultDisplay();
                                object2.getMetrics((DisplayMetrics)object3);
                                n8 = ((DisplayMetrics)object3).heightPixels;
                                f6 = ((DisplayMetrics)object3).ydpi;
                            }
                            f5 = (float)n8 / f6;
                            l2 = Math.round((double)f5 * d5);
                            d2 = (double)l2 / d5;
                        }
                        this.f = d2;
                        object3 = (WindowManager)this.r.e.getSystemService(string8);
                        if (object3 != null) {
                            n8 = Build.VERSION.SDK_INT;
                            if (n8 >= n14) {
                                object3 = e3.a((WindowManager)object3);
                                object2 = kp0_0.b((WindowMetrics)object3);
                                n4 = QG3.a();
                                lp0_0.a((WindowInsets)object2, n4);
                                object3 = f3.a((WindowMetrics)object3);
                                object3.height();
                            } else {
                                object2 = new DisplayMetrics();
                                object3 = object3.getDefaultDisplay();
                                object3.getMetrics((DisplayMetrics)object2);
                            }
                        }
                        object3 = this.r;
                        object2 = (WindowManager)((mp0_0)object3).e.getSystemService(string8);
                        if (object2 != null) {
                            int n16 = Build.VERSION.SDK_INT;
                            if (n16 >= n14) {
                                object2 = e3.a((WindowManager)object2);
                                object3 = ((mp0_0)object3).e.getResources().getConfiguration();
                                WindowInsets windowInsets = kp0_0.b((WindowMetrics)object2);
                                int n17 = QG3.a();
                                windowInsets = lp0_0.a(windowInsets, n17);
                                object2 = f3.a((WindowMetrics)object2);
                                n8 = object2.width();
                                n17 = qu0_0.a((Insets)windowInsets);
                                n8 -= n17;
                                n16 = mu0_0.a((Insets)windowInsets);
                                n8 -= n16;
                                n10 = ((Configuration)object3).densityDpi;
                                f6 = n10;
                            } else {
                                object3 = new DisplayMetrics();
                                object2 = object2.getDefaultDisplay();
                                object2.getMetrics((DisplayMetrics)object3);
                                n8 = ((DisplayMetrics)object3).widthPixels;
                                f6 = ((DisplayMetrics)object3).xdpi;
                            }
                            f5 = (float)n8 / f6;
                            l2 = Math.round((double)f5 * d5);
                            d2 = l2;
                            d7 = d2 / d5;
                        }
                        this.n = d7;
                        object3 = (WindowManager)this.r.e.getSystemService(string8);
                        if (object3 != null) {
                            n8 = Build.VERSION.SDK_INT;
                            if (n8 >= n14) {
                                object3 = e3.a((WindowManager)object3);
                                object2 = kp0_0.b((WindowMetrics)object3);
                                int n18 = QG3.a();
                                lp0_0.a((WindowInsets)object2, n18);
                                object3 = f3.a((WindowMetrics)object3);
                                object3.width();
                            } else {
                                object2 = new DisplayMetrics();
                                object3 = object3.getDefaultDisplay();
                                object3.getMetrics((DisplayMetrics)object2);
                            }
                        }
                        object3 = this.r;
                        object2 = (WindowManager)((mp0_0)object3).e.getSystemService(string8);
                        if (object2 == null) {
                            n10 = 0;
                            f6 = 0.0f;
                            object3 = null;
                        } else {
                            n7 = Build.VERSION.SDK_INT;
                            if (n7 >= n14) {
                                object3 = ((mp0_0)object3).e.getResources().getConfiguration();
                                n10 = ((Configuration)object3).densityDpi;
                            } else {
                                object3 = new DisplayMetrics();
                                object2 = object2.getDefaultDisplay();
                                object2.getMetrics((DisplayMetrics)object3);
                                n10 = ((DisplayMetrics)object3).densityDpi;
                            }
                        }
                        this.e = n10;
                        object = ((mp0_0)object).e;
                        object3 = "local_in_app_count";
                        this.p = n3 = gc3_0.b((Context)object, 0, (String)object3);
                        object = Locale.getDefault().getLanguage();
                        n10 = (int)(string2.equals(object) ? 1 : 0);
                        if (n10 != 0) {
                            object = "xx";
                        }
                        if ((n8 = (int)(string2.equals(object3 = Locale.getDefault().getCountry()) ? 1 : 0)) != 0) {
                            object3 = "XX";
                        }
                        object2 = "_";
                        this.q = object = n1.a((String)object, (String)object2, (String)object3);
                        n3 = Build.VERSION.SDK_INT;
                        n10 = 28;
                        f6 = 3.9E-44f;
                        if (n3 < n10) return;
                        object = this.r.e;
                        object3 = "usagestats";
                        object = (UsageStatsManager)object.getSystemService((String)object3);
                        n3 = jp0_0.a((UsageStatsManager)object);
                        n10 = 10;
                        f6 = 1.4E-44f;
                        if (n3 == n10) break block32;
                        n10 = 20;
                        f6 = 2.8E-44f;
                        if (n3 == n10) break block33;
                        if (n3 == n14) break block34;
                        n10 = 40;
                        f6 = 5.6E-44f;
                        if (n3 != n10) {
                            n10 = 45;
                            f6 = 6.3E-44f;
                            if (n3 == n10) {
                                string2 = "restricted";
                            }
                            break block35;
                        } else {
                            string2 = "rare";
                        }
                        break block35;
                    }
                    string2 = "frequent";
                    break block35;
                }
                string2 = "working_set";
                break block35;
            }
            string2 = "active";
        }
        this.o = string2;
    }
}

