/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import java.util.List;
import kotlin.Unit;

public final class Y23$b
implements fs0_2 {
    public final /* synthetic */ w23_0 a;

    public Y23$b(w23_0 w23_02) {
        this.a = w23_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (List)object;
        object2 = this.a.h;
        object = DataCallback.Companion.onSuccess(object);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

