/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class Ip2$b
implements fs0_2 {
    public final /* synthetic */ op2_2 a;
    public final /* synthetic */ hj_1 b;

    public Ip2$b(op2_2 op2_22, hj_1 hj_12) {
        this.a = op2_22;
        this.b = hj_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (DataCallback)object;
        object2 = this.a.u;
        hj_1 hj_12 = this.b;
        rz2_0 rz2_02 = new rz2_0(hj_12, (DataCallback)object);
        ((LiveData)object2).k(rz2_02);
        return Unit.a;
    }
}

