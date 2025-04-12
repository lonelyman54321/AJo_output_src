/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.d_0;
import androidx.datastore.preferences.protobuf.e_0;
import androidx.datastore.preferences.protobuf.f$a;
import androidx.datastore.preferences.protobuf.h_0;
import androidx.datastore.preferences.protobuf.i_0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.u$a;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/*
 * Renamed from androidx.datastore.preferences.protobuf.f
 */
public final class f_0
implements D {
    public final e_0 a;
    public int b;
    public int c;
    public int d = 0;

    public f_0(e_0 e_02) {
        p.a(e_02, "input");
        this.a = e_02;
        e_02.d = this;
    }

    public static void l(int n3) {
        if ((n3 &= 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    public static void m(int n3) {
        if ((n3 &= 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    public final void a(List list, st2_0 st2_02, i_0 i_02) {
        int n3 = this.b;
        int n4 = n3 & 7;
        int n7 = 3;
        if (n4 == n7) {
            block2: {
                Object object;
                do {
                    object = this.g(st2_02, i_02);
                    list.add(object);
                    object = this.a;
                    n7 = (int)(((e_0)object).d() ? 1 : 0);
                    if (n7 != 0 || (n7 = this.d) != 0) break block2;
                } while ((n4 = ((e_0)object).v()) == n3);
                this.d = n4;
            }
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void b(List list, st2_0 st2_02, i_0 i_02) {
        int n3 = this.b;
        int n4 = n3 & 7;
        int n7 = 2;
        if (n4 == n7) {
            block2: {
                Object object;
                do {
                    object = this.h(st2_02, i_02);
                    list.add(object);
                    object = this.a;
                    n7 = (int)(((e_0)object).d() ? 1 : 0);
                    if (n7 != 0 || (n7 = this.d) != 0) break block2;
                } while ((n4 = ((e_0)object).v()) == n3);
                this.d = n4;
            }
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final Object c(st2_0 st2_02, i_0 i_02) {
        this.k(3);
        return this.g(st2_02, i_02);
    }

    /*
     * Exception decompiling
     */
    public final void d(Map var1_1, u$a var2_3, i_0 var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [11, 10 : 134->138)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Object e(st2_0 st2_02, i_0 i_02) {
        this.k(2);
        return this.h(st2_02, i_02);
    }

    public final Object f(wH3 object, Class clazz, i_0 i_02) {
        int[] nArray = f$a.a;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new RuntimeException("unsupported field type.");
                throw object;
            }
            case 17: {
                return this.readUInt64();
            }
            case 16: {
                return this.readUInt32();
            }
            case 15: {
                return this.readStringRequireUtf8();
            }
            case 14: {
                return this.readSInt64();
            }
            case 13: {
                return this.readSInt32();
            }
            case 12: {
                return this.readSFixed64();
            }
            case 11: {
                return this.readSFixed32();
            }
            case 10: {
                this.k(2);
                object = GB2.c.a(clazz);
                return this.h((st2_0)object, i_02);
            }
            case 9: {
                return this.readInt64();
            }
            case 8: {
                return this.readInt32();
            }
            case 7: {
                return Float.valueOf(this.readFloat());
            }
            case 6: {
                return this.readFixed64();
            }
            case 5: {
                return this.readFixed32();
            }
            case 4: {
                return this.readEnum();
            }
            case 3: {
                return this.readDouble();
            }
            case 2: {
                return this.readBytes();
            }
            case 1: 
        }
        return this.readBool();
    }

    public final Object g(st2_0 object, i_0 i_02) {
        block7: {
            Object object2;
            int n3;
            int n4 = this.c;
            this.c = n3 = this.b >>> 3 << 3 | 4;
            try {
                object2 = object.newInstance();
            }
            catch (Throwable throwable) {
                this.c = n4;
                throw throwable;
            }
            object.a(object2, this, i_02);
            object.makeImmutable(object2);
            int n7 = this.b;
            int n8 = this.c;
            if (n7 != n8) break block7;
            this.c = n4;
            return object2;
        }
        object = InvalidProtocolBufferException.e();
        throw object;
    }

    public final int getFieldNumber() {
        int n3;
        int n4 = this.d;
        if (n4 != 0) {
            this.b = n4;
            n4 = 0;
            Object var2_2 = null;
            this.d = 0;
        } else {
            e_0 e_02 = this.a;
            this.b = n4 = e_02.v();
        }
        n4 = this.b;
        if (n4 != 0 && n4 != (n3 = this.c)) {
            return n4 >>> 3;
        }
        return -1 >>> 1;
    }

    public final int getTag() {
        return this.b;
    }

    public final Object h(st2_0 object, i_0 i_02) {
        e_0 e_02 = this.a;
        int n3 = e_02.w();
        int n4 = e_02.a;
        int n7 = e_02.b;
        if (n4 < n7) {
            int n8;
            n3 = e_02.f(n3);
            Object object2 = object.newInstance();
            e_02.a = n7 = e_02.a + 1;
            object.a(object2, this, i_02);
            object.makeImmutable(object2);
            e_02.a(0);
            e_02.a = n8 = e_02.a + -1;
            e_02.e(n3);
            return object2;
        }
        object = new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        throw object;
    }

    public final void i(List iterable, boolean n3) {
        int n4 = this.b & 7;
        int n7 = 2;
        if (n4 == n7) {
            int n8;
            n4 = iterable instanceof Dt1;
            e_0 e_02 = this.a;
            if (n4 != 0 && n3 == 0) {
                int n10;
                List list = iterable;
                list = (Dt1)iterable;
                do {
                    iterable = this.readBytes();
                    list.n((DF)iterable);
                    n10 = e_02.d();
                    if (n10 == 0) continue;
                    return;
                } while ((n10 = e_02.v()) == (n3 = this.b));
                this.d = n10;
                return;
            }
            do {
                String string2 = n3 != 0 ? this.readStringRequireUtf8() : this.readString();
                iterable.add(string2);
                n4 = (int)(e_02.d() ? 1 : 0);
                if (n4 == 0) continue;
                return;
            } while ((n4 = e_02.v()) == (n8 = this.b));
            this.d = n4;
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final void j(int n3) {
        e_0 e_02 = this.a;
        int n4 = e_02.c();
        if (n4 == n3) {
            return;
        }
        throw InvalidProtocolBufferException.f();
    }

    public final void k(int n3) {
        int n4 = this.b & 7;
        if (n4 == n3) {
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final boolean readBool() {
        this.k(0);
        return this.a.g();
    }

    public final void readBoolList(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof d_0;
                                n3 = 2;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (d_0)list;
                                n7 = this.b & 7;
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                n7 = e_02.w();
                                n3 = e_02.c() + n7;
                                do {
                                    n7 = (int)(e_02.g() ? 1 : 0);
                                    ((d_0)list2).addBoolean(n7 != 0);
                                } while ((n7 = e_02.c()) < n3);
                                this.j(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            n7 = (int)(e_02.g() ? 1 : 0);
                            ((d_0)list2).addBoolean(n7 != 0);
                            n7 = e_02.d();
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = e_02.v()) == (n3 = this.b));
                        this.d = n7;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    n3 = e_02.c() + n4;
                    do {
                        Boolean bl2 = e_02.g();
                        list.add(bl2);
                    } while ((n4 = e_02.c()) < n3);
                    this.j(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            Boolean bl3 = e_02.g();
            list.add(bl3);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final DF readBytes() {
        this.k(2);
        return this.a.h();
    }

    public final void readBytesList(List list) {
        int n3 = this.b & 7;
        int n4 = 2;
        if (n3 == n4) {
            Object object;
            do {
                object = this.readBytes();
                list.add(object);
                object = this.a;
                n4 = (int)(((e_0)object).d() ? 1 : 0);
                if (n4 == 0) continue;
                return;
            } while ((n3 = ((e_0)object).v()) == (n4 = this.b));
            this.d = n3;
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    public final double readDouble() {
        this.k(1);
        return this.a.i();
    }

    public final void readDoubleList(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    int n7;
                    block6: {
                        int n8;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof h_0;
                                n3 = 2;
                                n7 = 1;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (h_0)list;
                                n8 = this.b & 7;
                                if (n8 == n7) break block7;
                                if (n8 != n3) break block8;
                                n8 = e_02.w();
                                f_0.m(n8);
                                n3 = e_02.c() + n8;
                                do {
                                    double d2 = e_02.i();
                                    ((h_0)list2).addDouble(d2);
                                } while ((n8 = e_02.c()) < n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            double d5 = e_02.i();
                            ((h_0)list2).addDouble(d5);
                            n8 = (int)(e_02.d() ? 1 : 0);
                            if (n8 == 0) continue;
                            return;
                        } while ((n8 = e_02.v()) == (n3 = this.b));
                        this.d = n8;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == n7) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    f_0.m(n4);
                    n3 = e_02.c() + n4;
                    do {
                        double d7 = e_02.i();
                        Double d9 = d7;
                        list.add(d9);
                    } while ((n4 = e_02.c()) < n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            double d12 = e_02.i();
            Double d13 = d12;
            list.add(d13);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final int readEnum() {
        this.k(0);
        return this.a.j();
    }

    public final void readEnumList(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof o;
                                n3 = 2;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (o)list;
                                n7 = this.b & 7;
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                n7 = e_02.w();
                                n3 = e_02.c() + n7;
                                do {
                                    n7 = e_02.j();
                                    ((o)list2).addInt(n7);
                                } while ((n7 = e_02.c()) < n3);
                                this.j(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            n7 = e_02.j();
                            ((o)list2).addInt(n7);
                            n7 = (int)(e_02.d() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = e_02.v()) == (n3 = this.b));
                        this.d = n7;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    n3 = e_02.c() + n4;
                    do {
                        Integer n8 = e_02.j();
                        list.add(n8);
                    } while ((n4 = e_02.c()) < n3);
                    this.j(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            Integer n10 = e_02.j();
            list.add(n10);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final int readFixed32() {
        this.k(5);
        return this.a.k();
    }

    public final void readFixed32List(List list) {
        int n3 = list instanceof o;
        int n4 = 5;
        int n7 = 2;
        e_0 e_02 = this.a;
        if (n3 != 0) {
            List list2 = list;
            list2 = (o)list;
            int n8 = this.b & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        n8 = e_02.k();
                        ((o)list2).addInt(n8);
                        n8 = (int)(e_02.d() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = e_02.v()) == (n4 = this.b));
                    this.d = n8;
                    return;
                }
                throw InvalidProtocolBufferException.b();
            }
            n8 = e_02.w();
            f_0.l(n8);
            n4 = e_02.c();
            int n10 = n4 + n8;
            do {
                n8 = e_02.k();
                ((o)list2).addInt(n8);
            } while ((n8 = e_02.c()) < n10);
        } else {
            n3 = this.b & 7;
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        Integer n14 = e_02.k();
                        list.add(n14);
                        n3 = (int)(e_02.d() ? 1 : 0);
                        if (n3 == 0) continue;
                        return;
                    } while ((n3 = e_02.v()) == (n4 = this.b));
                    this.d = n3;
                    return;
                }
                throw InvalidProtocolBufferException.b();
            }
            n3 = e_02.w();
            f_0.l(n3);
            n4 = e_02.c() + n3;
            do {
                Integer n15 = e_02.k();
                list.add(n15);
            } while ((n3 = e_02.c()) < n4);
        }
    }

    public final long readFixed64() {
        this.k(1);
        return this.a.l();
    }

    public final void readFixed64List(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    int n7;
                    block6: {
                        int n8;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof t;
                                n3 = 2;
                                n7 = 1;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (t)list;
                                n8 = this.b & 7;
                                if (n8 == n7) break block7;
                                if (n8 != n3) break block8;
                                n8 = e_02.w();
                                f_0.m(n8);
                                n3 = e_02.c() + n8;
                                do {
                                    long l2 = e_02.l();
                                    ((t)list2).addLong(l2);
                                } while ((n8 = e_02.c()) < n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            long l3 = e_02.l();
                            ((t)list2).addLong(l3);
                            n8 = (int)(e_02.d() ? 1 : 0);
                            if (n8 == 0) continue;
                            return;
                        } while ((n8 = e_02.v()) == (n3 = this.b));
                        this.d = n8;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == n7) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    f_0.m(n4);
                    n3 = e_02.c() + n4;
                    do {
                        long l4 = e_02.l();
                        Long l7 = l4;
                        list.add(l7);
                    } while ((n4 = e_02.c()) < n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            long l8 = e_02.l();
            Long l12 = l8;
            list.add(l12);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final float readFloat() {
        this.k(5);
        return this.a.m();
    }

    public final void readFloatList(List list) {
        int n3 = list instanceof m;
        int n4 = 5;
        int n7 = 2;
        e_0 e_02 = this.a;
        if (n3 != 0) {
            List list2 = list;
            list2 = (m)list;
            int n8 = this.b & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        float f5 = e_02.m();
                        ((m)list2).addFloat(f5);
                        n8 = (int)(e_02.d() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = e_02.v()) == (n4 = this.b));
                    this.d = n8;
                    return;
                }
                throw InvalidProtocolBufferException.b();
            }
            n8 = e_02.w();
            f_0.l(n8);
            n4 = e_02.c();
            int n10 = n4 + n8;
            do {
                float f6 = e_02.m();
                ((m)list2).addFloat(f6);
            } while ((n8 = e_02.c()) < n10);
        } else {
            n3 = this.b & 7;
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        float f7 = e_02.m();
                        Float f8 = Float.valueOf(f7);
                        list.add(f8);
                        n3 = (int)(e_02.d() ? 1 : 0);
                        if (n3 == 0) continue;
                        return;
                    } while ((n3 = e_02.v()) == (n4 = this.b));
                    this.d = n3;
                    return;
                }
                throw InvalidProtocolBufferException.b();
            }
            n3 = e_02.w();
            f_0.l(n3);
            n4 = e_02.c() + n3;
            do {
                float f11 = e_02.m();
                Float f12 = Float.valueOf(f11);
                list.add(f12);
            } while ((n3 = e_02.c()) < n4);
        }
    }

    public final int readInt32() {
        this.k(0);
        return this.a.n();
    }

    public final void readInt32List(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof o;
                                n3 = 2;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (o)list;
                                n7 = this.b & 7;
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                n7 = e_02.w();
                                n3 = e_02.c() + n7;
                                do {
                                    n7 = e_02.n();
                                    ((o)list2).addInt(n7);
                                } while ((n7 = e_02.c()) < n3);
                                this.j(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            n7 = e_02.n();
                            ((o)list2).addInt(n7);
                            n7 = (int)(e_02.d() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = e_02.v()) == (n3 = this.b));
                        this.d = n7;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    n3 = e_02.c() + n4;
                    do {
                        Integer n8 = e_02.n();
                        list.add(n8);
                    } while ((n4 = e_02.c()) < n3);
                    this.j(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            Integer n10 = e_02.n();
            list.add(n10);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final long readInt64() {
        this.k(0);
        return this.a.o();
    }

    public final void readInt64List(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof t;
                                n3 = 2;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (t)list;
                                n7 = this.b & 7;
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                n7 = e_02.w();
                                n3 = e_02.c() + n7;
                                do {
                                    long l2 = e_02.o();
                                    ((t)list2).addLong(l2);
                                } while ((n7 = e_02.c()) < n3);
                                this.j(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            long l3 = e_02.o();
                            ((t)list2).addLong(l3);
                            n7 = (int)(e_02.d() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = e_02.v()) == (n3 = this.b));
                        this.d = n7;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    n3 = e_02.c() + n4;
                    do {
                        long l4 = e_02.o();
                        Long l7 = l4;
                        list.add(l7);
                    } while ((n4 = e_02.c()) < n3);
                    this.j(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            long l8 = e_02.o();
            Long l12 = l8;
            list.add(l12);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final int readSFixed32() {
        this.k(5);
        return this.a.p();
    }

    public final void readSFixed32List(List list) {
        int n3 = list instanceof o;
        int n4 = 5;
        int n7 = 2;
        e_0 e_02 = this.a;
        if (n3 != 0) {
            List list2 = list;
            list2 = (o)list;
            int n8 = this.b & 7;
            if (n8 != n7) {
                if (n8 == n4) {
                    do {
                        n8 = e_02.p();
                        ((o)list2).addInt(n8);
                        n8 = (int)(e_02.d() ? 1 : 0);
                        if (n8 == 0) continue;
                        return;
                    } while ((n8 = e_02.v()) == (n4 = this.b));
                    this.d = n8;
                    return;
                }
                throw InvalidProtocolBufferException.b();
            }
            n8 = e_02.w();
            f_0.l(n8);
            n4 = e_02.c();
            int n10 = n4 + n8;
            do {
                n8 = e_02.p();
                ((o)list2).addInt(n8);
            } while ((n8 = e_02.c()) < n10);
        } else {
            n3 = this.b & 7;
            if (n3 != n7) {
                if (n3 == n4) {
                    do {
                        Integer n14 = e_02.p();
                        list.add(n14);
                        n3 = (int)(e_02.d() ? 1 : 0);
                        if (n3 == 0) continue;
                        return;
                    } while ((n3 = e_02.v()) == (n4 = this.b));
                    this.d = n3;
                    return;
                }
                throw InvalidProtocolBufferException.b();
            }
            n3 = e_02.w();
            f_0.l(n3);
            n4 = e_02.c() + n3;
            do {
                Integer n15 = e_02.p();
                list.add(n15);
            } while ((n3 = e_02.c()) < n4);
        }
    }

    public final long readSFixed64() {
        this.k(1);
        return this.a.q();
    }

    public final void readSFixed64List(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    int n7;
                    block6: {
                        int n8;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof t;
                                n3 = 2;
                                n7 = 1;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (t)list;
                                n8 = this.b & 7;
                                if (n8 == n7) break block7;
                                if (n8 != n3) break block8;
                                n8 = e_02.w();
                                f_0.m(n8);
                                n3 = e_02.c() + n8;
                                do {
                                    long l2 = e_02.q();
                                    ((t)list2).addLong(l2);
                                } while ((n8 = e_02.c()) < n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            long l3 = e_02.q();
                            ((t)list2).addLong(l3);
                            n8 = (int)(e_02.d() ? 1 : 0);
                            if (n8 == 0) continue;
                            return;
                        } while ((n8 = e_02.v()) == (n3 = this.b));
                        this.d = n8;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == n7) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    f_0.m(n4);
                    n3 = e_02.c() + n4;
                    do {
                        long l4 = e_02.q();
                        Long l7 = l4;
                        list.add(l7);
                    } while ((n4 = e_02.c()) < n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            long l8 = e_02.q();
            Long l12 = l8;
            list.add(l12);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final int readSInt32() {
        this.k(0);
        return this.a.r();
    }

    public final void readSInt32List(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof o;
                                n3 = 2;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (o)list;
                                n7 = this.b & 7;
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                n7 = e_02.w();
                                n3 = e_02.c() + n7;
                                do {
                                    n7 = e_02.r();
                                    ((o)list2).addInt(n7);
                                } while ((n7 = e_02.c()) < n3);
                                this.j(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            n7 = e_02.r();
                            ((o)list2).addInt(n7);
                            n7 = (int)(e_02.d() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = e_02.v()) == (n3 = this.b));
                        this.d = n7;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    n3 = e_02.c() + n4;
                    do {
                        Integer n8 = e_02.r();
                        list.add(n8);
                    } while ((n4 = e_02.c()) < n3);
                    this.j(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            Integer n10 = e_02.r();
            list.add(n10);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final long readSInt64() {
        this.k(0);
        return this.a.s();
    }

    public final void readSInt64List(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof t;
                                n3 = 2;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (t)list;
                                n7 = this.b & 7;
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                n7 = e_02.w();
                                n3 = e_02.c() + n7;
                                do {
                                    long l2 = e_02.s();
                                    ((t)list2).addLong(l2);
                                } while ((n7 = e_02.c()) < n3);
                                this.j(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            long l3 = e_02.s();
                            ((t)list2).addLong(l3);
                            n7 = (int)(e_02.d() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = e_02.v()) == (n3 = this.b));
                        this.d = n7;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    n3 = e_02.c() + n4;
                    do {
                        long l4 = e_02.s();
                        Long l7 = l4;
                        list.add(l7);
                    } while ((n4 = e_02.c()) < n3);
                    this.j(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            long l8 = e_02.s();
            Long l12 = l8;
            list.add(l12);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final String readString() {
        this.k(2);
        return this.a.t();
    }

    public final void readStringList(List list) {
        this.i(list, false);
    }

    public final void readStringListRequireUtf8(List list) {
        this.i(list, true);
    }

    public final String readStringRequireUtf8() {
        this.k(2);
        return this.a.u();
    }

    public final int readUInt32() {
        this.k(0);
        return this.a.w();
    }

    public final void readUInt32List(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof o;
                                n3 = 2;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (o)list;
                                n7 = this.b & 7;
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                n7 = e_02.w();
                                n3 = e_02.c() + n7;
                                do {
                                    n7 = e_02.w();
                                    ((o)list2).addInt(n7);
                                } while ((n7 = e_02.c()) < n3);
                                this.j(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            n7 = e_02.w();
                            ((o)list2).addInt(n7);
                            n7 = (int)(e_02.d() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = e_02.v()) == (n3 = this.b));
                        this.d = n7;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    n3 = e_02.c() + n4;
                    do {
                        Integer n8 = e_02.w();
                        list.add(n8);
                    } while ((n4 = e_02.c()) < n3);
                    this.j(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            Integer n10 = e_02.w();
            list.add(n10);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final long readUInt64() {
        this.k(0);
        return this.a.x();
    }

    public final void readUInt64List(List list) {
        e_0 e_02;
        int n3;
        int n4;
        block10: {
            block11: {
                block9: {
                    block6: {
                        int n7;
                        List list2;
                        block7: {
                            block8: {
                                n4 = list instanceof t;
                                n3 = 2;
                                e_02 = this.a;
                                if (n4 == 0) break block6;
                                list2 = list;
                                list2 = (t)list;
                                n7 = this.b & 7;
                                if (n7 == 0) break block7;
                                if (n7 != n3) break block8;
                                n7 = e_02.w();
                                n3 = e_02.c() + n7;
                                do {
                                    long l2 = e_02.x();
                                    ((t)list2).addLong(l2);
                                } while ((n7 = e_02.c()) < n3);
                                this.j(n3);
                                break block9;
                            }
                            throw InvalidProtocolBufferException.b();
                        }
                        do {
                            long l3 = e_02.x();
                            ((t)list2).addLong(l3);
                            n7 = (int)(e_02.d() ? 1 : 0);
                            if (n7 == 0) continue;
                            return;
                        } while ((n7 = e_02.v()) == (n3 = this.b));
                        this.d = n7;
                        return;
                    }
                    n4 = this.b & 7;
                    if (n4 == 0) break block10;
                    if (n4 != n3) break block11;
                    n4 = e_02.w();
                    n3 = e_02.c() + n4;
                    do {
                        long l4 = e_02.x();
                        Long l7 = l4;
                        list.add(l7);
                    } while ((n4 = e_02.c()) < n3);
                    this.j(n3);
                }
                return;
            }
            throw InvalidProtocolBufferException.b();
        }
        do {
            long l8 = e_02.x();
            Long l12 = l8;
            list.add(l12);
            n4 = (int)(e_02.d() ? 1 : 0);
            if (n4 == 0) continue;
            return;
        } while ((n4 = e_02.v()) == (n3 = this.b));
        this.d = n4;
    }

    public final boolean skipField() {
        int n3;
        e_0 e_02 = this.a;
        int n4 = e_02.d();
        if (n4 == 0 && (n4 = this.b) != (n3 = this.c)) {
            return e_02.y(n4);
        }
        return false;
    }
}

