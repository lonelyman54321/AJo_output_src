/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from JQ0
 */
public final class jq0_1
implements Function2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ jq0_1(boolean bl2, gq0_2 gq0_22, int n3) {
        this.a = bl2;
        this.b = gq0_22;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$onWishlistClicked");
        int n3 = Me3.b(this.c | 1);
        boolean bl2 = this.a;
        object2 = (gq0_2)object2;
        UQ0.d(bl2, (gq0_2)object2, (b30_0)object, n3);
        return Unit.a;
    }
}

