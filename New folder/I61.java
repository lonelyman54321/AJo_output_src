/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class I61
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yz_0 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ I61(boolean bl2, yz_0 yz_02, dr0_0 dr0_02, int n3) {
        this.a = bl2;
        this.b = yz_02;
        this.c = dr0_02;
        this.d = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        yz_0 yz_02 = this.b;
        Intrinsics.checkNotNullParameter(yz_02, "$item");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n3 = Me3.b(this.d | 1);
        T61.b(this.a, yz_02, dr0_02, (b30_0)object, n3);
        return Unit.a;
    }
}

