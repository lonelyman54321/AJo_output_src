/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.NetworkRequest
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class NI3 {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final LinkedHashSet a(byte[] byArray) {
        Throwable throwable3;
        ByteArrayInputStream byteArrayInputStream;
        block16: {
            Object object;
            LinkedHashSet<b60$a> linkedHashSet;
            block14: {
                Intrinsics.checkNotNullParameter(byArray, "bytes");
                linkedHashSet = new LinkedHashSet<b60$a>();
                int n3 = byArray.length;
                if (n3 == 0) {
                    return linkedHashSet;
                }
                byteArrayInputStream = new ByteArrayInputStream(byArray);
                byArray = null;
                object = new ObjectInputStream(byteArrayInputStream);
                {
                    Throwable throwable22222;
                    block15: {
                        catch (IOException iOException) {
                            break block14;
                        }
                        try {
                            int n4 = ((ObjectInputStream)object).readInt();
                            Object var7_9 = null;
                            for (int i3 = 0; i3 < n4; ++i3) {
                                String string2 = ((ObjectInputStream)object).readUTF();
                                string2 = Uri.parse((String)string2);
                                boolean bl2 = ((ObjectInputStream)object).readBoolean();
                                String string3 = "uri";
                                Intrinsics.checkNotNullExpressionValue(string2, string3);
                                b60$a b60$a = new b60$a(bl2, (Uri)string2);
                                linkedHashSet.add(b60$a);
                            }
                        }
                        catch (Throwable throwable22222) {
                            break block15;
                        }
                        Unit unit = Unit.a;
                        try {
                            xj3_1.b((Closeable)object, null);
                        }
                        catch (Throwable throwable3) {
                            break block16;
                        }
                    }
                    try {
                        throw throwable22222;
                    }
                    catch (Throwable throwable4) {}
                    {
                        xj3_1.b((Closeable)object, throwable22222);
                        throw throwable4;
                    }
                }
            }
            object = Unit.a;
            xj3_1.b(byteArrayInputStream, null);
            return linkedHashSet;
        }
        try {
            throw throwable3;
        }
        catch (Throwable throwable5) {
            xj3_1.b(byteArrayInputStream, throwable3);
            throw throwable5;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final byte[] b(dv1_0 object) {
        Throwable throwable3222222;
        Object object2;
        block14: {
            object2 = "requestCompat";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 28;
            int n7 = 0;
            Object var5_7 = null;
            if (n3 < n4) {
                return new byte[0];
            }
            object = (NetworkRequest)((dv1_0)object).a;
            if (object == null) {
                return new byte[0];
            }
            object2 = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)object2);
            {
                Throwable throwable22222222;
                block15: {
                    Object object3;
                    catch (Throwable throwable3222222) {
                        break block14;
                    }
                    try {
                        int[] nArray = eV1.b((NetworkRequest)object);
                        object = eV1.a((NetworkRequest)object);
                        object3 = nArray.length;
                        objectOutputStream.writeInt((int)object3);
                        for (int n8 : nArray) {
                            objectOutputStream.writeInt(n8);
                        }
                    }
                    catch (Throwable throwable22222222) {
                        break block15;
                    }
                    int n10 = ((Object)object).length;
                    objectOutputStream.writeInt(n10);
                    n10 = ((Object)object).length;
                    while (n7 < n10) {
                        object3 = object[n7];
                        objectOutputStream.writeInt((int)object3);
                        ++n7;
                    }
                    object = Unit.a;
                    object = null;
                    {
                        xj3_1.b(objectOutputStream, null);
                    }
                    xj3_1.b((Closeable)object2, null);
                    object = ((ByteArrayOutputStream)object2).toByteArray();
                    Intrinsics.checkNotNullExpressionValue(object, "outputStream.toByteArray()");
                    return object;
                }
                try {
                    throw throwable22222222;
                }
                catch (Throwable throwable4) {}
                {
                    xj3_1.b(objectOutputStream, throwable22222222);
                    throw throwable4;
                }
            }
        }
        try {
            throw throwable3222222;
        }
        catch (Throwable throwable5) {
            xj3_1.b((Closeable)object2, throwable3222222);
            throw throwable5;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Au c(int n3) {
        if (n3 == 0) return Au.EXPONENTIAL;
        int n4 = 1;
        if (n3 == n4) {
            return Au.LINEAR;
        }
        String string2 = Gj0.b(n3, "Could not convert ", " to BackoffPolicy");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final lV1 d(int n3) {
        lV1 lV12;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    n4 = 3;
                    if (n3 != n4) {
                        n4 = 4;
                        if (n3 != n4) {
                            n4 = Build.VERSION.SDK_INT;
                            int n7 = 30;
                            if (n4 >= n7 && n3 == (n4 = 5)) {
                                return lV1.TEMPORARILY_UNMETERED;
                            }
                            String string2 = Gj0.b(n3, "Could not convert ", " to NetworkType");
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                            throw illegalArgumentException;
                        }
                        lV12 = lV1.METERED;
                    } else {
                        lV12 = lV1.NOT_ROAMING;
                    }
                } else {
                    lV12 = lV1.UNMETERED;
                }
            } else {
                lV12 = lV1.CONNECTED;
            }
        } else {
            lV12 = lV1.NOT_REQUIRED;
        }
        return lV12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final sg2 e(int n3) {
        if (n3 == 0) return sg2.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        int n4 = 1;
        if (n3 == n4) {
            return sg2.DROP_WORK_REQUEST;
        }
        String string2 = Gj0.b(n3, "Could not convert ", " to OutOfQuotaPolicy");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final hI3$b f(int n3) {
        if (n3 == 0) return hI3$b.ENQUEUED;
        int n4 = 1;
        if (n3 == n4) return hI3$b.RUNNING;
        n4 = 2;
        if (n3 == n4) return hI3$b.SUCCEEDED;
        n4 = 3;
        if (n3 == n4) return hI3$b.FAILED;
        n4 = 4;
        if (n3 == n4) return hI3$b.BLOCKED;
        n4 = 5;
        if (n3 == n4) {
            return hI3$b.CANCELLED;
        }
        String string2 = Gj0.b(n3, "Could not convert ", " to State");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static final int g(lV1 object) {
        Intrinsics.checkNotNullParameter(object, "networkType");
        Object object2 = NI3$a.$EnumSwitchMapping$2;
        int n3 = object.ordinal();
        int n4 = object2[n3];
        n3 = 1;
        if (n4 != n3) {
            int n7 = 2;
            if (n4 != n7) {
                n3 = 3;
                if (n4 != n3) {
                    n7 = 4;
                    if (n4 != n7) {
                        n3 = 5;
                        if (n4 != n3) {
                            n4 = Build.VERSION.SDK_INT;
                            n7 = 30;
                            if (n4 < n7 || object != (object2 = (Object)((Object)lV1.TEMPORARILY_UNMETERED))) {
                                object2 = new IllegalArgumentException;
                                StringBuilder stringBuilder = new StringBuilder("Could not convert ");
                                stringBuilder.append(object);
                                stringBuilder.append(" to int");
                                object = stringBuilder.toString();
                                object2((String)object);
                                throw object2;
                            }
                        } else {
                            n3 = 4;
                        }
                    }
                } else {
                    n3 = 2;
                }
            }
        } else {
            n3 = 0;
            Object var5_6 = null;
        }
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final byte[] h(Set object) {
        Throwable throwable3222222;
        Object object2;
        block12: {
            object2 = "triggers";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            boolean bl2 = object.isEmpty();
            if (bl2) {
                return new byte[0];
            }
            object2 = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream((OutputStream)object2);
            {
                Throwable throwable22222222;
                block13: {
                    catch (Throwable throwable3222222) {
                        break block12;
                    }
                    try {
                        boolean bl3 = object.size();
                        objectOutputStream.writeInt(bl3 ? 1 : 0);
                        object = object.iterator();
                        while (bl3 = (boolean)object.hasNext()) {
                            Object object3 = object.next();
                            object3 = (b60$a)object3;
                            Object object4 = ((b60$a)object3).a;
                            object4 = object4.toString();
                            objectOutputStream.writeUTF((String)object4);
                            bl3 = ((b60$a)object3).b;
                            objectOutputStream.writeBoolean(bl3);
                        }
                    }
                    catch (Throwable throwable22222222) {
                        break block13;
                    }
                    object = Unit.a;
                    object = null;
                    {
                        xj3_1.b(objectOutputStream, null);
                    }
                    xj3_1.b((Closeable)object2, null);
                    object = ((ByteArrayOutputStream)object2).toByteArray();
                    Intrinsics.checkNotNullExpressionValue(object, "outputStream.toByteArray()");
                    return object;
                }
                try {
                    throw throwable22222222;
                }
                catch (Throwable throwable4) {}
                {
                    xj3_1.b(objectOutputStream, throwable22222222);
                    throw throwable4;
                }
            }
        }
        try {
            throw throwable3222222;
        }
        catch (Throwable throwable5) {
            xj3_1.b((Closeable)object2, throwable3222222);
            throw throwable5;
        }
    }

    public static final int i(hI3$b object) {
        Intrinsics.checkNotNullParameter(object, "state");
        int[] nArray = NI3$a.$EnumSwitchMapping$0;
        int n3 = object.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            case 6: {
                n3 = 5;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 0;
                object = null;
            }
        }
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final dv1_0 j(byte[] object) {
        Object object2 = "bytes";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        Object var4_5 = null;
        if (n3 >= n4 && (n3 = ((byte[])object).length) != 0) {
            Throwable throwable3222222;
            block13: {
                object2 = new ByteArrayInputStream((byte[])object);
                object = new ObjectInputStream;
                ((ObjectInputStream)object)((InputStream)object2);
                {
                    Throwable throwable22222222;
                    block14: {
                        int n7;
                        int[] nArray;
                        int n8;
                        int[] nArray2;
                        catch (Throwable throwable3222222) {
                            break block13;
                        }
                        try {
                            n4 = ((ObjectInputStream)object).readInt();
                            nArray2 = new int[n4];
                            n8 = 0;
                            nArray = null;
                            for (int i3 = 0; i3 < n4; ++i3) {
                                nArray2[i3] = n7 = ((ObjectInputStream)object).readInt();
                            }
                        }
                        catch (Throwable throwable22222222) {
                            break block14;
                        }
                        n4 = ((ObjectInputStream)object).readInt();
                        nArray = new int[n4];
                        while (n8 < n4) {
                            nArray[n8] = n7 = ((ObjectInputStream)object).readInt();
                            ++n8;
                        }
                        dv1_0 dv1_02 = aV1.a(nArray, nArray2);
                        {
                            xj3_1.b((Closeable)object, null);
                        }
                        xj3_1.b((Closeable)object2, null);
                        return dv1_02;
                    }
                    try {
                        throw throwable22222222;
                    }
                    catch (Throwable throwable4) {}
                    {
                        xj3_1.b((Closeable)object, throwable22222222);
                        throw throwable4;
                    }
                }
            }
            try {
                throw throwable3222222;
            }
            catch (Throwable throwable5) {
                xj3_1.b((Closeable)object2, throwable3222222);
                throw throwable5;
            }
        }
        object = new dv1_0;
        ((dv1_0)object)(null);
        return object;
    }
}

