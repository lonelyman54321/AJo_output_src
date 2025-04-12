/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import com.google.common.base.Supplier;

public final class Km0
implements Supplier {
    public final Object get() {
        byte[] byArray = new byte[12];
        Lm0.i.nextBytes(byArray);
        return Base64.encodeToString((byte[])byArray, (int)10);
    }
}

