/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from ho2
 */
public final class ho2_1
implements Function0 {
    public final Object invoke() {
        z40$a z40$a = z40_0.Companion;
        long l2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.h("wallet_fetch_delay_seconds");
        long l3 = 1000;
        return l2 * l3;
    }
}

