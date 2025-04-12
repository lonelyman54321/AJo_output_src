/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public abstract class cU1 {
    public static final cU1$f b;
    public static final cU1$h c;
    public static final cU1$d d;
    public static final cU1$b e;
    public static final cU1$j f;
    public final boolean a;

    static {
        cU1$j cU1$j;
        cU1 cU12;
        cU1$f cU1$f;
        b = cU1$f = new cU1(false);
        c = cU12 = new cU1(false);
        cU12 = new cU1(false);
        d = cU12;
        cU12 = new cU1(false);
        e = cU12;
        f = cU1$j = new cU1(true);
    }

    public cU1(boolean bl2) {
        this.a = bl2;
    }

    public abstract Object a(Bundle var1, String var2);

    public String b() {
        return "nav_type";
    }

    public Object c(Object object, String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return this.d(string2);
    }

    public abstract Object d(String var1);

    public abstract void e(Bundle var1, String var2, Object var3);

    public String f(Object object) {
        return String.valueOf(object);
    }

    public boolean g(Object object, Object object2) {
        return Intrinsics.areEqual(object, object2);
    }

    public final String toString() {
        return this.b();
    }
}

