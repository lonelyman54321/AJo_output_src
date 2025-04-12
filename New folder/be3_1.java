/*
 * Decompiled with CFR 0.152.
 */
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from Be3
 */
public final class be3_1 {
    public static String a(b93_0 object, Charset object2, int n3) {
        if ((n3 &= 1) != 0) {
            object2 = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "charset");
        Charset charset = Charsets.UTF_8;
        n3 = (int)(Intrinsics.areEqual(object2, charset) ? 1 : 0);
        if (n3 != 0) {
            object = Py3.b((b93_0)object);
        } else {
            object2 = ((Charset)object2).newDecoder();
            n3 = -1 >>> 1;
            object = hz0_2.c((CharsetDecoder)object2, (b93_0)object, n3);
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final byte[] b(String object, Charset object2) {
        block2: {
            block4: {
                int n3;
                block3: {
                    Object object3 = "<this>";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    Intrinsics.checkNotNullParameter(object2, "charset");
                    Object object4 = Charsets.UTF_8;
                    int n4 = Intrinsics.areEqual(object2, object4);
                    if (n4 == 0) break block2;
                    n3 = ((String)object).length();
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    object3 = x0_0.a;
                    n4 = ((String)object).length();
                    object3.getClass();
                    X0$a.a(0, n3, n4);
                    object3 = ((Charset)object4).newEncoder();
                    object4 = CodingErrorAction.REPORT;
                    object3 = ((CharsetEncoder)object3).onMalformedInput((CodingErrorAction)object4).onUnmappableCharacter((CodingErrorAction)object4);
                    object = CharBuffer.wrap((CharSequence)object, 0, n3);
                    object = ((CharsetEncoder)object3).encode((CharBuffer)object);
                    n3 = (int)(((ByteBuffer)object).hasArray() ? 1 : 0);
                    if (n3 == 0 || (n3 = ((ByteBuffer)object).arrayOffset()) != 0) break block3;
                    n3 = ((Buffer)object).remaining();
                    object3 = ((ByteBuffer)object).array();
                    Intrinsics.checkNotNull(object3);
                    int n7 = ((Object)object3).length;
                    if (n3 == n7) break block4;
                }
                n3 = ((Buffer)object).remaining();
                object2 = new byte[n3];
                ((ByteBuffer)object).get((byte[])object2);
                return object2;
            }
            object = ((ByteBuffer)object).array();
            Intrinsics.checkNotNull(object);
            return object;
        }
        object2 = ((Charset)object2).newEncoder();
        int n8 = ((String)object).length();
        return os_2.a((CharsetEncoder)object2, (CharSequence)object, 0, n8);
    }
}

