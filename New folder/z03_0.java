/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.i;

/*
 * Renamed from z03
 */
public final class z03_0
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ AtomicReference d;
    public final /* synthetic */ Function2 e;

    public z03_0(Function1 function1, AtomicReference atomicReference, Function2 function2, f80_0 f80_02) {
        this.c = function1;
        this.d = atomicReference;
        this.e = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        AtomicReference atomicReference = this.d;
        Function2 function2 = this.e;
        Function1 function1 = this.c;
        z03_0 z03_02 = new z03_0(function1, atomicReference, function2, f80_02);
        z03_02.b = object;
        return z03_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (z03_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((z03_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     */
    public final Object invokeSuspend(Object object) {
        void var1_4;
        y03 y032;
        AtomicReference atomicReference;
        int n3;
        Object object2;
        block18: {
            block17: {
                object2 = j90_0.COROUTINE_SUSPENDED;
                n3 = this.a;
                int n4 = 2;
                int n7 = 1;
                atomicReference = this.d;
                if (n3 != 0) {
                    if (n3 != n7) {
                        if (n3 == n4) {
                            object2 = (y03)this.b;
                            try {
                                vl2_2.b(object);
                                break block17;
                            }
                            catch (Throwable throwable) {
                                break block18;
                            }
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    y032 = (y03)this.b;
                    vl2_2.b(object);
                } else {
                    vl2_2.b(object);
                    object = (i90_0)this.b;
                    i i3 = mm0.e(object.getCoroutineContext());
                    Function1 function1 = this.c;
                    object = function1.invoke(object);
                    y032 = new y03(i3, object);
                    object = atomicReference.getAndSet(y032);
                    if (object != null && (object = ((y03)object).a) != null) {
                        this.b = y032;
                        this.a = n7;
                        if ((object = mm0.b((i)object, this)) == object2) {
                            return object2;
                        }
                    }
                }
                object = this.e;
                Object object3 = y032.b;
                this.b = y032;
                this.a = n4;
                try {
                    object = object.invoke(object3, this);
                    if (object == object2) {
                        return object2;
                    }
                    object2 = y032;
                }
                catch (Throwable throwable) {
                    object2 = y032;
                }
            }
            while ((n3 = (int)(atomicReference.compareAndSet(object2, null) ? 1 : 0)) == 0 && (y032 = atomicReference.get()) == object2) {
            }
            return object;
        }
        while ((n3 = (int)(atomicReference.compareAndSet(object2, null) ? 1 : 0)) == 0 && (y032 = atomicReference.get()) == object2) {
        }
        throw var1_4;
    }
}

