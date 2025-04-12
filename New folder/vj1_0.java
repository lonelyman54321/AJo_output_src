/*
 * Decompiled with CFR 0.152.
 */
import com.affise.attribution.storages.InternalEventsStorageImpl;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/*
 * Renamed from vj1
 */
public final class vj1_0
implements FilenameFilter {
    public final /* synthetic */ List a;

    public /* synthetic */ vj1_0(List list) {
        this.a = list;
    }

    public final boolean accept(File file, String string2) {
        return InternalEventsStorageImpl.a(this.a, file, string2);
    }
}

