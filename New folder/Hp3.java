/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

public final class Hp3 {
    public final int a;
    public final uJ2[] b;
    public final DF0[] c;
    public final bq3 d;
    public final Object e;

    public Hp3(uJ2[] uJ2Array, DF0[] dF0Array, bq3 bq32, cH1$a cH1$a) {
        int n3;
        int n4 = uJ2Array.length;
        int n7 = dF0Array.length;
        n4 = n4 == n7 ? 1 : 0;
        ct3.a(n4 != 0);
        this.b = uJ2Array;
        dF0Array = (DF0[])dF0Array.clone();
        this.c = dF0Array;
        this.d = bq32;
        this.e = cH1$a;
        this.a = n3 = uJ2Array.length;
    }

    public final boolean a(Hp3 object, int n3) {
        boolean bl2;
        boolean bl3 = false;
        if (object == null) {
            return false;
        }
        Object object2 = this.b[n3];
        uJ2 uJ22 = ((Hp3)object).b[n3];
        boolean bl4 = Objects.equals(object2, uJ22);
        if (bl4 && (bl2 = Objects.equals(object2 = this.c[n3], object = ((Hp3)object).c[n3]))) {
            bl3 = true;
        }
        return bl3;
    }

    public final boolean b(int n3) {
        uJ2[] uJ2Array = this.b;
        uJ2 uJ22 = uJ2Array[n3];
        if (uJ22 != null) {
            n3 = 1;
        } else {
            n3 = 0;
            uJ22 = null;
        }
        return n3 != 0;
    }
}

