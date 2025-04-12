/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cs
 */
public final class cs_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ tr1_0 e;

    public cs_1(ft1_2 ft1_22, String string2, ExoPlayer exoPlayer, boolean bl2, tr1_0 tr1_02, f80_0 f80_02) {
        this.a = ft1_22;
        this.b = string2;
        this.c = exoPlayer;
        this.d = bl2;
        this.e = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.d;
        tr1_0 tr1_02 = this.e;
        ft1_2 ft1_22 = this.a;
        String string2 = this.b;
        ExoPlayer exoPlayer = this.c;
        object = new cs_1(ft1_22, string2, exoPlayer, bl2, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cs_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cs_1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        var2_2 /* !! */  = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(var1_1);
        var1_1 = this.a;
        var3_3 = var1_1.b();
        var2_2 /* !! */  = this.b;
        var4_4 = null;
        var5_5 = this.e;
        var6_6 = this.c;
        if (var3_3) {
            var7_7 = (Component)var5_5.getValue();
            if (var7_7 != null) {
                var7_7 = var7_7.getUuid();
            } else {
                var8_8 = 0;
                var7_7 = null;
            }
            var8_8 = (int)Intrinsics.areEqual(var7_7, (Object)var2_2 /* !! */ );
            if (var8_8 == 0) {
                var6_6.pause();
            }
        }
        if ((var8_8 = var6_6.getPlaybackState()) == (var9_9 = 4)) {
            var10_10 = 0L;
            var6_6.seekTo(var10_10);
        }
        if (var3_3) ** GOTO lbl-1000
        var1_1 = (Component)var5_5.getValue();
        if (var1_1 != null) {
            var4_4 = var1_1.getUuid();
        }
        if ((var3_3 = Intrinsics.areEqual(var4_4, (Object)var2_2 /* !! */ )) && (var3_3 = this.d)) {
            var3_3 = true;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = false;
            var1_1 = null;
        }
        var6_6.setPlayWhenReady(var3_3);
        return Unit.a;
    }
}

