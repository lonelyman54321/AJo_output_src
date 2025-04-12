/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class C53$a {
    public static void a(zg3_2 object, Object[] object2) {
        String string2 = "statement";
        Intrinsics.checkNotNullParameter(object, string2);
        if (object2 == null) {
            return;
        }
        int n3 = ((Object[])object2).length;
        int n4 = 0;
        while (n4 < n3) {
            int n7;
            long l2;
            double d2;
            Object object3 = object2[n4];
            ++n4;
            if (object3 == null) {
                object.w0(n4);
                continue;
            }
            boolean bl2 = object3 instanceof byte[];
            if (bl2) {
                object3 = (byte[])object3;
                object.q0(n4, (byte[])object3);
                continue;
            }
            bl2 = object3 instanceof Float;
            if (bl2) {
                object3 = (Number)object3;
                float f5 = ((Number)object3).floatValue();
                d2 = f5;
                object.r(n4, d2);
                continue;
            }
            bl2 = object3 instanceof Double;
            if (bl2) {
                object3 = (Number)object3;
                d2 = ((Number)object3).doubleValue();
                object.r(n4, d2);
                continue;
            }
            bl2 = object3 instanceof Long;
            if (bl2) {
                object3 = (Number)object3;
                l2 = ((Number)object3).longValue();
                object.m0(n4, l2);
                continue;
            }
            bl2 = object3 instanceof Integer;
            if (bl2) {
                object3 = (Number)object3;
                n7 = ((Number)object3).intValue();
                l2 = n7;
                object.m0(n4, l2);
                continue;
            }
            bl2 = object3 instanceof Short;
            if (bl2) {
                object3 = (Number)object3;
                n7 = ((Number)object3).shortValue();
                l2 = n7;
                object.m0(n4, l2);
                continue;
            }
            bl2 = object3 instanceof Byte;
            if (bl2) {
                object3 = (Number)object3;
                n7 = ((Number)object3).byteValue();
                l2 = n7;
                object.m0(n4, l2);
                continue;
            }
            bl2 = object3 instanceof String;
            if (bl2) {
                object3 = (String)object3;
                object.c0(n4, (String)object3);
                continue;
            }
            bl2 = object3 instanceof Boolean;
            if (bl2) {
                n7 = ((Boolean)(object3 = (Boolean)object3)).booleanValue() ? 1 : 0;
                if (n7 != 0) {
                    l2 = 1L;
                    d2 = Double.MIN_VALUE;
                } else {
                    l2 = 0L;
                    d2 = 0.0;
                }
                object.m0(n4, l2);
                continue;
            }
            object2 = new StringBuilder("Cannot bind ");
            ((StringBuilder)object2).append(object3);
            ((StringBuilder)object2).append(" at index ");
            ((StringBuilder)object2).append(n4);
            ((StringBuilder)object2).append(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
            object2 = ((StringBuilder)object2).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
    }
}

