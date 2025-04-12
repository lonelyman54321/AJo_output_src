/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Locale;

/*
 * Renamed from wi3
 */
public final class wi3_1
implements jc1_0 {
    public final byte[] a;
    public final String b;
    public final yi3 c;
    public final Jc1$a d;
    public final xi3_0 e;

    public wi3_1(String object, yi3 yi32, String string2) {
        object = Em3.d((String)object);
        this((byte[])object, yi32, string2);
    }

    public wi3_1(byte[] object, yi3 yi32, String object2) {
        if (object != null) {
            int n3 = ((byte[])object).length;
            if (n3 != 0) {
                if (yi32 != null) {
                    this.a = object;
                    this.b = object2;
                    this.c = yi32;
                    int n4 = 0;
                    yi32 = null;
                    int n7 = object[0];
                    n3 = 5;
                    if ((n7 = (int)(Em3.h(n7, n3) ? 1 : 0)) != 0) {
                        object2 = xi3_0.CONSTRUCTED;
                        this.e = object2;
                    } else {
                        object2 = xi3_0.PRIMITIVE;
                        this.e = object2;
                    }
                    int n8 = object[0] >>> 6;
                    n4 = 3;
                    n8 = (byte)(n8 & n4);
                    n7 = 1;
                    if (n8 != n7) {
                        n7 = 2;
                        if (n8 != n7) {
                            if (n8 != n4) {
                                object = (Object)Jc1$a.UNIVERSAL;
                                this.d = (Jc1$a)((Object)object);
                            } else {
                                object = (Object)Jc1$a.PRIVATE;
                                this.d = (Jc1$a)((Object)object);
                            }
                        } else {
                            object = (Object)Jc1$a.CONTEXT_SPECIFIC;
                            this.d = (Jc1$a)((Object)object);
                        }
                    } else {
                        object = (Object)Jc1$a.APPLICATION;
                        this.d = (Jc1$a)((Object)object);
                    }
                    return;
                }
                object = new IllegalArgumentException;
                super("Param tagValueType cannot be null");
                throw object;
            }
            object = new IllegalArgumentException;
            super("Param id cannot be empty");
            throw object;
        }
        object = new IllegalArgumentException;
        super("Param id cannot be null");
        throw object;
    }

    public final byte[] a() {
        return this.a;
    }

    public final boolean b() {
        boolean bl2;
        xi3_0 xi3_02 = this.e;
        xi3_0 xi3_03 = xi3_0.CONSTRUCTED;
        if (xi3_02 == xi3_03) {
            bl2 = true;
        } else {
            bl2 = false;
            xi3_02 = null;
        }
        return bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof jc1_0;
        if (!bl2) {
            return false;
        }
        byte[] byArray = this.a;
        int n3 = byArray.length;
        byte[] byArray2 = (object = (jc1_0)object).a();
        int n4 = byArray2.length;
        if (n3 != n4) {
            return false;
        }
        object = object.a();
        return Arrays.equals(byArray, (byte[])object);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 177;
    }

    public final String toString() {
        Object object;
        int n3 = 1;
        Locale locale = null;
        StringBuilder stringBuilder = new StringBuilder("Tag[");
        StringBuffer stringBuffer = new StringBuffer();
        byte[] byArray = this.a;
        if (byArray == null) {
            object = "";
            stringBuffer.append((String)object);
        } else {
            int n4 = byArray.length;
            for (int i3 = 0; i3 < n4; i3 += n3) {
                int n7 = byArray[i3] & 0xFF;
                Object object2 = n7;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object2;
                object2 = String.format("%02x ", objectArray);
                stringBuffer.append((String)object2);
            }
        }
        object = stringBuffer.toString();
        locale = Locale.getDefault();
        object = object.toUpperCase(locale).trim();
        stringBuilder.append((String)object);
        stringBuilder.append("] Name=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", TagType=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", ValueType=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", Class=");
        object = this.d;
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

