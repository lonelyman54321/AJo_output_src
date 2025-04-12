/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Tu1$a
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;
    public final /* synthetic */ tu1_0 d;

    public Tu1$a(List list, tu1_0 tu1_02) {
        this.c = list;
        this.d = tu1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        Object object2 = this.d.a;
        List list = this.c;
        if ((object2 = dx.d(list, (Function0)object2)) != null) {
            int n3 = object2.size();
            for (int i3 = 0; i3 < n3; ++i3) {
                long l2;
                Object object3 = (Pair)object2.get(i3);
                Ns2 ns2 = (Ns2)((Pair)object3).a;
                object3 = (Function0)((Pair)object3).b;
                if (object3 != null) {
                    object3 = (Si1)object3.invoke();
                    l2 = ((Si1)object3).a;
                } else {
                    l2 = 0L;
                }
                Ns2$a.e((Ns2$a)object, ns2, l2);
            }
        }
        return Unit.a;
    }
}

