/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Ub0
 */
public final class ub0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ ob0_1 b;
    public final /* synthetic */ Throwable c;

    public ub0_2(ob0_1 ob0_12, Throwable throwable, f80_0 f80_02) {
        this.b = ob0_12;
        this.c = throwable;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.b;
        Throwable throwable = this.c;
        object = new ub0_2(ob0_12, throwable, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ub0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ub0_2)object).invokeSuspend(object2);
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
            object = this.b.x;
            ResponseStatusType responseStatusType = ResponseStatusType.API_EXCEPTION;
            Throwable throwable = this.c;
            int n7 = 48;
            BaseResponse baseResponse = new BaseResponse(responseStatusType, null, null, throwable, null, null, n7, null);
            this.a = n4;
            object = ((i23_0)object).emit(baseResponse, this);
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

