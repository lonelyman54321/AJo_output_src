/*
 * Decompiled with CFR 0.152.
 */
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from f50
 */
public final class f50_0 {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public f50_0(List list) {
        Intrinsics.checkNotNullParameter(list, "connectionSpecs");
        this.a = list;
    }

    public final e50_0 a(SSLSocket objectArray) {
        int n3;
        e50_0 e50_02;
        int n4;
        int n7;
        Object[] objectArray2;
        String[] stringArray;
        int n8;
        Object object;
        f50_0 f50_02;
        block13: {
            f50_02 = this;
            object = objectArray;
            n8 = 1;
            stringArray = "sslSocket";
            Intrinsics.checkNotNullParameter(objectArray, (String)stringArray);
            objectArray2 = this.a;
            n7 = objectArray2.size();
            for (n4 = this.b; n4 < n7; n4 += n8) {
                e50_02 = (e50_0)objectArray2.get(n4);
                n3 = e50_02.b((SSLSocket)object);
                if (n3 == 0) continue;
                f50_02.b = n4 += n8;
                break block13;
            }
            e50_02 = null;
        }
        if (e50_02 != null) {
            boolean bl2;
            Object object2;
            String string2;
            Object object3;
            Object object4;
            String[] stringArray2;
            Object object5;
            String[] stringArray3;
            String string3;
            block15: {
                Object object6;
                block14: {
                    n4 = f50_02.b;
                    n7 = objectArray2.size();
                    while (true) {
                        n3 = 0;
                        string3 = null;
                        if (n4 >= n7) break;
                        stringArray3 = (String[])objectArray2.get(n4);
                        boolean bl3 = stringArray3.b((SSLSocket)object);
                        if (bl3) {
                            n4 = 1;
                            break block14;
                        }
                        n4 += n8;
                    }
                    n4 = 0;
                    object5 = null;
                }
                f50_02.c = n4;
                n4 = (int)(f50_02.d ? 1 : 0);
                Intrinsics.checkNotNullParameter(object, (String)stringArray);
                stringArray = e50_02.c;
                if (stringArray != null) {
                    objectArray2 = objectArray.getEnabledCipherSuites();
                    Intrinsics.checkNotNullExpressionValue(objectArray2, "sslSocket.enabledCipherSuites");
                    stringArray2 = iu_1.c;
                    objectArray2 = ez3.p((String[])objectArray2, stringArray, (Comparator)stringArray2);
                } else {
                    objectArray2 = objectArray.getEnabledCipherSuites();
                }
                stringArray2 = e50_02.d;
                if (stringArray2 != null) {
                    stringArray3 = objectArray.getEnabledProtocols();
                    Intrinsics.checkNotNullExpressionValue(stringArray3, "sslSocket.enabledProtocols");
                    object4 = ps1_1.a;
                    object6 = "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }";
                    Intrinsics.checkNotNull(object4, (String)object6);
                    stringArray3 = ez3.p(stringArray3, stringArray2, (Comparator)object4);
                } else {
                    stringArray3 = objectArray.getEnabledProtocols();
                }
                object4 = objectArray.getSupportedCipherSuites();
                Intrinsics.checkNotNullExpressionValue(object4, "supportedCipherSuites");
                object6 = iu_1.c;
                object3 = ez3.a;
                object3 = "<this>";
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                String string4 = "TLS_FALLBACK_SCSV";
                string2 = "value";
                Intrinsics.checkNotNullParameter(string4, string2);
                String string5 = "comparator";
                Intrinsics.checkNotNullParameter(object6, string5);
                int n10 = ((String[])object4).length;
                while (n3 < n10) {
                    object2 = object4[n3];
                    n8 = ((iu$a_0)object6).compare(object2, string4);
                    if (n8 != 0) {
                        n8 = 1;
                        n3 += n8;
                        continue;
                    }
                    break block15;
                }
                n3 = -1;
            }
            object2 = "cipherSuitesIntersection";
            if (n4 != 0 && n3 != (n4 = -1)) {
                Intrinsics.checkNotNullExpressionValue(objectArray2, (String)object2);
                object5 = object4[n3];
                Intrinsics.checkNotNullExpressionValue(object5, "supportedCipherSuites[indexOfFallbackScsv]");
                Intrinsics.checkNotNullParameter(objectArray2, (String)object3);
                Intrinsics.checkNotNullParameter(object5, string2);
                n3 = objectArray2.length;
                int n14 = 1;
                objectArray2 = Arrays.copyOf(objectArray2, n3 += n14);
                string3 = "copyOf(this, newSize)";
                Intrinsics.checkNotNullExpressionValue(objectArray2, string3);
                n3 = tp_2.C(objectArray2);
                objectArray2[n3] = object5;
            }
            string3 = "connectionSpec";
            Intrinsics.checkNotNullParameter(e50_02, string3);
            object5 = new Object();
            n3 = (int)(e50_02.a ? 1 : 0);
            ((e50$a)object5).a = n3;
            ((e50$a)object5).b = stringArray;
            ((e50$a)object5).c = stringArray2;
            ((e50$a)object5).d = bl2 = e50_02.b;
            Intrinsics.checkNotNullExpressionValue(objectArray2, (String)object2);
            n8 = objectArray2.length;
            object2 = Arrays.copyOf(objectArray2, n8);
            ((e50$a)object5).c((String[])object2);
            Intrinsics.checkNotNullExpressionValue(stringArray3, "tlsVersionsIntersection");
            n8 = stringArray3.length;
            object2 = Arrays.copyOf(stringArray3, n8);
            ((e50$a)object5).f((String[])object2);
            object2 = ((e50$a)object5).a();
            stringArray = ((e50_0)object2).c();
            if (stringArray != null) {
                stringArray = ((e50_0)object2).d;
                ((SSLSocket)object).setEnabledProtocols(stringArray);
            }
            if ((stringArray = ((e50_0)object2).a()) != null) {
                object2 = ((e50_0)object2).c;
                ((SSLSocket)object).setEnabledCipherSuites((String[])object2);
            }
            return e50_02;
        }
        stringArray = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        n4 = (int)(f50_02.d ? 1 : 0);
        stringArray.append(n4 != 0);
        stringArray.append(", modes=");
        stringArray.append(objectArray2);
        stringArray.append(", supported protocols=");
        object = objectArray.getEnabledProtocols();
        Intrinsics.checkNotNull(object);
        object = Arrays.toString((Object[])object);
        Intrinsics.checkNotNullExpressionValue(object, "toString(this)");
        stringArray.append((String)object);
        object = stringArray.toString();
        UnknownServiceException unknownServiceException = new UnknownServiceException((String)object);
        throw unknownServiceException;
    }
}

