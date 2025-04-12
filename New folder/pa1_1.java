/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from pa1
 */
public final class pa1_1
implements Function1 {
    public final /* synthetic */ da1_2 a;
    public final /* synthetic */ jb1_2 b;

    public /* synthetic */ pa1_1(da1_2 da1_22, jb1_2 jb1_22) {
        this.a = da1_22;
        this.b = jb1_22;
    }

    public final Object invoke(Object object) {
        if ((object = (Throwable)object) != null) {
            object = this.a.k;
            eb0_2 eb0_22 = ch3_0.e;
            jb1_2 jb1_22 = this.b;
            ((rb0_2)object).a(eb0_22, jb1_22);
        }
        return Unit.a;
    }
}

