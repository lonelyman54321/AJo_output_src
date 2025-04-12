/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputContentInfo
 */
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/*
 * Renamed from S52
 */
public class s52_0
extends Q52 {
    public final boolean commitContent(InputContentInfo inputContentInfo, int n3, Bundle bundle) {
        boolean bl2;
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            bl2 = R52.a(inputConnection, inputContentInfo, n3, bundle);
        } else {
            bl2 = false;
            inputContentInfo = null;
        }
        return bl2;
    }
}

