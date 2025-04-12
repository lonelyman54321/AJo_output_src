/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class LS2
extends Lambda
implements Function1 {
    public final /* synthetic */ zr1_0 c;
    public final /* synthetic */ lg3_0 d;

    public LS2(zr1_0 zr1_02, oO0 oO02) {
        this.c = zr1_02;
        this.d = oO02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (lg3_0)object;
        oO0 oO02 = (oO0)this.d;
        de0_1 de0_12 = new de0_1(oO02, (lg3_0)object);
        this.c.a.setValue(de0_12);
        return Unit.a;
    }
}

