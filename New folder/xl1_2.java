/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.i;

/*
 * Renamed from xl1
 */
public class xl1_2
extends JobSupport
implements g00_0 {
    public final boolean c;

    /*
     * Unable to fully structure code
     */
    public xl1_2(i var1_1) {
        var2_2 = true;
        super(var2_2);
        this.h0((i)var1_1);
        var1_1 = JobSupport.b;
        var3_3 = (ju_2)var1_1.get(this);
        var4_4 = var3_3 instanceof ku_2;
        var3_3 = var4_4 != false ? (ku_2)var3_3 : null;
        var4_4 = false;
        if (var3_3 == null || (var3_3 = var3_3.h()) == null) ** GOTO lbl14
        while (!(var5_5 = var3_3.b0())) {
            var5_5 = (var3_3 = (ju_2)var1_1.get(var3_3)) instanceof ku_2;
            var3_3 = var5_5 != false ? (ku_2)var3_3 : null;
            if (var3_3 != null && (var3_3 = var3_3.h()) != null) continue;
lbl14:
            // 2 sources

            var2_2 = false;
            break;
        }
        this.c = var2_2;
    }

    public final boolean a() {
        Unit unit = Unit.a;
        return this.l0(unit);
    }

    public final boolean b0() {
        return this.c;
    }

    public final boolean c(Throwable throwable) {
        m00_0 m00_02 = new m00_0(throwable, false);
        return this.l0(m00_02);
    }

    public final boolean c0() {
        return true;
    }
}

