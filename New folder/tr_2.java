/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from TR
 */
public final class tr_2
extends ir_2 {
    public final Iterable d;

    public tr_2(Iterable iterable, CoroutineContext coroutineContext, int n3, he_2 he_22) {
        super(coroutineContext, n3, he_22);
        this.d = iterable;
    }

    public final Object g(pz2_2 pz2_22, f80_0 object) {
        int n3;
        object = new nz2_1(pz2_22);
        Iterator iterator = this.d.iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            es0_2 es0_22 = (es0_2)iterator.next();
            TR$a tR$a = new TR$a(es0_22, (nz2_1)object, null);
            n3 = 3;
            Ae3.d(pz2_22, null, null, tR$a, n3);
        }
        return Unit.a;
    }

    public final ir_2 h(CoroutineContext coroutineContext, int n3, he_2 he_22) {
        Iterable iterable = this.d;
        tr_2 tr_22 = new tr_2(iterable, coroutineContext, n3, he_22);
        return tr_22;
    }

    public final af2_2 j(i90_0 object) {
        hr_2 hr_22 = new hr_2(this, null);
        Object object2 = he_2.SUSPEND;
        l90_0 l90_02 = l90_0.DEFAULT;
        object2 = sr_2.a(this.b, 4, object2);
        CoroutineContext coroutineContext = this.a;
        object = a90_0.b((i90_0)object, coroutineContext);
        boolean bl2 = true;
        coroutineContext = new fr_2((CoroutineContext)object, (le_2)object2, bl2, bl2);
        l90_02.invoke(hr_22, coroutineContext, (f80_0)((Object)coroutineContext));
        return coroutineContext;
    }
}

