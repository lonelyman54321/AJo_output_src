/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from rn1
 */
public final class rn1_2 {
    public static final Class a(yn1_2 object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((ClassBasedDeclarationContainer)object).getJClass();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return object;
    }

    public static final Class b(yn1_2 clazz) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(clazz, string2);
        clazz = ((ClassBasedDeclarationContainer)((Object)clazz)).getJClass();
        boolean bl2 = clazz.isPrimitive();
        String string3 = "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>";
        if (!bl2) {
            Intrinsics.checkNotNull(clazz, string3);
            return clazz;
        }
        string2 = clazz.getName();
        int n3 = string2.hashCode();
        switch (n3) {
            default: {
                break;
            }
            case 109413500: {
                String string4 = "short";
                bl2 = string2.equals(string4);
                if (!bl2) break;
                clazz = Short.class;
                break;
            }
            case 97526364: {
                String string5 = "float";
                bl2 = string2.equals(string5);
                if (!bl2) break;
                clazz = Float.class;
                break;
            }
            case 64711720: {
                String string6 = "boolean";
                bl2 = string2.equals(string6);
                if (!bl2) break;
                clazz = Boolean.class;
                break;
            }
            case 3625364: {
                String string7 = "void";
                bl2 = string2.equals(string7);
                if (!bl2) break;
                clazz = Void.class;
                break;
            }
            case 3327612: {
                String string8 = "long";
                bl2 = string2.equals(string8);
                if (!bl2) break;
                clazz = Long.class;
                break;
            }
            case 3052374: {
                String string9 = "char";
                bl2 = string2.equals(string9);
                if (!bl2) break;
                clazz = Character.class;
                break;
            }
            case 3039496: {
                String string10 = "byte";
                bl2 = string2.equals(string10);
                if (!bl2) break;
                clazz = Byte.class;
                break;
            }
            case 104431: {
                String string11 = "int";
                bl2 = string2.equals(string11);
                if (!bl2) break;
                clazz = Integer.class;
                break;
            }
            case -1325958191: {
                String string12 = "double";
                bl2 = string2.equals(string12);
                if (!bl2) break;
                clazz = Double.class;
            }
        }
        Intrinsics.checkNotNull(clazz, string3);
        return clazz;
    }

    public static final yn1_2 c(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "<this>");
        return Reflection.getOrCreateKotlinClass(clazz);
    }
}

