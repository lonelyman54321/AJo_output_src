/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tl2
 */
public final class tl2_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ rk2_0 b;
    public final /* synthetic */ Sl2 c;
    public final /* synthetic */ Ml2 d;

    public tl2_0(rk2_0 rk2_02, Sl2 sl2, Ml2 ml2, f80_0 f80_02) {
        this.b = rk2_02;
        this.c = sl2;
        this.d = ml2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Sl2 sl2 = this.c;
        Ml2 ml2 = this.d;
        rk2_0 rk2_02 = this.b;
        object = new tl2_0(rk2_02, sl2, ml2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tl2_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tl2_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block36: {
            block42: {
                block33: {
                    block34: {
                        block37: {
                            block38: {
                                block41: {
                                    block40: {
                                        block39: {
                                            block35: {
                                                var2_2 = j90_0.COROUTINE_SUSPENDED;
                                                var3_3 = this.a;
                                                var4_4 = 1;
                                                var5_5 = 0;
                                                var6_6 = null;
                                                switch (var3_3) {
                                                    default: {
                                                        var7_7 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        throw var7_7;
                                                    }
                                                    case 6: {
                                                        vl2_2.b(var1_1);
                                                        break block33;
                                                    }
                                                    case 5: {
                                                        vl2_2.b(var1_1);
                                                        break block34;
                                                    }
                                                    case 4: {
                                                        vl2_2.b(var1_1);
                                                        break block35;
                                                    }
                                                    case 3: {
                                                        vl2_2.b(var1_1);
                                                        break;
                                                    }
                                                    case 1: 
                                                    case 2: {
                                                        vl2_2.b(var1_1);
                                                        break block36;
                                                    }
                                                    case 0: {
                                                        vl2_2.b(var1_1);
                                                        var7_8 = this.b;
                                                        var8_9 = var7_8 instanceof rk2$d;
                                                        if (var8_9 == 0) ** GOTO lbl58
                                                        var7_8 = this.c;
                                                        var10_11 = ((rk2$d)this.b).a;
                                                        var9_10 = new Wq3(0, (List)var10_11);
                                                        var9_10 = kotlin.collections.a.b(var9_10);
                                                        var10_11 = (rk2$d)this.b;
                                                        var11_12 /* !! */  = var10_11.b;
                                                        if (var11_12 /* !! */  == null && (var12_13 /* !! */  = var10_11.c) == null) {
                                                            var13_14 = 0;
                                                            var12_13 /* !! */  = null;
                                                        } else {
                                                            var13_14 = 1;
                                                        }
                                                        var14_15 = var10_11.c;
                                                        var15_16 = this.d.c;
                                                        this.a = var4_4;
                                                        var5_5 = 0;
                                                        var6_6 = null;
                                                        var10_11 = null;
                                                        var16_17 = var9_10;
                                                        var8_9 = 0;
                                                        var9_10 = null;
                                                        var17_19 = var13_14;
                                                        var12_13 /* !! */  = var14_15;
                                                        var14_15 = var15_16;
                                                        var15_16 = this;
                                                        var7_8 = Sl2.a((Sl2)var7_8, (List)var16_17, 0, 0, (boolean)var13_14, (Qv1)var11_12 /* !! */ , (Qv1)var12_13 /* !! */ , (z61)var14_15, this);
                                                        if (var7_8 == var2_2) {
                                                            return var2_2;
                                                        }
                                                        break block36;
lbl58:
                                                        // 1 sources

                                                        var8_9 = var7_8 instanceof rk2$b;
                                                        if (var8_9 == 0) ** GOTO lbl79
                                                        var10_11 = var7_8;
                                                        var10_11 = (rk2$b)var7_8;
                                                        var11_12 /* !! */  = var10_11.a;
                                                        var12_13 /* !! */  = Rv1.REFRESH;
                                                        if (var11_12 /* !! */  != var12_13 /* !! */ ) ** GOTO lbl79
                                                        var7_8 = this.c;
                                                        var16_17 = var10_11.b;
                                                        var5_5 = var10_11.c;
                                                        var8_9 = var10_11.d;
                                                        var11_12 /* !! */  = var10_11.e;
                                                        var12_13 /* !! */  = var10_11.f;
                                                        var10_11 = this.d;
                                                        var14_15 = var10_11.c;
                                                        this.a = 2;
                                                        var17_19 = 1;
                                                        var15_16 = this;
                                                        if ((var7_8 = Sl2.a((Sl2)var7_8, (List)var16_17, var5_5, var8_9, (boolean)var17_19, (Qv1)var11_12 /* !! */ , (Qv1)var12_13 /* !! */ , (z61)var14_15, this)) == var2_2) {
                                                            return var2_2;
                                                        }
                                                        break block36;
lbl79:
                                                        // 2 sources

                                                        if (var8_9 != 0) {
                                                            var7_8 = (Boolean)this.c.i.getValue();
                                                            var3_3 = (int)var7_8.booleanValue();
                                                            if (var3_3 == 0) break;
                                                            this.a = var3_3 = 3;
                                                            var7_8 = tr_1.b(this);
                                                            if (var7_8 != var2_2) break;
                                                            return var2_2;
                                                        }
                                                        break block37;
                                                    }
                                                }
                                                var7_8 = this.c;
                                                var9_10 = var7_8.c;
                                                var10_11 = this.b;
                                                var9_10 = var9_10.g((rk2_0)var10_11);
                                                this.a = var17_19 = 4;
                                                var7_8 = var7_8.c((Rl2)var9_10, this);
                                                if (var7_8 == var2_2) {
                                                    return var2_2;
                                                }
                                            }
                                            var7_8 = this.c.d;
                                            var9_10 = (rk2$b)this.b;
                                            var10_11 = var9_10.e;
                                            var9_10 = var9_10.f;
                                            var7_8.d((Qv1)var10_11, (Qv1)var9_10);
                                            var7_8 = (wZ)this.c.d.c.a.getValue();
                                            if (var7_8 != null) {
                                                var7_8 = var7_8.d;
                                            } else {
                                                var3_3 = 0;
                                                var7_8 = null;
                                            }
                                            if (var7_8 == null) break block38;
                                            var9_10 = var7_8.b;
                                            var8_9 = (int)var9_10.a;
                                            var7_8 = var7_8.c;
                                            var3_3 = (int)var7_8.a;
                                            var10_11 = (rk2$b)this.b;
                                            var11_12 /* !! */  = var10_11.a;
                                            var12_13 /* !! */  = Rv1.PREPEND;
                                            if (var11_12 /* !! */  == var12_13 /* !! */  && var8_9 != 0 || var11_12 /* !! */  == (var9_10 = Rv1.APPEND) && var3_3 != 0) {
                                                var3_3 = 0;
                                                var7_8 = null;
                                            } else {
                                                var3_3 = 1;
                                            }
                                            var9_10 = var10_11.b;
                                            var17_19 = var9_10 instanceof Collection;
                                            if (var17_19 == 0) break block39;
                                            var10_11 = var9_10;
                                            var10_11 = (Collection)var9_10;
                                            var17_19 = var10_11.isEmpty();
                                            if (var17_19 != 0) break block40;
                                        }
                                        var9_10 = ((Iterable)var9_10).iterator();
                                        while ((var17_19 = var9_10.hasNext()) != 0) {
                                            var10_11 = ((Wq3)var9_10.next()).b;
                                            var17_19 = var10_11.isEmpty();
                                            if (var17_19 != 0) continue;
                                            var4_4 = 0;
                                            var16_17 = null;
                                            break;
                                        }
                                    }
                                    if (var3_3 != 0) break block41;
                                    var7_8 = this.c;
                                    var7_8.g = false;
                                    break block36;
                                }
                                var7_8 = this.c;
                                var3_3 = (int)var7_8.g;
                                if (var3_3 == 0 && var4_4 == 0) break block36;
                                if (var4_4 != 0) ** GOTO lbl-1000
                                var7_8 = this.c;
                                var3_3 = var7_8.h;
                                var16_17 = this.c;
                                var9_10 = var16_17.c;
                                var8_9 = var9_10.c;
                                if (var3_3 < var8_9) ** GOTO lbl-1000
                                var3_3 = var16_17.h;
                                var16_17 = this.c;
                                var9_10 = var16_17.c;
                                var17_19 = var9_10.c;
                                var8_9 = var9_10.b;
                                if (var3_3 <= (var17_19 += var8_9)) {
                                    var16_17.g = false;
                                } else lbl-1000:
                                // 3 sources

                                {
                                    var7_8 = this.c;
                                    var16_17 = var7_8.b;
                                    if (var16_17 != null) {
                                        var6_6 = var7_8.c;
                                        var3_3 = var7_8.h;
                                        var7_8 = var6_6.d(var3_3);
                                        var16_17.a((re3_0)var7_8);
                                    }
                                }
                                break block36;
                            }
                            var16_18 = "PagingDataPresenter.combinedLoadStatesCollection.stateFlow should not hold null CombinedLoadStates after Insert event.".toString();
                            var7_8 = new IllegalStateException(var16_18);
                            throw var7_8;
                        }
                        var4_4 = var7_8 instanceof rk2$a;
                        if (var4_4 != 0) {
                            var7_8 = (Boolean)this.c.i.getValue();
                            var3_3 = (int)var7_8.booleanValue();
                            if (var3_3 != 0) {
                                this.a = var3_3 = 5;
                                var7_8 = tr_1.b(this);
                                if (var7_8 == var2_2) {
                                    return var2_2;
                                } else {
                                    ** GOTO lbl184
                                }
                            } else {
                                ** GOTO lbl184
                            }
                        }
                        break block42;
                    }
                    var7_8 = this.c;
                    var16_17 = var7_8.c;
                    var9_10 = this.b;
                    var16_17 = var16_17.g((rk2_0)var9_10);
                    this.a = var8_9 = 6;
                    var7_8 = var7_8.c((Rl2)var16_17, this);
                    if (var7_8 == var2_2) {
                        return var2_2;
                    }
                }
                var7_8 = this.c.d;
                var16_17 = ((rk2$a)this.b).a;
                var9_10 = Ov1$c.c;
                var7_8.getClass();
                Intrinsics.checkNotNullParameter(var16_17, "type");
                var10_11 = "state";
                Intrinsics.checkNotNullParameter(var9_10, (String)var10_11);
                var9_10 = new nr1_2((Rv1)var16_17, (mr1_1)var7_8);
                var7_8.c((Function1)var9_10);
                var7_8 = this.c;
                var7_8.g = false;
                break block36;
            }
            var4_4 = var7_8 instanceof rk2$c;
            if (var4_4 != 0) {
                var16_17 = this.c.d;
                var7_8 = (rk2$c)var7_8;
                var6_6 = var7_8.a;
                var7_8 = var7_8.b;
                var16_17.d((Qv1)var6_6, (Qv1)var7_8);
            }
        }
        var7_8 = this.b;
        var4_4 = var7_8 instanceof rk2$b;
        if (var4_4 != 0 || (var4_4 = var7_8 instanceof rk2$a) != 0 || (var3_3 = var7_8 instanceof rk2$d) != 0) {
            var7_8 = this.c.e.iterator();
            while ((var4_4 = var7_8.hasNext()) != 0) {
                var16_17 = (Function0)var7_8.next();
                var16_17.invoke();
            }
        }
        return Unit.a;
    }
}

