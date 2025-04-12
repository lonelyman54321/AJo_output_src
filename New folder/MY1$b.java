/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Closet.ClosetComponentModel;
import kotlin.Unit;

public final class MY1$b
implements fs0_2 {
    public final /* synthetic */ ky1_0 a;

    public MY1$b(ky1_0 ky1_02) {
        this.a = ky1_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (ClosetComponentModel)object;
        object2 = this.a.o;
        object = DataCallback.Companion.onSuccess(object);
        ((LiveData)object2).k(object);
        return Unit.a;
    }
}

