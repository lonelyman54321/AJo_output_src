/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from nW1
 */
public final class nw1_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nw1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        String string2 = null;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (bv2_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((bv2_0)object2).j;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                DataCallback dataCallback = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "BackGround_StoreMetaData", false, null, null, 24, null);
                ((LiveData)object).k(dataCallback);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object2 = (ex1_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 != 0) {
            ((ex1_0)object2).Xa();
            if (object != null && (n7 = ((DataCallback)object).getStatus()) == 0) {
                ((ex1_0)object2).sb(false);
            } else {
                int n8;
                n7 = ((DataCallback)object).getStatus();
                if (n7 == n3 && (n8 = ((ex1_0)object2).Ua((DataError)(object = ((DataCallback)object).getError()))) == 0) {
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n8);
                    n7 = R$string.something_wrong_msg;
                    object3 = hv3_0.K(n7);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object3;
                    string2 = "format(...)";
                    object = xh2_0.a(objectArray, n3, (String)object, string2);
                    n3 = R$string.something_wrong_msg;
                    String string3 = hv3_0.K(n3);
                    ((ex1_0)object2).kb(string3, (String)object);
                }
            }
        }
        return Unit.a;
    }
}

