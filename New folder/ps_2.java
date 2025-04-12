/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pS
 */
public final class ps_2 {
    public final InputStream a;
    public final CharsetDecoder b;
    public final ByteBuffer c;
    public boolean d;
    public char e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public ps_2(ny_2 object, Charset object2) {
        Intrinsics.checkNotNullParameter(object, "inputStream");
        String string2 = "charset";
        Intrinsics.checkNotNullParameter(object2, string2);
        this.a = object;
        object = ((Charset)object2).newDecoder();
        object2 = CodingErrorAction.REPLACE;
        this.b = object = ((CharsetDecoder)object).onMalformedInput((CodingErrorAction)object2).onUnmappableCharacter((CodingErrorAction)object2);
        object = ve_1.b;
        // MONITORENTER : object
        object2 = ((we_0)object).a;
        boolean bl2 = ((fp_2)object2).isEmpty();
        Object object3 = null;
        object2 = bl2 ? null : ((fp_2)object2).removeLast();
        object2 = (byte[])object2;
        if (object2 != null) {
            object3 = object2;
        }
        // MONITOREXIT : object
        if (object3 == null) {
            int n3 = 8196;
            object3 = new byte[n3];
        }
        this.c = object = ByteBuffer.wrap((byte[])object3);
        ((ByteBuffer)object).flip();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a(char[] object, int n3, int n4) {
        int n7;
        int n8;
        int n10;
        Intrinsics.checkNotNullParameter(object, "array");
        if (n4 == 0) {
            return 0;
        }
        if (n3 >= 0 && n3 < (n10 = ((Object)object).length) && n4 >= 0 && (n10 = n3 + n4) <= (n8 = ((Object)object).length)) {
            n10 = (int)(this.d ? 1 : 0);
            n8 = 1;
            if (n10 != 0) {
                n10 = this.e;
                object[n3] = n10;
                ++n3;
                this.d = false;
                if ((n4 += -1) == 0) {
                    return n8;
                }
                n10 = 1;
            } else {
                n10 = 0;
                Object var6_7 = null;
            }
            n7 = -1;
            if (n4 == n8) {
                n4 = (int)(this.d ? 1 : 0);
                if (n4 != 0) {
                    this.d = false;
                    n4 = this.e;
                } else {
                    n4 = 2;
                    char[] cArray = new char[n4];
                    int n14 = this.a(cArray, 0, n4);
                    if (n14 != n7) {
                        if (n14 != n8) {
                            if (n14 != n4) {
                                StringBuilder stringBuilder = new StringBuilder("Unreachable state: ");
                                stringBuilder.append(n14);
                                String string2 = stringBuilder.toString().toString();
                                object = new IllegalStateException(string2);
                                throw object;
                            }
                            n4 = cArray[n8];
                            this.e = (char)n4;
                            this.d = n8;
                            n4 = cArray[0];
                        } else {
                            n4 = cArray[0];
                        }
                    } else {
                        n4 = -1;
                    }
                }
                if (n4 == n7) {
                    if (n10 != 0) return n10;
                    return -1;
                }
                n4 = (char)n4;
                object[n3] = n4;
                return n10 + n8;
            }
            if ((n3 = ((Buffer)(object = CharBuffer.wrap((char[])object, n3, n4))).position()) != 0) {
                object = ((CharBuffer)object).slice();
            }
        } else {
            String string3 = ", ";
            StringBuilder stringBuilder = fQ2.a("Unexpected arguments: ", string3, string3, n3, n4);
            int n15 = ((Object)object).length;
            stringBuilder.append(n15);
            object = stringBuilder.toString();
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        Object object2 = object;
        int n16 = 0;
        object = null;
        while (true) {
            CoderResult coderResult;
            block38: {
                CharsetDecoder charsetDecoder;
                block37: {
                    block35: {
                        block34: {
                            int n17;
                            ByteBuffer byteBuffer;
                            block36: {
                                Object object3;
                                block33: {
                                    int n18;
                                    if ((n18 = (coderResult = (charsetDecoder = this.b).decode(byteBuffer = this.c, (CharBuffer)object2, n16 != 0)).isUnderflow()) == 0) break block34;
                                    if (n16 != 0 || (n17 = ((Buffer)object2).hasRemaining()) == 0) break block35;
                                    byteBuffer.compact();
                                    n17 = byteBuffer.limit();
                                    n18 = byteBuffer.position();
                                    if (n18 <= n17) {
                                        n17 -= n18;
                                    } else {
                                        n17 = 0;
                                        coderResult = null;
                                    }
                                    object3 = this.a;
                                    byte[] byArray = byteBuffer.array();
                                    int n19 = byteBuffer.arrayOffset() + n18;
                                    n17 = ((InputStream)object3).read(byArray, n19, n17);
                                    if (n17 >= 0) break block33;
                                    byteBuffer.flip();
                                    break block36;
                                }
                                object3 = "null cannot be cast to non-null type java.nio.Buffer";
                                Intrinsics.checkNotNull(byteBuffer, (String)object3);
                                ((Buffer)byteBuffer).position(n18 += n17);
                                n17 = byteBuffer.remaining();
                            }
                            if (n17 >= 0) continue;
                            n16 = ((Buffer)object2).position();
                            if (n16 != 0 || (n16 = (int)(byteBuffer.hasRemaining() ? 1 : 0)) != 0) {
                                charsetDecoder.reset();
                                n16 = 1;
                                continue;
                            }
                            break block37;
                            finally {
                                byteBuffer.flip();
                            }
                        }
                        n4 = (int)(coderResult.isOverflow() ? 1 : 0);
                        if (n4 == 0) break block38;
                        ((Buffer)object2).position();
                    }
                    n8 = n16;
                }
                if (n8 != 0) {
                    charsetDecoder.reset();
                }
                if ((n16 = ((Buffer)object2).position()) == 0) {
                    return n7 + n10;
                }
                n7 = ((Buffer)object2).position();
                return n7 + n10;
            }
            coderResult.throwException();
        }
    }
}

