/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class a13$a
extends Lambda
implements Function0 {
    public final /* synthetic */ a13_0 c;

    public a13$a(a13_0 a13_02) {
        this.c = a13_02;
        super(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        a13_0 a13_02 = this.c;
        Object object = (C63)a13_02.c.getValue();
        long l2 = ((C63)object).a;
        long l3 = 9205357640488583168L;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 == false) return null;
        object = a13_02.c;
        C63 c63 = (C63)((h83_0)object).getValue();
        long l7 = c63.a;
        boolean bl2 = C63.e(l7);
        if (bl2) {
            return null;
        }
        object = (C63)((h83_0)object).getValue();
        l2 = ((C63)object).a;
        return a13_02.a.b(l2);
    }
}

