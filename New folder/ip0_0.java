/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ip0
 */
public final class ip0_0 {
    public final boolean a;
    public final rq1_2 b;
    public final es3_0 c;

    public ip0_0() {
        this.a = false;
        Object object = et1_2.NONE;
        Serializable serializable = hp0.c;
        object = yr1_2.a(object, serializable);
        this.b = object;
        super(object);
        this.c = serializable;
    }

    public final void a(xp1_0 xp1_02) {
        int n3 = xp1_02.e();
        int n4 = 0;
        Integer n7 = null;
        if (n3 != 0) {
            n3 = this.a;
            if (n3 != 0) {
                Object object = this.b;
                Integer n8 = (Integer)((Map)object.getValue()).get(xp1_02);
                if (n8 == null) {
                    object = (Map)object.getValue();
                    n4 = xp1_02.k;
                    n7 = n4;
                    object.put(xp1_02, n7);
                } else {
                    n3 = xp1_02.k;
                    int n10 = n8;
                    if (n10 != n3) {
                        bh1_1.c("invalid node depth");
                        throw null;
                    }
                }
            }
            ((AbstractCollection)this.c).add(xp1_02);
            return;
        }
        bh1_1.c("DepthSortedSet.add called on an unattached node");
        throw null;
    }

    public final boolean b(xp1_0 xp1_02) {
        Map map2;
        boolean bl2;
        es3_0 es3_02 = this.c;
        boolean bl3 = ((AbstractCollection)es3_02).contains(xp1_02);
        boolean bl4 = this.a;
        if (bl4 && bl3 != (bl2 = (map2 = (Map)this.b.getValue()).containsKey(xp1_02))) {
            bh1_1.c("inconsistency in TreeSet");
            throw null;
        }
        return bl3;
    }

    public final boolean c(xp1_0 object) {
        boolean bl2 = ((xp1_0)object).e();
        if (bl2) {
            es3_0 es3_02 = this.c;
            bl2 = ((AbstractCollection)es3_02).remove(object);
            boolean bl3 = this.a;
            if (bl3) {
                int n3;
                Integer n4 = (Integer)((Map)this.b.getValue()).remove(object);
                if (bl2) {
                    n3 = ((xp1_0)object).k;
                    object = n3;
                } else {
                    n3 = 0;
                    object = null;
                }
                n3 = (int)(Intrinsics.areEqual(n4, object) ? 1 : 0);
                if (n3 == 0) {
                    bh1_1.c("invalid node depth");
                    throw null;
                }
            }
            return bl2;
        }
        bh1_1.c("DepthSortedSet.remove called on an unattached node");
        throw null;
    }

    public final String toString() {
        return ((Object)this.c).toString();
    }
}

