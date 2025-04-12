/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 */
import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/*
 * Renamed from ni0
 */
public final class ni0_2
extends Yv {
    public ti0_1 e;
    public byte[] f;
    public int g;
    public int h;

    public final long a(ti0_1 object) {
        this.n((ti0_1)object);
        this.e = object;
        Object object2 = ((ti0_1)object).a.normalizeScheme();
        Object object3 = object2.getScheme();
        String string2 = "data";
        int n3 = string2.equals(object3);
        String string3 = "Unsupported scheme: ";
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append((String)object3);
        object3 = stringBuilder.toString();
        ct3.b(n3 != 0, (String)object3);
        object3 = object2.getSchemeSpecificPart();
        n3 = gz3.a;
        object3 = object3.split(",", -1);
        n3 = ((String[])object3).length;
        stringBuilder = null;
        boolean bl2 = true;
        int n4 = 2;
        if (n3 == n4) {
            object2 = object3[bl2];
            string2 = ";base64";
            int n7 = (object3 = object3[0]).contains(string2);
            if (n7 != 0) {
                try {
                    object3 = Base64.decode((String)object2, (int)0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    object2 = kp1_0.c("Error while parsing Base64 encoded string: ", (String)object2);
                    object3 = new ParserException((String)object2, illegalArgumentException, bl2, 0);
                    throw object3;
                }
                this.f = (byte[])object3;
            } else {
                object3 = StandardCharsets.US_ASCII.name();
                object2 = URLDecoder.decode((String)object2, (String)object3);
                object3 = StandardCharsets.UTF_8;
                object2 = object2.getBytes((Charset)object3);
                this.f = (byte[])object2;
            }
            object2 = this.f;
            n7 = ((Uri)object2).length;
            long l2 = n7;
            long l3 = ((ti0_1)object).f;
            n4 = (int)(l3 == l2 ? 0 : (l3 < l2 ? -1 : 1));
            if (n4 <= 0) {
                int n8;
                this.g = n7 = (int)l3;
                this.h = n8 = ((Uri)object2).length - n7;
                l3 = ((ti0_1)object).g;
                l2 = -1;
                long l4 = l3 - l2;
                n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                if (n4 != 0) {
                    long l7 = Math.min((long)n8, l3);
                    this.h = n7 = (int)l7;
                }
                this.o((ti0_1)object);
                if (n4 == 0) {
                    int n10 = this.h;
                    l3 = n10;
                }
                return l3;
            }
            this.f = null;
            object = new DataSourceException(2008);
            throw object;
        }
        object = og3_1.a(object2, "Unexpected URI format: ");
        object2 = new ParserException((String)object, null, bl2, 0);
        throw object2;
    }

    public final void close() {
        byte[] byArray = this.f;
        if (byArray != null) {
            this.f = null;
            this.m();
        }
        this.e = null;
    }

    public final Uri k() {
        ti0_1 ti0_12 = this.e;
        ti0_12 = ti0_12 != null ? ti0_12.a : null;
        return ti0_12;
    }

    public final int read(byte[] byArray, int n3, int n4) {
        int n7;
        if (n4 == 0) {
            return 0;
        }
        int n8 = this.h;
        if (n8 == 0) {
            return -1;
        }
        n4 = Math.min(n4, n8);
        byte[] byArray2 = this.f;
        int n10 = gz3.a;
        n10 = this.g;
        System.arraycopy(byArray2, n10, byArray, n3, n4);
        this.g = n7 = this.g + n4;
        this.h = n7 = this.h - n4;
        this.l(n4);
        return n4;
    }
}

