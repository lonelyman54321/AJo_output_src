/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from rY0
 */
public final class ry0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ry0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                object3 = (ex1_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = cp_1.Companion;
                int n7 = nn_2.b((cp$a)object2, (DataCallback)object);
                if (n7 != 0) {
                    object2 = yn3_0.a;
                    Object[] objectArray = new Object[]{};
                    String string2 = "after delete success process callback";
                    ((yn3$a)object2).a(string2, objectArray);
                    ((ex1_0)object3).Xa();
                    object = ((DataCallback)object).getData();
                    objectArray = Boolean.TRUE;
                    int n8 = Intrinsics.areEqual(object, objectArray);
                    if (n8 != 0) {
                        objectArray = new Object[]{};
                        ((yn3$a)object2).a("after delete success process success", objectArray);
                        object = StringCompanionObject.INSTANCE;
                        n8 = R$string.acc_alert_message;
                        object = hv3_0.K(n8);
                        n7 = R$string.cart_item_removed_success_refresh;
                        object2 = hv3_0.K(n7);
                        objectArray = new Object[n3];
                        objectArray[0] = object2;
                        object2 = "format(...)";
                        object = xh2_0.a(objectArray, n3, (String)object, (String)object2);
                        n3 = R$string.cart_item_removed_success_refresh;
                        String string3 = hv3_0.K(n3);
                        ((ex1_0)object3).kb(string3, (String)object);
                        ((ex1_0)object3).sb(false);
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object3 = (vy0_1)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        ((vy0_1)object3).c.k(object);
        return Unit.a;
    }
}

