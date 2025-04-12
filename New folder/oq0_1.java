/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OQ0
 */
public final class oq0_1
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ oq0_1(gq0_2 gq0_22, int n3) {
        this.a = gq0_22;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$onWishlistClicked");
        int n3 = Me3.b(this.b | 1);
        UQ0.f((gq0_2)object2, (b30_0)object, n3);
        return Unit.a;
    }
}

