/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class xA0$h
extends Lambda
implements Function1 {
    public final /* synthetic */ xA0 c;
    public final /* synthetic */ long d;

    public xA0$h(xA0 xA02, long l2) {
        this.c = xA02;
        this.d = l2;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        long l2;
        long l3;
        object = (Xz0)((Object)object);
        Object object2 = this.c;
        Object object3 = ((xA0)object2).r.a().b;
        long l4 = this.d;
        long l7 = 0L;
        if (object3 != null && (object3 = ((d73_0)object3).a) != null) {
            bj1 bj12 = new bj1(l4);
            object3 = (Si1)object3.invoke(bj12);
            l3 = ((Si1)object3).a;
        } else {
            l3 = l7;
        }
        object2 = ((xA0)object2).s.a().b;
        if (object2 != null && (object2 = ((d73_0)object2).a) != null) {
            object3 = new bj1(l4);
            object2 = (Si1)object2.invoke(object3);
            l2 = ((Si1)object2).a;
        } else {
            l2 = l7;
        }
        int[] nArray = xA0$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        if (n3 == n4) return new Si1(l7);
        n4 = 2;
        if (n3 != n4) {
            n4 = 3;
            if (n3 != n4) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            l7 = l2;
            return new Si1(l7);
        } else {
            l7 = l3;
        }
        return new Si1(l7);
    }
}

