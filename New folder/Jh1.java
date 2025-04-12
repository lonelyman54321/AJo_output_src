/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputConnectionWrapper
 *  android.view.inputmethod.InputContentInfo
 */
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class Jh1
extends InputConnectionWrapper {
    public final /* synthetic */ ih1_0 a;

    public Jh1(InputConnection inputConnection, ih1_0 ih1_02) {
        this.a = ih1_02;
        super(inputConnection, false);
    }

    public final boolean commitContent(InputContentInfo inputContentInfo, int n3, Bundle bundle) {
        Object object;
        int n4;
        int n7;
        boolean bl2 = false;
        Lh1 lh1 = null;
        if (inputContentInfo != null && (n7 = Build.VERSION.SDK_INT) >= (n4 = 25)) {
            object = new Lh1$a(inputContentInfo);
            lh1 = new Lh1((Lh1$a)object);
        }
        if (bl2 = ((ih1_0)(object = this.a)).a(lh1, n3, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, n3, bundle);
    }
}

