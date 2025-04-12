/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.internal.UndeliveredElementException;

/*
 * Renamed from Hz0
 */
public final class hz0_2 {
    public static final void a(Function1 object, Object object2, CoroutineContext coroutineContext) {
        if ((object = hz0_2.b((Function1)object, object2, null)) != null) {
            g90_0.a(coroutineContext, (Throwable)object);
        }
    }

    public static final UndeliveredElementException b(Function1 function1, Object object, UndeliveredElementException undeliveredElementException) {
        Throwable throwable2;
        block2: {
            try {
                function1.invoke(object);
            }
            catch (Throwable throwable2) {
                Throwable throwable3;
                if (undeliveredElementException == null || (throwable3 = undeliveredElementException.getCause()) == throwable2) break block2;
                yc0_2.a(undeliveredElementException, throwable2);
            }
            return undeliveredElementException;
        }
        object = jk0_0.a(object, "Exception in undelivered element handler for ");
        undeliveredElementException = new RuntimeException((String)object, throwable2);
        return undeliveredElementException;
    }

    public static final String c(CharsetDecoder object, b93_0 object2, int n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object3 = "input";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        long l2 = n3;
        long l3 = object2.e().c;
        l2 = Math.min(l2, l3);
        n3 = (int)l2;
        StringBuilder stringBuilder = new StringBuilder(n3);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(stringBuilder, "dst");
        Intrinsics.checkNotNullParameter(object, string2);
        Object object4 = ((CharsetDecoder)object).charset();
        Intrinsics.checkNotNull(object4);
        object3 = Charsets.UTF_8;
        n3 = (int)(Intrinsics.areEqual(object4, object3) ? 1 : 0);
        if (n3 != 0) {
            object = Py3.b((b93_0)object2);
            stringBuilder.append((CharSequence)object);
        } else {
            af_2.c((b93_0)object2);
            Intrinsics.checkNotNullParameter(object2, string2);
            Intrinsics.checkNotNullParameter(object2, string2);
            n3 = -1;
            object2 = o93_0.b((b93_0)object2, n3);
            Intrinsics.checkNotNullParameter(object2, "array");
            object4 = ef_2.c;
            Intrinsics.checkNotNullParameter(object2, "byteArray");
            object4 = new ef_2((byte[])object2);
            Intrinsics.checkNotNullParameter(object, string2);
            object = ((CharsetDecoder)object).charset();
            Intrinsics.checkNotNull(object);
            Intrinsics.checkNotNullParameter(object4, string2);
            Intrinsics.checkNotNullParameter(object, "charset");
            object4 = new String((byte[])object2, (Charset)object);
            stringBuilder.append((CharSequence)object4);
        }
        return stringBuilder.toString();
    }
}

