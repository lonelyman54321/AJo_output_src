/*
 * Decompiled with CFR 0.152.
 */
package androidx.room;

import androidx.room.a$a;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

public final class a
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FP2 c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ Callable e;

    public a(FP2 fP2, String[] stringArray, Callable callable, f80_0 f80_02) {
        this.c = fP2;
        this.d = stringArray;
        this.e = callable;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Callable callable = this.e;
        FP2 fP2 = this.c;
        String[] stringArray = this.d;
        a a2 = new a(fP2, stringArray, callable, f80_02);
        a2.b = object;
        return a2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((a)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            Object object2 = object = this.b;
            object2 = (fs0_2)object;
            FP2 fP2 = this.c;
            String[] stringArray = this.d;
            Callable callable = this.e;
            object = new a$a(fP2, (fs0_2)object2, stringArray, callable, null);
            this.a = n4;
            object = kotlinx.coroutines.d.c((Function2)object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

