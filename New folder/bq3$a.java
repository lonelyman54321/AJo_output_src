/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.primitives.Booleans;
import java.util.Arrays;

public final class bq3$a {
    public final int a;
    public final qp3 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        gz3.D(0);
        gz3.D(1);
        gz3.D(3);
        gz3.D(4);
    }

    public bq3$a(qp3 object, boolean bl2, int[] nArray, boolean[] blArray) {
        int n3;
        this.a = n3 = ((qp3)object).a;
        int n4 = nArray.length;
        boolean bl3 = false;
        int n7 = 1;
        n4 = n3 == n4 && n3 == (n4 = blArray.length) ? 1 : 0;
        ct3.a(n4 != 0);
        this.b = object;
        if (bl2 && n3 > n7) {
            bl3 = true;
        }
        this.c = bl3;
        object = (int[])nArray.clone();
        this.d = (int[])object;
        object = (boolean[])blArray.clone();
        this.e = (boolean[])object;
    }

    public final int a() {
        return this.b.c;
    }

    public final boolean b() {
        return Booleans.contains(this.e, true);
    }

    public final boolean c() {
        int[] nArray;
        int n3;
        for (int i3 = 0; i3 < (n3 = (nArray = this.d).length); ++i3) {
            n3 = (int)(this.d(i3) ? 1 : 0);
            if (n3 == 0) continue;
            return true;
        }
        return false;
    }

    public final boolean d(int n3) {
        int[] nArray = this.d;
        int n4 = 4;
        n3 = (n3 = nArray[n3]) != n4 ? 0 : 1;
        return n3 != 0;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = bq3$a.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (bq3$a)object;
            boolean bl4 = this.c;
            boolean bl5 = ((bq3$a)object).c;
            if (!(bl4 == bl5 && (bl4 = ((qp3)(object2 = this.b)).equals(object3 = ((bq3$a)object).b)) && (bl4 = Arrays.equals((int[])(object2 = (Object)this.d), (int[])(object3 = (Object)((bq3$a)object).d))) && (bl3 = Arrays.equals((boolean[])(object2 = (Object)this.e), (boolean[])(object = (Object)((bq3$a)object).e))))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        int n4 = this.c;
        n3 = (n3 + n4) * 31;
        int n7 = (Arrays.hashCode(this.d) + n3) * 31;
        return Arrays.hashCode(this.e) + n7;
    }
}

