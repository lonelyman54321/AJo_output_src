/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from GA2
 */
public final class ga2_1
implements al1_1 {
    public final /* synthetic */ tr1_0 a;
    public final /* synthetic */ nl1_0 b;
    public final /* synthetic */ i50_0 c;
    public final /* synthetic */ tr1_0 d;

    public ga2_1(tr1_0 tr1_02, nl1_0 nl1_02, i50_0 i50_02, tr1_0 tr1_03) {
        this.a = tr1_02;
        this.b = nl1_02;
        this.c = i50_02;
        this.d = tr1_03;
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        this.a.getValue();
        bp1_0 bp1_02 = dl1_12.getLayoutDirection();
        i50_0 i50_02 = this.c;
        l2 = this.b.i(l2, bp1_02, i50_02, list);
        this.d.getValue();
        int n3 = (int)(l2 >> 32);
        int n4 = (int)(l2 & 0xFFFFFFFFL);
        nl1_0 nl1_02 = this.b;
        GA2$a gA2$a = new GA2$a(nl1_02, list);
        return cl1_0.a(dl1_12, n3, n4, gA2$a);
    }

    public final /* synthetic */ int h(Rj1 rj1, List list, int n3) {
        return ZK1.d(this, rj1, list, n3);
    }

    public final /* synthetic */ int i(Rj1 rj1, List list, int n3) {
        return ZK1.a(this, rj1, list, n3);
    }

    public final /* synthetic */ int j(Rj1 rj1, List list, int n3) {
        return ZK1.c(this, rj1, list, n3);
    }
}

