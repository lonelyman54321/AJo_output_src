/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 */
package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat$1;
import androidx.core.app.b$a;
import androidx.core.app.b$b;
import androidx.core.app.b$c;
import androidx.core.app.b$d;
import androidx.core.app.b$e;
import java.util.Arrays;
import java.util.HashSet;

public final class b
extends t70 {
    public static void a(int n3, Activity object, String[] handler) {
        int n4;
        Object object2;
        int n7;
        String[] stringArray;
        int n8;
        int n10;
        Object object3 = new HashSet();
        int n14 = 0;
        for (n10 = 0; n10 < (n8 = ((String[])handler).length); ++n10) {
            stringArray = handler[n10];
            n8 = (int)(TextUtils.isEmpty((CharSequence)stringArray) ? 1 : 0);
            if (n8 == 0) {
                n8 = Build.VERSION.SDK_INT;
                n7 = 33;
                if (n8 >= n7 || (n8 = (int)(TextUtils.equals((CharSequence)(stringArray = handler[n10]), (CharSequence)(object2 = "android.permission.POST_NOTIFICATIONS")) ? 1 : 0)) == 0) continue;
                stringArray = n10;
                ((HashSet)object3).add(stringArray);
                continue;
            }
            object = new StringBuilder("Permission request for permissions ");
            handler = Arrays.toString((Object[])handler);
            object = h30_0.a((StringBuilder)object, (String)handler, " must not contain null or empty values");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        n10 = ((HashSet)object3).size();
        if (n10 > 0) {
            n8 = ((String[])handler).length - n10;
            stringArray = new String[n8];
        } else {
            stringArray = handler;
        }
        if (n10 > 0) {
            n7 = ((String[])handler).length;
            if (n10 == n7) {
                return;
            }
            n10 = 0;
            while (n14 < (n7 = ((String[])handler).length)) {
                object2 = n14;
                n7 = (int)(((HashSet)object3).contains(object2) ? 1 : 0);
                if (n7 == 0) {
                    n7 = n10 + 1;
                    Handler handler2 = handler[n14];
                    stringArray[n10] = handler2;
                    n10 = n7;
                }
                ++n14;
            }
        }
        if ((n4 = Build.VERSION.SDK_INT) >= (n14 = 23)) {
            n4 = object instanceof b$e;
            if (n4 != 0) {
                object3 = object;
                object3 = (b$e)object;
                object3.validateRequestPermissionsRequestCode(n3);
            }
            b$a.b(n3, object, (String[])handler);
        } else {
            boolean bl2 = object instanceof b$d;
            if (bl2) {
                object3 = Looper.getMainLooper();
                handler = new Handler((Looper)object3);
                object3 = new ActivityCompat$1(n3, (Activity)object, stringArray);
                handler.post((Runnable)object3);
            }
        }
    }

    public static boolean b(Activity activity, String string2) {
        String string3;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 33;
        if (n3 < n4 && (n4 = (int)(TextUtils.equals((CharSequence)(string3 = "android.permission.POST_NOTIFICATIONS"), (CharSequence)string2) ? 1 : 0)) != 0) {
            return false;
        }
        n4 = 32;
        if (n3 >= n4) {
            return b$c.a(activity, string2);
        }
        n4 = 31;
        if (n3 == n4) {
            return b$b.a(activity, string2);
        }
        n4 = 23;
        if (n3 >= n4) {
            return b$a.c(activity, string2);
        }
        return false;
    }
}

