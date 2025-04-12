/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cJ3
 */
public final class cj3_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Nc c;

    public cj3_0(Nc nc) {
        this.c = nc;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        long l2 = ((bj1)object).a;
        Object object3 = object2;
        object3 = (bp1_0)((Object)object2);
        long l3 = this.c.a(0L, l2, (bp1_0)((Object)object3));
        Si1 si1 = new Si1(l3);
        return si1;
    }
}

