/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.L$a;
import androidx.datastore.preferences.protobuf.g_0;
import java.util.Arrays;

public final class I {
    public static final I f;
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    static {
        I i3;
        int[] nArray = new int[]{};
        Object[] objectArray = new Object[]{};
        f = i3 = new I(0, nArray, objectArray, false);
    }

    public I() {
        int n3 = 8;
        int[] nArray = new int[n3];
        Object[] objectArray = new Object[n3];
        this(0, nArray, objectArray, true);
    }

    public I(int n3, int[] nArray, Object[] objectArray, boolean bl2) {
        this.d = -1;
        this.a = n3;
        this.b = nArray;
        this.c = objectArray;
        this.e = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int a() {
        int n3 = this.d;
        int n4 = -1;
        if (n3 != n4) {
            return n3;
        }
        n3 = 0;
        IllegalStateException illegalStateException = null;
        n4 = 0;
        InvalidProtocolBufferException$InvalidWireTypeException invalidProtocolBufferException$InvalidWireTypeException = null;
        while (true) {
            block9: {
                block8: {
                    int n7;
                    Object object;
                    int n8;
                    block4: {
                        block5: {
                            block6: {
                                block7: {
                                    if (n3 >= (n8 = this.a)) {
                                        this.d = n4;
                                        return n4;
                                    }
                                    object = this.b;
                                    n8 = object[n3];
                                    n7 = n8 >>> 3;
                                    if ((n8 &= 7) == 0) break block4;
                                    int n10 = 1;
                                    if (n8 == n10) break block5;
                                    n10 = 2;
                                    if (n8 == n10) break block6;
                                    int n14 = 3;
                                    if (n8 == n14) break block7;
                                    n10 = 5;
                                    if (n8 != n10) {
                                        invalidProtocolBufferException$InvalidWireTypeException = InvalidProtocolBufferException.b();
                                        illegalStateException = new IllegalStateException(invalidProtocolBufferException$InvalidWireTypeException);
                                        throw illegalStateException;
                                    }
                                    object = (Integer)this.c[n3];
                                    object.getClass();
                                    n8 = CodedOutputStream.j(n7);
                                    break block8;
                                }
                                n8 = CodedOutputStream.x(n7) * 2;
                                I i3 = (I)this.c[n3];
                                n4 = n7 = i3.a() + n8 + n4;
                                break block9;
                            }
                            object = (DF)this.c[n3];
                            n8 = CodedOutputStream.f(n7, (DF)object);
                            break block8;
                        }
                        object = (Long)this.c[n3];
                        object.getClass();
                        n8 = CodedOutputStream.k(n7);
                        break block8;
                    }
                    object = (Long)this.c[n3];
                    long l2 = (Long)object;
                    n8 = CodedOutputStream.A(n7, l2);
                }
                n4 = n8 += n4;
            }
            ++n3;
        }
    }

    public final void b(int n3, Object object) {
        int n4 = this.e;
        if (n4 != 0) {
            int[] nArray;
            n4 = this.a;
            Object[] objectArray = this.b;
            int n7 = objectArray.length;
            if (n4 == n7) {
                n7 = 4;
                n7 = n4 < n7 ? 8 : n4 >> 1;
                this.b = objectArray = Arrays.copyOf(objectArray, n4 += n7);
                objectArray = this.c;
                nArray = Arrays.copyOf(objectArray, n4);
                this.c = nArray;
            }
            nArray = this.b;
            int n8 = this.a;
            nArray[n8] = n3;
            this.c[n8] = object;
            this.a = ++n8;
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final void c(L object) {
        int n3;
        int n4 = 1;
        int n7 = 3;
        int n8 = this.a;
        if (n8 == 0) {
            return;
        }
        L l2 = object;
        l2 = (g_0)object;
        l2.getClass();
        for (int i3 = 0; i3 < (n3 = this.a); i3 += n4) {
            long l3;
            Object object2 = this.b;
            n3 = object2[i3];
            Object object3 = this.c[i3];
            int n10 = n3 >>> 3;
            if ((n3 &= 7) != 0) {
                if (n3 != n4) {
                    int n14 = 2;
                    if (n3 != n14) {
                        if (n3 != n7) {
                            n14 = 5;
                            if (n3 == n14) {
                                object3 = (Integer)object3;
                                n3 = (Integer)object3;
                                ((g_0)l2).f(n10, n3);
                                continue;
                            }
                            InvalidProtocolBufferException$InvalidWireTypeException invalidProtocolBufferException$InvalidWireTypeException = InvalidProtocolBufferException.b();
                            object = new RuntimeException(invalidProtocolBufferException$InvalidWireTypeException);
                            throw object;
                        }
                        l2.getClass();
                        object2 = (Object)L$a.ASCENDING;
                        ((g_0)l2).r(n10);
                        object3 = (I)object3;
                        ((I)object3).c((L)object);
                        ((g_0)l2).d(n10);
                        continue;
                    }
                    object3 = (DF)object3;
                    ((g_0)l2).b(n10, (DF)object3);
                    continue;
                }
                object3 = (Long)object3;
                l3 = (Long)object3;
                ((g_0)l2).g(n10, l3);
                continue;
            }
            object3 = (Long)object3;
            l3 = (Long)object3;
            ((g_0)l2).k(n10, l3);
        }
    }

    public final boolean equals(Object objectArray) {
        block8: {
            boolean bl2 = true;
            if (this == objectArray) {
                return bl2;
            }
            if (objectArray == null) {
                return false;
            }
            int n3 = objectArray instanceof I;
            if (n3 == 0) {
                return false;
            }
            objectArray = (I)objectArray;
            n3 = this.a;
            int n4 = objectArray.a;
            if (n3 == n4) {
                int n7;
                int[] nArray = this.b;
                int[] nArray2 = objectArray.b;
                Object object = null;
                for (n7 = 0; n7 < n3; ++n7) {
                    int n8 = nArray[n7];
                    int n10 = nArray2[n7];
                    if (n8 == n10) {
                        continue;
                    }
                    break block8;
                }
                Object[] objectArray2 = this.c;
                objectArray = objectArray.c;
                n4 = this.a;
                nArray2 = null;
                for (int i3 = 0; i3 < n4; ++i3) {
                    object = objectArray2[i3];
                    Object object2 = objectArray[i3];
                    n7 = (int)(object.equals(object2) ? 1 : 0);
                    if (n7 != 0) {
                        continue;
                    }
                    break block8;
                }
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a;
        int n7 = (527 + n4) * 31;
        int[] nArray = this.b;
        int n8 = 0;
        int n10 = 17;
        Object object = null;
        int n14 = 17;
        for (n3 = 0; n3 < n4; ++n3) {
            n14 *= 31;
            int n15 = nArray[n3];
            n14 += n15;
        }
        n7 = (n7 + n14) * 31;
        Object[] objectArray = this.c;
        int n16 = this.a;
        while (n8 < n16) {
            n10 *= 31;
            object = objectArray[n8];
            n3 = object.hashCode();
            n10 += n3;
            ++n8;
        }
        return n7 + n10;
    }
}

