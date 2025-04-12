/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.OrderDetailRepo;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZZ1
 */
public final class zz1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ SelectedOrderItem f;

    public zz1_2(qz1_2 qz1_22, String string2, String string3, String string4, SelectedOrderItem selectedOrderItem, f80_0 f80_02) {
        this.b = qz1_22;
        this.c = string2;
        this.d = string3;
        this.e = string4;
        this.f = selectedOrderItem;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.e;
        SelectedOrderItem selectedOrderItem = this.f;
        qz1_2 qz1_22 = this.b;
        String string3 = this.c;
        String string4 = this.d;
        object = new zz1_2(qz1_22, string3, string4, string2, selectedOrderItem, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zz1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zz1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((qz1_2)object).b;
            String string2 = qz1_2.b((qz1_2)object).getUserId();
            Intrinsics.checkNotNullExpressionValue(string2, "getUserId(...)");
            String string3 = ServiceUtil.getToken(qz1_2.b((qz1_2)object));
            Object object3 = this.c;
            Object object4 = this.d;
            String string4 = this.e;
            Object object5 = ((OrderDetailRepo)object2).invoiceCheck((String)object3, (String)object4, string4, string2, string3);
            object2 = new ZZ1$a((qz1_2)object, null);
            object3 = new at0_1((es0_2)object5, (gx0_2)object2);
            object2 = this.d;
            object4 = this.f;
            string4 = this.c;
            object5 = new ZZ1$b((qz1_2)object, string4, (String)object2, (SelectedOrderItem)object4);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object5, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

