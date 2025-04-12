/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class VZ1$a
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ qz1_2 c;

    public VZ1$a(qz1_2 qz1_22, f80_0 f80_02) {
        this.c = qz1_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        qz1_2 qz1_22 = this.c;
        object = new VZ1$a(qz1_22, (f80_0)object3);
        ((VZ1$a)object).b = object2;
        object2 = Unit.a;
        return ((VZ1$a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        qz1_2 qz1_22 = this.c;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            Throwable throwable = this.b;
            object = qz1_22.B;
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            String string2 = "OrderDetails";
            int n7 = 28;
            DataCallback dataCallback = ApiErrorRepo.handleApiException$default(apiErrorRepo, throwable, string2, false, null, null, n7, null);
            this.a = n4;
            object = ((i23_0)object).emit(dataCallback, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = qz1_22.c;
        Boolean bl2 = Boolean.FALSE;
        ((h83_0)object).setValue(bl2);
        return Unit.a;
    }
}

