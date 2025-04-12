/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from LT2
 */
public final class lt2_0
extends Lambda
implements Function0 {
    public final /* synthetic */ aG2 c;
    public final /* synthetic */ zp1 d;

    public lt2_0(aG2 aG22, w32_0 w32_02) {
        this.c = aG22;
        this.d = w32_02;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        if (object == null) {
            object = this.d;
            boolean bl2 = object.e();
            if (!bl2) {
                object = null;
            }
            if (object != null) {
                long l2 = dj1.b(object.a());
                long l3 = 0L;
                object = cg2_0.d(l3, l2);
            } else {
                object = null;
            }
        }
        return object;
    }
}

