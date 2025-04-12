/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/*
 * Renamed from S0
 */
public abstract class s0_0
extends is1_1
implements zl1_2 {
    public final ml1_2 c;
    public final String d;
    public final sl1_2 e;

    public s0_0(ml1_2 object, JsonElement jsonElement, String string2) {
        this.c = object;
        this.d = string2;
        this.e = object = ((ml1_2)object).a;
    }

    public boolean A() {
        return this.W() instanceof JsonNull ^ true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean F(Object object) {
        JsonElement jsonElement;
        CharSequence charSequence;
        block9: {
            String string2;
            Object object2;
            object = (String)object;
            Intrinsics.checkNotNullParameter(object, "tag");
            charSequence = "boolean";
            jsonElement = this.V((String)object);
            boolean bl2 = jsonElement instanceof JsonPrimitive;
            if (!bl2) {
                charSequence = new StringBuilder("Expected ");
                String string3 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(", but had ");
                string3 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(" as the serialized body of boolean at element: ");
                object = this.Y((String)object);
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                throw HT2.d(jsonElement.toString(), -1, (String)object);
            }
            jsonElement = (JsonPrimitive)jsonElement;
            bl2 = false;
            Object var5_5 = null;
            try {
                object2 = bm1_1.a;
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(jsonElement, (String)object2);
                string2 = ((JsonPrimitive)jsonElement).a();
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            Intrinsics.checkNotNullParameter(string2, (String)object2);
            object2 = "true";
            boolean bl3 = true;
            boolean bl4 = kotlin.text.b.i(string2, (String)object2, bl3);
            if (bl4) {
                object2 = Boolean.TRUE;
            } else {
                object2 = "false";
                bl4 = kotlin.text.b.i(string2, (String)object2, bl3);
                if (bl4) {
                    object2 = Boolean.FALSE;
                } else {
                    bl4 = false;
                    object2 = null;
                }
            }
            if (object2 == null) break block9;
            return (Boolean)object2;
        }
        this.Z((JsonPrimitive)jsonElement, (String)charSequence, (String)object);
        throw null;
        this.Z((JsonPrimitive)jsonElement, (String)charSequence, (String)object);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte G(Object object) {
        Number number;
        long l2;
        long l3;
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        CharSequence charSequence = "byte";
        JsonElement jsonElement = this.V((String)object);
        boolean bl2 = jsonElement instanceof JsonPrimitive;
        if (!bl2) {
            charSequence = new StringBuilder("Expected ");
            String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(", but had ");
            string2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(" as the serialized body of byte at element: ");
            object = this.Y((String)object);
            ((StringBuilder)charSequence).append((String)object);
            object = ((StringBuilder)charSequence).toString();
            throw HT2.d(jsonElement.toString(), -1, (String)object);
        }
        jsonElement = (JsonPrimitive)jsonElement;
        bl2 = false;
        Object var5_5 = null;
        try {
            l3 = bm1_1.e((JsonPrimitive)jsonElement);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        long l4 = -128;
        long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
        if (l7 <= 0 && (l7 = (l2 = l3 - (l4 = (long)127)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
            int n3 = (int)l3;
            byte by2 = (byte)n3;
            number = by2;
        } else {
            boolean bl3 = false;
            number = null;
        }
        if (number != null) {
            return number.byteValue();
        }
        this.Z((JsonPrimitive)jsonElement, (String)charSequence, (String)object);
        throw null;
        this.Z((JsonPrimitive)jsonElement, (String)charSequence, (String)object);
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final char H(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        JsonElement jsonElement = this.V((String)object);
        boolean bl2 = jsonElement instanceof JsonPrimitive;
        if (!bl2) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
            stringBuilder.append(string2);
            stringBuilder.append(", but had ");
            string2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
            stringBuilder.append(string2);
            stringBuilder.append(" as the serialized body of char at element: ");
            object = this.Y((String)object);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            throw HT2.d(jsonElement.toString(), -1, (String)object);
        }
        jsonElement = (JsonPrimitive)jsonElement;
        try {
            Object object2 = ((JsonPrimitive)jsonElement).a();
            String string3 = "<this>";
            Intrinsics.checkNotNullParameter(object2, string3);
            int n3 = ((String)object2).length();
            if (n3 == 0) {
                string3 = "Char sequence is empty.";
                object2 = new NoSuchElementException(string3);
                throw object2;
            }
            int n4 = 1;
            if (n3 == n4) {
                return ((String)object2).charAt(0);
            }
            string3 = "Char sequence has more than one element.";
            object2 = new IllegalArgumentException(string3);
            throw object2;
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        this.Z((JsonPrimitive)jsonElement, "char", (String)object);
        throw null;
    }

    public final double I(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object2 = this.V((String)object);
        boolean bl2 = object2 instanceof JsonPrimitive;
        int n3 = -1;
        if (bl2) {
            Object object3;
            object2 = (JsonPrimitive)object2;
            try {
                object3 = bm1_1.a;
                object3 = "<this>";
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.Z((JsonPrimitive)object2, "double", (String)object);
                throw null;
            }
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = ((JsonPrimitive)object2).a();
            double d2 = Double.parseDouble((String)object3);
            sl1_2 sl1_22 = this.c.a;
            boolean bl3 = sl1_22.k;
            if (!bl3 && ((bl3 = Double.isInfinite(d2)) || (bl3 = Double.isNaN(d2)))) {
                object2 = d2;
                object3 = this.W().toString();
                Intrinsics.checkNotNullParameter(object2, "value");
                Intrinsics.checkNotNullParameter(object, "key");
                Intrinsics.checkNotNullParameter(object3, "output");
                object = HT2.h((Number)object2, (String)object, (String)object3);
                throw HT2.c(n3, (String)object);
            }
            return d2;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append(", but had ");
        string2 = Reflection.getOrCreateKotlinClass(object2.getClass()).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append(" as the serialized body of double at element: ");
        object = this.Y((String)object);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        throw HT2.d(object2.toString(), n3, (String)object);
    }

    public final int J(Object object, SerialDescriptor object2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Intrinsics.checkNotNullParameter(object2, "enumDescriptor");
        Object object3 = this.V((String)object);
        String string2 = object2.h();
        boolean bl2 = object3 instanceof JsonPrimitive;
        if (bl2) {
            object = ((JsonPrimitive)object3).a();
            object3 = this.c;
            return xm1_2.c((SerialDescriptor)object2, (ml1_2)object3, (String)object, "");
        }
        object2 = new StringBuilder("Expected ");
        String string3 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append(", but had ");
        string3 = Reflection.getOrCreateKotlinClass(object3.getClass()).getSimpleName();
        ((StringBuilder)object2).append(string3);
        ((StringBuilder)object2).append(" as the serialized body of ");
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(" at element: ");
        object = this.Y((String)object);
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        throw HT2.d(object3.toString(), -1, (String)object);
    }

    public final float K(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object2 = this.V((String)object);
        boolean bl2 = object2 instanceof JsonPrimitive;
        int n3 = -1;
        if (bl2) {
            Object object3;
            object2 = (JsonPrimitive)object2;
            try {
                object3 = bm1_1.a;
                object3 = "<this>";
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.Z((JsonPrimitive)object2, "float", (String)object);
                throw null;
            }
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = ((JsonPrimitive)object2).a();
            float f5 = Float.parseFloat((String)object3);
            object3 = this.c.a;
            bl2 = ((sl1_2)object3).k;
            if (!bl2 && ((bl2 = Float.isInfinite(f5)) || (bl2 = Float.isNaN(f5)))) {
                object2 = Float.valueOf(f5);
                object3 = this.W().toString();
                Intrinsics.checkNotNullParameter(object2, "value");
                Intrinsics.checkNotNullParameter(object, "key");
                Intrinsics.checkNotNullParameter(object3, "output");
                object = HT2.h((Number)object2, (String)object, (String)object3);
                throw HT2.c(n3, (String)object);
            }
            return f5;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append(", but had ");
        string2 = Reflection.getOrCreateKotlinClass(object2.getClass()).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append(" as the serialized body of float at element: ");
        object = this.Y((String)object);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        throw HT2.d(object2.toString(), n3, (String)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Decoder L(Object object, SerialDescriptor object2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object3 = "inlineDescriptor";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = ee3_1.a((SerialDescriptor)object2);
        if (bl2) {
            object3 = this.V((String)object);
            object2 = object2.h();
            bl2 = object3 instanceof JsonPrimitive;
            if (bl2) {
                object = ((JsonPrimitive)object3).a();
                object2 = this.c;
                object = ke3_1.a((ml1_2)object2, (String)object);
                return new am1_2((q0_0)object, (ml1_2)object2);
            }
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
            stringBuilder.append(string2);
            stringBuilder.append(", but had ");
            string2 = Reflection.getOrCreateKotlinClass(object3.getClass()).getSimpleName();
            stringBuilder.append(string2);
            stringBuilder.append(" as the serialized body of ");
            stringBuilder.append((String)object2);
            stringBuilder.append(" at element: ");
            object = this.Y((String)object);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            throw HT2.d(object3.toString(), -1, (String)object);
        }
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = this.a;
        ((ArrayList)object2).add(object);
        return this;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int M(Object object) {
        JsonElement jsonElement;
        CharSequence charSequence;
        block7: {
            object = (String)object;
            Intrinsics.checkNotNullParameter(object, "tag");
            charSequence = "int";
            jsonElement = this.V((String)object);
            boolean bl2 = jsonElement instanceof JsonPrimitive;
            if (!bl2) {
                charSequence = new StringBuilder("Expected ");
                String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(", but had ");
                string2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(" as the serialized body of int at element: ");
                object = this.Y((String)object);
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                throw HT2.d(jsonElement.toString(), -1, (String)object);
            }
            jsonElement = (JsonPrimitive)jsonElement;
            bl2 = false;
            Object var5_5 = null;
            try {
                Number number;
                long l2;
                long l3 = bm1_1.e((JsonPrimitive)jsonElement);
                long l4 = 0x80000000L;
                long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                if (l7 <= 0 && (l7 = (l2 = l3 - (l4 = Integer.MAX_VALUE)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
                    int n3 = (int)l3;
                    number = n3;
                } else {
                    number = null;
                }
                if (number != null) {
                    return number.intValue();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                break block7;
            }
            {
                this.Z((JsonPrimitive)jsonElement, (String)charSequence, (String)object);
                throw null;
            }
        }
        this.Z((JsonPrimitive)jsonElement, (String)charSequence, (String)object);
        throw null;
    }

    public final long N(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        JsonElement jsonElement = this.V((String)object);
        boolean bl2 = jsonElement instanceof JsonPrimitive;
        if (bl2) {
            jsonElement = (JsonPrimitive)jsonElement;
            try {
                return bm1_1.e((JsonPrimitive)jsonElement);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.Z((JsonPrimitive)jsonElement, "long", (String)object);
                throw null;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append(", but had ");
        string2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append(" as the serialized body of long at element: ");
        object = this.Y((String)object);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        throw HT2.d(jsonElement.toString(), -1, (String)object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final short O(Object object) {
        JsonElement jsonElement;
        CharSequence charSequence;
        block7: {
            object = (String)object;
            Intrinsics.checkNotNullParameter(object, "tag");
            charSequence = "short";
            jsonElement = this.V((String)object);
            boolean bl2 = jsonElement instanceof JsonPrimitive;
            if (!bl2) {
                charSequence = new StringBuilder("Expected ");
                String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(", but had ");
                string2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(" as the serialized body of short at element: ");
                object = this.Y((String)object);
                ((StringBuilder)charSequence).append((String)object);
                object = ((StringBuilder)charSequence).toString();
                throw HT2.d(jsonElement.toString(), -1, (String)object);
            }
            jsonElement = (JsonPrimitive)jsonElement;
            bl2 = false;
            Object var5_5 = null;
            try {
                Number number;
                long l2;
                long l3 = bm1_1.e((JsonPrimitive)jsonElement);
                long l4 = -32768L;
                long l7 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                if (l7 <= 0 && (l7 = (l2 = l3 - (l4 = 32767L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
                    int n3 = (int)l3;
                    short s7 = (short)n3;
                    number = s7;
                } else {
                    boolean bl3 = false;
                    number = null;
                }
                if (number != null) {
                    return number.shortValue();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                break block7;
            }
            {
                this.Z((JsonPrimitive)jsonElement, (String)charSequence, (String)object);
                throw null;
            }
        }
        this.Z((JsonPrimitive)jsonElement, (String)charSequence, (String)object);
        throw null;
    }

    public final String P(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object2 = this.V((String)object);
        boolean bl2 = object2 instanceof JsonPrimitive;
        int n3 = -1;
        if (bl2) {
            bl2 = (object2 = (JsonPrimitive)object2) instanceof tm1_1;
            if (bl2) {
                object2 = (tm1_1)object2;
                bl2 = ((tm1_1)object2).a;
                if (!bl2) {
                    sl1_2 sl1_22 = this.c.a;
                    bl2 = sl1_22.c;
                    if (!bl2) {
                        object2 = Gn.a("String literal for key '", (String)object, "' should be quoted at element: ");
                        object = this.Y((String)object);
                        ((StringBuilder)object2).append((String)object);
                        ((StringBuilder)object2).append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
                        object = ((StringBuilder)object2).toString();
                        throw HT2.d(this.W().toString(), n3, (String)object);
                    }
                }
                return ((tm1_1)object2).c;
            }
            object2 = Gn.a("Expected string value for a non-null key '", (String)object, "', got null literal instead at element: ");
            object = this.Y((String)object);
            ((StringBuilder)object2).append((String)object);
            object = ((StringBuilder)object2).toString();
            throw HT2.d(this.W().toString(), n3, (String)object);
        }
        StringBuilder stringBuilder = new StringBuilder("Expected ");
        String string2 = Reflection.getOrCreateKotlinClass(JsonPrimitive.class).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append(", but had ");
        string2 = Reflection.getOrCreateKotlinClass(object2.getClass()).getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append(" as the serialized body of string at element: ");
        object = this.Y((String)object);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        throw HT2.d(object2.toString(), n3, (String)object);
    }

    public abstract JsonElement V(String var1);

    public final JsonElement W() {
        Object object = (String)CollectionsKt.T(this.a);
        if (object == null || (object = this.V((String)object)) == null) {
            object = this.X();
        }
        return object;
    }

    public abstract JsonElement X();

    public final String Y(String string2) {
        Intrinsics.checkNotNullParameter(string2, "currentTag");
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = this.U();
        stringBuilder.append(string3);
        stringBuilder.append('.');
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Z(JsonPrimitive object, String string2, String string3) {
        CharSequence charSequence = null;
        String string4 = "i";
        boolean bl2 = kotlin.text.b.s(string2, string4, false);
        charSequence = bl2 ? "an " : "a ";
        string2 = ((String)charSequence).concat(string2);
        charSequence = new StringBuilder("Failed to parse literal '");
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append("' as ");
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(" value at element: ");
        object = this.Y(string3);
        ((StringBuilder)charSequence).append((String)object);
        object = ((StringBuilder)charSequence).toString();
        throw HT2.d(this.W().toString(), -1, (String)object);
    }

    public final i0_0 a() {
        return this.c.b;
    }

    public final JsonElement b() {
        return this.W();
    }

    public s30_0 c(SerialDescriptor object) {
        int n3;
        String string2;
        String string3;
        String string4;
        String string5;
        Class<JsonArray> clazz;
        Object object2;
        Object object3;
        JsonElement jsonElement;
        block10: {
            block7: {
                ml1_2 ml1_22;
                boolean bl2;
                block2: {
                    block9: {
                        block3: {
                            block8: {
                                block4: {
                                    block5: {
                                        block6: {
                                            XZ2$b xZ2$b;
                                            boolean bl3;
                                            Intrinsics.checkNotNullParameter(object, "descriptor");
                                            jsonElement = this.W();
                                            object3 = object.getKind();
                                            object2 = Ye3$b.a;
                                            bl2 = Intrinsics.areEqual(object3, object2);
                                            clazz = JsonArray.class;
                                            string5 = " at element: ";
                                            string4 = " as the serialized body of ";
                                            string3 = ", but had ";
                                            string2 = "Expected ";
                                            n3 = -1;
                                            ml1_22 = this.c;
                                            if (bl2 || (bl2 = object3 instanceof nw2_2)) break block2;
                                            object2 = Ye3$c.a;
                                            boolean bl4 = Intrinsics.areEqual(object3, object2);
                                            object2 = JsonObject.class;
                                            if (!bl4) break block3;
                                            bl4 = false;
                                            object3 = object.g(0);
                                            Object object4 = ml1_22.b;
                                            boolean bl5 = (object4 = (object3 = qj3_2.a((SerialDescriptor)object3, (i0_0)object4)).getKind()) instanceof wz2_2;
                                            if (bl5 || (bl3 = Intrinsics.areEqual(object4, xZ2$b = XZ2$b.a))) break block4;
                                            object2 = ml1_22.a;
                                            bl2 = ((sl1_2)object2).d;
                                            if (!bl2) break block5;
                                            object = object.h();
                                            bl2 = jsonElement instanceof JsonArray;
                                            if (!bl2) break block6;
                                            jsonElement = (JsonArray)jsonElement;
                                            object3 = new om1_1(ml1_22, (JsonArray)jsonElement);
                                            break block7;
                                        }
                                        object3 = new StringBuilder(string2);
                                        object2 = Reflection.getOrCreateKotlinClass(clazz).getSimpleName();
                                        ((StringBuilder)object3).append((String)object2);
                                        ((StringBuilder)object3).append(string3);
                                        object2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
                                        ((StringBuilder)object3).append((String)object2);
                                        ((StringBuilder)object3).append(string4);
                                        ((StringBuilder)object3).append((String)object);
                                        ((StringBuilder)object3).append(string5);
                                        object = this.U();
                                        ((StringBuilder)object3).append((String)object);
                                        object = ((StringBuilder)object3).toString();
                                        throw HT2.d(jsonElement.toString(), n3, (String)object);
                                    }
                                    throw HT2.b((SerialDescriptor)object3);
                                }
                                object = object.h();
                                boolean bl6 = jsonElement instanceof JsonObject;
                                if (!bl6) break block8;
                                jsonElement = (JsonObject)jsonElement;
                                object3 = new qm1_2(ml1_22, (JsonObject)jsonElement);
                                break block7;
                            }
                            object3 = new StringBuilder(string2);
                            object2 = Reflection.getOrCreateKotlinClass((Class)object2).getSimpleName();
                            ((StringBuilder)object3).append((String)object2);
                            ((StringBuilder)object3).append(string3);
                            object2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
                            ((StringBuilder)object3).append((String)object2);
                            ((StringBuilder)object3).append(string4);
                            ((StringBuilder)object3).append((String)object);
                            ((StringBuilder)object3).append(string5);
                            object = this.U();
                            ((StringBuilder)object3).append((String)object);
                            object = ((StringBuilder)object3).toString();
                            throw HT2.d(jsonElement.toString(), n3, (String)object);
                        }
                        object = object.h();
                        boolean bl7 = jsonElement instanceof JsonObject;
                        if (!bl7) break block9;
                        jsonElement = (JsonObject)jsonElement;
                        int n4 = 8;
                        object2 = this.d;
                        object3 = new mm1_1(ml1_22, (JsonObject)jsonElement, (String)object2, n4);
                        break block7;
                    }
                    object3 = new StringBuilder(string2);
                    object2 = Reflection.getOrCreateKotlinClass((Class)object2).getSimpleName();
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(string3);
                    object2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
                    ((StringBuilder)object3).append((String)object2);
                    ((StringBuilder)object3).append(string4);
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append(string5);
                    object = this.U();
                    ((StringBuilder)object3).append((String)object);
                    object = ((StringBuilder)object3).toString();
                    throw HT2.d(jsonElement.toString(), n3, (String)object);
                }
                object = object.h();
                bl2 = jsonElement instanceof JsonArray;
                if (!bl2) break block10;
                jsonElement = (JsonArray)jsonElement;
                object3 = new om1_1(ml1_22, (JsonArray)jsonElement);
            }
            return object3;
        }
        object3 = new StringBuilder(string2);
        object2 = Reflection.getOrCreateKotlinClass(clazz).getSimpleName();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(string3);
        object2 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
        ((StringBuilder)object3).append((String)object2);
        ((StringBuilder)object3).append(string4);
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append(string5);
        object = this.U();
        ((StringBuilder)object3).append((String)object);
        object = ((StringBuilder)object3).toString();
        throw HT2.d(jsonElement.toString(), n3, (String)object);
    }

    public void d(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
    }

    public final Object e(qp0_2 object) {
        block11: {
            block9: {
                int n3;
                JsonElement jsonElement;
                Object object2;
                Object object3;
                block10: {
                    object3 = "deserializer";
                    Intrinsics.checkNotNullParameter(object, (String)object3);
                    boolean bl2 = object instanceof l1_0;
                    if (!bl2) break block9;
                    object3 = this.c;
                    object2 = ((ml1_2)object3).a;
                    boolean bl3 = ((sl1_2)object2).i;
                    if (bl3) break block9;
                    object2 = object;
                    object2 = (l1_0)object;
                    Object object4 = object2.getDescriptor();
                    object4 = ow2_2.b((ml1_2)object3, (SerialDescriptor)object4);
                    jsonElement = this.W();
                    object2 = object2.getDescriptor().h();
                    boolean bl4 = jsonElement instanceof JsonObject;
                    n3 = -1;
                    if (!bl4) break block10;
                    jsonElement = (JsonObject)jsonElement;
                    object2 = (JsonElement)((JsonObject)jsonElement).get(object4);
                    bl4 = false;
                    String string2 = null;
                    if (object2 != null) {
                        Object object5;
                        Object object6 = bm1_1.a;
                        object6 = "<this>";
                        Intrinsics.checkNotNullParameter(object2, (String)object6);
                        boolean bl5 = object2 instanceof JsonPrimitive;
                        if (bl5) {
                            object5 = object2;
                            object5 = (JsonPrimitive)object2;
                        } else {
                            bl5 = false;
                            object5 = null;
                        }
                        if (object5 != null) {
                            Intrinsics.checkNotNullParameter(object5, (String)object6);
                            bl3 = object5 instanceof JsonNull;
                            if (!bl3) {
                                string2 = ((JsonPrimitive)object5).a();
                            }
                        } else {
                            bm1_1.c("JsonPrimitive", (JsonElement)object2);
                            throw null;
                        }
                    }
                    try {
                        object = (l1_0)object;
                    }
                    catch (SerializationException serializationException) {
                        object = serializationException.getMessage();
                        Intrinsics.checkNotNull(object);
                        throw HT2.d(((JsonObject)jsonElement).toString(), n3, (String)object);
                    }
                    object = pr0_0.c((l1_0)object, this, string2);
                    object2 = "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>";
                    Intrinsics.checkNotNull(object, (String)object2);
                    object = ds3_0.a((ml1_2)object3, (String)object4, (JsonObject)jsonElement, (qp0_2)object);
                    break block11;
                }
                object = new StringBuilder("Expected ");
                object3 = Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName();
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(", but had ");
                object3 = Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(" as the serialized body of ");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" at element: ");
                object3 = this.U();
                ((StringBuilder)object).append((String)object3);
                object = ((StringBuilder)object).toString();
                throw HT2.d(jsonElement.toString(), n3, (String)object);
            }
            object = object.deserialize(this);
        }
        return object;
    }

    public final Decoder n(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Object object2 = CollectionsKt.T(this.a);
        if (object2 != null) {
            object = super.n((SerialDescriptor)object);
        } else {
            JsonElement jsonElement = this.X();
            String string2 = this.d;
            ml1_2 ml1_22 = this.c;
            object2 = new dm1_2(ml1_22, jsonElement, string2);
            object = ((s0_0)object2).n((SerialDescriptor)object);
        }
        return object;
    }
}

