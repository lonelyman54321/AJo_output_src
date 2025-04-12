/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.extractor.flv;

import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.extractor.flv.TagPayloadReader;
import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;

public final class b
extends TagPayloadReader {
    public final Xm2 b;
    public final Xm2 c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public b(wp3 object) {
        super((wp3)object);
        byte[] byArray = DS1.a;
        this.b = object = new Xm2(byArray);
        this.c = object = new Xm2(4);
    }

    public final boolean a(Xm2 object) {
        int n3 = ((Xm2)object).w();
        int n4 = n3 >> 4 & 0xF;
        int n7 = 7;
        if ((n3 &= 0xF) == n7) {
            this.g = n4;
            n3 = 5;
            if (n4 != n3) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            return n3 != 0;
        }
        object = hj0_0.a(n3, "Video format not supported: ");
        TagPayloadReader$UnsupportedFormatException tagPayloadReader$UnsupportedFormatException = new TagPayloadReader$UnsupportedFormatException((String)object);
        throw tagPayloadReader$UnsupportedFormatException;
    }

    public final boolean b(long l2, Xm2 object) {
        boolean bl2;
        int n3;
        int n4;
        int bl22 = ((Xm2)object).w();
        byte[] byArray = ((Xm2)object).a;
        int n7 = ((Xm2)object).b;
        ((Xm2)object).b = n4 = n7 + 1;
        int n8 = (byArray[n7] & 0xFF) << 24 >> 8;
        ((Xm2)object).b = n3 = n7 + 2;
        n4 = (byArray[n4] & 0xFF) << 8 | n8;
        ((Xm2)object).b = n7 += 3;
        long l3 = byArray[n3] & 0xFF | n4;
        long l4 = 1000L;
        long l7 = (l3 *= l4) + l2;
        int n10 = 1;
        wp3 wp32 = this.a;
        byArray = null;
        if (bl22 == 0 && (n7 = (int)(this.e ? 1 : 0)) == 0) {
            float f5;
            int n14;
            Object object2 = new byte[((Xm2)object).a()];
            Object object3 = new Xm2((byte[])object2);
            n4 = ((Xm2)object).a();
            ((Xm2)object).g(0, (byte[])object2, n4);
            object = iu_0.a((Xm2)object3);
            this.d = n14 = ((iu_0)object).b;
            object3 = new d$a();
            object2 = ip1_0.l("video/avc");
            ((d$a)object3).n = object2;
            object2 = ((iu_0)object).l;
            ((d$a)object3).j = object2;
            ((d$a)object3).u = n7 = ((iu_0)object).c;
            ((d$a)object3).v = n7 = ((iu_0)object).d;
            ((d$a)object3).y = f5 = ((iu_0)object).k;
            ((d$a)object3).q = object = ((iu_0)object).a;
            object = new d((d$a)object3);
            wp32.d((d)object);
            this.e = n10;
            return false;
        }
        if (bl22 == n10 && (bl2 = this.e)) {
            int n15;
            int n16 = this.g;
            int n17 = n16 == n10 ? 1 : 0;
            boolean bl3 = this.f;
            if (!bl3 && n17 == 0) {
                return false;
            }
            Xm2 xm2 = this.c;
            byte[] byArray2 = xm2.a;
            byArray2[0] = 0;
            byArray2[n10] = 0;
            byArray2[2] = 0;
            n7 = this.d;
            n4 = 4;
            n7 = 4 - n7;
            int n18 = 0;
            while ((n15 = ((Xm2)object).a()) > 0) {
                byte[] byArray3 = xm2.a;
                int n19 = this.d;
                ((Xm2)object).g(n7, byArray3, n19);
                xm2.I(0);
                n15 = xm2.A();
                Xm2 xm22 = this.b;
                xm22.I(0);
                wp32.f(n4, xm22);
                n18 += 4;
                wp32.f(n15, (Xm2)object);
                n18 += n15;
            }
            this.a.a(l7, n17, n18, 0, null);
            this.f = n10;
            return n10 != 0;
        }
        return false;
    }
}

