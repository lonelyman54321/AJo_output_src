/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.b$a;
import java.util.Arrays;

public final class b$a$a {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public b$a$a() {
        int n3 = 10;
        int[] nArray = new int[n3];
        this.a = nArray;
        nArray = new int[n3];
        this.b = nArray;
        this.c = 0;
        int[] nArray2 = new int[n3];
        this.d = nArray2;
        Object[] objectArray = new float[n3];
        this.e = objectArray;
        this.f = 0;
        n3 = 5;
        nArray2 = new int[n3];
        this.g = nArray2;
        objectArray = new String[n3];
        this.h = (String[])objectArray;
        this.i = 0;
        n3 = 4;
        nArray2 = new int[n3];
        this.j = nArray2;
        objectArray = new boolean[n3];
        this.k = (boolean[])objectArray;
        this.l = 0;
    }

    public final void a(float f5, int n3) {
        int n4;
        Object[] objectArray;
        int n7 = this.f;
        int[] nArray = this.d;
        int n8 = nArray.length;
        if (n7 >= n8) {
            n7 = nArray.length * 2;
            this.d = objectArray = Arrays.copyOf(nArray, n7);
            objectArray = this.e;
            n4 = objectArray.length * 2;
            objectArray = Arrays.copyOf((float[])objectArray, n4);
            this.e = objectArray;
        }
        objectArray = this.d;
        n4 = this.f;
        objectArray[n4] = n3;
        float[] fArray = this.e;
        this.f = n7 = n4 + 1;
        fArray[n4] = f5;
    }

    public final void b(int n3, int n4) {
        int n7;
        int[] nArray;
        int n8 = this.c;
        int[] nArray2 = this.a;
        int n10 = nArray2.length;
        if (n8 >= n10) {
            n8 = nArray2.length * 2;
            this.a = nArray = Arrays.copyOf(nArray2, n8);
            nArray = this.b;
            n7 = nArray.length * 2;
            nArray = Arrays.copyOf(nArray, n7);
            this.b = nArray;
        }
        nArray = this.a;
        n7 = this.c;
        nArray[n7] = n3;
        int[] nArray3 = this.b;
        this.c = n8 = n7 + 1;
        nArray3[n7] = n4;
    }

    public final void c(int n3, String string2) {
        int n4;
        Object[] objectArray;
        int n7 = this.i;
        int[] nArray = this.g;
        int n8 = nArray.length;
        if (n7 >= n8) {
            n7 = nArray.length * 2;
            this.g = objectArray = Arrays.copyOf(nArray, n7);
            objectArray = this.h;
            n4 = objectArray.length * 2;
            objectArray = (String[])Arrays.copyOf(objectArray, n4);
            this.h = (String[])objectArray;
        }
        objectArray = this.g;
        n4 = this.i;
        objectArray[n4] = n3;
        String[] stringArray = this.h;
        this.i = n7 = n4 + 1;
        stringArray[n4] = string2;
    }

    public final void d(int n3, boolean bl2) {
        int n4;
        Object[] objectArray;
        int n7 = this.l;
        int[] nArray = this.j;
        int n8 = nArray.length;
        if (n7 >= n8) {
            n7 = nArray.length * 2;
            this.j = objectArray = Arrays.copyOf(nArray, n7);
            objectArray = this.k;
            n4 = objectArray.length * 2;
            objectArray = Arrays.copyOf((boolean[])objectArray, n4);
            this.k = (boolean[])objectArray;
        }
        objectArray = this.j;
        n4 = this.l;
        objectArray[n4] = n3;
        boolean[] blArray = this.k;
        this.l = n7 = n4 + 1;
        blArray[n4] = bl2;
    }

