/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory$Options
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Base64;

public final class Yx {
    public static /* bridge */ /* synthetic */ Bitmap.Config a(BitmapFactory.Options options) {
        return options.outConfig;
    }

    public static /* bridge */ /* synthetic */ String b(Base64.Encoder encoder, byte[] byArray) {
        return encoder.encodeToString(byArray);
    }
}

