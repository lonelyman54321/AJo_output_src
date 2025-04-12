/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public final class KE3 {
    public static int a(int n3) {
        int n4 = 0;
        while (n3 > 0) {
            ++n4;
            n3 >>>= 1;
        }
        return n4;
    }

    public static Metadata b(List object) {
        int n3;
        int n4 = 1;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < (n3 = object.size()); i3 += n4) {
            Object object2 = (String)object.get(i3);
            int n7 = 2;
            Object object3 = ((String)object2).split("=", n7);
            int n8 = ((String[])object3).length;
            if (n8 != n7) {
                object3 = "Failed to parse Vorbis comment: ";
                object2 = ((String)object3).concat((String)object2);
                Cx.f((String)object2);
                continue;
            }
            object2 = object3[0];
            Object object4 = "METADATA_BLOCK_PICTURE";
            n3 = ((String)object2).equals(object4) ? 1 : 0;
            if (n3 != 0) {
                object2 = object3[n4];
                object2 = Base64.decode((String)object2, (int)0);
                object3 = new Xm2((byte[])object2);
                object2 = PictureFrame.a((Xm2)object3);
                try {
                    arrayList.add(object2);
                }
                catch (RuntimeException runtimeException) {
                    object3 = "Failed to parse vorbis picture";
                    Cx.g((String)object3, runtimeException);
                }
                continue;
            }
            object4 = object3[0];
            object3 = object3[n4];
            object2 = new VorbisComment((String)object4, (String)object3);
            arrayList.add(object2);
        }
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            bl2 = false;
            object = null;
        } else {
            object = new Metadata(arrayList);
        }
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public static KE3$a c(Xm2 object, boolean bl2, boolean bl3) {
        int n3;
        void var2_5;
        long l2;
        long l3;
        long l4;
        int n4 = 0;
        if (bl2) {
            int n7 = 3;
            KE3.d(n7, (Xm2)object, false);
        }
        int n8 = (int)((Xm2)object).n();
        Charset charset = StandardCharsets.UTF_8;
        ((Xm2)object).u(n8, charset);
        long l7 = ((Xm2)object).n();
        int n10 = (int)l7;
        String[] stringArray = new String[n10];
        while ((l4 = (l3 = (l2 = (long)n4) - l7) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) {
            l2 = ((Xm2)object).n();
            int n14 = (int)l2;
            Object object2 = StandardCharsets.UTF_8;
            stringArray[n4] = object2 = ((Xm2)object).u(n14, (Charset)object2);
            ++n4;
        }
        if (var2_5 != false && (n3 = ((Xm2)object).w() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        object = new KE3$a(stringArray);
        return object;
    }

    public static boolean d(int n3, Xm2 object, boolean bl2) {
        int n4;
        int n7;
        int n8 = ((Xm2)object).a();
        if (n8 < (n7 = 7)) {
            if (bl2) {
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder("too short header: ");
            int n10 = ((Xm2)object).a();
            stringBuilder.append(n10);
            throw ParserException.a(stringBuilder.toString(), null);
        }
        n8 = ((Xm2)object).w();
        if (n8 != n3) {
            if (bl2) {
                return false;
            }
            object = new StringBuilder("expected header type ");
            String string2 = Integer.toHexString(n3);
            ((StringBuilder)object).append(string2);
            throw ParserException.a(((StringBuilder)object).toString(), null);
        }
        n3 = ((Xm2)object).w();
        if (n3 == (n8 = 118) && (n3 = ((Xm2)object).w()) == (n8 = 111) && (n3 = ((Xm2)object).w()) == (n8 = 114) && (n3 = ((Xm2)object).w()) == (n8 = 98) && (n3 = ((Xm2)object).w()) == (n8 = 105) && (n3 = ((Xm2)object).w()) == (n4 = 115)) {
            return true;
        }
        if (bl2) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}

