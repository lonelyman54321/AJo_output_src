/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlendMode
 *  android.graphics.Canvas
 *  android.graphics.RenderNode
 */
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.RenderNode;

public final class G20 {
    public static /* bridge */ /* synthetic */ void a(Canvas canvas, BlendMode blendMode) {
        canvas.drawColor(0, blendMode);
    }

    public static /* bridge */ /* synthetic */ void b(RenderNode renderNode) {
        renderNode.setClipToBounds(false);
    }
}

