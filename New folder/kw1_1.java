/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kW1
 */
public final class kw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ kw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        String string2 = "this$0";
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, string2);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            ex1_02.jb();
        }
        return Unit.a;
    }
}

