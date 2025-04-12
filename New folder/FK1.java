/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class FK1
extends Lambda
implements Function2 {
    public final /* synthetic */ Function2 c;

    public FK1(u10 u102) {
        this.c = u102;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 0;
            object2 = null;
            u10 u102 = (u10)this.c;
            KK1.a(u102, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

