/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gC3
 */
public final class gc3_1
implements Function2 {
    public final /* synthetic */ f a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Pair d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ gc3_1(ExoPlayer exoPlayer, int n3, int n4, Pair pair, int n7, int n8) {
        this.a = exoPlayer;
        this.b = n3;
        this.c = n4;
        this.d = pair;
        this.e = n7;
        this.f = n8;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$exoPlayer");
        int n3 = Me3.b(this.e | 1);
        int n4 = this.f;
        Object object4 = object;
        object4 = (ExoPlayer)object;
        int n7 = this.b;
        int n8 = this.c;
        Pair pair = this.d;
        nc3_1.b((ExoPlayer)object4, n7, n8, pair, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

