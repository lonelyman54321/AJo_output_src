/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from MY1
 */
public final class my1_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ky1_0 d;

    public my1_2(ArrayList arrayList, long l2, ky1_0 ky1_02, f80_0 f80_02) {
        this.b = arrayList;
        this.c = l2;
        this.d = ky1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.b;
        List list = object2;
        list = (ArrayList)object2;
        long l2 = this.c;
        ky1_0 ky1_02 = this.d;
        object2 = object;
        object = new my1_2((ArrayList)list, l2, ky1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (my1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((my1_2)object).invokeSuspend(object2);
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
            iw_1.a.getClass();
            object = iw_1.d();
            long l2 = this.c;
            ArrayList arrayList = (ArrayList)this.b;
            Object object2 = new MY1$c((es0_2)object, arrayList, l2);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
            int n7 = 3;
            object2 = new qg3_2(n7, null);
            at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
            object2 = this.d;
            object = new MY1$b((ky1_0)object2);
            this.a = n4;
            object = at0_12.collect((fs0_2)object, this);
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

