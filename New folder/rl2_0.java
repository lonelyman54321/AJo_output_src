/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from rl2
 */
public final class rl2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ es1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ nl2_0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ pg2_0 g;
    public final /* synthetic */ Nc$c h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ int j;

    public rl2_0(es1 es12, long l2, nl2_0 nl2_02, long l3, pg2_0 pg2_02, Nc$c nc$c, boolean bl2, int n3) {
        this.c = es12;
        this.d = l2;
        this.e = nl2_02;
        this.f = l3;
        this.g = pg2_02;
        this.h = nc$c;
        this.i = bl2;
        this.j = n3;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = ((Number)object).intValue();
        es1 es12 = this.c;
        bp1_0 bp1_02 = es12.getLayoutDirection();
        pg2_0 pg2_02 = this.g;
        Nc$c nc$c = this.h;
        long l2 = this.d;
        nl2_0 nl2_02 = this.e;
        long l3 = this.f;
        boolean bl2 = this.i;
        int n4 = this.j;
        return sl2_0.a(es12, n3, l2, nl2_02, l3, pg2_02, nc$c, bp1_02, bl2, n4);
    }
}

