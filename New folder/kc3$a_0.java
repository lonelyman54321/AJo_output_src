/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$LongRef;

/*
 * Renamed from kC3$a
 */
public final class kc3$a_0
extends qg3_2
implements Function2 {
    public Ref$LongRef a;
    public Ref$LongRef b;
    public int c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ f e;
    public final /* synthetic */ tr1_0 f;
    public final /* synthetic */ tr1_0 g;

    public kc3$a_0(f80_0 f80_02, tr1_0 tr1_02, tr1_0 tr1_03, tr1_0 tr1_04, ExoPlayer exoPlayer) {
        this.d = tr1_02;
        this.e = exoPlayer;
        this.f = tr1_03;
        this.g = tr1_04;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Object object2 = this.e;
        f f5 = object2;
        f5 = (ExoPlayer)object2;
        tr1_0 tr1_02 = this.d;
        tr1_0 tr1_03 = this.f;
        tr1_0 tr1_04 = this.g;
        object2 = object;
        object = new kc3$a_0(f80_02, tr1_02, tr1_03, tr1_04, (ExoPlayer)f5);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (kc3$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((kc3$a_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        var2_2 = j90_0.COROUTINE_SUSPENDED;
        var3_3 = this.c;
        var4_4 = 2;
        var5_5 = 1;
        if (var3_3 != 0) {
            if (var3_3 != var5_5) {
                if (var3_3 == var4_4) {
                    var6_6 = this.b;
                    var7_7 = this.a;
                    vl2_2.b(var1_1);
lbl11:
                    // 2 sources

                    while (true) {
                        var1_1 = var7_7;
                        break block12;
                        break;
                    }
                }
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            var6_6 = this.b;
            var7_7 = this.a;
            vl2_2.b(var1_1);
        } else {
            block12: {
                vl2_2.b(var1_1);
                var1_1 = new Ref$LongRef();
                var6_6 = new Ref$LongRef();
            }
            var7_7 = ir0_2.a;
            var7_7 = bg1_1.a;
            var9_9 = false;
            var10_10 = null;
            var11_11 = (ExoPlayer)this.e;
            var8_8 = new kC3$a$a((Ref$LongRef)var1_1, (ExoPlayer)var11_11, var6_6, null);
            this.a = var1_1;
            this.b = var6_6;
            this.c = var5_5;
            var7_7 = Ae3.g(this, (CoroutineContext)var7_7, (Function2)var8_8);
            if (var7_7 == var2_2) {
                return var2_2;
            }
            var7_7 = var1_1;
        }
        var12_12 = var7_7.element;
        var14_13 = 0L;
        var16_14 = var12_12 == var14_13 ? 0 : (var12_12 < var14_13 ? -1 : 1);
        if (var16_14 > 0) {
            var17_15 = var6_6.element;
            var1_1 = nc3_1.c(var12_12 -= var17_15);
        } else {
            var1_1 = "";
        }
        var8_8 = this.d;
        var10_10 = var8_8.getValue();
        var9_9 = Intrinsics.areEqual(var1_1, var10_10);
        if (!var9_9) {
            var8_8.setValue(var1_1);
        }
        if ((var16_14 = (long)km_1.b((cp$a)(var1_1 = cp_1.Companion))) != false) {
            var1_1 = TimeUnit.MILLISECONDS;
            var12_12 = var6_6.element;
            var12_12 = var1_1.toSeconds(var12_12);
            var1_1 = this.f;
            var19_16 /* !! */  = (long)(var12_12 == var14_13 ? 0 : (var12_12 < var14_13 ? -1 : 1));
            if (var19_16 /* !! */  == false) {
                var11_11 = Boolean.FALSE;
                var1_1.setValue(var11_11);
            }
            if ((var19_16 /* !! */  = (cfr_temp_0 = var12_12 - (var14_13 = (long)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) >= 0 && (var16_14 = (long)(var1_1 = (Boolean)var1_1.getValue()).booleanValue()) == false) {
                var1_1 = Boolean.TRUE;
                var8_8 = this.g;
                var8_8.setValue(var1_1);
            }
        }
        this.a = var7_7;
        this.b = var6_6;
        this.c = var4_4;
        ** while ((var1_1 = bo0_2.a((long)(var12_12 = 500L), (f80_0)this)) != var2_2)
lbl67:
        // 1 sources

        return var2_2;
    }
}

