/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

public final class l63$d
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l63_0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;

    public l63$d(l63_0 l63_02, int n3, Function1 function1, f80_0 f80_02) {
        this.c = l63_02;
        this.d = n3;
        this.e = function1;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.d;
        Function1 function1 = this.e;
        l63_0 l63_02 = this.c;
        l63$d l63$d = new l63$d(l63_02, n3, function1, f80_02);
        l63$d.b = object;
        return l63$d;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (l63$d)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((l63$d)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Throwable throwable2;
        Object object2;
        l63_0 l63_02;
        int n3;
        Object object3;
        block13: {
            int n4;
            block12: {
                object3 = j90_0.COROUTINE_SUSPENDED;
                int n7 = this.a;
                n3 = 4;
                n4 = 3;
                int n8 = 2;
                int n10 = 1;
                l63_02 = this.c;
                if (n7 != 0) {
                    if (n7 != n10) {
                        if (n7 != n8) {
                            if (n7 == n4) {
                                vl2_2.b(object);
                                return Unit.a;
                            }
                            if (n7 != n3) {
                                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw object;
                            }
                            object3 = (Throwable)this.b;
                            vl2_2.b(object);
                            throw object3;
                        }
                        object2 = (i)this.b;
                        try {
                            vl2_2.b(object);
                            break block12;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                    }
                    object2 = (i)this.b;
                    vl2_2.b(object);
                } else {
                    vl2_2.b(object);
                    object = ((i90_0)this.b).getCoroutineContext();
                    object2 = i$a.a;
                    object = object.get((CoroutineContext$a)object2);
                    if (object == null) {
                        object3 = "Internal error. coroutineScope should've created a job.".toString();
                        object = new IllegalStateException((String)object3);
                        throw object;
                    }
                    object = (i)object;
                    object2 = l63_02.a;
                    this.b = object;
                    this.a = n10;
                    n10 = this.d;
                    if ((object2 = ((l63$b)object2).b(n10, (i)object, this)) == object3) {
                        return object3;
                    }
                    Object object4 = object2;
                    object2 = object;
                    object = object4;
                }
                object = (Boolean)object;
                boolean bl2 = (Boolean)object;
                if (!bl2) return Unit.a;
                {
                    object = this.e;
                    this.b = object2;
                    this.a = n8;
                    object = object.invoke(this);
                    if (object != object3) break block12;
                    return object3;
                }
            }
            object = l63_02.a;
            n3 = 0;
            this.b = null;
            this.a = n4;
            object = ((l63$b)object).a((i)object2, this);
            if (object != object3) return Unit.a;
            return object3;
        }
        l63$b l63$b = l63_02.a;
        this.b = throwable2;
        this.a = n3;
        object2 = l63$b.a((i)object2, this);
        if (object2 == object3) {
            return object3;
        }
        object3 = throwable2;
        throw object3;
    }
}

