/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class O80
extends Lambda
implements Function2 {
    public final /* synthetic */ Sk3 c;
    public final /* synthetic */ Vt1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ ql3_0 h;
    public final /* synthetic */ i72 i;
    public final /* synthetic */ Vo0 j;
    public final /* synthetic */ int k;

    public O80(Sk3 sk3, Vt1 vt1, boolean bl2, boolean bl3, Function1 function1, ql3_0 ql3_02, i72 i722, Vo0 vo0, int n3) {
        this.c = sk3;
        this.d = vt1;
        this.e = bl2;
        this.f = bl3;
        this.g = function1;
        this.h = ql3_02;
        this.i = i722;
        this.j = vo0;
        this.k = n3;
        super(2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block9: {
            block8: {
                block7: {
                    var1_1 = (b30_0)var1_1;
                    var3_3 = (var2_2 /* !! */  = (Number)var2_2 /* !! */ ).intValue() & 3;
                    if (var3_3 != (var4_4 = 2) || (var3_3 = (int)var1_1.h()) == 0) break block7;
                    var1_1.D();
                    break block8;
                }
                var5_5 = this.j;
                var6_6 = this.k;
                var7_7 /* !! */  = this.d;
                var8_8 = this.g;
                var9_9 = this.h;
                var10_10 = this.i;
                var11_11 /* !! */  = var2_2 /* !! */ ;
                var2_2 /* !! */  = new N80(var7_7 /* !! */ , (Function1)var8_8, (ql3_0)var9_9, (i72)var10_10, var5_5, var6_6);
                var11_11 /* !! */  = LP1$a.b;
                var12_12 = var1_1.F();
                var8_8 = var1_1.m();
                var11_11 /* !! */  = a30_0.c((b30_0)var1_1, (LP1)var11_11 /* !! */ );
                N20.W.getClass();
                var9_9 = N20$a.b;
                var10_10 = var1_1.i();
                var13_13 = var10_10 instanceof mp;
                if (!var13_13) break block9;
                var1_1.A();
                var13_13 = var1_1.e();
                if (var13_13) {
                    var1_1.C((Function0)var9_9);
                } else {
                    var1_1.n();
                }
                var9_9 = N20$a.e;
                Ow3.a((b30_0)var1_1, var2_2 /* !! */ , (Function2)var9_9);
                var2_2 /* !! */  = N20$a.d;
                Ow3.a((b30_0)var1_1, var8_8, (Function2)var2_2 /* !! */ );
                var2_2 /* !! */  = N20$a.f;
                var14_14 = var1_1.e();
                if (var14_14 || !(var14_14 = Intrinsics.areEqual(var8_8 = var1_1.v(), var9_9 = Integer.valueOf(var12_12)))) {
                    re0_0.a(var12_12, (b30_0)var1_1, var12_12, (N20$a$a)var2_2 /* !! */ );
                }
                var2_2 /* !! */  = N20$a.c;
                Ow3.a((b30_0)var1_1, var11_11 /* !! */ , (Function2)var2_2 /* !! */ );
                var1_1.p();
                var2_2 /* !! */  = this.d;
                var11_11 /* !! */  = var2_2 /* !! */ .a();
                var7_7 /* !! */  = x21_0.None;
                var14_14 = this.e;
                var9_9 = null;
                if (var11_11 /* !! */  == var7_7 /* !! */  || (var11_11 /* !! */  = var2_2 /* !! */ .c()) == null) ** GOTO lbl-1000
                var11_11 /* !! */  = var2_2 /* !! */ .c();
                Intrinsics.checkNotNull(var11_11 /* !! */ );
                var4_4 = var11_11 /* !! */ .e();
                if (var4_4 != 0 && var14_14) {
                    var4_4 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var4_4 = 0;
                    var11_11 /* !! */  = null;
                }
                var7_7 /* !! */  = this.c;
                o90.d((Sk3)var7_7 /* !! */ , (boolean)var4_4, (b30_0)var1_1, 0);
                var2_2 /* !! */  = var2_2 /* !! */ .a();
                var11_11 /* !! */  = x21_0.Cursor;
                if (var2_2 /* !! */  == var11_11 /* !! */  && (var3_3 = (int)this.f) == 0 && var14_14) {
                    var3_3 = -2032274;
                    var1_1.K(var3_3);
                    o90.c((Sk3)var7_7 /* !! */ , (b30_0)var1_1, 0);
                    var1_1.E();
                } else {
                    var3_3 = -1955394;
                    var1_1.K(var3_3);
                    var1_1.E();
                }
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

