/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class KJ2$a {
    public ob1_1 a;
    public String b;
    public m41$a_0 c;
    public pj2_2 d;
    public LinkedHashMap e;

    public KJ2$a() {
        Object object = new LinkedHashMap();
        this.e = object;
        this.b = "GET";
        this.c = object = new m41$a_0();
    }

    public final void a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.c.a(string2, string3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final kj2_2 b() {
        kj2_2 kj2_22;
        Object object = this.a;
        if (object == null) {
            object = "url == null".toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        String string2 = this.b;
        m41_0 m41_02 = this.c.e();
        pj2_2 pj2_22 = this.d;
        Object object2 = this.e;
        byte[] byArray = ez3.a;
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(object2, string3);
        boolean bl2 = object2.isEmpty();
        if (bl2) {
            object2 = fh1_2.f();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(object2);
            object2 = Collections.unmodifiableMap(linkedHashMap);
            String string4 = "{\n    Collections.unmodi\u2026(LinkedHashMap(this))\n  }";
            Intrinsics.checkNotNullExpressionValue(object2, string4);
        }
        Map map2 = object2;
        object2 = kj2_22;
        return new kj2_2((ob1_1)object, string2, m41_02, pj2_22, map2);
    }

    public final void c(ti_1 object) {
        String string2 = "cacheControl";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((ti_1)object).toString();
        int n3 = ((String)object).length();
        String string3 = "Cache-Control";
        if (n3 == 0) {
            this.f(string3);
        } else {
            this.d(string3, (String)object);
        }
    }

    public final void d(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.c.h(string2, string3);
    }

    public final void e(String object, pj2_2 object2) {
        block7: {
            String string2;
            block10: {
                block9: {
                    block8: {
                        String string3 = "method";
                        Intrinsics.checkNotNullParameter(object, string3);
                        int n3 = ((String)object).length();
                        if (n3 <= 0) break block7;
                        string2 = "method ";
                        if (object2 != null) break block8;
                        Intrinsics.checkNotNullParameter(object, string3);
                        string3 = "POST";
                        boolean bl2 = Intrinsics.areEqual(object, string3);
                        boolean bl3 = true;
                        if (!(bl2 || (bl2 = Intrinsics.areEqual(object, string3 = "PUT")) || (bl2 = Intrinsics.areEqual(object, string3 = "PATCH")) || (bl2 = Intrinsics.areEqual(object, string3 = "PROPPATCH")) || (bl2 = Intrinsics.areEqual(object, string3 = "REPORT")))) {
                            bl2 = false;
                            string3 = null;
                        } else {
                            bl2 = true;
                        }
                        if (!(bl2 ^= bl3)) {
                            object = cP.a(string2, (String)object, " must have a request body.");
                            object = object.toString();
                            object2 = new IllegalArgumentException((String)object);
                            throw object2;
                        }
                        break block9;
                    }
                    boolean bl4 = nk_0.e((String)object);
                    if (!bl4) break block10;
                }
                this.b = object;
                this.d = object2;
                return;
            }
            object = cP.a(string2, (String)object, " must not have a request body.");
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object2 = "method.isEmpty() == true".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void f(String string2) {
        Intrinsics.checkNotNullParameter(string2, "name");
        this.c.g(string2);
    }

    public final void g(Class clazz, Object object) {
        LinkedHashMap linkedHashMap = "type";
        Intrinsics.checkNotNullParameter(clazz, (String)((Object)linkedHashMap));
        if (object == null) {
            object = this.e;
            object.remove(clazz);
        } else {
            linkedHashMap = this.e;
            boolean bl2 = linkedHashMap.isEmpty();
            if (bl2) {
                this.e = linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap = this.e;
            object = clazz.cast(object);
            Intrinsics.checkNotNull(object);
            linkedHashMap.put(clazz, object);
        }
    }

    public final void h(String object) {
        String string2 = "url";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = "ws:";
        int n3 = 1;
        boolean bl2 = kotlin.text.b.s((String)object, (String)object2, n3 != 0);
        String string3 = "this as java.lang.String).substring(startIndex)";
        if (bl2) {
            String string4 = "http:";
            object2 = new StringBuilder(string4);
            n3 = 3;
            object = ((String)object).substring(n3);
            Intrinsics.checkNotNullExpressionValue(object, string3);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
        } else {
            object2 = "wss:";
            bl2 = kotlin.text.b.s((String)object, (String)object2, n3 != 0);
            if (bl2) {
                String string5 = "https:";
                object2 = new StringBuilder(string5);
                n3 = 4;
                object = ((String)object).substring(n3);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                ((StringBuilder)object2).append((String)object);
                object = ((StringBuilder)object2).toString();
            }
        }
        Intrinsics.checkNotNullParameter(object, "<this>");
        object2 = new Ob1$a();
        ((Ob1$a)object2).e(null, (String)object);
        object = ((Ob1$a)object2).b();
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
    }
}

