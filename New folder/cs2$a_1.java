/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cS2$a
 */
public final class cs2$a_1
extends Lambda
implements Function2 {
    public static final cs2$a_1 c;

    static {
        cs2$a_1 cs2$a_1;
        c = cs2$a_1 = new Lambda(2);
    }

    public final Object invoke(Object object, Object iterator) {
        boolean bl2;
        object = (ES2)object;
        iterator = (cs2_1)((Object)iterator);
        object = fh1_2.q(((cs2_1)((Object)iterator)).a);
        iterator = ((Iterable)((cs2_1)((Object)iterator)).b.values()).iterator();
        while (bl2 = iterator.hasNext()) {
            Object object2 = (cS2$c)iterator.next();
            boolean bl3 = ((cS2$c)object2).b;
            if (!bl3) continue;
            Map map2 = ((cS2$c)object2).c.e();
            boolean bl4 = map2.isEmpty();
            object2 = ((cS2$c)object2).a;
            if (bl4) {
                object.remove(object2);
                continue;
            }
            object.put(object2, map2);
        }
        boolean bl5 = object.isEmpty();
        if (bl5) {
            object = null;
        }
        return object;
    }
}

