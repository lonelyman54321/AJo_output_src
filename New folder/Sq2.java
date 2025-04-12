/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Set;

public class Sq2
extends a1_0 {
    public static final Sq2 f;
    public final hs3_0 d;
    public final int e;

    static {
        Sq2 sq2;
        hs3_0 hs3_02 = hs3_0.e;
        f = sq2 = new Sq2(hs3_02, 0);
    }

    public Sq2(hs3_0 hs3_02, int n3) {
        this.d = hs3_02;
        this.e = n3;
    }

    public boolean containsKey(Object object) {
        int n3 = object != null ? object.hashCode() : 0;
        return this.d.d(n3, 0, object);
    }

    public final Set e() {
        cr2_0 cr2_02 = new cr2_0(this);
        return cr2_02;
    }

    public final Set f() {
        er2_0 er2_02 = new er2_0(this);
        return er2_02;
    }

    public final int g() {
        return this.e;
    }

    public Object get(Object object) {
        int n3 = object != null ? object.hashCode() : 0;
        return this.d.g(n3, 0, object);
    }

    public final Collection h() {
        gr2_1 gr2_12 = new gr2_1(this);
        return gr2_12;
    }

    public final Sq2 j(Object object, Su1 object2) {
        hs3_0 hs3_02 = null;
        hs3_0 hs3_03 = this.d;
        int n3 = object != null ? object.hashCode() : 0;
        if ((object = hs3_03.u(object, n3, 0, object2)) == null) {
            return this;
        }
        hs3_02 = ((hs3$a)object).a;
        int n4 = ((hs3$a)object).b;
        n3 = this.e + n4;
        object2 = new Sq2(hs3_02, n3);
        return object2;
    }
}

