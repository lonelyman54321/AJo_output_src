/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.TreeSet;

public final class nJ {
    public final int a;
    public final String b;
    public final TreeSet c;
    public final ArrayList d;
    public zl0_0 e;

    public nJ(int n3, String string2, zl0_0 zl0_02) {
        AbstractCollection abstractCollection;
        this.a = n3;
        this.b = string2;
        this.e = zl0_02;
        this.c = abstractCollection = new AbstractCollection();
        this.d = abstractCollection;
    }

    public final boolean a(long l2, long l3) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.d)).size()); ++i3) {
            long l4;
            object = (nJ$a)((ArrayList)object).get(i3);
            long l7 = ((nJ$a)object).a;
            long l8 = ((nJ$a)object).b;
            long l12 = -1;
            long l14 = l8 - l12;
            Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (!(object2 == false ? (object2 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1)) >= 0 : (object2 = l3 == l12 ? 0 : (l3 < l12 ? -1 : 1)) != false && (object2 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1)) <= 0 && (object2 = (l4 = (l12 = l2 + l3) - (l7 += l8)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0)) continue;
            return true;
        }
        return false;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = nJ.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (nJ)object;
            int n3 = this.a;
            int n4 = ((nJ)object).a;
            if (n3 != n4 || (n3 = (int)(((String)(object2 = this.b)).equals(object3 = ((nJ)object).b) ? 1 : 0)) == 0 || (n3 = (int)((object2 = this.c).equals(object3 = ((nJ)object).c) ? 1 : 0)) == 0 || !(bl3 = ((zl0_0)(object2 = this.e)).equals(object = ((nJ)object).e))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        String string2 = this.b;
        n3 = zy_2.b(n3, 31, string2);
        return this.e.hashCode() + n3;
    }
}

