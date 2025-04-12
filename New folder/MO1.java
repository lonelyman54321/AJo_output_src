/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;

public final class MO1 {
    public static MdtaMetadataEntry a(Metadata metadata, String string2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((Metadata$Entry[])(object = metadata.a)).length); ++i3) {
            n3 = (object = object[i3]) instanceof MdtaMetadataEntry;
            if (n3 == 0) continue;
            object = (MdtaMetadataEntry)object;
            String string3 = object.a;
            n3 = string3.equals(string2) ? 1 : 0;
            if (n3 == 0) continue;
            return object;
        }
        return null;
    }

    public static ApicFrame b(Xm2 object) {
        int n3;
        int n4 = ((Xm2)object).i();
        int n7 = ((Xm2)object).i();
        if (n7 == (n3 = 1684108385)) {
            n7 = ((Xm2)object).i();
            Object object2 = JA.a;
            n3 = 13;
            if ((n7 &= 0xFFFFFF) == n3) {
                object2 = "image/jpeg";
            } else {
                n3 = 14;
                if (n7 == n3) {
                    object2 = "image/png";
                } else {
                    n3 = 0;
                    object2 = null;
                }
            }
            if (object2 == null) {
                CS1.a(n7, "Unrecognized cover art flags: ");
                return null;
            }
            ((Xm2)object).J(4);
            byte[] byArray = new byte[n4 += -16];
            ((Xm2)object).g(0, byArray, n4);
            object = new ApicFrame((String)object2, null, 3, byArray);
            return object;
        }
        Cx.f("Failed to parse cover art attribute");
        return null;
    }

    public static TextInformationFrame c(int n3, Xm2 object, String string2) {
        int n4;
        int n7 = ((Xm2)object).i();
        int n8 = ((Xm2)object).i();
        if (n8 == (n4 = 1684108385) && n7 >= (n8 = 22)) {
            ((Xm2)object).J(10);
            n7 = ((Xm2)object).C();
            if (n7 > 0) {
                Object object2 = hj0_0.a(n7, "");
                int n10 = ((Xm2)object).C();
                if (n10 > 0) {
                    String string3 = "/";
                    object2 = LO1.a(n10, (String)object2, string3);
                }
                object2 = ImmutableList.of(object2);
                object = new TextInformationFrame(string2, null, (ImmutableList)object2);
                return object;
            }
        }
        object = new StringBuilder("Failed to parse index/count attribute: ");
        String string4 = zq1_0.a(n3);
        ((StringBuilder)object).append(string4);
        Cx.f(((StringBuilder)object).toString());
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int d(Xm2 xm2) {
        int n3;
        int n4 = xm2.i();
        int n7 = xm2.i();
        if (n7 == (n3 = 1684108385)) {
            byte[] byArray;
            xm2.J(8);
            n7 = 1;
            if ((n4 += -16) == n7) return xm2.w();
            n7 = 2;
            if (n4 == n7) return xm2.C();
            n7 = 3;
            if (n4 == n7) return xm2.z();
            n7 = 4;
            if (n4 == n7 && (n4 = (byArray = xm2.a)[n7 = xm2.b] & 0x80) == 0) {
                return xm2.A();
            }
        }
        Cx.f("Failed to parse data atom to int");
        return -1;
    }

    public static Id3Frame e(int n3, String charSequence, Xm2 object, boolean bl2, boolean bl3) {
        int n4 = MO1.d((Xm2)object);
        if (bl3) {
            bl3 = true;
            n4 = Math.min(bl3 ? 1 : 0, n4);
        }
        bl3 = false;
        if (n4 >= 0) {
            Id3Frame id3Frame;
            if (bl2) {
                object = ImmutableList.of(Integer.toString(n4));
                id3Frame = new TextInformationFrame((String)charSequence, null, (ImmutableList)object);
            } else {
                String string2 = "und";
                object = Integer.toString(n4);
                id3Frame = new CommentFrame(string2, (String)charSequence, (String)object);
            }
            return id3Frame;
        }
        charSequence = new StringBuilder("Failed to parse uint8 attribute: ");
        String string3 = zq1_0.a(n3);
        ((StringBuilder)charSequence).append(string3);
        Cx.f(((StringBuilder)charSequence).toString());
        return null;
    }

    public static TextInformationFrame f(int n3, Xm2 object, String string2) {
        int n4;
        int n7 = ((Xm2)object).i();
        int n8 = ((Xm2)object).i();
        if (n8 == (n4 = 1684108385)) {
            ((Xm2)object).J(8);
            Object object2 = ((Xm2)object).s(n7 += -16);
            object2 = ImmutableList.of(object2);
            object = new TextInformationFrame(string2, null, (ImmutableList)object2);
            return object;
        }
        object = new StringBuilder("Failed to parse text attribute: ");
        String string3 = zq1_0.a(n3);
        ((StringBuilder)object).append(string3);
        Cx.f(((StringBuilder)object).toString());
        return null;
    }
}

