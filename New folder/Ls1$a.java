/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Ls1$a
extends Lambda
implements Function2 {
    public final /* synthetic */ Ls1 c;
    public final /* synthetic */ int d;

    public Ls1$a(Ls1 ls1, int n3) {
        this.c = ls1;
        this.d = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.c;
            Object object3 = ((Ls1)object2).b.a;
            int n7 = this.d;
            object3 = ((yr1_0)object3).d(n7);
            int n8 = ((Nj1)object3).a;
            object3 = ((hs1_1)((Nj1)object3).c).c;
            Integer n10 = n7 -= n8;
            n8 = 0;
            Integer n14 = 0;
            object2 = ((Ls1)object2).c;
            object3.invoke(object2, n10, object, n14);
        }
        return Unit.a;
    }
}

