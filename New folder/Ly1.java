/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.internal.Intrinsics;

public final class Ly1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Ly1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.g((NativeAdViewRenderer)this.b);
                return;
            }
            case 0: 
        }
        ry1_1 ry1_12 = (ry1_1)this.b;
        Intrinsics.checkNotNullParameter(ry1_12, "this$0");
        ry1_12.Pa();
    }
}

