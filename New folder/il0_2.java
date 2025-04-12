/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from iL0
 */
public final class il0_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ jl0_1 d;
    public final /* synthetic */ Function1 e;

    public il0_2(ArrayList arrayList, jl0_1 jl0_12, xl0_2 xl0_22, f80_0 f80_02) {
        this.c = arrayList;
        this.d = jl0_12;
        this.e = xl0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ArrayList arrayList = (ArrayList)this.c;
        xl0_2 xl0_22 = (xl0_2)this.e;
        jl0_1 jl0_12 = this.d;
        il0_2 il0_22 = new il0_2(arrayList, jl0_12, xl0_22, f80_02);
        il0_22.b = object;
        return il0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (il0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((il0_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = (i90_0)this.b;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator iterator = this.c.iterator();
        while (true) {
            int n7;
            if ((n7 = iterator.hasNext()) == 0) {
                this.a = n4;
                object = qu_2.a(arrayList, this);
                if (object != j90_02) return Unit.a;
                return j90_02;
            }
            Object object2 = (String)iterator.next();
            jl0_1 jl0_12 = this.d;
            xl0_2 xl0_22 = (xl0_2)this.e;
            iL0$a iL0$a = new iL0$a(jl0_12, (String)object2, xl0_22, null);
            n7 = 3;
            object2 = Ae3.a((i90_0)object, null, iL0$a, n7);
            arrayList.add(object2);
        }
    }
}

