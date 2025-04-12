/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;

/*
 * Renamed from eM0
 */
public final class em0_0
implements FilenameFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ em0_0(String string2) {
        this.a = string2;
    }

    public final boolean accept(File file, String string2) {
        return FileStore.a(this.a, file, string2);
    }
}

