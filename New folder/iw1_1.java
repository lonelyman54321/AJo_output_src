/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IW1
 */
public final class iw1_1
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ iw1_1(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        ex1_0 ex1_02 = this.a;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        cp$a cp$a = cp_1.Companion;
        int n3 = nn_2.b(cp$a, (DataCallback)object);
        if (n3 != 0) {
            ex1_02.Xa();
            n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                object = null;
                ex1_02.Za(false);
            } else {
                int n4;
                n3 = ((DataCallback)object).getStatus();
                if (n3 == (n4 = 1)) {
                    object = ((DataCallback)object).getError();
                    ex1_02.Ua((DataError)object);
                }
            }
        }
        return Unit.a;
    }
}

