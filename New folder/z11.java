/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RenderNode
 *  android.graphics.drawable.Drawable
 *  android.widget.EditText
 */
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.widget.EditText;

public final class z11 {
    public static /* bridge */ /* synthetic */ Drawable a(EditText editText) {
        return editText.getTextCursorDrawable();
    }

    public static /* bridge */ /* synthetic */ void b(RenderNode renderNode, float f5) {
        renderNode.setRotationZ(f5);
    }
}

