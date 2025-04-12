/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lo3
 */
public final class lo3_0
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ lo3_0(ob0_1 ob0_12, String string2, String string3, int n3) {
        this.a = ob0_12;
        this.b = string2;
        this.c = string3;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$title");
        String string3 = this.c;
        Intrinsics.checkNotNullParameter(string3, "$desc");
        int n3 = Me3.b(this.d | 1);
        ro3_0.f(ob0_12, string2, string3, (b30_0)object, n3);
        return Unit.a;
    }
}

