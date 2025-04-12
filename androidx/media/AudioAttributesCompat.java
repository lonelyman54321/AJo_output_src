/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.os.Build$VERSION
 *  android.util.SparseIntArray
 */
package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;

public class AudioAttributesCompat
implements qB3 {
    public static final /* synthetic */ int b;
    public AudioAttributesImpl a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        int n3 = 1;
        sparseIntArray.put(5, n3);
        int n4 = 2;
        sparseIntArray.put(6, n4);
        sparseIntArray.put(7, n4);
        sparseIntArray.put(8, n3);
        sparseIntArray.put(9, n3);
        sparseIntArray.put(10, n3);
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.a = audioAttributesImpl;
    }

    public static int b(int n3, int n4) {
        int n7 = n3 & 1;
        int n8 = 1;
        if (n7 == n8) {
            return 7;
        }
        n7 = 4;
        if ((n3 &= n7) == n7) {
            return 6;
        }
        n3 = 3;
        switch (n4) {
            default: {
                return n3;
            }
            case 13: {
                return n8;
            }
            case 11: {
                return 10;
            }
            case 6: {
                return 2;
            }
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                return 5;
            }
            case 4: {
                return n7;
            }
            case 3: {
                return 8;
            }
            case 2: {
                n3 = 0;
            }
            case 0: 
            case 1: 
            case 12: 
            case 14: 
            case 16: 
        }
        return n3;
    }

    public static AudioAttributesCompat c(AudioAttributes audioAttributes) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi21(audioAttributes);
            AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat(audioAttributesImplApi26);
            return audioAttributesCompat;
        }
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21(audioAttributes);
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat(audioAttributesImplApi21);
        return audioAttributesCompat;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof AudioAttributesCompat;
        boolean bl3 = false;
        if (!bl2) {
            return false;
        }
        object = (AudioAttributesCompat)object;
        AudioAttributesImpl audioAttributesImpl = this.a;
        if (audioAttributesImpl == null) {
            object = ((AudioAttributesCompat)object).a;
            if (object == null) {
                bl3 = true;
            }
            return bl3;
        }
        object = ((AudioAttributesCompat)object).a;
        return audioAttributesImpl.equals(object);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

