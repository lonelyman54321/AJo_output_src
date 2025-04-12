/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tP
 */
public final class tp_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ tp_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (UY2)object;
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                String string2 = hv3_0.K(R$string.close);
                String string3 = hv3_0.K(R$string.cancel_product);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" ");
                stringBuilder.append(string3);
                stringBuilder.append(" popup");
                string2 = stringBuilder.toString();
                RY2.e((UY2)object, string2);
                return Unit.a;
            }
            case 0: 
        }
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "$this$DelegatingMutableSet");
        return ol3_0.a((String)object);
    }
}

