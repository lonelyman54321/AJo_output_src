/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from vs3
 */
public final class vs3_0
implements r60_0,
iw$a {
    public final boolean a;
    public final ArrayList b;
    public final y13$a c;
    public final es0_0 d;
    public final es0_0 e;
    public final es0_0 f;

    public vs3_0(kw_1 kw_12, y13 object) {
        es0_0 es0_02;
        boolean bl2;
        Object object2 = new ArrayList();
        this.b = object2;
        object.getClass();
        this.a = bl2 = ((y13)object).e;
        object2 = ((y13)object).a;
        this.c = object2;
        object2 = ((y13)object).b.d();
        this.d = object2;
        this.e = es0_02 = ((y13)object).c.d();
        this.f = object = ((y13)object).d.d();
        kw_12.g((iw_0)object2);
        kw_12.g(es0_02);
        kw_12.g((iw_0)object);
        ((iw_0)object2).a(this);
        es0_02.a(this);
        ((iw_0)object).a(this);
    }

    public final void a() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.b)).size()); ++i3) {
            object = (iw$a)((ArrayList)object).get(i3);
            object.a();
        }
    }

    public final void b(List list, List list2) {
    }

    public final void c(iw$a iw$a) {
        this.b.add(iw$a);
    }
}

