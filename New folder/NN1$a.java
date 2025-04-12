/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 */
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class NN1$a
extends Lambda
implements Function1 {
    public static final NN1$a c;

    static {
        NN1$a nN1$a;
        c = nN1$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        if ((object = (Bitmap)object) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            int n3 = 100;
            object.compress(compressFormat, n3, (OutputStream)byteArrayOutputStream);
            object = byteArrayOutputStream.toByteArray();
        } else {
            object = null;
        }
        return object;
    }
}

