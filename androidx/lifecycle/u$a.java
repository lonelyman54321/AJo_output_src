/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.i$a$a;
import androidx.lifecycle.i$b;
import androidx.lifecycle.n;
import androidx.lifecycle.u$a$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class u$a
extends qg3_2
implements Function2 {
    public Ref$ObjectRef a;
    public Ref$ObjectRef b;
    public i90_0 c;
    public Function2 d;
    public int e;
    public final /* synthetic */ i f;
    public final /* synthetic */ i$b g;
    public final /* synthetic */ i90_0 h;
    public final /* synthetic */ Function2 i;

    public u$a(i i3, i$b i$b, i90_0 i90_02, Function2 function2, f80_0 f80_02) {
        this.f = i3;
        this.g = i$b;
        this.h = i90_02;
        this.i = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        i90_0 i90_02 = this.h;
        Function2 function2 = this.i;
        i i3 = this.f;
        i$b i$b = this.g;
        object = new u$a(i3, i$b, i90_02, function2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (u$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        void var2_5;
        void var6_15;
        n n3;
        void var7_25;
        i i3;
        block14: {
            void var6_14;
            void var7_24;
            Object object2;
            block13: {
                Object object3;
                Ref$ObjectRef ref$ObjectRef;
                Ref$ObjectRef ref$ObjectRef2;
                block15: {
                    block16: {
                        String string2;
                        object2 = j90_0.COROUTINE_SUSPENDED;
                        int n4 = this.e;
                        i3 = this.f;
                        int n7 = 1;
                        if (n4 != 0) {
                            if (n4 != n7) {
                                object2 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw object2;
                            }
                            Ref$ObjectRef ref$ObjectRef3 = this.b;
                            Ref$ObjectRef ref$ObjectRef4 = this.a;
                            try {
                                vl2_2.b(object);
                                break block13;
                            }
                            catch (Throwable throwable) {
                                break block14;
                            }
                        }
                        vl2_2.b(object);
                        i$b i$b = i3.b();
                        i$b i$b2 = i$b.DESTROYED;
                        if (i$b == i$b2) {
                            return Unit.a;
                        }
                        ref$ObjectRef2 = new Ref$ObjectRef();
                        ref$ObjectRef = new Ref$ObjectRef();
                        try {
                            u$a$a u$a$a;
                            i$b i$b3 = this.g;
                            i90_0 i90_02 = this.h;
                            Function2 function2 = this.i;
                            this.a = ref$ObjectRef2;
                            this.b = ref$ObjectRef;
                            this.c = i90_02;
                            this.d = function2;
                            this.e = n7;
                            f80_0 f80_02 = zj1_2.b(this);
                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n7, f80_02);
                            cancellableContinuationImpl.r();
                            i$a$a i$a$a = i$a.Companion;
                            i$a$a.getClass();
                            i$a i$a = i$a$a.c(i$b3);
                            i$a i$a2 = i$a$a.a(i$b3);
                            ks1_1 ks1_12 = ls1_2.a();
                            u$a$a u$a$a2 = u$a$a;
                            i$a i$a3 = i$a;
                            Ref$ObjectRef ref$ObjectRef5 = ref$ObjectRef2;
                            u$a$a = new u$a$a(i$a3, ref$ObjectRef2, i90_02, i$a2, cancellableContinuationImpl, ks1_12, function2);
                            ref$ObjectRef.element = u$a$a;
                            String string3 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver";
                            Intrinsics.checkNotNull(u$a$a, string3);
                            i3.a(u$a$a);
                            object3 = cancellableContinuationImpl.q();
                            if (object3 != object2) break block15;
                            string2 = "frame";
                        }
                        catch (Throwable throwable) {
                            break block16;
                        }
                        {
                            Intrinsics.checkNotNullParameter(this, string2);
                            break block15;
                        }
                    }
                    Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef2;
                    Ref$ObjectRef ref$ObjectRef7 = ref$ObjectRef;
                    break block14;
                }
                if (object3 == object2) {
                    return object2;
                }
                Ref$ObjectRef ref$ObjectRef8 = ref$ObjectRef2;
                Ref$ObjectRef ref$ObjectRef9 = ref$ObjectRef;
            }
            object2 = (kotlinx.coroutines.i)var7_24.element;
            if (object2 != null) {
                object2.d(null);
            }
            if ((object2 = (n)var6_14.element) != null) {
                i3.c((lu1)object2);
            }
            return Unit.a;
        }
        kotlinx.coroutines.i i8 = (kotlinx.coroutines.i)var7_25.element;
        if (i8 != null) {
            i8.d(null);
        }
        if ((n3 = (n)var6_15.element) != null) {
            i3.c(n3);
        }
        throw var2_5;
    }
}

