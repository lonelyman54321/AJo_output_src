/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KQ0
 */
public final class kq0_1
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ kq0_1(boolean bl2, int n3, hq0_1 hq0_12, int n4) {
        this.a = bl2;
        this.b = n3;
        this.c = hq0_12;
        this.d = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$onCartClicked");
        int n3 = Me3.b(this.d | 1);
        int n4 = this.b;
        object2 = (hq0_1)object2;
        UQ0.b(this.a, n4, (hq0_1)object2, (b30_0)object, n3);
        return Unit.a;
    }
}

