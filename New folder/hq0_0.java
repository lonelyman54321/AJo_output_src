/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hq0
 */
public final class hq0_0 {
    /*
     * WARNING - void declaration
     */
    public static final boolean a(Up0 object) {
        void var2_5;
        String string2 = "feature";
        Intrinsics.checkNotNullParameter(object, string2);
        object = hq0_0.b((Up0)object);
        int bl2 = ((OS1$f)object).b;
        int n3 = -1;
        if (bl2 != n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        return (boolean)var2_5;
    }

    /*
     * Unable to fully structure code
     */
    public static final OS1$f b(Up0 var0) {
        Intrinsics.checkNotNullParameter(var0, "feature");
        var1_1 = FacebookSdk.b();
        var2_3 = var0.getAction();
        var3_4 = var0.name();
        Intrinsics.checkNotNullParameter(var1_1, "applicationId");
        Intrinsics.checkNotNullParameter(var2_3, "actionName");
        var4_5 = "featureName";
        Intrinsics.checkNotNullParameter(var3_4, var4_5);
        var5_6 = var2_3.length();
        var6_7 = null;
        if (var5_6 == 0 || (var5_6 = var3_4.length()) == 0) {
            while (true) {
                var7_8 = 0;
                var1_1 = null;
                break;
            }
        } else {
            if ((var1_1 = dl0_2.b((String)var1_1)) != null && (var1_1 = var1_1.f) != null) {
                var1_1 = (Map)var1_1.get(var2_3);
            } else {
                var7_8 = 0;
                var1_1 = null;
            }
            if (var1_1 == null) ** continue;
            var1_1 = (al0$a_0)var1_1.get(var3_4);
        }
        if (var1_1 == null || (var1_1 = (Object)var1_1.c) == null) {
            var7_8 = 1;
            var1_1 = new int[var7_8];
            var8_9 = false;
            var3_4 = null;
            var9_10 = var0.getMinVersion();
            var1_1[0] = var9_10;
        }
        var0 = os1_1.a;
        var0 = os1_1.class;
        var8_9 = td0.b(var0);
        if (!var8_9) {
            block15: {
                var3_4 = "action";
                Intrinsics.checkNotNullParameter(var2_3, (String)var3_4);
                var3_4 = "versionSpec";
                Intrinsics.checkNotNullParameter(var1_1, (String)var3_4);
                var3_4 = os1_1.c;
                var2_3 = var3_4.get(var2_3);
                var2_3 = (List)var2_3;
                if (var2_3 != null) break block15;
                var2_3 = mz0_2.a;
            }
            var3_4 = os1_1.a;
            try {
                var6_7 = var3_4.k((List)var2_3, (int[])var1_1);
            }
            catch (Throwable var1_2) {
                td0.a(var0, var1_2);
            }
        }
        return var6_7;
    }

    public static final void c(pm_0 object, hq0$a hq0$a, Up0 object2) {
        Intrinsics.checkNotNullParameter(object, "appCall");
        Intrinsics.checkNotNullParameter(hq0$a, "parameterProvider");
        Intrinsics.checkNotNullParameter(object2, "feature");
        Context context = FacebookSdk.a();
        String string2 = object2.getAction();
        object2 = hq0_0.b((Up0)object2);
        int n3 = ((OS1$f)object2).b;
        int n4 = -1;
        if (n3 != n4) {
            Context context2;
            block18: {
                hq0$a = (n3 = (int)(os1_1.p(n3) ? 1 : 0)) != 0 ? hq0$a.getParameters() : hq0$a.a();
                if (hq0$a == null) {
                    hq0$a = new Bundle();
                }
                String string3 = ((pm_0)object).a().toString();
                Class<os1_1> clazz = os1_1.class;
                boolean bl2 = td0.b(clazz);
                context2 = null;
                if (!bl2) {
                    Object object3 = "context";
                    Intrinsics.checkNotNullParameter(context, (String)object3);
                    object3 = ((OS1$f)object2).a;
                    if (object3 == null) break block18;
                    Object object4 = new Intent();
                    String string4 = "com.facebook.platform.PLATFORM_ACTIVITY";
                    object4 = object4.setAction(string4);
                    object3 = ((OS1$e)object3).c();
                    object3 = object4.setPackage((String)object3);
                    object4 = "android.intent.category.DEFAULT";
                    object3 = object3.addCategory((String)object4);
                    context = os1_1.s(context, (Intent)object3);
                    if (context == null) break block18;
                    int n7 = ((OS1$f)object2).b;
                    try {
                        os1_1.q((Intent)context, string3, string2, n7, (Bundle)hq0$a);
                        context2 = context;
                    }
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                }
            }
            if (context2 != null) {
                boolean bl3 = td0.b(object);
                if (!bl3) {
                    try {
                        ((pm_0)object).c = context2;
                    }
                    catch (Throwable throwable) {
                        td0.a(object, throwable);
                    }
                }
                return;
            }
            object = new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
            throw object;
        }
        object = new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
        throw object;
    }

    public static final void d(pm_0 pm_02, FacebookException facebookException) {
        String string2 = "appCall";
        Intrinsics.checkNotNullParameter(pm_02, string2);
        Intrinsics.checkNotNullParameter(pm_02, string2);
        string2 = FacebookSdk.a();
        Intrinsics.checkNotNullParameter(string2, "context");
        boolean bl2 = true;
        Xz3.b((Context)string2, bl2);
        string2 = new Intent();
        Object object = FacebookSdk.a();
        Class<FacebookActivity> clazz = FacebookActivity.class;
        string2.setClass(object, clazz);
        string2.setAction("PassThrough");
        object = pm_02.a().toString();
        int n3 = os1_1.l();
        facebookException = os1_1.c(facebookException);
        os1_1.q((Intent)string2, (String)object, null, n3, (Bundle)facebookException);
        boolean bl3 = td0.b(pm_02);
        if (!bl3) {
            try {
                pm_02.c = string2;
            }
            catch (Throwable throwable) {
                td0.a(pm_02, throwable);
            }
        }
    }

    public static final void e(pm_0 pm_02, String string2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(pm_02, "appCall");
        Object object = FacebookSdk.a();
        String string3 = "context";
        Intrinsics.checkNotNullParameter(object, string3);
        int n3 = 1;
        Xz3.b(object, n3 != 0);
        object = FacebookSdk.a();
        Intrinsics.checkNotNullParameter(object, string3);
        Xz3.c(object, n3 != 0);
        object = new Bundle();
        object.putString("action", string2);
        object.putBundle("params", bundle);
        bundle = new Intent();
        string3 = pm_02.a().toString();
        n3 = os1_1.l();
        os1_1.q((Intent)bundle, string3, string2, n3, (Bundle)object);
        string2 = FacebookSdk.a();
        object = FacebookActivity.class;
        bundle.setClass((Context)string2, (Class)object);
        string2 = "FacebookDialogFragment";
        bundle.setAction(string2);
        boolean bl2 = td0.b(pm_02);
        if (!bl2) {
            try {
                pm_02.c = bundle;
            }
            catch (Throwable throwable) {
                td0.a(pm_02, throwable);
            }
        }
    }
}

