/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.TypedArray
 */
import android.content.res.TypedArray;

public final class ct3 {
    public static void a(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public static void b(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        string2 = String.valueOf(string2);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final void c(TypedArray object, int n3) {
        boolean bl2 = object.hasValue(n3);
        if (bl2) {
            return;
        }
        object = new IllegalArgumentException("Attribute not defined in set.");
        throw object;
    }

    public static void d(int n3, int n4) {
        if (n3 >= 0 && n3 < n4) {
            return;
        }
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
        throw indexOutOfBoundsException;
    }

    public static void e(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static void f(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public static void g(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        string2 = String.valueOf(string2);
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public static void h(Object object) {
        if (object != null) {
            return;
        }
        object = new IllegalStateException();
        throw object;
    }

    public static void i(Object object, String string2) {
        if (object != null) {
            return;
        }
        object = new IllegalStateException(string2);
        throw object;
    }
}

