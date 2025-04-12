/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package androidx.emoji2.text;

import android.graphics.Typeface;
import androidx.emoji2.text.g$a;
import java.nio.ByteBuffer;

public final class g {
    public final fo1_1 a;
    public final char[] b;
    public final g$a c;
    public final Typeface d;

    public g(Typeface object, fo1_1 fo1_12) {
        Object object2;
        Object object3;
        int n3;
        this.d = object;
        this.a = fo1_12;
        super(1024);
        this.c = object;
        int n4 = 6;
        int n7 = fo1_12.a(n4);
        if (n7 != 0) {
            n3 = fo1_12.a;
            n7 += n3;
            object3 = fo1_12.b;
            n3 = ((ByteBuffer)object3).getInt(n7) + n7;
            object2 = fo1_12.b;
            n7 = ((ByteBuffer)object2).getInt(n3);
        } else {
            n7 = 0;
            object2 = null;
        }
        object2 = new char[n7 *= 2];
        this.b = object2;
        n4 = fo1_12.a(n4);
        if (n4 != 0) {
            n7 = fo1_12.a;
            n4 += n7;
            object2 = fo1_12.b;
            n7 = ((ByteBuffer)object2).getInt(n4) + n4;
            object = fo1_12.b;
            n4 = ((ByteBuffer)object).getInt(n7);
        } else {
            n4 = 0;
            object = null;
        }
        fo1_12 = null;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object4;
            object2 = new rt3(this, i3);
            object3 = ((rt3)object2).c();
            int n8 = ((di3_1)object3).a(4);
            if (n8 != 0) {
                object4 = ((di3_1)object3).b;
                n3 = ((di3_1)object3).a;
                n8 += n3;
                n3 = ((ByteBuffer)object4).getInt(n8);
            } else {
                n3 = 0;
                object3 = null;
            }
            n8 = i3 * 2;
            object4 = this.b;
            Character.toChars(n3, (char[])object4, n8);
            n3 = ((rt3)object2).b();
            n8 = 1;
            if (n3 > 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object3 = null;
            }
            object4 = "invalid metadata codepoint length";
            B41.a(n3 != 0, (String)object4);
            n3 = ((rt3)object2).b() - n8;
            g$a g$a = this.c;
            g$a.a((rt3)object2, 0, n3);
        }
    }
}

