/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ID
 */
public final class id_2
implements nj1_2 {
    public final z80_0 a;

    public id_2(z80_0 z80_02) {
        Intrinsics.checkNotNullParameter(z80_02, "cookieJar");
        this.a = z80_02;
    }

    public final cl2_2 intercept(nj1$a object) {
        boolean bl2;
        Object object2;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "chain");
        object = (te2_2)object;
        Object object4 = ((te2_2)object).e;
        Object object5 = ((kj2_2)object4).c();
        long l2 = -1;
        String string2 = "Content-Type";
        String string3 = "Content-Length";
        Object object6 = ((kj2_2)object4).d;
        if (object6 != null) {
            object3 = ((pj2_2)object6).contentType();
            if (object3 != null) {
                object3 = ((jn1_0)object3).a;
                ((KJ2$a)object5).d(string2, (String)object3);
            }
            long l3 = ((pj2_2)object6).contentLength();
            object2 = "Transfer-Encoding";
            Object object7 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object7 != false) {
                object6 = String.valueOf(l3);
                ((KJ2$a)object5).d(string3, (String)object6);
                ((KJ2$a)object5).f((String)object2);
            } else {
                object6 = "chunked";
                ((KJ2$a)object5).d((String)object2, (String)object6);
                ((KJ2$a)object5).f(string3);
            }
        }
        object6 = "Host";
        object3 = ((kj2_2)object4).b((String)object6);
        boolean bl3 = false;
        object2 = null;
        ob1_1 ob1_12 = ((kj2_2)object4).a;
        if (object3 == null) {
            object3 = ez3.w(ob1_12, false);
            ((KJ2$a)object5).d((String)object6, (String)object3);
        }
        if ((object3 = ((kj2_2)object4).b((String)(object6 = "Connection"))) == null) {
            object3 = "Keep-Alive";
            ((KJ2$a)object5).d((String)object6, (String)object3);
        }
        object6 = "Accept-Encoding";
        object3 = ((kj2_2)object4).b((String)object6);
        String string4 = "gzip";
        if (object3 == null && (object3 = ((kj2_2)object4).b("Range")) == null) {
            ((KJ2$a)object5).d((String)object6, string4);
            bl3 = true;
        }
        object6 = this.a;
        ((z80_0)object6).a(ob1_12).isEmpty();
        object3 = "User-Agent";
        String string5 = ((kj2_2)object4).b((String)object3);
        if (string5 == null) {
            string5 = "okhttp/4.12.0";
            ((KJ2$a)object5).d((String)object3, string5);
        }
        object5 = ((KJ2$a)object5).b();
        object = ((te2_2)object).a((kj2_2)object5);
        object5 = ((cl2_2)object).f;
        ia1_1.b((z80_0)object6, ob1_12, (m41_0)object5);
        object6 = ((cl2_2)object).h();
        object3 = "request";
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        ((cl2$a_0)object6).a = object4;
        if (bl3 && (bl2 = string4.equalsIgnoreCase((String)(object3 = cl2_2.c((cl2_2)object, (String)(object4 = "Content-Encoding"))))) && (bl2 = ia1_1.a((cl2_2)object)) && (object3 = ((cl2_2)object).g) != null) {
            object3 = ((il2_2)object3).h();
            object2 = new c21((a93_0)object3);
            object5 = ((m41_0)object5).e();
            ((m41$a_0)object5).g((String)object4);
            ((m41$a_0)object5).g(string3);
            object4 = ((m41$a_0)object5).e();
            ((cl2$a_0)object6).c((m41_0)object4);
            object = cl2_2.c((cl2_2)object, string2);
            object5 = o72_0.b((a93_0)object2);
            ((cl2$a_0)object6).g = object4 = new ve2_2((String)object, l2, (ie2_2)object5);
        }
        return ((cl2$a_0)object6).a();
    }
}

