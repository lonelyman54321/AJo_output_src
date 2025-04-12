/*
 * Decompiled with CFR 0.152.
 */
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.n$a;
import androidx.datastore.preferences.protobuf.n$f;

/*
 * Renamed from ry2
 */
public final class ry2_2
extends n
implements xo1_0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final ry2_2 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile an2_0 PARSER;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    static {
        ry2_2 ry2_22;
        DEFAULT_INSTANCE = ry2_22 = new ry2_2();
        n.j(ry2_2.class, ry2_22);
    }

    public static ry2$a B() {
        ry2_2 ry2_22 = DEFAULT_INSTANCE;
        ry2_22.getClass();
        n$f n$f = n$f.NEW_BUILDER;
        return (ry2$a)((n$a)ry2_22.f(n$f));
    }

    public static void k(ry2_2 ry2_22, long l2) {
        ry2_22.valueCase_ = 4;
        Long l3 = l2;
        ry2_22.value_ = l3;
    }

    public static void l(ry2_2 ry2_22, String string2) {
        ry2_22.getClass();
        string2.getClass();
        ry2_22.valueCase_ = 5;
        ry2_22.value_ = string2;
    }

    public static void m(ry2_2 ry2_22, qy2$a xo1_02) {
        ry2_22.getClass();
        xo1_02 = xo1_02.e();
        ry2_22.value_ = xo1_02;
        ry2_22.valueCase_ = 6;
    }

    public static void n(ry2_2 ry2_22, double d2) {
        ry2_22.valueCase_ = 7;
        Double d5 = d2;
        ry2_22.value_ = d5;
    }

    public static /* synthetic */ ry2_2 o() {
        return DEFAULT_INSTANCE;
    }

    public static void p(ry2_2 ry2_22, boolean bl2) {
        ry2_22.valueCase_ = 1;
        Boolean bl3 = bl2;
        ry2_22.value_ = bl3;
    }

    public static void q(ry2_2 ry2_22, float f5) {
        ry2_22.valueCase_ = 2;
        Float f6 = Float.valueOf(f5);
        ry2_22.value_ = f6;
    }

    public static void r(ry2_2 ry2_22, int n3) {
        ry2_22.valueCase_ = 3;
        Integer n4 = n3;
        ry2_22.value_ = n4;
    }

    public static ry2_2 t() {
        return DEFAULT_INSTANCE;
    }

    public final ry2$b A() {
        return ry2$b.forNumber(this.valueCase_);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object f(n$f objectArray) {
        byte by2 = 1;
        Object object = oy2_0.a;
        int n3 = objectArray.ordinal();
        n3 = object[n3];
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                Class<ry2_2> clazz = ry2_2.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        PARSER = objectArray = new Object();
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[4];
                objectArray[0] = "value_";
                objectArray[by2] = "valueCase_";
                objectArray[2] = "bitField0_";
                objectArray[3] = qy2_2.class;
                object = DEFAULT_INSTANCE;
                return new vE2((wo1_1)object, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", objectArray);
            }
            case 2: {
                return new ry2$a();
            }
            case 1: 
        }
        return new ry2_2();
    }

    public final boolean s() {
        int n3 = this.valueCase_;
        int n4 = 1;
        if (n3 == n4) {
            return (Boolean)this.value_;
        }
        return false;
    }

    public final double u() {
        int n3 = this.valueCase_;
        int n4 = 7;
        if (n3 == n4) {
            return (Double)this.value_;
        }
        return 0.0;
    }

    public final float v() {
        int n3 = this.valueCase_;
        int n4 = 2;
        if (n3 == n4) {
            return ((Float)this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int w() {
        int n3 = this.valueCase_;
        int n4 = 3;
        if (n3 == n4) {
            return (Integer)this.value_;
        }
        return 0;
    }

    public final long x() {
        int n3 = this.valueCase_;
        int n4 = 4;
        if (n3 == n4) {
            return (Long)this.value_;
        }
        return 0L;
    }

    public final String y() {
        int n3 = this.valueCase_;
        int n4 = 5;
        String string2 = n3 == n4 ? (String)this.value_ : "";
        return string2;
    }

    public final qy2_2 z() {
        int n3 = this.valueCase_;
        int n4 = 6;
        if (n3 == n4) {
            return (qy2_2)this.value_;
        }
        return qy2_2.m();
    }
}

