/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ek3
 */
public final class ek3_0
extends Lambda
implements Function1 {
    public final /* synthetic */ zp1 c;

    public ek3_0(zp1 zp12) {
        this.c = zp12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = ((QK1)object).a;
        zp1 zp12 = this.c;
        boolean bl2 = zp12.e();
        if (bl2) {
            zp1 zp13 = ap1_0.d(zp12);
            zp13.y(zp12, (float[])object);
        }
        return Unit.a;
    }
}

