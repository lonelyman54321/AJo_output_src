/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;

public final class LX1$b
implements fs0_2 {
    public final /* synthetic */ wx1_1 a;

    public LX1$b(wx1_1 wx1_12) {
        this.a = wx1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        boolean bl2 = (Boolean)object;
        object2 = this.a;
        ((wx1_1)object2).b = bl2;
        object = ((wx1_1)object2).T;
        object2 = DataCallback.Companion;
        Boolean bl3 = Boolean.TRUE;
        object2 = ((DataCallback$Companion)object2).onSuccess(bl3);
        ((LiveData)object).k(object2);
        return Unit.a;
    }
}

