/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ZX2
 */
public final class zx2_1
extends Lambda
implements Function1 {
    public final /* synthetic */ sQ1 c;
    public final /* synthetic */ PX2 d;

    public zx2_1(sQ1 sQ12, PX2 pX2) {
        this.c = sQ12;
        this.d = pX2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (aw2_0)object;
        sQ1 sQ12 = this.c;
        long l2 = ((aw2_0)object).c;
        PX2 pX2 = this.d;
        boolean bl2 = sQ12.b(l2, pX2);
        if (bl2) {
            ((aw2_0)object).a();
        }
        return Unit.a;
    }
}

