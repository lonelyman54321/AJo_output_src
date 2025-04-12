/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class JL0$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ ml0_2 a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;

    public JL0$a(ml0_2 ml0_22, Pair pair, am0_1 am0_12, LinkedHashMap linkedHashMap, kl0_2 kl0_22, bm0_1 bm0_12, zl0_1 zl0_12, f80_0 f80_02) {
        this.a = ml0_22;
        this.b = pair;
        this.c = am0_12;
        this.d = linkedHashMap;
        this.e = kl0_22;
        this.f = bm0_12;
        this.g = zl0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.c;
        Function1 function1 = object2;
        function1 = (am0_1)object2;
        Object object3 = object2 = this.d;
        object3 = (LinkedHashMap)object2;
        Object object4 = object2 = this.e;
        object4 = (kl0_2)object2;
        Object object5 = object2 = this.f;
        object5 = (bm0_1)object2;
        Object object6 = object2 = this.g;
        object6 = (zl0_1)object2;
        ml0_2 ml0_22 = this.a;
        Pair pair = this.b;
        object2 = object;
        object = new JL0$a(ml0_22, pair, (am0_1)function1, (LinkedHashMap)object3, (kl0_2)object4, (bm0_1)object5, (zl0_1)object6, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (JL0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((JL0$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((ml0_2)object).b;
        Object object3 = this.b;
        if (object2 != null) {
            Objects.toString(object3);
            object2.a();
        }
        this.c.invoke(object3);
        object2 = new Ref$BooleanRef();
        System.currentTimeMillis();
        Object object4 = this.e.invoke(object3);
        if (object4 != null) {
            boolean bl2;
            object4 = this.f;
            object4.invoke(object3);
            ((Ref$BooleanRef)object2).element = bl2 = true;
        } else {
            this.g.invoke(object3);
            boolean bl3 = false;
            object4 = null;
            ((Ref$BooleanRef)object2).element = false;
        }
        System.currentTimeMillis();
        object = ((ml0_2)object).b;
        if (object != null) {
            Objects.toString(object3);
            object.a();
        }
        object = ((Pair)object3).a;
        object4 = ((Ref$BooleanRef)object2).element;
        this.d.put(object, object4);
        object = ((Ref$BooleanRef)object2).element;
        object3 = ((Pair)object3).a;
        object2 = new Pair(object3, object);
        return object2;
    }
}

