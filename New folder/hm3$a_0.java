/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from hm3$a
 */
public final class hm3$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;

    public hm3$a_0(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2;
        Object object3;
        int n3;
        object = (Ns2$a)object;
        int n4 = 0;
        List list = this.c;
        if (list != null) {
            n3 = list.size();
            object3 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                object2 = (Pair)list.get(i3);
                Ns2 ns2 = (Ns2)((Pair)object2).a;
                object2 = (Si1)((Pair)object2).b;
                long l2 = ((Si1)object2).a;
                Ns2$a.e((Ns2$a)object, ns2, l2);
            }
        }
        if ((list = this.d) != null) {
            n3 = list.size();
            while (n4 < n3) {
                long l3;
                object3 = (Pair)list.get(n4);
                object2 = (Ns2)((Pair)object3).a;
                object3 = (Function0)((Pair)object3).b;
                if (object3 != null) {
                    object3 = (Si1)object3.invoke();
                    l3 = ((Si1)object3).a;
                } else {
                    l3 = 0L;
                }
                Ns2$a.e((Ns2$a)object, (Ns2)object2, l3);
                ++n4;
            }
        }
        return Unit.a;
    }
}

