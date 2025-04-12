/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.Collections;

public final class EO0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final EO0$a k;
    public final Metadata l;

    public EO0(int n3, int n4, int n7, int n8, int n10, int n14, int n15, long l2, EO0$a eO0$a, Metadata metadata) {
        this.a = n3;
        this.b = n4;
        this.c = n7;
        this.d = n8;
        this.e = n10;
        this.f = n3 = EO0.d(n10);
        this.g = n14;
        this.h = n15;
        this.i = n3 = EO0.a(n15);
        this.j = l2;
        this.k = eO0$a;
        this.l = metadata;
    }

    public EO0(byte[] byArray, int n3) {
        long l2;
        int n4 = byArray.length;
        Vm2 vm2 = new Vm2(byArray, n4);
        vm2.m(n3 *= 8);
        int n7 = 16;
        this.a = n3 = vm2.g(n7);
        this.b = n7 = vm2.g(n7);
        n7 = 24;
        this.c = n3 = vm2.g(n7);
        this.d = n7 = vm2.g(n7);
        this.e = n7 = vm2.g(20);
        this.f = n7 = EO0.d(n7);
        this.g = n7 = vm2.g(3) + 1;
        this.h = n7 = vm2.g(5) + 1;
        this.i = n7 = EO0.a(n7);
        this.j = l2 = vm2.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int n3) {
        int n4 = 8;
        if (n3 != n4) {
            n4 = 12;
            if (n3 != n4) {
                n4 = 16;
                if (n3 != n4) {
                    n4 = 20;
                    if (n3 != n4) {
                        n4 = 24;
                        if (n3 != n4) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int n3) {
        switch (n3) {
            default: {
                return -1;
            }
            case 192000: {
                return 3;
            }
            case 176400: {
                return 2;
            }
            case 96000: {
                return 11;
            }
            case 88200: {
                return 1;
            }
            case 48000: {
                return 10;
            }
            case 44100: {
                return 9;
            }
            case 32000: {
                return 8;
            }
            case 24000: {
                return 7;
            }
            case 22050: {
                return 6;
            }
            case 16000: {
                return 5;
            }
            case 8000: 
        }
        return 4;
    }

    public final long b() {
        long l2 = this.j;
        long l3 = 0L;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 == false) {
            l3 = -9223372036854775807L;
        } else {
            int n3 = this.e;
            l3 = n3;
            l3 = (l2 *= 1000000L) / l3;
        }
        return l3;
    }

    public final d c(byte[] object, Metadata metadata) {
        String string2;
        int n3;
        object[4] = n3 = -128;
        int n4 = this.d;
        if (n4 <= 0) {
            n4 = -1;
        }
        Object object2 = this.l;
        if (object2 != null) {
            metadata = ((Metadata)object2).b(metadata);
        }
        object2 = new d$a();
        ((d$a)object2).n = string2 = ip1_0.l("audio/flac");
        ((d$a)object2).o = n4;
        ((d$a)object2).C = n4 = this.g;
        ((d$a)object2).D = n4 = this.e;
        ((d$a)object2).E = n4 = gz3.s(this.h);
        object = Collections.singletonList(object);
        ((d$a)object2).q = object;
        ((d$a)object2).k = metadata;
        object = new d;
        object((d$a)object2);
        return object;
    }
}

