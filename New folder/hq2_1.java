/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.RtoResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from HQ2
 */
public final class hq2_1
extends qg3_2
implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ lq2_0 d;
    public final /* synthetic */ String e;

    public hq2_1(Ref$ObjectRef ref$ObjectRef, lq2_0 lq2_02, String string2, f80_0 f80_02) {
        this.c = ref$ObjectRef;
        this.d = lq2_02;
        this.e = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        lq2_0 lq2_02 = this.d;
        String string2 = this.e;
        Ref$ObjectRef ref$ObjectRef = this.c;
        hq2_1 hq2_12 = new hq2_1(ref$ObjectRef, lq2_02, string2, f80_02);
        hq2_12.b = object;
        return hq2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (fs0_2)object;
        object2 = (f80_0)object2;
        object = (hq2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((hq2_1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block11: {
            block14: {
                block13: {
                    block12: {
                        block9: {
                            block10: {
                                var2_2 = j90_0.COROUTINE_SUSPENDED;
                                var3_3 = this.a;
                                var4_4 = 2;
                                var5_5 = 3;
                                var6_6 = 1;
                                if (var3_3 == 0) break block9;
                                if (var3_3 == var6_6) break block10;
                                if (var3_3 != var4_4 && var3_3 != var5_5) {
                                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var1_1;
                                }
                                vl2_2.b(var1_1);
                                break block11;
                            }
                            var7_7 = (fs0_2)this.b;
                            vl2_2.b(var1_1);
                            break block12;
                        }
                        vl2_2.b(var1_1);
                        var7_7 = var1_1 = this.b;
                        var7_7 = (fs0_2)var1_1;
                        var1_1 = (String)this.c.element;
                        if (var1_1 != null) {
                            var8_8 = this.d.a;
                            this.b = var7_7;
                            this.a = var6_6;
                            var8_8 = var8_8.a;
                            var9_9 = this.e;
                            if ((var1_1 = var8_8.getRtoData(var9_9, (String)var1_1, this)) == var2_2) {
                                return var2_2;
                            } else {
                                ** GOTO lbl31
                            }
                        }
                        break block13;
                    }
                    var1_1 = (dl2_2)var1_1;
                    break block14;
                }
                var1_1 = null;
            }
            var1_1 = var1_1 != null ? (RtoResponseData)var1_1.b : null;
            if (var1_1 == null) ** GOTO lbl-1000
            var8_8 = var1_1.getRtoData();
            if (var8_8 != null) {
                var8_8 = var8_8.getEntries();
            } else {
                var10_10 = false;
                var8_8 = null;
            }
            if (var8_8 != null && !(var10_10 = var8_8.isEmpty())) {
                var11_11 = new kk2_1(var1_1, var4_4);
                this.b = null;
                this.a = var4_4;
                var1_1 = var7_7.emit(var11_11, this);
                if (var1_1 == var2_2) {
                    return var2_2;
                }
            } else lbl-1000:
            // 2 sources

            {
                var12_12 = new KK2$a(null, var1_1, var6_6);
                this.b = null;
                this.a = var5_5;
                var1_1 = var7_7.emit(var12_12, this);
                if (var1_1 == var2_2) {
                    return var2_2;
                }
            }
        }
        return Unit.a;
    }
}

