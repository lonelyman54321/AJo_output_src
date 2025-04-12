/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Zp0
extends Lambda
implements Function2 {
    public final /* synthetic */ fq0$a_0 c;
    public final /* synthetic */ d d;

    public Zp0(fq0$a_0 fq0$a_0, d d2) {
        this.c = fq0$a_0;
        this.d = d2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.c.l;
            n3 = 0;
            Integer n7 = 0;
            d d2 = this.d;
            object2.invoke(d2, object, n7);
        }
        return Unit.a;
    }
}

