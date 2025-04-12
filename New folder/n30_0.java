/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from n30
 */
public final class n30_0
extends Lambda
implements Function2 {
    public final /* synthetic */ tq1_0 c;
    public final /* synthetic */ Object d;

    public n30_0(tq1_0 tq1_02, Object object) {
        this.c = tq1_02;
        this.d = object;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
            return Unit.a;
        }
        this.c.getClass();
        throw null;
    }
}

