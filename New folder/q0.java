/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.network.AJioServiceLocator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class q0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ q0(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter((UY2)object, "$this$semantics");
                return Unit.a;
            }
            case 0: 
        }
        return AJioServiceLocator.b((a70_0)object);
    }
}

