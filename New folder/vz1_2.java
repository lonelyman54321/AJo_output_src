/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VZ1
 */
public final class vz1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public vz1_2(qz1_2 qz1_22, boolean bl2, boolean bl3, f80_0 f80_02) {
        this.b = qz1_22;
        this.c = bl2;
        this.d = true;
        this.e = bl3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.b;
        boolean bl2 = this.c;
        boolean bl3 = this.e;
        object = new vz1_2(qz1_22, bl2, bl3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vz1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vz1_2)object).invokeSuspend(object2);
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
            Object object2 = (String)((qz1_2)object).d.getValue();
            if (object2 == null) return Unit.a;
            object2 = ((qz1_2)object).d.getValue();
            Intrinsics.checkNotNull(object2);
            Object object3 = object2;
            object3 = (String)object2;
            n3 = (int)(this.d ? 1 : 0);
            Boolean bl2 = n3 != 0;
            object2 = ((qz1_2)object).q0;
            String string2 = ((UserInformation)((hh3_2)object2).getValue()).getUserId();
            Intrinsics.checkNotNullExpressionValue(string2, "getUserId(...)");
            String string3 = ServiceUtil.getToken((UserInformation)((hh3_2)object2).getValue());
            boolean bl3 = this.c;
            boolean bl4 = this.e;
            object2 = ((qz1_2)object).b.getNewOrderDetail((String)object3, bl3, bl2, string2, string3, bl4);
            VZ1$a vZ1$a = new VZ1$a((qz1_2)object, null);
            object3 = new at0_1((es0_2)object2, vZ1$a);
            object2 = new VZ1$b((qz1_2)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object2, this);
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

