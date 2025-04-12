/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lS
 */
public final class ls_2
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ls_2(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (UY2)object;
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                RY2.d((UY2)object);
                return Unit.a;
            }
            case 0: 
        }
        object = (pa1_0)object;
        Intrinsics.checkNotNullParameter(object, "it");
        return ((pa1_0)object).a.length();
    }
}

