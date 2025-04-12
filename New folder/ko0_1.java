/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KO0
 */
public final class ko0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ko0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (Dw2)object;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter(object, "$this$popUpTo");
                ((Dw2)object).b = false;
                return Unit.a;
            }
            case 0: 
        }
        Intrinsics.checkNotNullParameter(object, "$this$popUpTo");
        ((Dw2)object).a = true;
        return Unit.a;
    }
}

