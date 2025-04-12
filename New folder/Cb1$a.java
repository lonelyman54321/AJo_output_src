/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class Cb1$a
implements Callable {
    public final /* synthetic */ HP2 a;
    public final /* synthetic */ Cb1 b;

    public Cb1$a(Cb1 cb1, HP2 hP2) {
        this.b = cb1;
        this.a = hP2;
    }

    public final Object call() {
        Object object = this;
        Object object2 = this.b.a;
        ArrayList<Object> arrayList = this.a;
        int n3 = 0;
        String string2 = null;
        Cursor cursor = Oh0.b((FP2)object2, (ag3_0)((Object)arrayList), false);
        object2 = "id";
        try {
            int n4 = yf0.b(cursor, (String)object2);
            String string3 = "requestDate";
            int n7 = yf0.b(cursor, string3);
            String string4 = "responseDate";
            int n8 = yf0.b(cursor, string4);
            String string5 = "tookMs";
            int n10 = yf0.b(cursor, string5);
            String string6 = "protocol";
            int n14 = yf0.b(cursor, string6);
            String string7 = "method";
            int n15 = yf0.b(cursor, string7);
            String string8 = "url";
            int n16 = yf0.b(cursor, string8);
            String string9 = "host";
            int n17 = yf0.b(cursor, string9);
            String string10 = "path";
            int n18 = yf0.b(cursor, string10);
            String string11 = "scheme";
            int n19 = yf0.b(cursor, string11);
            String string12 = "responseTlsVersion";
            int n20 = yf0.b(cursor, string12);
            String string13 = "responseCipherSuite";
            int n21 = yf0.b(cursor, string13);
            string2 = "requestPayloadSize";
            n3 = yf0.b(cursor, string2);
            object = "requestContentType";
            int n22 = yf0.b(cursor, (String)object);
            return n22;
        }
        finally {
            HP2 hP2 = arrayList;
        }
    }
}

