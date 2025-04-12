/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Lq1$a
 */
public final class lq1$a_1
extends Lambda
implements Function2 {
    public final /* synthetic */ lq1_1 c;
    public final /* synthetic */ int d;

    public lq1$a_1(lq1_1 lq1_12, int n3) {
        this.c = lq1_12;
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
            object2 = this.c.b.b;
            n3 = this.d;
            object2 = ((yr1_0)object2).d(n3);
            int n7 = ((Nj1)object2).a;
            object2 = ((dq1_1)((Nj1)object2).c).d;
            qq1_0 qq1_02 = qq1_0.a;
            Integer n8 = n3 -= n7;
            int n10 = 6;
            Integer n14 = n10;
            object2.invoke(qq1_02, n8, object, n14);
        }
        return Unit.a;
    }
}

