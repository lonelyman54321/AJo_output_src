/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayDeque;

public final class AP1$a {
    public static final ArrayDeque d;
    public int a;
    public int b;
    public Object c;

    static {
        Object object = dz3.a;
        object = new ArrayDeque;
        object(0);
        d = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static AP1$a a(Object object) {
        ArrayDeque arrayDeque = d;
        // MONITORENTER : arrayDeque
        Object object2 = arrayDeque.poll();
        object2 = (AP1$a)object2;
        // MONITOREXIT : arrayDeque
        if (object2 == null) {
            object2 = new Object();
        }
        ((AP1$a)object2).c = object;
        ((AP1$a)object2).b = 0;
        ((AP1$a)object2).a = 0;
        return object2;
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof AP1$a;
        boolean bl2 = false;
        if (n3 != 0) {
            Object object2;
            boolean bl3;
            object = (AP1$a)object;
            n3 = this.b;
            int n4 = ((AP1$a)object).b;
            if (n3 == n4 && (n3 = this.a) == (n4 = ((AP1$a)object).a) && (bl3 = (object2 = this.c).equals(object = ((AP1$a)object).c))) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        return this.c.hashCode() + n3;
    }
}

