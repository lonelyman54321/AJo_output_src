/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Ep3 {
    public final qp3 a;
    public final ImmutableList b;

    static {
        gz3.D(0);
        gz3.D(1);
    }

    public Ep3(qp3 object, List list) {
        int n3;
        Integer n4;
        int n7 = list.isEmpty();
        if (n7 == 0 && ((n7 = (n4 = (Integer)Collections.min(list)).intValue()) < 0 || (n7 = (n4 = (Integer)Collections.max(list)).intValue()) >= (n3 = ((qp3)object).a))) {
            object = new IndexOutOfBoundsException();
            throw object;
        }
        this.a = object;
        this.b = object = ImmutableList.copyOf((Collection)list);
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = Ep3.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (Ep3)object;
            object2 = this.a;
            object3 = ((Ep3)object).a;
            boolean bl4 = ((qp3)object2).equals(object3);
            if (!bl4 || !(bl3 = ((ImmutableList)(object2 = this.b)).equals(object = ((Ep3)object).b))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        return this.b.hashCode() * 31 + n3;
    }
}

