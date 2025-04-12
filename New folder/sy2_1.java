/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.CodedOutputStream$a;
import androidx.datastore.preferences.protobuf.CodedOutputStream$c;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$a;
import androidx.datastore.preferences.protobuf.v;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sy2
 */
public final class sy2_1
implements f03 {
    public static final sy2_1 a;

    static {
        sy2_1 sy2_12;
        a = sy2_12 = new Object();
    }

    public final Unit a(Object object, X53$b object2) {
        float f5;
        Object object3;
        int n3;
        object = ((my2_0)object).a();
        py2$a_0 py2$a_0 = py2_2.n();
        object = object.entrySet().iterator();
        while ((n3 = object.hasNext()) != 0) {
            block13: {
                Object object4;
                Object object5;
                block7: {
                    xo1_0 xo1_02;
                    boolean bl2;
                    block12: {
                        block11: {
                            block10: {
                                block9: {
                                    block8: {
                                        block6: {
                                            object3 = object.next();
                                            object5 = (my2$a)object3.getKey();
                                            object3 = object3.getValue();
                                            object5 = ((my2$a)object5).a;
                                            bl2 = object3 instanceof Boolean;
                                            if (!bl2) break block6;
                                            object4 = ry2_2.B();
                                            n3 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
                                            ((n$a)object4).g();
                                            xo1_02 = (ry2_2)((n$a)object4).b;
                                            ry2_2.p((ry2_2)xo1_02, n3 != 0);
                                            object3 = ((n$a)object4).e();
                                            object4 = "newBuilder().setBoolean(value).build()";
                                            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                                            object3 = (ry2_2)object3;
                                            break block7;
                                        }
                                        bl2 = object3 instanceof Float;
                                        if (!bl2) break block8;
                                        object4 = ry2_2.B();
                                        f5 = ((Number)object3).floatValue();
                                        ((n$a)object4).g();
                                        xo1_02 = (ry2_2)((n$a)object4).b;
                                        ry2_2.q((ry2_2)xo1_02, f5);
                                        object3 = ((n$a)object4).e();
                                        object4 = "newBuilder().setFloat(value).build()";
                                        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                                        object3 = (ry2_2)object3;
                                        break block7;
                                    }
                                    bl2 = object3 instanceof Double;
                                    if (!bl2) break block9;
                                    object4 = ry2_2.B();
                                    double d2 = ((Number)object3).doubleValue();
                                    ((n$a)object4).g();
                                    ry2_2.n((ry2_2)((n$a)object4).b, d2);
                                    object3 = ((n$a)object4).e();
                                    object4 = "newBuilder().setDouble(value).build()";
                                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                                    object3 = (ry2_2)object3;
                                    break block7;
                                }
                                bl2 = object3 instanceof Integer;
                                if (!bl2) break block10;
                                object4 = ry2_2.B();
                                n3 = ((Number)object3).intValue();
                                ((n$a)object4).g();
                                xo1_02 = (ry2_2)((n$a)object4).b;
                                ry2_2.r((ry2_2)xo1_02, n3);
                                object3 = ((n$a)object4).e();
                                object4 = "newBuilder().setInteger(value).build()";
                                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                                object3 = (ry2_2)object3;
                                break block7;
                            }
                            bl2 = object3 instanceof Long;
                            if (!bl2) break block11;
                            object4 = ry2_2.B();
                            long l2 = ((Number)object3).longValue();
                            ((n$a)object4).g();
                            ry2_2.k((ry2_2)((n$a)object4).b, l2);
                            object3 = ((n$a)object4).e();
                            object4 = "newBuilder().setLong(value).build()";
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                            object3 = (ry2_2)object3;
                            break block7;
                        }
                        bl2 = object3 instanceof String;
                        if (!bl2) break block12;
                        object4 = ry2_2.B();
                        object3 = (String)object3;
                        ((n$a)object4).g();
                        xo1_02 = (ry2_2)((n$a)object4).b;
                        ry2_2.l((ry2_2)xo1_02, (String)object3);
                        object3 = ((n$a)object4).e();
                        object4 = "newBuilder().setString(value).build()";
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                        object3 = (ry2_2)object3;
                        break block7;
                    }
                    bl2 = object3 instanceof Set;
                    if (!bl2) break block13;
                    object4 = ry2_2.B();
                    xo1_02 = qy2_2.o();
                    object3 = (Set)object3;
                    ((n$a)xo1_02).g();
                    qy2_2 qy2_22 = (qy2_2)((n$a)xo1_02).b;
                    qy2_2.l(qy2_22, (Iterable)object3);
                    ((n$a)object4).g();
                    ry2_2.m((ry2_2)((n$a)object4).b, (qy2$a)xo1_02);
                    object3 = ((n$a)object4).e();
                    object4 = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                    object3 = (ry2_2)object3;
                }
                py2$a_0.getClass();
                object5.getClass();
                py2$a_0.g();
                object4 = py2_2.l((py2_2)py2$a_0.b);
                ((v)object4).put(object5, object3);
                continue;
            }
            object2 = object3.getClass().getName();
            object2 = Intrinsics.stringPlus("PreferencesSerializer does not support type: ", object2);
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object = (py2_2)py2$a_0.e();
        int n4 = ((n)object).getSerializedSize();
        object3 = CodedOutputStream.b;
        n3 = 4096;
        f5 = 5.74E-42f;
        if (n4 > n3) {
            n4 = 4096;
        }
        object3 = new CodedOutputStream$c((X53$b)object2, n4);
        ((n)object).d((CodedOutputStream)object3);
        int n7 = ((CodedOutputStream$a)object3).f;
        if (n7 > 0) {
            ((CodedOutputStream$c)object3).e0();
        }
        return Unit.a;
    }

    public final kr1_1 b(FileInputStream object) {
        float f5;
        Object object2 = "input";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = py2_2.o((FileInputStream)object);
        object2 = "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }";
        try {
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            boolean bl2 = false;
            f5 = 0.0f;
            object2 = null;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            String string2 = "Unable to parse preferences proto.";
            Intrinsics.checkNotNullParameter(string2, "message");
            object2 = new IOException(string2, invalidProtocolBufferException);
            throw object2;
        }
        Object object3 = new my2$b[]{};
        Object string2 = "pairs";
        Intrinsics.checkNotNullParameter(object3, (String)string2);
        boolean bl2 = true;
        kr1_1 kr1_12 = new kr1_1(false, (int)(bl2 ? 1 : 0));
        object3 = Arrays.copyOf(object3, 0);
        Intrinsics.checkNotNullParameter(object3, (String)string2);
        kr1_12.c();
        int n3 = ((my2$b[])object3).length;
        if (n3 <= 0) {
            boolean bl3;
            object = ((py2_2)object).m();
            object2 = "preferencesProto.preferencesMap";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = object.entrySet().iterator();
            block14: while (bl3 = object.hasNext()) {
                Object object4;
                int n4;
                object2 = object.next();
                object3 = (String)object2.getKey();
                object2 = (ry2_2)object2.getValue();
                string2 = "name";
                Intrinsics.checkNotNullExpressionValue(object3, (String)string2);
                Intrinsics.checkNotNullExpressionValue(object2, "value");
                ry2$b ry2$b = ((ry2_2)object2).A();
                if (ry2$b == null) {
                    n4 = -1;
                } else {
                    object4 = sy2$a.$EnumSwitchMapping$0;
                    n4 = ry2$b.ordinal();
                    n4 = object4[n4];
                }
                object4 = "key";
                switch (n4) {
                    default: {
                        object = new NoWhenBranchMatchedException();
                        throw object;
                    }
                    case 8: {
                        object = new CorruptionException("Value not set.");
                        throw object;
                    }
                    case 7: {
                        Intrinsics.checkNotNullParameter(object3, (String)string2);
                        string2 = new my2$a((String)object3);
                        object2 = ((ry2_2)object2).z().n();
                        object3 = "value.stringSet.stringsList";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                        object2 = CollectionsKt.o0((Iterable)object2);
                        Intrinsics.checkNotNullParameter(string2, (String)object4);
                        kr1_12.d((my2$a)string2, object2);
                        continue block14;
                    }
                    case 6: {
                        Intrinsics.checkNotNullParameter(object3, (String)string2);
                        string2 = new my2$a((String)object3);
                        object2 = ((ry2_2)object2).y();
                        object3 = "value.string";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                        Intrinsics.checkNotNullParameter(string2, (String)object4);
                        kr1_12.d((my2$a)string2, object2);
                        continue block14;
                    }
                    case 5: {
                        Intrinsics.checkNotNullParameter(object3, (String)string2);
                        string2 = new my2$a((String)object3);
                        long l2 = ((ry2_2)object2).x();
                        object2 = l2;
                        Intrinsics.checkNotNullParameter(string2, (String)object4);
                        kr1_12.d((my2$a)string2, object2);
                        continue block14;
                    }
                    case 4: {
                        Intrinsics.checkNotNullParameter(object3, (String)string2);
                        string2 = new my2$a((String)object3);
                        bl3 = ((ry2_2)object2).w();
                        object2 = (int)(bl3 ? 1 : 0);
                        Intrinsics.checkNotNullParameter(string2, (String)object4);
                        kr1_12.d((my2$a)string2, object2);
                        continue block14;
                    }
                    case 3: {
                        Intrinsics.checkNotNullParameter(object3, (String)string2);
                        string2 = new my2$a((String)object3);
                        double d2 = ((ry2_2)object2).u();
                        object2 = d2;
                        Intrinsics.checkNotNullParameter(string2, (String)object4);
                        kr1_12.d((my2$a)string2, object2);
                        continue block14;
                    }
                    case 2: {
                        Intrinsics.checkNotNullParameter(object3, (String)string2);
                        string2 = new my2$a((String)object3);
                        f5 = ((ry2_2)object2).v();
                        object2 = Float.valueOf(f5);
                        Intrinsics.checkNotNullParameter(string2, (String)object4);
                        kr1_12.d((my2$a)string2, object2);
                        continue block14;
                    }
                    case 1: {
                        Intrinsics.checkNotNullParameter(object3, (String)string2);
                        string2 = new my2$a((String)object3);
                        bl3 = ((ry2_2)object2).s();
                        object2 = bl3;
                        Intrinsics.checkNotNullParameter(string2, (String)object4);
                        kr1_12.d((my2$a)string2, object2);
                        continue block14;
                    }
                    case -1: 
                }
                object = new CorruptionException("Value case is null.");
                throw object;
            }
            object2 = fh1_2.q(kr1_12.a());
            object = new kr1_1((Map)object2, bl2);
            return object;
        }
        object3[0].getClass();
        kr1_12.d(null, null);
        throw null;
    }

    public final kr1_1 getDefaultValue() {
        int n3 = 1;
        kr1_1 kr1_12 = new kr1_1(n3 != 0, n3);
        return kr1_12;
    }
}

