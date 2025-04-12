/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.network.AJioServiceLocator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class r0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ r0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (UY2)object;
                Intrinsics.checkNotNullParameter(object, "$this$clearAndSetSemantics");
                RY2.d((UY2)object);
                return Unit.a;
            }
            case 0: 
        }
        return AJioServiceLocator.d((bx1_1)object);
    }
}

