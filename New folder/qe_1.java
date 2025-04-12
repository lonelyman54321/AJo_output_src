/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Qe
 */
public final class qe_1
extends Lambda
implements Function0 {
    public final /* synthetic */ Re c;
    public final /* synthetic */ Object d;

    public qe_1(Re re, Object object) {
        this.c = re;
        this.d = object;
        super(0);
    }

    public final Object invoke() {
        Object object;
        Re re = this.c;
        Ke ke = re.n;
        Xs0 xs0 = re.d();
        float f5 = xs0.e(object = this.d);
        boolean bl2 = Float.isNaN(f5);
        if (!bl2) {
            bl2 = false;
            ke.a(f5, 0.0f);
            ke = null;
            re.g(null);
        }
        re.f(object);
        return Unit.a;
    }
}

