/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class E72$a
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ e72_0 b;

    public E72$a(e72_0 e72_02, f80_0 f80_02) {
        this.b = e72_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e72_0 e72_02 = this.b;
        object = new E72$a(e72_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (E72$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((E72$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        e72_0 e72_02;
        int n3;
        Object object2;
        block10: {
            Object object3;
            block9: {
                object2 = j90_0.COROUTINE_SUSPENDED;
                n3 = this.a;
                int n4 = 1;
                e72_02 = this.b;
                if (n3 != 0) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    try {
                        vl2_2.b(object);
                        break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                }
                vl2_2.b(object);
                {
                    object = e72_02.g;
                    object3 = i$a.a;
                    object = object.get((CoroutineContext$a)object3);
                    Intrinsics.checkNotNull(object);
                    object = (i)object;
                    this.a = n4;
                    object = object.I0(this);
                    if (object != object2) break block9;
                    return object2;
                }
            }
            object = e72_02.i.entrySet().iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    return Unit.a;
                }
                object2 = (x72_0)((Map.Entry)object.next()).getValue();
                object3 = ((x72_0)object2).b;
                ((d50_0)object3).a();
                object2 = ((x72_0)object2).a.a();
                object2.shutdown();
            }
        }
        object2 = e72_02.i.entrySet().iterator();
        while (true) {
            if ((n3 = (int)(object2.hasNext() ? 1 : 0)) == 0) {
                throw throwable2;
            }
            Object object4 = (x72_0)((Map.Entry)object2.next()).getValue();
            d50_0 d50_02 = ((x72_0)object4).b;
            d50_02.a();
            object4 = ((x72_0)object4).a.a();
            object4.shutdown();
        }
    }
}

