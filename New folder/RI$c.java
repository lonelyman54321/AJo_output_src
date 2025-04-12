/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class RI$c {
    public static String a(ob1_1 ob1_12) {
        Intrinsics.checkNotNullParameter(ob1_12, "url");
        return ff$a_0.c(ob1_12.i).c("MD5").e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int b(ie2_2 object) {
        NumberFormatException numberFormatException2;
        Object object2;
        block3: {
            long l2;
            object2 = "expected an int but was \"";
            String string2 = "source";
            Intrinsics.checkNotNullParameter(object, string2);
            try {
                int n3;
                long l3;
                l2 = ((ie2_2)object).c();
                long l4 = Long.MAX_VALUE;
                object = ((ie2_2)object).x(l4);
                l4 = 0L;
                long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                if (l7 >= 0 && (l7 = (l3 = l2 - (l4 = Integer.MAX_VALUE)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0 && (n3 = ((String)object).length()) <= 0) {
                    return (int)l2;
                }
            }
            catch (NumberFormatException numberFormatException2) {
                break block3;
            }
            StringBuilder stringBuilder = new StringBuilder((String)object2);
            stringBuilder.append(l2);
            stringBuilder.append((String)object);
            char c2 = '\"';
            stringBuilder.append(c2);
            object = stringBuilder.toString();
            IOException iOException = new IOException((String)object);
            throw iOException;
        }
        String string3 = numberFormatException2.getMessage();
        object2 = new IOException(string3);
        throw object2;
    }

    public static Set c(m41_0 m41_02) {
        int n3 = 1;
        int n4 = m41_02.size();
        Set set = null;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            boolean bl2;
            Object object = "Vary";
            Object object2 = m41_02.c(i3);
            boolean bl3 = ((String)object).equalsIgnoreCase((String)object2);
            if (!bl3) continue;
            object2 = m41_02.g(i3);
            if (set == null) {
                Intrinsics.checkNotNullParameter(StringCompanionObject.INSTANCE, "<this>");
                object = String.CASE_INSENSITIVE_ORDER;
                String string2 = "CASE_INSENSITIVE_ORDER";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                set = new TreeSet(object);
            }
            object = new char[n3];
            int n7 = 44;
            object[0] = n7;
            object2 = StringsKt.Z((CharSequence)object2, (char[])object).iterator();
            while (bl2 = object2.hasNext()) {
                object = ((Object)StringsKt.m0((String)object2.next())).toString();
                set.add(object);
            }
        }
        if (set == null) {
            set = vz0_2.a;
        }
        return set;
    }
}

