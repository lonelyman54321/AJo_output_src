/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDrm$KeyRequest
 *  android.view.ViewStructure
 */
import android.media.MediaDrm;
import android.view.ViewStructure;

public final class Ls {
    public static /* bridge */ /* synthetic */ int a(MediaDrm.KeyRequest keyRequest) {
        return keyRequest.getRequestType();
    }

    public static /* bridge */ /* synthetic */ void b(ViewStructure viewStructure, int n3, String string2, String string3, String string4) {
        viewStructure.setId(n3, string2, string3, string4);
    }
}

