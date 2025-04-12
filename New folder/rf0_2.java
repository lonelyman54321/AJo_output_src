/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RF0
 */
public final class rf0_2
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ BaseValue d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;

    public /* synthetic */ rf0_2(Subcomponent subcomponent, boolean bl2, int n3, BaseValue baseValue, nf0_1 nf0_12, of0_2 of0_22, nh0_0 nh0_02, int n4) {
        this.a = subcomponent;
        this.b = bl2;
        this.c = n3;
        this.d = baseValue;
        this.e = nf0_12;
        this.f = of0_22;
        this.g = nh0_02;
        this.h = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.e;
        Intrinsics.checkNotNullParameter(object, "$onClickExpanded");
        object2 = this.f;
        Intrinsics.checkNotNullParameter(object2, "$brandClick");
        Object object4 = this.g;
        Intrinsics.checkNotNullParameter(object4, "$sendImpression");
        int n3 = Me3.b(this.h | 1);
        Object object5 = object;
        object5 = (nf0_1)object;
        Object object6 = object2;
        object6 = (of0_2)object2;
        Function2 function2 = object4;
        function2 = (nh0_0)object4;
        object4 = this.a;
        boolean bl2 = this.b;
        int n4 = this.c;
        BaseValue baseValue = this.d;
        iG0.b((Subcomponent)object4, bl2, n4, baseValue, (nf0_1)object5, (of0_2)object6, (nh0_0)function2, (b30_0)object3, n3);
        return Unit.a;
    }
}

