/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import java.util.Arrays;

public final class qp3 {
    public final int a;
    public final String b;
    public final int c;
    public final d[] d;
    public int e;

    static {
        gz3.D(0);
        gz3.D(1);
    }

    public qp3(String string2, d ... object) {
        int n3;
        int n4;
        int n7;
        String string3;
        int n8 = ((d[])object).length;
        int n10 = 1;
        if (n8 > 0) {
            n8 = 1;
        } else {
            n8 = 0;
            string3 = null;
        }
        ct3.a(n8 != 0);
        this.b = string2;
        this.d = object;
        this.a = n7 = ((d[])object).length;
        string2 = object[0].o;
        n7 = ip1_0.g(string2);
        n8 = -1;
        if (n7 == n8) {
            string2 = object[0].n;
            n7 = ip1_0.g(string2);
        }
        this.c = n7;
        string2 = object[0].d;
        string3 = "";
        String string4 = "und";
        if (string2 == null || (n4 = string2.equals(string4)) != 0) {
            string2 = string3;
        }
        d d2 = object[0];
        n4 = d2.f | 0x4000;
        while (n10 < (n3 = ((d[])object).length)) {
            boolean bl2;
            Object object2 = object[n10].d;
            if (object2 == null || (bl2 = ((String)object2).equals(string4))) {
                object2 = string3;
            }
            if ((n3 = (int)(string2.equals(object2) ? 1 : 0)) == 0) {
                string2 = object[0].d;
                object = object[n10].d;
                string3 = "languages";
                qp3.a(n10, string3, string2, (String)object);
                break;
            }
            object2 = object[n10];
            n3 = ((d)object2).f | 0x4000;
            if (n4 != n3) {
                n7 = object[0].f;
                string2 = Integer.toBinaryString(n7);
                int n14 = object[n10].f;
                object = Integer.toBinaryString(n14);
                string3 = "role flags";
                qp3.a(n10, string3, string2, (String)object);
                break;
            }
            ++n10;
        }
    }

    public static void a(int n3, String charSequence, String string2, String string3) {
        charSequence = og_1.a("Different ", (String)charSequence, " combined in one TrackGroup: '", string2, "' (track 0) and '");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append("' (track ");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(")");
        String string4 = ((StringBuilder)charSequence).toString();
        IllegalStateException illegalStateException = new IllegalStateException(string4);
        Cx.d("", illegalStateException);
    }

    public final boolean equals(Object objectArray) {
        Object object;
        Object object2;
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        if (objectArray != null && (object2 = qp3.class) == (object = objectArray.getClass())) {
            boolean bl3;
            objectArray = (qp3)objectArray;
            object = this.b;
            object2 = objectArray.b;
            boolean bl4 = object.equals(object2);
            if (!bl4 || !(bl3 = Arrays.equals(object = this.d, objectArray = objectArray.d))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.e;
        if (n3 == 0) {
            int n4;
            String string2 = this.b;
            int n7 = 31;
            n3 = zy_2.b(527, n7, string2);
            Object[] objectArray = this.d;
            this.e = n4 = Arrays.hashCode(objectArray) + n3;
        }
        return this.e;
    }
}

