/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class W23$b$b
implements fs0_2 {
    public final /* synthetic */ w23_0 a;

    public W23$b$b(w23_0 w23_02) {
        this.a = w23_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (SharedWithMe)object;
        object2 = yn3_0.a;
        Object[] objectArray = new Object[]{};
        ((yn3$a)object2).a("SharedWithMeViewModel getSharedWithMeFor: success", objectArray);
        object2 = this.a.f;
        object = DataCallback.Companion.onSuccess(object);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

