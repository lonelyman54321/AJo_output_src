/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c90
extends Lambda
implements Function1 {
    public final /* synthetic */ Vt1 c;
    public final /* synthetic */ UY2 d;

    public c90(Vt1 vt1, UY2 uY2) {
        this.c = vt1;
        this.d = uY2;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        int n3 = 1;
        object = (Sl)object;
        Object object3 = this.c;
        Il3 il3 = ((Vt1)object3).e;
        Vt1$b vt1$b = ((Vt1)object3).t;
        int n4 = 0;
        Unit unit = null;
        if (il3 != null) {
            go0_0 go0_02 = new Object();
            bz_0 bz_02 = new bz_0((Sl)object, n3);
            int n7 = 2;
            Object[] objectArray = new mx0[n7];
            objectArray[0] = go0_02;
            objectArray[n3] = bz_02;
            object2 = xx_2.i(objectArray);
            object3 = ((Vt1)object3).d;
            object2 = ((Gx0)object3).a((List)object2);
            il3.a(null, (ql3_0)object2);
            vt1$b.invoke(object2);
            unit = Unit.a;
        }
        if (unit == null) {
            object = ((Sl)object).a;
            int n8 = ((String)object).length();
            long l2 = nm3.a(n8, n8);
            n4 = 4;
            object2 = new ql3_0((String)object, l2, n4);
            vt1$b.invoke(object2);
        }
        return Boolean.TRUE;
    }
}

