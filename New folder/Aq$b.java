/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.k$d;
import androidx.recyclerview.widget.k$e;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;

public final class Aq$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ Rl2$e a;
    public final /* synthetic */ Cq b;

    public Aq$b(Rl2$e rl2$e, Cq cq2, f80_0 f80_02) {
        this.a = rl2$e;
        this.b = cq2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Rl2$e rl2$e = this.a;
        Cq cq2 = this.b;
        object = new Aq$b(rl2$e, cq2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Aq$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Aq$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2;
        block4: {
            int n3;
            block3: {
                object2 = j90_0.COROUTINE_SUSPENDED;
                vl2_2.b(object);
                object = this.a;
                us2_0 us2_02 = ((Rl2$e)object).b;
                k$e k$e = this.b.a;
                Intrinsics.checkNotNullParameter(us2_02, "<this>");
                Object object3 = ((Rl2$e)object).a;
                Intrinsics.checkNotNullParameter(object3, "newList");
                Intrinsics.checkNotNullParameter(k$e, "diffCallback");
                int n4 = us2_02.a();
                int n7 = object3.a();
                object2 = object;
                object = new vs2_0(us2_02, (us2_0)object3, k$e, n4, n7);
                object = k.a((k$b)object);
                Intrinsics.checkNotNullExpressionValue(object, "PlaceholderPaddedList<T>\u2026    },\n        true\n    )");
                int n8 = us2_02.a();
                bl2 = false;
                object2 = f.m(0, n8);
                n3 = object2 instanceof Collection;
                if (n3 == 0) break block3;
                object3 = object2;
                object3 = (Collection)object2;
                n3 = object3.isEmpty();
                if (n3 != 0) break block4;
            }
            object2 = ((c)object2).d();
            while ((n3 = ((ui1_2)object2).c) != 0) {
                int n10;
                n3 = ((mi1_2)object2).nextInt();
                if ((n3 = ((k$d)object).a(n3)) == (n10 = -1)) continue;
                bl2 = true;
                break;
            }
        }
        object2 = new Ts2((k$d)object, bl2);
        return object2;
    }
}

