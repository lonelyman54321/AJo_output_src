/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

/*
 * Renamed from dS2
 */
public final class ds2_1
implements Cr0 {
    public final /* synthetic */ cS2$c a;
    public final /* synthetic */ cs2_1 b;
    public final /* synthetic */ Object c;

    public ds2_1(cS2$c cS2$c, cs2_1 cs2_12, Object object) {
        this.a = cS2$c;
        this.b = cs2_12;
        this.c = object;
    }

    public final void dispose() {
        Object object = this.b;
        Object object2 = ((cs2_1)object).a;
        Object object3 = this.a;
        boolean bl2 = ((cS2$c)object3).b;
        if (bl2) {
            Map map2 = ((cS2$c)object3).c.e();
            boolean bl3 = map2.isEmpty();
            object3 = ((cS2$c)object3).a;
            if (bl3) {
                object2.remove(object3);
            } else {
                object2.put(object3, map2);
            }
        }
        object = ((cs2_1)object).b;
        object2 = this.c;
        object.remove(object2);
    }
}

