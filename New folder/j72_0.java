/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from J72
 */
public final class j72_0
extends qg3_2
implements Function2 {
    public Closeable a;
    public CoroutineContext b;
    public eb1_2 c;
    public se_1 d;
    public Ref$IntRef e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ se_1 h;
    public final /* synthetic */ CoroutineContext i;
    public final /* synthetic */ eb1_2 j;

    public j72_0(se_1 se_12, CoroutineContext coroutineContext, eb1_2 eb1_22, f80_0 f80_02) {
        this.h = se_12;
        this.i = coroutineContext;
        this.j = eb1_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CoroutineContext coroutineContext = this.i;
        eb1_2 eb1_22 = this.j;
        se_1 se_12 = this.h;
        j72_0 j72_02 = new j72_0(se_12, coroutineContext, eb1_22, f80_02);
        j72_02.g = object;
        return j72_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (sj3_2)object;
        object2 = (f80_0)object2;
        object = (j72_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((j72_0)object).invokeSuspend(object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block23: {
            block20: {
                block22: {
                    block21: {
                        block19: {
                            block24: {
                                var2_5 = j90_0.COROUTINE_SUSPENDED;
                                var3_7 = this.f;
                                var4_8 = 2;
                                var5_9 = 1;
                                if (var3_7 == 0) break block24;
                                if (var3_7 != var5_9) {
                                    if (var3_7 != var4_8) {
                                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw var1_1;
                                    }
                                    var6_10 = this.e;
                                    var7_11 = this.d;
                                    var8_12 = this.c;
                                    var9_13 = this.b;
                                    var10_14 = this.a;
                                    var11_15 = (sj3_2)this.g;
                                    try {
                                        vl2_2.b(var1_1);
                                    }
                                    catch (Throwable var1_2) {
                                        break block20;
                                    }
                                    while (true) {
                                        var1_1 = var11_15;
                                        var12_16 = var10_14;
                                        var10_14 = var7_11;
                                        var7_11 = var9_13;
                                        var9_13 = var12_16;
                                        break block19;
                                        break;
                                    }
                                }
                                var6_10 = this.e;
                                var7_11 = this.d;
                                var8_12 = this.c;
                                var9_13 = this.b;
                                var10_14 = this.a;
                                var11_15 = (sj3_2)this.g;
                                {
                                    vl2_2.b(var1_1);
                                    ** GOTO lbl-1000
                                }
                            }
                            vl2_2.b(var1_1);
                            var1_1 = (sj3_2)this.g;
                            var10_14 = this.h;
                            {
                                var6_10 = new Ref$IntRef();
                                var7_11 = this.i;
                                var8_12 = this.j;
                                var9_13 = var10_14;
                            }
                        }
                        try {
                            var13_17 = var10_14.isOpen();
                            if (var13_17 != 0 && (var13_17 = mm0.g((CoroutineContext)var7_11)) != 0 && (var13_17 = var6_10.element) >= 0) {
                                var11_15 = var1_1.a;
                                var14_18 = new i72_0(var6_10, (se_1)var10_14, var8_12, (CoroutineContext)var7_11);
                                this.g = var1_1;
                                this.a = var9_13;
                                this.b = var7_11;
                                this.c = var8_12;
                                this.d = var10_14;
                                this.e = var6_10;
                                this.f = var5_9;
                                if ((var11_15 = mf_1.a((gf_2)var11_15, var14_18, this)) == var2_5) {
                                    return var2_5;
                                }
                                var11_15 = var1_1;
                                var12_16 = var9_13;
                                var9_13 = var7_11;
                                var7_11 = var10_14;
                                var10_14 = var12_16;
                            }
                            ** GOTO lbl-1000
                        }
                        catch (Throwable var1_3) {
                            break block21;
                        }
lbl-1000:
                        // 2 sources

                        {
                            var1_1 = var11_15.a;
                            this.g = var11_15;
                            this.a = var10_14;
                            this.b = var9_13;
                            this.c = var8_12;
                            this.d = var7_11;
                            this.e = var6_10;
                            this.f = var4_8;
                            if ((var1_1 = var1_1.d(this)) != var2_5) ** continue;
                            return var2_5;
                        }
                    }
                    var10_14 = var9_13;
                    break block20;
lbl-1000:
                    // 1 sources

                    {
                        var1_1 = Unit.a;
                        if (var9_13 == null) break block22;
                    }
                    try {
                        var9_13.close();
                    }
                    catch (Throwable var1_4) {
                        break block23;
                    }
                }
                var1_1 = null;
                break block23;
            }
            if (var10_14 != null) {
                try {
                    var10_14.close();
                }
                catch (Throwable var2_6) {
                    yc0_2.a((Throwable)var1_1, var2_6);
                }
            }
        }
        if (var1_1 == null) {
            return Unit.a;
        }
        throw var1_1;
    }
}

