/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from bi
 */
public final class bi_2
extends Handler {
    public static final bi_2 a;

    static {
        bi_2 bi_22;
        a = bi_22 = new Handler();
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord object) {
        char c2;
        int n3;
        Intrinsics.checkNotNullParameter(object, "record");
        Object object2 = ai_2.a;
        object2 = ((LogRecord)object).getLoggerName();
        Intrinsics.checkNotNullExpressionValue(object2, "record.loggerName");
        Level level = ((LogRecord)object).getLevel();
        int n4 = level.intValue();
        Object object3 = Level.INFO;
        int n7 = ((Level)object3).intValue();
        int n8 = 4;
        n4 = n4 > n7 ? 5 : ((n4 = (level = ((LogRecord)object).getLevel()).intValue()) == (n3 = ((Level)object3).intValue()) ? 4 : 3);
        object3 = ((LogRecord)object).getMessage();
        Intrinsics.checkNotNullExpressionValue(object3, "record.message");
        object = ((LogRecord)object).getThrown();
        Intrinsics.checkNotNullParameter(object2, "loggerName");
        Intrinsics.checkNotNullParameter(object3, "message");
        String string2 = (String)ai_2.b.get(object2);
        if (string2 == null) {
            n7 = 23;
            string2 = le3_2.E(n7, (String)object2);
        }
        if ((c2 = Log.isLoggable((String)string2, (int)n4)) != '\u0000') {
            StringBuilder stringBuilder;
            c2 = '\n';
            if (object != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object3);
                stringBuilder.append(c2);
                object = Log.getStackTraceString((Throwable)object);
                stringBuilder.append((String)object);
                object3 = stringBuilder.toString();
            }
            int n10 = ((String)object3).length();
            stringBuilder = null;
            int n14 = 0;
            String string3 = null;
            block0: while (n14 < n10) {
                int n15;
                int n16 = StringsKt.N((CharSequence)object3, c2, n14, false, n8);
                if (n16 == (n15 = -1)) {
                    n16 = n10;
                }
                while (true) {
                    n15 = n14 + 4000;
                    n15 = Math.min(n16, n15);
                    string3 = ((String)object3).substring(n14, n15);
                    String string4 = "this as java.lang.String\u2026ing(startIndex, endIndex)";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    Log.println((int)n4, (String)string2, (String)string3);
                    if (n15 >= n16) {
                        n14 = n15 + 1;
                        continue block0;
                    }
                    n14 = n15;
                }
            }
        }
    }
}

