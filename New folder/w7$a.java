/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

public final class w7$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ x7 b;

    public w7$a(x7 x72, f80_0 f80_02) {
        this.b = x72;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        x7 x72 = this.b;
        object = new w7$a(x72, (f80_0)object3);
        ((w7$a)object).a = object2;
        object2 = Unit.a;
        return ((w7$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Throwable throwable = this.a;
        object = this.b.b;
        object2 = ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "AJIOGiftCard", false, null, null, 28, null);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

