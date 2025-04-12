/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ga0
 */
public final class ga0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ga0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (UY2)object;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                RY2.d((UY2)object);
                return Unit.a;
            }
            case 0: 
        }
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        String string2 = hv3_0.K(R$string.acc_gift_icon);
        RY2.e((UY2)object, string2);
        return Unit.a;
    }
}

