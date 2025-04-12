/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 */
import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/*
 * Renamed from nL0
 */
public final class nl0_2
extends fw1 {
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    public final void c(Object object) {
        ((ParcelFileDescriptor)object).close();
    }

    public final Object f(ContentResolver object, Uri object2) {
        String string2 = "r";
        if ((object = object.openAssetFileDescriptor(object2, string2)) != null) {
            return object.getParcelFileDescriptor();
        }
        object2 = og3_1.a(object2, "FileDescriptor is null for: ");
        object = new FileNotFoundException((String)object2);
        throw object;
    }
}

