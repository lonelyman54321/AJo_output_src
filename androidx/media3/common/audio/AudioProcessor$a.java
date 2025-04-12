/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common.audio;

import com.google.common.base.Objects;

public final class AudioProcessor$a {
    public static final AudioProcessor$a e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        AudioProcessor$a audioProcessor$a;
        int n3 = -1;
        e = audioProcessor$a = new AudioProcessor$a(n3, n3, n3);
    }

    public AudioProcessor$a(int n3, int n4, int n7) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        n3 = (int)(gz3.E(n7) ? 1 : 0);
        n3 = n3 != 0 ? gz3.t(n7, n4) : -1;
        this.d = n3;
    }

    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n4 = object instanceof AudioProcessor$a;
        if (n4 == 0) {
            return false;
        }
        object = (AudioProcessor$a)object;
        int n7 = this.a;
        n4 = ((AudioProcessor$a)object).a;
        if (n7 != n4 || (n4 = this.b) != (n7 = ((AudioProcessor$a)object).b) || (n4 = this.c) != (n3 = ((AudioProcessor$a)object).c)) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        Integer n3 = this.a;
        Integer n4 = this.b;
        Integer n7 = this.c;
        Object[] objectArray = new Object[]{n3, n4, n7};
        return Objects.hashCode(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioFormat[sampleRate=");
        int n3 = this.a;
        stringBuilder.append(n3);
        stringBuilder.append(", channelCount=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", encoding=");
        n3 = this.c;
        return tu.a(stringBuilder, n3, ']');
    }
}

