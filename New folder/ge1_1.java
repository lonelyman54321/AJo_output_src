/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import com.ril.ajio.customviews.widgets.ImageUploadWidget;

/*
 * Renamed from Ge1
 */
public final class ge1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ge1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.h((NativeAdViewRenderer)this.b);
                return;
            }
            case 0: 
        }
        ImageUploadWidget.a((ImageUploadWidget)((Object)this.b));
    }
}

