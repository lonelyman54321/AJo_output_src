/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from b7
 */
public final class b7_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Hj b;

    public /* synthetic */ b7_0(Hj hj, int n3) {
        this.a = n3;
        this.b = hj;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                qz1_2 qz1_22 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
                Object object = (Boolean)qz1_22.v0.getValue();
                boolean bl2 = (Boolean)object;
                if (bl2) {
                    Object object2;
                    bl2 = h40_0.U0();
                    int n4 = 3;
                    if (bl2) {
                        object = md3_0.c(qz1_22);
                        object2 = new wz1_2(qz1_22, null);
                        Ae3.d((i90_0)object, null, null, (Function2)object2, n4);
                    }
                    object = (CartOrder)qz1_22.l.getValue();
                    object2 = md3_0.c(qz1_22);
                    c02_0 c02_02 = new c02_0(qz1_22, (CartOrder)object, null);
                    Ae3.d((i90_0)object2, null, null, c02_02, n4);
                }
                return Unit.a;
            }
            case 0: 
        }
        j7_0 j7_02 = (j7_0)this.b;
        Intrinsics.checkNotNullParameter(j7_02, "this$0");
        return UserInformation.getInstance((Context)j7_02.a);
    }
}

