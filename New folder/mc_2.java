/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mC
 */
public final class mc_2
implements Function2 {
    public final /* synthetic */ i90_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ mc_2(c80 c802, int n3, dr0_0 dr0_02) {
        this.a = c802;
        this.b = n3;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = (Integer)object;
        Object object3 = object2;
        object3 = (Subcomponent)object2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$coroutineScope");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n4 = this.b;
        object2 = new wc_2((Subcomponent)object3, n4, n3, dr0_02, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
        return Unit.a;
    }
}

