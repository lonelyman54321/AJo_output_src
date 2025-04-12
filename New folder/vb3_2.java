/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VB3
 */
public final class vb3_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ f c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;

    public /* synthetic */ vb3_2(LP1 lP1, LP1 lP12, ExoPlayer exoPlayer, boolean bl2, boolean bl3, int n3) {
        this.a = lP1;
        this.b = lP12;
        this.c = exoPlayer;
        this.d = bl2;
        this.e = bl3;
        this.f = n3;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        LP1 lP1 = this.a;
        Intrinsics.checkNotNullParameter(lP1, "$imgModifier");
        LP1 lP12 = this.b;
        Intrinsics.checkNotNullParameter(lP12, "$textModifier");
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$exoPlayer");
        int n3 = Me3.b(this.f | 1);
        boolean bl2 = this.e;
        Object object4 = object;
        object4 = (ExoPlayer)object;
        boolean bl3 = this.d;
        cc3_1.a(lP1, lP12, (ExoPlayer)object4, bl3, bl2, (b30_0)object3, n3);
        return Unit.a;
    }
}

