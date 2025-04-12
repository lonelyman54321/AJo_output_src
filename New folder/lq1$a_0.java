/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lq1$a
 */
public final class lq1$a_0
implements bl1_0 {
    public final /* synthetic */ bl1_0 a;
    public final /* synthetic */ jq1_2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ bl1_0 d;

    public lq1$a_0(bl1_0 bl1_02, jq1_2 jq1_22, int n3, bl1_0 bl1_03) {
        this.b = jq1_22;
        this.c = n3;
        this.d = bl1_03;
        this.a = bl1_02;
    }

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final int getWidth() {
        return this.a.getWidth();
    }

    public final void j() {
        int n3 = this.c;
        jq1_2 jq1_22 = this.b;
        jq1_22.e = n3;
        this.d.j();
        Iterable iterable = jq1_22.l.entrySet();
        mq1_1 mq1_12 = new mq1_1(jq1_22);
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(mq1_12, "predicate");
        cx_2.v(iterable, mq1_12, true);
    }

    public final Function1 k() {
        return this.a.k();
    }

    public final Map p() {
        return this.a.p();
    }
}

