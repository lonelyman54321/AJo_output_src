/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.audio.AudioProcessor$a;
import com.google.common.collect.ImmutableList;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;

public final class a {
    public final ImmutableList a;
    public final ArrayList b;
    public ByteBuffer[] c;
    public boolean d;

    public a(ImmutableList abstractCollection) {
        this.a = abstractCollection;
        this.b = abstractCollection;
        Object object = new ByteBuffer[]{};
        this.c = object;
        object = AudioProcessor$a.e;
        this.d = false;
    }

    public final AudioProcessor$a a(AudioProcessor$a audioProcessor$a) {
        Object object = AudioProcessor$a.e;
        int n3 = audioProcessor$a.equals(object);
        if (n3 == 0) {
            Object object2;
            int n4;
            object = null;
            for (n3 = 0; n3 < (n4 = ((AbstractCollection)(object2 = this.a)).size()); ++n3) {
                object2 = (AudioProcessor)object2.get(n3);
                AudioProcessor$a audioProcessor$a2 = object2.f(audioProcessor$a);
                boolean bl2 = object2.isActive();
                if (!bl2) continue;
                audioProcessor$a = AudioProcessor$a.e;
                boolean bl3 = audioProcessor$a2.equals(audioProcessor$a) ^ true;
                ct3.f(bl3);
                audioProcessor$a = audioProcessor$a2;
            }
            return audioProcessor$a;
        }
        object = new AudioProcessor$UnhandledAudioFormatException(audioProcessor$a);
        throw object;
    }

    public final void b() {
        Object object;
        int n3;
        int n4;
        ArrayList arrayList = this.b;
        arrayList.clear();
        int n7 = 0;
        this.d = false;
        ByteBuffer[] byteBufferArray = null;
        for (n4 = 0; n4 < (n3 = ((AbstractCollection)(object = this.a)).size()); ++n4) {
            object = (AudioProcessor)object.get(n4);
            object.flush();
            n3 = (int)(object.isActive() ? 1 : 0);
            if (n3 == 0) continue;
            arrayList.add(object);
        }
        n4 = arrayList.size();
        byteBufferArray = new ByteBuffer[n4];
        this.c = byteBufferArray;
        while (n7 <= (n4 = this.c())) {
            byteBufferArray = this.c;
            byteBufferArray[n7] = object = ((AudioProcessor)arrayList.get(n7)).c();
            ++n7;
        }
    }

    public final int c() {
        return this.c.length + -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean d() {
        boolean bl2 = this.d;
        if (!bl2) return false;
        Object object = this.b;
        int n3 = this.c();
        bl2 = (object = (AudioProcessor)((ArrayList)object).get(n3)).b();
        if (!bl2) return false;
        object = this.c;
        n3 = this.c();
        bl2 = ((Buffer)(object = object[n3])).hasRemaining();
        if (bl2) return false;
        return true;
    }

    public final boolean e() {
        return this.b.isEmpty() ^ true;
    }

    public final boolean equals(Object object) {
        ImmutableList immutableList;
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof a;
        if (!bl3) {
            return false;
        }
        object = (a)object;
        ImmutableList immutableList2 = this.a;
        int n4 = immutableList2.size();
        if (n4 != (n3 = (immutableList = ((a)object).a).size())) {
            return false;
        }
        for (n4 = 0; n4 < (n3 = immutableList2.size()); ++n4) {
            Object e2;
            immutableList = immutableList2.get(n4);
            if (immutableList == (e2 = ((a)object).a.get(n4))) continue;
            return false;
        }
        return bl2;
    }

    public final void f(ByteBuffer byteBuffer) {
        int n3 = 1;
        while (n3 != 0) {
            int n4;
            n3 = 0;
            int n7 = 0;
            for (int i3 = 0; i3 <= (n4 = this.c()); ++i3) {
                Object object = this.c[i3];
                n4 = (int)(((Buffer)object).hasRemaining() ? 1 : 0);
                if (n4 != 0) continue;
                object = this.b;
                Object object2 = (AudioProcessor)((ArrayList)object).get(i3);
                int n8 = object2.b();
                if (n8 != 0) {
                    object2 = this.c[i3];
                    int n10 = ((Buffer)object2).hasRemaining();
                    if (n10 != 0 || i3 >= (n10 = this.c())) continue;
                    n10 = i3 + 1;
                    object = (AudioProcessor)((ArrayList)object).get(n10);
                    object.e();
                    continue;
                }
                if (i3 > 0) {
                    object = this.c;
                    n8 = i3 + -1;
                    object = object[n8];
                } else {
                    n4 = (int)(byteBuffer.hasRemaining() ? 1 : 0);
                    object = n4 != 0 ? byteBuffer : AudioProcessor.a;
                }
                n8 = ((Buffer)object).remaining();
                long l2 = n8;
                object2.d((ByteBuffer)object);
                ByteBuffer[] byteBufferArray = this.c;
                byteBufferArray[i3] = object2 = object2.c();
                n4 = ((Buffer)object).remaining();
                long l3 = n4;
                l2 -= l3;
                l3 = 0L;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 <= 0 && (n4 = (int)(((Buffer)(object = this.c[i3])).hasRemaining() ? 1 : 0)) == 0) {
                    n4 = 0;
                    object = null;
                } else {
                    n4 = 1;
                }
                n7 |= n4;
            }
            n3 = n7;
        }
    }

    public final void g() {
        Object object;
        int n3;
        Object object2 = null;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)(object = this.a)).size()); ++i3) {
            object = (AudioProcessor)object.get(i3);
            object.flush();
            object.reset();
        }
        object2 = new ByteBuffer[]{};
        this.c = object2;
        object2 = AudioProcessor$a.e;
        this.d = false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

