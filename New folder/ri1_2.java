/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ri1
 */
public final class ri1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ri1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                op2_2 op2_22 = (op2_2)this.b;
                Intrinsics.checkNotNullParameter(op2_22, "this$0");
                op2_22.o.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (qu3)object;
        wi1_2 wi1_22 = (wi1_2)this.b;
        Intrinsics.checkNotNullParameter(wi1_22, "this$0");
        Intrinsics.checkNotNull(object);
        wi1_22.a((qu3)object);
        return Unit.a;
    }
}

