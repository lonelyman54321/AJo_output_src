/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.concurrent.Callable;

public final class Bb1
implements Callable {
    public final /* synthetic */ HP2 a;
    public final /* synthetic */ Cb1 b;

    public Bb1(Cb1 cb1, HP2 hP2) {
        this.b = cb1;
        this.a = hP2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Throwable throwable2;
        HP2 hP2;
        block34: {
            Object object;
            block33: {
                Object object2 = this;
                Object object3 = this.b.a;
                hP2 = this.a;
                int n3 = 0;
                String string2 = null;
                hP2 = Oh0.b((FP2)object3, hP2, false);
                object3 = "id";
                try {
                    Object object4;
                    Object object5;
                    Object object6;
                    Object object7;
                    Object object8;
                    Object object9;
                    Object object10;
                    boolean bl2;
                    Object object11;
                    Object object12;
                    Object object13;
                    Object object14;
                    Object object15;
                    long l2;
                    Object object16;
                    Object object17;
                    int n4;
                    int n7 = yf0.b((Cursor)hP2, (String)object3);
                    String string3 = "requestDate";
                    int n8 = yf0.b((Cursor)hP2, string3);
                    String string4 = "responseDate";
                    int n10 = yf0.b((Cursor)hP2, string4);
                    String string5 = "tookMs";
                    int n14 = yf0.b((Cursor)hP2, string5);
                    String string6 = "protocol";
                    int n15 = yf0.b((Cursor)hP2, string6);
                    String string7 = "method";
                    int n16 = yf0.b((Cursor)hP2, string7);
                    String string8 = "url";
                    int n17 = yf0.b((Cursor)hP2, string8);
                    String string9 = "host";
                    int n18 = yf0.b((Cursor)hP2, string9);
                    String string10 = "path";
                    int n19 = yf0.b((Cursor)hP2, string10);
                    String string11 = "scheme";
                    int n20 = yf0.b((Cursor)hP2, string11);
                    String string12 = "responseTlsVersion";
                    int n21 = yf0.b((Cursor)hP2, string12);
                    String string13 = "responseCipherSuite";
                    int n22 = yf0.b((Cursor)hP2, string13);
                    String string14 = "requestPayloadSize";
                    int n24 = yf0.b((Cursor)hP2, string14);
                    string2 = "requestContentType";
                    n3 = yf0.b((Cursor)hP2, string2);
                    object2 = "requestHeaders";
                    int n25 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "requestBody";
                    int n26 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "isRequestBodyPlainText";
                    int n27 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "responseCode";
                    int n28 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "responseMessage";
                    int n29 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "error";
                    int n30 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "responsePayloadSize";
                    int n32 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "responseContentType";
                    int n34 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "responseHeaders";
                    int n35 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "responseBody";
                    int n36 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "isResponseBodyPlainText";
                    int n37 = n4 = yf0.b((Cursor)hP2, (String)object2);
                    object2 = "responseImageData";
                    n4 = yf0.b((Cursor)hP2, (String)object2);
                    boolean bl3 = hP2.moveToFirst();
                    object = null;
                    if (!bl3) break block33;
                    long l3 = hP2.getLong(n7);
                    n7 = hP2.isNull(n8) ? 1 : 0;
                    if (n7 != 0) {
                        object17 = null;
                    } else {
                        long l4 = hP2.getLong(n8);
                        object17 = object3 = Long.valueOf(l4);
                    }
                    n7 = hP2.isNull(n10) ? 1 : 0;
                    if (n7 != 0) {
                        object16 = null;
                    } else {
                        l2 = hP2.getLong(n10);
                        object16 = object3 = Long.valueOf(l2);
                    }
                    n7 = hP2.isNull(n14) ? 1 : 0;
                    if (n7 != 0) {
                        object15 = null;
                    } else {
                        l2 = hP2.getLong(n14);
                        object15 = object3 = Long.valueOf(l2);
                    }
                    n7 = hP2.isNull(n15) ? 1 : 0;
                    Object object18 = n7 != 0 ? null : (object3 = hP2.getString(n15));
                    n7 = hP2.isNull(n16) ? 1 : 0;
                    Object object19 = n7 != 0 ? null : (object3 = hP2.getString(n16));
                    n7 = hP2.isNull(n17) ? 1 : 0;
                    Object object20 = n7 != 0 ? null : (object3 = hP2.getString(n17));
                    n7 = hP2.isNull(n18) ? 1 : 0;
                    Object object21 = n7 != 0 ? null : (object3 = hP2.getString(n18));
                    n7 = hP2.isNull(n19) ? 1 : 0;
                    Object object22 = n7 != 0 ? null : (object3 = hP2.getString(n19));
                    n7 = hP2.isNull(n20) ? 1 : 0;
                    Object object23 = n7 != 0 ? null : (object3 = hP2.getString(n20));
                    n7 = hP2.isNull(n21) ? 1 : 0;
                    Object object24 = n7 != 0 ? null : (object3 = hP2.getString(n21));
                    n7 = hP2.isNull(n22) ? 1 : 0;
                    Object object25 = n7 != 0 ? null : (object3 = hP2.getString(n22));
                    n7 = hP2.isNull(n24) ? 1 : 0;
                    if (n7 != 0) {
                        object14 = null;
                    } else {
                        l2 = hP2.getLong(n24);
                        object14 = object3 = Long.valueOf(l2);
                    }
                    n7 = hP2.isNull(n3) ? 1 : 0;
                    if (n7 != 0) {
                        n7 = n25;
                        object13 = null;
                    } else {
                        object13 = object3 = hP2.getString(n3);
                        n7 = n25;
                    }
                    n3 = hP2.isNull(n7) ? 1 : 0;
                    if (n3 != 0) {
                        n7 = n26;
                        object12 = null;
                    } else {
                        object12 = object3 = hP2.getString(n7);
                        n7 = n26;
                    }
                    n3 = hP2.isNull(n7) ? 1 : 0;
                    if (n3 != 0) {
                        n7 = n27;
                        object11 = null;
                    } else {
                        object11 = object3 = hP2.getString(n7);
                        n7 = n27;
                    }
                    n7 = hP2.getInt(n7);
                    n3 = 1;
                    if (n7 != 0) {
                        n7 = n28;
                        bl2 = true;
                    } else {
                        n7 = n28;
                        bl2 = false;
                    }
                    n8 = hP2.isNull(n7) ? 1 : 0;
                    if (n8 != 0) {
                        n7 = n29;
                        object10 = null;
                    } else {
                        n7 = hP2.getInt(n7);
                        object10 = object3 = Integer.valueOf(n7);
                        n7 = n29;
                    }
                    n8 = hP2.isNull(n7) ? 1 : 0;
                    if (n8 != 0) {
                        n7 = n30;
                        object9 = null;
                    } else {
                        object9 = object3 = hP2.getString(n7);
                        n7 = n30;
                    }
                    n8 = hP2.isNull(n7) ? 1 : 0;
                    if (n8 != 0) {
                        n7 = n32;
                        object8 = null;
                    } else {
                        object8 = object3 = hP2.getString(n7);
                        n7 = n32;
                    }
                    n8 = hP2.isNull(n7) ? 1 : 0;
                    if (n8 != 0) {
                        n7 = n34;
                        object7 = null;
                    } else {
                        l2 = hP2.getLong(n7);
                        object7 = object3 = Long.valueOf(l2);
                        n7 = n34;
                    }
                    n8 = hP2.isNull(n7) ? 1 : 0;
                    if (n8 != 0) {
                        n7 = n35;
                        object6 = null;
                    } else {
                        object6 = object3 = hP2.getString(n7);
                        n7 = n35;
                    }
                    n8 = hP2.isNull(n7) ? 1 : 0;
                    if (n8 != 0) {
                        n7 = n36;
                        object5 = null;
                    } else {
                        object5 = object3 = hP2.getString(n7);
                        n7 = n36;
                    }
                    n8 = hP2.isNull(n7) ? 1 : 0;
                    if (n8 != 0) {
                        n7 = n37;
                        object4 = null;
                    } else {
                        object4 = object3 = hP2.getString(n7);
                        n7 = n37;
                    }
                    n7 = hP2.getInt(n7);
                    boolean bl4 = n7 != 0;
                    n7 = hP2.isNull(n4) ? 1 : 0;
                    if (n7 == 0) {
                        object = hP2.getBlob(n4);
                    }
                    byte[] byArray = object;
                    object = new HttpTransaction;
                    object(l3, (Long)object17, (Long)object16, (Long)object15, (String)object18, (String)object19, (String)object20, (String)object21, (String)object22, (String)object23, (String)object24, (String)object25, (Long)object14, (String)object13, (String)object12, (String)object11, bl2, (Integer)object10, (String)object9, (String)object8, (Long)object7, (String)object6, (String)object5, (String)object4, bl4, byArray);
                }
                catch (Throwable throwable2) {
                    break block34;
                }
            }
            hP2.close();
            return object;
        }
        hP2.close();
        throw throwable2;
    }

    public final void finalize() {
        this.a.release();
    }
}

