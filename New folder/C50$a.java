/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class C50$a
extends ni1_0
implements Rm2 {
    public final t50 c;
    public final Function1 d;

    public C50$a(t50 t502, Function1 function1) {
        ji1$a ji1$a = ji1.a;
        super(ji1$a);
        this.c = t502;
        this.d = function1;
    }

    public final /* synthetic */ boolean all(Function1 function1) {
        return mp1_1.a(this, function1);
    }

    public final /* synthetic */ boolean any(Function1 function1) {
        return mp1_1.c(this, function1);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof C50$a;
        Function1 function1 = null;
        if (bl3) {
            object = (C50$a)object;
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            function1 = ((C50$a)object).d;
        }
        if ((object = this.d) == function1) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final Object foldIn(Object object, Function2 function2) {
        return function2.invoke(object, this);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final Object k() {
        t50 t502 = this.c;
        Function1 function1 = this.d;
        B50 b50 = new B50(t502, function1);
        return b50;
    }

    public final /* synthetic */ LP1 then(LP1 lP1) {
        return kp1_0.a(this, lP1);
    }
}

