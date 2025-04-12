/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from so0
 */
public final class so0_0
extends Lambda
implements Function0 {
    public final /* synthetic */ to0_1 c;

    public so0_0(to0_1 to0_12) {
        this.c = to0_12;
        super(0);
    }

    public final Object invoke() {
        Object object = vp2_0.b;
        to0_1 to0_12 = this.c;
        if ((object = (pp2_0)K30.a(to0_12, (H30)object)) == null) {
            object = to0_12.t;
            if (object != null) {
                to0_12.s1((fo0)object);
            }
        } else {
            object = to0_12.t;
            if (object == null) {
                qo0_0 qo0_02 = new qo0_0(to0_12);
                ro0 ro02 = new ro0(to0_12);
                object = wP2.a;
                boolean bl2 = BP2.a;
                wr1_1 wr1_12 = to0_12.p;
                boolean bl3 = to0_12.q;
                float f5 = to0_12.r;
                object = bl2 ? new o00_0(wr1_12, bl3, f5, qo0_02, ro02) : new xp2_0(wr1_12, bl3, f5, qo0_02, ro02);
                to0_12.r1((fo0)object);
                to0_12.t = object;
            }
        }
        return Unit.a;
    }
}

