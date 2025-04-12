/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class eF$a
implements ei0_0 {
    public final File a;

    public eF$a(File file) {
        this.a = file;
    }

    public final Class a() {
        return ByteBuffer.class;
    }

    public final void b() {
    }

    public final void cancel() {
    }

    public final void d(Az2 object, ei0$a ei0$a) {
        object = this.a;
        object = hf_0.a((File)object);
        try {
            ei0$a.f(object);
        }
        catch (IOException iOException) {
            String string2 = "ByteBufferFileLoader";
            int n3 = 3;
            Log.isLoggable((String)string2, (int)n3);
            ei0$a.c(iOException);
        }
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }
}

