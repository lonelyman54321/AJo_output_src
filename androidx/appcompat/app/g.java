/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.view.MenuInflater
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl$a;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.app.AppLocalesMetadataHolderService$a;
import androidx.appcompat.app.g$c;
import androidx.appcompat.app.g$d;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class g {
    public static final g$c a;
    public static final int b;
    public static jw1 c;
    public static jw1 d;
    public static Boolean e;
    public static boolean f;
    public static final Np g;
    public static final Object h;
    public static final Object i;

    static {
        Object object = new Object();
        Object object2 = new g$c((g$d)object);
        a = object2;
        b = -100;
        c = null;
        d = null;
        e = null;
        f = false;
        g = object = new Np(0);
        h = object2 = new Object();
        i = object2 = new Object();
    }

    public static boolean k(Context object) {
        block15: {
            Object object2 = e;
            if (object2 == null) {
                int n3;
                block14: {
                    block13: {
                        n3 = AppLocalesMetadataHolderService.a;
                        n3 = Build.VERSION.SDK_INT;
                        int n4 = 24;
                        if (n3 < n4) break block13;
                        n3 = AppLocalesMetadataHolderService$a.a() | 0x80;
                        break block14;
                    }
                    n3 = 640;
                }
                PackageManager packageManager = object.getPackageManager();
                Class<AppLocalesMetadataHolderService> clazz = AppLocalesMetadataHolderService.class;
                ComponentName componentName = new ComponentName(object, clazz);
                object = packageManager.getServiceInfo(componentName, n3);
                object = object.metaData;
                if (object == null) break block15;
                object2 = "autoStoreLocales";
                boolean bl2 = object.getBoolean((String)object2);
                object = bl2;
                try {
                    e = object;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    object = Boolean.FALSE;
                    e = object;
                }
            }
        }
        return e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void s(g g3) {
        Object object = h;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Object object2 = g;
                    object2.getClass();
                    Np$a np$a = new Np$a((Np)object2);
                    while (bl2 = np$a.hasNext()) {
                        object2 = np$a.next();
                        object2 = (WeakReference)object2;
                        object2 = ((Reference)object2).get();
                        if ((object2 = (g)object2) != g3 && object2 != null) continue;
                        np$a.remove();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public abstract P2 A(P2$a var1);

    public abstract void a(View var1, ViewGroup.LayoutParams var2);

    public Context b(Context context) {
        return context;
    }

    public abstract View c(int var1);

    public Context d() {
        return null;
    }

    public abstract AppCompatDelegateImpl.a e();

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract ActionBar h();

    public abstract void i();

    public abstract void j();

    public abstract void l(Configuration var1);

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean t(int var1);

    public abstract void u(int var1);

    public abstract void v(View var1);

    public abstract void w(View var1, ViewGroup.LayoutParams var2);

    public abstract void x(Toolbar var1);

    public void y(int n3) {
    }

    public abstract void z(CharSequence var1);
}

