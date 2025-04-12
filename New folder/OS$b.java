/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class OS$b
implements fs0_2 {
    public final /* synthetic */ ps_0 a;

    public OS$b(ps_0 ps_02) {
        this.a = ps_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (jj1_2)object;
        object2 = this.a.g;
        object = DataCallback.Companion.onSuccess(object);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

