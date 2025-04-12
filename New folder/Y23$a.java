/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.data.repo.DataCallback;
import java.util.ArrayList;
import kotlin.Unit;

public final class Y23$a
extends qg3_2
implements gx0_2 {
    public final /* synthetic */ w23_0 a;

    public Y23$a(w23_0 w23_02, f80_0 f80_02) {
        this.a = w23_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        object2 = this.a;
        object = new Y23$a((w23_0)object2, (f80_0)object3);
        object2 = Unit.a;
        return ((Y23$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = new DataError();
        object2 = new ArrayList();
        DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
        dataError$ErrorMessage.setMessage("We are unable to fetch the shared closet items.");
        ((ArrayList)object2).add(dataError$ErrorMessage);
        ((DataError)object).errors = object2;
        object2 = this.a.h;
        object = DataCallback.Companion.onFailed((DataError)object);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

