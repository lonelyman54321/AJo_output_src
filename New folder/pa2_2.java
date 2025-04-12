/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pA2
 */
public final class pa2_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ pa2_2(LP1 lP1, int n3, int n4) {
        this.a = lP1;
        this.b = n3;
        this.c = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        int n3 = Me3.b(this.c | 1);
        xA2.a(this.b, n3, (b30_0)object, lP1);
        return Unit.a;
    }
}

