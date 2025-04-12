/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ni3
 */
public final class ni3_0
implements ol_1 {
    public final JA3 a;
    public final Vs3 b;
    public Object c;
    public Object d;
    public Ol e;
    public Ol f;
    public final Ol g;
    public long h;
    public Ol i;

    public ni3_0() {
        throw null;
    }

    public ni3_0(Gl object, Vs3 vs3, Object object2, Object object3, Ol ol) {
        object = object.b(vs3);
        this.a = object;
        this.b = vs3;
        this.c = object3;
        this.d = object2;
        this.e = object = (Ol)vs3.a().invoke(object2);
        this.f = object = (Ol)vs3.a().invoke(object3);
        object = ol != null ? Pl.a(ol) : Pl.b((Ol)vs3.a().invoke(object2));
        this.g = object;
        this.h = -1;
    }

    public final void a(Object object) {
        Object object2 = this.d;
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (!bl2) {
            long l2;
            this.d = object;
            object2 = this.b.a();
            this.e = object = (Ol)object2.invoke(object);
            object = null;
            this.i = null;
            this.h = l2 = (long)-1;
        }
    }

    public final boolean b() {
        return this.a.b();
    }

    public final Ol c(long l2) {
        Ol ol;
        boolean bl2 = nl_1.a(this, l2);
        if (!bl2) {
            Ol ol2 = this.e;
            Ol ol4 = this.f;
            Ol ol5 = this.g;
            JA3 jA3 = this.a;
            ol = jA3.e(l2, ol2, ol4, ol5);
        } else {
            ol = this.i;
            if (ol == null) {
                ol = this.e;
                Ol ol6 = this.f;
                Ol ol7 = this.g;
                JA3 jA3 = this.a;
                this.i = ol = jA3.d(ol, ol6, ol7);
            }
        }
        return ol;
    }

    public final /* synthetic */ boolean d(long l2) {
        return nl_1.a(this, l2);
    }

    public final long e() {
        long l2 = this.h;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            Ol ol = this.e;
            Ol ol2 = this.f;
            Ol ol4 = this.g;
            JA3 jA3 = this.a;
            this.h = l2 = jA3.g(ol, ol2, ol4);
        }
        return this.h;
    }

    public final Vs3 f() {
        return this.b;
    }

    public final Object g(long l2) {
        Object object;
        boolean bl2 = nl_1.a(this, l2);
        if (!bl2) {
            Ol ol = this.e;
            Ol ol2 = this.f;
            Ol ol4 = this.g;
            Object object2 = this.a;
            Ol ol5 = object2.f(l2, ol, ol2, ol4);
            int n3 = ol5.b();
            for (int i3 = 0; i3 < n3; ++i3) {
                float f5 = ol5.a(i3);
                boolean bl3 = Float.isNaN(f5) ^ true;
                if (bl3) {
                    continue;
                }
                object2 = new StringBuilder("AnimationVector cannot contain a NaN. ");
                ((StringBuilder)object2).append(ol5);
                ((StringBuilder)object2).append(". Animation: ");
                ((StringBuilder)object2).append(this);
                ((StringBuilder)object2).append(", playTimeNanos: ");
                ((StringBuilder)object2).append(l2);
                String string2 = ((StringBuilder)object2).toString();
                IllegalStateException illegalStateException = new IllegalStateException(string2);
                throw illegalStateException;
            }
            object = this.b.b().invoke(ol5);
        } else {
            object = this.c;
        }
        return object;
    }

    public final Object h() {
        return this.c;
    }

    public final void i(Object object) {
        Object object2 = this.c;
        boolean bl2 = Intrinsics.areEqual(object2, object);
        if (!bl2) {
            long l2;
            this.c = object;
            object2 = this.b.a();
            this.f = object = (Ol)object2.invoke(object);
            object = null;
            this.i = null;
            this.h = l2 = (long)-1;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TargetBasedAnimation: ");
        Object object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(" -> ");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(",initial velocity: ");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", duration: ");
        long l2 = this.e() / 1000000L;
        stringBuilder.append(l2);
        stringBuilder.append(" ms,animationSpec: ");
        object = this.a;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

