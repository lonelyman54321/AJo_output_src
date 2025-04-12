/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class L92
implements eK$c {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ S40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ zr1_1 e;

    public /* synthetic */ L92(VZ2 vZ2, S40 s40, String string2, Function0 function0, zr1_1 zr1_12) {
        this.a = vZ2;
        this.b = s40;
        this.c = string2;
        this.d = function0;
        this.e = zr1_12;
    }

    public final Object a(eK$a eK$a) {
        Intrinsics.checkNotNullParameter(eK$a, "completer");
        Function0 function0 = this.d;
        zr1_1 zr1_12 = this.e;
        S40 s40 = this.b;
        String string2 = this.c;
        M92 m92 = new M92(s40, string2, function0, zr1_12, eK$a);
        this.a.execute(m92);
        return Unit.a;
    }
}

