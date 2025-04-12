/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class Jb1
implements Callable {
    public final /* synthetic */ HP2 a;
    public final /* synthetic */ Cb1 b;

    public Jb1(Cb1 cb1, HP2 hP2) {
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
        block14: {
            ArrayList<Object> arrayList;
            Object object = this.b.a;
            hP2 = this.a;
            int n3 = 0;
            String string2 = null;
            hP2 = Oh0.b((FP2)object, hP2, false);
            object = "id";
            try {
                int n4 = yf0.b((Cursor)hP2, (String)object);
                string2 = "requestDate";
                n3 = yf0.b((Cursor)hP2, string2);
                String string3 = "tookMs";
                int n7 = yf0.b((Cursor)hP2, string3);
                String string4 = "protocol";
                int n8 = yf0.b((Cursor)hP2, string4);
                String string5 = "method";
                int n10 = yf0.b((Cursor)hP2, string5);
                String string6 = "host";
                int n14 = yf0.b((Cursor)hP2, string6);
                String string7 = "path";
                int n15 = yf0.b((Cursor)hP2, string7);
                String string8 = "scheme";
                int n16 = yf0.b((Cursor)hP2, string8);
                String string9 = "responseCode";
                int n17 = yf0.b((Cursor)hP2, string9);
                String string10 = "requestPayloadSize";
                int n18 = yf0.b((Cursor)hP2, string10);
                String string11 = "responsePayloadSize";
                int n19 = yf0.b((Cursor)hP2, string11);
                String string12 = "error";
                int n20 = yf0.b((Cursor)hP2, string12);
                int n21 = hP2.getCount();
                arrayList = new ArrayList<Object>(n21);
                while ((n21 = (int)(hP2.moveToNext() ? 1 : 0)) != 0) {
                    Object object2;
                    Object object3;
                    Object object4;
                    Long l2;
                    Object object5;
                    Long l3;
                    long l4 = hP2.getLong(n4);
                    n21 = hP2.isNull(n3) ? 1 : 0;
                    if (n21 != 0) {
                        l3 = null;
                    } else {
                        long l7 = hP2.getLong(n3);
                        object5 = l7;
                        l3 = object5;
                    }
                    n21 = hP2.isNull(n7) ? 1 : 0;
                    if (n21 != 0) {
                        l2 = null;
                    } else {
                        long l8 = hP2.getLong(n7);
                        object5 = l8;
                        l2 = object5;
                    }
                    n21 = hP2.isNull(n8) ? 1 : 0;
                    if (n21 == 0) {
                        hP2.getString(n8);
                    }
                    n21 = hP2.isNull(n10) ? 1 : 0;
                    Object object6 = n21 != 0 ? null : (object5 = hP2.getString(n10));
                    n21 = hP2.isNull(n14) ? 1 : 0;
                    Object object7 = n21 != 0 ? null : (object5 = hP2.getString(n14));
                    n21 = hP2.isNull(n15) ? 1 : 0;
                    Object object8 = n21 != 0 ? null : (object5 = hP2.getString(n15));
                    n21 = hP2.isNull(n16) ? 1 : 0;
                    Object object9 = n21 != 0 ? null : (object5 = hP2.getString(n16));
                    n21 = hP2.isNull(n17) ? 1 : 0;
                    if (n21 != 0) {
                        object4 = null;
                    } else {
                        n21 = hP2.getInt(n17);
                        object4 = object5 = Integer.valueOf(n21);
                    }
                    n21 = hP2.isNull(n18) ? 1 : 0;
                    if (n21 != 0) {
                        object3 = null;
                    } else {
                        long l12 = hP2.getLong(n18);
                        object3 = object5 = Long.valueOf(l12);
                    }
                    n21 = hP2.isNull(n19) ? 1 : 0;
                    if (n21 != 0) {
                        object2 = null;
                    } else {
                        long l14 = hP2.getLong(n19);
                        object2 = object5 = Long.valueOf(l14);
                    }
                    n21 = hP2.isNull(n20) ? 1 : 0;
                    Object object10 = n21 != 0 ? null : (object5 = hP2.getString(n20));
                    object5 = new Mb1(l4, l3, l2, (String)object6, (String)object7, (String)object8, (String)object9, (Integer)object4, (Long)object3, (Long)object2, (String)object10);
                    arrayList.add(object5);
                }
            }
            catch (Throwable throwable2) {
                break block14;
            }
            hP2.close();
            return arrayList;
        }
        hP2.close();
        throw throwable2;
    }

    public final void finalize() {
        this.a.release();
    }
}

