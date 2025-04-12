/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import kotlin.Unit;

public final class sW2$b
implements fs0_2 {
    public final /* synthetic */ yw2_0 a;

    public sW2$b(yw2_0 yw2_02) {
        this.a = yw2_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3 = ((Number)(object = (Number)object)).intValue();
        if (n3 > 0) {
            object2 = this.a.o;
            Integer n4 = new Integer(n3);
            ((LiveData)object2).k(n4);
        }
        return Unit.a;
    }
}

