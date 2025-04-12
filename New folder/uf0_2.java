/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from UF0
 */
public final class uf0_2
implements Function2 {
    public final /* synthetic */ ResourceOwner a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ uf0_2(ResourceOwner resourceOwner, of0_2 of0_22, int n3) {
        this.a = resourceOwner;
        this.b = of0_22;
        this.c = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$brand");
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$brandClick");
        int n3 = Me3.b(this.c | 1);
        function1 = (of0_2)function1;
        iG0.a((ResourceOwner)object2, (of0_2)function1, (b30_0)object, n3);
        return Unit.a;
    }
}

