/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class nl2$a
extends Lambda
implements Function2 {
    public final /* synthetic */ nl2_0 c;
    public final /* synthetic */ int d;

    public nl2$a(nl2_0 nl2_02, int n3) {
        this.c = nl2_02;
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
            object2 = this.c.b.e();
            n3 = this.d;
            object2 = ((yr1_0)object2).d(n3);
            int n7 = ((Nj1)object2).a;
            object2 = ((al2_0)((Nj1)object2).c).b;
            xl2 xl22 = xl2.a;
            Integer n8 = n3 -= n7;
            Integer n10 = 0;
            object2.invoke(xl22, n8, object, n10);
        }
        return Unit.a;
    }
}

