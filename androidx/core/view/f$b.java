/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.WindowInsets
 */
package androidx.core.view;

import android.graphics.Rect;
import android.view.WindowInsets;
import androidx.core.view.f;
import androidx.core.view.f$e;
import androidx.core.view.f$k;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class f$b
extends f$e {
    public static Field e;
    public static boolean f = false;
    public static Constructor g;
    public static boolean h = false;
    public WindowInsets c;
    public ei1 d;

    public f$b() {
        WindowInsets windowInsets;
        this.c = windowInsets = f$b.i();
    }

    public f$b(f f5) {
        super(f5);
        f5 = f5.g();
        this.c = f5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static WindowInsets i() {
        Object object;
        Object var0 = null;
        boolean bl2 = f;
        int n3 = 1;
        Rect rect = WindowInsets.class;
        if (!bl2) {
            object = "CONSUMED";
            try {
                e = object = rect.getDeclaredField((String)object);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {}
            f = n3;
        }
        if ((object = e) != null) {
            try {
                object = ((Field)object).get(null);
                object = (WindowInsets)object;
                if (object != null) {
                    return new WindowInsets((WindowInsets)object);
                }
            }
            catch (ReflectiveOperationException reflectiveOperationException) {}
        }
        if (!(bl2 = h)) {
            try {
                Class<Rect> clazz;
                object = new Class[n3];
                object[0] = clazz = Rect.class;
                g = object = rect.getConstructor((Class<?>)object);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {}
            h = n3;
        }
        if ((object = g) == null) return null;
        try {
            rect = new Rect();
            Object[] objectArray = new Object[n3];
            objectArray[0] = rect;
            var0 = ((Constructor)object).newInstance(objectArray);
            return var0;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {}
        return null;
    }

    public f b() {
        this.a();
        Object object = this.c;
        object = androidx.core.view.f.h(null, object);
        Object object2 = this.b;
        f$k f$k = object.a;
        f$k.p((ei1[])object2);
        object2 = this.d;
        f$k.r((ei1)object2);
        return object;
    }

    public void e(ei1 ei12) {
        this.d = ei12;
    }

    public void g(ei1 ei12) {
        WindowInsets windowInsets = this.c;
        if (windowInsets != null) {
            int n3 = ei12.a;
            int n4 = ei12.c;
            int n7 = ei12.d;
            int n8 = ei12.b;
            ei12 = windowInsets.replaceSystemWindowInsets(n3, n8, n4, n7);
            this.c = ei12;
        }
    }
}

