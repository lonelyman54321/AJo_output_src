/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.RenderNode
 */
import android.view.RenderNode;

public final class nJ2 {
    public static final nJ2 a;

    static {
        nJ2 nJ22;
        a = nJ22 = new Object();
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

