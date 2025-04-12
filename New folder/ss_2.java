/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ss
 */
public final class ss_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ss_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Integer)object;
                int n4 = (Integer)object;
                p83_0 p83_02 = (p83_0)this.b;
                if (p83_02 == null || (object = (Component)CollectionsKt.N(n4, p83_02)) == null || (object = ((Component)object).getUuid()) == null) {
                    object = "";
                }
                return object;
            }
            case 0: 
        }
        object = (Dr0)object;
        ExoPlayer exoPlayer = (ExoPlayer)this.b;
        Intrinsics.checkNotNullParameter(exoPlayer, "$exoPlayer");
        Intrinsics.checkNotNullParameter(object, "$this$DisposableEffect");
        object = new vs$j(exoPlayer);
        return object;
    }
}

