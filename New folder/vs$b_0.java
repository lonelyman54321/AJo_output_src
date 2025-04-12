/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vs$b
 */
public final class vs$b_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ ExoPlayer a;
    public final /* synthetic */ String b;
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tr1_0 f;
    public final /* synthetic */ tr1_0 g;
    public final /* synthetic */ tr1_0 h;

    public vs$b_0(ExoPlayer exoPlayer, String string2, tr1_0 tr1_02, String string3, boolean bl2, tr1_0 tr1_03, tr1_0 tr1_04, tr1_0 tr1_05, f80_0 f80_02) {
        this.a = exoPlayer;
        this.b = string2;
        this.c = tr1_02;
        this.d = string3;
        this.e = bl2;
        this.f = tr1_03;
        this.g = tr1_04;
        this.h = tr1_05;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.g;
        tr1_0 tr1_03 = this.h;
        ExoPlayer exoPlayer = this.a;
        String string2 = this.b;
        tr1_0 tr1_04 = this.c;
        String string3 = this.d;
        boolean bl2 = this.e;
        tr1_0 tr1_05 = this.f;
        object = new vs$b_0(exoPlayer, string2, tr1_04, string3, bl2, tr1_05, tr1_02, tr1_03, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vs$b_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vs$b_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        var2_2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(var1_1);
        var1_1 = this.a;
        var3_3 = var1_1.getPlaybackState();
        var4_4 = 4 != 0;
        if (var3_3 == var4_4) {
            var5_5 = 0L;
            var1_1.seekTo(var5_5);
        }
        if ((var3_3 = (boolean)(var2_2 = (Boolean)this.f.getValue()).booleanValue()) || (var3_3 = (var2_2 = (Boolean)this.g.getValue()).booleanValue())) ** GOTO lbl-1000
        var2_2 = (Component)this.h.getValue();
        if (var2_2 != null) {
            var2_2 = var2_2.getUuid();
        } else {
            var3_3 = false;
            var2_2 = null;
        }
        var7_6 = this.b;
        var3_3 = Intrinsics.areEqual(var2_2, var7_6);
        if (!var3_3) ** GOTO lbl-1000
        var2_2 = (Subcomponent)this.c.getValue();
        if (var2_2 == null || (var2_2 = var2_2.getUuid()) == null) {
            var2_2 = "";
        }
        if ((var3_3 = Intrinsics.areEqual(var2_2, var7_6 = this.d)) && (var3_3 = this.e)) {
            var3_3 = true;
        } else lbl-1000:
        // 3 sources

        {
            var3_3 = false;
            var2_2 = null;
        }
        var1_1.setPlayWhenReady(var3_3);
        return Unit.a;
    }
}

