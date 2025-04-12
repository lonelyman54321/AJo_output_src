/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.system.Os
 */
import android.system.Os;
import java.io.FileDescriptor;

public final class xE0$a {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close((FileDescriptor)fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup((FileDescriptor)fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long l2, int n3) {
        return Os.lseek((FileDescriptor)fileDescriptor, (long)l2, (int)n3);
    }
}

