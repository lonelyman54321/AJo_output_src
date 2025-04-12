/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.storages.EventsStorageImpl;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public final class SB0
implements FilenameFilter {
    public final /* synthetic */ List a;

    public /* synthetic */ SB0(List list) {
        this.a = list;
    }

    public final boolean accept(File file, String string2) {
        return EventsStorageImpl.a(this.a, file, string2);
    }
}

