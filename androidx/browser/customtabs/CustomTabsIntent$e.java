/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityOptions
 *  android.content.Intent
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
package androidx.browser.customtabs;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$b;
import androidx.browser.customtabs.CustomTabsIntent$c;
import androidx.browser.customtabs.CustomTabsIntent$d;
import androidx.browser.customtabs.a$a;

public final class CustomTabsIntent$e {
    public final Intent a;
    public final a$a b;
    public ActivityOptions c;
    public final boolean d;

    public CustomTabsIntent$e() {
        Object object;
        this.a = object = new Intent("android.intent.action.VIEW");
        this.b = object;
        this.d = true;
    }

    public CustomTabsIntent$e(bg0 bg02) {
        boolean bl2;
        Object object;
        Intent intent;
        this.a = intent = new Intent("android.intent.action.VIEW");
        this.b = object;
        this.d = bl2 = true;
        if (bg02 != null) {
            object = bg02.d.getPackageName();
            intent.setPackage((String)object);
            object = bg02.c.asBinder();
            Bundle bundle = new Bundle();
            String string2 = "android.support.customtabs.extra.SESSION";
            bundle.putBinder(string2, (IBinder)object);
            bg02 = bg02.e;
            if (bg02 != null) {
                object = "android.support.customtabs.extra.SESSION_ID";
                bundle.putParcelable((String)object, (Parcelable)bg02);
            }
            intent.putExtras(bundle);
        }
    }

    public final CustomTabsIntent a() {
        String string2;
        String string3;
        boolean bl2;
        Bundle bundle;
        boolean bl3;
        boolean bl4;
        int n3;
        String string4;
        Bundle bundle2;
        Intent intent = this.a;
        Object object = "android.support.customtabs.extra.SESSION";
        boolean bl5 = intent.hasExtra((String)object);
        Bundle bundle3 = null;
        if (!bl5) {
            bundle2 = new Bundle();
            bundle2.putBinder((String)object, null);
            intent.putExtras(bundle2);
        }
        bl5 = this.d;
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", bl5);
        object = this.b.a;
        bundle2 = new Bundle();
        if (object != null) {
            string4 = "android.support.customtabs.extra.TOOLBAR_COLOR";
            n3 = (Integer)object;
            bundle2.putInt(string4, n3);
        }
        intent.putExtras(bundle2);
        object = "androidx.browser.customtabs.extra.SHARE_STATE";
        bl5 = false;
        bundle2 = null;
        intent.putExtra((String)object, 0);
        n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4 && !(bl4 = TextUtils.isEmpty((CharSequence)(string4 = CustomTabsIntent$c.a()))) && !(bl3 = (bundle = (bl2 = intent.hasExtra(string3 = "com.android.browser.headers")) ? intent.getBundleExtra(string3) : new Bundle()).containsKey(string2 = "Accept-Language"))) {
            bundle.putString(string2, string4);
            intent.putExtra(string3, bundle);
        }
        if (n3 >= (n4 = 34)) {
            object = this.c;
            if (object == null) {
                object = CustomTabsIntent$b.a();
                this.c = object;
            }
            object = this.c;
            CustomTabsIntent$d.a((ActivityOptions)object, false);
        }
        if ((object = this.c) != null) {
            bundle3 = object.toBundle();
        }
        object = new CustomTabsIntent(intent, bundle3);
        return object;
    }
}

