/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SJ2
 */
public final class sj2_1 {
    public static final char[] l;
    public static final Pattern m;
    public final String a;
    public final ob1_1 b;
    public String c;
    public Ob1$a d;
    public final KJ2$a e;
    public final m41$a_0 f;
    public jn1_0 g;
    public final boolean h;
    public final cr1$a_0 i;
    public final DV0$a j;
    public pj2_2 k;

    static {
        char[] cArray;
        char[] cArray2 = cArray = new char[16];
        char[] cArray3 = cArray;
        cArray2[0] = 48;
        cArray3[1] = 49;
        cArray2[2] = 50;
        cArray3[3] = 51;
        cArray2[4] = 52;
        cArray3[5] = 53;
        cArray2[6] = 54;
        cArray3[7] = 55;
        cArray2[8] = 56;
        cArray3[9] = 57;
        cArray2[10] = 65;
        cArray3[11] = 66;
        cArray2[12] = 67;
        cArray3[13] = 68;
        cArray2[14] = 69;
        cArray3[15] = 70;
        l = cArray;
        m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    }

    public sj2_1(String object, ob1_1 object2, String string2, m41_0 m41_02, jn1_0 jn1_02, boolean bl2, boolean bl3, boolean bl4) {
        this.a = object;
        this.b = object2;
        this.c = string2;
        this.e = object = new KJ2$a();
        this.g = jn1_02;
        this.h = bl2;
        this.f = m41_02 != null ? (object = m41_02.e()) : (object = new m41$a_0());
        if (bl3) {
            object2 = null;
            this.j = object = new DV0$a(0);
        } else if (bl4) {
            this.i = object = new cr1$a_0();
            object2 = cr1_2.f;
            ((cr1$a_0)object).b((jn1_0)object2);
        }
    }

    public final void a(String object, String string2, boolean bl2) {
        DV0$a dV0$a = this.j;
        if (bl2) {
            dV0$a.getClass();
            Intrinsics.checkNotNullParameter(object, "name");
            Intrinsics.checkNotNullParameter(string2, "value");
            ArrayList arrayList = dV0$a.b;
            boolean bl3 = true;
            int n3 = 83;
            boolean bl4 = true;
            Charset charset = dV0$a.a;
            object = Ob1$b.a((String)object, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", bl4, false, bl3, false, charset, n3);
            arrayList.add(object);
            object = dV0$a.c;
            String string3 = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
            charset = dV0$a.a;
            string2 = Ob1$b.a(string2, 0, 0, string3, bl4, false, bl3, false, charset, n3);
            ((ArrayList)object).add(string2);
        } else {
            dV0$a.a((String)object, string2);
        }
    }

    public final void b(String object, String string2, boolean bl2) {
        Object object2 = "Content-Type";
        boolean bl3 = ((String)object2).equalsIgnoreCase((String)object);
        if (bl3) {
            try {
                object = jn1_0.d;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                string2 = kp1_0.c("Malformed content type: ", string2);
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(string2, illegalArgumentException);
                throw illegalArgumentException2;
            }
            object = JN1$a.a(string2);
            this.g = object;
        } else {
            object2 = this.f;
            if (bl2) {
                ((m41$a_0)object2).d((String)object, string2);
            } else {
                ((m41$a_0)object2).a((String)object, string2);
            }
        }
    }

    public final void c(m41_0 object, pj2_2 object2) {
        cr1$a_0 cr1$a_0 = this.i;
        cr1$a_0.getClass();
        Object object3 = "body";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = ((m41_0)object).a("Content-Type");
        if (object3 == null) {
            object3 = ((m41_0)object).a("Content-Length");
            if (object3 == null) {
                object3 = new cr1$c_0((m41_0)object, (pj2_2)object2);
                Intrinsics.checkNotNullParameter(object3, "part");
                cr1$a_0.c.add(object3);
                return;
            }
            object2 = "Unexpected header: Content-Length".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = "Unexpected header: Content-Type".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void d(String object, String charSequence, boolean bl2) {
        Object object2;
        ArrayList<Object> arrayList = this.c;
        String string2 = null;
        if (arrayList != null) {
            object2 = this.b;
            arrayList = ((ob1_1)object2).g((String)((Object)arrayList));
            this.d = arrayList;
            if (arrayList != null) {
                this.c = null;
            } else {
                charSequence = new StringBuilder("Malformed URL. Base: ");
                ((StringBuilder)charSequence).append(object2);
                ((StringBuilder)charSequence).append(", Relative: ");
                String string3 = this.c;
                ((StringBuilder)charSequence).append(string3);
                charSequence = ((StringBuilder)charSequence).toString();
                object = new IllegalArgumentException((String)charSequence);
                throw object;
            }
        }
        if (bl2) {
            Ob1$a ob1$a = this.d;
            ob1$a.getClass();
            Intrinsics.checkNotNullParameter(object, "encodedName");
            arrayList = ob1$a.g;
            if (arrayList == null) {
                ob1$a.g = arrayList = new ArrayList<Object>();
            }
            arrayList = ob1$a.g;
            Intrinsics.checkNotNull(arrayList);
            boolean bl3 = true;
            int n3 = 211;
            String string4 = " \"'<>#&=";
            boolean bl4 = true;
            object2 = object;
            object = Ob1$b.a((String)object, 0, 0, string4, bl4, false, bl3, false, null, n3);
            arrayList.add(object);
            object = ob1$a.g;
            Intrinsics.checkNotNull(object);
            if (charSequence != null) {
                bl3 = true;
                n3 = 211;
                string4 = " \"'<>#&=";
                bl4 = true;
                object2 = charSequence;
                string2 = Ob1$b.a((String)charSequence, 0, 0, string4, bl4, false, bl3, false, null, n3);
            }
            object.add(string2);
        } else {
            Ob1$a ob1$a = this.d;
            ob1$a.a((String)object, (String)charSequence);
        }
    }
}

