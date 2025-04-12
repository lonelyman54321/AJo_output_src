/*
 * Decompiled with CFR 0.152.
 */
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Status;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Uz1
 */
public final class uz1_1
implements F62 {
    public final /* synthetic */ da1_1 a;

    public /* synthetic */ uz1_1(da1_1 da1_12) {
        this.a = da1_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        int n3;
        int n4 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (!bl2) return;
        object3 = ((da1_1)object2).A;
        if (object3 != null) {
            object3.stopLoader();
        }
        bl2 = false;
        object3 = null;
        String string2 = "getMessage(...)";
        if (object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
            Object object4 = ((DataCallback)object).getData();
            if (object4 != null) {
                object4 = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object4);
                object4 = (Status)object4;
                n4 = (int)(((Status)object4).isSuccess() ? 1 : 0);
                if (n4 == 0) {
                    object4 = (Status)((DataCallback)object).getData();
                    if (object4 != null) {
                        object4 = ((Status)object4).getMessage();
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n4 = ((String)object4).length()) != 0) {
                        object = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object);
                        object = ((Status)object).getMessage();
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                        hv3_0.o0(0, (String)object, null);
                    }
                    ((da1_1)object2).Ua();
                    return;
                }
            }
            ((da1_1)object2).Sa();
            return;
        }
        int n7 = ((DataCallback)object).getStatus();
        if (n7 != n4) return;
        if ((object = ((DataCallback)object).getError()) != null) {
            object3 = ((DataError)object).getErrorMessage();
        }
        if (object3 == null) return;
        object2 = StringCompanionObject.INSTANCE;
        n7 = R$string.acc_error_message;
        object2 = hv3_0.K(n7);
        object3 = ((DataError)object).getErrorMessage().getMessage();
        Object[] objectArray = new Object[n4];
        objectArray[0] = object3;
        object3 = "format(...)";
        String string3 = xh2_0.a(objectArray, n4, (String)object2, (String)object3);
        object = ((DataError)object).getErrorMessage().getMessage();
        Intrinsics.checkNotNullExpressionValue(object, string2);
        hv3_0.o0(0, (String)object, string3);
    }
}

