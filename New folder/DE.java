/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.util.Size
 *  android.util.SizeF
 */
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class DE {
    public static final Bundle a() {
        Bundle bundle = new Bundle(0);
        return bundle;
    }

    public static final Bundle b(Pair ... object) {
        int n3 = ((Object)object).length;
        Object object2 = new Bundle(n3);
        n3 = ((Object)object).length;
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5;
            short s7;
            Object object3 = object[i3];
            String string2 = (String)object3.a;
            object3 = object3.b;
            if (object3 == null) {
                s7 = 0;
                f5 = 0.0f;
                object3 = null;
                object2.putString(string2, null);
                continue;
            }
            boolean bl2 = object3 instanceof Boolean;
            if (bl2) {
                object3 = (Boolean)object3;
                s7 = object3.booleanValue();
                object2.putBoolean(string2, s7 != 0);
                continue;
            }
            bl2 = object3 instanceof Byte;
            if (bl2) {
                object3 = (Number)object3;
                s7 = object3.byteValue();
                object2.putByte(string2, (byte)s7);
                continue;
            }
            bl2 = object3 instanceof Character;
            if (bl2) {
                object3 = (Character)object3;
                s7 = object3.charValue();
                object2.putChar(string2, (char)s7);
                continue;
            }
            bl2 = object3 instanceof Double;
            if (bl2) {
                object3 = (Number)object3;
                double d2 = object3.doubleValue();
                object2.putDouble(string2, d2);
                continue;
            }
            bl2 = object3 instanceof Float;
            if (bl2) {
                object3 = (Number)object3;
                f5 = object3.floatValue();
                object2.putFloat(string2, f5);
                continue;
            }
            bl2 = object3 instanceof Integer;
            if (bl2) {
                object3 = (Number)object3;
                s7 = object3.intValue();
                object2.putInt(string2, (int)s7);
                continue;
            }
            bl2 = object3 instanceof Long;
            if (bl2) {
                object3 = (Number)object3;
                long l2 = object3.longValue();
                object2.putLong(string2, l2);
                continue;
            }
            bl2 = object3 instanceof Short;
            if (bl2) {
                object3 = (Number)object3;
                s7 = object3.shortValue();
                object2.putShort(string2, s7);
                continue;
            }
            bl2 = object3 instanceof Bundle;
            if (bl2) {
                object3 = (Bundle)object3;
                object2.putBundle(string2, (Bundle)object3);
                continue;
            }
            bl2 = object3 instanceof CharSequence;
            if (bl2) {
                object3 = (CharSequence)object3;
                object2.putCharSequence(string2, (CharSequence)object3);
                continue;
            }
            bl2 = object3 instanceof Parcelable;
            if (bl2) {
                object3 = (Parcelable)object3;
                object2.putParcelable(string2, (Parcelable)object3);
                continue;
            }
            bl2 = object3 instanceof boolean[];
            if (bl2) {
                object3 = (boolean[])object3;
                object2.putBooleanArray(string2, (boolean[])object3);
                continue;
            }
            bl2 = object3 instanceof byte[];
            if (bl2) {
                object3 = (byte[])object3;
                object2.putByteArray(string2, (byte[])object3);
                continue;
            }
            bl2 = object3 instanceof char[];
            if (bl2) {
                object3 = (char[])object3;
                object2.putCharArray(string2, (char[])object3);
                continue;
            }
            bl2 = object3 instanceof double[];
            if (bl2) {
                object3 = (double[])object3;
                object2.putDoubleArray(string2, (double[])object3);
                continue;
            }
            bl2 = object3 instanceof float[];
            if (bl2) {
                object3 = (float[])object3;
                object2.putFloatArray(string2, (float[])object3);
                continue;
            }
            bl2 = object3 instanceof int[];
            if (bl2) {
                object3 = (int[])object3;
                object2.putIntArray(string2, (int[])object3);
                continue;
            }
            bl2 = object3 instanceof long[];
            if (bl2) {
                object3 = (long[])object3;
                object2.putLongArray(string2, (long[])object3);
                continue;
            }
            bl2 = object3 instanceof short[];
            if (bl2) {
                object3 = (short[])object3;
                object2.putShortArray(string2, (short[])object3);
                continue;
            }
            bl2 = object3 instanceof Object[];
            char c2 = '\"';
            String string3 = " for key \"";
            if (bl2) {
                Object object4 = object3.getClass().getComponentType();
                Intrinsics.checkNotNull(object4);
                Class clazz = Parcelable.class;
                boolean bl3 = clazz.isAssignableFrom((Class<?>)object4);
                if (bl3) {
                    object4 = "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>";
                    Intrinsics.checkNotNull(object3, (String)object4);
                    object3 = (String[])object3;
                    object2.putParcelableArray(string2, (Parcelable[])object3);
                    continue;
                }
                clazz = String.class;
                bl3 = clazz.isAssignableFrom((Class<?>)object4);
                if (bl3) {
                    object4 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>";
                    Intrinsics.checkNotNull(object3, (String)object4);
                    object3 = (String[])object3;
                    object2.putStringArray(string2, (String[])object3);
                    continue;
                }
                clazz = CharSequence.class;
                bl3 = clazz.isAssignableFrom((Class<?>)object4);
                if (bl3) {
                    object4 = "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>";
                    Intrinsics.checkNotNull(object3, (String)object4);
                    object3 = object3;
                    object2.putCharSequenceArray(string2, object3);
                    continue;
                }
                clazz = Serializable.class;
                bl3 = clazz.isAssignableFrom((Class<?>)object4);
                if (bl3) {
                    object3 = (Serializable)object3;
                    object2.putSerializable(string2, (Serializable)object3);
                    continue;
                }
                object = ((Class)object4).getCanonicalName();
                StringBuilder stringBuilder = new StringBuilder("Illegal value array type ");
                stringBuilder.append((String)object);
                stringBuilder.append(string3);
                stringBuilder.append(string2);
                stringBuilder.append(c2);
                object = stringBuilder.toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            bl2 = object3 instanceof Serializable;
            if (bl2) {
                object3 = (Serializable)object3;
                object2.putSerializable(string2, (Serializable)object3);
                continue;
            }
            bl2 = object3 instanceof IBinder;
            if (bl2) {
                object3 = (IBinder)object3;
                object2.putBinder(string2, (IBinder)object3);
                continue;
            }
            bl2 = object3 instanceof Size;
            if (bl2) {
                object3 = (Size)object3;
                object2.putSize(string2, (Size)object3);
                continue;
            }
            bl2 = object3 instanceof SizeF;
            if (bl2) {
                object3 = (String[])object3;
                object2.putSizeF(string2, (SizeF)object3);
                continue;
            }
            object = object3.getClass().getCanonicalName();
            StringBuilder stringBuilder = new StringBuilder("Illegal value type ");
            stringBuilder.append((String)object);
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            stringBuilder.append(c2);
            object = stringBuilder.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        return object2;
    }
}

