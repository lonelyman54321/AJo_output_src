/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.res.AssetFileDescriptor
 *  android.net.Uri
 */
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/*
 * Renamed from cq
 */
public final class cq_1
extends fw1 {
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    public final void c(Object object) {
        ((AssetFileDescriptor)object).close();
    }

    public final Object f(ContentResolver object, Uri object2) {
        String string2 = "r";
        if ((object = object.openAssetFileDescriptor(object2, string2)) != null) {
            return object;
        }
        object2 = og3_1.a(object2, "FileDescriptor is null for: ");
        object = new FileNotFoundException((String)object2);
        throw object;
    }
}

