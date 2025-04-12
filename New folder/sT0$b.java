/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class sT0$b
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ es0_2 c;
    public final /* synthetic */ qr1_2 d;
    public final /* synthetic */ Object e;

    public sT0$b(es0_2 es0_22, qr1_2 qr1_22, Object object, f80_0 f80_02) {
        this.c = es0_22;
        this.d = qr1_22;
        this.e = object;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qr1_2 qr1_22 = this.d;
        Object object2 = this.e;
        es0_2 es0_22 = this.c;
        sT0$b sT0$b = new sT0$b(es0_22, qr1_22, object2, f80_02);
        sT0$b.b = object;
        return sT0$b;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b33)((Object)object);
        object2 = (f80_0)object2;
        object = (sT0$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((sT0$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (b33)((Object)this.b);
        Object object3 = sT0$b$a.$EnumSwitchMapping$0;
        int n7 = ((Enum)object).ordinal();
        n7 = object3[n7];
        object3 = this.d;
        if (n7 == n4) {
            this.a = n4;
            object = this.c.collect((fs0_2)object3, this);
            if (object != object2) return Unit.a;
            return object2;
        }
        int n8 = 2;
        if (n7 == n8) return Unit.a;
        n8 = 3;
        if (n7 != n8) {
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object2 = this.e;
        object = k23_0.a;
        if (object2 == object) {
            object3.d();
            return Unit.a;
        }
        object3.a(object2);
        return Unit.a;
    }
}

