/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from hq1
 */
public final class hq1_1
extends Lambda
implements Function0 {
    public final /* synthetic */ bq1 c;
    public final /* synthetic */ long d;

    public hq1_1(bq1 bq12, long l2) {
        this.c = bq12;
        this.d = l2;
        super(0);
    }

    public final Object invoke() {
        xb1_0 xb1_02 = this.c.a().h1();
        Intrinsics.checkNotNull(xb1_02);
        long l2 = this.d;
        xb1_02.Q(l2);
        return Unit.a;
    }
}

