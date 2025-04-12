/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;

public final class OS$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ ps_0 b;

    public OS$a(ps_0 ps_02, f80_0 f80_02) {
        this.b = ps_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        ps_0 ps_02 = this.b;
        object = new OS$a(ps_02, (f80_0)object3);
        ((OS$a)object).a = object2;
        object2 = Unit.a;
        return ((OS$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        yn3_0.a.e((Throwable)object);
        object = this.b.g;
        object2 = DataCallback.Companion;
        DataError dataError = new DataError();
        object2 = ((DataCallback$Companion)object2).onFailed(dataError);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

