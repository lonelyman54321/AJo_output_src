/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DW1
 */
public final class dw1_2
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ dw1_2(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (Boolean)object;
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        ex1_02.U = bl2 = ((Boolean)object).booleanValue();
        return Unit.a;
    }
}

