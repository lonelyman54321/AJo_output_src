/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from SI3
 */
public final class si3_1
extends Lambda
implements Function0 {
    public final /* synthetic */ CI3 c;
    public final /* synthetic */ ni3_1 d;
    public final /* synthetic */ String e;

    public si3_1(ni3_1 ni3_12, CI3 cI3, String string2) {
        this.c = cI3;
        this.d = ni3_12;
        this.e = string2;
        super(0);
    }

    public final Object invoke() {
        List list = a.b(this.c);
        DE0 dE0 = DE0.KEEP;
        ni3_1 ni3_12 = this.d;
        String string2 = this.e;
        qh3_2 qh3_22 = new qh3_2(ni3_12, string2, dE0, list);
        Vz0.a(qh3_22);
        return Unit.a;
    }
}

