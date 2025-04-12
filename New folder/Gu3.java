/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Gu3
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ i70_0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ Gu3(int n3, LP1 lP1, dr0_0 dr0_02, i70_0 i70_02, int n4) {
        this.a = n3;
        this.b = lP1;
        this.c = dr0_02;
        this.d = i70_02;
        this.e = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.e | 1);
        LP1 lP1 = this.b;
        i70_0 i70_02 = this.d;
        ov3.o(this.a, lP1, dr0_02, i70_02, (b30_0)object3, n3);
        return Unit.a;
    }
}

