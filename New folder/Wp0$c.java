/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import androidx.navigation.p;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Wp0$c
extends qg3_2
implements Function2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ fq0_0 b;
    public final /* synthetic */ p83_0 c;

    public Wp0$c(tr1_0 tr1_02, fq0_0 fq0_02, p83_0 p83_02, f80_0 f80_02) {
        this.a = tr1_02;
        this.b = fq0_02;
        this.c = p83_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = (tr1_0)this.a;
        fq0_0 fq0_02 = this.b;
        p83_0 p83_02 = this.c;
        object = new Wp0$c(tr1_02, fq0_02, p83_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Wp0$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Wp0$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object iterator) {
        boolean bl2;
        Object object = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(iterator);
        iterator = ((Iterable)((Set)this.a.getValue())).iterator();
        while (bl2 = iterator.hasNext()) {
            object = (d)iterator.next();
            Object object2 = this.b;
            List list = (List)((p)object2).b().e.a.getValue();
            boolean bl3 = list.contains(object);
            if (bl3 || (bl3 = ((p83_0)(list = this.c)).contains(object))) continue;
            object2 = ((p)object2).b();
            ((kU1)object2).b((d)object);
        }
        return Unit.a;
    }
}

