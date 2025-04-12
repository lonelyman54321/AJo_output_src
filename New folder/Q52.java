/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.inputmethod.InputConnection
 */
import android.os.Handler;
import android.view.inputmethod.InputConnection;

public class Q52
extends M52 {
    public final void b(InputConnection inputConnection) {
        P52.a(inputConnection);
    }

    public final boolean deleteSurroundingTextInCodePoints(int n3, int n4) {
        InputConnection inputConnection = this.b;
        n3 = inputConnection != null ? (int)(N52.a(inputConnection, n3, n4) ? 1 : 0) : 0;
        return n3 != 0;
    }

    public final Handler getHandler() {
        Object object = this.b;
        object = object != null ? O52.a(object) : null;
        return object;
    }
}

