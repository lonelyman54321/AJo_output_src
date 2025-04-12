/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public final class ne1$b
implements ne1 {
    public final c a;
    public final Kp b;
    public final List c;

    public ne1$b(iH1 iH12, ArrayList object, Kp kp) {
        String string2 = "Argument must not be null";
        dV0.c(kp, string2);
        this.b = kp;
        dV0.c(object, string2);
        this.c = object;
        this.a = object = new c(iH12, kp);
    }

    public final Bitmap a(BitmapFactory.Options options) {
        hG2 hG22 = this.a.a;
        hG22.reset();
        return BitmapFactory.decodeStream((InputStream)hG22, null, (BitmapFactory.Options)options);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        hG2 hG22 = this.a.a;
        synchronized (hG22) {
            int n3;
            byte[] byArray = hG22.a;
            hG22.c = n3 = byArray.length;
            return;
        }
    }

    public final int c() {
        hG2 hG22 = this.a.a;
        hG22.reset();
        ArrayList arrayList = (ArrayList)this.c;
        Kp kp = this.b;
        return com.bumptech.glide.load.a.a(arrayList, hG22, kp);
    }

    public final ImageHeaderParser$ImageType d() {
        hG2 hG22 = this.a.a;
        hG22.reset();
        Kp kp = this.b;
        return com.bumptech.glide.load.a.b(this.c, hG22, kp);
    }
}

