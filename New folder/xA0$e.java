/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class xA0$e
extends Lambda
implements Function1 {
    public final /* synthetic */ xA0 c;
    public final /* synthetic */ long d;

    public xA0$e(xA0 xA02, long l2) {
        this.c = xA02;
        this.d = l2;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        object = (Xz0)((Object)object);
        Object object2 = this.c;
        object2.getClass();
        int[] nArray = xA0$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        long l2 = this.d;
        if (n3 == n4) return new bj1(l2);
        n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            object = ((xA0)object2).s.a().c;
            if (object == null) return new bj1(l2);
            object = ((BR)object).b;
            if (object == null) return new bj1(l2);
            object2 = new bj1(l2);
            object = (bj1)object.invoke(object2);
            l2 = ((bj1)object).a;
            return new bj1(l2);
        } else {
            object = ((xA0)object2).r.a().c;
            if (object == null) return new bj1(l2);
            object = ((BR)object).b;
            if (object == null) return new bj1(l2);
            object2 = new bj1(l2);
            object = (bj1)object.invoke(object2);
            l2 = ((bj1)object).a;
        }
        return new bj1(l2);
    }
}

