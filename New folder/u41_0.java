/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import java.util.Map;

/*
 * Renamed from U41
 */
public final class u41_0
implements E$b {
    public static final U41$a d;
    public final Map a;
    public final E$b b;
    public final U41$b c;

    static {
        U41$a u41$a;
        d = u41$a = new Object();
    }

    public u41_0(Map object, E$b e$b, ay2_0 ay2_02) {
        this.a = object;
        this.b = e$b;
        this.c = object = new U41$b(ay2_02);
    }

    public final jD3 create(Class clazz) {
        Map map2 = this.a;
        boolean bl2 = map2.containsKey(clazz);
        if (!bl2) {
            return this.b.create(clazz);
        }
        this.c.getClass();
        oD3.c(clazz);
        throw null;
    }

    public final jD3 create(Class clazz, Wd0 wd0) {
        Map map2 = this.a;
        boolean bl2 = map2.containsKey(clazz);
        if (bl2) {
            return this.c.create(clazz, wd0);
        }
        return this.b.create(clazz, wd0);
    }

    public final /* synthetic */ jD3 create(yn1_2 yn1_22, Wd0 wd0) {
        wd0 = (or1_2)wd0;
        return oD3.a(this, yn1_22, (or1_2)wd0);
    }
}

