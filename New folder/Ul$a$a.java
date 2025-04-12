/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class Ul$a$a
extends Lambda
implements Function1 {
    public final /* synthetic */ List c;

    public Ul$a$a(ArrayList arrayList) {
        this.c = arrayList;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Ns2$a)object;
        List list = this.c;
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ns2 ns2 = (Ns2)list.get(i3);
            Ns2$a.f((Ns2$a)object, ns2, 0, 0);
        }
        return Unit.a;
    }
}

