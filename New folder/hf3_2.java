/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/*
 * Renamed from Hf3
 */
public final class hf3_2
implements ux1_2 {
    public final String a;
    public volatile ux1_2 b;
    public Boolean c;
    public Method d;
    public pb0_2 e;
    public final Queue f;
    public final boolean g;

    public hf3_2(String string2, LinkedBlockingQueue linkedBlockingQueue, boolean bl2) {
        this.a = string2;
        this.f = linkedBlockingQueue;
        this.g = bl2;
    }

    public final boolean a() {
        return this.h().a();
    }

    public final boolean b() {
        return this.h().b();
    }

    public final boolean c() {
        return this.h().c();
    }

    public final boolean d() {
        return this.h().d();
    }

    public final boolean e() {
        return this.h().e();
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<hf3_2> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = hf3_2.class) == (object2 = object.getClass())) {
            object = (hf3_2)object;
            object2 = this.a;
            object = ((hf3_2)object).a;
            boolean bl3 = ((String)object2).equals(object);
            if (!bl3) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final boolean f(cu1_2 cu1_22) {
        return this.h().f(cu1_22);
    }

    public final void g(String string2) {
        this.h().g(string2);
    }

    public final String getName() {
        return this.a;
    }

    public final ux1_2 h() {
        ux1_2 ux1_22 = this.b;
        if (ux1_22 != null) {
            return this.b;
        }
        boolean bl2 = this.g;
        if (bl2) {
            return ws1_2.a;
        }
        ux1_22 = this.e;
        if (ux1_22 == null) {
            ux1_22 = new Object();
            ((pb0_2)ux1_22).b = this;
            Object object = this.a;
            ((pb0_2)ux1_22).a = object;
            ((pb0_2)ux1_22).c = object = this.f;
            this.e = ux1_22;
        }
        return this.e;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        Object object = this.c;
        if (object != null) {
            return (Boolean)object;
        }
        object = this.b;
        object = object.getClass();
        String string2 = "log";
        int n3 = 1;
        Class[] classArray = new Class[n3];
        Class<cx1_1> clazz = cx1_1.class;
        classArray[0] = clazz;
        object = ((Class)object).getMethod(string2, classArray);
        this.d = object;
        object = Boolean.TRUE;
        try {
            this.c = object;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = Boolean.FALSE;
            this.c = object;
        }
        return this.c;
    }

    public final void info(String string2) {
        this.h().info(string2);
    }
}

