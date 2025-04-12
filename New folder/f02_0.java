/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.ReturnRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from f02
 */
public final class f02_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ ReturnRequest c;

    public f02_0(qz1_2 qz1_22, ReturnRequest returnRequest, f80_0 f80_02) {
        this.b = qz1_22;
        this.c = returnRequest;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        qz1_2 qz1_22 = this.b;
        ReturnRequest returnRequest = this.c;
        object = new f02_0(qz1_22, returnRequest, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (f02_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((f02_0)object).invokeSuspend(object2);
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
            object = this.b.I;
            this.a = n4;
            ReturnRequest returnRequest = this.c;
            object = ((i23_0)object).emit(returnRequest, this);
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

