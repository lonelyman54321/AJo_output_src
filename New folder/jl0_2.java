/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.k;

/*
 * Renamed from JL0
 */
public final class jl0_2
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ml0_2 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ Function1 i;

    public jl0_2(ArrayList arrayList, ml0_2 ml0_22, Function1 function1, am0_1 am0_12, kl0_2 kl0_22, bm0_1 bm0_12, zl0_1 zl0_12, f80_0 f80_02) {
        this.c = arrayList;
        this.d = ml0_22;
        this.e = function1;
        this.f = am0_12;
        this.g = kl0_22;
        this.h = bm0_12;
        this.i = zl0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        jl0_2 jl0_22;
        Object object2 = this.c;
        List list = object2;
        list = (ArrayList)object2;
        Object object3 = object2 = this.f;
        object3 = (am0_1)object2;
        Object object4 = object2 = this.g;
        object4 = (kl0_2)object2;
        Object object5 = object2 = this.h;
        object5 = (bm0_1)object2;
        Object object6 = object2 = this.i;
        object6 = (zl0_1)object2;
        ml0_2 ml0_22 = this.d;
        Function1 function1 = this.e;
        object2 = jl0_22;
        jl0_22 = new jl0_2((ArrayList)list, ml0_22, function1, (am0_1)object3, (kl0_2)object4, (bm0_1)object5, (zl0_1)object6, f80_02);
        jl0_22.b = object;
        return jl0_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jl0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jl0_2)object).invokeSuspend(object2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        void var3_7;
        Object object2;
        jl0_2 jl0_22 = this;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 != n4) {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw illegalStateException;
            }
            Map map2 = (Map)this.b;
            vl2_2.b(object);
            object2 = object;
        } else {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            int n7;
            vl2_2.b(object);
            object2 = (i90_0)this.b;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Object object7 = this.c;
            int n8 = 10;
            int n10 = yx_2.o((Iterable)object7, n8);
            Object object8 = new ArrayList(n10);
            LinkedHashMap<Object, Object> linkedHashMap = object7.iterator();
            while ((n7 = linkedHashMap.hasNext()) != 0) {
                object6 = ((Pair)linkedHashMap.next()).a;
                object5 = Boolean.FALSE;
                object4 = new Pair(object6, object5);
                ((ArrayList)object8).add(object4);
            }
            if ((n8 = eh1_2.c(yx_2.o(object8, n8))) < (n10 = 16)) {
                n8 = 16;
            }
            linkedHashMap = new LinkedHashMap<Object, Object>(n8);
            object8 = ((ArrayList)object8).iterator();
            while ((n8 = (int)(object8.hasNext() ? 1 : 0)) != 0) {
                object3 = (Pair)object8.next();
                object6 = ((Pair)object3).a;
                object3 = ((Pair)object3).b;
                linkedHashMap.put(object6, object3);
            }
            object8 = fh1_2.q(linkedHashMap);
            object7 = object7.iterator();
            while (true) {
                n8 = (int)(object7.hasNext() ? 1 : 0);
                n10 = 0;
                linkedHashMap = null;
                if (n8 == 0) break;
                Object object9 = object3 = object7.next();
                object9 = (Pair)object3;
                Object object10 = object6 = jl0_22.f;
                object10 = (am0_1)object6;
                Object object11 = object6 = jl0_22.g;
                object11 = (kl0_2)object6;
                Object object12 = object6 = jl0_22.h;
                object12 = (bm0_1)object6;
                Object object13 = object6 = jl0_22.i;
                object13 = (zl0_1)object6;
                object4 = jl0_22.d;
                object5 = object3;
                object3 = new JL0$a((ml0_2)object4, (Pair)object9, (am0_1)object10, (LinkedHashMap)object8, (kl0_2)object11, (bm0_1)object12, (zl0_1)object13, null);
                n7 = 3;
                object3 = Ae3.a((i90_0)object2, null, (Function2)object3, n7);
                arrayList.add(object3);
            }
            long l2 = jl0_22.d.c;
            object2 = new JL0$b(arrayList, null);
            jl0_22.b = object8;
            jl0_22.a = n4;
            if ((object2 = k.b(l2, (Function2)object2, jl0_22)) == j90_02) {
                return j90_02;
            }
            Object object14 = object8;
        }
        object2 = (List)object2;
        Function1 function1 = jl0_22.e;
        if (object2 != null) {
            object2 = (Iterable)object2;
            Map map3 = fh1_2.n((Iterable)object2);
            function1.invoke(map3);
            return Unit.a;
        }
        function1.invoke(var3_7);
        return Unit.a;
    }
}

