/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.data.repo.DataCallback;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from vM
 */
public final class vm_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vm_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = this.b;
        Object[] objectArray = "this$0";
        int n4 = this.a;
        object = (DataCallback)object;
        switch (n4) {
            default: {
                object2 = (v33)object2;
                Intrinsics.checkNotNullParameter(object2, (String)objectArray);
                ((v33)object2).c.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object2 = (CartAddressListBottomSheet)object2;
        Intrinsics.checkNotNullParameter(object2, (String)objectArray);
        objectArray = cp_1.Companion;
        int n7 = nn_2.b((cp$a)objectArray, (DataCallback)object);
        if (n7 != 0) {
            Intrinsics.checkNotNull(object);
            n7 = ((DataCallback)object).getStatus();
            if (n7 == 0) {
                ((CartAddressListBottomSheet)object2).Oa();
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_error_message;
                    object = hv3_0.K(n8);
                    int n10 = R$string.addresses_not_able_to_fetch;
                    object2 = hv3_0.K(n10);
                    objectArray = new Object[n3];
                    n4 = 0;
                    objectArray[0] = object2;
                    Object object3 = Arrays.copyOf(objectArray, n3);
                    object = String.format((String)object, object3);
                    object3 = "format(...)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                }
            }
        }
        return Unit.a;
    }
}

