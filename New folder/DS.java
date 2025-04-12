/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.payment.fragment.g;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.response.InternalWalletsInfo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class DS
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DS(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                gE2 gE22 = (gE2)this.b;
                Intrinsics.checkNotNullParameter(gE22, "this$0");
                gE22.g.k(object);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                Object object2 = (g)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                Object object3 = cp_1.Companion;
                int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n4 != 0) {
                    n4 = ((DataCallback)object).getStatus();
                    if (n4 == 0) {
                        object3 = (InternalWalletsInfo)((DataCallback)object).getData();
                        boolean bl2 = false;
                        if (object3 != null && (object3 = ((InternalWalletsInfo)object3).getInternalWallets()) != null) {
                            n4 = ((ArrayList)object3).size();
                        } else {
                            n4 = 0;
                            object3 = null;
                        }
                        if (n4 > 0 && (object2 = ((g)object2).c) != null) {
                            object = (object = (InternalWalletsInfo)((DataCallback)object).getData()) != null && (object = ((InternalWalletsInfo)object).getInternalWallets()) != null ? (PaymentInstrumentInfo)((ArrayList)object).get(0) : null;
                            object2.C8((PaymentInstrumentInfo)object);
                        }
                    } else {
                        int n7;
                        n4 = ((DataCallback)object).getStatus();
                        if (n4 == (n7 = 1) && (object = ((DataCallback)object).getExtraErrorData()) != null && (n4 = object instanceof String) != 0 && (object2 = ((g)object2).c) != null) {
                            object = (String)object;
                            object2.W8((String)object);
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Unit)object;
        Object object4 = (ps_0)this.b;
        Intrinsics.checkNotNullParameter(object4, "this$0");
        object = ((ps_0)object4).e;
        object4 = DataCallback.Companion;
        Boolean bl3 = Boolean.TRUE;
        object4 = ((DataCallback$Companion)object4).onSuccess(bl3);
        ((LiveData)object).k(object4);
        return Unit.a;
    }
}

