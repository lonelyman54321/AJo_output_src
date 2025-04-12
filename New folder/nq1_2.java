/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from nq1
 */
public final class nq1_2
extends Lambda
implements Function2 {
    public final /* synthetic */ jq1$a c;
    public final /* synthetic */ Function2 d;

    public nq1_2(jq1$a jq1$a, Function2 function2) {
        this.c = jq1$a;
        this.d = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0))) {
            object.D();
        } else {
            object2 = (Boolean)this.c.f.getValue();
            n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
            object.y(object2);
            n4 = object.a(n3 != 0);
            int n7 = -869707859;
            object.K(n7);
            if (n3) {
                n4 = 0;
                object2 = 0;
                Function2 function2 = this.d;
                function2.invoke(object, object2);
            } else {
                object.f(n4 != 0);
            }
            object.E();
            object.t();
        }
        return Unit.a;
    }
}

