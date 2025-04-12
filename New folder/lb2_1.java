/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lb2
 */
public final class lb2_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ lb2_1(int n3, qz1_2 qz1_22, String string2, boolean bl2) {
        this.a = qz1_22;
        this.b = bl2;
        this.c = string2;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$viewModel");
        int n3 = Me3.b(this.d | 1);
        boolean bl2 = this.b;
        String string2 = this.c;
        vl0_0.a(n3, (b30_0)object, (qz1_2)object2, string2, bl2);
        return Unit.a;
    }
}

