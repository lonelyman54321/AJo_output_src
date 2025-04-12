/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 */
import android.graphics.BitmapFactory;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class NN1$c
extends Lambda
implements Function1 {
    public static final NN1$c c;

    static {
        NN1$c nN1$c;
        c = nN1$c = new Lambda(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        if ((object = (File)object) == null) return null;
        int n3 = ((File)object).exists();
        if (n3 == 0) return null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        String string2 = ((File)object).getPath();
        BitmapFactory.decodeFile((String)string2, (BitmapFactory.Options)options);
        int n4 = options.outWidth;
        int n7 = -1;
        if (n4 == n7) return null;
        n3 = options.outHeight;
        if (n3 == n7) return null;
        return BitmapFactory.decodeFile((String)((File)object).getAbsolutePath());
    }
}

