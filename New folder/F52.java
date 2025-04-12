/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class F52
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ b52_0 b;
    public final /* synthetic */ List c;

    public F52(b52_0 b52_02, ArrayList arrayList, f80_0 f80_02) {
        this.b = b52_02;
        this.c = arrayList;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = (ArrayList)this.c;
        b52_0 b52_02 = this.b;
        object = new F52(b52_02, arrayList, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (F52)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((F52)object).invokeSuspend(object2);
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
            this.b.a.getClass();
            object = this.c;
            Intrinsics.checkNotNullParameter(object, "list");
            Object object2 = DatabaseCreator.INSTANCE.getDBInstance();
            object = (ArrayList)object;
            es0_2 es0_22 = new e52((es0_2)object2, (ArrayList)object);
            object = ir0_2.a;
            object = ms0_1.m(es0_22, (CoroutineContext)object);
            int n7 = 3;
            object2 = new qg3_2(n7, null);
            es0_22 = new at0_1((es0_2)object, (gx0_2)object2);
            object = F52$b.a;
            this.a = n4;
            object = ((at0_1)es0_22).collect((fs0_2)object, this);
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

