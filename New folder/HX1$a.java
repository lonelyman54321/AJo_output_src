/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

public final class HX1$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ wx1_1 b;

    public HX1$a(wx1_1 wx1_12, f80_0 f80_02) {
        this.b = wx1_12;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        wx1_1 wx1_12 = this.b;
        object = new HX1$a(wx1_12, (f80_0)object3);
        ((HX1$a)object).a = object2;
        object2 = Unit.a;
        return ((HX1$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Throwable throwable = this.a;
        object = this.b.q;
        object2 = ApiErrorRepo.INSTANCE.handleApiException(throwable, "NewCartId", true, "bag screen", "Forward");
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

