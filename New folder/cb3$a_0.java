/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Cb3$a
 */
public final class cb3$a_0
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ int c;
    public final /* synthetic */ cb3_2 d;

    public cb3$a_0(cb3_2 cb3_22, f80_0 f80_02) {
        this.d = cb3_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        int n3 = ((Number)object2).intValue();
        object3 = (f80_0)object3;
        cb3_2 cb3_22 = this.d;
        cb3$a_0 cb3$a_0 = new cb3$a_0(cb3_22, (f80_0)object3);
        cb3$a_0.b = object;
        cb3$a_0.c = n3;
        object = Unit.a;
        return cb3$a_0.invokeSuspend(object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block15: {
            block12: {
                block13: {
                    block14: {
                        block16: {
                            block7: {
                                block8: {
                                    block9: {
                                        block10: {
                                            block11: {
                                                var2_2 = j90_0.COROUTINE_SUSPENDED;
                                                var3_3 = this.a;
                                                var4_4 = 5;
                                                var5_5 = 4;
                                                var6_6 = 3;
                                                var7_7 = 2;
                                                var8_8 = 1;
                                                var9_9 = this.d;
                                                if (var3_3 == 0) break block7;
                                                if (var3_3 == var8_8) break block8;
                                                if (var3_3 == var7_7) break block9;
                                                if (var3_3 == var6_6) break block10;
                                                if (var3_3 == var5_5) break block11;
                                                if (var3_3 != var4_4) {
                                                    var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    throw var1_1 /* !! */ ;
                                                }
                                                break block8;
                                            }
                                            var10_10 = this.b;
                                            vl2_2.b(var1_1 /* !! */ );
                                            break block12;
                                        }
                                        var10_10 = this.b;
                                        vl2_2.b(var1_1 /* !! */ );
                                        break block13;
                                    }
                                    var10_10 = this.b;
                                    vl2_2.b(var1_1 /* !! */ );
                                    break block14;
                                }
                                vl2_2.b(var1_1 /* !! */ );
                                break block15;
                            }
                            vl2_2.b(var1_1 /* !! */ );
                            var10_10 = this.b;
                            var11_11 = this.c;
                            if (var11_11 <= 0) break block16;
                            var1_1 /* !! */  = b33.START;
                            this.a = var8_8;
                            if ((var1_1 /* !! */  = var10_10.emit(var1_1 /* !! */ , this)) == var2_2) {
                                return var2_2;
                            }
                            break block15;
                        }
                        var12_12 = var9_9.a;
                        this.b = var10_10;
                        this.a = var7_7;
                        var1_1 /* !! */  = bo0_2.a(var12_12, this);
                        if (var1_1 /* !! */  == var2_2) {
                            return var2_2;
                        }
                    }
                    var14_13 = var9_9.b;
                    var12_12 = 0L;
                    var11_11 = (int)(var14_13 == var12_12 ? 0 : (var14_13 < var12_12 ? -1 : 1));
                    if (var11_11 > 0) {
                        var1_1 /* !! */  = b33.STOP;
                        this.b = var10_10;
                        this.a = var6_6;
                        if ((var1_1 /* !! */  = var10_10.emit(var1_1 /* !! */ , this)) == var2_2) {
                            return var2_2;
                        } else {
                            ** GOTO lbl61
                        }
                    }
                    break block12;
                }
                var16_14 = var9_9.b;
                this.b = var10_10;
                this.a = var5_5;
                var1_1 /* !! */  = bo0_2.a(var16_14, this);
                if (var1_1 /* !! */  == var2_2) {
                    return var2_2;
                }
            }
            var1_1 /* !! */  = b33.STOP_AND_RESET_REPLAY_CACHE;
            var5_5 = 0;
            this.b = null;
            this.a = var4_4;
            var1_1 /* !! */  = var10_10.emit(var1_1 /* !! */ , this);
            if (var1_1 /* !! */  == var2_2) {
                return var2_2;
            }
        }
        return Unit.a;
    }
}

