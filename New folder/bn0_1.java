/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;

/*
 * Renamed from BN0
 */
public final class bn0_1
implements LibraryVersionComponent$VersionExtractor {
    public final String extract(Object object) {
        return FirebaseCommonRegistrar.d((Context)object);
    }
}

