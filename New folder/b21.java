/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.clevertap.android.sdk.b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class b21
extends ly_0 {
    public b21() {
        super(false, null, 2);
    }

    public final rs0_1 a(InputStream object, HttpURLConnection object2, long l2) {
        boolean bl2;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "inputStream");
        Intrinsics.checkNotNullParameter(object2, "connection");
        com.clevertap.android.sdk.b.j();
        Object object4 = ((URLConnection)object2).getContentEncoding();
        if (object4 != null) {
            object3 = "gzip";
            bl2 = StringsKt.F((CharSequence)object4, (CharSequence)object3, false);
        } else {
            bl2 = false;
            object4 = null;
        }
        if (bl2) {
            int n3;
            int n4;
            object2 = new GZIPInputStream((InputStream)object);
            int n7 = 16384;
            object = new byte[n7];
            object4 = new ByteArrayOutputStream();
            while ((n4 = ((InputStream)object2).read((byte[])object)) != (n3 = -1)) {
                ((ByteArrayOutputStream)object4).write((byte[])object, 0, n4);
            }
            object = this.c;
            if (object != null) {
                ((ByteArrayOutputStream)object4).size();
                ((b)object).a();
            }
            object = ((ByteArrayOutputStream)object4).toByteArray();
            int n8 = ((Object)object).length;
            Bitmap bitmap = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n8);
            object = "bitmap";
            Intrinsics.checkNotNullExpressionValue(bitmap, (String)object);
            object2 = yz3_0.a;
            long l3 = System.currentTimeMillis() - l2;
            Intrinsics.checkNotNullParameter(bitmap, (String)object);
            rs0$a_0 rs0$a_0 = rs0$a_0.SUCCESS;
            object3 = object;
            object = new rs0_1(bitmap, rs0$a_0, l3, null);
            return object;
        }
        return super.a((InputStream)object, (HttpURLConnection)object2, l2);
    }
}

