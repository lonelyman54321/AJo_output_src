/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 */
import android.os.ParcelFileDescriptor;
import java.io.File;

/*
 * Renamed from yL0
 */
public final class yl0_1
implements xL0$d {
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    public final void b(Object object) {
        ((ParcelFileDescriptor)object).close();
    }

    public final Object c(File file) {
        return ParcelFileDescriptor.open((File)file, (int)0x10000000);
    }
}

