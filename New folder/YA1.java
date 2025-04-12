/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.storages.LogsStorageImpl;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public final class YA1
implements FilenameFilter {
    public final /* synthetic */ List a;

    public /* synthetic */ YA1(List list) {
        this.a = list;
    }

    public final boolean accept(File file, String string2) {
        return LogsStorageImpl.a(this.a, file, string2);
    }
}

