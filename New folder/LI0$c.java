/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;

public final class LI0$c
implements yw2 {
    public final LI0$b a;
    public final LI0$e b;
    public final yw2 c;

    public LI0$c(bw2_1 bw2_12, LI0$b lI0$b, LI0$e lI0$e) {
        this.c = bw2_12;
        this.a = lI0$b;
        this.b = lI0$e;
    }

    public final boolean a(Object object) {
        boolean bl2 = object instanceof LI0$d;
        if (bl2) {
            boolean bl3;
            Object object2 = object;
            object2 = ((LI0$d)object).b();
            ((Tb3$a)object2).a = bl3 = true;
        }
        this.b.a(object);
        return this.c.a(object);
    }

    public final Object b() {
        boolean bl2;
        int n3;
        Object object;
        Object object2 = this.c.b();
        if (object2 == null) {
            object2 = this.a.a();
            object = "FactoryPools";
            n3 = 2;
            bl2 = Log.isLoggable((String)object, (int)n3);
            if (bl2) {
                object = object2.getClass();
                object.toString();
            }
        }
        if (bl2 = object2 instanceof LI0$d) {
            object = object2;
            object = ((LI0$d)object2).b();
            n3 = 0;
            ((Tb3$a)object).a = false;
        }
        return object2;
    }
}

