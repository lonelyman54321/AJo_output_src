/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.RecordingCanvas
 *  android.graphics.RenderNode
 *  android.view.View
 */
import android.graphics.Matrix;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.view.View;

public final class FJ {
    public static /* bridge */ /* synthetic */ RecordingCanvas a(RenderNode renderNode) {
        return renderNode.beginRecording();
    }

    public static /* bridge */ /* synthetic */ void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}

