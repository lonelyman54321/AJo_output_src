/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;

/*
 * Renamed from nS
 */
public final class ns_2 {
    public static final /* synthetic */ int a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        Object object = pa1_0.e;
        ArrayList<Byte> arrayList = new ArrayList<Byte>(0);
        ms_2 ms_22 = new Object();
        aq$a_0.a((List)object, (Function1)((Object)arrayList), ms_22);
        arrayList = null;
        int n3 = 255;
        int n4 = 1;
        object = new c(0, n3, n4);
        int n7 = 10;
        int n8 = yx_2.o((Iterable)object, n7);
        ArrayList<Long> arrayList2 = new ArrayList<Long>(n8);
        object = ((c)object).d();
        while ((n8 = (int)(((ui1_2)object).c ? 1 : 0)) != 0) {
            long l2;
            long l3;
            int n10 = 48;
            n8 = ((mi1_2)object).nextInt();
            if (n10 <= n8 && n8 < (n10 = 58)) {
                l3 = n8;
                l2 = 48;
                l3 -= l2;
            } else {
                long l4;
                long l7;
                long l8;
                long l12;
                long l14;
                l3 = n8;
                l2 = 97;
                long l15 = l3 - l2;
                Object object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object2 >= 0 && (l14 = (l12 = l3 - (l8 = (long)102)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) <= 0 || (object2 = (l7 = l3 - (l2 = (long)65)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) >= 0 && (l14 = (l4 = l3 - (l8 = (long)70)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
                    l3 -= l2;
                    l2 = n7;
                    l3 += l2;
                } else {
                    l3 = -1;
                }
            }
            Long l16 = l3;
            arrayList2.add(l16);
        }
        CollectionsKt.l0(arrayList2);
        object = new c(0, 15, n4);
        int n14 = yx_2.o((Iterable)object, n7);
        arrayList = new ArrayList<Byte>(n14);
        object = ((c)object).d();
        while (true) {
            int n15;
            if ((n15 = ((ui1_2)object).c) == 0) {
                CollectionsKt.g0(arrayList);
                return;
            }
            int n15 = ((mi1_2)object).nextInt();
            n15 = n15 < n7 ? (n15 += 48) : (int)((char)((char)(n15 + 97) - n7));
            n15 = (byte)n15;
            Byte by2 = (byte)n15;
            arrayList.add(by2);
        }
    }

    public static final int a(int n3, int n4, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int n7 = 0;
        while (n3 < n4) {
            int n8 = 65;
            int n10 = charSequence.charAt(n3);
            if (n8 <= n10 && n10 < (n8 = 91)) {
                n10 += 32;
            }
            n7 = n7 * 31 + n10;
            ++n3;
        }
        return n7;
    }

    public static final void b(as$a_0 charSequence, int n3) {
        StringBuilder stringBuilder = new StringBuilder("Invalid number: ");
        stringBuilder.append((Object)charSequence);
        stringBuilder.append(", wrong digit: ");
        char c2 = charSequence.charAt(n3);
        stringBuilder.append(c2);
        stringBuilder.append(" at position ");
        stringBuilder.append(n3);
        charSequence = stringBuilder.toString();
        NumberFormatException numberFormatException = new NumberFormatException((String)charSequence);
        throw numberFormatException;
    }
}

