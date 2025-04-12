/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from M61
 */
public final class m61_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ m61_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Throwable)object;
                object = yn3_0.a;
                Object[] objectArray = new Object[]{};
                ((yn3$a)object).a("Error while deleting images list", objectArray);
                return Unit.a;
            }
            case 0: 
        }
        object = (Dw2)object;
        Intrinsics.checkNotNullParameter(object, "$this$popUpTo");
        ((Dw2)object).b = false;
        return Unit.a;
    }
}

