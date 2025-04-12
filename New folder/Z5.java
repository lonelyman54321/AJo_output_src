/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Order.AjioCash;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Z5
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Z5() {
        this.a = 0;
        this.b = "IMPS";
    }

    public /* synthetic */ Z5(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                hy3_0 hy3_02 = (hy3_0)this.b;
                Intrinsics.checkNotNullParameter(hy3_02, "this$0");
                hy3_02.v.k(object);
                return Unit.a;
            }
            case 1: {
                object = (zp1)object;
                tr1_0 tr1_02 = (tr1_0)this.b;
                Intrinsics.checkNotNullParameter(tr1_02, "$size$delegate");
                Intrinsics.checkNotNullParameter(object, "it");
                long l2 = object.a();
                object = new bj1(l2);
                tr1_02.setValue(object);
                return Unit.a;
            }
            case 0: 
        }
        Object object3 = object;
        object3 = (dl2_2)object;
        Object object4 = object2 = this.b;
        object4 = (String)object2;
        Intrinsics.checkNotNullParameter(object4, "$screenName");
        Intrinsics.checkNotNullParameter(object3, "walletResp");
        object = (AjioCash)((dl2_2)object3).b;
        object2 = ((dl2_2)object3).a;
        n3 = (int)(((cl2_2)object2).d() ? 1 : 0);
        if (n3 != 0 && object != null) {
            object2 = DataCallback.Companion;
            object = ((DataCallback$Companion)object2).onSuccess(object);
        } else {
            object2 = ApiErrorRepo.INSTANCE;
            String string2 = "AJIOCashBonus";
            boolean bl2 = true;
            String string3 = "Forward";
            object = ((ApiErrorRepo)object2).handleApiError((dl2_2)object3, string2, bl2, (String)object4, string3);
        }
        return object;
    }
}

