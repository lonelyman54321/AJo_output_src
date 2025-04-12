/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.AsyncTask
 *  android.os.Bundle
 */
package com.facebook;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

public final class FacebookSdk {
    public static final FacebookSdk a;
    public static final String b;
    public static final HashSet c;
    public static Executor d;
    public static volatile String e;
    public static volatile String f;
    public static volatile String g;
    public static volatile Boolean h;
    public static final AtomicLong i;
    public static aj_0 j;
    public static Context k;
    public static int l;
    public static final ReentrantLock m;
    public static final String n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static final AtomicBoolean r;
    public static volatile String s;
    public static volatile String t;
    public static final cZ u;
    public static boolean v;

    static {
        Object object = new FacebookSdk();
        a = object;
        b = FacebookSdk.class.getCanonicalName();
        Ax1 ax1 = Ax1.DEVELOPER_ERRORS;
        object = new Ax1[]{ax1};
        c = p03_0.d((Object[])object);
        i = object = new AtomicLong(65536L);
        l = 64206;
        m = object = new ReentrantLock();
        n = "v16.0";
        r = object = new AtomicBoolean(false);
        s = "instagram.com";
        t = "facebook.com";
        u = object = new Object();
    }

    public static final Context a() {
        Xz3.h();
        Context context = k;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
            context = null;
        }
        return context;
    }

    public static final String b() {
        Xz3.h();
        Object object = e;
        if (object != null) {
            return object;
        }
        object = new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        throw object;
    }

    public static final String c() {
        Xz3.h();
        Object object = g;
        if (object != null) {
            return object;
        }
        object = new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Executor d() {
        Throwable throwable2;
        Object object;
        block4: {
            Object object2;
            block3: {
                object = m;
                object.lock();
                try {
                    object2 = d;
                    if (object2 != null) break block3;
                    d = object2 = AsyncTask.THREAD_POOL_EXECUTOR;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            object2 = Unit.a;
            object.unlock();
            object = d;
            if (object != null) {
                return object;
            }
            object2 = "Required value was null.".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object.unlock();
        throw throwable2;
    }

    public static final String e() {
        Object object = StringCompanionObject.INSTANCE;
        object = n;
        int n3 = 1;
        Object[] objectArray = new Object[n3];
        objectArray[0] = object;
        Object object2 = Arrays.copyOf(objectArray, n3);
        Intrinsics.checkNotNullExpressionValue(String.format("getGraphApiVersion: %s", object2), "format(format, *args)");
        object2 = lz3_0.a;
        return object;
    }

    public static final String f() {
        boolean bl2;
        Object object = AccessToken.l;
        object = AccessToken$b.b();
        if (object != null) {
            object = ((AccessToken)object).k;
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = lz3_0.a;
        object2 = t;
        if (object != null) {
            String string2 = "gaming";
            boolean bl3 = Intrinsics.areEqual(object, string2);
            String string3 = "facebook.com";
            if (bl3) {
                object = "fb.gg";
                object2 = kotlin.text.b.n((String)object2, string3, (String)object, false);
            } else {
                string2 = "instagram";
                bl2 = Intrinsics.areEqual(object, string2);
                if (bl2) {
                    object = "instagram.com";
                    object2 = kotlin.text.b.n((String)object2, string3, (String)object, false);
                }
            }
        }
        return object2;
    }

    public static final boolean g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Xz3.h();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean h() {
        Class<FacebookSdk> clazz = FacebookSdk.class;
        synchronized (clazz) {
            return v;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static final void i(Ax1 object) {
        Intrinsics.checkNotNullParameter(object, "behavior");
        HashSet hashSet = c;
        // MONITORENTER : hashSet
        // MONITOREXIT : hashSet
    }

    public static final boolean isInitialized() {
        return r.get();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void j(Context object) {
        int n3;
        String string2;
        int n4;
        Object object2;
        Object object3;
        if (object == null) {
            return;
        }
        try {
            object3 = object.getPackageManager();
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return;
        }
        String string3 = object.getPackageName();
        int n7 = 128;
        ApplicationInfo applicationInfo = object3.getApplicationInfo(string3, n7);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "try {\n                co\u2026     return\n            }");
        object3 = applicationInfo.metaData;
        if (object3 == null) {
            return;
        }
        object3 = e;
        n7 = 0;
        if (object3 == null) {
            object3 = applicationInfo.metaData;
            object2 = "com.facebook.sdk.ApplicationId";
            n4 = (object3 = object3.get((String)object2)) instanceof String;
            if (n4 != 0) {
                object3 = (String)object3;
                object2 = Locale.ROOT;
                String string4 = "this as java.lang.String).toLowerCase(locale)";
                n4 = (int)(kotlin.text.b.s((String)(object2 = zn0_1.a((Locale)object2, "ROOT", (String)object3, (Locale)object2, string4)), string2 = "fb", false) ? 1 : 0);
                if (n4 != 0) {
                    n4 = 2;
                    object3 = ((String)object3).substring(n4);
                    object2 = "this as java.lang.String).substring(startIndex)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                    e = object3;
                } else {
                    e = object3;
                }
            } else {
                n3 = object3 instanceof Number;
                if (n3 != 0) {
                    FacebookException facebookException = new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                    throw facebookException;
                }
            }
        }
        if ((object3 = f) == null) {
            object3 = applicationInfo.metaData;
            object2 = "com.facebook.sdk.ApplicationName";
            object3 = object3.getString((String)object2);
            f = object3;
        }
        if ((object3 = g) == null) {
            object3 = applicationInfo.metaData;
            object2 = "com.facebook.sdk.ClientToken";
            object3 = object3.getString((String)object2);
            g = object3;
        }
        if ((n3 = l) == (n4 = 64206)) {
            object3 = applicationInfo.metaData;
            string2 = "com.facebook.sdk.CallbackOffset";
            l = n3 = object3.getInt(string2, n4);
        }
        if ((object3 = h) == null) {
            Boolean bl2;
            Bundle bundle = applicationInfo.metaData;
            object3 = "com.facebook.sdk.CodelessDebugLogEnabled";
            boolean bl3 = bundle.getBoolean((String)object3, false);
            h = bl2 = Boolean.valueOf(bl3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void k(Context context) {
        Class<FacebookSdk> clazz = FacebookSdk.class;
        synchronized (clazz) {
            String string2 = "applicationContext";
            Intrinsics.checkNotNullParameter(context, string2);
            FacebookSdk.l(context);
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public static final void l(Context var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [11 : 102->109)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

