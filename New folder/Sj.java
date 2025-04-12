/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class Sj
implements fk_0 {
    public final List a;

    public Sj(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final iw_0 a() {
        List list = this.a;
        Object object = (Bo1)list.get(0);
        boolean bl2 = ((Bo1)object).c();
        if (bl2) {
            object = new lv2_1(list);
            return object;
        }
        object = new on2(list);
        return object;
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        boolean bl2;
        Object object = this.a;
        int n3 = object.size();
        boolean bl3 = false;
        int n4 = 1;
        if (n3 == n4 && (bl2 = ((Bo1)(object = (Bo1)object.get(0))).c())) {
            bl3 = true;
        }
        return bl3;
    }
}

