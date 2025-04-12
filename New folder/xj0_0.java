/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XJ0
 */
public final class xj0_0
implements Function2 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ xj0_0(c80 c802, int n3, dr0_0 dr0_02) {
        this.a = c802;
        this.b = n3;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = (Integer)object;
        Object object3 = object2;
        object3 = (Subcomponent)object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$scope");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        object2 = ir0_2.a;
        object2 = em0_2.b;
        int n4 = this.b;
        dk0_2 dk0_22 = new dk0_2((Subcomponent)object3, n4, n3, dr0_02, null);
        Ae3.d((i90_0)object, (CoroutineContext)object2, null, dk0_22, 2);
        return Unit.a;
    }
}

