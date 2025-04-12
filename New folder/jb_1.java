/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Media;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from jB
 */
public final class jb_1
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Media b;
    public final /* synthetic */ int c;

    public /* synthetic */ jb_1(int n3, Media media, int n4) {
        this.a = n3;
        this.b = media;
        this.c = n4;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        int n3 = Me3.b(this.c | 1);
        int n4 = this.a;
        Media media = this.b;
        lB.a(n4, media, (b30_0)object, n3);
        return Unit.a;
    }
}

