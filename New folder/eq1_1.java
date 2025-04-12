/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.foundation.lazy.layout.b$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Eq1
 */
public final class eq1_1
extends b
implements jr1_0 {
    public static final eq1$a_0 d = eq1$a_0.c;
    public final pr1_0 a;
    public final yr1_0 b;
    public boolean c;

    public eq1_1(Function1 function1) {
        Object object = new pr1_0(this);
        this.a = object;
        this.b = object = new yr1_0();
        function1.invoke(this);
    }

    public final void c(Object object, Function1 function1, Object object2, u10 u102) {
        fq1_1 fq1_12 = object != null ? new fq1_1(object) : null;
        object = function1 != null ? new gq1_1(function1) : d;
        Hq1 hq1 = new Hq1(object2);
        object2 = new iq1_2(u102);
        int n3 = -34608120;
        int n4 = 1;
        u102 = new u10(n3, object2, n4 != 0);
        object2 = new dq1_1(fq1_12, (Function2)object, hq1, u102);
        object = this.b;
        ((yr1_0)object).a(n4, (b$a)object2);
        if (function1 != null) {
            this.c = n4;
        }
    }

    public final void d(int n3, Function1 object, Function2 function2, Function1 function1, u10 u102) {
        Function2 function22 = function2 == null ? d : function2;
        dq1_1 dq1_12 = new dq1_1((Function1)object, function22, function1, u102);
        object = this.b;
        ((yr1_0)object).a(n3, dq1_12);
        if (function2 != null) {
            n3 = 1;
            this.c = n3;
        }
    }

    public final yr1_0 e() {
        return this.b;
    }
}

