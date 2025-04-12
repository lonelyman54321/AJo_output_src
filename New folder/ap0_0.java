/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.HomeRepo;
import com.ril.ajio.data.repo.StoreLPRepo;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Order.orderhistory.DateRangeItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ap0
 */
public final class ap0_0
implements o60_0,
bx0_2,
g82_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ap0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public void a(int n3, Object object) {
        object = (DateRangeItem)object;
        object = (b)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((b)object).Qa();
    }

    public void accept(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                HomeRepo.H((t81_0)((Function1)object2), object);
                return;
            }
            case 0: 
        }
        object2 = (Function1)object2;
        Intrinsics.checkNotNullParameter(object2, "$tmp0");
        object2.invoke(object);
    }

    public Object apply(Object object) {
        return StoreLPRepo.a((zp0_1)((Function1)this.b), object);
    }
}

