/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 */
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public final class tn {
    public static final /* synthetic */ int a;

    public static void a(InputConnection object, EditorInfo editorInfo, View view) {
        if (object != null && (object = editorInfo.hintText) == null) {
            boolean bl2;
            object = view.getParent();
            while (bl2 = object instanceof View) {
                bl2 = object instanceof JH3;
                if (bl2) {
                    object = ((JH3)object).a();
                    editorInfo.hintText = object;
                    break;
                }
                object = ((ViewParent)object).getParent();
            }
        }
    }
}

