/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$b;
import androidx.lifecycle.j;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i$a;

public final class q
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i c;
    public final /* synthetic */ i$b d;
    public final /* synthetic */ Function2 e;

    public q(i i3, i$b i$b, Function2 function2, f80_0 f80_02) {
        this.c = i3;
        this.d = i$b;
        this.e = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        i$b i$b = this.d;
        Function2 function2 = this.e;
        i i3 = this.c;
        q q2 = new q(i3, i$b, function2, f80_02);
        q2.b = object;
        return q2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (q)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((q)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        block16: {
            void var1_4;
            block15: {
                block14: {
                    object2 = j90_0.COROUTINE_SUSPENDED;
                    int n3 = this.a;
                    int n4 = 1;
                    if (n3 != 0) {
                        if (n3 == n4) {
                            object2 = (j)this.b;
                            try {
                                vl2_2.b(object);
                                break block14;
                            }
                            catch (Throwable throwable) {
                                break block15;
                            }
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    object = ((i90_0)this.b).getCoroutineContext();
                    Object object3 = i$a.a;
                    object = (kotlinx.coroutines.i)object.get((CoroutineContext$a)object3);
                    if (object == null) break block16;
                    object3 = new yn2();
                    i$b i$b = this.d;
                    cr0_0 cr0_02 = ((yn2)object3).b;
                    i i3 = this.c;
                    j j3 = new j(i3, i$b, cr0_02, (kotlinx.coroutines.i)object);
                    object = this.e;
                    this.b = j3;
                    this.a = n4;
                    try {
                        object = Ae3.g(this, (CoroutineContext)object3, (Function2)object);
                        if (object == object2) {
                            return object2;
                        }
                        object2 = j3;
                    }
                    catch (Throwable throwable) {
                        object2 = j3;
                    }
                }
                ((j)object2).a();
                return object;
            }
            ((j)object2).a();
            throw var1_4;
        }
        object2 = "when[State] methods should have a parent job".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

