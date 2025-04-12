/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from IU$b
 */
public final class iu$b_0 {
    public static final iu_1 a(iu$b_0 object, String string2) {
        object = new iu_1(string2);
        iu_1.d.put(string2, object);
        return object;
    }

    public static String c(String string2) {
        CharSequence charSequence = "TLS_";
        boolean bl2 = false;
        StringBuilder stringBuilder = null;
        boolean bl3 = b.s(string2, (String)charSequence, false);
        String string3 = "this as java.lang.String).substring(startIndex)";
        int n3 = 4;
        String string4 = "SSL_";
        if (bl3) {
            charSequence = new StringBuilder(string4);
            string2 = string2.substring(n3);
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            ((StringBuilder)charSequence).append(string2);
            string2 = ((StringBuilder)charSequence).toString();
        } else {
            bl2 = b.s(string2, string4, false);
            if (bl2) {
                stringBuilder = new StringBuilder((String)charSequence);
                string2 = string2.substring(n3);
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
            }
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final iu_1 b(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                block3: {
                    Object object2;
                    block4: {
                        object2 = "javaName";
                        try {
                            Intrinsics.checkNotNullParameter(string2, (String)object2);
                            object2 = iu_1.d;
                            object = ((LinkedHashMap)object2).get(string2);
                            object = (iu_1)object;
                            if (object != null) break block3;
                            object = iu$b_0.c(string2);
                            object = ((LinkedHashMap)object2).get(object);
                            if ((object = (iu_1)object) != null) break block4;
                            object = new Object(string2);
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object2.put(string2, object);
                }
                return object;
            }
            throw throwable2;
        }
    }
}

