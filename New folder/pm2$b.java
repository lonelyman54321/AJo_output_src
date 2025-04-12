/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;

public final class pm2$b
implements fs0_2 {
    public final /* synthetic */ qm2_2 a;

    public pm2$b(qm2_2 qm2_22) {
        this.a = qm2_22;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        object = (DataCallback)object;
        this.a.b.k(object);
        return Unit.a;
    }
}

