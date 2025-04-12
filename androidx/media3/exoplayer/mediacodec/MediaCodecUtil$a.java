/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package androidx.media3.exoplayer.mediacodec;

import android.text.TextUtils;

public final class MediaCodecUtil$a {
    public final String a;
    public final boolean b;
    public final boolean c;

    public MediaCodecUtil$a(String string2, boolean bl2, boolean bl3) {
        this.a = string2;
        this.b = bl2;
        this.c = bl3;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = object.getClass()) == (object2 = MediaCodecUtil$a.class)) {
            boolean bl3;
            boolean bl4;
            object = (MediaCodecUtil$a)object;
            object3 = this.a;
            object2 = ((MediaCodecUtil$a)object).a;
            boolean bl5 = TextUtils.equals((CharSequence)object3, (CharSequence)object2);
            if (!bl5 || (bl5 = this.b) != (bl4 = ((MediaCodecUtil$a)object).b) || (bl5 = this.c) != (bl3 = ((MediaCodecUtil$a)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = 31;
        int n4 = zy_2.b(n3, n3, string2);
        int n7 = this.b;
        int n8 = 1237;
        n7 = n7 != 0 ? 1231 : 1237;
        n4 = (n4 + n7) * 31;
        n3 = (int)(this.c ? 1 : 0);
        if (n3 != 0) {
            n8 = 1231;
        }
        return n4 + n8;
    }
}

