/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pd3
 */
public final class pd3_1
implements Function0 {
    public final /* synthetic */ ld3_1 a;

    public /* synthetic */ pd3_1(ld3_1 ld3_12) {
        this.a = ld3_12;
    }

    public final Object invoke() {
        Object object = this.a;
        Object object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, object2);
        object = ((ld3_1)object).f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
            object = null;
        }
        object.getClass();
        object2 = hv1_1.IDLE;
        ((dr0_0)object).b0((hv1_1)((Object)object2));
        ((dr0_0)object).B();
        return Unit.a;
    }
}

