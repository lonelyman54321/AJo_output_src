/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;

public final class T23$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ w23_0 b;

    public T23$a(w23_0 w23_02, f80_0 f80_02) {
        this.b = w23_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        w23_0 w23_02 = this.b;
        object = new T23$a(w23_02, (f80_0)object3);
        ((T23$a)object).a = object2;
        object2 = Unit.a;
        return ((T23$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = yn3_0.a;
        Object object3 = new StringBuilder("SharedWithMeViewModel addSharedWithMe throwable: ");
        object3.append(object);
        object = object3.toString();
        object3 = new Object[]{};
        ((yn3$a)object2).d((String)object, object3);
        object = this.b.f;
        object2 = DataCallback.Companion;
        object3 = new DataError();
        object2 = ((DataCallback$Companion)object2).onFailed((DataError)object3);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

