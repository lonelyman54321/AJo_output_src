/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Le2
 */
public final class le2_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ le2_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((Boolean)object).booleanValue();
                return Unit.a;
            }
            case 0: 
        }
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        Object object2 = RY2.a;
        object2 = MY2.i;
        Unit unit = Unit.a;
        object.a((TY2)object2, unit);
        return unit;
    }
}

