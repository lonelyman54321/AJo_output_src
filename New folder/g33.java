/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class g33
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ int b;

    public /* synthetic */ g33(LP1 lP1, int n3) {
        this.a = lP1;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$modifier");
        int n3 = Me3.b(this.b | 1);
        h33.a(lP1, (b30_0)object, n3);
        return Unit.a;
    }
}

