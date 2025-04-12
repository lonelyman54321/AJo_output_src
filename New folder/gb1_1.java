/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hyperlottie.LottieAnimation;

/*
 * Renamed from GB1
 */
public final class gb1_1
implements EC1 {
    public final /* synthetic */ yc1_1 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gb1_1(yc1_1 yc1_12, Object object, boolean bl2) {
        this.a = yc1_12;
        this.b = object;
        this.c = bl2;
    }

    public final void onResult(Object object) {
        boolean bl2 = this.c;
        object = (QB1)object;
        yc1_1 yc1_12 = this.a;
        Object object2 = this.b;
        LottieAnimation.a(yc1_12, object2, bl2, (QB1)object);
    }
}

