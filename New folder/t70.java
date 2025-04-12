/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Process
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  android.view.Display
 *  android.view.WindowManager
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.Executor;

public class t70 {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync;

    static {
        Object object;
        sSync = object = new Object();
    }

    /*
     * WARNING - void declaration
     */
    public static int checkSelfPermission(Context object, String object2) {
        if (object2 != null) {
            String string2;
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 < n4 && (n3 = (int)(TextUtils.equals((CharSequence)(string2 = "android.permission.POST_NOTIFICATIONS"), (CharSequence)object2) ? 1 : 0)) != 0) {
                void var5_8;
                object2 = new s52((Context)object);
                boolean n7 = ((s52)object2).a();
                if (n7) {
                    boolean bl2 = false;
                    object = null;
                } else {
                    int n8 = -1;
                }
                return (int)var5_8;
            }
            n3 = Process.myPid();
            n4 = Process.myUid();
            return object.checkPermission((String)object2, n3, n4);
        }
        object = new NullPointerException("permission must be non-null");
        throw object;
    }

    public static Context createAttributionContext(Context context, String string2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            context = t70$e.a(context, string2);
        }
        return context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return t70$b.a(context);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static File createFilesDir(File file) {
        Object object = sSync;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl2 = file.exists();
                        if (bl2) break block4;
                        bl2 = file.mkdirs();
                        if (bl2) {
                            return file;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    file.getPath();
                }
                return file;
            }
            throw throwable2;
        }
    }

    public static String getAttributionTag(Context context) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            return t70$e.b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return context.getCodeCacheDir();
    }

    public static int getColor(Context context, int n3) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            return t70$a.a(context, n3);
        }
        return context.getResources().getColor(n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ColorStateList getColorStateList(Context var0, int var1_2) {
        var2_3 = var0.getResources();
        var0 = var0.getTheme();
        var3_4 = new WK2$c(var2_3, (Resources.Theme)var0);
        var4_5 = WK2.c;
        synchronized (var4_5) {
            try {
                var5_6 /* !! */  = WK2.b;
                var5_6 /* !! */  = var5_6 /* !! */ .get(var3_4);
                var5_6 /* !! */  = (SparseArray)var5_6 /* !! */ ;
                var6_7 = null;
                if (var5_6 /* !! */  == null || (var7_8 = var5_6 /* !! */ .size()) <= 0) ** GOTO lbl27
                var8_9 = var5_6 /* !! */ .get(var1_2);
                if ((var8_9 = (WK2$b)var8_9) == null) ** GOTO lbl27
                var9_10 = var8_9.b;
                var10_11 = var2_3.getConfiguration();
                var11_12 = var9_10.equals(var10_11);
                if (var11_12 == 0) ** GOTO lbl-1000
                if (var0 != null || (var11_12 = var8_9.c) != 0) {
                }
                ** GOTO lbl-1000
            }
            catch (Throwable var0_1) {
                ** break block13
            }
            if (var0 != null && (var11_12 = var8_9.c) == (var12_13 = var0.hashCode())) lbl-1000:
            // 2 sources

            {
                var5_6 /* !! */  = var8_9.a;
            } else lbl-1000:
            // 2 sources

            {
                var5_6 /* !! */ .remove(var1_2);
lbl27:
                // 3 sources

                // MONITOREXIT @DISABLED, blocks:[3, 10] lbl28 : MonitorExitStatement: MONITOREXIT : var4_5
                var13_14 = 0;
                var5_6 /* !! */  = null;
            }
        }
        if (var5_6 /* !! */  != null) {
            return var5_6 /* !! */ ;
        }
        var4_5 = WK2.a;
        var5_6 /* !! */  = (TypedValue)var4_5.get();
        if (var5_6 /* !! */  == null) {
            var5_6 /* !! */  = new TypedValue();
            var4_5.set(var5_6 /* !! */ );
        }
        var2_3.getValue(var1_2, (TypedValue)var5_6 /* !! */ , true);
        var14_15 = var5_6 /* !! */ .type;
        var13_14 = 28;
        if (var14_15 < var13_14 || var14_15 > (var13_14 = 31)) {
            var4_5 = var2_3.getXml(var1_2);
            try {
                var6_7 = fZ.a(var2_3, (XmlResourceParser)var4_5, (Resources.Theme)var0);
            }
            catch (Exception v0) {}
        }
        if (var6_7 != null) {
            WK2.a(var3_4, var1_2, var6_7, (Resources.Theme)var0);
            return var6_7;
        }
        var15_16 = Build.VERSION.SDK_INT;
        var14_15 = 23;
        if (var15_16 < var14_15) return var2_3.getColorStateList(var1_2);
        return WK2$a.a(var1_2, (Resources.Theme)var0, var2_3);
lbl-1000:
        // 1 sources

        {
            throw var0_1;
        }
    }

    public static Context getContextForLanguage(Context context) {
        jw1 jw12;
        qw1 qw12;
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 >= n4) {
            object = context.getSystemService("locale");
            if (object != null) {
                object = rw1.a(object);
                qw12 = new qw1(object);
                jw12 = new jw1(qw12);
            } else {
                jw12 = jw1.b;
            }
        } else {
            object = Se3.c(context);
            jw12 = jw1.b((String)object);
        }
        n4 = 32;
        if (n3 <= n4 && (n4 = (int)((object = jw12.a).isEmpty() ? 1 : 0)) == 0) {
            qw12 = context.getResources().getConfiguration();
            object = new Configuration((Configuration)qw12);
            int n7 = 24;
            if (n3 >= n7) {
                Q40.b((Configuration)object, jw12);
            } else {
                Object object2 = jw12.a;
                boolean bl2 = object2.isEmpty();
                if (!bl2) {
                    bl2 = false;
                    jw12 = null;
                    object2 = object2.get(0);
                    object.setLocale((Locale)object2);
                }
            }
            context = context.createConfigurationContext((Configuration)object);
        }
        return context;
    }

    public static File getDataDir(Context object) {
        File file;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return t70$b.b(object);
        }
        object = object.getApplicationInfo().dataDir;
        if (object != null) {
            file = new File((String)object);
        } else {
            n3 = 0;
            file = null;
        }
        return file;
    }

    public static Display getDisplayOrDefault(Context context) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 30;
        if (n3 >= n4) {
            return t70$e.c(context);
        }
        return ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int n3) {
        return context.getDrawable(n3);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String string2) {
        return context.getExternalFilesDirs(string2);
    }

    public static Executor getMainExecutor(Context object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            return t70$d.a(object);
        }
        object = object.getMainLooper();
        Handler handler = new Handler((Looper)object);
        object = new gE0(handler);
        return object;
    }

    public static File getNoBackupFilesDir(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int n3) {
        return t70.getContextForLanguage(context).getString(n3);
    }

    public static Object getSystemService(Context object, Class object2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return t70$a.b(object, (Class)object2);
        }
        object = (object2 = t70.getSystemServiceName(object, (Class)object2)) != null ? object.getSystemService((String)object2) : null;
        return object;
    }

    public static String getSystemServiceName(Context context, Class clazz) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return t70$a.c(context, clazz);
        }
        return (String)t70$g.a.get(clazz);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            return t70$b.c(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context object) {
        CharSequence charSequence = new StringBuilder();
        String string2 = object.getPackageName();
        charSequence.append(string2);
        string2 = DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        charSequence.append(string2);
        charSequence = charSequence.toString();
        int n3 = jq1_1.b(object, (String)charSequence);
        if (n3 == 0) {
            return charSequence;
        }
        charSequence = cP.a("Permission ", (String)charSequence, " is required by your application to receive broadcasts, please add it to your manifest");
        object = new RuntimeException((String)charSequence);
        throw object;
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter, int n3) {
        return t70.registerReceiver(context, broadcastReceiver2, intentFilter, null, null, n3);
    }

    public static Intent registerReceiver(Context object, BroadcastReceiver broadcastReceiver2, IntentFilter intentFilter, String string2, Handler handler, int n3) {
        int n4;
        int n7 = n3 & 1;
        if (n7 != 0 && (n4 = n3 & 4) != 0) {
            object = new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            throw object;
        }
        if (n7 != 0) {
            n3 |= 2;
        }
        int n8 = n3;
        if ((n3 &= 2) == 0 && (n7 = n8 & 4) == 0) {
            object = new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            throw object;
        }
        if (n3 != 0 && (n3 = n8 & 4) != 0) {
            object = new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            throw object;
        }
        n3 = Build.VERSION.SDK_INT;
        n7 = 33;
        if (n3 >= n7) {
            return t70$f.a(object, broadcastReceiver2, intentFilter, string2, handler, n8);
        }
        n7 = 26;
        if (n3 >= n7) {
            return t70$c.a(object, broadcastReceiver2, intentFilter, string2, handler, n8);
        }
        n3 = n8 & 4;
        if (n3 != 0 && string2 == null) {
            string2 = t70.obtainAndCheckReceiverPermission(object);
            return object.registerReceiver(broadcastReceiver2, intentFilter, string2, handler);
        }
        return object.registerReceiver(broadcastReceiver2, intentFilter, string2, handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArray) {
        return t70.startActivities(context, intentArray, null);
    }

    public static boolean startActivities(Context context, Intent[] intentArray, Bundle bundle) {
        context.startActivities(intentArray, bundle);
        return true;
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            t70$c.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}

