/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.data.repo.DataCallback;
import java.util.ArrayList;
import kotlin.Unit;

public final class W23$a$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ w23_0 b;

    public W23$a$a(w23_0 w23_02, f80_0 f80_02) {
        this.b = w23_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        w23_0 w23_02 = this.b;
        object = new W23$a$a(w23_02, (f80_0)object3);
        ((W23$a$a)object).a = object2;
        object2 = Unit.a;
        return ((W23$a$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        yn3_0.a.e((Throwable)object);
        object = new DataError();
        object2 = new ArrayList();
        DataError$ErrorMessage dataError$ErrorMessage = new DataError$ErrorMessage();
        dataError$ErrorMessage.setMessage("Unable to delete.");
        ((ArrayList)object2).add(dataError$ErrorMessage);
        ((DataError)object).errors = object2;
        object2 = this.b.i;
        object = DataCallback.Companion.onFailed((DataError)object);
        ((LiveData)object2).i(object);
        return Unit.a;
    }
}

