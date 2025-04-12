/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from as1
 */
public final class as1_1
extends Lambda
implements Function2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ as1_1(Object object, Function2 function2, int n3) {
        this.c = n3;
        this.e = object;
        this.d = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.c;
        switch (n3) {
            default: {
                object = (b30_0)object;
                object2 = (Number)object2;
                int n4 = ((Number)object2).intValue() & 3;
                n3 = 2;
                if (n4 == n3 && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
                    object.D();
                } else {
                    object2 = (u10)this.d;
                    bs2_1 bs2_12 = (bs2_1)this.e;
                    US1.b(bs2_12, (u10)object2, (b30_0)object, 0);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (xf3_1)object;
        long l2 = ((c60)object2).a;
        Tr1 tr1 = (Tr1)this.e;
        object2 = new fs1_1(tr1, (xf3_1)object);
        object = new c60(l2);
        return (bl1_0)this.d.invoke(object2, object);
    }
}

