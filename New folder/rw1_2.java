/*
 * Decompiled with CFR 0.152.
 */
import in.juspay.hypersdk.analytics.LogPusherExp;
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from Rw1
 */
public final class rw1_2
implements FilenameFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ rw1_2(String string2) {
        this.a = string2;
    }

    public final boolean accept(File file, String string2) {
        return LogPusherExp.a(this.a, file, string2);
    }
}

