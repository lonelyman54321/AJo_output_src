/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from e50
 */
public final class e50_0 {
    public static final e50_0 e;
    public static final e50_0 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        int n3 = 7;
        int n4 = 6;
        int n7 = 5;
        int n8 = 4;
        int n10 = 3;
        int n14 = 2;
        int n15 = 1;
        iu_1 iu_12 = iu_1.r;
        iu_1 iu_13 = iu_1.s;
        iu_1 iu_14 = iu_1.t;
        iu_1 iu_15 = iu_1.l;
        iu_1 iu_16 = iu_1.n;
        iu_1 iu_17 = iu_1.m;
        iu_1 iu_18 = iu_1.o;
        iu_1 iu_19 = iu_1.q;
        iu_1 iu_110 = iu_1.p;
        Object object = new iu_1[9];
        object[0] = iu_12;
        object[n15] = iu_13;
        object[n14] = iu_14;
        object[n10] = iu_15;
        object[n8] = iu_16;
        object[n7] = iu_17;
        object[n4] = iu_18;
        object[n3] = iu_19;
        object[8] = iu_110;
        Object[] objectArray = new iu_1[16];
        objectArray[0] = iu_12;
        objectArray[n15] = iu_13;
        objectArray[n14] = iu_14;
        objectArray[n10] = iu_15;
        objectArray[n8] = iu_16;
        objectArray[n7] = iu_17;
        objectArray[n4] = iu_18;
        objectArray[n3] = iu_19;
        objectArray[8] = iu_110;
        Object object2 = iu_1.j;
        objectArray[9] = object2;
        object2 = iu_1.k;
        objectArray[10] = object2;
        object2 = iu_1.h;
        objectArray[11] = object2;
        object2 = iu_1.i;
        objectArray[12] = object2;
        object2 = iu_1.f;
        objectArray[13] = object2;
        object2 = iu_1.g;
        objectArray[14] = object2;
        object2 = iu_1.e;
        objectArray[15] = object2;
        object2 = new e50$a();
        object = Arrays.copyOf(object, 9);
        ((e50$a)object2).b((iu_1)object);
        object = wn3_0.TLS_1_3;
        wn3_0 wn3_02 = wn3_0.TLS_1_2;
        wn3_0[] wn3_0Array = new wn3_0[n14];
        wn3_0Array[0] = object;
        wn3_0Array[n15] = wn3_02;
        ((e50$a)object2).e(wn3_0Array);
        ((e50$a)object2).d();
        ((e50$a)object2).a();
        object2 = new e50$a();
        iu_1[] iu_1Array = Arrays.copyOf(objectArray, 16);
        ((e50$a)object2).b(iu_1Array);
        wn3_0Array = new wn3_0[n14];
        wn3_0Array[0] = object;
        wn3_0Array[n15] = wn3_02;
        ((e50$a)object2).e(wn3_0Array);
        ((e50$a)object2).d();
        e = ((e50$a)object2).a();
        object2 = new e50$a();
        objectArray = Arrays.copyOf(objectArray, 16);
        ((e50$a)object2).b((iu_1[])objectArray);
        objectArray = new wn3_0[n8];
        objectArray[0] = object;
        objectArray[n15] = wn3_02;
        objectArray[n14] = object = wn3_0.TLS_1_1;
        objectArray[n10] = object = wn3_0.TLS_1_0;
        ((e50$a)object2).e((wn3_0[])objectArray);
        ((e50$a)object2).d();
        ((e50$a)object2).a();
        f = object = new e50_0(false, false, null, null);
    }

    public e50_0(boolean bl2, boolean bl3, String[] stringArray, String[] stringArray2) {
        this.a = bl2;
        this.b = bl3;
        this.c = stringArray;
        this.d = stringArray2;
    }

    /*
     * WARNING - void declaration
     */
    public final List a() {
        void var1_4;
        String[] object = this.c;
        if (object != null) {
            int n3 = object.length;
            ArrayList<iu_1> arrayList = new ArrayList<iu_1>(n3);
            for (String string2 : object) {
                iu$b_0 iu$b_0 = iu_1.b;
                iu_1 iu_12 = iu$b_0.b(string2);
                arrayList.add(iu_12);
            }
            List list = CollectionsKt.k0(arrayList);
        } else {
            Object var1_3 = null;
        }
        return var1_4;
    }

    public final boolean b(SSLSocket stringArray) {
        boolean bl2;
        String[] stringArray2;
        String[] stringArray3 = "socket";
        Intrinsics.checkNotNullParameter(stringArray, (String)stringArray3);
        boolean bl3 = this.a;
        if (!bl3) {
            return false;
        }
        stringArray3 = this.d;
        if (stringArray3 != null) {
            stringArray2 = stringArray.getEnabledProtocols();
            ps1_1 ps1_12 = ps1_1.a;
            String string2 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }";
            Intrinsics.checkNotNull(ps1_12, string2);
            bl3 = ez3.j(stringArray3, stringArray2, ps1_12);
            if (!bl3) {
                return false;
            }
        }
        return (stringArray3 = this.c) == null || (bl2 = ez3.j(stringArray3, stringArray = stringArray.getEnabledCipherSuites(), (Comparator)(stringArray2 = iu_1.c)));
    }

    /*
     * WARNING - void declaration
     */
    public final List c() {
        void var1_4;
        String[] object = this.d;
        if (object != null) {
            int n3 = object.length;
            ArrayList<String> arrayList = new ArrayList<String>(n3);
            for (Object object2 : object) {
                Wn3$a wn3$a = wn3_0.Companion;
                wn3$a.getClass();
                object2 = Wn3$a.a(object2);
                arrayList.add((String)object2);
            }
            List list = CollectionsKt.k0(arrayList);
        } else {
            Object var1_3 = null;
        }
        return var1_4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof e50_0;
        if (!bl2) {
            return false;
        }
        bl2 = true;
        if (object == this) {
            return bl2;
        }
        object = (e50_0)object;
        boolean bl3 = this.a;
        boolean bl4 = ((e50_0)object).a;
        if (bl3 != bl4) {
            return false;
        }
        if (bl3) {
            Object[] objectArray = this.c;
            Object[] objectArray2 = ((e50_0)object).c;
            bl4 = Arrays.equals(objectArray, objectArray2);
            if (!bl4) {
                return false;
            }
            objectArray = this.d;
            objectArray2 = ((e50_0)object).d;
            bl4 = Arrays.equals(objectArray, objectArray2);
            if (!bl4) {
                return false;
            }
            bl4 = this.b;
            boolean bl5 = ((e50_0)object).b;
            if (bl4 != bl5) {
                return false;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a;
        if (n4 != 0) {
            int n7;
            n4 = 0;
            Object[] objectArray = this.c;
            if (objectArray != null) {
                n7 = Arrays.hashCode(objectArray);
            } else {
                n7 = 0;
                objectArray = null;
            }
            n3 = (527 + n7) * 31;
            objectArray = this.d;
            if (objectArray != null) {
                n4 = Arrays.hashCode(objectArray);
            }
            n3 = (n3 + n4) * 31;
            n4 = this.b ^ 1;
            n3 += n4;
        } else {
            n3 = 17;
        }
        return n3;
    }

    public final String toString() {
        boolean bl2 = this.a;
        if (!bl2) {
            return "ConnectionSpec()";
        }
        StringBuilder stringBuilder = new StringBuilder("ConnectionSpec(cipherSuites=");
        Object object = this.a();
        String string2 = "[all enabled]";
        object = Objects.toString(object, string2);
        stringBuilder.append((String)object);
        stringBuilder.append(", tlsVersions=");
        object = Objects.toString(this.c(), string2);
        stringBuilder.append((String)object);
        stringBuilder.append(", supportsTlsExtensions=");
        boolean bl3 = this.b;
        return AR.a(stringBuilder, bl3, ')');
    }
}

