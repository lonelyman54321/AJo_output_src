/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class Xz3 {
    public static final /* synthetic */ int a;

    public static final boolean a(Context context, String object) {
        int n3;
        String string2;
        Object object2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            object2 = new Intent();
            object2.setAction("android.intent.action.VIEW");
            object2.addCategory("android.intent.category.DEFAULT");
            string2 = "android.intent.category.BROWSABLE";
            object2.addCategory(string2);
            object = Uri.parse((String)object);
            object2.setData((Uri)object);
            n3 = 64;
            object = packageManager.queryIntentActivities(object2, n3);
        } else {
            n3 = 0;
            object = null;
        }
        boolean bl2 = false;
        packageManager = null;
        if (object != null) {
            boolean bl3;
            object = object.iterator();
            boolean bl4 = false;
            object2 = null;
            while (bl3 = object.hasNext()) {
                object2 = ((ResolveInfo)object.next()).activityInfo;
                string2 = object2.name;
                String string3 = "com.facebook.CustomTabActivity";
                bl3 = Intrinsics.areEqual(string2, string3);
                if (bl3 && (bl4 = Intrinsics.areEqual(object2 = object2.packageName, string2 = context.getPackageName()))) {
                    bl4 = true;
                    continue;
                }
                return false;
            }
            bl2 = bl4;
        }
        return bl2;
    }

    public static final void b(Context object, boolean bl2) {
        boolean bl3;
        block4: {
            Intrinsics.checkNotNullParameter(object, "context");
            PackageManager packageManager = object.getPackageManager();
            int n3 = 1;
            if (packageManager != null) {
                String string2 = "com.facebook.FacebookActivity";
                ComponentName componentName = new ComponentName(object, string2);
                try {
                    object = packageManager.getActivityInfo(componentName, n3);
                    break block4;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {}
            }
            bl3 = false;
            object = null;
        }
        if (object == null && !(bl3 = bl2 ^ true)) {
            String string3 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.".toString();
            object = new IllegalStateException(string3);
            throw object;
        }
    }

    public static final void c(Context object, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "android.permission.INTERNET";
        int n3 = object.checkCallingOrSelfPermission(string2);
        int n4 = -1;
        if (n3 == n4 && (n3 = bl2 ^ 1) == 0) {
            String string3 = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString();
            object = new IllegalStateException(string3);
            throw object;
        }
    }

    public static final void d(String string2, String object) {
        Intrinsics.checkNotNullParameter(string2, "arg");
        String string3 = "name";
        Intrinsics.checkNotNullParameter(object, string3);
        int n3 = string2.length();
        if (n3 > 0) {
            return;
        }
        string2 = cP.a("Argument '", (String)object, "' cannot be empty");
        string2 = string2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static final void e(Collection object) {
        boolean bl2;
        String string2 = "container";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "requests";
        String string4 = "name";
        Intrinsics.checkNotNullParameter(string3, string4);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(string3, string4);
        Iterator iterator = object.iterator();
        while (bl2 = iterator.hasNext()) {
            Object e2 = iterator.next();
            if (e2 != null) continue;
            object = new NullPointerException("Container 'requests' cannot contain null values");
            throw object;
        }
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(string3, string4);
        boolean bl3 = object.isEmpty() ^ true;
        if (bl3) {
            return;
        }
        string2 = "Container 'requests' cannot be empty".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static final void f(Object object, String string2) {
        String string3 = "name";
        Intrinsics.checkNotNullParameter(string2, string3);
        if (object != null) {
            return;
        }
        string2 = cP.a("Argument '", string2, "' cannot be null");
        object = new NullPointerException(string2);
        throw object;
    }

    public static final void g(String string2, String object) {
        int n3;
        String string3 = "name";
        Intrinsics.checkNotNullParameter(object, string3);
        if (string2 != null && (n3 = string2.length()) > 0) {
            return;
        }
        string2 = cP.a("Argument '", (String)object, "' cannot be null or empty");
        string2 = string2.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public static final void h() {
        boolean bl2 = FacebookSdk.isInitialized();
        if (bl2) {
            return;
        }
        FacebookSdkNotInitializedException facebookSdkNotInitializedException = new FacebookException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        throw facebookSdkNotInitializedException;
    }
}

