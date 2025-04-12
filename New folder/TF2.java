/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class TF2
implements Callable {
    public final /* synthetic */ HP2 a;
    public final /* synthetic */ SF2 b;

    public TF2(SF2 sF2, HP2 hP2) {
        this.b = sF2;
        this.a = hP2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Throwable throwable2;
        FP2 fP2;
        block12: {
            ArrayList<WF2> arrayList;
            fP2 = this.b.a;
            Object object = this.a;
            int n3 = 0;
            String string2 = null;
            fP2 = Oh0.b(fP2, (ag3_0)object, false);
            object = "id";
            try {
                int n4 = yf0.b((Cursor)fP2, (String)object);
                string2 = "tag";
                n3 = yf0.b((Cursor)fP2, string2);
                String string3 = "date";
                int n7 = yf0.b((Cursor)fP2, string3);
                String string4 = "clazz";
                int n8 = yf0.b((Cursor)fP2, string4);
                String string5 = "message";
                int n10 = yf0.b((Cursor)fP2, string5);
                int n14 = fP2.getCount();
                arrayList = new ArrayList<WF2>(n14);
                while ((n14 = (int)(fP2.moveToNext() ? 1 : 0)) != 0) {
                    String string6;
                    Long l2;
                    String string7;
                    Long l3;
                    n14 = fP2.isNull(n4) ? 1 : 0;
                    String string8 = null;
                    if (n14 != 0) {
                        n14 = 0;
                        l3 = null;
                    } else {
                        long l4 = fP2.getLong(n4);
                        l3 = l4;
                    }
                    boolean bl2 = fP2.isNull(n3);
                    if (bl2) {
                        bl2 = false;
                        string7 = null;
                    } else {
                        string7 = fP2.getString(n3);
                    }
                    boolean bl3 = fP2.isNull(n7);
                    if (bl3) {
                        bl3 = false;
                        l2 = null;
                    } else {
                        long l7 = fP2.getLong(n7);
                        l2 = l7;
                    }
                    boolean bl4 = fP2.isNull(n8);
                    if (bl4) {
                        bl4 = false;
                        string6 = null;
                    } else {
                        string6 = fP2.getString(n8);
                    }
                    boolean bl5 = fP2.isNull(n10);
                    if (!bl5) {
                        string8 = fP2.getString(n10);
                    }
                    WF2 wF2 = new Object();
                    wF2.a = l3;
                    wF2.b = string7;
                    wF2.c = l2;
                    wF2.d = string6;
                    wF2.e = string8;
                    arrayList.add(wF2);
                }
            }
            catch (Throwable throwable2) {
                break block12;
            }
            fP2.close();
            return arrayList;
        }
        fP2.close();
        throw throwable2;
    }

    public final void finalize() {
        this.a.release();
    }
}

