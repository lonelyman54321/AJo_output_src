/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent$VersionExtractor;
import java.nio.ByteBuffer;

/*
 * Renamed from U60
 */
public final class u60_0
implements LibraryVersionComponent$VersionExtractor {
    public static long a(W60 object) {
        long l2;
        object = ((zl0_0)object).b;
        String string2 = "exo_len";
        if ((object = (Object)((byte[])object.get(string2))) != null) {
            object = ByteBuffer.wrap((byte[])object);
            l2 = ((ByteBuffer)object).getLong();
        } else {
            l2 = -1;
        }
        return l2;
    }

    public String extract(Object object) {
        return FirebaseCommonRegistrar.a((Context)object);
    }
}

