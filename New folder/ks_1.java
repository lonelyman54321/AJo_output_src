/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from ks
 */
public final class ks_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ExoPlayer c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ tr1_0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ tr1_0 g;
    public final /* synthetic */ tr1_0 h;

    public ks_1(String string2, String string3, ExoPlayer exoPlayer, Ref$ObjectRef ref$ObjectRef, tr1_0 tr1_02, boolean bl2, tr1_0 tr1_03, tr1_0 tr1_04, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = exoPlayer;
        this.d = ref$ObjectRef;
        this.e = tr1_02;
        this.f = bl2;
        this.g = tr1_03;
        this.h = tr1_04;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.g;
        tr1_0 tr1_03 = this.h;
        String string2 = this.a;
        String string3 = this.b;
        ExoPlayer exoPlayer = this.c;
        Ref$ObjectRef ref$ObjectRef = this.d;
        tr1_0 tr1_04 = this.e;
        boolean bl2 = this.f;
        object = new ks_1(string2, string3, exoPlayer, ref$ObjectRef, tr1_04, bl2, tr1_02, tr1_03, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ks_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ks_1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        var2_2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(var1_1);
        var1_1 = this.g;
        var2_2 = (Subcomponent)var1_1.getValue();
        var3_3 = this.b;
        var4_4 = null;
        var5_5 = this.c;
        if (var2_2 == null) ** GOTO lbl-1000
        var2_2 = (Component)this.h.getValue();
        if (var2_2 != null) {
            var2_2 = var2_2.getUuid();
        } else {
            var6_6 = false;
            var2_2 = null;
        }
        var7_7 = this.a;
        var6_6 = Intrinsics.areEqual(var2_2, var7_7);
        if (!var6_6) ** GOTO lbl-1000
        var2_2 = (Subcomponent)var1_1.getValue();
        var7_7 = "";
        if (var2_2 == null || (var2_2 = var2_2.getUuid()) == null) {
            var2_2 = var7_7;
        }
        if (var6_6 = Intrinsics.areEqual(var2_2, var3_3)) {
            var2_2 = (Subcomponent)var1_1.getValue();
            if (var2_2 != null && (var2_2 = var2_2.getMedia()) != null) {
                var2_2 = var2_2.getRedirectionUrl();
            } else {
                var6_6 = false;
                var2_2 = null;
            }
            var8_8 = this.d;
            var9_9 = var8_8.element;
            var6_6 = Intrinsics.areEqual(var2_2, var9_9);
            if (!var6_6) {
                if ((var1_1 = (Subcomponent)var1_1.getValue()) != null && (var1_1 = var1_1.getMedia()) != null && (var1_1 = var1_1.getRedirectionUrl()) != null) {
                    var7_7 = var1_1;
                }
                var8_8.element = var7_7;
                var1_1 = MediaItem.b((String)var8_8.element);
                var5_5.setMediaItem((MediaItem)var1_1);
                var5_5.prepare();
            }
        } else lbl-1000:
        // 3 sources

        {
            var5_5.pause();
        }
        if ((var1_1 = (Subcomponent)this.e.getValue()) != null) {
            var4_4 = var1_1.getUuid();
        }
        if ((var10_10 = Intrinsics.areEqual(var4_4, var3_3)) && (var10_10 = this.f)) {
            var10_10 = true;
        } else {
            var10_10 = false;
            var1_1 = null;
        }
        var5_5.setPlayWhenReady(var10_10);
        return Unit.a;
    }
}

