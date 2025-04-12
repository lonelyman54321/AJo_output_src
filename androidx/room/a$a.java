/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import androidx.room.a$a$a;
import androidx.room.a$a$b;
import androidx.room.f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class a$a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ FP2 d;
    public final /* synthetic */ fs0_2 e;
    public final /* synthetic */ String[] f;
    public final /* synthetic */ Callable g;

    public a$a(FP2 fP2, fs0_2 fs0_22, String[] stringArray, Callable callable, f80_0 f80_02) {
        this.c = false;
        this.d = fP2;
        this.e = fs0_22;
        this.f = stringArray;
        this.g = callable;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        FP2 fP2 = this.d;
        fs0_2 fs0_22 = this.e;
        String[] stringArray = this.f;
        Callable callable = this.g;
        a$a a$a = new a$a(fP2, fs0_22, stringArray, callable, f80_02);
        a$a.b = object;
        return a$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (a$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a$a)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var8_12;
        a$a$a a$a$a;
        Object object2;
        Object object3;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        boolean bl2 = this.a;
        boolean bl3 = true;
        if (bl2) {
            if (bl2 == bl3) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (i90_0)this.b;
        int n3 = -1;
        int n4 = 6;
        le_2 le_22 = sr_2.a(n3, n4, null);
        String[] stringArray = this.f;
        a$a$b a$a$b = new a$a$b(stringArray, le_22);
        Unit unit = Unit.a;
        le_22.j(unit);
        Object object4 = object.getCoroutineContext();
        Object object5 = androidx.room.f.a;
        object4 = (f)object4.get((CoroutineContext$a)object5);
        if (object4 != null) {
            object4.getClass();
        }
        n4 = (int)(this.c ? 1 : 0);
        object5 = this.d;
        if (n4 != 0) {
            object4 = ((FP2)object5).getBackingFieldMap();
            object2 = object4.get(object3 = "TransactionDispatcher");
            if (object2 == null) {
                object5 = ((FP2)object5).getTransactionExecutor();
                object2 = h83.a((Executor)object5);
                object4.put(object3, object2);
            }
            object4 = "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher";
            Intrinsics.checkNotNull(object2, (String)object4);
        } else {
            object2 = R90.a((FP2)object5);
        }
        object4 = object2;
        int n7 = 7;
        le_2 le_23 = sr_2.a(0, n7, null);
        object3 = this.d;
        object2 = this.g;
        object5 = a$a$a;
        a$a$a = new a$a$a((FP2)object3, a$a$b, le_22, (Callable)object2, le_23, null);
        int n8 = 2;
        Ae3.d((i90_0)object, (CoroutineContext)object4, null, a$a$a, n8);
        this.a = bl3;
        object = qs0_2.a(this.e, le_23, bl3, this);
        if (object == j90_02) {
            Object object6 = object;
        }
        if (var8_12 != j90_02) return Unit.a;
        return j90_02;
    }
}

