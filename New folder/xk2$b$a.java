/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class xk2$b$a
extends qg3_2
implements hx0_2 {
    public int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ uZ d;
    public final /* synthetic */ x53_0 e;
    public final /* synthetic */ AR1 f;

    public xk2$b$a(x53_0 x53_02, f80_0 f80_02, AR1 aR1) {
        this.f = aR1;
        this.e = x53_02;
        super(4, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object3 = (uZ)((Object)object3);
        object4 = (f80_0)object4;
        x53_0 x53_02 = this.e;
        AR1 aR1 = this.f;
        xk2$b$a xk2$b$a = new xk2$b$a(x53_02, (f80_0)object4, aR1);
        xk2$b$a.b = object;
        xk2$b$a.c = object2;
        xk2$b$a.d = object3;
        object = Unit.a;
        return xk2$b$a.invokeSuspend(object);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block10: {
            block8: {
                block9: {
                    var2_2 = j90_0.COROUTINE_SUSPENDED;
                    var3_3 = this.a;
                    var4_4 = 1;
                    if (var3_3 == 0) break block8;
                    if (var3_3 != var4_4) break block9;
                    vl2_2.b(var1_1 /* !! */ );
                    break block10;
                }
                var1_1 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1 /* !! */ ;
            }
            vl2_2.b(var1_1 /* !! */ );
            var1_1 /* !! */  = this.b;
            var5_5 = this.c;
            var6_6 /* !! */  = this.d;
            var5_5 = (rk2_0)var5_5;
            var7_7 = var1_1 /* !! */ ;
            var7_7 = (Qv1)var1_1 /* !! */ ;
            var1_1 /* !! */  = uZ.RECEIVER;
            var8_8 /* !! */  = this.f;
            if (var6_6 /* !! */  == var1_1 /* !! */ ) ** GOTO lbl61
            var9_9 = var5_5 instanceof rk2$b;
            if (var9_9) {
                var5_5 = (rk2$b)var5_5;
                var1_1 /* !! */  = var5_5.e;
                var8_8 /* !! */ .b((Qv1)var1_1 /* !! */ );
                var10_10 = var5_5.a;
                Intrinsics.checkNotNullParameter((Object)var10_10, "loadType");
                var11_11 = var5_5.b;
                Intrinsics.checkNotNullParameter(var11_11, "pages");
                var12_12 = var5_5.e;
                Intrinsics.checkNotNullParameter(var12_12, "sourceLoadStates");
                var13_13 = var5_5.c;
                var14_14 = var5_5.d;
                var8_8 /* !! */  = var1_1 /* !! */ ;
                var1_1 /* !! */  = new rk2$b(var10_10, var11_11, var13_13, var14_14, var12_12, (Qv1)var7_7);
lbl37:
                // 2 sources

                while (true) {
                    var5_5 = var1_1 /* !! */ ;
                    break;
                }
            } else {
                var9_9 = var5_5 instanceof rk2$a;
                if (var9_9) {
                    var1_1 /* !! */  = var5_5;
                    var1_1 /* !! */  = ((rk2$a)var5_5).a;
                    var6_6 /* !! */  = Ov1$c.c;
                    var8_8 /* !! */ .c((Rv1)var1_1 /* !! */ , (Ov1)var6_6 /* !! */ );
                } else {
                    var9_9 = var5_5 instanceof rk2$c;
                    if (var9_9) {
                        var5_5 = (rk2$c)var5_5;
                        var1_1 /* !! */  = var5_5.a;
                        var8_8 /* !! */ .b((Qv1)var1_1 /* !! */ );
                        var5_5 = var5_5.a;
                        var1_1 /* !! */  = new rk2$c((Qv1)var5_5, (Qv1)var7_7);
                        ** continue;
                    }
                    var9_9 = var5_5 instanceof rk2$d;
                    if (var9_9) {
                        var1_1 /* !! */  = new IllegalStateException("Paging generated an event to display a static list that\n originated from a paginated source. If you see this\n exception, it is most likely a bug in the library.\n Please file a bug so we can fix it at:\n https://issuetracker.google.com/issues/new?component=413106");
                        throw var1_1 /* !! */ ;
                    }
                    var1_1 /* !! */  = new NoWhenBranchMatchedException();
                    throw var1_1 /* !! */ ;
lbl61:
                    // 1 sources

                    var1_1 /* !! */  = var8_8 /* !! */ .d();
                    var5_5 = new rk2$c((Qv1)var1_1 /* !! */ , (Qv1)var7_7);
                }
            }
            this.a = var4_4;
            var1_1 /* !! */  = this.e.o(this, var5_5);
            if (var1_1 /* !! */  == var2_2) {
                return var2_2;
            }
        }
        return Unit.a;
    }
}

