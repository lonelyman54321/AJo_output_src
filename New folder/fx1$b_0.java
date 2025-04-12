/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Fx1$b
 */
public final class fx1$b_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ Object b;
    public /* synthetic */ db1_2 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ tx1_2 e;
    public final /* synthetic */ List f;
    public final /* synthetic */ List g;
    public final /* synthetic */ fw1_2 h;
    public final /* synthetic */ mv_2 i;

    public fx1$b_0(boolean bl2, tx1_2 tx1_22, List list, List list2, fw1_2 fw1_22, mv_2 mv_22, f80_0 f80_02) {
        this.d = bl2;
        this.e = tx1_22;
        this.f = list;
        this.g = list2;
        this.h = fw1_22;
        this.i = mv_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (jZ2$a)object;
        object2 = (db1_2)object2;
        Object object4 = object3;
        object4 = (f80_0)object3;
        fw1_2 fw1_22 = this.h;
        mv_2 mv_22 = this.i;
        boolean bl2 = this.d;
        tx1_2 tx1_22 = this.e;
        List list = this.f;
        List list2 = this.g;
        object3 = new fx1$b_0(bl2, tx1_22, list, list2, fw1_22, mv_22, (f80_0)object4);
        ((fx1$b_0)object3).b = object;
        ((fx1$b_0)object3).c = object2;
        object = Unit.a;
        return ((fx1$b_0)object3).invokeSuspend(object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object var1_1) {
        block30: {
            block26: {
                block25: {
                    block33: {
                        block31: {
                            block32: {
                                block27: {
                                    block28: {
                                        block29: {
                                            var2_2 = j90_0.COROUTINE_SUSPENDED;
                                            var3_7 = this.a;
                                            var4_8 = this.h;
                                            var5_9 = 5;
                                            var6_10 = 4;
                                            var7_11 = 3;
                                            var8_12 = 2;
                                            var9_13 = 1;
                                            var10_14 = this.e;
                                            if (var3_7 == 0) break block27;
                                            if (var3_7 == var9_13) break block28;
                                            if (var3_7 == var8_12 || var3_7 == var7_11) break block29;
                                            if (var3_7 != var6_10) {
                                                if (var3_7 != var5_9) {
                                                    var2_2 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    throw var2_2;
                                                }
                                                var11_15 = var2_2 = this.b;
                                                var11_15 = (db1_2)var2_2;
                                                try {
                                                    vl2_2.b(var1_1);
                                                    return Unit.a;
                                                }
                                                catch (Throwable var2_3) {}
                                                break block30;
                                            } else {
                                                var11_15 = this.c;
                                                var12_16 = (jZ2$a)this.b;
                                                try {
                                                    vl2_2.b(var1_1);
                                                    var13_18 = var11_15;
                                                    var11_15 = var1_1;
                                                }
                                                catch (Throwable v0) {
                                                    break block25;
                                                }
                                            }
                                        }
                                        try {
                                            vl2_2.b(var1_1);
                                            return Unit.a;
                                        }
                                        catch (Throwable var2_4) {}
                                        break block31;
                                    }
                                    var11_15 = (jZ2$a)this.b;
                                    vl2_2.b(var1_1);
                                    var14_19 = var11_15;
                                    var11_15 = var1_1;
                                    break block32;
                                }
                                vl2_2.b(var1_1);
                                var14_19 = var11_15 = this.b;
                                var14_19 = (jZ2$a)var11_15;
                                var13_18 = this.c;
                                var11_15 = fx1_1.a;
                                var11_15 = this.f;
                                var15_20 = var11_15.isEmpty();
                                if (!var15_20) {
                                    var15_20 = (var11_15 = (Iterable)var11_15) instanceof Collection;
                                    if (var15_20) {
                                        var16_21 = var11_15;
                                        var16_21 = (Collection)var11_15;
                                        var15_20 = var16_21.isEmpty();
                                        if (var15_20) {
                                            var2_2 = var13_18.f;
                                            var11_15 = fx1_1.b;
                                            var4_8 = Unit.a;
                                            var2_2.d((xq_2)var11_15, var4_8);
                                            return var4_8;
                                        }
                                    }
                                    var11_15 = ((Iterable)var11_15).iterator();
                                    while (var15_20 = var11_15.hasNext()) {
                                        var16_21 = (Boolean)((Function1)var11_15.next()).invoke(var13_18);
                                        var15_20 = var16_21.booleanValue();
                                        if (!var15_20) continue;
                                        break;
                                    }
                                }
                                if ((var3_7 = (int)this.d) != 0) {
                                    this.b = var14_19;
                                    this.a = var9_13;
                                    var17_22 = this.h;
                                    var12_17 = this.i;
                                    var11_15 = this.e;
                                    var4_8 = this.g;
                                    var18_25 = var13_18;
                                    var13_18 = this;
                                    if ((var11_15 = fx1_1.h((tx1_2)var11_15, (List)var4_8, var17_22, var12_17, (db1_2)var18_25, this)) == var2_2) {
                                        return var2_2;
                                    } else {
                                        ** GOTO lbl83
                                    }
                                }
                                break block33;
                            }
                            var11_15 = (bg2_2)var11_15;
                            if (var11_15 == null) ** GOTO lbl-1000
                            {
                                this.b = null;
                                this.a = var8_12;
                                var4_8 = var14_19.a;
                                var11_15 = var4_8.d(this, var11_15);
                                if (var11_15 != var2_2) return Unit.a;
                                return var2_2;
                            }
lbl-1000:
                            // 1 sources

                            {
                                this.b = null;
                                this.a = var7_11;
                                var11_15 = var14_19.a;
                                var11_15 = var11_15.c(this);
                                if (var11_15 != var2_2) return Unit.a;
                                return var2_2;
                            }
                        }
                        var11_15 = new StringBuilder("<-- HTTP FAILED: ");
                        var11_15.append(var2_4);
                        var11_15 = var11_15.toString();
                        var10_14.a((String)var11_15);
                        throw var2_4;
                    }
                    try {
                        var11_15 = this.g;
                        this.b = var14_19;
                        this.c = var13_18;
                        this.a = var6_10;
                        var11_15 = fx1_1.g(var10_14, (fw1_2)var4_8, (List)var11_15, (db1_2)var13_18, this);
                        if (var11_15 == var2_2) {
                            return var2_2;
                        }
                        var12_16 = var14_19;
                    }
                    catch (Throwable v1) {
                        var11_15 = var13_18;
                        var12_16 = var14_19;
                        break block25;
                    }
                    try {
                        var11_15 = (bg2_2)var11_15;
                        break block26;
                    }
                    catch (Throwable v2) {
                        var11_15 = var13_18;
                    }
                }
                var13_18 = var11_15;
                var3_7 = 0;
                var11_15 = null;
            }
            if (var11_15 != null) ** GOTO lbl133
            try {
                var11_15 = var13_18.d;
lbl133:
                // 2 sources

                this.b = var13_18;
                this.c = null;
                this.a = var5_9;
                var17_23 = var12_16.a;
                if ((var11_15 = var17_23.d(this, var11_15)) != var2_2) return Unit.a;
                return var2_2;
            }
            catch (Throwable var2_5) {}
            var11_15 = var13_18;
        }
        var17_24 = fx1_1.a;
        var19_26 = var4_8.getInfo();
        if (var19_26 == false) throw var2_6;
        var17_24 = "REQUEST ";
        var4_8 = new StringBuilder((String)var17_24);
        var11_15 = ku3_0.a(var11_15.a);
        var4_8.append(var11_15);
        var4_8.append(" failed with exception: ");
        var4_8.append(var2_6);
        var11_15 = var4_8.toString();
        var10_14.a((String)var11_15);
        throw var2_6;
    }
}

