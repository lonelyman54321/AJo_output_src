/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import androidx.work.b;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public abstract class CI3$a {
    public UUID a;
    public EI3 b;
    public final Set c;

    public CI3$a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "workerClass");
        Object object = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(object, "randomUUID()");
        this.a = object;
        String string2 = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
        String string3 = clazz.getName();
        String string4 = "workerClass.name";
        Intrinsics.checkNotNullExpressionValue(string3, string4);
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter(string3, "workerClassName_");
        this.b = object = new EI3(string2, null, string3, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0L, 0, 0, null, 0xFFFFFA);
        object = clazz.getName();
        Intrinsics.checkNotNullExpressionValue(object, string4);
        this.c = object = p03_0.e(object);
    }

    public final CI3 a() {
        Object object;
        int n3;
        CI3$a cI3$a = this;
        Object object2 = this.b();
        Object object3 = this.b.j;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 24;
        int n8 = 0;
        String string2 = null;
        int n10 = 1;
        if (!(n4 >= n7 && (n7 = (int)(((b60)object3).f() ? 1 : 0)) != 0 || (n7 = (int)(((b60)object3).e ? 1 : 0)) != 0 || (n7 = (int)(((b60)object3).c ? 1 : 0)) != 0 || n4 >= (n7 = 23) && (n3 = ((b60)object3).d) != 0)) {
            n3 = 0;
            object3 = null;
        } else {
            n3 = 1;
        }
        EI3 eI3 = cI3$a.b;
        n7 = eI3.q ? 1 : 0;
        if (n7 != 0) {
            if ((n3 ^= n10) != 0) {
                long l2 = eI3.g;
                long l3 = 0L;
                long l4 = l2 - l3;
                n3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                if (n3 > 0) {
                    object3 = "Expedited jobs cannot be delayed".toString();
                    object2 = new IllegalArgumentException((String)object3);
                    throw object2;
                }
            } else {
                object3 = "Expedited jobs only support network and storage constraints".toString();
                object2 = new IllegalArgumentException((String)object3);
                throw object2;
            }
        }
        if ((object3 = eI3.x) == null) {
            object3 = eI3.c;
            object = new String[]{"."};
            int n14 = 6;
            n7 = (object3 = StringsKt.a0((CharSequence)object3, object, false, 0, n14)).size();
            n7 = ((String)(object3 = n7 == n10 ? (String)object3.get(0) : (String)CollectionsKt.S((List)object3))).length();
            if (n7 > (n8 = 127)) {
                object3 = le3_2.E(n8, (String)object3);
            }
            eI3.x = object3;
        }
        object3 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(object3, "randomUUID()");
        Intrinsics.checkNotNullParameter(object3, "id");
        cI3$a.a = object3;
        string2 = ((UUID)object3).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
        object3 = cI3$a.b;
        Intrinsics.checkNotNullParameter(string2, "newId");
        Intrinsics.checkNotNullParameter(object3, "other");
        String string3 = ((EI3)object3).c;
        hI3.b b2 = ((EI3)object3).b;
        Object object4 = object;
        Object object5 = ((EI3)object3).e;
        Object object6 = object = new b((b)object5);
        object5 = ((EI3)object3).f;
        object = new b((b)object5);
        long l7 = ((EI3)object3).h;
        long l8 = ((EI3)object3).i;
        Object object7 = object;
        object5 = ((EI3)object3).j;
        object = new b60((b60)object5);
        long l12 = ((EI3)object3).n;
        boolean bl2 = ((EI3)object3).q;
        sg2 sg22 = ((EI3)object3).r;
        long l14 = ((EI3)object3).u;
        int n15 = ((EI3)object3).v;
        String string4 = ((EI3)object3).x;
        object5 = ((EI3)object3).d;
        long l15 = ((EI3)object3).g;
        n7 = ((EI3)object3).k;
        Au au4 = ((EI3)object3).l;
        long l16 = ((EI3)object3).m;
        long l17 = ((EI3)object3).o;
        long l18 = ((EI3)object3).p;
        int n16 = ((EI3)object3).s;
        int n17 = ((EI3)object3).w;
        object = eI3;
        eI3 = new EI3(string2, b2, string3, (String)object5, (b)object4, (b)object6, l15, l7, l8, (b60)object7, n7, au4, l16, l12, l17, l18, bl2, sg22, n16, l14, n15, n17, string4, 524288);
        cI3$a = this;
        this.b = eI3;
        return object2;
    }

    public abstract CI3 b();

    public abstract CI3$a c();

    public final CI3$a d(b60 b602) {
        Intrinsics.checkNotNullParameter(b602, "constraints");
        this.b.j = b602;
        return this.c();
    }

    public final CI3$a e(b b2) {
        Intrinsics.checkNotNullParameter(b2, "inputData");
        this.b.e = b2;
        return this.c();
    }
}

