/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ResolveInfo
 */
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.facebook.FacebookSdk;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tf0
 */
public final class tf0_1 {
    public static final String[] a;

    static {
        new tf0_1();
        a = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    public static final String a() {
        Throwable throwable2;
        Class<tf0_1> clazz;
        block21: {
            block20: {
                clazz = tf0_1.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                Object object = FacebookSdk.a();
                HashSet hashSet = "android.support.customtabs.action.CustomTabsService";
                ResolveInfo resolveInfo = new Intent((String)((Object)hashSet));
                object = object.getPackageManager();
                hashSet = null;
                object = object.queryIntentServices((Intent)resolveInfo, 0);
                resolveInfo = "context.packageManager.q\u2026ervices(serviceIntent, 0)";
                Intrinsics.checkNotNullExpressionValue(object, (String)resolveInfo);
                resolveInfo = a;
                hashSet = "<this>";
                Intrinsics.checkNotNullParameter(resolveInfo, (String)((Object)hashSet));
                int n3 = ((String[])resolveInfo).length;
                n3 = eh1_2.c(n3);
                hashSet = new HashSet(n3);
                tp_2.L((Object[])resolveInfo, hashSet);
                object = object.iterator();
                while (true) {
                    boolean bl3 = object.hasNext();
                    if (!bl3) break block20;
                    resolveInfo = object.next();
                    resolveInfo = resolveInfo;
                    resolveInfo = resolveInfo.serviceInfo;
                    if (resolveInfo == null) continue;
                    String string2 = resolveInfo.packageName;
                    n3 = (int)(hashSet.contains(string2) ? 1 : 0);
                    if (n3 != 0) break;
                    continue;
                    break;
                }
                try {
                    return resolveInfo.packageName;
                }
                catch (Throwable throwable2) {}
                break block21;
            }
            return null;
        }
        td0.a(clazz, throwable2);
        return null;
    }

    public static final String b() {
        StringBuilder stringBuilder;
        String string2 = "fbconnect://cct.";
        Class<tf0_1> clazz = tf0_1.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return null;
        }
        try {
            stringBuilder = new StringBuilder(string2);
            string2 = FacebookSdk.a();
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return null;
        }
        string2 = string2.getPackageName();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static final String c(String string2) {
        Throwable throwable2;
        Class<tf0_1> clazz;
        block10: {
            block9: {
                String string3;
                block8: {
                    clazz = tf0_1.class;
                    boolean bl2 = td0.b(clazz);
                    if (bl2) {
                        return null;
                    }
                    string3 = "developerDefinedRedirectURI";
                    try {
                        Intrinsics.checkNotNullParameter(string2, string3);
                        string3 = FacebookSdk.a();
                    }
                    catch (Throwable throwable2) {}
                    bl2 = Xz3.a((Context)string3, string2);
                    if (!bl2) break block8;
                    return string2;
                }
                string2 = FacebookSdk.a();
                string3 = tf0_1.b();
                boolean bl3 = Xz3.a((Context)string2, string3);
                if (!bl3) break block9;
                return tf0_1.b();
                break block10;
            }
            return "";
        }
        td0.a(clazz, throwable2);
        return null;
    }
}

