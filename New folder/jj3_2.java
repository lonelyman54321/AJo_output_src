/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from JJ3
 */
public final class jj3_2 {
    public static final LinkedHashMap a(ArrayList object) {
        Object object2 = hn2_2.b;
        object2 = hn2$a.a("/", false);
        Object object3 = new ej3_2((hn2_2)object2);
        Object object4 = new Pair(object2, object3);
        int n3 = 1;
        object2 = new Pair[n3];
        object2[0] = object4;
        LinkedHashMap linkedHashMap = fh1_2.j((Pair[])object2);
        object2 = new Object();
        object = CollectionsKt.e0((Iterable)object, (Comparator)object2).iterator();
        block0: while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (ej3_2)object.next();
            object3 = ((ej3_2)object2).a;
            if ((object3 = (ej3_2)linkedHashMap.put(object3, object2)) != null) continue;
            while ((object3 = ((hn2_2)(object2 = ((ej3_2)object2).a)).b()) != null) {
                object4 = (ej3_2)linkedHashMap.get(object3);
                if (object4 != null) {
                    object3 = ((ej3_2)object4).h;
                    ((ArrayList)object3).add(object2);
                    continue block0;
                }
                object4 = new ej3_2((hn2_2)object3);
                linkedHashMap.put(object3, object4);
                object3 = ((ej3_2)object4).h;
                ((ArrayList)object3).add(object2);
                object2 = object4;
            }
        }
        return linkedHashMap;
    }

    public static final String b(int n3) {
        StringBuilder stringBuilder = new StringBuilder("0x");
        int n4 = CharsKt.checkRadix(16);
        String string2 = Integer.toString(n3, n4);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final ej3_2 c(ie2_2 ie2_22) {
        ej3_2 ej3_22;
        Object object;
        long l2;
        int n3;
        long l3;
        long l4;
        Object object2;
        int n4;
        int n7;
        Object object3;
        ie2_2 ie2_23 = ie2_22;
        Object object4 = "<this>";
        Intrinsics.checkNotNullParameter(ie2_22, (String)object4);
        int n8 = ie2_22.x0();
        int n10 = 33639248;
        if (n8 != n10) {
            StringBuilder stringBuilder = new StringBuilder("bad zip: expected ");
            String string2 = jj3_2.b(n10);
            stringBuilder.append(string2);
            stringBuilder.append(" but was ");
            object4 = jj3_2.b(n8);
            stringBuilder.append((String)object4);
            object4 = stringBuilder.toString();
            IOException iOException = new IOException((String)object4);
            throw iOException;
        }
        long l7 = 4;
        ie2_22.skip(l7);
        n8 = ie2_22.d();
        n10 = (char)-1;
        int n14 = n8 & n10;
        if ((n8 &= 1) != 0) {
            StringBuilder stringBuilder = new StringBuilder("unsupported zip: general purpose bit flag=");
            String string3 = jj3_2.b(n14);
            stringBuilder.append(string3);
            String string4 = stringBuilder.toString();
            object4 = new IOException(string4);
            throw object4;
        }
        int n15 = ie2_22.d() & n10;
        n8 = ie2_22.d();
        n14 = n8 & n10;
        int n16 = ie2_22.d();
        int n17 = n16 & n10;
        int n18 = -1;
        if (n14 == n18) {
            n8 = 0;
            object4 = null;
        } else {
            object3 = new GregorianCalendar();
            ((Calendar)object3).set(14, 0);
            int n19 = n17 >> 9 & 0x7F;
            int n20 = n19 + 1980;
            n17 = n17 >> 5 & 0xF;
            n7 = n16 & 0x1F;
            n16 = n14 >> 11;
            n4 = n16 & 0x1F;
            int n21 = (n14 >>= 5) & 0x3F;
            int n22 = (n8 &= 0x1F) << 1;
            int n24 = n17 + -1;
            object2 = object3;
            ((Calendar)object3).set(n20, n24, n7, n4, n21, n22);
            l4 = ((Calendar)object3).getTime().getTime();
            object4 = l4;
        }
        object2 = object4;
        ie2_22.x0();
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        l4 = ie2_22.x0();
        long l8 = 0xFFFFFFFFL;
        ref$LongRef.element = l4 &= l8;
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = l4 = (long)ie2_22.x0() & l8;
        n8 = ie2_22.d() & n10;
        n7 = ie2_22.d() & n10;
        n14 = ie2_22.d();
        n4 = n14 & n10;
        ie2_23.skip(8);
        Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        n10 = ie2_22.x0();
        ref$LongRef3.element = l3 = (long)n10 & l8;
        l7 = n8;
        Object object5 = ie2_23.k(l7);
        n8 = (int)(StringsKt.G((CharSequence)object5, '\u0000') ? 1 : 0);
        if (n8 != 0) {
            object4 = new IOException("bad zip: filename contains 0x00");
            throw object4;
        }
        l7 = ref$LongRef2.element;
        long l12 = 0L;
        n14 = 8;
        n16 = (int)(l7 == l8 ? 0 : (l7 < l8 ? -1 : 1));
        if (n16 == 0) {
            l7 = n14;
            n3 = n15;
        } else {
            n3 = n15;
            l7 = l12;
        }
        long l14 = ref$LongRef.element;
        n16 = (int)(l14 == l8 ? 0 : (l14 < l8 ? -1 : 1));
        if (n16 == 0) {
            l14 = n14;
            l7 += l14;
        }
        if ((n16 = (int)((l2 = (l14 = ref$LongRef3.element) - l8) == 0L ? 0 : (l2 < 0L ? -1 : 1))) == 0) {
            l4 = n14;
            l7 += l4;
        }
        l14 = l7;
        object3 = new Ref$BooleanRef();
        object4 = object;
        Serializable serializable = object3;
        l4 = l7;
        Object object6 = object2;
        object2 = object;
        object = ref$LongRef2;
        Ref$LongRef ref$LongRef4 = ref$LongRef2;
        Serializable serializable2 = object3;
        object3 = ie2_22;
        String string5 = object5;
        object5 = ref$LongRef;
        Ref$LongRef ref$LongRef5 = ref$LongRef3;
        ((hj3_2)object4)((Ref$BooleanRef)serializable, l7, (Ref$LongRef)object, ie2_22, ref$LongRef, ref$LongRef3);
        jj3_2.d(ie2_23, n7, (Function2)object4);
        n8 = (int)(l7 == l12 ? 0 : (l7 < l12 ? -1 : 1));
        if (n8 > 0 && (n8 = (int)(((Ref$BooleanRef)serializable).element ? 1 : 0)) == 0) {
            object4 = new IOException("bad zip: zip64 extra required but absent");
            throw object4;
        }
        l7 = n4;
        object3 = ie2_23.k(l7);
        object4 = hn2_2.b;
        object4 = "/";
        Object object7 = hn2$a.a((String)object4, false);
        Object object8 = string5;
        object = ((hn2_2)object7).d(string5);
        n8 = (int)(b.h(string5, (String)object4, false) ? 1 : 0);
        long l15 = ref$LongRef.element;
        object7 = ref$LongRef4;
        long l16 = ref$LongRef4.element;
        object7 = ref$LongRef5;
        long l17 = ref$LongRef5.element;
        object7 = ej3_22;
        object8 = object;
        n17 = n8;
        n15 = n3;
        object2 = object6;
        return new ej3_2((hn2_2)object, n8 != 0, (String)object3, l15, l16, n3, (Long)object6, l17);
    }

    public static final void d(ie2_2 object, int n3, Function2 function2) {
        long l2;
        long l3;
        long l4 = n3;
        while ((n3 = (int)((l3 = l4 - (l2 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0) {
            long l7 = 4;
            long l8 = l4 - l7;
            n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
            if (n3 >= 0) {
                n3 = ((ie2_2)object).d() & (char)-1;
                long l12 = 4;
                short s7 = ((ie2_2)object).d();
                l7 = (long)s7 & (long)((char)-1);
                long l14 = (l4 -= l12) - l7;
                Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object2 >= 0) {
                    ((ie2_2)object).f(l7);
                    ce_2 ce_22 = ((ie2_2)object).b;
                    long l15 = ce_22.b;
                    Integer n4 = n3;
                    Long l16 = l7;
                    function2.invoke(n4, l16);
                    long l17 = ce_22.b + l7 - l15;
                    long l18 = l17 == l2 ? 0 : (l17 < l2 ? -1 : 1);
                    if (l18 >= 0) {
                        if (l18 > 0) {
                            ce_22.skip(l17);
                        }
                        l4 -= l7;
                        continue;
                    }
                    String string2 = hj0_0.a(n3, "unsupported zip: too many bytes processed for ");
                    object = new IOException(string2);
                    throw object;
                }
                object = new IOException("bad zip: truncated value in extra field");
                throw object;
            }
            object = new IOException("bad zip: truncated header in extra field");
            throw object;
        }
    }

    public static final hl0_1 e(ie2_2 object, hl0_1 object2) {
        int n3;
        Object object3 = new Ref$ObjectRef();
        Object object4 = null;
        Serializable serializable = object2 != null ? ((hl0_1)object2).f : null;
        ((Ref$ObjectRef)object3).element = serializable;
        serializable = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        int n4 = ((ie2_2)object).x0();
        if (n4 == (n3 = 67324752)) {
            long l2 = 2;
            ((ie2_2)object).skip(l2);
            n4 = ((ie2_2)object).d();
            n3 = (char)-1;
            int bl2 = n4 & n3;
            if ((n4 &= 1) == 0) {
                ((ie2_2)object).skip(18);
                long l3 = ((ie2_2)object).d();
                long l4 = (char)-1;
                n4 = ((ie2_2)object).d() & n3;
                ((ie2_2)object).skip(l3 &= l4);
                if (object2 == null) {
                    long l7 = n4;
                    ((ie2_2)object).skip(l7);
                    return null;
                }
                object4 = new ij3_2((ie2_2)object, (Ref$ObjectRef)object3, (Ref$ObjectRef)serializable, ref$ObjectRef);
                jj3_2.d((ie2_2)object, n4, (Function2)object4);
                Object object5 = object4 = ref$ObjectRef.element;
                object5 = (Long)object4;
                Object object6 = object3 = ((Ref$ObjectRef)object3).element;
                object6 = (Long)object3;
                Object object7 = object3 = ((Ref$ObjectRef)serializable).element;
                object7 = (Long)object3;
                Long l8 = ((hl0_1)object2).d;
                boolean bl3 = ((hl0_1)object2).a;
                boolean bl4 = ((hl0_1)object2).b;
                object = new hl0_1(bl3, bl4, null, l8, (Long)object5, (Long)object6, (Long)object7);
                return object;
            }
            object2 = new StringBuilder("unsupported zip: general purpose bit flag=");
            object3 = jj3_2.b(bl2);
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            object = new IOException((String)object2);
            throw object;
        }
        object2 = new StringBuilder("bad zip: expected ");
        object3 = jj3_2.b(n3);
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(" but was ");
        object3 = jj3_2.b(n4);
        ((StringBuilder)object2).append((String)object3);
        object2 = ((StringBuilder)object2).toString();
        object = new IOException((String)object2);
        throw object;
    }
}

