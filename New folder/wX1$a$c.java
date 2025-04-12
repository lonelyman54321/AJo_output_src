/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;

public final class wX1$a$c
implements fs0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ wx1_1 b;

    public wX1$a$c(wx1_1 wx1_12, boolean bl2) {
        this.a = bl2;
        this.b = wx1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (Boolean)object;
        object.getClass();
        boolean bl2 = this.a;
        if (bl2) {
            object2 = this.b.D0;
            DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
            object = dataCallback$Companion.onSuccess(object);
            ((LiveData)object2).k(object);
        }
        return Unit.a;
    }
}

