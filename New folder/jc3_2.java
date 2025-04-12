/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jC3
 */
public final class jc3_2
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ f c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ jc3_2(LP1 lP1, LP1 lP12, ExoPlayer exoPlayer, boolean bl2, int n3) {
        this.a = lP1;
        this.b = lP12;
        this.c = exoPlayer;
        this.d = bl2;
        this.e = n3;
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
        int n3 = Me3.b(this.e | 1);
        boolean bl2 = this.d;
        Object object4 = object;
        object4 = (ExoPlayer)object;
        nc3_1.a(lP1, lP12, (ExoPlayer)object4, bl2, (b30_0)object3, n3);
        return Unit.a;
    }
}

