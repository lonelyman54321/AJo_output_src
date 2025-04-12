/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
import kotlinx.coroutines.c;
import kotlinx.coroutines.h;

public final class h83 {
    public static final c a(Executor executor) {
        Object object;
        boolean bl2 = executor instanceof gr0_1;
        if (bl2) {
            object = executor;
            object = (gr0_1)executor;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            object.getClass();
        }
        object = new h(executor);
        return object;
    }

    public static final int b(int[] nArray) {
        int n3 = nArray[2];
        int n4 = nArray[0];
        n3 -= n4;
        n4 = nArray[3];
        int n7 = nArray[1];
        return Math.min(n3, n4 -= n7);
    }

    public static boolean c(String object) {
        boolean bl2;
        Object object2 = CF3.a;
        object2 = Collections.unmodifiableSet(mm.c);
        HashSet<g40> hashSet = new HashSet<g40>();
        object2 = object2.iterator();
        while (bl2 = object2.hasNext()) {
            g40 g402 = (g40)object2.next();
            String string2 = g402.a();
            boolean bl3 = string2.equals(object);
            if (!bl3) continue;
            hashSet.add(g402);
        }
        boolean bl4 = hashSet.isEmpty();
        if (!bl4) {
            boolean bl5;
            block3: {
                object = hashSet.iterator();
                while (bl4 = object.hasNext()) {
                    object2 = (g40)object.next();
                    bl4 = object2.isSupported();
                    if (!bl4) continue;
                    bl5 = true;
                    break block3;
                }
                bl5 = false;
                object = null;
            }
            return bl5;
        }
        object = "Unknown feature ".concat((String)object);
        object2 = new RuntimeException((String)object);
        throw object2;
    }
}

