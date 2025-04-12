/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Set;

public final class VP1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];

    /*
     * Unable to fully structure code
     */
    public static Set a() {
        block10: {
            var0 = "android.text.EmojiConsistency";
            var0 = Class.forName((String)var0);
            var1_1 = "getEmojiConsistencySet";
            var2_2 = false;
            var3_3 = null;
            var0 = var0.getMethod((String)var1_1, null);
            var0 = var0.invoke(null, null);
            if (var0 != null) ** GOTO lbl14
            return Collections.emptySet();
lbl14:
            // 1 sources

            var0 = var0;
            var1_1 = var0.iterator();
            do {
                var2_2 = var1_1.hasNext();
                if (!var2_2) break block10;
                ** try [egrp 6[TRYBLOCK] [7 : 60->66)] { 
lbl22:
                // 1 sources

            } while (var2_2 = (var3_3 = var1_1.next()) instanceof int[]);
            try {
                var0 = Collections.emptySet();
            }
lbl25:
            // 8 sources

            catch (Throwable v0) {
                return Collections.emptySet();
            }
        }
        return var0;
    }
}

