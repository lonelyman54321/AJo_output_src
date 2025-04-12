/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from N6
 */
public final class n6_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ n6_0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        int n4 = this.a;
        object = (UY2)object;
        switch (n4) {
            default: {
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                Object object2 = StringCompanionObject.INSTANCE;
                object2 = hv3_0.K(R$string.acc_alert_popup);
                Object[] objectArray = new Object[n3];
                objectArray[0] = "";
                Object object3 = Arrays.copyOf(objectArray, n3);
                object3 = String.format((String)object2, object3);
                Intrinsics.checkNotNullExpressionValue(object3, "format(...)");
                RY2.e((UY2)object, (String)object3);
                return Unit.a;
            }
            case 0: 
        }
        Intrinsics.checkNotNullParameter(object, "$this$clearAndSetSemantics");
        RY2.d((UY2)object);
        return Unit.a;
    }
}

