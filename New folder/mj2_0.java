/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.RenderNode
 */
import android.view.RenderNode;

/*
 * Renamed from mJ2
 */
public final class mj2_0 {
    public static final mj2_0 a;

    static {
        mj2_0 mj2_02;
        a = mj2_02 = new Object();
    }

    public final int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int n3) {
        renderNode.setAmbientShadowColor(n3);
    }

    public final void d(RenderNode renderNode, int n3) {
        renderNode.setSpotShadowColor(n3);
    }
}

