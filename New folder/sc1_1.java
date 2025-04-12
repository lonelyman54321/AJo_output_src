/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import com.google.common.base.Ascii;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from Sc1
 */
public final class sc1_1
extends k0_0 {
    public static final Pattern c = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder a;
    public final CharsetDecoder b;

    public sc1_1() {
        CharsetDecoder charsetDecoder;
        this.a = charsetDecoder = StandardCharsets.UTF_8.newDecoder();
        this.b = charsetDecoder = StandardCharsets.ISO_8859_1.newDecoder();
    }

    public final Metadata Q(do1_2 do1_22, ByteBuffer object) {
        Object object2;
        String string2;
        Object object3;
        Object object4;
        int n3;
        block15: {
            do1_22 = null;
            n3 = 1;
            object4 = this.b;
            object3 = this.a;
            string2 = null;
            object2 = ((CharsetDecoder)object3).decode((ByteBuffer)object);
            try {
                object4 = ((CharBuffer)object2).toString();
                ((CharsetDecoder)object3).reset();
            }
            catch (Throwable throwable) {
                ((CharsetDecoder)object3).reset();
                ((ByteBuffer)object).rewind();
                throw throwable;
            }
            catch (CharacterCodingException characterCodingException) {
                ((CharsetDecoder)object3).reset();
                ((ByteBuffer)object).rewind();
                try {
                    object3 = ((CharsetDecoder)object4).decode((ByteBuffer)object);
                    object3 = ((CharBuffer)object3).toString();
                    object4 = object3;
                    break block15;
                }
                catch (CharacterCodingException characterCodingException2) {
                    object4 = null;
                }
                finally {
                    ((CharsetDecoder)object4).reset();
                    ((ByteBuffer)object).rewind();
                }
            }
            ((ByteBuffer)object).rewind();
        }
        int n4 = ((Buffer)object).limit();
        object3 = new byte[n4];
        ((ByteBuffer)object).get((byte[])object3);
        if (object4 == null) {
            object4 = new IcyInfo((byte[])object3, null, null);
            Metadata$Entry[] metadata$EntryArray = new Metadata$Entry[n3];
            metadata$EntryArray[0] = object4;
            object = new Metadata(metadata$EntryArray);
            return object;
        }
        object = c.matcher((CharSequence)object4);
        object4 = null;
        int n7 = 0;
        object2 = null;
        while ((n7 = (int)(((Matcher)object).find(n7) ? 1 : 0)) != 0) {
            object2 = ((Matcher)object).group(n3);
            int n8 = 2;
            String string3 = ((Matcher)object).group(n8);
            if (object2 != null) {
                object2 = Ascii.toLowerCase((String)object2);
                object2.getClass();
                String string4 = "streamurl";
                boolean bl2 = ((String)object2).equals(string4);
                if (!bl2) {
                    string4 = "streamtitle";
                    n7 = (int)(((String)object2).equals(string4) ? 1 : 0);
                    if (n7 != 0) {
                        string2 = string3;
                    }
                } else {
                    object4 = string3;
                }
            }
            n7 = ((Matcher)object).end();
        }
        object2 = new IcyInfo((byte[])object3, string2, (String)object4);
        Metadata$Entry[] metadata$EntryArray = new Metadata$Entry[n3];
        metadata$EntryArray[0] = object2;
        object = new Metadata(metadata$EntryArray);
        return object;
    }
}

