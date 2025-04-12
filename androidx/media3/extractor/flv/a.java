/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.extractor.flv;

import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.extractor.flv.TagPayloadReader;
import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

public final class a
extends TagPayloadReader {
    public static final int[] e = new int[]{5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public final boolean a(Xm2 object) {
        int n3 = this.b;
        int n4 = 1;
        if (n3 == 0) {
            int n7 = ((Xm2)object).w();
            this.d = n3 = n7 >> 4 & 0xF;
            wp3 wp32 = this.a;
            int n8 = 2;
            if (n3 == n8) {
                String string2;
                n7 = n7 >> n8 & 3;
                n7 = e[n7];
                d$a d$a = new d$a();
                d$a.n = string2 = ip1_0.l("audio/mpeg");
                d$a.C = n4;
                d$a.D = n7;
                object = d$a.a();
                wp32.d((d)object);
                this.c = n4;
            } else {
                n7 = 7;
                if (n3 != n7 && n3 != (n8 = 8)) {
                    n7 = 10;
                    if (n3 != n7) {
                        CharSequence charSequence = new StringBuilder("Audio format not supported: ");
                        n4 = this.d;
                        charSequence.append(n4);
                        charSequence = charSequence.toString();
                        object = new TagPayloadReader$UnsupportedFormatException((String)charSequence);
                        throw object;
                    }
                } else {
                    object = n3 == n7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                    d$a d$a = new d$a();
                    d$a.n = object = ip1_0.l((String)object);
                    d$a.C = n4;
                    d$a.D = n7 = 8000;
                    object = d$a.a();
                    wp32.d((d)object);
                    this.c = n4;
                }
            }
            this.b = n4;
        } else {
            ((Xm2)object).J(n4);
        }
        return n4 != 0;
    }

    public final boolean b(long l2, Xm2 xm2) {
        int n3;
        a a2 = this;
        Object object = xm2;
        int bl2 = this.d;
        int n4 = 2;
        wp3 wp32 = this.a;
        boolean bl3 = true;
        if (bl2 == n4) {
            int n7 = xm2.a();
            wp32.f(n7, xm2);
            this.a.a(l2, 1, n7, 0, null);
            return bl3;
        }
        boolean bl4 = xm2.w();
        boolean bl5 = false;
        if (!bl4 && (n3 = this.c) == 0) {
            int n8;
            int n10;
            String string2;
            int n14 = xm2.a();
            byte[] byArray = new byte[n14];
            xm2.g(0, byArray, n14);
            object = new Vm2(byArray, n14);
            object = y0.b((Vm2)object, false);
            d$a d$a = new d$a();
            d$a.n = string2 = ip1_0.l("audio/mp4a-latm");
            d$a.j = string2 = ((y0$a)object).c;
            d$a.C = n10 = ((y0$a)object).b;
            d$a.D = n8 = ((y0$a)object).a;
            object = Collections.singletonList(byArray);
            d$a.q = object;
            object = new d(d$a);
            wp32.d((d)object);
            this.c = bl3;
            return false;
        }
        n3 = a2.d;
        int n15 = 10;
        if (n3 == n15 && bl4 != bl3) {
            return false;
        }
        int n16 = xm2.a();
        wp32.f(n16, (Xm2)object);
        a2.a.a(l2, 1, n16, 0, null);
        return bl3;
    }
}

