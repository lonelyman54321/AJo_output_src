/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class SX1$c
implements fs0_2 {
    public final /* synthetic */ wx1_1 a;

    public SX1$c(wx1_1 wx1_12) {
        this.a = wx1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (Boolean)object;
        object.getClass();
        object2 = this.a.B0;
        object = DataCallback.Companion.onSuccess(object);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

