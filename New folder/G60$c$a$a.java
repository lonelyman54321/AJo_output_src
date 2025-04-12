/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.i;

public final class G60$c$a$a
extends Lambda
implements Function1 {
    public final /* synthetic */ G60 c;
    public final /* synthetic */ i d;
    public final /* synthetic */ tU1 e;

    public G60$c$a$a(G60 g60, i i3, tU1 tU12) {
        this.c = g60;
        this.d = i3;
        this.e = tU12;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        object = (Number)object;
        float f6 = ((Number)object).floatValue();
        Object object2 = this.c;
        int n3 = ((G60)object2).p;
        if (n3 != 0) {
            n3 = 1065353216;
            f5 = 1.0f;
        } else {
            n3 = -1082130432;
            f5 = -1.0f;
        }
        float f7 = f5 * f6;
        object2 = ((G60)object2).o;
        long l2 = ((ku2_0)object2).g(f7);
        l2 = ((ku2_0)object2).d(l2);
        tU1 tU12 = this.e;
        l2 = tU12.a(l2);
        l2 = ((ku2_0)object2).d(l2);
        float f8 = ((ku2_0)object2).f(l2) * f5;
        f5 = Math.abs(f8);
        f7 = Math.abs(f6);
        n3 = (int)(f5 == f7 ? 0 : (f5 < f7 ? -1 : 1));
        if (n3 < 0) {
            String string2 = "Scroll animation cancelled because scroll was not consumed (";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(f8);
            stringBuilder.append(" < ");
            stringBuilder.append(f6);
            char c2 = ')';
            f6 = 5.7E-44f;
            stringBuilder.append(c2);
            object = stringBuilder.toString();
            f8 = 0.0f;
            object = xc0_2.a((String)object, null);
            object2 = this.d;
            object2.d((CancellationException)object);
        }
        return Unit.a;
    }
}

