/*
 * Decompiled with CFR 0.152.
 */
package androidx.profileinstaller;

import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.profileinstaller.c$c;
import java.io.Serializable;

public final class ProfileInstallReceiver$a
implements c$c {
    public final /* synthetic */ ProfileInstallReceiver a;

    public ProfileInstallReceiver$a(ProfileInstallReceiver profileInstallReceiver) {
        this.a = profileInstallReceiver;
    }

    public final void a(int n3, Serializable serializable) {
        int n4 = 6;
        if (n3 == n4 || n3 == (n4 = 7) || n3 == (n4 = 8)) {
            serializable = (Throwable)serializable;
        }
        this.a.setResultCode(n3);
    }
}

