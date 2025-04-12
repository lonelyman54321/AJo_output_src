/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class IY0 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a;
    public int b;

    public IY0() {
        int n3;
        this.a = n3 = -1;
        this.b = n3;
    }

    public final boolean a(String object) {
        block9: {
            Pattern pattern = c;
            boolean bl2 = ((Matcher)(object = pattern.matcher((CharSequence)object))).find();
            if (bl2) {
                String string2;
                bl2 = true;
                try {
                    string2 = ((Matcher)object).group(bl2 ? 1 : 0);
                }
                catch (NumberFormatException numberFormatException) {}
                int n3 = gz3.a;
                n3 = 16;
                int n4 = Integer.parseInt(string2, n3);
                int n7 = 2;
                object = ((Matcher)object).group(n7);
                int n8 = Integer.parseInt((String)object, n3);
                if (n4 <= 0 && n8 <= 0) break block9;
                this.a = n4;
                this.b = n8;
                return bl2;
            }
        }
        return false;
    }

    public final void b(Metadata metadata) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((Metadata$Entry[])(object = metadata.a)).length); ++i3) {
            boolean bl2;
            String string2;
            object = object[i3];
            n3 = object instanceof CommentFrame;
            String string3 = "iTunSMPB";
            if (n3 != 0) {
                object = (CommentFrame)object;
                string2 = object.c;
                n3 = string3.equals(string2) ? 1 : 0;
                if (n3 == 0 || !(bl2 = this.a((String)(object = object.d)))) continue;
                return;
            }
            n3 = object instanceof InternalFrame;
            if (n3 == 0) continue;
            object = (InternalFrame)object;
            String string4 = "com.apple.iTunes";
            string2 = object.b;
            n3 = string4.equals(string2) ? 1 : 0;
            if (n3 == 0 || (n3 = (int)(string3.equals(string2 = object.c) ? 1 : 0)) == 0 || !(bl2 = this.a((String)(object = object.d)))) continue;
            return;
        }
    }
}

