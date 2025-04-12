/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class rO1
extends g13_0 {
    static {
        dK$c.Message.toRequestCode();
    }

    public rO1(mw0_0 object, int n3) {
        super((mw0_0)object, n3);
        object = dk_1.b;
        u13_0 u13_02 = new u13_0(n3);
        ((dK$b)object).a(n3, u13_02);
    }

    public final pm_0 a() {
        int n3 = this.d;
        pm_0 pm_02 = new pm_0(n3);
        return pm_02;
    }

    public final List c() {
        ArrayList<rO1$a> arrayList = new ArrayList<rO1$a>();
        rO1$a rO1$a = new rO1$a(this);
        arrayList.add(rO1$a);
        return arrayList;
    }

    public final boolean f() {
        return false;
    }
}

