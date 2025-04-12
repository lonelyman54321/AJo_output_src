/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bs
 */
public final class bs_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ ExoPlayer b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tr1_0 f;

    public bs_1(String string2, ExoPlayer exoPlayer, boolean bl2, boolean bl3, boolean bl4, tr1_0 tr1_02, f80_0 f80_02) {
        this.a = string2;
        this.b = exoPlayer;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.f = tr1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.e;
        tr1_0 tr1_02 = this.f;
        String string2 = this.a;
        ExoPlayer exoPlayer = this.b;
        boolean bl3 = this.c;
        boolean bl4 = this.d;
        object = new bs_1(string2, exoPlayer, bl3, bl4, bl2, tr1_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bs_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bs_1)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block10: {
            block9: {
                block8: {
                    var2_2 = j90_0.COROUTINE_SUSPENDED;
                    vl2_2.b(var1_1);
                    var1_1 = this.f;
                    var2_2 = (Component)var1_1.getValue();
                    var3_3 = this.a;
                    var4_4 = this.b;
                    var5_5 = false;
                    var6_6 = null;
                    if (var2_2 == null) break block9;
                    var2_2 = (Component)var1_1.getValue();
                    if (var2_2 != null) {
                        var2_2 = var2_2.getUuid();
                    } else {
                        var7_7 = false;
                        var2_2 = null;
                    }
                    var7_7 = Intrinsics.areEqual(var2_2, var3_3);
                    if (!var7_7) break block9;
                    var7_7 = this.c;
                    if (!var7_7) ** GOTO lbl28
                    var2_2 = (Component)var1_1.getValue();
                    if (var2_2 != null && (var2_2 = var2_2.getSubcomponent()) != null) {
                        var2_2 = (Subcomponent)CollectionsKt.N(0, (List)var2_2);
                    } else {
                        while (true) {
                            var7_7 = false;
                            var2_2 = null;
                            break block8;
                            break;
                        }
lbl28:
                        // 1 sources

                        if ((var2_2 = (Component)var1_1.getValue()) == null || (var2_2 = var2_2.getSubcomponents()) == null) ** continue;
                        var2_2 = (Subcomponent)CollectionsKt.N(0, (List)var2_2);
                    }
                }
                var8_8 = this.d;
                var9_9 = "";
                if (!(var8_8 != false ? var2_2 == null || (var2_2 = var2_2.getPostMedia()) == null || (var2_2 = (Media)CollectionsKt.N(0, (List)var2_2)) == null || (var2_2 = var2_2.getUrl()) == null : var2_2 == null || (var2_2 = var2_2.getMedia()) == null || (var2_2 = var2_2.getUrl()) == null)) {
                    var9_9 = var2_2;
                }
                var2_2 = MediaItem.b((String)var9_9);
                var10_10 = "fromUri(...)";
                Intrinsics.checkNotNullExpressionValue(var2_2, var10_10);
                var4_4.setMediaItem((MediaItem)var2_2);
                var4_4.prepare();
                break block10;
            }
            var4_4.pause();
        }
        var1_1 = (Component)var1_1.getValue();
        if (var1_1 != null) {
            var6_6 = var1_1.getUuid();
        }
        if ((var11_11 = Intrinsics.areEqual(var6_6, var3_3)) && (var11_11 = this.e)) {
            var5_5 = true;
        }
        var4_4.setPlayWhenReady(var5_5);
        return Unit.a;
    }
}

