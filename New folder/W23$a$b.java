/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.Unit;

public final class W23$a$b
implements fs0_2 {
    public final /* synthetic */ w23_0 a;

    public W23$a$b(w23_0 w23_02) {
        this.a = w23_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3 = ((Number)object).intValue();
        object2 = this.a.i;
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        Integer n4 = new Integer(n3);
        object = dataCallback$Companion.onSuccess(n4);
        ((LiveData)object2).i(object);
        return Unit.a;
    }
}

