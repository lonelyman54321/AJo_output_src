/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ud
 */
public final class ud_2
implements Function1 {
    public final /* synthetic */ dr0_0 a;

    public /* synthetic */ ud_2(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object invoke(Object object) {
        object = (String)object;
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object, "queryString");
        dr0_02.getClass();
        Intrinsics.checkNotNullParameter(object, "query");
        dr0_02.O0 = true;
        Integer n3 = 0;
        dr0_02.i.setValue(n3);
        dr0_02.L0.setValue(object);
        return Unit.a;
    }
}

