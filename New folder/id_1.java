/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from id
 */
public final class id_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;

    public /* synthetic */ id_1(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object = 0;
        dr0_02.i.setValue(object);
        object = hv1_1.IDLE;
        dr0_02.a0((hv1_1)((Object)object));
        Boolean bl2 = Boolean.FALSE;
        dr0_02.j.setValue(bl2);
        dr0_02.a0((hv1_1)((Object)object));
        dr0_02.s();
        return Unit.a;
    }
}

