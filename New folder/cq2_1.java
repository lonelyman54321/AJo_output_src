/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.launch.activity.SplashScreenActivity;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.utils.JsonUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cq2
 */
public final class cq2_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cq2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                object3 = (SplashScreenActivity)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(object, "bottomNavigationDataDataCallback");
                object2 = cp_1.Companion;
                boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (bl2) {
                    ((SplashScreenActivity)object3).D2();
                }
                return Unit.a;
            }
            case 0: 
        }
        object3 = (g)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        Intrinsics.checkNotNullParameter(object, "abortTransactionCallback");
        object2 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n4 != 0) {
            object2 = ((g)object3).c;
            if (object2 != null) {
                object2.h();
            }
            n4 = ((DataCallback)object).getStatus();
            n3 = 0;
            if (n4 == 0) {
                object2 = ((g)object3).Wa();
                boolean bl3 = dm0_0.b;
                object = JsonUtils.toJson(((DataCallback)object).getData());
                int n7 = 12;
                object3 = new hj2_0((String)object, n7, bl3, false);
                ((kj2_1)object2).c((hj2_0)object3);
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == (n4 = 1)) {
                    object = ((g)object3).Wa();
                    boolean bl4 = dm0_0.b;
                    int n10 = 14;
                    boolean bl5 = false;
                    object2 = new hj2_0(null, n10, bl4, false);
                    ((kj2_1)object).c((hj2_0)object2);
                }
            }
        }
        return Unit.a;
    }
}

