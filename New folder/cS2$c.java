/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class cS2$c {
    public final Object a;
    public boolean b;
    public final jS2 c;

    public cS2$c(cs2_1 object, Object object2) {
        this.a = object2;
        this.b = true;
        object2 = (Map)((cs2_1)object).a.get(object2);
        cS2$c$a cS2$c$a = new cS2$c$a((cs2_1)object);
        object = kS2.a;
        this.c = object = new jS2((Map)object2, cS2$c$a);
    }
}

