/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Ni$c
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;

    public Ni$c(ArrayList arrayList) {
        this.c = arrayList;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        List list = this.c;
        int n3 = xx_2.h(list);
        if (n3 >= 0) {
            int n4 = 0;
            while (true) {
                Ns2 ns2 = (Ns2)list.get(n4);
                Ns2$a.f((Ns2$a)object, ns2, 0, 0);
                if (n4 == n3) break;
                ++n4;
            }
        }
        return Unit.a;
    }
}

