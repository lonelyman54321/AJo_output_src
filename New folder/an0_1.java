/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;
import com.ril.ajio.data.repo.NewPDPRepo;

/*
 * Renamed from AN0
 */
public final class an0_1
implements LibraryVersionComponent$VersionExtractor,
bx0_2 {
    public Object apply(Object object) {
        return NewPDPRepo.c((Throwable)object);
    }

    public String extract(Object object) {
        return FirebaseCommonRegistrar.b((Context)object);
    }
}

