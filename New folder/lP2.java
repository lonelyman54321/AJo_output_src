/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.d;

public final class lP2 {
    public e72 a;
    public final float b;
    public final boolean c;
    public Float d;
    public e72 e;
    public final Lj f;
    public final Lj g;
    public final Lj h;
    public final x00_0 i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;

    public lP2(e72 object, float f5, boolean bl2) {
        this.a = object;
        this.b = f5;
        this.c = bl2;
        Object object2 = Rj.a(0.0f);
        this.f = object2;
        object2 = Rj.a(0.0f);
        this.g = object2;
        this.h = object = Rj.a(0.0f);
        object = new JobSupport(true);
        ((JobSupport)object).h0(null);
        this.i = object;
        object = Boolean.FALSE;
        this.j = object2 = J83.g(object);
        this.k = object = J83.g(object);
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(f80_0 var1_1) {
        block11: {
            block12: {
                block13: {
                    block7: {
                        block8: {
                            block9: {
                                block10: {
                                    var2_2 = var1_1 instanceof lP2$a;
                                    if (!var2_2) ** GOTO lbl-1000
                                    var3_3 = var1_1;
                                    var3_3 = (lP2$a)var1_1;
                                    var4_4 = var3_3.d;
                                    var5_5 = -1 << -1;
                                    var6_6 = var4_4 & var5_5;
                                    if (var6_6 != 0) {
                                        var3_3.d = var4_4 -= var5_5;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var3_3 = new lP2$a(this, (f80_0)var1_1);
                                    }
                                    var1_1 = var3_3.b;
                                    var7_7 = j90_0.COROUTINE_SUSPENDED;
                                    var5_5 = var3_3.d;
                                    var6_6 = 3;
                                    var8_8 = 2;
                                    var9_9 = 1;
                                    if (var5_5 == 0) break block7;
                                    if (var5_5 == var9_9) break block8;
                                    if (var5_5 == var8_8) break block9;
                                    if (var5_5 != var6_6) break block10;
                                    vl2_2.b(var1_1);
                                    break block11;
                                }
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            var10_10 = var3_3.a;
                            vl2_2.b(var1_1);
                            break block12;
                        }
                        var10_10 = var3_3.a;
                        vl2_2.b(var1_1);
                        break block13;
                    }
                    vl2_2.b(var1_1);
                    var3_3.a = this;
                    var3_3.d = var9_9;
                    var1_1 = new mp2_0(this, null);
                    var1_1 = kotlinx.coroutines.d.c((Function2)var1_1, var3_3);
                    if (var1_1 != var7_7) {
                        var1_1 = Unit.a;
                    }
                    if (var1_1 == var7_7) {
                        return var7_7;
                    }
                    var10_10 = this;
                }
                var1_1 = var10_10.j;
                var11_11 = Boolean.TRUE;
                var1_1.setValue(var11_11);
                var3_3.a = var10_10;
                var3_3.d = var8_8;
                var1_1 = var10_10.i.D(var3_3);
                if (var1_1 == var7_7) {
                    return var7_7;
                }
            }
            var3_3.a = null;
            var3_3.d = var6_6;
            var10_10.getClass();
            var1_1 = new np2_0(var10_10, null);
            var1_1 = kotlinx.coroutines.d.c((Function2)var1_1, var3_3);
            if (var1_1 != var7_7) {
                var1_1 = Unit.a;
            }
            if (var1_1 == var7_7) {
                return var7_7;
            }
        }
        return Unit.a;
    }
}

