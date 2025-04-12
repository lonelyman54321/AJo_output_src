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

/*
 * Renamed from zs0
 */
public final class zs0_1
implements ek2_0 {
    public static final long c(float f5, float f6) {
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        return l3 & 0xFFFFFFFFL | (l2 <<= 32);
    }

    public cz0_0 a(Z92 z92) {
        return cz0_0.SOURCE;
    }

    public boolean b(Object object, File file, Z92 z92) {
        boolean bl2;
        object = (yz0_2)((wk2_0)object).get();
        object = ((yz0_2)object).a;
        object = ((yZ0$a)((Object)object)).a;
        object = ((DZ0)object).a;
        object = object.getData();
        object = ((ByteBuffer)object).asReadOnlyBuffer();
        try {
            hf_0.d((ByteBuffer)object, file);
            bl2 = true;
        }
        catch (IOException iOException) {
            int n3 = 5;
            Log.isLoggable((String)"GifEncoder", (int)n3);
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

