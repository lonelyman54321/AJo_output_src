/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.u$a$a$a$a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class u$a$a$a
extends qg3_2
implements Function2 {
    public hs1_2 a;
    public Function2 b;
    public int c;
    public final /* synthetic */ hs1_2 d;
    public final /* synthetic */ Function2 e;

    public u$a$a$a(hs1_2 hs1_22, Function2 function2, f80_0 f80_02) {
        this.d = hs1_22;
        this.e = function2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        hs1_2 hs1_22 = this.d;
        Function2 function2 = this.e;
        object = new u$a$a$a(hs1_22, function2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (u$a$a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u$a$a$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        block11: {
            Object object3;
            Object object4;
            object2 = j90_0.COROUTINE_SUSPENDED;
            int n3 = this.c;
            int n4 = 2;
            int n7 = 1;
            if (n3 != 0) {
                if (n3 != n7) {
                    if (n3 != n4) {
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = this.a;
                    try {
                        vl2_2.b(object);
                    }
                    catch (Throwable throwable) {
                        break block11;
                    }
                }
                object4 = this.b;
                object3 = this.a;
                vl2_2.b(object);
                object = object3;
            } else {
                vl2_2.b(object);
                this.a = object = this.d;
                object4 = this.e;
                this.b = object4;
                this.c = n7;
                object3 = object.d(this, null);
                if (object3 == object2) {
                    return object2;
                }
            }
            try {
                object3 = new u$a$a$a$a((Function2)object4, null);
                this.a = object;
                this.b = null;
                this.c = n4;
                object4 = kotlinx.coroutines.d.c((Function2)object3, this);
                if (object4 == object2) {
                    return object2;
                }
                object2 = object;
            }
            catch (Throwable throwable) {
                object2 = object;
                object = throwable;
                break block11;
            }
            {
                object = Unit.a;
                object2.b(null);
                return Unit.a;
            }
        }
        object2.b(null);
        throw object;
    }
}

