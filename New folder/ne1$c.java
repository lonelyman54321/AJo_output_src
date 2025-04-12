/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.os.ParcelFileDescriptor
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public final class ne1$c
implements ne1 {
    public final Kp a;
    public final List b;
    public final ParcelFileDescriptorRewinder c;

    public ne1$c(ParcelFileDescriptor parcelFileDescriptor, ArrayList object, Kp kp) {
        String string2 = "Argument must not be null";
        dV0.c(kp, string2);
        this.a = kp;
        dV0.c(object, string2);
        this.b = object;
        this.c = object = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
    }

    public final Bitmap a(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor((FileDescriptor)this.c.c().getFileDescriptor(), null, (BitmapFactory.Options)options);
    }

    public final void b() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c() {
        void var2_5;
        hG2 hG22;
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
        Kp kp = this.a;
        ArrayList arrayList = (ArrayList)this.b;
        int n3 = arrayList.size();
        int n4 = 0;
        while (true) {
            int n7;
            hG2 hG23;
            int n8 = -1;
            if (n4 >= n3) return n8;
            ImageHeaderParser imageHeaderParser = (ImageHeaderParser)arrayList.get(n4);
            hG22 = null;
            try {
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorRewinder.c();
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                hG23 = new hG2(fileInputStream, kp);
            }
            catch (Throwable throwable) {
                // empty catch block
                break;
            }
            try {
                n7 = imageHeaderParser.a(hG23, kp);
                hG23.release();
                parcelFileDescriptorRewinder.c();
            }
            catch (Throwable throwable) {
                hG22 = hG23;
                break;
            }
            if (n7 != n8) {
                return n7;
            }
            ++n4;
        }
        if (hG22 != null) {
            hG22.release();
        }
        parcelFileDescriptorRewinder.c();
        throw var2_5;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ImageHeaderParser$ImageType d() {
        void var2_5;
        Object object2;
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
        Kp kp = this.a;
        List list = this.b;
        int n3 = list.size();
        int i3 = 0;
        while (true) {
            hG2 hG22;
            if (i3 >= n3) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            Object object = (ImageHeaderParser)list.get(i3);
            object2 = null;
            try {
                Object object3 = parcelFileDescriptorRewinder.c();
                object3 = object3.getFileDescriptor();
                FileInputStream fileInputStream = new FileInputStream((FileDescriptor)object3);
                hG22 = new hG2(fileInputStream, kp);
            }
            catch (Throwable throwable) {
                // empty catch block
                break;
            }
            try {
                object = object.c(hG22);
                hG22.release();
                parcelFileDescriptorRewinder.c();
            }
            catch (Throwable throwable) {
                object2 = hG22;
                break;
            }
            object2 = ImageHeaderParser$ImageType.UNKNOWN;
            if (object != object2) {
                return object;
            }
            ++i3;
        }
        if (object2 != null) {
            object2.release();
        }
        parcelFileDescriptorRewinder.c();
        throw var2_5;
    }
}

