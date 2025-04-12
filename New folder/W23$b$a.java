/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.collections.a;

public final class W23$b$a
extends qg3_2
implements gx0_2 {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ w23_0 b;

    public W23$b$a(w23_0 w23_02, f80_0 f80_02) {
        this.b = w23_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object2 = (Throwable)object2;
        object3 = (f80_0)object3;
        w23_0 w23_02 = this.b;
        object = new W23$b$a(w23_02, (f80_0)object3);
        ((W23$b$a)object).a = object2;
        object2 = Unit.a;
        return ((W23$b$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = yn3_0.a;
        CharSequence charSequence = new StringBuilder("SharedWithMeViewModel getSharedWithMeFor: throwable: ");
        charSequence.append(object);
        charSequence = charSequence.toString();
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).d((String)charSequence, objectArray);
        ((yn3$a)object2).e((Throwable)object);
        object2 = new DataError();
        boolean bl2 = object instanceof NullPointerException;
        charSequence = "Unable to fetch the shared closet.";
        if (bl2) {
            object = new DataError$ErrorMessage();
            ((DataError$ErrorMessage)object).setMessage((String)charSequence);
        } else {
            object = new DataError$ErrorMessage();
            ((DataError$ErrorMessage)object).setMessage((String)charSequence);
        }
        ((DataError)object2).errors = object = kotlin.collections.a.b(object);
        object = this.b.f;
        object2 = DataCallback.Companion.onFailed((DataError)object2);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

