/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

public final class NK$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ ok_2 b;

    public NK$a(ok_2 ok_22, f80_0 f80_02) {
        this.b = ok_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        ok_2 ok_22 = this.b;
        object = new NK$a(ok_22, (f80_0)object3);
        ((NK$a)object).a = object2;
        object2 = Unit.a;
        return ((NK$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Throwable throwable = this.a;
        object = this.b.a;
        object2 = ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "returnCancelRequest", false, null, null, 28, null);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

