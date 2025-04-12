/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.c$a;

public final class vv1$c {
    public final Object a;
    public c$a b;
    public boolean c;
    public boolean d;

    public vv1$c(Object object) {
        this.a = object;
        this.b = object = new c$a();
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<vv1$c> clazz2;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz2 = vv1$c.class) == (clazz = object.getClass())) {
            object = ((vv1$c)object).a;
            return this.a.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

