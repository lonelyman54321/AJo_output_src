/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class NN1$d
extends Lambda
implements Function1 {
    public static final NN1$d c;

    static {
        NN1$d nN1$d;
        c = nN1$d = new Lambda(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        Throwable throwable2;
        FileInputStream fileInputStream;
        block11: {
            String string2;
            long l2;
            Object object2;
            block8: {
                Object object3;
                block10: {
                    block9: {
                        object = (File)object;
                        object2 = null;
                        if (object == null) return object2;
                        Intrinsics.checkNotNullParameter(object, "<this>");
                        fileInputStream = new FileInputStream((File)object);
                        try {
                            int n3;
                            int n4;
                            l2 = ((File)object).length();
                            long l3 = Integer.MAX_VALUE;
                            string2 = "File ";
                            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                            if (l4 > 0) break block8;
                            int n7 = (int)l2;
                            object3 = new byte[n7];
                            Object var12_12 = null;
                            l4 = 0;
                            ih0_2 ih0_22 = null;
                            for (n3 = n7; n3 > 0 && (n4 = fileInputStream.read((byte[])object3, (int)l4, n3)) >= 0; n3 -= n4, l4 += n4) {
                            }
                            String string3 = "copyOf(...)";
                            if (n3 > 0) {
                                object3 = Arrays.copyOf((byte[])object3, (int)l4);
                                Intrinsics.checkNotNullExpressionValue(object3, string3);
                                break block9;
                            }
                            n3 = fileInputStream.read();
                            if (n3 == (l4 = (long)-1)) break block9;
                            int n8 = 8193;
                            ih0_22 = new ByteArrayOutputStream(n8);
                            ((OutputStream)ih0_22).write(n3);
                            ol3_0.b(fileInputStream, ih0_22);
                            n3 = ih0_22.size() + n7;
                            if (n3 < 0) break block10;
                            object = ih0_22.a();
                            object3 = Arrays.copyOf((byte[])object3, n3);
                            Intrinsics.checkNotNullExpressionValue(object3, string3);
                            n3 = ih0_22.size();
                            rp_1.g((byte[])object, n7, (byte[])object3, 0, n3);
                        }
                        catch (Throwable throwable2) {}
                    }
                    xj3_1.b(fileInputStream, null);
                    return object3;
                }
                object3 = new StringBuilder;
                ((StringBuilder)object3)();
                ((StringBuilder)object3).append(string2);
                ((StringBuilder)object3).append(object);
                object = " is too big to fit in memory.";
                ((StringBuilder)object3).append((String)object);
                object = ((StringBuilder)object3).toString();
                object2 = new OutOfMemoryError((String)object);
                throw object2;
                break block11;
            }
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            object = " is too big (";
            stringBuilder.append((String)object);
            stringBuilder.append(l2);
            object = " bytes) to fit in memory.";
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            object2 = new OutOfMemoryError((String)object);
            throw object2;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b(fileInputStream, throwable2);
            throw throwable3;
        }
    }
}

