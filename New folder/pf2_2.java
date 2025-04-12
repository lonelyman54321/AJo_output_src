/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Pf2
 */
public final class pf2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ tf2_2 b;
    public final /* synthetic */ int c;

    public pf2_2(tf2_2 tf2_22, int n3, f80_0 f80_02) {
        this.b = tf2_22;
        this.c = n3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tf2_2 tf2_22 = this.b;
        int n3 = this.c;
        object = new pf2_2(tf2_22, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pf2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pf2_2)object).invokeSuspend(object2);
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
            Object object2 = ((tf2_2)object).a;
            Object object3 = ((UserInformation)((tf2_2)object).c.getValue()).getUserId();
            Intrinsics.checkNotNullExpressionValue(object3, "getUserId(...)");
            int n7 = this.c;
            object2 = ((ux2_1)object2).a(n7, (String)object3);
            n7 = 0;
            object3 = new Pf2$a((tf2_2)object, null);
            at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
            object2 = new Pf2$b((tf2_2)object);
            this.a = n4;
            object = at0_12.collect((fs0_2)object2, this);
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

