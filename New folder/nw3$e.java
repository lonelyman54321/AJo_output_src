/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class nw3$e {
    public final Unsafe a;

    public nw3$e(Unsafe unsafe) {
        this.a = unsafe;
    }

    public final int a(Class clazz) {
        return this.a.arrayBaseOffset(clazz);
    }

    public final int b(Class clazz) {
        return this.a.arrayIndexScale(clazz);
    }

    public abstract boolean c(Object var1, long var2);

    public abstract byte d(Object var1, long var2);

    public abstract double e(Object var1, long var2);

    public abstract float f(Object var1, long var2);

    public final int g(Object object, long l2) {
        return this.a.getInt(object, l2);
    }

    public final long h(Object object, long l2) {
        return this.a.getLong(object, l2);
    }

    public final Object i(Object object, long l2) {
        return this.a.getObject(object, l2);
    }

    public final long j(Field field) {
        return this.a.objectFieldOffset(field);
    }

    public abstract void k(Object var1, long var2, boolean var4);

    public abstract void l(Object var1, long var2, byte var4);

    public abstract void m(Object var1, long var2, double var4);

    public abstract void n(Object var1, long var2, float var4);

    public final void o(Object object, long l2, int n3) {
        this.a.putInt(object, l2, n3);
    }

    public final void p(Object object, long l2, long l3) {
        this.a.putLong(object, l2, l3);
    }

    public final void q(Object object, long l2, Object object2) {
        this.a.putObject(object, l2, object2);
    }
}