    public final void e(b$a b$a) {
        int n3;
        int n4;
        int n7;
        Object object;
        Object object2;
        int n8;
        int n10;
        int n14 = 1;
        int n15 = 0;
        Object object3 = null;
        for (n10 = 0; n10 < (n8 = this.c); n10 += n14) {
            object2 = this.a;
            n8 = object2[n10];
            object = this.b;
            n7 = object[n10];
            n4 = 6;
            if (n8 != n4) {
                n4 = 7;
                if (n8 != n4) {
                    n4 = 8;
                    if (n8 != n4) {
                        n4 = 27;
                        if (n8 != n4) {
                            n4 = 28;
                            if (n8 != n4) {
                                n4 = 41;
                                if (n8 != n4) {
                                    n4 = 42;
                                    if (n8 != n4) {
                                        n4 = 61;
                                        if (n8 != n4) {
                                            n4 = 62;
                                            if (n8 != n4) {
                                                n4 = 72;
                                                if (n8 != n4) {
                                                    n4 = 73;
                                                    if (n8 != n4) {
                                                        n4 = 88;
                                                        if (n8 != n4) {
                                                            n4 = 89;
                                                            if (n8 != n4) {
                                                                n4 = 2;
                                                                if (n8 != n4) {
                                                                    n4 = 31;
                                                                    if (n8 != n4) {
                                                                        n4 = 34;
                                                                        if (n8 != n4) {
                                                                            n4 = 38;
                                                                            if (n8 != n4) {
                                                                                n4 = 64;
                                                                                if (n8 != n4) {
                                                                                    n4 = 66;
                                                                                    if (n8 != n4) {
                                                                                        n4 = 76;
                                                                                        if (n8 != n4) {
                                                                                            n4 = 78;
                                                                                            if (n8 != n4) {
                                                                                                n4 = 97;
                                                                                                if (n8 != n4) {
                                                                                                    n4 = 93;
                                                                                                    if (n8 != n4) {
                                                                                                        n4 = 94;
                                                                                                        if (n8 != n4) {
                                                                                                            block0 : switch (n8) {
                                                                                                                default: {
                                                                                                                    switch (n8) {
                                                                                                                        default: {
                                                                                                                            switch (n8) {
                                                                                                                                default: {
                                                                                                                                    switch (n8) {
                                                                                                                                        default: {
                                                                                                                                            break block0;
                                                                                                                                        }
                                                                                                                                        case 84: {
                                                                                                                                            object2 = b$a.d;
                                                                                                                                            object2.j = n7;
                                                                                                                                            break block0;
                                                                                                                                        }
                                                                                                                                        case 83: {
                                                                                                                                            object2 = b$a.f;
                                                                                                                                            object2.i = n7;
                                                                                                                                            break block0;
                                                                                                                                        }
                                                                                                                                        case 82: 
                                                                                                                                    }
                                                                                                                                    object2 = b$a.d;
                                                                                                                                    object2.c = n7;
                                                                                                                                    break block0;
                                                                                                                                }
                                                                                                                                case 59: {
                                                                                                                                    object2 = b$a.e;
                                                                                                                                    object2.d0 = n7;
                                                                                                                                    break block0;
                                                                                                                                }
                                                                                                                                case 58: {
                                                                                                                                    object2 = b$a.e;
                                                                                                                                    object2.c0 = n7;
                                                                                                                                    break block0;
                                                                                                                                }
                                                                                                                                case 57: {
                                                                                                                                    object2 = b$a.e;
                                                                                                                                    object2.b0 = n7;
                                                                                                                                    break block0;
                                                                                                                                }
                                                                                                                                case 56: {
                                                                                                                                    object2 = b$a.e;
                                                                                                                                    object2.a0 = n7;
                                                                                                                                    break block0;
                                                                                                                                }
                                                                                                                                case 55: {
                                                                                                                                    object2 = b$a.e;
                                                                                                                                    object2.Z = n7;
                                                                                                                                    break block0;
                                                                                                                                }
                                                                                                                                case 54: 
                                                                                                                            }
                                                                                                                            object2 = b$a.e;
                                                                                                                            object2.Y = n7;
                                                                                                                            break block0;
                                                                                                                        }
                                                                                                                        case 24: {
                                                                                                                            object2 = b$a.e;
                                                                                                                            object2.G = n7;
                                                                                                                            break block0;
                                                                                                                        }
                                                                                                                        case 23: {
                                                                                                                            object2 = b$a.e;
                                                                                                                            object2.c = n7;
                                                                                                                            break block0;
                                                                                                                        }
                                                                                                                        case 22: {
                                                                                                                            object2 = b$a.c;
                                                                                                                            object2.b = n7;
                                                                                                                            break block0;
                                                                                                                        }
                                                                                                                        case 21: 
                                                                                                                    }
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.d = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 18: {
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.f = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 17: {
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.e = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 16: {
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.O = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 15: {
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.S = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 14: {
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.P = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 13: {
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.N = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 12: {
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.R = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 11: {
                                                                                                                    object2 = b$a.e;
                                                                                                                    object2.Q = n7;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            continue;
                                                                                                        }
                                                                                                        object2 = b$a.e;
                                                                                                        object2.T = n7;
                                                                                                        continue;
                                                                                                    }
                                                                                                    object2 = b$a.e;
                                                                                                    object2.M = n7;
                                                                                                    continue;
                                                                                                }
                                                                                                object2 = b$a.e;
                                                                                                object2.p0 = n7;
                                                                                                continue;
                                                                                            }
                                                                                            object2 = b$a.c;
                                                                                            object2.c = n7;
                                                                                            continue;
                                                                                        }
                                                                                        object2 = b$a.d;
                                                                                        object2.e = n7;
                                                                                        continue;
                                                                                    }
                                                                                    object2 = b$a.d;
                                                                                    object2.f = n7;
                                                                                    continue;
                                                                                }
                                                                                object2 = b$a.d;
                                                                                object2.b = n7;
                                                                                continue;
                                                                            }
                                                                            b$a.a = n7;
                                                                            continue;
                                                                        }
                                                                        object2 = b$a.e;
                                                                        object2.I = n7;
                                                                        continue;
                                                                    }
                                                                    object2 = b$a.e;
                                                                    object2.L = n7;
                                                                    continue;
                                                                }
                                                                object2 = b$a.e;
                                                                object2.J = n7;
                                                                continue;
                                                            }
                                                            object2 = b$a.d;
                                                            object2.m = n7;
                                                            continue;
                                                        }
                                                        object2 = b$a.d;
                                                        object2.l = n7;
                                                        continue;
                                                    }
                                                    object2 = b$a.e;
                                                    object2.h0 = n7;
                                                    continue;
                                                }
                                                object2 = b$a.e;
                                                object2.g0 = n7;
                                                continue;
                                            }
                                            object2 = b$a.e;
                                            object2.B = n7;
                                            continue;
                                        }
                                        object2 = b$a.e;
                                        object2.A = n7;
                                        continue;
                                    }
                                    object2 = b$a.e;
                                    object2.X = n7;
                                    continue;
                                }
                                object2 = b$a.e;
                                object2.W = n7;
                                continue;
                            }
                            object2 = b$a.e;
                            object2.H = n7;
                            continue;
                        }
                        object2 = b$a.e;
                        object2.F = n7;
                        continue;
                    }
                    object2 = b$a.e;
                    object2.K = n7;
                    continue;
                }
                object2 = b$a.e;
                object2.E = n7;
                continue;
            }
            object2 = b$a.e;
            object2.D = n7;
        }
        object3 = null;
        for (n10 = 0; n10 < (n8 = this.f); n10 += n14) {
            object2 = this.d;
            n8 = object2[n10];
            object = this.e;
            n3 = object[n10];
            n4 = 19;
            if (n8 != n4) {
                n4 = 20;
                if (n8 != n4) {
                    n4 = 37;
                    if (n8 != n4) {
                        n4 = 60;
                        if (n8 != n4) {
                            n4 = 63;
                            if (n8 != n4) {
                                n4 = 79;
                                if (n8 != n4) {
                                    n4 = 85;
                                    if (n8 != n4) {
                                        n4 = 39;
                                        if (n8 != n4) {
                                            n4 = 40;
                                            if (n8 != n4) {
                                                block29 : switch (n8) {
                                                    default: {
                                                        switch (n8) {
                                                            default: {
                                                                break block29;
                                                            }
                                                            case 70: {
                                                                object2 = b$a.e;
                                                                object2.f0 = n3;
                                                                break block29;
                                                            }
                                                            case 69: {
                                                                object2 = b$a.e;
                                                                object2.e0 = n3;
                                                                break block29;
                                                            }
                                                            case 68: {
                                                                object2 = b$a.c;
                                                                object2.e = n3;
                                                                break block29;
                                                            }
                                                            case 67: 
                                                        }
                                                        object2 = b$a.d;
                                                        object2.h = n3;
                                                        break;
                                                    }
                                                    case 53: {
                                                        object2 = b$a.f;
                                                        object2.l = n3;
                                                        break;
                                                    }
                                                    case 52: {
                                                        object2 = b$a.f;
                                                        object2.k = n3;
                                                        break;
                                                    }
                                                    case 51: {
                                                        object2 = b$a.f;
                                                        object2.j = n3;
                                                        break;
                                                    }
                                                    case 50: {
                                                        object2 = b$a.f;
                                                        object2.h = n3;
                                                        break;
                                                    }
                                                    case 49: {
                                                        object2 = b$a.f;
                                                        object2.g = n3;
                                                        break;
                                                    }
                                                    case 48: {
                                                        object2 = b$a.f;
                                                        object2.f = n3;
                                                        break;
                                                    }
                                                    case 47: {
                                                        object2 = b$a.f;
                                                        object2.e = n3;
                                                        break;
                                                    }
                                                    case 46: {
                                                        object2 = b$a.f;
                                                        object2.d = n3;
                                                        break;
                                                    }
                                                    case 45: {
                                                        object2 = b$a.f;
                                                        object2.c = n3;
                                                        break;
                                                    }
                                                    case 44: {
                                                        object2 = b$a.f;
                                                        object2.n = n3;
                                                        object2.m = n14;
                                                        break;
                                                    }
                                                    case 43: {
                                                        object2 = b$a.c;
                                                        object2.d = n3;
                                                        break;
                                                    }
                                                }
                                                continue;
                                            }
                                            object2 = b$a.e;
                                            object2.U = n3;
                                            continue;
                                        }
                                        object2 = b$a.e;
                                        object2.V = n3;
                                        continue;
                                    }
                                    object2 = b$a.d;
                                    object2.i = n3;
                                    continue;
                                }
                                object2 = b$a.d;
                                object2.g = n3;
                                continue;
                            }
                            object2 = b$a.e;
                            object2.C = n3;
                            continue;
                        }
                        object2 = b$a.f;
                        object2.b = n3;
                        continue;
                    }
                    object2 = b$a.e;
                    object2.y = n3;
                    continue;
                }
                object2 = b$a.e;
                object2.x = n3;
                continue;
            }
            object2 = b$a.e;
            object2.g = n3;
        }
        object3 = null;
        for (n10 = 0; n10 < (n8 = this.i); n10 += n14) {
            object2 = this.g;
            n8 = object2[n10];
            object = this.h[n10];
            n4 = 5;
            if (n8 != n4) {
                n4 = 65;
                if (n8 != n4) {
                    n4 = 74;
                    if (n8 != n4) {
                        n4 = 77;
                        if (n8 != n4) {
                            n4 = 90;
                            if (n8 != n4) continue;
                            object2 = b$a.d;
                            object2.k = object;
                            continue;
                        }
                        object2 = b$a.e;
                        object2.l0 = object;
                        continue;
                    }
                    object2 = b$a.e;
                    object2.k0 = object;
                    n7 = 0;
                    n3 = (int)0.0f;
                    object = null;
                    object2.j0 = null;
                    continue;
                }
                object2 = b$a.d;
                object2.d = object;
                continue;
            }
            object2 = b$a.e;
            object2.z = object;
        }
        while (n15 < (n10 = this.l)) {
            object3 = this.j;
            n10 = object3[n15];
            object2 = this.k;
            n8 = object2[n15];
            object = androidx.constraintlayout.widget.b.h;
            n7 = 44;
            n3 = (int)6.2E-44f;
            if (n10 != n7) {
                n7 = 75;
                n3 = (int)1.05E-43f;
                if (n10 != n7) {
                    n7 = 80;
                    n3 = (int)1.12E-43f;
                    if (n10 != n7) {
                        n7 = 81;
                        n3 = (int)1.14E-43f;
                        if (n10 == n7) {
                            object3 = b$a.e;
                            object3.n0 = n8;
                        }
                    } else {
                        object3 = b$a.e;
                        object3.m0 = n8;
                    }
                } else {
                    object3 = b$a.e;
                    object3.o0 = n8;
                }
            } else {
                object3 = b$a.f;
                object3.m = n8;
            }
            n15 += n14;
        }
    }
}

