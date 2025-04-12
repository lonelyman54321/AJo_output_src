/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Of3
 */
public final class of3_0
implements n60_0,
o60_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ of3_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void accept(Object object) {
        long l2;
        long l3;
        int n3 = this.a;
        switch (n3) {
            default: {
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$tmp0");
                function1.invoke(object);
                return;
            }
            case 0: 
        }
        object = (We0)object;
        pf3_0 pf3_02 = (pf3_0)this.b;
        pf3_02.getClass();
        long l4 = ((We0)object).b;
        pf3_02.b.getClass();
        Object object2 = ((We0)object).a;
        long l7 = ((We0)object).c;
        object2 = Te0.a(l7, (List)object2);
        Pf3$a pf3$a = new Pf3$a((byte[])object2, l4);
        ArrayList arrayList = pf3_02.d;
        arrayList.add(pf3$a);
        l4 = pf3_02.k;
        long l8 = -9223372036854775807L;
        long l12 = l4 == l8 ? 0 : (l4 < l8 ? -1 : 1);
        if (l12 == false || (l3 = (l2 = (l8 = ((We0)object).b) - l4) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
            pf3_02.d(pf3$a);
        }
    }
}

