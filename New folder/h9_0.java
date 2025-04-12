/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.options.CuratedWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H9
 */
public final class h9_0
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ h9_0(int n3) {
        this.a = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        String string2;
        Object object2;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Unit)object;
                return Unit.a;
            }
            case 0: 
        }
        Object object3 = object;
        object3 = (dl2_2)object;
        Intrinsics.checkNotNullParameter(object3, "couponRequestResp");
        object = (CuratedWidget)((dl2_2)object3).b;
        Object[] objectArray = ((dl2_2)object3).a;
        boolean bl2 = objectArray.d();
        if (bl2 && object != null) {
            objectArray = DataCallback.Companion;
            return objectArray.onSuccess(object);
        }
        int n4 = objectArray.d();
        n3 = 0;
        objectArray = null;
        if (n4 != 0) {
            n4 = R$string.pdp_details_not_available;
            object = hv3_0.K(n4);
            object2 = yn3_0.a;
            string2 = "Data not present";
            objectArray = new Object[]{};
            ((yn3$a)object2).a(string2, objectArray);
        } else {
            object = ((dl2_2)object3).c;
            if (object != null) {
                object = ((il2_2)object).k();
            } else {
                n4 = 0;
                object = null;
            }
            object2 = yn3_0.a;
            string2 = kp1_0.c("ErrorBody: ", (String)object);
            objectArray = new Object[]{};
            ((yn3$a)object2).d(string2, objectArray);
        }
        object2 = object;
        objectArray = ApiErrorRepo.INSTANCE;
        int n7 = 48;
        string2 = "CouponPromotionRequest";
        boolean bl3 = true;
        return ApiErrorRepo.handleApiError$default((ApiErrorRepo)objectArray, (String)object, (dl2_2)object3, string2, bl3, null, null, n7, null);
    }
}

