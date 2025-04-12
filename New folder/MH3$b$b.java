/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class MH3$b$b
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Object[] c;

    public final Object invoke(Object object, Object objectArray, Object object2) {
        object = (fs0_2)object;
        objectArray = objectArray;
        object2 = (f80_0)object2;
        MH3$b$b mH3$b$b = new qg3_2(3, (f80_0)object2);
        mH3$b$b.b = object;
        mH3$b$b.c = objectArray;
        object = Unit.a;
        return mH3$b$b.invokeSuspend(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        k60_0 k60_022;
        int n3;
        j90_0 j90_02;
        block5: {
            j90_02 = j90_0.COROUTINE_SUSPENDED;
            int n4 = this.a;
            n3 = 1;
            if (n4 != 0) {
                if (n4 == n3) {
                    vl2_2.b(object);
                    return Unit.a;
                }
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
            object = this.b;
            for (k60_0 k60_022 : (k60_0[])this.c) {
                k60$a k60$a = k60$a.a;
                int n7 = Intrinsics.areEqual(k60_022, k60$a) ^ n3;
                if (n7 == 0) {
                    continue;
                }
                break block5;
            }
            k60_022 = null;
        }
        if (k60_022 == null) {
            k60_022 = k60$a.a;
        }
        this.a = n3;
        if ((object = object.emit(k60_022, this)) != j90_02) return Unit.a;
        return j90_02;
    }
}

