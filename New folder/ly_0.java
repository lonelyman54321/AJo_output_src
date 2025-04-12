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
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ly
 */
public class ly_0 {
    public final boolean a;
    public final boolean b;
    public final b c;

    public ly_0(boolean bl2, b b2, int n3) {
        int n4 = n3 & 1;
        boolean bl3 = false;
        if (n4 != 0) {
            bl2 = false;
        }
        if ((n4 = n3 & 2) != 0) {
            bl3 = true;
        }
        if ((n3 &= 4) != 0) {
            b2 = null;
        }
        this.a = bl2;
        this.b = bl3;
        this.c = b2;
    }

    public rs0_1 a(InputStream inputStream, HttpURLConnection httpURLConnection, long l2) {
        int n3;
        int n4;
        ly_0 ly_02 = this;
        Object object = inputStream;
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(httpURLConnection, "connection");
        b b2 = this.c;
        if (b2 != null) {
            b2.a();
        }
        int n7 = 16384;
        Object object2 = new byte[n7];
        Object object3 = new ByteArrayOutputStream();
        int n8 = 0;
        Object object4 = null;
        while ((n4 = ((InputStream)object).read((byte[])object2)) != (n3 = -1)) {
            n8 += n4;
            ((ByteArrayOutputStream)object3).write((byte[])object2, 0, n4);
            if (b2 == null) continue;
            b2.a();
        }
        if (b2 != null) {
            b2.a();
        }
        byte[] byArray = ((ByteArrayOutputStream)object3).toByteArray();
        int n10 = httpURLConnection.getContentLength();
        object2 = "status";
        if (n10 != n3 && n10 != n8) {
            if (b2 != null) {
                object = httpURLConnection.getURL();
                Objects.toString(object);
                com.clevertap.android.sdk.b.e();
            }
            object4 = rs0$a_0.DOWNLOAD_FAILED;
            Intrinsics.checkNotNullParameter(object4, (String)object2);
            object3 = object;
            object = new rs0_1(null, (rs0$a_0)((Object)object4), -1, null);
            return object;
        }
        n10 = (int)(ly_02.b ? 1 : 0);
        if (n10 != 0) {
            n10 = byArray.length;
            Object object5 = BitmapFactory.decodeByteArray((byte[])byArray, (int)0, (int)n10);
            if (object5 != null) {
                object = yz3_0.a;
                long l3 = System.currentTimeMillis();
                long l4 = l3 - l2;
                n10 = (int)(ly_02.a ? 1 : 0);
                if (n10 == 0) {
                    byArray = null;
                }
                Intrinsics.checkNotNullParameter(object5, "bitmap");
                rs0$a_0 rs0$a_0 = rs0$a_0.SUCCESS;
                object4 = object;
                object = new rs0_1((Bitmap)object5, rs0$a_0, l4, byArray);
            } else {
                object = rs0$a_0.DOWNLOAD_FAILED;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                n8 = 0;
                object4 = null;
                long l7 = -1;
                b2 = object5;
                object2 = object;
                object5 = new rs0_1(null, (rs0$a_0)((Object)object), l7, null);
                object = object5;
            }
        } else {
            object = yz3_0.a;
            long l8 = System.currentTimeMillis();
            long l12 = l8 - l2;
            Intrinsics.checkNotNullExpressionValue(byArray, "dataReadFromStreamInByteArray");
            Intrinsics.checkNotNullParameter(byArray, "data");
            rs0$a_0 rs0$a_0 = rs0$a_0.SUCCESS;
            Object object6 = object;
            object = new rs0_1(null, rs0$a_0, l12, byArray);
        }
        return object;
    }
}

