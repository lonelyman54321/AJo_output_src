/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class CoroutineWorker$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ CoroutineWorker b;

    public CoroutineWorker$b(CoroutineWorker coroutineWorker, f80_0 f80_02) {
        this.b = coroutineWorker;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CoroutineWorker coroutineWorker = this.b;
        object = new CoroutineWorker$b(coroutineWorker, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (CoroutineWorker$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        ((CoroutineWorker$b)object).invokeSuspend(object2);
        return object2;
    }

    public final Object invokeSuspend(Object object) {
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return object;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        this.a = n4;
        this.b.getClass();
        object = new IllegalStateException("Not implemented");
        throw object;
    }
}

