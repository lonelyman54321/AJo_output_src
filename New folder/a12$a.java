/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

public final class a12$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ e12_0 b;

    public a12$a(e12_0 e12_02, f80_0 f80_02) {
        this.b = e12_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        e12_0 e12_02 = this.b;
        object = new a12$a(e12_02, (f80_0)object3);
        ((a12$a)object).a = object2;
        object2 = Unit.a;
        return ((a12$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Throwable throwable = this.a;
        object = this.b.i1;
        object2 = ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, "newCrossCellWidgetPDP", true, null, null, 24, null);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

