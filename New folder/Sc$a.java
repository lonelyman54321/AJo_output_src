/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class Sc$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Sc c;

    public Sc$a(Sc sc) {
        this.c = sc;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2 = (object = (Tc)object).E();
        if (bl2) {
            Object object2;
            Sc sc;
            int n3;
            Iterator iterator = object.p();
            bl2 = ((Sc)((Object)iterator)).b;
            if (bl2) {
                object.C();
            }
            iterator = object.p().i.entrySet().iterator();
            while (true) {
                n3 = iterator.hasNext();
                sc = this.c;
                if (n3 == 0) break;
                object2 = (Map.Entry)iterator.next();
                Oc oc = (Oc)object2.getKey();
                object2 = (Number)object2.getValue();
                n3 = ((Number)object2).intValue();
                Fh1 fh1 = object.K();
                Sc.a(sc, oc, n3, fh1);
            }
            object = object.K().q;
            Intrinsics.checkNotNull(object);
            while (!(bl2 = Intrinsics.areEqual(object, iterator = sc.a.K()))) {
                iterator = ((Iterable)sc.c((w32_0)object).keySet()).iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = (Oc)iterator.next();
                    int n4 = sc.d((w32_0)object, (Oc)object2);
                    Sc.a(sc, (Oc)object2, n4, (w32_0)object);
                }
                object = ((w32_0)object).q;
                Intrinsics.checkNotNull(object);
            }
        }
        return Unit.a;
    }
}

