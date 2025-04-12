/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.d;

/*
 * Renamed from QR
 */
public final class qr_2
extends or_2 {
    public final gx0_2 e;

    public qr_2(gx0_2 gx0_22, es0_2 es0_22, CoroutineContext coroutineContext, int n3, he_2 he_22) {
        super(n3, he_22, es0_22, coroutineContext);
        this.e = gx0_22;
    }

    public final ir_2 h(CoroutineContext coroutineContext, int n3, he_2 he_22) {
        gx0_2 gx0_22 = this.e;
        es0_2 es0_22 = this.d;
        qr_2 qr_22 = new qr_2(gx0_22, es0_22, coroutineContext, n3, he_22);
        return qr_22;
    }

    public final Object k(fs0_2 object, f80_0 object2) {
        QR$a qR$a = new QR$a(this, (fs0_2)object, null);
        if ((object = kotlinx.coroutines.d.c(qR$a, object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

