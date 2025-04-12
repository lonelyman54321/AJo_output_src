/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class K50$e {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public K50$e() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
        this.b = hashMap = new HashMap();
        this.c = hashMap = new HashMap();
    }

    public final float a(QG object) {
        boolean bl2 = object instanceof ug_1;
        if (bl2) {
            HashMap hashMap = this.b;
            boolean bl3 = hashMap.containsKey(object = ((ug_1)object).e());
            if (bl3) {
                return ((K50$c)hashMap.get(object)).value();
            }
            hashMap = this.a;
            bl3 = hashMap.containsKey(object);
            if (bl3) {
                return ((Integer)hashMap.get(object)).floatValue();
            }
        } else {
            bl2 = object instanceof sg_1;
            if (bl2) {
                return ((sg_1)object).f();
            }
        }
        return 0.0f;
    }
}

