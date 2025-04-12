/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.system.Os
 */
import android.system.Os;
import java.io.FileDescriptor;

/*
 * Renamed from jY
 */
public final class jy_2 {
    public static /* bridge */ /* synthetic */ FileDescriptor a() {
        return Os.memfd_create((String)"temp.arsc", (int)0);
    }
}

