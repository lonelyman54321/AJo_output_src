/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase
implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    public final int a() {
        int n3 = this.d;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = this.c;
        n4 = this.a;
        return AudioAttributesCompat.b(n3, n4);
    }

    public final boolean equals(Object object) {
        int n3 = object instanceof AudioAttributesImplBase;
        boolean bl2 = false;
        if (n3 == 0) {
            return false;
        }
        object = (AudioAttributesImplBase)object;
        n3 = this.b;
        int n4 = ((AudioAttributesImplBase)object).b;
        if (n3 == n4) {
            int n7;
            int n8;
            n3 = this.c;
            n4 = ((AudioAttributesImplBase)object).c;
            int n10 = ((AudioAttributesImplBase)object).a();
            if (n10 == (n8 = 6)) {
                n4 |= 4;
            } else {
                n8 = 7;
                if (n10 == n8) {
                    n4 |= 1;
                }
            }
            if (n3 == (n4 &= 0x111) && (n3 = this.a) == (n4 = ((AudioAttributesImplBase)object).a) && (n3 = this.d) == (n7 = ((AudioAttributesImplBase)object).d)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final int hashCode() {
        Integer n3 = this.b;
        Integer n4 = this.c;
        Integer n7 = this.a;
        Integer n8 = this.d;
        Object[] objectArray = new Object[]{n3, n4, n7, n8};
        return Arrays.hashCode(objectArray);
    }

    public final String toString() {
        String string2 = "AudioAttributesCompat:";
        StringBuilder stringBuilder = new StringBuilder(string2);
        int n3 = this.d;
        int n4 = -1;
        if (n3 != n4) {
            stringBuilder.append(" stream=");
            n3 = this.d;
            stringBuilder.append(n3);
            string2 = " derived";
            stringBuilder.append(string2);
        }
        string2 = " usage=";
        stringBuilder.append(string2);
        n3 = this.a;
        n4 = AudioAttributesCompat.b;
        switch (n3) {
            default: {
                String string3 = "unknown usage ";
                string2 = hj0_0.a(n3, string3);
                break;
            }
            case 16: {
                string2 = "USAGE_ASSISTANT";
                break;
            }
            case 14: {
                string2 = "USAGE_GAME";
                break;
            }
            case 13: {
                string2 = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            }
            case 12: {
                string2 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            }
            case 11: {
                string2 = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            }
            case 10: {
                string2 = "USAGE_NOTIFICATION_EVENT";
                break;
            }
            case 9: {
                string2 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            }
            case 8: {
                string2 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            }
            case 7: {
                string2 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            }
            case 6: {
                string2 = "USAGE_NOTIFICATION_RINGTONE";
                break;
            }
            case 5: {
                string2 = "USAGE_NOTIFICATION";
                break;
            }
            case 4: {
                string2 = "USAGE_ALARM";
                break;
            }
            case 3: {
                string2 = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            }
            case 2: {
                string2 = "USAGE_VOICE_COMMUNICATION";
                break;
            }
            case 1: {
                string2 = "USAGE_MEDIA";
                break;
            }
            case 0: {
                string2 = "USAGE_UNKNOWN";
            }
        }
        stringBuilder.append(string2);
        stringBuilder.append(" content=");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(" flags=0x");
        string2 = Integer.toHexString(this.c).toUpperCase();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

